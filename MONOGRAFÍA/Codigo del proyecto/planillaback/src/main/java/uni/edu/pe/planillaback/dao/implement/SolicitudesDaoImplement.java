package uni.edu.pe.planillaback.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dao.SolicitudesDao;
import uni.edu.pe.planillaback.dto.EmpleadoValuado;
import uni.edu.pe.planillaback.dto.Solicitud;
import uni.edu.pe.planillaback.dto.SolicitudEmpleado;
import uni.edu.pe.planillaback.dto.SolicitudEmpresa;
import uni.edu.pe.planillaback.dto.rest.DetalleSolicitud;
import uni.edu.pe.planillaback.dto.rest.RespuestaSolicitudesEmpleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class SolicitudesDaoImplement implements SolicitudesDao {
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
    public List<SolicitudEmpresa> obtenerSolicitudesEmpresa(int id_empresa) {
        List<SolicitudEmpresa> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT so.id_solicitud, em.nombre, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti,Empresa emp, Estado_solicitud es\n" +
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

    @Override
    public DetalleSolicitud obtenerDetalleSolicitud(int id_solicitud) {
        DetalleSolicitud detalle = new DetalleSolicitud();
        try {
            obtenerConexion();
            String sql = "SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion\n" +
                    "FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es\n" +
                    "WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado\n" +
                    "AND ti.id_tipo_solicitud = so.id_tipo_solicitud AND so.id_solicitud=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_solicitud);
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
    public RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(int id_empleado) {
        RespuestaSolicitudesEmpleado lista = new RespuestaSolicitudesEmpleado();
        try {
            obtenerConexion();
            String sql = "SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion as estado\n" +
                    "FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es\n" +
                    "WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud\n" +
                    "AND id_empleado=?";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_empleado);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                SolicitudEmpleado registro = new SolicitudEmpleado(
                        resultado.getInt("id_solicitud"),
                        resultado.getString("fec_solicitud"),
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
        try {
            obtenerConexion();
            String sql = "INSERT INTO Solicitud(id_tipo_solicitud,descripcion,fecha_solicitud,hora_solicitud" +
                    "monto,id_empleado, id_empresa ) VALUES (?,?, CURRENT_DATE , LOCALTIME , null , ? , ?, )";
            PreparedStatement st = conexion.prepareStatement(sql);

            st.setInt(1, solicitud.getId_tipo_solicitud());
            st.setString(2, solicitud.getDescripcion());
            st.setInt(3, solicitud.getId_empleado());
            st.setInt(4, solicitud.getId_empresa());
            st.executeUpdate();
            st.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return solicitud;
    }
}
