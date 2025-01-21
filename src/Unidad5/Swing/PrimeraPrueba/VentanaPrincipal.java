package Unidad5.Swing.PrimeraPrueba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel nota1, nota2, nota3, nota4, nota5;
    private JLabel promedio, desviacion, mayor, menor;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton calcular, limpiar, imprimir;
    

    public VentanaPrincipal() {
        inicio();

        setTitle("Calculo de Notas");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {

        nota1 = new JLabel("Nota 1");
        nota1.setBounds(10, 10, 100, 30);
        campoNota1 = new JTextField();
        campoNota1.setBounds(120, 10, 100, 30);

        nota2 = new JLabel("Nota 2");
        nota2.setBounds(10, 50, 100, 30);
        campoNota2 = new JTextField();
        campoNota2.setBounds(120, 50, 100, 30);

        nota3 = new JLabel("Nota 3");
        nota3.setBounds(10, 90, 100, 30);
        campoNota3 = new JTextField();
        campoNota3.setBounds(120, 90, 100, 30);

        nota4 = new JLabel("Nota 4");
        nota4.setBounds(10, 130, 100, 30);
        campoNota4 = new JTextField();
        campoNota4.setBounds(120, 130, 100, 30);

        nota5 = new JLabel("Nota 5");
        nota5.setBounds(10, 170, 100, 30);
        campoNota5 = new JTextField();
        campoNota5.setBounds(120, 170, 100, 30);

        calcular = new JButton("Calcular");
        calcular.setBounds(10, 210, 100, 30);
        calcular.addActionListener(this);


        limpiar = new JButton("Limpiar");
        limpiar.setBounds(120, 210, 100, 30);
        limpiar.addActionListener(this);

        imprimir = new JButton("Imprimir");
        imprimir.setBounds(230, 210, 100, 30);
        imprimir.addActionListener(this);

        promedio = new JLabel("Promedio: ");
        promedio.setBounds(10, 250, 100, 30);

        desviacion = new JLabel("Desviacion: ");
        desviacion.setBounds(10, 290, 100, 30);

        mayor = new JLabel("Mayor: ");
        mayor.setBounds(10, 330, 100, 30);

        menor = new JLabel("Menor: ");
        menor.setBounds(10, 370, 100, 30);

        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(imprimir);
        contenedor.add(promedio);
        contenedor.add(desviacion);
        contenedor.add(mayor);
        contenedor.add(menor);


    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if ( evento.getSource() == calcular){
            Notas notas = new Notas();
            notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
            notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
            notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
            notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
            notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());
            notas.calcularPromedio();
            notas.calcularDesviacion();

            promedio.setText("Promedio: " + notas.calcularPromedio());
            desviacion.setText("Desviacion: " + notas.calcularDesviacion());
            mayor.setText("Mayor: " + notas.calcularMayor());
            menor.setText("Menor: " + notas.calcularMenor());
        }

        if (evento.getSource() == limpiar){
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            promedio.setText("Promedio: ");
            desviacion.setText("Desviacion: ");
            mayor.setText("Mayor: ");
            menor.setText("Menor: ");
        }

    }


}
