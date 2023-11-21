package uni.edu.pe.planillaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dto.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            String sql = "INSERT INTO Empleado VALUES (?, ?, ?, ?, ?, ?, ?,  ?, ?, ?,  ?, ?, ?,  ?, ?, ?);";
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
}
