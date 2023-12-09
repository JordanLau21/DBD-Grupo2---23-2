package uni.edu.pe.planillaback.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dao.LogeoDao;
import uni.edu.pe.planillaback.dto.CuentaEmpresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LogeoDaoImplement implements LogeoDao {

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
    public List<CuentaEmpresa> obtenerCuentasEmpresa() {
        List<CuentaEmpresa> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT * FROM Cuenta_empresa;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                CuentaEmpresa registro = new CuentaEmpresa(
                        resultado.getInt("id_cuenta"),
                        resultado.getString("usuario"),
                        resultado.getString("contraseña"),
                        resultado.getString("rol"),
                        resultado.getInt("id_estado_cuenta"),
                        resultado.getInt("id_empresa")
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
    public List<CuentaEmpresa> obtenerCuentasEmpleado() {
        List<CuentaEmpresa> lista = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = "SELECT * FROM Cuenta_empleado;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                CuentaEmpresa registro = new CuentaEmpresa(
                        resultado.getInt("id_cuenta"),
                        resultado.getString("usuario"),
                        resultado.getString("contraseña"),
                        resultado.getString("rol"),
                        resultado.getInt("id_estado_cuenta"),
                        resultado.getInt("id_empleado")
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
