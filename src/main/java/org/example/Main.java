package org.example;

import data.GestorIdentidades;
import model.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private static final GestorIdentidades gestor = new GestorIdentidades();
    private JTextArea areaT = crearTextArea();
    private final JTextArea areaV = crearTextArea();
    private final JTextArea areaEx = crearTextArea();

    public Main(){
        super("Trabajo 3");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(950,600);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Trabajadores", crearPanelTrabajadores());
        tabs.addTab("Vehiculos", crearPanelVehiculos());
        tabs.addTab("Externos", crearPanelExternos());
        setContentPane(tabs);

    }

    private JTextArea crearTextArea(){
        JTextArea area = new JTextArea();
        area.setEditable(false);
        return area;
    } //JTextArea para mostrar los datos
    private JPanel crearPanelTrabajadores(){
        JTextField nombre = new JTextField();
        JTextField id = new JTextField();
        JTextField FechaNacimiento = new JTextField();
        JTextField FechaIngreso = new JTextField();
        JTextField Cargo = new JTextField();
        JTextField Sueldo = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0,2,5,5));
        panel.setBorder(BorderFactory.createTitledBorder("Datos del trabajador"));
        panel.add(new JLabel("Nombre:")); panel.add(nombre);
        panel.add(new JLabel("ID:")); panel.add(id);
        panel.add(new JLabel("Fecha de nacimiento:")); panel.add(FechaNacimiento);
        panel.add(new JLabel("Fecha de ingreso:")); panel.add(FechaIngreso);
        panel.add(new JLabel("Cargo:")); panel.add(Cargo);
        panel.add(new JLabel("Sueldo:"));panel.add(Sueldo);
        add(panel);     JButton boton = new JButton("Guardar");

        JPanel cuadroTxt = new JPanel(new BorderLayout());
        cuadroTxt.add(panel,BorderLayout.NORTH);
        cuadroTxt.add(areaT, BorderLayout.CENTER);
        cuadroTxt.add(boton, BorderLayout.SOUTH);

        boton.addActionListener(e -> {
            Persona a = new Persona(nombre.getText(),id.getText(),FechaNacimiento.getText(),FechaIngreso.getText(),Cargo.getText(),Integer.parseInt(Sueldo.getText()));
            gestor.RegistrarPersona(a);
            areaT.setText("                                                                                          " +
                    ".......:::::::Trabajadores:::::::.......\n\n");
            areaT.append(gestor.LeerRecursoPersona());
        });

        return cuadroTxt;

    } //Crea panel con los datos del trabajador
    private JPanel crearPanelVehiculos(){
        JTextField nombre = new JTextField();
        JTextField id = new JTextField();
        JTextField tipo = new JTextField();
        JTextField marca = new JTextField();
        JTextField patente = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0,2,5,5));
        panel.setBorder(BorderFactory.createTitledBorder("Datos del vehiculo"));
        panel.add(new JLabel("Nombre:")); panel.add(nombre);
        panel.add(new JLabel("ID:")); panel.add(id);
        panel.add(new JLabel("Tipo:")); panel.add(tipo);
        panel.add(new JLabel("Marca:")); panel.add(marca);
        panel.add(new JLabel("Patente:")); panel.add(patente);
        add(panel);

        JPanel cuadroTxt = new JPanel(new BorderLayout()); //Cuadro donde se mostrara el texto
        cuadroTxt.add(panel,BorderLayout.NORTH);

        JButton boton = new JButton("Guardar");
        cuadroTxt.add(boton, BorderLayout.SOUTH);
        cuadroTxt.add(areaV, BorderLayout.CENTER);
        boton.addActionListener(e -> {
            Vehiculo a = new Vehiculo(nombre.getText(),id.getText(),tipo.getText(),marca.getText(),patente.getText());
            gestor.RegistrarVehiculo(a);
            areaV.setText(gestor.LeerRecursoVehiculo());
        });
        return cuadroTxt;
    } //Crea panel con los datos del vehiculo
    private JPanel crearPanelExternos(){
        JTextField nombre = new JTextField();
        JTextField id = new JTextField();
        JTextField area = new JTextField();
        JTextField departamento = new JTextField();
        JTextField meses = new JTextField();
        JTextField sueldo = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0,2,5,5));
        panel.setBorder(BorderFactory.createTitledBorder("Datos del Trabajador Externo"));
        panel.add(new JLabel("Nombre:")); panel.add(nombre);
        panel.add(new JLabel("ID:")); panel.add(id);
        panel.add(new JLabel("area:")); panel.add(area);
        panel.add(new JLabel("departamento:")); panel.add(departamento);
        panel.add(new JLabel("meses:")); panel.add(meses);
        panel.add(new JLabel("sueldo:")); panel.add(sueldo);
        add(panel);

        JButton boton = new JButton("Guardar");

        boton.addActionListener(e -> {
            ColaboradorExterno a = new ColaboradorExterno(nombre.getText(),id.getText(),area.getText(),departamento.getText(),Integer.parseInt(meses.getText()),Integer.parseInt(sueldo.getText()));
            gestor.RegistrarColaboradorExterno(a);
            areaEx.setText(gestor.LeerRecursoColaboradorExterno());
        });

        JPanel cuadroTxt = new JPanel(new BorderLayout());
        cuadroTxt.add(panel,BorderLayout.NORTH);
        cuadroTxt.add(areaEx, BorderLayout.CENTER);
        cuadroTxt.add(boton, BorderLayout.SOUTH);

        return cuadroTxt;
    } // Crea Panel con los datos del colaborador externo

    static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
