package Unidad5.Tarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaProductos extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel codigo, nombre, cantidad, precio, descripcion, listadoProductos;
    private JTextField txtCodigo, txtNombre, txtCantidad, txtPrecio, txtDescripcion;
    private JButton btnAgregar, btnEliminar, btnBuscar, btnMostrar, btnSalir;
    private ListaProductos listaProductos;
    private JList<String> lista;
    private DefaultListModel<String> modelo;
    private JScrollPane scrollLista;

    public VentanaProductos() {
        listaProductos = new ListaProductos();
        inicio();

        setTitle("Lista de Productos");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        // Panel izquierdo
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Añadir margen

        codigo = new JLabel("Código");
        panelIzquierdo.add(codigo);
        txtCodigo = new JTextField();
        panelIzquierdo.add(txtCodigo);

        nombre = new JLabel("Nombre");
        panelIzquierdo.add(nombre);
        txtNombre = new JTextField();
        panelIzquierdo.add(txtNombre);

        cantidad = new JLabel("Cantidad");
        panelIzquierdo.add(cantidad);
        txtCantidad = new JTextField();
        panelIzquierdo.add(txtCantidad);

        precio = new JLabel("Precio");
        panelIzquierdo.add(precio);
        txtPrecio = new JTextField();
        panelIzquierdo.add(txtPrecio);

        descripcion = new JLabel("Descripción");
        panelIzquierdo.add(descripcion);
        txtDescripcion = new JTextField();
        panelIzquierdo.add(txtDescripcion);

        // Panel para los botones
        JPanel panelBotonesIzquierdo = new JPanel();
        panelBotonesIzquierdo.setLayout(new BoxLayout(panelBotonesIzquierdo, BoxLayout.Y_AXIS));
        panelBotonesIzquierdo.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // Añadir margen superior

        panelBotonesIzquierdo.add(Box.createVerticalGlue()); // Espacio flexible arriba

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        panelBotonesIzquierdo.add(btnAgregar);
        panelBotonesIzquierdo.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio fijo

        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);
        panelBotonesIzquierdo.add(btnEliminar);
        panelBotonesIzquierdo.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio fijo

        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        panelBotonesIzquierdo.add(btnBuscar);

        panelBotonesIzquierdo.add(Box.createVerticalGlue()); // Espacio flexible abajo

        panelIzquierdo.add(panelBotonesIzquierdo);

        // Panel derecho
        JPanel panelDerecho = new JPanel();
        panelDerecho.setLayout(new BorderLayout());
        panelDerecho.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Añadir margen

        listadoProductos = new JLabel("Listado de productos", SwingConstants.CENTER); // Centrar JLabel
        panelDerecho.add(listadoProductos, BorderLayout.NORTH);

        modelo = new DefaultListModel<>();
        lista = new JList<>(modelo);
        scrollLista = new JScrollPane(lista);
        scrollLista.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Añadir margen
        panelDerecho.add(scrollLista, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(2, 1, 5, 5));

        btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener(this);
        panelBotones.add(btnMostrar);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        panelBotones.add(btnSalir);

        panelDerecho.add(panelBotones, BorderLayout.SOUTH);

        // Split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
        splitPane.setDividerLocation(300);
        contenedor.add(splitPane, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            String codigo = txtCodigo.getText().trim();
            String nombre = txtNombre.getText().trim();
            String cantidadStr = txtCantidad.getText().trim();
            String precioStr = txtPrecio.getText().trim();
            String descripcion = txtDescripcion.getText().trim();

            if (codigo.isEmpty() || nombre.isEmpty() || cantidadStr.isEmpty() || precioStr.isEmpty() || descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int cantidad;
            double precio;
            try {
                cantidad = Integer.parseInt(cantidadStr);
                precio = Double.parseDouble(precioStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Cantidad y precio deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Producto p = new Producto(codigo, nombre, precio, cantidad, descripcion);
            listaProductos.anadirProducto(p);
            txtCodigo.setText("");
            txtNombre.setText("");
            txtCantidad.setText("");
            txtPrecio.setText("");
            txtDescripcion.setText("");
        } else if (e.getSource() == btnEliminar) {
            int index = lista.getSelectedIndex();
            if (index >= 0) {
                listaProductos.eliminarProducto(index);
                modelo.remove(index);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnBuscar) {
            String codigo = txtCodigo.getText().trim();
            if (codigo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un código para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Producto p = listaProductos.buscarProducto(codigo);
            if (p != null) {
                txtNombre.setText(p.getNombre());
                txtCantidad.setText(String.valueOf(p.getCantidad()));
                txtPrecio.setText(String.valueOf(p.getPrecio()));
                txtDescripcion.setText(p.getDescripcion());
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnMostrar) {
            modelo.clear();
            for (Producto p : listaProductos.getListaProductos()) {
                modelo.addElement(p.getCodigo() + " - " + p.getNombre());
            }
        } else if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }
}