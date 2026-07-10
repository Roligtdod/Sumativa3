package ui;

import data.GestorIdentidades;
import model.ColaboradorExterno;
import model.Persona;
import model.Recurso;
import model.Vehiculo;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class guii {

protected static ArrayList <Recurso> registrable = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Trabajo 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setBounds(100,100,200,300);
        frame.setLayout(null);

        JButton ingresar = new JButton("Ingresar");
        ingresar.setBounds(45,10,100,50);
        frame.add(ingresar);

        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del recurso");
                String id = JOptionPane.showInputDialog("Ingrese el ID del recurso");
                int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que desea ingresar 1.- Trabajador 2.- Vehiculo 3.- Colaborador externo"));
                switch (opcion){
                    case 1:
                        String fechaN=JOptionPane.showInputDialog("Ingrese fecha de nacimiento del trabajador");
                        String fechaI=JOptionPane.showInputDialog("Ingrese fecha de ingreso del trabajador");
                        String cargo=JOptionPane.showInputDialog("Ingrese cargo del trabajador");
                        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo del trabajador"));
                        JOptionPane.showMessageDialog(null,"Se ha ingresado el trabajador");
                        registrable.add(new Persona(nombre,id,fechaN,fechaI,cargo,sueldo));
                        break;
                    case 2:
                        String marca=JOptionPane.showInputDialog("Ingrese marca del vehiculo");
                        String tipo=JOptionPane.showInputDialog("Ingrese tipo del vehiculo");
                        String patente=JOptionPane.showInputDialog("Ingrese patente del vehiculo");
                        JOptionPane.showMessageDialog(null,"Se ha ingresado el vehiculo");
                        registrable.add(new Vehiculo(nombre,id,tipo,marca,patente));
                        break;
                    case 3:
                        String jefe=JOptionPane.showInputDialog("Ingrese el nombre del jefe del colaborador externo");
                        String departamento=JOptionPane.showInputDialog("Ingrese el departamento del colaborador externo");
                        int meses=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los meses de contrato del colaborador externo"));
                        int sueldoE=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo"));
                        registrable.add(new ColaboradorExterno(nombre,id,jefe,departamento,meses,sueldoE));
                        break;
                    default:
                }
            }
        });


        JButton leer = new JButton("Leer");
        leer.setBounds(45,80,100,50);
        frame.add(leer);
        leer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
            }
        });



        JButton salir = new JButton("Salir");
        salir.setBounds(45,150,100,50);
        frame.add(salir);


    }
}
