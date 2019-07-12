/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidades.Cliente;
import entidades.Empleado;
import entidades.Sucursal;
import entidades.cuenta.RealCuenta;
import entidades.moneda.*;
import entidades.movimiento.Movimiento;
import logica.Flogica;
import java.sql.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author adriana
 */
public class FormCrearCuenta extends javax.swing.JFrame {

    private Date date_today;
    private boolean cliente_existe;
    private Empleado empleado;
    private Sucursal sucursal;

    /**
     * Creates new form formCrearCuenta
     */
    public FormCrearCuenta() {
        initComponents();
        GregorianCalendar fecha_actual = new GregorianCalendar();
        date_today = new Date(fecha_actual.get(GregorianCalendar.YEAR) - 1900,
                fecha_actual.get(GregorianCalendar.MONTH) - 1,
                fecha_actual.get(GregorianCalendar.DAY_OF_MONTH));
        cliente_existe = false;
    }

    public void set_Codigo_empleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbt_grupo_moneda = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txt_codigo_cuenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rbtSoles = new javax.swing.JRadioButton();
        rbtDolares = new javax.swing.JRadioButton();
        txtSaldo_inicial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtclave1 = new javax.swing.JPasswordField();
        txtclave2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbx_sucural = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Telefono:");

        jLabel9.setText("Email");

        jLabel1.setText("Codigo:");

        jLabel2.setText("Apellido Paterno:");

        txtCodigo_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo_clienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo_clienteKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("DNI:");

        jLabel6.setText("Ciudad:");

        jLabel7.setText("Direccion:");

        jLabel10.setText("Cuenta");

        rbt_grupo_moneda.add(rbtSoles);
        rbtSoles.setText("Soles");

        rbt_grupo_moneda.add(rbtDolares);
        rbtDolares.setText("Dolares");

        jLabel11.setText("Saldo inicial");

        jLabel12.setText("Clave:");

        jLabel13.setText("Datos de la cuenta");

        jLabel14.setText("Datos del cliente");
        jLabel14.setToolTipText("");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel15.setText("Sucursal");

        cbx_sucural.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sipan", "Chan Chan", "Los Olivos", "Pardo", "Misti", "MachuPicchu", "Crau", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigo_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtSoles)
                                        .addGap(49, 49, 49)
                                        .addComponent(rbtDolares))
                                    .addComponent(jLabel13))))
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_sucural, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSaldo_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtclave1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtclave2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60)
                                .addComponent(txtCodigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_codigo_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtSoles)
                                    .addComponent(rbtDolares))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSaldo_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_sucural, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtclave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtclave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigo_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo_clienteKeyTyped

    }//GEN-LAST:event_txtCodigo_clienteKeyTyped

    private void txtCodigo_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo_clienteKeyReleased
        System.out.println("preset");
        if (this.txtCodigo_cliente.getText().trim().length() == 5) {
            String codigo_cliente = this.txtCodigo_cliente.getText();
            Cliente cliente = Flogica.getInstance().getCliente(codigo_cliente);
            if (cliente != null) {
                this.initialize(cliente);
                this.activar(false);
                this.cliente_existe = true;
            } else {
                this.limpiar();
                this.activar(true);
                System.out.println("null");
            }
        } else {
            this.limpiar();
            this.activar(true);
        }
    }//GEN-LAST:event_txtCodigo_clienteKeyReleased

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Movimiento movimiento = new Movimiento();
        RealCuenta rcuenta = new RealCuenta();
        Cliente cliente = new Cliente();
        this.codigo_cuenta = this.txt_codigo_cuenta.getText();
        this.saldo_inicial = Double.parseDouble(this.txtSaldo_inicial.getText());
        this.clave1 = this.txtclave1.getText();
        this.clave2 = this.txtclave2.getText();
        Moneda moneda;
        if (this.rbtSoles.isSelected()) {
            moneda = new MonedaDirector(new Sol()).construir();
            System.out.println(moneda.toString());
        } else {
            moneda = new MonedaDirector(new Dolar()).construir();
            System.out.println(moneda.toString());
        }

        this.ciudad = this.txtCiudad.getText();
        this.codigo_cliente = this.txtCodigo_cliente.getText();
        this.direccion = this.txtDireccion.getText();
        this.dni = this.txtDni.getText();
        this.email = this.txtEmail.getText();
        this.apellido_materno = this.txtMaterno.getText();
        this.nombre = this.txtNombre.getText();
        this.apellido_paterno = this.txtPaterno.getText();
        this.telefono = this.txtTelefono.getText();

        if (clave1.compareTo(clave2) == 0 && this.cbx_sucural.getSelectedIndex() != 0) {
            //set de cliente
            this.sucursal = new Sucursal();
            this.sucursal.setCodigo("00" + String.valueOf(this.cbx_sucural.getSelectedIndex()));
            cliente.setCodigo(codigo_cliente);
            cliente.setPaterno(apellido_paterno);
            cliente.setMaterno(apellido_materno);
            cliente.setNombre(nombre);
            cliente.setDni(dni);
            cliente.setCiudad(ciudad);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            cliente.setEmail(email);
            //set de cuenta

            rcuenta.setCodigo(this.codigo_cuenta);
            rcuenta.setMoneda(moneda);
            rcuenta.setSucursal(this.sucursal);
            rcuenta.setCodigo_empleado(empleado.getCodigo());
            rcuenta.setCliente(cliente);
            rcuenta.setSaldo(saldo_inicial);
            rcuenta.setFecha_creacion(date_today);
            rcuenta.setCantida_movimiento(0);
            rcuenta.setClave(clave1);

            movimiento.setCuenta(rcuenta);
            movimiento.setNumero_movimiento(0);
            movimiento.setFecha(date_today);
            movimiento.setEmpleado(empleado);
            movimiento.setCodigo_tipo_movimiento("001");
            movimiento.setImporte(saldo_inicial);
        }
        if (this.cliente_existe) {
            mensaje = Flogica.getInstance().rcuenta_cexistente(rcuenta, movimiento);
        } else {
            mensaje = Flogica.getInstance().registrarCuenta(rcuenta, movimiento, cliente);
        }
        if (mensaje.compareTo("ok") == 0) {
            mensaje = "Datos guardados correctamente";
            this.limpiar();
            this.activar(true);
            this.txt_codigo_cuenta.setText(null);
            this.txtSaldo_inicial.setText(null);
            this.txtclave1.setText(null);
            this.txtclave2.setText(null);

        }
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta", 1);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void initialize(Cliente cliente) {
        this.txtCiudad.setText(cliente.getCiudad());
        this.txtDireccion.setText(cliente.getDireccion());
        this.txtDni.setText(cliente.getDni());
        this.txtEmail.setText(cliente.getEmail());
        this.txtMaterno.setText(cliente.getMaterno());
        this.txtNombre.setText(cliente.getNombre());
        this.txtPaterno.setText(cliente.getPaterno());
        this.txtTelefono.setText(cliente.getTelefono());
    }

    private void activar(boolean estado) {
        this.txtCiudad.setEnabled(estado);
        this.txtDireccion.setEnabled(estado);
        this.txtDni.setEnabled(estado);
        this.txtEmail.setEnabled(estado);
        this.txtMaterno.setEnabled(estado);
        this.txtNombre.setEnabled(estado);
        this.txtPaterno.setEnabled(estado);
        this.txtTelefono.setEnabled(estado);
    }

    private void limpiar() {
        this.txtCiudad.setText(null);
        this.txtDireccion.setText(null);
        this.txtDni.setText(null);
        this.txtEmail.setText(null);
        this.txtMaterno.setText(null);
        this.txtNombre.setText(null);
        this.txtPaterno.setText(null);
        this.txtTelefono.setText(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbx_sucural;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtDolares;
    private javax.swing.JRadioButton rbtSoles;
    private javax.swing.ButtonGroup rbt_grupo_moneda;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigo_cliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtSaldo_inicial;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_codigo_cuenta;
    private javax.swing.JPasswordField txtclave1;
    private javax.swing.JPasswordField txtclave2;
    // End of variables declaration//GEN-END:variables

    private String codigo_cliente;
    private String apellido_paterno;
    private String apellido_materno;
    private String nombre;
    private String dni;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;

    private String clave1;
    private String clave2;
    private String codigo_cuenta;
    private Double saldo_inicial;

    private String mensaje;

}
