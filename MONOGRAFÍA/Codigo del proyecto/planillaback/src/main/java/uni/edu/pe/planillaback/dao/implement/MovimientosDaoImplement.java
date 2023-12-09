package uni.edu.pe.planillaback.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dao.MovimientosDao;
import uni.edu.pe.planillaback.dto.Movimiento;
import uni.edu.pe.planillaback.dto.SolicitudEmpleado;
import uni.edu.pe.planillaback.dto.rest.RespuestaContratos;
import uni.edu.pe.planillaback.dto.rest.RespuestaMovimiento;
import uni.edu.pe.planillaback.dto.rest.RespuestaSolicitudesEmpleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class MovimientosDaoImplement implements MovimientosDao {
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
    public RespuestaMovimiento obtenerMovimientosContratoDes(int id_contrato) {
        RespuestaMovimiento lista = new RespuestaMovimiento();
        try {
            obtenerConexion();
            String sql = "SELECT co.nombre_nomina, mo.monto FROM Contrato con,Concepto_nomina co, Movimiento_planilla mo, Tipo_operacion ti \n" +
                    "WHERE con.id_contrato=mo.id_contrato AND co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion \n" +
                    "AND ti.id_tipo_operacion=1 AND con.id_contrato=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_contrato);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                Movimiento registro = new Movimiento(
                        resultado.getInt("id_movimiento_planilla"),
                        resultado.getString("fecha"),
                        resultado.getFloat("monto"),
                        resultado.getInt("id_nomina")
                );
                lista.getMovimientos().add(registro);
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
    public RespuestaMovimiento obtenerMovimientosContratoIng(int id_contrato) {
        RespuestaMovimiento lista = new RespuestaMovimiento();
        try {
            obtenerConexion();
            String sql = "SELECT co.nombre_nomina, mo.monto FROM Contrato con,Concepto_nomina co, Movimiento_planilla mo, Tipo_operacion ti \n" +
                    "WHERE con.id_contrato=mo.id_contrato AND co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion \n" +
                    "AND ti.id_tipo_operacion=2 AND con.id_contrato=?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_contrato);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                Movimiento registro = new Movimiento(
                        resultado.getInt("id_movimiento_planilla"),
                        resultado.getString("fecha"),
                        resultado.getFloat("monto"),
                        resultado.getInt("id_nomina")
                );
                lista.getMovimientos().add(registro);
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
