package uni.edu.pe.planillaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dto.*;
import uni.edu.pe.planillaback.dto.rest.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

@Repository
public class PlanillaDaoImplement implements PlanillaDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Connection conexion;

    private void obtenerConexion() {
        try {
            conexion = jdbcTemplate.getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cerrarConexion() {
        try {
            conexion.close();
            conexion = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Empleado registrarEmpleado(Empleado empleado) {
        try {
            obtenerConexion();
            String sql = "INSERT INTO Empleado VALUES (?, ?, ?, ?, ?, ?, ?,  ?, ?, ?,  ?,?, ?,  ?, ?, ?)";
            PreparedStatement st = conexion.prepareStatement(sql);

            st.setInt(1, empleado.getId_empleado());
            st.setString(2, empleado.getNombres());
            st.setString(3, empleado.getApellidos());
            st.setString(4, empleado.getFecha_nacimiento());
            st.setInt(5, empleado.getEdad());
            st.setLong(6, empleado.getTelefono());
            st.setString(7, empleado.getEmail());
            st.setString(8, empleado.getDireccion());
            st.setLong(9, empleado.getDni());
            st.setString(10, empleado.getEstado_civil());
            st.setString(11, empleado.getSexo());
            st.setInt(12, empleado.getId_regimen_pensionario());
            st.setInt(13, empleado.getId_seguro_medico());
            st.setInt(14, empleado.getId_situacion_discapacidad());
            st.setInt(15, empleado.getId_empresa());
            st.setInt(16, empleado.getId_cuenta());
            st.executeUpdate();
            st.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    @Override
    public List<CuentaEmpresa> obtenerCuentasEmpresa() {
        List<CuentaEmpresa> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT * FROM Cuenta;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                CuentaEmpresa registro = new CuentaEmpresa(
                        resultado.getInt("id_cuenta"),
                        resultado.getString("usuario"),
                        resultado.getString("contraseña"),
                        resultado.getString("rol"),
                        resultado.getInt("id_estado_cuenta")
                );
                lista.add(registro);

            }
            resultado.close();
            st.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }


    @Override
    public DetalleSolicitud obtenerDetalleSolicitud(SolicitudEmpresa solicitudEmpresa) {
        DetalleSolicitud detalle = new DetalleSolicitud();
        try {
            obtenerConexion();
            String sql = "SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion\n" +
                    "FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es\n" +
                    "WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado\n" +
                    "AND ti.id_tipo_solicitud = so.id_tipo_solicitud AND so.id_solicitud=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,solicitudEmpresa.getId_solicitud());
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                DetalleSolicitud registro = new DetalleSolicitud(
                        resultado.getInt("id_solicitud"),
                        resultado.getString("nombres"),
                        resultado.getString("apellidos"),
                        resultado.getLong("dni"),
                        resultado.getDate("fec_solicitud"),
                        resultado.getTime("hora_solicitud"),
                        resultado.getString("descripcion"),
                        resultado.getString("tipo_solicitud"),
                        resultado.getString("detalles")
                );
                detalle=registro;
            }

            resultado.close();
            st.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detalle;
    }

    @Override
    public RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(Empleado empleado) {
        RespuestaSolicitudesEmpleado lista = new RespuestaSolicitudesEmpleado();
        try {
            obtenerConexion();
            String sql = "SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion\n" +
                    "FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es\n" +
                    "WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud\n" +
                    "AND id_empleado=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,empleado.getId_empleado());
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                SolicitudEmpleado registro = new SolicitudEmpleado(
                        resultado.getInt("id_solicitud"),
                        resultado.getDate("fec_solicitud"),
                        resultado.getString("descripcion"),
                        resultado.getString("estado")
                );
                lista.getSolicitudes().add(registro);
            }
            resultado.close();
            st.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Solicitud registrarSolicitud(Solicitud solicitud) {
        return null;
    }

    @Override
    public RespuestaContratos obtenerContratos(String fecha_inicio,String fecha_fin) {
        RespuestaContratos lista = new RespuestaContratos();
        try {
            obtenerConexion();
            String sql = "SELECT co.id_contrato, em.dni,em.nombre,em.apellidos,car.nombre_cargo,co.fecha_inicio_laboral,co.fecha_termino_contrato\n" +
                    "FROM Contrato co,Empleado em,Cargo car WHERE car.id_cargo=co.id_cargo AND em.id_empleado=co.id_empleado\n" +
                    "AND co.fecha_inicio_laboral>? AND co.fecha_termino_contrato<?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1,fecha_inicio);
            st.setString(2,fecha_fin);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                Contrato registro = new Contrato(
                        resultado.getInt("id_contrato"),
                        resultado.getLong("dni"),
                        resultado.getString("nombre"),
                        resultado.getString("apellidos"),
                        resultado.getString("nombre_cargo"),
                        resultado.getString("fecha_inicio_laboral"),
                        resultado.getString("fecha_termino_contrato")
                );
                lista.getContratos().add(registro);
            }
            resultado.close();
            st.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    @Override
    public List<EmpleadoValuado> obtenerEmpleadosDesvinculados(int id_empresa) {
        List<EmpleadoValuado> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta \n" +
                    "ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=1 AND Empleado.id_empresa=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_empresa);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                EmpleadoValuado registro = new EmpleadoValuado(
                        resultado.getInt("id_empleado"),
                        resultado.getLong("dni"),
                        resultado.getString("nombre"),
                        resultado.getString("apellidos"),
                        resultado.getLong("telefono"),
                        resultado.getString("email")
                );
                lista.add(registro);
            }
            resultado.close();
            st.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    @Override
    public List<EmpleadoValuado> obtenerEmpleadosVigentes(int id_empresa) {
        List<EmpleadoValuado> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta \n" +
                    "ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=1 AND Empleado.id_empresa=?";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_empresa);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                EmpleadoValuado registro = new EmpleadoValuado(
                        resultado.getInt("id_empleado"),
                        resultado.getLong("dni"),
                        resultado.getString("nombre"),
                        resultado.getString("apellidos"),
                        resultado.getLong("telefono"),
                        resultado.getString("email")
                );
                lista.add(registro);
            }
            resultado.close();
            st.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public List<SolicitudEmpresa> obtenerSolicitudesEmpresa(int id_empresa) {
        List<SolicitudEmpresa> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT so.id_solicitud, em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti,Empresa emp, Estado_solicitud es\n" +
                    "WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado AND emp.id_empresa=em.id_empresa\n" +
                    "AND ti.id_tipo_solicitud = so.id_tipo_solicitud AND emp.id_empresa=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_empresa);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                SolicitudEmpresa registro = new SolicitudEmpresa(
                        resultado.getInt("id_solicitud"),
                        resultado.getString("nombres"),
                        resultado.getString("apellidos"),
                        resultado.getDate("fec_solicitud"),
                        resultado.getString("descripcion")
                );
                lista.add(registro);
            }
            resultado.close();
            st.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }


}
