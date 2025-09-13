/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manejador;

/**
 * Alain Cesar Raymundo
 * @author elga0
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Manejador extends JFrame implements ActionListener {
    Button b1, b2;
    JButton b3, b4;
    JPanel pc;
    JPanel pd;
    JLabel texto;
    JTextField casillaNombre;
    JButton btnEnviar;

    public Manejador() {
        setTitle("Manejador");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 2));

        b1 = new Button("rojo");
        b2 = new Button("azul");
        b3 = new JButton("amarillo");
        b4 = new JButton("blanco");

        pc = new JPanel();
        pc.setBackground(Color.ORANGE);

        pd = new JPanel();
        texto = new JLabel("Nombre: ");
        casillaNombre = new JTextField(20);
        btnEnviar = new JButton("Enviar Datos");
        btnEnviar.addActionListener(this);

        pd.add(texto);
        pd.add(casillaNombre);
        pd.add(btnEnviar);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(pc);
        add(pd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (b1.equals(e.getSource())) {
            System.out.println("presionado rojo");
            pc.setBackground(Color.RED);
        }
        if (e.getSource().equals(b2)) {
            System.out.println("presionado azul");
            pc.setBackground(Color.BLUE);
        }
        if (b3.equals(e.getSource())) {
            System.out.println("presionado amarillo");
            pc.setBackground(Color.YELLOW);
        }
        if (e.getSource().equals(b4)) {
            System.out.println("presionado blanco");
            pc.setBackground(Color.WHITE);
        }
        if (e.getSource().equals(btnEnviar)) {
            System.out.println("enviando datos");
            JOptionPane.showMessageDialog(null, "hola " + casillaNombre.getText());
        }
    }

    public static void main(String[] args) {
        new Manejador().setVisible(true);
    }
}
