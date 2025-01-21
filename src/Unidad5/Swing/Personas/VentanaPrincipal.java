package Unidad5.Swing.Personas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel nombre, apellidos, telefono, direccion;
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;
    private JButton anadir, eliminar, borrarLista, editar;
    private JList<String> listaNombres;
    private DefaultListModel<String> modelo;
    private JScrollPane scrollLista;
    private ListaPersonas listaPersonas;

    public VentanaPrincipal(){
        listaPersonas = new ListaPersonas();
        inicio();

        setTitle("Lista de Personas");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        nombre = new JLabel("Nombre");
        nombre.setBounds(10, 10, 100, 30);
        contenedor.add(nombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(120, 10, 100, 30);
        contenedor.add(campoNombre);

        apellidos = new JLabel("Apellidos");
        apellidos.setBounds(10, 50, 100, 30);
        contenedor.add(apellidos);

        campoApellidos = new JTextField();
        campoApellidos.setBounds(120, 50, 100, 30);
        contenedor.add(campoApellidos);

        telefono = new JLabel("Teléfono");
        telefono.setBounds(10, 90, 100, 30);
        contenedor.add(telefono);

        campoTelefono = new JTextField();
        campoTelefono.setBounds(120, 90, 100, 30);
        contenedor.add(campoTelefono);

        direccion = new JLabel("Dirección");
        direccion.setBounds(10, 130, 100, 30);
        contenedor.add(direccion);

        campoDireccion = new JTextField();
        campoDireccion.setBounds(120, 130, 100, 30);
        contenedor.add(campoDireccion);

        anadir = new JButton("Añadir");
        anadir.setBounds(10, 170, 100, 30);
        anadir.addActionListener(this);
        contenedor.add(anadir);

        eliminar = new JButton("Eliminar");
        eliminar.setBounds(120, 170, 100, 30);
        eliminar.addActionListener(this);
        contenedor.add(eliminar);

        editar = new JButton("Editar");
        editar.setBounds(230, 130, 150, 30);
        editar.addActionListener(this);
        contenedor.add(editar);

        borrarLista = new JButton("Borrar Lista");
        borrarLista.setBounds(230, 170, 150, 30);
        borrarLista.addActionListener(this);
        contenedor.add(borrarLista);

        modelo = new DefaultListModel<>();
        listaNombres = new JList<>(modelo);
        scrollLista = new JScrollPane(listaNombres);
        scrollLista.setBounds(10, 210, 370, 150);
        contenedor.add(scrollLista);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == anadir) {
            String nombre = campoNombre.getText();
            String apellidos = campoApellidos.getText();
            String telefono = campoTelefono.getText();
            String direccion = campoDireccion.getText();
            Persona p = new Persona(nombre, apellidos, telefono, direccion);
            listaPersonas.anadirPersona(p);
            modelo.addElement(p.nombre + " " + p.apellidos + " - " + p.telefono + " - " + p.direccion);
        } else if (e.getSource() == eliminar) {
            int index = listaNombres.getSelectedIndex();
            if (index >= 0) {
                listaPersonas.eliminarPersona(index);
                modelo.remove(index);
            }
        } else if (e.getSource() == borrarLista) {
            listaPersonas.borrarLista();
            modelo.clear();
        } else if (e.getSource() == editar) {
            int index = listaNombres.getSelectedIndex();
            if (index >= 0) {
                String nombre = campoNombre.getText();
                String apellidos = campoApellidos.getText();
                String telefono = campoTelefono.getText();
                String direccion = campoDireccion.getText();
                Persona p = new Persona(nombre, apellidos, telefono, direccion);
                listaPersonas.eliminarPersona(index);
                listaPersonas.anadirPersona(p);
                modelo.set(index, p.nombre + " " + p.apellidos + " - " + p.telefono + " - " + p.direccion);
            }
        }
    }
}
