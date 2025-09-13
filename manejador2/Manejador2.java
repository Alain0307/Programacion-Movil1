/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manejador2;

/**
 * Alain Cesar Raymundo 
 * @author elga0
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Manejador2 extends JFrame implements ActionListener {
    Button b1, b2;
    JButton b3, b4;
    JPanel pc;

    public Manejador2() {
        setTitle("Manejador");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        b1 = new Button("rojo");
        b2 = new Button("azul");
        b3 = new JButton("amarillo");
        b4 = new JButton("blanco");

        pc = new JPanel();
        pc.setBackground(Color.ORANGE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.EAST);
        add(pc, BorderLayout.CENTER);
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
        if (b4.equals(e.getSource())) {
            System.out.println("presionado blanco");
            pc.setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        new Manejador2().setVisible(true);
    }
}
