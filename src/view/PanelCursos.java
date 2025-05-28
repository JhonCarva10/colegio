package view;

import model.Curso;
import model.CursoDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PanelCursos extends JPanel {

    private JTable tabla;
    private DefaultTableModel modelo;

    public PanelCursos(JFrame frame) {
        setLayout(new BorderLayout());
        modelo = new DefaultTableModel(new Object[]{"ID", "Nombre", "Docente"}, 0);
        tabla = new JTable(modelo);
        cargarDatos();

        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    private void cargarDatos() {
        List<Curso> cursos = new CursoDAO().obtenerTodos();
        for (Curso c : cursos) {
            modelo.addRow(new Object[]{c.getId(), c.getNombre(), c.getNombreDocente()});
        }
    }
}
