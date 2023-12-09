package uni.edu.pe.planillaback.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dao.EmpleadosDao;
import uni.edu.pe.planillaback.dto.Contratoregistrado;
import uni.edu.pe.planillaback.dto.Empleado;
import uni.edu.pe.planillaback.dto.EmpleadoValuado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadosDaoImplement implements EmpleadosDao {
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
            String sql = "INSERT INTO Empleado VALUES (?, ?, ?, ?, ?, ?, ?,  ?, ?, ?,  ?,?, ?,  ?, ?, ?,?)";
            PreparedStatement st = conexion.prepareStatement(sql);

            st.setString(1, empleado.getNombres());
            st.setString(2, empleado.getApellidos());
            st.setString(3, empleado.getFecha_nacimiento());
            st.setInt(4, empleado.getEdad());
            st.setLong(5, empleado.getTelefono());
            st.setString(6, empleado.getEmail());
            st.setString(7, empleado.getDireccion());
            st.setLong(8, empleado.getDni());
            st.setString(9, empleado.getEstado_civil());
            st.setString(10, empleado.getSexo());
            st.setInt(11, empleado.getMenores_cargo());
            st.setInt(12, empleado.getId_regimen_pensionario());
            st.setInt(13, empleado.getId_seguro_medico());
            st.setInt(14, empleado.getId_situacion_discapacidad());
            st.setInt(15, empleado.getId_empresa());
            st.executeUpdate();
            st.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    @Override
    public Contratoregistrado registrarContrato(Contratoregistrado contrato) {
        try {
            obtenerConexion();
            String sql = "INSERT INTO Contrato VALUES (?, ?, ?, ?, ?, ?, ?,  ?, ?, ?,  ?,?, ?)";
            PreparedStatement st = conexion.prepareStatement(sql);

            st.setString(1, contrato.getFecha_firma_contrato());
            st.setString(2, contrato.getFecha_inicio_laboral());
            st.setString(3, contrato.getFecha_termino_contrato());
            st.setFloat(4, contrato.getSueldo_base());
            st.setInt(5, contrato.getLiquido_teorico());
            st.setLong(6, contrato.getId_area());
            st.setInt(7, contrato.getId_cargo());
            st.setInt(8, contrato.getId_estado_contrato());
            st.setInt(9, contrato.getId_tipo_contrato());
            st.setInt(10, contrato.getId_tipo_jornada());
            st.setInt(11, contrato.getId_frecuencia_pago());
            st.setInt(12, contrato.getId_medio_pago());
            st.executeUpdate();
            st.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contrato;
    }

    @Override
    public List<EmpleadoValuado> obtenerEmpleadosVigentes(int id_empresa) {
        List<EmpleadoValuado> lista = new ArrayList<>();
        id_empresa=1;
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
    public List<EmpleadoValuado> obtenerEmpleadosDesvinculados(int id_empresa) {
        List<EmpleadoValuado> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta \n" +
                    "ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=2 AND Empleado.id_empresa=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, id_empresa);
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
}
