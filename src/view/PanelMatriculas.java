package view;

import model.Matricula;
import model.MatriculaDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PanelMatriculas extends JPanel {

    private JTable tabla;
    private DefaultTableModel modelo;

    public PanelMatriculas(JFrame frame) {
        setLayout(new BorderLayout());
        modelo = new DefaultTableModel(new Object[]{"Estudiante", "Curso", "Nota"}, 0);
        tabla = new JTable(modelo);
        cargarDatos();

        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    private void cargarDatos() {
        List<Matricula> matriculas = new MatriculaDAO().obtenerTodas();
        for (Matricula m : matriculas) {
            modelo.addRow(new Object[]{m.getNombreEstudiante(), m.getNombreCurso(), m.getNota()});
        }
    }
}
