package model;

import ConexionBDMVC.ConexionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDao {

    public List<Estudiante> obtenerTodos(){
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";

        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)){

            while (rs.next()) {
                lista.add(new Estudiante(rs.getInt("cod_estudiante"), rs.getString("nom_estudiante")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
