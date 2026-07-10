package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame{
    private JPanel panel1;
    private JButton ingresarButton;
    private JButton leerButton;
    private JButton Salir;

    public gui() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del recurso");
                String id = JOptionPane.showInputDialog("Ingrese el ID del recurso");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gui");
        frame.setContentPane(new gui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
