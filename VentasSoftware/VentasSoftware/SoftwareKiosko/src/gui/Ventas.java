package gui;

import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Data;
import model.Producto;
import model.TMProductos;
import model.TMVenta;
import model.Venta;

public class Ventas extends javax.swing.JFrame {

    private List<Producto> producto;
    private List<Venta> venta;
    private Data d;
    Producto p = new Producto();
    int IDProducto = 0;
    int valorTotal = 0;
    int valorBoletaFinal = 0;

    public Ventas() {
        try {
            initComponents();
            setLocationRelativeTo(this);
            setBounds(400, 90, 600, 600);
            jDesktopPane1.setBackground(new Color(116, 193, 162));
            // setBackground(new Color(153, 50, 204));
            producto = new ArrayList<>();
            venta = new ArrayList<>();
            d = new Data();
            frameRegistroP.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameRegistroP = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        spinCantidadProducto = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrarRegistroProducto = new javax.swing.JButton();
        frameVerP = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnCerrarVerProducto = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        frameRegistroVenta = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProductoVenta = new javax.swing.JTextField();
        txtValorVenta = new javax.swing.JTextField();
        SpinVenta = new javax.swing.JSpinner();
        btnAddProducto = new javax.swing.JButton();
        txtNumVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiarVenta = new javax.swing.JButton();
        btnCerrarRegistroVenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        btnVerBoleta = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabVentas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabProductos2 = new javax.swing.JTable();
        txtBuscarProductoVenta = new javax.swing.JTextField();
        btnBuscarProductoVenta = new javax.swing.JButton();
        btnVerProductos = new javax.swing.JButton();
        frameBoleta = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabBoleta = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtValorTotalB = new javax.swing.JTextField();
        btnAceptarBoleta = new javax.swing.JButton();
        frameVerVentas = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableVerVentas = new javax.swing.JTable();
        btnCerrarVerVentas = new javax.swing.JButton();
        txtBuscarVerVentas = new javax.swing.JTextField();
        btnBuscarVerVentas = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarFecha = new javax.swing.JButton();
        dateChDesde = new com.toedter.calendar.JDateChooser();
        dateChHasta = new com.toedter.calendar.JDateChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRegistroP = new javax.swing.JMenuItem();
        menuVerP = new javax.swing.JMenuItem();
        menuRegistroVentas = new javax.swing.JMenuItem();
        menuVerVentas = new javax.swing.JMenuItem();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Producto :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Precio : $");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cantidad : ");

        spinCantidadProducto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\limpiar_opt (1).png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCerrarRegistroProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrarRegistroProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\1486564399-close_81512_opt.png")); // NOI18N
        btnCerrarRegistroProducto.setText("Cerrar");
        btnCerrarRegistroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRegistroProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreProducto)
                                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(spinCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnCerrarRegistroProducto)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spinCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrarRegistroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameRegistroPLayout = new javax.swing.GroupLayout(frameRegistroP.getContentPane());
        frameRegistroP.getContentPane().setLayout(frameRegistroPLayout);
        frameRegistroPLayout.setHorizontalGroup(
            frameRegistroPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameRegistroPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        frameRegistroPLayout.setVerticalGroup(
            frameRegistroPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameRegistroPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ver Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tablaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btnCerrarVerProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\1486564399-close_81512_opt.png")); // NOI18N
        btnCerrarVerProducto.setText("Cerrar");
        btnCerrarVerProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVerProductoActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\magnifying-glass-1083378_960_720_opt.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarVerProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnCerrarVerProducto)
                .addContainerGap())
        );

        javax.swing.GroupLayout frameVerPLayout = new javax.swing.GroupLayout(frameVerP.getContentPane());
        frameVerP.getContentPane().setLayout(frameVerPLayout);
        frameVerPLayout.setHorizontalGroup(
            frameVerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVerPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameVerPLayout.setVerticalGroup(
            frameVerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVerPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frameRegistroVenta.addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                frameRegistroVentaWindowStateChanged(evt);
            }
        });
        frameRegistroVenta.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                frameRegistroVentaWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Producto :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Cantidad :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("SubTotal: ");

        txtProductoVenta.setEditable(false);

        txtValorVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValorVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorVentaActionPerformed(evt);
            }
        });

        SpinVenta.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        btnAddProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\cart-1956097_960_720_opt.png")); // NOI18N
        btnAddProducto.setText("Añadir Productos");
        btnAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Numero de Venta :");

        btnLimpiarVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpiarVenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\limpiar_opt (1).png")); // NOI18N
        btnLimpiarVenta.setText("Limpiar");
        btnLimpiarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVentaActionPerformed(evt);
            }
        });

        btnCerrarRegistroVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrarRegistroVenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\1486564399-close_81512_opt.png")); // NOI18N
        btnCerrarRegistroVenta.setText("Cerrar");
        btnCerrarRegistroVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRegistroVentaActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha :");

        btnVerBoleta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVerBoleta.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\boleta5x13_opt.jpg")); // NOI18N
        btnVerBoleta.setText("Ver boleta");
        btnVerBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerBoletaActionPerformed(evt);
            }
        });

        tabVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabVentas);

        tabProductos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabProductos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabProductos2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabProductos2);

        btnBuscarProductoVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscarProductoVenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\magnifying-glass-1083378_960_720_opt.png")); // NOI18N
        btnBuscarProductoVenta.setText("Buscar");
        btnBuscarProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoVentaActionPerformed(evt);
            }
        });

        btnVerProductos.setText("Ver Productos");
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SpinVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(txtProductoVenta)
                                    .addComponent(txtNumVenta)
                                    .addComponent(txtFechaVenta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerProductos))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnLimpiarVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtBuscarProductoVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarProductoVenta))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnCerrarRegistroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtBuscarProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBuscarProductoVenta)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnVerProductos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(SpinVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarRegistroVenta)))
        );

        javax.swing.GroupLayout frameRegistroVentaLayout = new javax.swing.GroupLayout(frameRegistroVenta.getContentPane());
        frameRegistroVenta.getContentPane().setLayout(frameRegistroVentaLayout);
        frameRegistroVentaLayout.setHorizontalGroup(
            frameRegistroVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameRegistroVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameRegistroVentaLayout.setVerticalGroup(
            frameRegistroVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameRegistroVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Boleta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabBoleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabBoleta);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Valor Total : ");

        txtValorTotalB.setEditable(false);
        txtValorTotalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalBActionPerformed(evt);
            }
        });

        btnAceptarBoleta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAceptarBoleta.setText("Aceptar");
        btnAceptarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarBoletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAceptarBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorTotalB, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValorTotalB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout frameBoletaLayout = new javax.swing.GroupLayout(frameBoleta.getContentPane());
        frameBoleta.getContentPane().setLayout(frameBoletaLayout);
        frameBoletaLayout.setHorizontalGroup(
            frameBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameBoletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        frameBoletaLayout.setVerticalGroup(
            frameBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameBoletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ver Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tableVerVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tableVerVentas);

        btnCerrarVerVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\1486564399-close_81512_opt.png")); // NOI18N
        btnCerrarVerVentas.setText("Cerrar");
        btnCerrarVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVerVentasActionPerformed(evt);
            }
        });

        btnBuscarVerVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\pabli\\Desktop\\magnifying-glass-1083378_960_720_opt.png")); // NOI18N
        btnBuscarVerVentas.setText("Buscar");
        btnBuscarVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVerVentasActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Desde: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Hasta:");

        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtBuscarVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarVerVentas))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateChDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateChHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnCerrarVerVentas)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtBuscarVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChDesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout frameVerVentasLayout = new javax.swing.GroupLayout(frameVerVentas.getContentPane());
        frameVerVentas.getContentPane().setLayout(frameVerVentasLayout);
        frameVerVentasLayout.setHorizontalGroup(
            frameVerVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVerVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameVerVentasLayout.setVerticalGroup(
            frameVerVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVerVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));

        jDesktopPane1.setForeground(new java.awt.Color(116, 193, 162));
        jDesktopPane1.setToolTipText("");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Nombre Kiosko");

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Pablo Perez");

        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jMenu1.setText("Menú");

        menuRegistroP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuRegistroP.setText("Registro Productos");
        menuRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistroPActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistroP);

        menuVerP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuVerP.setText("Ver productos");
        menuVerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerPActionPerformed(evt);
            }
        });
        jMenu1.add(menuVerP);

        menuRegistroVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuRegistroVentas.setText("Registrar Ventas");
        menuRegistroVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistroVentasActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistroVentas);

        menuVerVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuVerVentas.setText("Ver Ventas");
        menuVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerVentasActionPerformed(evt);
            }
        });
        jMenu1.add(menuVerVentas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Producto p = new Producto();
        try {
            if (txtNombreProducto.getText().isEmpty()) {
                String titulo1 = "Error";
                String mensaje1 = "Ingrese nombre del producto";
                int tipo1 = JOptionPane.ERROR_MESSAGE;
                JOptionPane.showMessageDialog(this, mensaje1, titulo1, tipo1);
            } else {
                p.setNombre(txtNombreProducto.getText());

            }
            try {
                p.setValor(Integer.parseInt(txtPrecioProducto.getText()));
            } catch (Exception e) {
                String titulo1 = "Error";
                String mensaje1 = "Ingrese solo numeros";
                int tipo1 = JOptionPane.ERROR_MESSAGE;
                JOptionPane.showMessageDialog(this, mensaje1, titulo1, tipo1);
                txtPrecioProducto.setText(null);
            }
            p.setCantidad(Integer.parseInt(spinCantidadProducto.getValue().toString()));

            d.agregarProductos(p);
            limpiarForm();
            txtNombreProducto.requestFocus();
            mostrarTabla();

        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtValorVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorVentaActionPerformed
    }//GEN-LAST:event_txtValorVentaActionPerformed

    private void btnAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductoActionPerformed
        try {
            Venta v = new Venta();
            v.setNumVenta(Integer.parseInt(txtNumVenta.getText()));
            //v.setFecha(txtFechaVenta.getText());
            v.setPkProducto(IDProducto);
            v.setCantidad(Integer.parseInt(SpinVenta.getValue().toString()));
            v.setValor(Integer.parseInt(txtValorVenta.getText()));
            d.registrarVenta(v);
            mostrarTablaParaVentaProductos();
            mostrarVentas();

            int valorCantProductos = Integer.parseInt(txtValorVenta.getText()) * Integer.parseInt(spinCantidadProducto.getValue().toString());
            valorTotal = valorCantProductos + valorTotal;
            txtValorVenta.setText(String.valueOf(valorTotal));
            valorBoletaFinal *= valorTotal;
            System.out.println(valorBoletaFinal);
            txtValorTotalB.setText("" + valorBoletaFinal);
            System.out.println(valorTotal);

        } catch (Exception e) {
            String titulo1 = "Error";
            String mensaje1 = "Ingrese los datos en forma correcta";
            int tipo1 = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(this, mensaje1, titulo1, tipo1);
            limpiarVenta();
        }


    }//GEN-LAST:event_btnAddProductoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
        spinCantidadProducto.setValue(0);
        txtNombreProducto.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVentaActionPerformed
        limpiarVenta();
        //metodo para el limpiar que habia aqui
    }//GEN-LAST:event_btnLimpiarVentaActionPerformed

    private void menuRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistroPActionPerformed
        frameRegistroP.setVisible(true);
        frameRegistroP.setLocationRelativeTo(this);
        frameRegistroP.setBounds(550, 200, 400, 400);
        // jFrame1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        // jFrame2.setVisible(true);    
    }//GEN-LAST:event_menuRegistroPActionPerformed

    private void menuVerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerPActionPerformed
        mostrarTabla();
        frameVerP.setLocationRelativeTo(this);
        frameVerP.setBounds(400, 100, 600, 530);
        // jFrame1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        frameVerP.setVisible(true);
    }//GEN-LAST:event_menuVerPActionPerformed

    private void menuRegistroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistroVentasActionPerformed
        frameRegistroVenta.setVisible(true);
        frameRegistroVenta.setLocationRelativeTo(this);
        frameRegistroVenta.setBounds(350, 80, 800, 650);
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaVenta.setText(dateFormat.format(date));
        txtFechaVenta.setEditable(false);
    }//GEN-LAST:event_menuRegistroVentasActionPerformed

    private void btnCerrarRegistroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroProductoActionPerformed
        frameRegistroP.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroProductoActionPerformed

    private void btnCerrarVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVerProductoActionPerformed
        frameVerP.setVisible(false);
    }//GEN-LAST:event_btnCerrarVerProductoActionPerformed

    private void btnCerrarRegistroVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroVentaActionPerformed
        frameRegistroVenta.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroVentaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String text = txtBuscar.getText();
            List<Producto> list = d.buscarProducto(text);
            TMProductos model = new TMProductos(list);
            tablaProductos.setModel(model);
        } catch (SQLException ex) {
            //mensaje joption
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frameRegistroVenta.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAceptarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarBoletaActionPerformed
        try {
            Venta v = new Venta();
            v.setNumVenta(Integer.parseInt(txtNumVenta.getText()));
            //v.setFecha(txtFechaVenta.getText());
            v.setPkProducto(IDProducto);
            v.setCantidad(Integer.parseInt(SpinVenta.getValue().toString()));
            v.setValor(Integer.parseInt(txtValorVenta.getText()));
            d.registrarVenta(v);

            frameBoleta.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAceptarBoletaActionPerformed

    private void btnVerBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerBoletaActionPerformed
        frameBoleta.setVisible(true);
        frameBoleta.setLocationRelativeTo(this);
        frameBoleta.setBounds(400, 100, 610, 550);
        mostrarVentasBoleta();
        txtValorTotalB.setText("" + valorBoletaFinal);
    }//GEN-LAST:event_btnVerBoletaActionPerformed

    private void btnCerrarVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVerVentasActionPerformed
        frameVerVentas.setVisible(false);
    }//GEN-LAST:event_btnCerrarVerVentasActionPerformed

    private void menuVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerVentasActionPerformed
        frameVerVentas.setVisible(true);
        frameVerVentas.setLocationRelativeTo(this);
        frameVerVentas.setBounds(400, 100, 410, 450);

        try {
            List<Venta> venta = d.ListarVenta();
            TMVenta tabla = new TMVenta(venta);
            tableVerVentas.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menuVerVentasActionPerformed

    private void tabProductos2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductos2MouseReleased
        if (evt.getClickCount() == 1) {//evento para el click
            int subtotal = 0;
            int acu;
            System.out.println("Un clic");
            int row = tabProductos2.getSelectedRow();
//            System.out.println(row);

            TMProductos produc = (TMProductos) tabProductos2.getModel();
            Producto v = produc.getProductos(row);

            int valor = v.getValor();
            String canti = SpinVenta.getValue().toString();
            int cantidad = Integer.parseInt(canti);
            subtotal = valor * cantidad;
            txtValorVenta.setText("" + subtotal);

            

            IDProducto = v.getId();
            try {
                d.rescatarNombreProducto(IDProducto);
                txtProductoVenta.setText(d.rescatarNombreProducto(IDProducto).toString());
                System.out.println("jkas: " + d.rescatarNombreProducto(IDProducto).toString());
            } catch (SQLException ex) {
                Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_tabProductos2MouseReleased

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
        mostrarTablaParaVentaProductos();
    }//GEN-LAST:event_btnVerProductosActionPerformed

    private void btnBuscarProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoVentaActionPerformed
        try {
            String text = txtBuscarProductoVenta.getText();
            List<Producto> list = d.buscarProducto(text);
            TMProductos model = new TMProductos(list);
            tabProductos2.setModel(model);

        } catch (SQLException ex) {
            //mensaje joption
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarProductoVentaActionPerformed

    private void frameRegistroVentaWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frameRegistroVentaWindowStateChanged
        if (frameRegistroVenta.isVisible()) {
            try {
                txtNumVenta.setText(String.valueOf(d.getUltimaVenta()) + 1);
            } catch (SQLException ex) {
                Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_frameRegistroVentaWindowStateChanged

    private void txtValorTotalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalBActionPerformed

    private void frameRegistroVentaWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frameRegistroVentaWindowActivated
        if (frameRegistroVenta.isVisible()) {
            try {
                int idV = d.getUltimaVenta() + 1;
                System.out.println(idV);
                txtNumVenta.setText(String.valueOf(idV));
                txtNumVenta.setEditable(false);
            } catch (Exception ex) {
                Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_frameRegistroVentaWindowActivated

    private void btnBuscarVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVerVentasActionPerformed
        try {
            List<Venta> ventas = d.ListarVentaPor(Integer.parseInt(txtBuscarVerVentas.getText()));
            TMVenta tm = new TMVenta(ventas);
            tableVerVentas.setModel(tm);

        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarVerVentasActionPerformed

    private void btnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechaActionPerformed
        try {
            List<Venta> ventas = d.BuscarVentaFecha(d.transformarFecha(dateChDesde.getDate()),d.transformarFecha(dateChHasta.getDate()));
            TMVenta tm = new TMVenta(ventas);
            tableVerVentas.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarFechaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinVenta;
    private javax.swing.JButton btnAceptarBoleta;
    private javax.swing.JButton btnAddProducto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarFecha;
    private javax.swing.JButton btnBuscarProductoVenta;
    private javax.swing.JButton btnBuscarVerVentas;
    private javax.swing.JButton btnCerrarRegistroProducto;
    private javax.swing.JButton btnCerrarRegistroVenta;
    private javax.swing.JButton btnCerrarVerProducto;
    private javax.swing.JButton btnCerrarVerVentas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarVenta;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerBoleta;
    private javax.swing.JButton btnVerProductos;
    private com.toedter.calendar.JDateChooser dateChDesde;
    private com.toedter.calendar.JDateChooser dateChHasta;
    private javax.swing.JFrame frameBoleta;
    private javax.swing.JFrame frameRegistroP;
    private javax.swing.JFrame frameRegistroVenta;
    private javax.swing.JFrame frameVerP;
    private javax.swing.JFrame frameVerVentas;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JMenuItem menuRegistroP;
    private javax.swing.JMenuItem menuRegistroVentas;
    private javax.swing.JMenuItem menuVerP;
    private javax.swing.JMenuItem menuVerVentas;
    private javax.swing.JSpinner spinCantidadProducto;
    private javax.swing.JTable tabBoleta;
    private javax.swing.JTable tabProductos2;
    private javax.swing.JTable tabVentas;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tableVerVentas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarProductoVenta;
    private javax.swing.JTextField txtBuscarVerVentas;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNumVenta;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtProductoVenta;
    private javax.swing.JTextField txtValorTotalB;
    private javax.swing.JTextField txtValorVenta;
    // End of variables declaration//GEN-END:variables

    private void limpiarForm() {
        txtNombreProducto.setText(null);
        txtPrecioProducto.setText(null);
        spinCantidadProducto.setValue(0);
    }

    private void mostrarTabla() {
        try {
            List<Producto> productoss = d.ListarProductos();
            TMProductos tabla = new TMProductos(productoss);
            tablaProductos.setModel(tabla);//nombre de la tabla    }

        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void mostrarTablaParaVentaProductos() {
        try {
            List<Producto> productoss = d.ListarProductos();
            TMProductos tabla = new TMProductos(productoss);
            tabProductos2.setModel(tabla);//nombre de la tabla    }

        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void mostrarVentas() {

        try {
            List<Venta> ventas = d.ListarVentaPor(Integer.parseInt(txtNumVenta.getText()));
            TMVenta tm = new TMVenta(ventas);
            tabVentas.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void mostrarVentasBoleta() {

        try {
            List<Venta> ventas = d.ListarVentaPor(Integer.parseInt(txtNumVenta.getText()));
            TMVenta tm = new TMVenta(ventas);
            tabBoleta.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void limpiarVenta() {

        txtProductoVenta.setText("");
        SpinVenta.setValue(0);
        txtValorVenta.setText("");
        txtNumVenta.requestFocus();

        try {
            List<Venta> ventas = d.ListarVentaPor(0);
            TMVenta tm = new TMVenta(ventas);
            tabVentas.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
