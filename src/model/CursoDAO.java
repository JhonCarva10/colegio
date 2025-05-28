package model;

import ConexionBDMVC.ConexionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {

    public List<Curso> obtenerTodos() {
        List<Curso> lista = new ArrayList<>();
        String sql = "SELECT c.cod_curso, c.nom_curso, d.nom_docente FROM cursos c JOIN docentes d ON c.cod_docente = d.cod_docente";

        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Curso(
                        rs.getInt("cod_curso"),
                        rs.getString("nom_curso"),
                        rs.getString("nom_docente")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
