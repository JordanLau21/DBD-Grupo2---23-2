package uni.edu.pe.planillaback.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dao.BoletasDao;
import uni.edu.pe.planillaback.dto.*;
import uni.edu.pe.planillaback.dto.rest.RespuestaBoletasPago;
import uni.edu.pe.planillaback.dto.rest.RespuestaColaboradores;
import uni.edu.pe.planillaback.dto.rest.RespuestaPlanillas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class BoletasDaoImplemtn implements BoletasDao {
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
    public RespuestaPlanillas obtenerPlanillas(int id_empresa) {
        RespuestaPlanillas lista = new RespuestaPlanillas();
        try {
            obtenerConexion();
            String sql = "select id_planilla, periodo, fecha_inicio, periodicidad from planilla;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                Planilla registro = new Planilla(
                        resultado.getInt("id_planilla"),
                        resultado.getString("fecha"),
                        resultado.getString("periodo"),
                        resultado.getString("periodicidad")
                );
                lista.getPlanillas().add(registro);
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
    public RespuestaColaboradores obtenerColaboradores(int id_planilla) {
        RespuestaColaboradores lista = new RespuestaColaboradores();
        try {
            obtenerConexion();
            String sql = "SELECT distinct em.id_empleado, em.nombres , em.apellidos, co.fecha_inicio_laboral,\n" +
                    "ca.nombre_cargo FROM Empleado em, contrato co, detalle_pago de, planilla pl, estado_contrato est, cargo ca\n" +
                    "WHERE em.id_empleado =co.id_empleado AND de.id_detalle_pago=co.id_detalle_pago and pl.periodicidad = de.frecuencia_pago\n" +
                    "AND pl.fecha_inicio>co.fecha_inicio_laboral and co.id_cargo=ca.id_cargo and pl.fecha_fin<=co.fecha_termino_contrato\n" +
                    "AND est.estado_contrato='Vigente' and pl.id_planilla = ?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1,id_planilla);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                Colaborador registro = new Colaborador(
                        resultado.getInt("id_empleado"),
                        resultado.getString("nombres"),
                        resultado.getString("apellidos"),
                        resultado.getString("fecha_calculo"),
                        resultado.getString("nombre_cargo")
                );
                lista.getColaboradores().add(registro);
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
    public RespuestaBoletasPago obtenerBoletasPago(int id_planilla) {
        RespuestaBoletasPago lista = new RespuestaBoletasPago();
        try {
            obtenerConexion();
            String sql = "select id_planilla, fecha_calculo, periodo, monto_emitido from planilla\n" +
                    "where fecha_calculo is not null and monto_emitido is not null;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {
                BoletaPago registro = new BoletaPago(
                        resultado.getInt("id_planilla"),
                        resultado.getString("fecha"),
                        resultado.getString("periodo"),
                        resultado.getFloat("monto_emitido")
                );
                lista.getBoletas().add(registro);
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
    public Planillaregistro registrarPlanilla(Planillaregistro planilla) {
        try {
            obtenerConexion();
            String sql = "INSERT INTO Planilla(periodo,periodicidad, dias_laborados, fecha_inicio, fecha_fin, monto_emitido" +
                    ",fecha_creacion, hora_creacion) VALUES (?, ?, ?, ?, ?, 0, CURRENT_DATE, CURRENT_TIMESTAMP)";
            PreparedStatement st = conexion.prepareStatement(sql);

            st.setString(1, planilla.getPeriodo());
            st.setString(2, planilla.getPeriodicidad());
            if(planilla.getPeriodicidad()=="Mensual"){
                st.setInt(3, 30);
            }
            else{
                st.setInt(3, 15);
            }
            st.setString(4, planilla.getFecha_inicio());
            st.setString(5, planilla.getFecha_fin());
            st.executeUpdate();
            st.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return planilla;
    }
}
