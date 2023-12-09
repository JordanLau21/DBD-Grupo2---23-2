package uni.edu.pe.planillaback.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dao.OrganizacionDao;
import uni.edu.pe.planillaback.dto.Area;
import uni.edu.pe.planillaback.dto.Cargo;
import uni.edu.pe.planillaback.dto.CuentaEmpresa;
import uni.edu.pe.planillaback.dto.EmpleadoValuado;
import uni.edu.pe.planillaback.dto.rest.RespuestaAreas;
import uni.edu.pe.planillaback.dto.rest.RespuestaCargos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrganizacionDaoImplement implements OrganizacionDao {
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
    public RespuestaAreas obtenerAreasEmpresa(int id_empresa) {
        RespuestaAreas lista = new RespuestaAreas();
        try {
            obtenerConexion();
            String sql = "SELECT\n" +
                    "    ROW_NUMBER() OVER (ORDER BY c.id_area) AS \"N°\",\n" +
                    "    c.nombre_cargo AS \"Descripción\",\n" +
                    "    c.estado AS \"Estado\",\n" +
                    "    a.nombre_area AS \"Área\"\n" +
                    "FROM\n" +
                    "    Cargo c\n" +
                    "JOIN\n" +
                    "    Empresa e ON c.id_empresa = e.id_empresa\n" +
                    "JOIN\n" +
                    "    Area a ON c.id_empresa = a.id_empresa\n" +
                    "WHERE\n" +
                    "    e.id_empresa = ?;;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            st.setInt(1,id_empresa);
            while (resultado.next()) {
                Area registro = new Area(
                        resultado.getInt("id_area"),
                        resultado.getString("Área"),
                        resultado.getString("Descripcion"),
                        resultado.getString("Estado"),
                        id_empresa

                );
                lista.getAreas().add(registro);

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
    public RespuestaCargos obtenerCargosEmpresa(int id_empresa) {
        RespuestaCargos lista = new RespuestaCargos();
        try {
            obtenerConexion();
            String sql = "SELECT\n" +
                    "    ROW_NUMBER() OVER (ORDER BY c.id_cargo) AS \"N°\",\n" +
                    "    c.nombre_cargo AS \"Descripción\",\n" +
                    "    c.estado AS \"Estado\",\n" +
                    "    a.nombre_area AS \"Área\"\n" +
                    "FROM\n" +
                    "    Cargo c\n" +
                    "JOIN\n" +
                    "    Empresa e ON c.id_empresa = e.id_empresa\n" +
                    "JOIN\n" +
                    "    Area a ON c.id_empresa = a.id_empresa\n" +
                    "WHERE\n" +
                    "    e.id_empresa = 1;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            st.setInt(1,id_empresa);
            while (resultado.next()) {
                Cargo registro = new Cargo(
                        resultado.getInt("id_cargo"),
                        resultado.getString("descripcion"),
                        resultado.getString("descripcion"),
                        resultado.getString("estado"),
                        resultado.getString("estado"),
                        id_empresa
                );
                lista.getCargos().add(registro);

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
    public Area registrarArea(Area area) {
        try {
            obtenerConexion();
            String sql = "INSERT INTO Area ( nombre_area, descripcion_area, id_empresa) VALUES ( ?,?, ?);";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1, area.getNombre());
            st.setString(2, area.getDescripcion());
            st.setFloat(3, area.getId_empresa());
            st.executeUpdate();
            st.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return area;
    }

    @Override
    public Cargo registrarCargo(Cargo cargo) {
        try {
            obtenerConexion();
            String sql = "INSERT INTO Cargo ( nombre_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ( ?,?, ?,'Activo',?);";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1, cargo.getNombre());
            st.setString(2, cargo.getDescripcion());
            st.setString(3, cargo.getRequerimientos());
            st.setInt(4, cargo.getId_empresa());
            st.executeUpdate();
            st.close();
            cerrarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cargo;
    }
}
