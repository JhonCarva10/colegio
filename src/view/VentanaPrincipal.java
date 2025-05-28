package view;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar;
    private JPanel mainPanel;

    public VentanaPrincipal() {

        setTitle("Sistema Escolar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);

        crearMenu();

        setVisible(true);
    }

    private void crearMenu() {
        menuBar = new JMenuBar();

        JMenu menu = new JMenu("Opciones");
        JMenuItem estudiantesItem = new JMenuItem("Estudiantes");
        JMenuItem cursosItem = new JMenuItem("Cursos");
        JMenuItem matriculasItem = new JMenuItem("Matrículas");

        estudiantesItem.addActionListener(e -> mostrarPanel(new PanelEstudiantes(this)));
       cursosItem.addActionListener(e -> mostrarPanel(new PanelCursos(this)));
       matriculasItem.addActionListener(e -> mostrarPanel(new PanelMatriculas(this)));

        menu.add(estudiantesItem);
        menu.add(cursosItem);
        menu.add(matriculasItem);

        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public void mostrarPanel(JPanel panel) {
        setContentPane(panel);
        revalidate();
        repaint();
    }

}
