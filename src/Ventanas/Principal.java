/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Modelo.Clientes;
import Modelo.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */
public class Principal extends javax.swing.JFrame {
   Conectar cl= new Conectar();
    Statement smt;
    PreparedStatement stmt=null;
   Connection con; 
   //load principa, seteo de ubicacion y llamado a carga de combobox

    /**
     *
     */
   public Principal() {
         initComponents();
        setLocationRelativeTo(null);
        cargarLibro();
        cargarLibro2();
        cargarAcliente();
        cargarCliente();
        cargarTrabajador();
        jButton_editar.setVisible(false);
        jButton_Registrar.setVisible(true);
        btn_Eliminar.setVisible(false);
         btn_EliminarC.setVisible(false);
     
    }  
    //cargar datos de base hacia combobox
   //cargar datos de base hacia combobox Clientes 

    /**
     
     */
    public void  cargarCliente(){
    try {
            cbo_cliente.removeAllItems();
            String sql="SELECT * FROM `cliente`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_cliente.addItem("Seleccionar");
            while(rs.next()) {
                cbo_cliente.addItem(rs.getString("rut"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    }
     public void  cargarECliente(){
    try {
            cbo_ECliente.removeAllItems();
            String sql="SELECT * FROM `cliente`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_ECliente.addItem("Seleccionar");
            while(rs.next()) {
                cbo_ECliente.addItem(rs.getString("rut"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    }
    //cargar datos de base hacia combobox frm Agregar Cliente

    /**
     *
     */
        public void  cargarAcliente(){
    try {
            cbo_arriendoC.removeAllItems();
            String sql="SELECT * FROM `cliente`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_arriendoC.addItem("Seleccionar");
            while(rs.next()) {
                cbo_arriendoC.addItem(rs.getString("rut"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
        }

    /**
     *
     */
    public void  cargarDistribuidor(){
    try {
        cbo_empresa.removeAllItems();
            String sql="SELECT * FROM distribuidor";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_empresa.addItem("Seleccionar");
            while(rs.next()) {
                cbo_empresa.addItem(rs.getString("rut_empresa"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    }

    /**
     *
     */
    public void    cargarVCliente(){
    try {
            cbo_VLCliente.removeAllItems();
            String sql="SELECT * FROM `cliente`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_VLCliente.addItem("Seleccionar");
            while(rs.next()) {
                cbo_VLCliente.addItem(rs.getString("rut"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    
    }//cargar datos de base hacia combobox trabajador

    /**
     *
     */
    public void  cargarTrabajador(){
    try {
            cbo_trabajador.removeAllItems();
            String sql="SELECT * FROM `trabajadores`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql);  
                     cbo_trabajador.addItem("Seleccionar");
            while(rs.next()) {
                cbo_trabajador.addItem(rs.getString("rut_trabajador"));
            }
        } catch (Exception e) {
          //  JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    
    }

    /**
     *
     */
    public void  cargarTrabajador2(){
    try {
            cbo_vtrabajador.removeAllItems();
            String sql="SELECT * FROM `trabajadores`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql);  
                     cbo_vtrabajador.addItem("Seleccionar");
            while(rs.next()) {
                cbo_vtrabajador.addItem(rs.getString("rut_trabajador"));
            }
        } catch (Exception e) {
          //  JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    
    }
   //cargar datos de base hacia combobox libro

    /**
     *
     */
    public void  cargarLibro(){
    try {
       
            cbo_libroA.removeAllItems();
            String sql="SELECT * FROM `libro`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_libroA.addItem("Seleccionar");
            while(rs.next()) {

            cbo_libroA.addItem(rs.getString("numero_serie"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    
    }
    //cargar datos de base hacia combobox libro editar

    /**
     *
     */
    public void  cargarLibro2(){
    try {
       
            cbo_id_libro.removeAllItems();
            String sql="SELECT * FROM `libro`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_id_libro.addItem("Seleccionar..");
            while(rs.next()) {

            cbo_id_libro.addItem(rs.getString("numero_serie"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    
    }

    /**
     *
     */
    public void  cargarLibro3(){
    try {
       
            cbo_ventaLibro.removeAllItems();
            String sql="SELECT * FROM `libro`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_ventaLibro.addItem("Seleccionar..");
            while(rs.next()) {

            cbo_ventaLibro.addItem(rs.getString("numero_serie"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    
    }

    /**
     *
     */
    public void  cargarLibro4(){
    try {
       
            cbo_LibroC.removeAllItems();
            String sql="SELECT * FROM `libro`";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql); 
            cbo_LibroC.addItem("Seleccionar");
            while(rs.next()) {

            cbo_LibroC.addItem(rs.getString("numero_serie"));
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
        
        }
    
    }
    //cargar tabla de libros

    /**
     *
     */
    public void tabla(){
             
           
           DefaultTableModel model= new DefaultTableModel(); 
            model.addColumn("numero_serie");
            model.addColumn("ISBM");
            model.addColumn("Titulo");
            model.addColumn("Numero_paguinas");
            model.addColumn("Precio_ref");
            model.addColumn("Año_publicacion");
            model.addColumn("idioma");
            model.addColumn("Editorial");
            
            jTable1.setModel(model);
             String[] dato= new String[7];
              String sql ="SELECT * from libro" ;
        
        
        try {            
            con=cl.getConnection();
                smt= con.createStatement();                   
                ResultSet rs = smt.executeQuery(sql);
              while ( rs.next()){
                  dato[0]=rs.getString(1);
                  dato[1]=rs.getString(2);
                  dato[2]=rs.getString(3);
                  dato[3]=rs.getString(4);
                  dato[4]=rs.getString(5);
                  dato[5]=rs.getString(6);
                  dato[6]=rs.getString(7);
                  dato[7]=rs.getString(8);
                  model.addRow(dato);         
       }   
       } catch (SQLException ex) {
           Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    }
  

 
      /** Creates new form Principal *

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField_ndeserie = new javax.swing.JTextField();
        jTextField_isbn = new javax.swing.JTextField();
        jTextField_titulo = new javax.swing.JTextField();
        jTextField_ndepaginas = new javax.swing.JTextField();
        jTextField_prefioref = new javax.swing.JTextField();
        jTextField_idioma = new javax.swing.JTextField();
        txt_anoPublicacion = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField_editorial = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        cbo_id_libro = new javax.swing.JComboBox<>();
        jButton_editar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txt_diaA = new javax.swing.JTextField();
        btn_arrendaLibro = new javax.swing.JButton();
        cbo_libroA = new javax.swing.JComboBox<>();
        cbo_trabajador = new javax.swing.JComboBox<>();
        cbo_cliente = new javax.swing.JComboBox<>();
        lb_tituloArriendo = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txt_mesA = new javax.swing.JTextField();
        txt_anoA = new javax.swing.JTextField();
        txt_diaE = new javax.swing.JTextField();
        txt_mesE = new javax.swing.JTextField();
        txt_anoE = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        lb_nombreTrabajador = new javax.swing.JLabel();
        lb_nombreCliente = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txt_valorA = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lb_multa = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        cbo_arriendoC = new javax.swing.JComboBox<>();
        cbo_ArriendoLibro = new javax.swing.JComboBox<>();
        dias_dev = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        lb_costoTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mes_dev = new javax.swing.JTextField();
        ano_dev = new javax.swing.JTextField();
        lb_fechaDVl = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        lb_ClienteDEV = new javax.swing.JLabel();
        lb_tituloDEV = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        dias_retraso = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        lb_valorArriendo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_vPneto = new javax.swing.JTextField();
        txt_vcIva = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txt_pmi = new javax.swing.JTextField();
        txt_horaVenta = new javax.swing.JTextField();
        txt_fechaVenta = new javax.swing.JTextField();
        rd_Deposito = new javax.swing.JRadioButton();
        rd_efectivo = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        btn_venta = new javax.swing.JButton();
        cbo_ventaLibro = new javax.swing.JComboBox<>();
        cbo_vtrabajador = new javax.swing.JComboBox<>();
        cbo_VLCliente = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cbo_LibroC = new javax.swing.JComboBox<>();
        cbo_empresa = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField_rutcliente = new javax.swing.JTextField();
        jTextField_nombrecliente = new javax.swing.JTextField();
        jTextField_apellidoclientepaterno = new javax.swing.JTextField();
        jTextField_apellidoclientematerno = new javax.swing.JTextField();
        jTextField_anocliente = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField_mescliente = new javax.swing.JTextField();
        jTextField_diacliente = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton_registrocliente = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jTextField_DVC = new javax.swing.JTextField();
        btn_EliminarC = new javax.swing.JButton();
        cbo_ECliente = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_rut1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_apellido_paterno = new javax.swing.JTextField();
        jTextField_apellido_materno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_correo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_contrato_dia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField_contrato_mes = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_contrato_ano = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bton_registrar = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jTextField1_DVT = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_rutempresa = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField_nombreempresa = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField_direccionempresa = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField_telefonoempresa = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField_ano_ventas = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField_mes_ventas = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField_dia_ventas = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton_registrarempresa = new javax.swing.JButton();
        txt_DV = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("-- BIBLIOTECA --");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane6.setBackground(java.awt.SystemColor.textHighlight);
        jTabbedPane6.setForeground(new java.awt.Color(255, 255, 0));
        jTabbedPane6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane6FocusGained(evt);
            }
        });
        jTabbedPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane6MouseClicked(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jTabbedPane6.addTab("Inicio", jPanel1);

        jPanel2.setBackground(java.awt.SystemColor.textHighlight);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("N° DE SERIE");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("ISBN");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("TÍTULO");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText("N° DE PÁGINAS");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setText("PRECIO REF");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText("AÑO PUBLICACIÓN");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("IDIOMA");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 0));
        jLabel25.setText("AUTOR/ES");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 0));
        jLabel26.setText("CATEGORIA");

        jTextField_ndeserie.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_ndeserie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ndeserieKeyTyped(evt);
            }
        });

        jTextField_isbn.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_isbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_isbnKeyTyped(evt);
            }
        });

        jTextField_titulo.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_tituloKeyTyped(evt);
            }
        });

        jTextField_ndepaginas.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_ndepaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ndepaginasKeyTyped(evt);
            }
        });

        jTextField_prefioref.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_prefioref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_prefiorefKeyTyped(evt);
            }
        });

        jTextField_idioma.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_idioma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_idiomaKeyTyped(evt);
            }
        });

        txt_anoPublicacion.setBackground(new java.awt.Color(0, 255, 255));
        txt_anoPublicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anoPublicacionKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 0));
        jLabel27.setText("EDITORIAL");

        jTextField_editorial.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_editorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_editorialKeyTyped(evt);
            }
        });

        jButton_Registrar.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Registrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Registrar.setText("REGISTRAR");
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 0));
        jLabel82.setText("$");

        cbo_id_libro.setBackground(new java.awt.Color(255, 119, 0));
        cbo_id_libro.setForeground(new java.awt.Color(255, 119, 0));
        cbo_id_libro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona..." }));
        cbo_id_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_id_libroActionPerformed(evt);
            }
        });

        jButton_editar.setBackground(new java.awt.Color(255, 0, 0));
        jButton_editar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_editar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_editar.setText("EDITAR");
        jButton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 0, 0));
        btn_limpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_Eliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24)
                                .addComponent(jLabel25)
                                .addComponent(jLabel26)
                                .addComponent(jLabel27))
                            .addComponent(jButton_Registrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_isbn)
                            .addComponent(jTextField_titulo)
                            .addComponent(jTextField_ndepaginas)
                            .addComponent(jTextField_idioma)
                            .addComponent(jTextField_editorial)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(31, 31, 31)
                                .addComponent(jTextField_prefioref, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_anoPublicacion)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_ndeserie, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_id_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_ndeserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbo_id_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jTextField_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_ndepaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel82))
                    .addComponent(jTextField_prefioref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_anoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Registrar)
                    .addComponent(jButton_editar)
                    .addComponent(btn_limpiar))
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("ADMINISTRAR LIBRO", jPanel2);

        jPanel3.setBackground(java.awt.SystemColor.textHighlight);

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 0));
        jLabel50.setText("NUMERO DE SERIE");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 0));
        jLabel52.setText("FECHA DE ARRIENDO");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 0));
        jLabel53.setText("FECHA DE DEVOLUCIÓN ESTIMADA");

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 0));
        jLabel58.setText("CLIENTE INVOLUCRADO");

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 0));
        jLabel59.setText("TRABAJADOR INVOLUCRADO");

        txt_diaA.setBackground(new java.awt.Color(0, 255, 255));
        txt_diaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_diaAKeyTyped(evt);
            }
        });

        btn_arrendaLibro.setBackground(new java.awt.Color(255, 0, 0));
        btn_arrendaLibro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_arrendaLibro.setForeground(new java.awt.Color(255, 255, 255));
        btn_arrendaLibro.setText("ARRENDAR LIBRO");
        btn_arrendaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_arrendaLibroActionPerformed(evt);
            }
        });

        cbo_libroA.setBackground(new java.awt.Color(255, 119, 0));
        cbo_libroA.setForeground(new java.awt.Color(255, 119, 0));
        cbo_libroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_libroAActionPerformed(evt);
            }
        });

        cbo_trabajador.setBackground(new java.awt.Color(255, 119, 0));
        cbo_trabajador.setForeground(new java.awt.Color(255, 119, 0));
        cbo_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_trabajadorActionPerformed(evt);
            }
        });

        cbo_cliente.setBackground(new java.awt.Color(255, 119, 0));
        cbo_cliente.setForeground(new java.awt.Color(255, 119, 0));
        cbo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_clienteActionPerformed(evt);
            }
        });

        lb_tituloArriendo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_tituloArriendo.setForeground(new java.awt.Color(255, 255, 0));
        lb_tituloArriendo.setText("_____________________________");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 0));
        jLabel55.setText("NOMBRE LIBRO");

        txt_mesA.setBackground(new java.awt.Color(0, 255, 255));
        txt_mesA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mesAKeyTyped(evt);
            }
        });

        txt_anoA.setBackground(new java.awt.Color(0, 255, 255));
        txt_anoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anoAKeyTyped(evt);
            }
        });

        txt_diaE.setBackground(new java.awt.Color(0, 255, 255));
        txt_diaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_diaEKeyTyped(evt);
            }
        });

        txt_mesE.setBackground(new java.awt.Color(0, 255, 255));
        txt_mesE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mesEKeyTyped(evt);
            }
        });

        txt_anoE.setBackground(new java.awt.Color(0, 255, 255));
        txt_anoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anoEKeyTyped(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 0));
        jLabel86.setText("NOMBRE CLIENTE");

        jLabel88.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 0));
        jLabel88.setText("NOMBRE TRABAJADOR");

        lb_nombreTrabajador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_nombreTrabajador.setForeground(new java.awt.Color(255, 255, 0));
        lb_nombreTrabajador.setText("NOMBRE TRABAJADOR");
        lb_nombreTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lb_nombreTrabajadorKeyTyped(evt);
            }
        });

        lb_nombreCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_nombreCliente.setForeground(new java.awt.Color(255, 255, 0));
        lb_nombreCliente.setText("NOMBRE TRABAJADOR");

        jLabel90.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 0));
        jLabel90.setText("Valor Arriendo");

        txt_valorA.setBackground(new java.awt.Color(0, 255, 255));
        txt_valorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorAKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel90)
                            .addComponent(jLabel88)
                            .addComponent(jLabel86)
                            .addComponent(jLabel55)
                            .addComponent(jLabel50)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_valorA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_tituloArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lb_nombreTrabajador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_nombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbo_trabajador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbo_cliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbo_libroA, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(txt_diaA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_mesA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                    .addComponent(txt_anoA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(txt_diaE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_mesE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_anoE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_arrendaLibro)
                        .addGap(431, 431, 431))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(cbo_libroA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(lb_tituloArriendo))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_diaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mesA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_anoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_diaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_anoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(lb_nombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88)
                    .addComponent(lb_nombreTrabajador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(txt_valorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btn_arrendaLibro)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("ARRIENDO LIBRO", jPanel3);

        jPanel4.setBackground(java.awt.SystemColor.textHighlight);

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 0));
        jLabel51.setText("CLIENTE");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 0));
        jLabel56.setText("LIBRO");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 0));
        jLabel57.setText("FECHA DEVOLUCION");

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 0));
        jLabel63.setText("FECHA ESTIMADA");

        lb_multa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_multa.setForeground(new java.awt.Color(255, 255, 0));
        lb_multa.setText("0000");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 0));
        jLabel65.setText("DIAS DE RETRASO");

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 0));
        jLabel66.setText("COSTO TOTAL");

        cbo_arriendoC.setBackground(new java.awt.Color(255, 119, 0));
        cbo_arriendoC.setForeground(new java.awt.Color(255, 119, 0));
        cbo_arriendoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_arriendoCActionPerformed(evt);
            }
        });

        cbo_ArriendoLibro.setBackground(new java.awt.Color(255, 119, 0));
        cbo_ArriendoLibro.setForeground(new java.awt.Color(255, 119, 0));
        cbo_ArriendoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ArriendoLibroActionPerformed(evt);
            }
        });

        dias_dev.setBackground(new java.awt.Color(0, 255, 255));
        dias_dev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias_devKeyTyped(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 0));
        jLabel67.setText("MULTA");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 0));
        jLabel68.setText("$");

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 0));
        jLabel69.setText("$");

        lb_costoTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_costoTotal.setForeground(new java.awt.Color(255, 255, 0));
        lb_costoTotal.setText("0000");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRAR DEVOLUCION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        mes_dev.setBackground(new java.awt.Color(0, 255, 255));
        mes_dev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mes_devKeyTyped(evt);
            }
        });

        ano_dev.setBackground(new java.awt.Color(0, 255, 255));
        ano_dev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ano_devKeyTyped(evt);
            }
        });

        lb_fechaDVl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_fechaDVl.setForeground(new java.awt.Color(255, 255, 0));
        lb_fechaDVl.setText("00-00-0000");

        jLabel89.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 0));
        jLabel89.setText("NOMBRE");

        lb_ClienteDEV.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_ClienteDEV.setForeground(new java.awt.Color(255, 255, 0));
        lb_ClienteDEV.setText("NOMBRE");

        lb_tituloDEV.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_tituloDEV.setForeground(new java.awt.Color(255, 255, 0));
        lb_tituloDEV.setText("NOMBRE");

        jLabel92.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 0));
        jLabel92.setText("TITULO");

        dias_retraso.setBackground(new java.awt.Color(0, 255, 255));
        dias_retraso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dias_retrasoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias_retrasoKeyTyped(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 0));
        jLabel91.setText("VALOR ARRIENDO");

        lb_valorArriendo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_valorArriendo.setForeground(new java.awt.Color(255, 255, 0));
        lb_valorArriendo.setText("VALOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(lb_fechaDVl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel65))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbo_arriendoC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbo_ArriendoLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lb_ClienteDEV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lb_tituloDEV, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel68)
                                                    .addGap(47, 47, 47)
                                                    .addComponent(lb_multa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel69)
                                                    .addGap(47, 47, 47)
                                                    .addComponent(lb_costoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(dias_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(mes_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ano_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(dias_retraso, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_valorArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(440, 440, 440))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_arriendoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(lb_ClienteDEV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(cbo_ArriendoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tituloDEV)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(lb_fechaDVl))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(lb_valorArriendo))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(dias_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(dias_retraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_multa))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_costoTotal)))
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("DEVOLUCION DE LIBRO", jPanel4);

        jPanel7.setBackground(java.awt.SystemColor.textHighlight);

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 0));
        jLabel54.setText("LIBRO");
        jLabel54.setToolTipText("");

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 0));
        jLabel71.setText("CLIENTE");
        jLabel71.setToolTipText("");

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 0));
        jLabel72.setText("TRABAJADOR");

        jPanel5.setBackground(java.awt.SystemColor.textHighlight);
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 0));
        jPanel5.setToolTipText("");

        txt_vPneto.setBackground(new java.awt.Color(0, 255, 255));
        txt_vPneto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vPnetoActionPerformed(evt);
            }
        });

        txt_vcIva.setBackground(new java.awt.Color(0, 255, 255));
        txt_vcIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vcIvaActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 0));
        jLabel64.setText("FOLIO:");
        jLabel64.setToolTipText("");

        txt_pmi.setBackground(new java.awt.Color(0, 255, 255));
        txt_pmi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_horaVenta.setBackground(new java.awt.Color(0, 255, 255));

        txt_fechaVenta.setBackground(new java.awt.Color(0, 255, 255));

        rd_Deposito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rd_Deposito.setForeground(new java.awt.Color(255, 255, 0));
        rd_Deposito.setText("Deposito");
        rd_Deposito.setToolTipText("");
        rd_Deposito.setMultiClickThreshhold(1L);
        rd_Deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_DepositoActionPerformed(evt);
            }
        });

        rd_efectivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rd_efectivo.setForeground(new java.awt.Color(255, 255, 0));
        rd_efectivo.setText("Efectivo");
        rd_efectivo.setToolTipText("");
        rd_efectivo.setMultiClickThreshhold(1L);

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 0));
        jLabel74.setText("METODO DE PAGO");
        jLabel74.setToolTipText("");

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 0));
        jLabel75.setText("COSO IVA");
        jLabel75.setToolTipText("");

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 0));
        jLabel76.setText("FECHA / HORA");
        jLabel76.setToolTipText("");

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 0));
        jLabel77.setText("Costo Total $");
        jLabel77.setToolTipText("");

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 0));
        jLabel78.setText("PRECIO NETO");
        jLabel78.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(167, 167, 167))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel77)
                .addGap(37, 37, 37)
                .addComponent(txt_pmi)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(37, 37, 37)
                        .addComponent(txt_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_horaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel78)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_vPneto, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(txt_vcIva)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(37, 37, 37)
                        .addComponent(rd_Deposito)
                        .addGap(18, 18, 18)
                        .addComponent(rd_efectivo)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txt_vPneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel78)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_vcIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_horaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_Deposito)
                    .addComponent(rd_efectivo)
                    .addComponent(jLabel74))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_venta.setBackground(new java.awt.Color(255, 0, 0));
        btn_venta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_venta.setForeground(new java.awt.Color(255, 255, 255));
        btn_venta.setText("VENDER LIBRO");

        cbo_ventaLibro.setBackground(new java.awt.Color(255, 119, 0));
        cbo_ventaLibro.setForeground(new java.awt.Color(255, 119, 0));
        cbo_ventaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ventaLibroActionPerformed(evt);
            }
        });

        cbo_vtrabajador.setBackground(new java.awt.Color(255, 119, 0));
        cbo_vtrabajador.setForeground(new java.awt.Color(255, 119, 0));
        cbo_vtrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_vtrabajadorActionPerformed(evt);
            }
        });

        cbo_VLCliente.setBackground(new java.awt.Color(255, 119, 0));
        cbo_VLCliente.setForeground(new java.awt.Color(255, 119, 0));
        cbo_VLCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_VLClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 442, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbo_vtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel54)
                                            .addComponent(jLabel71))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbo_VLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbo_ventaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_venta)
                        .addGap(476, 476, 476))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(cbo_vtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(cbo_VLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(cbo_ventaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_venta)
                .addGap(61, 61, 61))
        );

        jTabbedPane6.addTab("VENTA LIBRO", jPanel7);

        jPanel6.setBackground(java.awt.SystemColor.textHighlight);

        jLabel79.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 0));
        jLabel79.setText("LIBRO");

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 0));
        jLabel80.setText("EMPRESA");

        jPanel12.setBackground(java.awt.SystemColor.textHighlight);
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 0));
        jLabel81.setText("FOLIO:");

        jTextField3.setBackground(new java.awt.Color(0, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(0, 255, 255));

        jTextField12.setBackground(new java.awt.Color(0, 255, 255));

        jTextField13.setBackground(new java.awt.Color(0, 255, 255));

        jLabel83.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 0));
        jLabel83.setText("COSO IVA");

        jLabel84.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 0));
        jLabel84.setText("PRECIO + IVA");

        jLabel85.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 0));
        jLabel85.setText("FECHA / HORA");

        jTextField14.setBackground(new java.awt.Color(0, 255, 255));

        jLabel87.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 0));
        jLabel87.setText("PRECIO NETO");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel81)
                .addGap(107, 107, 107))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel84))
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel87)
                        .addGap(59, 59, 59)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81)
                .addGap(13, 13, 13)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel83)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel84))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel85)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("COMPRAR LIBRO");

        cbo_LibroC.setBackground(new java.awt.Color(255, 119, 0));
        cbo_LibroC.setForeground(new java.awt.Color(255, 119, 0));

        cbo_empresa.setBackground(new java.awt.Color(255, 119, 0));
        cbo_empresa.setForeground(new java.awt.Color(255, 119, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 370, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel79))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbo_LibroC, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(430, 430, 430))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(500, 500, 500))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addComponent(cbo_LibroC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(cbo_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(29, 29, 29))
        );

        jTabbedPane6.addTab("COMPRA LIBRO", jPanel6);

        jPanel8.setBackground(java.awt.SystemColor.textHighlight);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 0));
        jLabel37.setText("NOMBRE");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 0));
        jLabel38.setText("RUT CLIENTE");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 0));
        jLabel39.setText("APELLIDO PATERNO");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 0));
        jLabel40.setText("APELLIDO MATERNO");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 0));
        jLabel41.setText("DIRECCIÓN");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 0));
        jLabel42.setText("TELÉFONO");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 0));
        jLabel43.setText("CORREO");

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 0));
        jLabel44.setText("FECHA DE NACIMIENTO");

        jTextField_rutcliente.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_rutcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_rutclienteKeyTyped(evt);
            }
        });

        jTextField_nombrecliente.setBackground(new java.awt.Color(0, 255, 255));

        jTextField_apellidoclientepaterno.setBackground(new java.awt.Color(0, 255, 255));

        jTextField_apellidoclientematerno.setBackground(new java.awt.Color(0, 255, 255));

        jTextField_anocliente.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_anocliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_anoclienteKeyTyped(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel45.setText("-");

        jTextField_mescliente.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_mescliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_mesclienteKeyTyped(evt);
            }
        });

        jTextField_diacliente.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_diacliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_diaclienteKeyTyped(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 0));
        jLabel47.setText("AAAA");

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 0));
        jLabel48.setText("MM");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 0));
        jLabel49.setText("DD");

        jButton_registrocliente.setBackground(new java.awt.Color(255, 0, 0));
        jButton_registrocliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_registrocliente.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registrocliente.setText("REGISTRAR CLIENTE");
        jButton_registrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroclienteActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel62.setText("-");

        jTextField_DVC.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_DVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DVCActionPerformed(evt);
            }
        });
        jTextField_DVC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_DVCKeyTyped(evt);
            }
        });

        btn_EliminarC.setBackground(new java.awt.Color(255, 0, 0));
        btn_EliminarC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_EliminarC.setForeground(new java.awt.Color(255, 255, 255));
        btn_EliminarC.setText("Eliminar Cliente");
        btn_EliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarCActionPerformed(evt);
            }
        });

        cbo_ECliente.setBackground(new java.awt.Color(255, 119, 0));
        cbo_ECliente.setForeground(new java.awt.Color(255, 119, 0));
        cbo_ECliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_EClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_diacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel49)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jTextField_mescliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField_anocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel48)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel47))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jTextField_rutcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_DVC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_ECliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_nombrecliente)
                            .addComponent(jTextField_apellidoclientepaterno)
                            .addComponent(jTextField_apellidoclientematerno))
                        .addContainerGap(307, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton_registrocliente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_EliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel45))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_rutcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)
                            .addComponent(jTextField_DVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_ECliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jTextField_nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jTextField_apellidoclientepaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jTextField_apellidoclientematerno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jTextField_anocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_mescliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_diacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))))
                .addGap(62, 62, 62)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_registrocliente)
                    .addComponent(btn_EliminarC))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("REGISTRO CLIENTE", jPanel8);

        jPanel9.setBackground(java.awt.SystemColor.textHighlight);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("RUT");

        jTextField_rut1.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_rut1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_rut1KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("NOMBRE");

        jTextField_nombre.setBackground(new java.awt.Color(0, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("APELLIDO MATERNO");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("APELLIDO PATERNO");

        jTextField_apellido_paterno.setBackground(new java.awt.Color(0, 255, 255));

        jTextField_apellido_materno.setBackground(new java.awt.Color(0, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("DIRECCIÓN");

        jTextField_direccion.setBackground(new java.awt.Color(0, 255, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("TELÉFONO");

        jTextField_telefono.setBackground(new java.awt.Color(0, 255, 255));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("CORREO");

        jTextField_correo.setBackground(new java.awt.Color(0, 255, 255));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("CONTRATO");

        jTextField_contrato_dia.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_contrato_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_contrato_diaKeyTyped(evt);
            }
        });

        jLabel13.setText("-");

        jTextField_contrato_mes.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_contrato_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_contrato_mesKeyTyped(evt);
            }
        });

        jLabel14.setText("-");

        jTextField_contrato_ano.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_contrato_ano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_contrato_anoKeyTyped(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("DD");

        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("MM");

        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("AAAA");

        bton_registrar.setBackground(new java.awt.Color(255, 0, 0));
        bton_registrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bton_registrar.setForeground(new java.awt.Color(255, 255, 255));
        bton_registrar.setText("REGISTRAR");
        bton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_registrarActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel61.setText("-");

        jTextField1_DVT.setBackground(new java.awt.Color(0, 255, 255));
        jTextField1_DVT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_DVTKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(541, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(bton_registrar)
                        .addGap(412, 412, 412))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jTextField_rut1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel61)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1_DVT))
                                    .addComponent(jTextField_nombre)
                                    .addComponent(jTextField_apellido_paterno)
                                    .addComponent(jTextField_apellido_materno)
                                    .addComponent(jTextField_direccion)
                                    .addComponent(jTextField_telefono)
                                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_contrato_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_contrato_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_contrato_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(309, 309, 309))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_rut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField1_DVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_contrato_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jTextField_contrato_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jTextField_contrato_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(62, 62, 62)
                .addComponent(bton_registrar)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("REGISTRO TRABAJADOR", jPanel9);

        jPanel10.setBackground(java.awt.SystemColor.textHighlight);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("RUT");

        jTextField_rutempresa.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_rutempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_rutempresaActionPerformed(evt);
            }
        });
        jTextField_rutempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_rutempresaKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 0));
        jLabel28.setText("NOMBRE EMPRESA");

        jTextField_nombreempresa.setBackground(new java.awt.Color(0, 255, 255));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 0));
        jLabel29.setText("DIRECCIÓN");

        jTextField_direccionempresa.setBackground(new java.awt.Color(0, 255, 255));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 0));
        jLabel30.setText("TELÉFONO");

        jTextField_telefonoempresa.setBackground(new java.awt.Color(0, 255, 255));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 0));
        jLabel31.setText("AÑO DE VENTAS");

        jTextField_ano_ventas.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_ano_ventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ano_ventasKeyTyped(evt);
            }
        });

        jLabel32.setForeground(new java.awt.Color(255, 255, 0));
        jLabel32.setText("-");

        jTextField_mes_ventas.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_mes_ventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_mes_ventasKeyTyped(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(255, 255, 0));
        jLabel33.setText("-");

        jTextField_dia_ventas.setBackground(new java.awt.Color(0, 255, 255));
        jTextField_dia_ventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_dia_ventasKeyTyped(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 0));
        jLabel34.setText("AAAA");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 0));
        jLabel35.setText("MM");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 0));
        jLabel36.setText("DD");

        jButton_registrarempresa.setBackground(new java.awt.Color(255, 0, 0));
        jButton_registrarempresa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_registrarempresa.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registrarempresa.setText("REGISTRAR");
        jButton_registrarempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarempresaActionPerformed(evt);
            }
        });

        txt_DV.setBackground(new java.awt.Color(0, 255, 255));
        txt_DV.setToolTipText("");
        txt_DV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DVKeyTyped(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel60.setText("-");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_nombreempresa)
                                .addComponent(jTextField_direccionempresa)
                                .addComponent(jTextField_telefonoempresa)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jTextField_rutempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_dia_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel36)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel35))
                                    .addComponent(jTextField_mes_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ano_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel34)))))
                        .addGap(98, 98, 98)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_DV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jButton_registrarempresa)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_rutempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jTextField_nombreempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextField_direccionempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jTextField_telefonoempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jTextField_dia_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField_mes_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35)))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_ano_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel33))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel34))))))
                .addGap(36, 36, 36)
                .addComponent(jButton_registrarempresa)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("REGISTRO DISTRIBUIDOR", jPanel10);

        jScrollPane1.setBackground(java.awt.SystemColor.textHighlight);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NUMERO DE SERIE", "ISBM", "TITULO", "N° PAGINAS", "PRECIO REFERENCIAL", "AÑO PUBLICACION", "IDIOMA", "EDITORIAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1323, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("LISTA DE LIBROS", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(501, 501, 501)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane6)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_DVCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DVCKeyTyped
        if (jTextField_DVC.getText().length()== 1)

        evt.consume();
    }//GEN-LAST:event_jTextField_DVCKeyTyped

    private void jTextField_DVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DVCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DVCActionPerformed

    private void jButton_registroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registroclienteActionPerformed
        try {
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String rut_cliente,nombre_cliente, apellidocliente_paterno, apellidocliente_materno, sql;
            int ano_cliente, mes_cliente, dia_cliente;
            boolean a=true;
            if ("".equals(this.jTextField_rutcliente.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Rut del Cliente");
                a=false;
                this.jTextField_rutcliente.setText("");
            }
            if ("".equals(this.jTextField_DVC.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Rut del Cliente");
                a=false;
                this.jTextField_DVC.setText("");
            }
            if("".equals(this.jTextField_nombrecliente.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese el Nombre del Cliente sin Guión ni Puntos");
                a=false;
                this.jTextField_nombrecliente.setText("");
            }
            if("".equals(this.jTextField_apellidoclientepaterno.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese El Apellido Paterno del Cliente");
                a=false;
                this.jTextField_apellidoclientepaterno.setText("");
            }

            if ("".equals(this.jTextField_apellidoclientematerno.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Apellido Materno del Cliente");
                a=false;
                this.jTextField_apellidoclientematerno.setText("");
            }

            if ("".equals(this.jTextField_anocliente.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese El Año de Nacimiento del Cliente");
                a=false;
                this.jTextField_anocliente.setText("");
            }
            if ("".equals(this.jTextField_mescliente.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese El Mes de Nacimiento del Cliente");
                a=false;
                this.jTextField_mescliente.setText("");
            }
            if ("".equals(this.jTextField_diacliente.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese El Día de Nacimiento del Cliente");
                a=false;
                this.jTextField_diacliente.setText("");
            }

            if (a==true) {
                rut_cliente=jTextField_rutcliente.getText()+"-"+jTextField_DVC.getText();
                nombre_cliente=jTextField_nombrecliente.getText();
                apellidocliente_paterno=jTextField_apellidoclientepaterno.getText();
                apellidocliente_materno=jTextField_apellidoclientematerno.getText();
                ano_cliente=Integer.parseInt(jTextField_anocliente.getText());
                mes_cliente=Integer.parseInt(jTextField_mescliente.getText());
                dia_cliente=Integer.parseInt(jTextField_diacliente.getText());

                sql="INSERT INTO cliente(rut,nombre,apellido_p,apellido_m,fecha_nacto)VALUES(?,?,?,?,?)";
                try {
                    PreparedStatement pst=reg.prepareStatement(sql);
                    try {
                        pst.setString(1, rut_cliente);
                        pst.setString(2, nombre_cliente);
                        pst.setString(3, apellidocliente_paterno);
                        pst.setString(4, apellidocliente_materno);
                        pst.setString(5, ano_cliente+"-"+mes_cliente+"-"+dia_cliente);

                        int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Agregados con éxito...");
                            this.jTextField_rutcliente.setText("");
                            this.jTextField_DVC.setText("");
                            this.jTextField_nombrecliente.setText("");
                            this.jTextField_apellidoclientepaterno.setText("");
                            this.jTextField_apellidoclientematerno.setText("");

                            this.jTextField_anocliente.setText("");
                            this.jTextField_mescliente.setText("");
                            this.jTextField_diacliente.setText("");

                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "datos no valido");
                        /*stmt = reg.prepareStatement("UPDATE libro SET numero_serie = numero_serie + 1 WHERE numero_serie ="+this.jTextField_ndeserie.getText());*/
                        stmt.executeUpdate();
                        this.jTextField_rutcliente.setText("");
                    }

                } catch (SQLException e) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Inválido");

        }
        cargarECliente();
        
    }//GEN-LAST:event_jButton_registroclienteActionPerformed

    private void jTextField_rutclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rutclienteKeyTyped
  char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_rutcliente.getText().length()== 8)
        evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_rutclienteKeyTyped

    private void jTextField1_DVTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_DVTKeyTyped
        if (jTextField1_DVT.getText().length()== 1)

        evt.consume();
    }//GEN-LAST:event_jTextField1_DVTKeyTyped

    private void bton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_registrarActionPerformed
        try {
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String rut,nombre, apellido_paterno, apellido_materno, direccion, correo,sql;
            int telefono,contrato_dia, contrato_mes, contrato_ano;
            boolean a=true;
            if ("".equals(this.jTextField_nombre.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Nombre del Trabajador");
                a=false;
                this.jTextField_nombre.setText("");
            }
            if("".equals(this.jTextField_rut1.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese el Rut del Trabajador sin Guión ni Puntos");
                a=false;
                this.jTextField_rut1.setText("");
            } if("".equals(this.jTextField1_DVT.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese el Rut del Trabajador sin Guión ni Puntos");
                a=false;
                this.jTextField1_DVT.setText("");
            }
            if("".equals(this.jTextField_apellido_paterno.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese el Apellido Paterno");
                a=false;
                this.jTextField_apellido_paterno.setText("");
            }
            if ("".equals(this.jTextField_apellido_materno.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Apellido Materno");
                a=false;
                this.jTextField_apellido_materno.setText("");
            }
            if ("".equals(this.jTextField_direccion.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese La Dirección");
                a=false;
                this.jTextField_direccion.setText("");
            }
            if ("".equals(this.jTextField_telefono.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Teléfono");
                a=false;
                this.jTextField_telefono.setText("");
            }
            if ("".equals(this.jTextField_correo.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Correo");
                a=false;
                this.jTextField_correo.setText("");
            }
            if ("".equals(this.jTextField_contrato_dia.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Día del Contrato");
                a=false;
                this.jTextField_contrato_dia.setText("");
            }
            if ("".equals(this.jTextField_contrato_mes.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese El mes del Contrato");
                a=false;
                this.jTextField_contrato_mes.setText("");
            }
            if ("".equals(this.jTextField_contrato_ano.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Año del Contrato");
                a=false;
                this.jTextField_contrato_ano.setText("");
            }

            if (a==true) {
                rut=jTextField_rut1.getText()+"-"+jTextField1_DVT.getText();
                nombre=jTextField_nombre.getText();
                apellido_paterno=jTextField_apellido_paterno.getText();
                apellido_materno=jTextField_apellido_materno.getText();
                direccion=jTextField_direccion.getText();
                telefono=Integer.parseInt(jTextField_telefono.getText());
                correo=jTextField_correo.getText();
                contrato_dia=Integer.parseInt(jTextField_contrato_dia.getText());
                contrato_mes=Integer.parseInt(jTextField_contrato_mes.getText());
                contrato_ano=Integer.parseInt(jTextField_contrato_ano.getText());

                sql="INSERT INTO trabajadores(rut_trabajador,nombre,apellido_p,apellido_m,correo,telefono,inicio_contrato,direccion)VALUES(?,?,?,?,?,?,?,?)";
                try {
                    PreparedStatement pst=reg.prepareStatement(sql);
                    try {
                        pst.setString(1, rut);
                        pst.setString(2, nombre);
                        pst.setString(3, apellido_paterno);
                        pst.setString(4, apellido_materno);
                        pst.setString(5, correo);
                        pst.setInt(6, telefono);
                        pst.setString(7, contrato_ano+"-"+contrato_mes+"-"+contrato_dia);
                        pst.setString(8, direccion);
                        int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Agregados con éxito...");
                            this.jTextField_rut1.setText("");
                            this.jTextField1_DVT.setText("");
                            this.jTextField_nombre.setText("");
                            this.jTextField_apellido_paterno.setText("");
                            this.jTextField_apellido_materno.setText("");
                            this.jTextField_correo.setText("");
                            this.jTextField_telefono.setText("");
                            this.jTextField_contrato_dia.setText("");
                            this.jTextField_contrato_mes.setText("");
                            this.jTextField_contrato_ano.setText("");
                            this.jTextField_direccion.setText("");

                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Rut del Trabajador ya existe");
                        /*stmt = reg.prepareStatement("UPDATE libro SET numero_serie = numero_serie + 1 WHERE numero_serie ="+this.jTextField_ndeserie.getText());*/
                        stmt.executeUpdate();
                        this.jTextField_rut1.setText("");
                        this.jTextField1_DVT.setText("");
                    }

                } catch (SQLException e) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Inválido");

        }
    }//GEN-LAST:event_bton_registrarActionPerformed

    private void jTextField_rut1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rut1KeyTyped
  char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_rut1.getText().length()== 8)

        evt.consume();
    }//GEN-LAST:event_jTextField_rut1KeyTyped

    private void txt_DVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DVKeyTyped
        if (txt_DV.getText().length()== 1)

        evt.consume();
    }//GEN-LAST:event_txt_DVKeyTyped

    private void jButton_registrarempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarempresaActionPerformed
        try {
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String nombre_empresa, direccion_empresa,rut_empresa,sql;
            int telefono_empresa,ano_ventas, mes_ventas, dia_ventas;
            boolean a=true;
            if ("".equals(this.jTextField_rutempresa.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Rut de la Empresa");
                a=false;
                this.jTextField_rutempresa.setText("");
            }
            if ("".equals(this.txt_DV.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Rut de la Empresa");
                a=false;
                this.txt_DV.setText("");
            }
            if("".equals(this.jTextField_nombreempresa.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese el Nombre de la Empresa sin Guión ni Puntos");
                a=false;
                this.jTextField_nombreempresa.setText("");
            }
            if("".equals(this.jTextField_direccionempresa.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese La Dirección de la Empresa");
                a=false;
                this.jTextField_direccionempresa.setText("");
            }

            if ("".equals(this.jTextField_telefonoempresa.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Teléfono de la Empresa");
                a=false;
                this.jTextField_telefonoempresa.setText("");
            }

            if ("".equals(this.jTextField_ano_ventas.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Año de Ventas");
                a=false;
                this.jTextField_ano_ventas.setText("");
            }
            if ("".equals(this.jTextField_mes_ventas.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese El mes de Ventas");
                a=false;
                this.jTextField_mes_ventas.setText("");
            }
            if ("".equals(this.jTextField_dia_ventas.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese El día de las Ventas");
                a=false;
                this.jTextField_dia_ventas.setText("");
            }

            if (a==true) {
                rut_empresa=jTextField_rutempresa.getText()+"-"+txt_DV.getText();
                nombre_empresa=jTextField_nombreempresa.getText();
                direccion_empresa=jTextField_direccionempresa.getText();
                telefono_empresa=Integer.parseInt(jTextField_telefonoempresa.getText());
                ano_ventas=Integer.parseInt(jTextField_ano_ventas.getText());
                mes_ventas=Integer.parseInt(jTextField_mes_ventas.getText());
                dia_ventas=Integer.parseInt(jTextField_dia_ventas.getText());

                sql="INSERT INTO distribuidor(rut_empresa,nombre_empresa,direccion,Telefono,Año_servicio)VALUES(?,?,?,?,?)";
                try {
                    PreparedStatement pst=reg.prepareStatement(sql);
                    try {
                        pst.setString(1, rut_empresa);
                        pst.setString(2, nombre_empresa);
                        pst.setString(3, direccion_empresa);
                        pst.setInt(4, telefono_empresa);
                        pst.setString(5, ano_ventas+"-"+mes_ventas+"-"+dia_ventas);

                        int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Agregados con éxito...");
                            this.jTextField_rutempresa.setText("");
                            this.txt_DV.setText("");
                            this.jTextField_nombreempresa.setText("");
                            this.jTextField_direccionempresa.setText("");
                            this.jTextField_telefonoempresa.setText("");
                            this.jTextField_ano_ventas.setText("");
                            this.jTextField_mes_ventas.setText("");
                            this.jTextField_dia_ventas.setText("");

                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Rut del Distribuidor ya existe");
                        /*stmt = reg.prepareStatement("UPDATE libro SET numero_serie = numero_serie + 1 WHERE numero_serie ="+this.jTextField_ndeserie.getText());*/
                        stmt.executeUpdate();
                        this.jTextField_rutempresa.setText("");
                    }

                } catch (SQLException e) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Inválido");

        }
    }//GEN-LAST:event_jButton_registrarempresaActionPerformed

    private void jTextField_rutempresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rutempresaKeyTyped
  char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_rutempresa.getText().length()== 8)

        evt.consume();
    }//GEN-LAST:event_jTextField_rutempresaKeyTyped

    private void jTextField_rutempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_rutempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_rutempresaActionPerformed

    private void cbo_VLClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_VLClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_VLClienteActionPerformed

    private void cbo_vtrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_vtrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_vtrabajadorActionPerformed

    private void cbo_ventaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ventaLibroActionPerformed
       Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
   
        if(cbo_ventaLibro.getSelectedIndex()== 0){
           txt_vPneto.setText("");
           txt_vcIva.setText("");
           txt_pmi.setText("");
                
        }else{
            try {
                int Piva=0, iva=0;
                String sql="SELECT * FROM libro WHERE numero_serie='"+Integer.parseInt(cbo_ventaLibro.getSelectedItem().toString())+"';";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
                rs.next();
                txt_vPneto.setText(rs.getString("Precio_ref"));
                 iva= Integer.parseInt(txt_vPneto.getText());
                Piva=((iva*19)/100);
              txt_vcIva.setText(""+Piva);
              txt_pmi.setText(""+(iva+Piva));
                
                Date date = new Date();
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
txt_fechaVenta.setText(""+dateFormat.format(date));
                
DateFormat hourFormat = new SimpleDateFormat("hh:mm");
txt_horaVenta.setText(""+hourFormat.format(date));
            } catch (Exception e) {
               // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }
            
        }
        
        
        

    }//GEN-LAST:event_cbo_ventaLibroActionPerformed

    private void txt_vcIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vcIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vcIvaActionPerformed

    private void txt_vPnetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vPnetoActionPerformed
 
        
        
        
    }//GEN-LAST:event_txt_vPnetoActionPerformed

    private void txt_anoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anoEKeyTyped
         char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (txt_anoE.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_txt_anoEKeyTyped

    private void txt_mesEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesEKeyTyped
         char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (txt_mesE.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_txt_mesEKeyTyped

    private void txt_diaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diaEKeyTyped
         char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (txt_diaE.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_txt_diaEKeyTyped

    private void cbo_libroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_libroAActionPerformed
       Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
  
        if(cbo_libroA.getSelectedIndex()==0){
            lb_tituloArriendo.setText("______________________________");
        }else{
            try {

                String sql="SELECT * FROM libro WHERE numero_serie='"+Integer.parseInt(cbo_libroA.getSelectedItem().toString())+"';";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
                rs.next();
                lb_tituloArriendo.setText(rs.getString("Titulo"));

            } catch (Exception e) {
               // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }
        }
    }//GEN-LAST:event_cbo_libroAActionPerformed

    private void btn_arrendaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arrendaLibroActionPerformed
        try {
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String rut_cliente, rut_trabajador,sql;
            int n_deserie,ano_arriendo,mes_arriendo,dia_arriendo,ano_estimada,valorA,mes_estimada,dia_estimada;

            boolean a=true;
            if (this.cbo_libroA.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null, "selecione un libro");
                a=false;
                this.cbo_libroA.setSelectedIndex(0);
            }
            if ("".equals(this.txt_diaA.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Dia Valido");
                a=false;
              this.txt_diaA.setText("");
            } if ("".equals(this.txt_mesA.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese  Mes Valido");
                a=false;
                this.txt_mesA.setText("");
            } if ("".equals(this.txt_anoA.getText())){
                JOptionPane.showMessageDialog(null, "Infrese Año Valido");
                a=false;
                this.txt_anoA.setText("");
            }
            if ("".equals(this.txt_diaE.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Dia Valido");
                a=false;
                this.txt_diaE.setText("");
            } if ("".equals(this.txt_mesE.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese  Mes Valido");
                a=false;
                this.txt_mesE.setText("");
          } 
            if ("".equals(this.txt_valorA.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese valor ");
                a=false;
                this.txt_valorA.setText("");
            } if ("".equals(this.txt_anoE.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Año Valido");
                a=false;
               this.txt_anoE.setText("");
            }
            if (this.cbo_cliente.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null, "selecione Cliente");
                a=false;
                this.cbo_cliente.setSelectedIndex(0);
            }
            if (this.cbo_trabajador.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null, "selecione trabajador");
                a=false;
                this.cbo_trabajador.setSelectedIndex(0);
            }
            if ("".equals(this.txt_valorA.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Valor Valido");
                a=false;
               this.txt_valorA.setText("");
            }

            if (a==true) {

                n_deserie=Integer.parseInt(cbo_libroA.getSelectedItem().toString());
                ano_arriendo=Integer.parseInt(txt_anoA.getText());
                mes_arriendo=Integer.parseInt(txt_mesA.getText());
               dia_arriendo=Integer.parseInt(txt_diaA.getText());
                ano_estimada=Integer.parseInt(txt_anoE.getText());
                mes_estimada=Integer.parseInt(txt_mesE.getText());
                dia_estimada=Integer.parseInt(txt_diaE.getText());
                rut_cliente=cbo_cliente.getSelectedItem().toString();
                rut_trabajador=cbo_trabajador.getSelectedItem().toString();
                valorA=Integer.parseInt(txt_valorA.getText());
                

                sql="INSERT INTO Arriendo(numero_serie,fecha_arriendo,fecha_estimada_dev,Valor_arriendo,rut,rut_trabajador)VALUES(?,?,?,?,?,?)";

                try {
                    PreparedStatement pst=reg.prepareStatement(sql);
                    try {

                        pst.setInt(1, n_deserie);
                        pst.setString (2,ano_arriendo+"-"+mes_arriendo+"-"+dia_arriendo);
                        pst.setString (3,  ano_estimada+"-"+mes_estimada+"-"+dia_estimada);
                    pst.setInt(4, valorA);
                        pst.setString(5, rut_cliente);
                        pst.setString(6, rut_trabajador);
                        

                        int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Agregados con éxito...");
                            this.cbo_libroA.setSelectedIndex(0);
                            this.cbo_cliente.setSelectedIndex(0);
                            this.cbo_trabajador.setSelectedIndex(0);
                            this.txt_anoA.setText("");
                            this.txt_anoE.setText("");
                            this.txt_mesA.setText("");
                            this.txt_mesE.setText("");
                          this.txt_diaA.setText("");
                            this.txt_diaE.setText("");
                            this.txt_valorA.setText("");

                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Libro Arrendado"+e);
                        /*stmt = reg.prepareStatement("UPDATE libro SET numero_serie = numero_serie + 1 WHERE numero_serie ="+this.jTextField_ndeserie.getText());*/
                
                     
                    }

                } catch (SQLException e) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Inválido");
           
        }
       
            
    }//GEN-LAST:event_btn_arrendaLibroActionPerformed

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        try {
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String titulo, idioma,editorial,sql;
            int n_deserie,isbn,n_depaginas, precio_ref, ano_publicacion;
            boolean a=true;
            if ("".equals(this.jTextField_ndeserie.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el N° de Serie");
                a=false;
                this.jTextField_ndeserie.setText("");
            }
            if("".equals(this.jTextField_isbn.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese el ISBN");
                a=false;
                this.jTextField_isbn .setText("");
            }
            if("".equals(this.jTextField_titulo.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese el Título");
                a=false;
                this.jTextField_titulo.setText("");
            }
            if ("".equals(this.jTextField_ndepaginas.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el N° de Páginas");
                a=false;
                this.jTextField_ndepaginas.setText("");
            }
            if ("".equals(this.jTextField_prefioref.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Precio de Referencia");
                a=false;
                this.jTextField_prefioref.setText("");
            }
            if ("".equals(this.txt_anoPublicacion.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Año de Publicación");
                a=false;
                this.txt_anoPublicacion.setText("");
            }
            if ("".equals(this.jTextField_idioma.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese el Idioma");
                a=false;
                this.jTextField_idioma.setText("");
            }

            if ("".equals(this.jTextField_editorial.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese la Editorial");
                a=false;
                this.jTextField_editorial.setText("");
            }

            if (a==true) {
                n_deserie=Integer.parseInt(jTextField_ndeserie.getText());
                isbn=Integer.parseInt(jTextField_isbn.getText());
                titulo=jTextField_titulo.getText();
                n_depaginas=Integer.parseInt(jTextField_ndepaginas.getText());
                precio_ref=Integer.parseInt(jTextField_prefioref.getText());
                ano_publicacion=Integer.parseInt(txt_anoPublicacion.getText());
                idioma=jTextField_idioma.getText();
                editorial=jTextField_editorial.getText();

                sql="INSERT INTO libro(numero_serie,ISBM,Titulo,Numero_paguinas,Precio_ref,Año_publicacion,Idioma,Editorial,estado)VALUES(?,?,?,?,?,?,?,?,'disponible')";
                try {
                    PreparedStatement pst=reg.prepareStatement(sql);
                    try {
                        pst.setInt(1, n_deserie);
                        pst.setInt(2, isbn);
                        pst.setString(3, titulo);
                        pst.setInt(4, n_depaginas);
                        pst.setInt(5, precio_ref);
                        pst.setInt(6, ano_publicacion);
                        pst.setString(7, idioma);
                        pst.setString(8, editorial);

                        int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Agregados con éxito...");
                            this.jTextField_ndeserie.setText("");
                            this.jTextField_isbn.setText("");
                            this.jTextField_titulo.setText("");
                            this.jTextField_ndepaginas.setText("");
                            this.jTextField_prefioref.setText("");
                            this.txt_anoPublicacion.setText("");
                            this.jTextField_idioma.setText("");
                            this.jTextField_editorial.setText("");

                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "N° de Serie ya existe");
                        /*stmt = reg.prepareStatement("UPDATE libro SET numero_serie = numero_serie + 1 WHERE numero_serie ="+this.jTextField_ndeserie.getText());*/
                        stmt.executeUpdate();
                        this.jTextField_ndeserie.setText("");
                    }

                } catch (SQLException e) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Inválido");

        }
               cargarLibro();
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void txt_anoPublicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anoPublicacionKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (txt_anoPublicacion.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_txt_anoPublicacionKeyTyped

    private void jTextField_prefiorefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_prefiorefKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        } 
         if (jTextField_ndeserie.getText().length()== 6)

        evt.consume();
    }//GEN-LAST:event_jTextField_prefiorefKeyTyped

    private void jTextField_ndepaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ndepaginasKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_ndeserie.getText().length()== 5)

        evt.consume();
    }//GEN-LAST:event_jTextField_ndepaginasKeyTyped

    private void jTextField_isbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_isbnKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jTextField_isbnKeyTyped

    private void jTextField_ndeserieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ndeserieKeyTyped

        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_ndeserie.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_jTextField_ndeserieKeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField_tituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tituloKeyTyped
 if (jTextField_ndeserie.getText().length()== 50)

        evt.consume();
    }//GEN-LAST:event_jTextField_tituloKeyTyped

    private void jTextField_idiomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_idiomaKeyTyped
 if (jTextField_ndeserie.getText().length()== 15)

        evt.consume();
    }//GEN-LAST:event_jTextField_idiomaKeyTyped

    private void jTextField_editorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_editorialKeyTyped
       if (jTextField_ndeserie.getText().length()== 15)

        evt.consume();
    }//GEN-LAST:event_jTextField_editorialKeyTyped

    private void cbo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_clienteActionPerformed
    if(cbo_cliente.getSelectedIndex()!=0){
           
        
            try {

                String sql="SELECT * FROM cliente WHERE rut='"+cbo_cliente.getSelectedItem().toString()+"';";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql); 

                rs.next();
                lb_nombreCliente.setText(rs.getString("nombre")+" "+rs.getString("apellido_p")+" "+rs.getString("apellido_m"));

            } catch (Exception e) {
               // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }
    }else{
                     lb_nombreCliente.setText("______________________________");
    }
        
    }//GEN-LAST:event_cbo_clienteActionPerformed

    private void cbo_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_trabajadorActionPerformed
        if(cbo_trabajador.getSelectedIndex()==0){
            lb_nombreTrabajador.setText("______________________________");
        }else{
            try {

                String sql="SELECT * FROM trabajadores WHERE rut_trabajador='"+cbo_trabajador.getSelectedItem().toString()+"';";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql); 

                rs.next();
                lb_nombreTrabajador.setText(rs.getString("nombre")+" "+rs.getString("apellido_p")+" "+rs.getString("apellido_m"));

            } catch (Exception e) {
             //   JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }
        }
    }//GEN-LAST:event_cbo_trabajadorActionPerformed

    private void lb_nombreTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lb_nombreTrabajadorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_nombreTrabajadorKeyTyped

    private void jTabbedPane6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane6FocusGained

    }//GEN-LAST:event_jTabbedPane6FocusGained

    private void txt_valorAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorAKeyTyped
     char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txt_valorAKeyTyped

    private void dias_retrasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias_retrasoKeyTyped

        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }

    }//GEN-LAST:event_dias_retrasoKeyTyped

    private void dias_retrasoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias_retrasoKeyReleased
        if(dias_retraso.getText()==" "){
            dias_retraso.setText("0000");
        }else{
            int numero=Integer.parseInt(dias_retraso.getText())*(Integer.parseInt(lb_valorArriendo.getText())/4);
            lb_multa.setText(""+numero);
            lb_costoTotal.setText(Integer.parseInt(lb_valorArriendo.getText())+numero+"");
        }
    }//GEN-LAST:event_dias_retrasoKeyReleased

    private void cbo_ArriendoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ArriendoLibroActionPerformed
        if(cbo_ArriendoLibro.getSelectedIndex()==0){
            lb_tituloDEV.setText("______________________________");
        }else{
            try {

                String sql="SELECT * FROM libro where numero_serie="+Integer.parseInt(cbo_ArriendoLibro.getSelectedItem().toString())+";";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
                rs.next();
                lb_tituloDEV.setText(rs.getString("Titulo"));

            } catch (Exception e) {
                // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }

        }
        if(cbo_ArriendoLibro.getSelectedIndex()==0){
            lb_fechaDVl.setText("0000-00-00");
        }else{
            try {

                String sql="SELECT * FROM arriendo where numero_serie="+Integer.parseInt(cbo_ArriendoLibro.getSelectedItem().toString())+";";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
                rs.next();
                lb_fechaDVl.setText(rs.getString("fecha_estimada_dev"));
                 lb_valorArriendo.setText(rs.getString("Valor_arriendo"));

            } catch (Exception e) {
                // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");
            }

        }

    }//GEN-LAST:event_cbo_ArriendoLibroActionPerformed

    private void cbo_arriendoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_arriendoCActionPerformed
        try {
            cbo_ArriendoLibro.removeAllItems();
            String sql="SELECT * FROM  arriendo where rut='"+cbo_arriendoC.getSelectedItem().toString() +"';";
            con=cl.getConnection();
            smt= con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            cbo_ArriendoLibro.addItem("Seleccionar");
            while(rs.next()) {
                cbo_ArriendoLibro.addItem(rs.getString("numero_serie"));
            }
        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

        }

        if(cbo_arriendoC.getSelectedIndex()==0){
            lb_ClienteDEV.setText("______________________________");
            this.txt_anoA.setText("");
           this.txt_anoE.setText("");
           this.txt_mesA.setText("");
          this.txt_mesE.setText("");
          this.txt_diaA.setText("");
          this.txt_diaE.setText("");
          this.txt_valorA.setText("");
            
        }else{
            try {

                String sql="SELECT * FROM cliente ";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
                rs.next();
                lb_ClienteDEV.setText(rs.getString("nombre")+" "+rs.getString("apellido_p")+" "+rs.getString("apellido_m"));

            } catch (Exception e) {
                // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }

        }

    }//GEN-LAST:event_cbo_arriendoCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
          try {
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String id ,sql;
            int numserie,diadevolucion,mesdevolucion, anodevolucion,multa, preciototal,diasretraso;
            boolean a=true;
              if (this.cbo_arriendoC.getSelectedIndex()== 0){
                JOptionPane.showMessageDialog(null, "Seleccione Un cliente");
                a=false;
                
            }
                if (this.cbo_ArriendoLibro.getSelectedIndex()== 0){
                JOptionPane.showMessageDialog(null, "Seleccione Un libro");
                a=false;
                
            }
            if ("".equals(this.dias_dev.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese dia valido");
                a=false;
                this.dias_dev.setText("");
            }
            if("".equals(this.mes_dev.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese mes Valido");
                a=false;
                this.mes_dev.setText("");
            }
            if("".equals(this.ano_dev.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Año Valido");
                a=false;
                this.ano_dev.setText("");
            }
            if ("".equals(this.dias_retraso.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese los dias de retrazo    ");
                a=false;
                this.dias_retraso.setText("");
            }
          
            
            if (a==true) {
                id=cbo_arriendoC.getSelectedItem().toString();
                diadevolucion=Integer.parseInt(dias_dev.getText());
                mesdevolucion=Integer.parseInt(mes_dev.getText());
                anodevolucion=Integer.parseInt(ano_dev.getText());
                diasretraso=Integer.parseInt(dias_retraso.getText());
                multa=Integer.parseInt(lb_multa.getText());
                preciototal=Integer.parseInt(lb_costoTotal.getText());
                 numserie=Integer.parseInt(cbo_ArriendoLibro.getSelectedItem().toString());
                
            sql="UPDATE arriendo SET  fecha_entrega = '"+anodevolucion+"-"+mesdevolucion+"-"+diadevolucion+"', dias_retraso = '"+diasretraso +"', multa = '"+multa+"', costo_total = '"+preciototal+"' WHERE rut ='"+id+"' and numero_serie='"+numserie+"';";
              PreparedStatement pst=reg.prepareStatement(sql);
             int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Agregados con éxito...");
                            cbo_ArriendoLibro.setSelectedIndex(0);
                            cbo_arriendoC.setSelectedIndex(0);
                            dias_dev.setText("");
                            mes_dev.setText("");
                            ano_dev.setText("");
                            dias_retraso.setText("");
                            lb_multa.setText("");
                            lb_valorArriendo.setText("");
                            lb_costoTotal.setText("");
                        }
                    
            }
        } 
          catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Inválido");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_diaAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diaAKeyTyped
 char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (txt_diaA.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_txt_diaAKeyTyped

    private void txt_mesAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesAKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (txt_mesA.getText().length()==2)

        evt.consume();
    }//GEN-LAST:event_txt_mesAKeyTyped

    private void txt_anoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anoAKeyTyped
         char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (txt_anoA.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_txt_anoAKeyTyped

    private void dias_devKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias_devKeyTyped
                char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (dias_dev.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_dias_devKeyTyped

    private void mes_devKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes_devKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (mes_dev.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_mes_devKeyTyped

    private void ano_devKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ano_devKeyTyped
               char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (ano_dev.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_ano_devKeyTyped

    private void jTextField_diaclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_diaclienteKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_diacliente.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_jTextField_diaclienteKeyTyped

    private void jTextField_mesclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mesclienteKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_mescliente.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_jTextField_mesclienteKeyTyped

    private void jTextField_anoclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_anoclienteKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_anocliente.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_jTextField_anoclienteKeyTyped

    private void jTextField_contrato_diaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_contrato_diaKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_contrato_dia.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_jTextField_contrato_diaKeyTyped

    private void jTextField_contrato_mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_contrato_mesKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_contrato_mes.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_jTextField_contrato_mesKeyTyped

    private void jTextField_contrato_anoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_contrato_anoKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_contrato_ano.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_jTextField_contrato_anoKeyTyped

    private void jTextField_dia_ventasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_dia_ventasKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_dia_ventas.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_jTextField_dia_ventasKeyTyped

    private void jTextField_mes_ventasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mes_ventasKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_mes_ventas.getText().length()== 2)

        evt.consume();
    }//GEN-LAST:event_jTextField_mes_ventasKeyTyped

    private void jTextField_ano_ventasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ano_ventasKeyTyped
char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
        {
            evt.consume();  // ignorar el evento de teclado
        }
        if (jTextField_ano_ventas.getText().length()== 4)

        evt.consume();
    }//GEN-LAST:event_jTextField_ano_ventasKeyTyped

    private void jButton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editarActionPerformed
try {
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();

            int numero_serie,numero_serie2,ISBM,Numero_paguinas,Precio_ref,Año_publicacion;
            String Titulo,Idioma,Editorial,estado, sql;
            boolean a=true;
                             
            if ("".equals(this.jTextField_ndeserie.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Numero de serie valido");
                a=false;
                this.dias_dev.setText("");
            }
            if("".equals(this.jTextField_isbn.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese ISBN Valido");
                a=false;
                this.mes_dev.setText("");
            }
            if("".equals(this.jTextField_titulo.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Titulo Valido");
                a=false;
                this.ano_dev.setText("");
            }
            if ("".equals(this.jTextField_ndepaginas.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Numero de Paginas Valido");
                a=false;
                this.dias_retraso.setText("");
            }
             if ("".equals(this.jTextField_prefioref.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Precio Referencial");
                a=false;
                this.dias_retraso.setText("");
            }
              if ("".equals(this.txt_anoPublicacion.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Año de Publicacion ");
                a=false;
                this.dias_retraso.setText("");
            }
               if ("".equals(this.jTextField_idioma.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Idioma");
                a=false;
                this.dias_retraso.setText("");
            }
                   if ("".equals(this.jTextField_editorial.getText())){
                JOptionPane.showMessageDialog(null, "Ingrese Editorial");
                a=false;
                this.dias_retraso.setText("");
            }
          
            
            if (a==true) {
                numero_serie=Integer.parseInt(jTextField_ndeserie.getText());
                numero_serie2=Integer.parseInt(cbo_id_libro.getSelectedItem().toString());
                ISBM=Integer.parseInt(jTextField_isbn.getText());
                Numero_paguinas=Integer.parseInt(jTextField_ndepaginas.getText());
                Precio_ref=Integer.parseInt(jTextField_prefioref.getText());
                Año_publicacion=Integer.parseInt(txt_anoPublicacion.getText());
                Titulo=jTextField_titulo.getText();
                Idioma=jTextField_idioma.getText();
                Editorial=jTextField_editorial.getText();
                estado=jTextField_editorial.getText();
                
            sql="UPDATE libro SET numero_serie = '"+numero_serie+"', ISBM = '"+ISBM+"', Titulo = '"+Titulo+"', Numero_paguinas = '"+numero_serie+"', Precio_ref = '"+Precio_ref+"', Año_publicacion = '"+Año_publicacion+"', Idioma = '"+Idioma+"', Editorial = '"+Editorial+"', estado = '"+estado+"' WHERE numero_serie = "+numero_serie2+";";
              PreparedStatement pst=reg.prepareStatement(sql);
             int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Editado con éxito...");
                cbo_id_libro.setSelectedIndex(0);
                jTextField_ndeserie.setText("");
                jTextField_isbn.setText("");
                jTextField_titulo.setText("");
                jTextField_ndepaginas.setText("");
                jTextField_prefioref.setText("");               
                txt_anoPublicacion.setText("");
                jTextField_idioma.setText("");
                jTextField_editorial.setText(""); 
                jButton_Registrar.setVisible(true);
                        }
                    
            }
        } 
          catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Inválido");

        }
        
        
        
        
    }//GEN-LAST:event_jButton_editarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
                cbo_id_libro.setSelectedIndex(0);
                jTextField_ndeserie.setText("");
                jTextField_isbn.setText("");
                jTextField_titulo.setText("");
                jTextField_ndepaginas.setText("");
                jTextField_prefioref.setText("");               
                txt_anoPublicacion.setText("");
                jTextField_idioma.setText("");
                jTextField_editorial.setText(""); 
                jButton_Registrar.setVisible(true);
                btn_Eliminar.setVisible(false);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void cbo_id_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_id_libroActionPerformed
       Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
   
        if(cbo_id_libro.getSelectedIndex()== 0){
           jTextField_ndeserie.setText("");
                jTextField_isbn.setText("");
                jTextField_titulo.setText("");
                jTextField_ndepaginas.setText("");
                jTextField_prefioref.setText("");               
                txt_anoPublicacion.setText("");
                jTextField_idioma.setText("");
                jTextField_editorial.setText("");
                jButton_editar.setVisible(false);
                 btn_Eliminar.setVisible(false);
                 jTextField_ndeserie.setEditable(true);
                 jButton_Registrar.setVisible(true);
        }else{
            try {
            jButton_editar.setVisible(true);
            jButton_Registrar.setVisible(false);
            btn_Eliminar.setVisible(true);
                String sql="SELECT * FROM libro WHERE numero_serie='"+Integer.parseInt(cbo_id_libro.getSelectedItem().toString())+"';";
                con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
                rs.next();
                jTextField_ndeserie.setText(rs.getString("numero_serie"));
                jTextField_isbn.setText(rs.getString("ISBM"));
                jTextField_titulo.setText(rs.getString("Titulo"));
                jTextField_ndepaginas.setText(rs.getString("Numero_paguinas"));
                jTextField_prefioref.setText(rs.getString("Precio_ref"));
                txt_anoPublicacion.setText(rs.getString("Año_publicacion"));
                jTextField_idioma.setText(rs.getString("Idioma"));
                jTextField_editorial.setText(rs.getString("Editorial")); 
                jTextField_ndeserie.setEditable(false);
            } catch (Exception e) {
               // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }
        }
    }//GEN-LAST:event_cbo_id_libroActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
            Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String Cadsql;
              Cadsql="DELETE FROM libro WHERE numero_serie = "+cbo_id_libro.getSelectedItem().toString()+";";
               try {
                    PreparedStatement pst=reg.prepareStatement(Cadsql);
                    try {
                      int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "Datos Eliminados...");
                cbo_id_libro.setSelectedIndex(0);
                jTextField_ndeserie.setText("");
                jTextField_isbn.setText("");
                jTextField_titulo.setText("");
                jTextField_ndepaginas.setText("");
                jTextField_prefioref.setText("");               
                txt_anoPublicacion.setText("");
                jTextField_idioma.setText("");
                jTextField_editorial.setText(""); 
                cargarLibro2();
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "no se a podido eliminar");
                        /*stmt = reg.prepareStatement("UPDATE libro SET numero_serie = numero_serie + 1 WHERE numero_serie ="+this.jTextField_ndeserie.getText());*/
                        stmt.executeUpdate();
                        
                        
                    }

                } catch (SQLException e) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                }
                
            
            
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void jTabbedPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane6MouseClicked
         cargarLibro4();  
         cargarAcliente();
         cargarCliente();
            cargarECliente();
         cargarVCliente();
         cargarLibro();
         cargarLibro2();
         cargarLibro3();
         cargarTrabajador();
         cargarTrabajador2();
         cargarDistribuidor();
    }//GEN-LAST:event_jTabbedPane6MouseClicked

    private void rd_DepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_DepositoActionPerformed

    }//GEN-LAST:event_rd_DepositoActionPerformed

    private void btn_EliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarCActionPerformed
  Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
            String Cadsql;
              Cadsql="DELETE FROM cliente WHERE rut = '"+cbo_ECliente.getSelectedItem().toString()+"';";
               try {
                    PreparedStatement pst=reg.prepareStatement(Cadsql);
                    try {
                      int i;
                        i=pst.executeUpdate();
                        if (i>0) {
                            JOptionPane.showMessageDialog(null, "cliente  Eliminados...");
                                   this.jTextField_rutcliente.setText("");
                            this.jTextField_DVC.setText("");
                            this.jTextField_nombrecliente.setText("");
                            this.jTextField_apellidoclientepaterno.setText("");
                            this.jTextField_apellidoclientematerno.setText("");

                            this.jTextField_anocliente.setText("");
                            this.jTextField_mescliente.setText("");
                            this.jTextField_diacliente.setText("");
        
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "no se a podido eliminar");
                         JOptionPane.showMessageDialog(null, "cliente Con Arriendo Vigente");
                        
                        stmt.executeUpdate();
                        
                        
                    }

                } catch (SQLException e) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                }
                cargarECliente();
            
    }//GEN-LAST:event_btn_EliminarCActionPerformed

    private void cbo_EClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_EClienteActionPerformed
 Conectar cl=new Conectar();
            Connection reg=cl.getConnection();
   
        if(cbo_ECliente.getSelectedIndex()== 0){
              this.jTextField_nombrecliente.setText("");
                            this.jTextField_apellidoclientepaterno.setText("");
                            this.jTextField_apellidoclientematerno.setText("");
                            btn_EliminarC.setVisible(false);
     
        }else{
            try {
             btn_EliminarC.setVisible(true);
                String sql="SELECT nombre,apellido_p, apellido_m FROM cliente WHERE rut='"+cbo_ECliente.getSelectedItem().toString()+"';";
                 con=cl.getConnection();
                smt= con.createStatement();
                ResultSet rs = smt.executeQuery(sql);
                rs.next();
                    jTextField_nombrecliente.setText(rs.getString("nombre"));
                 jTextField_apellidoclientepaterno.setText(rs.getString("apellido_p"));
                  jTextField_apellidoclientematerno.setText(rs.getString("apellido_m"));
           
            } catch (Exception e) {
               // JOptionPane.showMessageDialog(null,"Error al extraer los datos.");

            }
        }
    }//GEN-LAST:event_cbo_EClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano_dev;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_EliminarC;
    private javax.swing.JButton btn_arrendaLibro;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_venta;
    private javax.swing.JButton bton_registrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbo_ArriendoLibro;
    private javax.swing.JComboBox<String> cbo_ECliente;
    private javax.swing.JComboBox<String> cbo_LibroC;
    private javax.swing.JComboBox<String> cbo_VLCliente;
    private javax.swing.JComboBox<String> cbo_arriendoC;
    private javax.swing.JComboBox<String> cbo_cliente;
    private javax.swing.JComboBox<String> cbo_empresa;
    private javax.swing.JComboBox<String> cbo_id_libro;
    private javax.swing.JComboBox<String> cbo_libroA;
    private javax.swing.JComboBox<String> cbo_trabajador;
    private javax.swing.JComboBox<String> cbo_ventaLibro;
    private javax.swing.JComboBox<String> cbo_vtrabajador;
    private javax.swing.JTextField dias_dev;
    private javax.swing.JTextField dias_retraso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JButton jButton_editar;
    private javax.swing.JButton jButton_registrarempresa;
    private javax.swing.JButton jButton_registrocliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField1_DVT;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_DVC;
    private javax.swing.JTextField jTextField_ano_ventas;
    private javax.swing.JTextField jTextField_anocliente;
    private javax.swing.JTextField jTextField_apellido_materno;
    private javax.swing.JTextField jTextField_apellido_paterno;
    private javax.swing.JTextField jTextField_apellidoclientematerno;
    private javax.swing.JTextField jTextField_apellidoclientepaterno;
    private javax.swing.JTextField jTextField_contrato_ano;
    private javax.swing.JTextField jTextField_contrato_dia;
    private javax.swing.JTextField jTextField_contrato_mes;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_dia_ventas;
    private javax.swing.JTextField jTextField_diacliente;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_direccionempresa;
    private javax.swing.JTextField jTextField_editorial;
    private javax.swing.JTextField jTextField_idioma;
    private javax.swing.JTextField jTextField_isbn;
    private javax.swing.JTextField jTextField_mes_ventas;
    private javax.swing.JTextField jTextField_mescliente;
    private javax.swing.JTextField jTextField_ndepaginas;
    private javax.swing.JTextField jTextField_ndeserie;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_nombrecliente;
    private javax.swing.JTextField jTextField_nombreempresa;
    private javax.swing.JTextField jTextField_prefioref;
    private javax.swing.JTextField jTextField_rut1;
    private javax.swing.JTextField jTextField_rutcliente;
    private javax.swing.JTextField jTextField_rutempresa;
    private javax.swing.JTextField jTextField_telefono;
    private javax.swing.JTextField jTextField_telefonoempresa;
    private javax.swing.JTextField jTextField_titulo;
    private javax.swing.JLabel lb_ClienteDEV;
    private javax.swing.JLabel lb_costoTotal;
    private javax.swing.JLabel lb_fechaDVl;
    private javax.swing.JLabel lb_multa;
    private javax.swing.JLabel lb_nombreCliente;
    private javax.swing.JLabel lb_nombreTrabajador;
    private javax.swing.JLabel lb_tituloArriendo;
    private javax.swing.JLabel lb_tituloDEV;
    private javax.swing.JLabel lb_valorArriendo;
    private javax.swing.JTextField mes_dev;
    private javax.swing.JRadioButton rd_Deposito;
    private javax.swing.JRadioButton rd_efectivo;
    private javax.swing.JTextField txt_DV;
    private javax.swing.JTextField txt_anoA;
    private javax.swing.JTextField txt_anoE;
    private javax.swing.JTextField txt_anoPublicacion;
    private javax.swing.JTextField txt_diaA;
    private javax.swing.JTextField txt_diaE;
    private javax.swing.JTextField txt_fechaVenta;
    private javax.swing.JTextField txt_horaVenta;
    private javax.swing.JTextField txt_mesA;
    private javax.swing.JTextField txt_mesE;
    private javax.swing.JTextField txt_pmi;
    private javax.swing.JTextField txt_vPneto;
    private javax.swing.JTextField txt_valorA;
    private javax.swing.JTextField txt_vcIva;
    // End of variables declaration//GEN-END:variables

    

   
}
