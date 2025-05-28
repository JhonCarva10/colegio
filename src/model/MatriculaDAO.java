package model;

import ConexionBDMVC.ConexionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO {

    public List<Matricula> obtenerTodas() {
        List<Matricula> lista = new ArrayList<>();
        String sql = "SELECT e.nom_estudiante, c.nom_curso, m.nota_curso FROM matricula m " +
                "JOIN estudiantes e ON m.cod_estudiante = e.cod_estudiante " +
                "JOIN cursos c ON m.cod_curso = c.cod_curso";

        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Matricula(
                        rs.getString("nom_estudiante"),
                        rs.getString("nom_curso"),
                        rs.getFloat("nota_curso")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
