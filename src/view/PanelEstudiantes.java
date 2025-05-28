package view;

import model.Estudiante;
import model.EstudianteDao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PanelEstudiantes extends JPanel {

    private JTable tabla;
    private DefaultTableModel modelo;

    public PanelEstudiantes(JFrame frame){
        setLayout(new BorderLayout());
        modelo = new DefaultTableModel(new Object[]{"ID", "Nombre"}, 0);
        tabla = new JTable(modelo);
        cargarDatos();

        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    private void cargarDatos(){
       List<Estudiante> estudiantes = new EstudianteDao().obtenerTodos();
        for (Estudiante e : estudiantes) {
            modelo.addRow(new Object[]{e.getId(), e.getNombre()});
       }
    }

}
