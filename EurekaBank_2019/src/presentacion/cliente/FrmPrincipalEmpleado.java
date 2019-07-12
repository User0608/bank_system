/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.cliente;

import entidades.Empleado;
import entidades.ProxyCuenta;
import entidades.cuenta.RealCuenta;
import entidades.movimiento.Movimiento;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logica.Flogica;
import presentacion.FormCrearCuenta;

/**
 *
 * @author adriana
 */
public class FrmPrincipalEmpleado extends javax.swing.JFrame {

    private RealCuenta cuenta;
    private ProxyCuenta pcuenta;
    private ArrayList<Movimiento> movimientos;
    private JPanel panel_list_movimientos;
    private Empleado empleado;
    private FormCrearCuenta form_nueva_cuenta;

    /**
     * Creates new form frmPrincipalEmpleado
     */
    public FrmPrincipalEmpleado() {
        initComponents();
        this.ocultar_dato_cliente(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.txt_password.setText(null);
        this.txtCodigo_cuenta.setText(null);
        panel_list_movimientos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel_list_movimientos.setLayout(new BoxLayout(panel_list_movimientos, BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.form_nueva_cuenta = new FormCrearCuenta();
    }

    private void ocultar_dato_cliente(boolean flag) {
        this.txt_sado.setVisible(flag);
        this.lblSaldo.setVisible(flag);
        this.lbl_nombre_cliente.setVisible(flag);
        this.btn_close.setVisible(flag);
        this.lbl_sucursal_eti.setVisible(flag);
        this.lbl_sucursal.setVisible(flag);
        this.lbl_direcion.setVisible(flag);
    }

    private void reset_datos() {
        this.movimientos = null;
        this.cuenta = null;
        this.pcuenta = null;
        this.txt_sado.setText(null);
        this.lblSaldo.setText(null);
        this.lbl_nombre_cliente.setText(null);
        this.ocultar_dato_cliente(false);
        this.panel_list_movimientos.removeAll();
        this.txt_password.setText(null);
        this.txtCodigo_cuenta.setText(null);
    }

    public void set_datos_empleado(Empleado empleado) {
        this.empleado = empleado;       
        this.lblNombre_empleado.setText(empleado.getNombreCompleto());
        this.lbl_user.setText(empleado.getUsuario());
    }

    private void set_datos(ProxyCuenta pcuenta) {
        this.panel_list_movimientos.removeAll();
        this.pcuenta = pcuenta;
        this.cuenta = pcuenta.getCuenta();
        this.lbl_nombre_cliente.setText(cuenta.getCliente().getNombreCompleto());
        this.txt_sado.setText(cuenta.getSaldo() + " " + cuenta.getMoneda().getDescripcion());
        this.lbl_sucursal.setText(cuenta.getSucursal().getNombre());
        this.lbl_direcion.setText(cuenta.getSucursal().getCiudad());
        movimientos = cuenta.getMovimientos();
        Collections.reverse(movimientos);
        Iterator<Movimiento> itera = movimientos.iterator();
        while (itera.hasNext()) {
            Movimiento movimiento = itera.next();
            String tipo = Flogica.getInstance().getMovimiento_descripcion(movimiento.getCodigo_tipo_movimiento());

            String signo = (tipo.compareTo("Retiro") == 0) ? "-" : "+";

            panel_list_movimientos.add(new PanelMovimiento(movimiento.getFecha(), movimiento.getImporte(), tipo, signo));
        }
        this.scrolPanel.setViewportView(panel_list_movimientos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_sado = new javax.swing.JTextField();
        lbl_sucursal_eti = new javax.swing.JLabel();
        lbl_sucursal = new javax.swing.JLabel();
        lbl_direcion = new javax.swing.JLabel();
        panel_movimientos = new javax.swing.JPanel();
        scrolPanel = new javax.swing.JScrollPane();
        lbl_historiy = new javax.swing.JLabel();
        lbl_nombre_cliente = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lblNombre_empleado = new javax.swing.JLabel();
        txtCodigo_cuenta = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        lbl_user = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        item_deposito = new javax.swing.JMenuItem();
        item_retirar = new javax.swing.JMenuItem();
        item_new_cuenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(951, 538));

        txt_sado.setEditable(false);
        txt_sado.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txt_sado.setForeground(new java.awt.Color(255, 101, 0));
        txt_sado.setText("1000");

        lbl_sucursal_eti.setText("Sucursal:");

        lbl_sucursal.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl_sucursal.setForeground(new java.awt.Color(247, 17, 56));
        lbl_sucursal.setText("los olivos");
        lbl_sucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sucursalMouseClicked(evt);
            }
        });

        lbl_direcion.setText("Lima");

        lbl_historiy.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lbl_historiy.setText("Histoiral de movimientos");

        javax.swing.GroupLayout panel_movimientosLayout = new javax.swing.GroupLayout(panel_movimientos);
        panel_movimientos.setLayout(panel_movimientosLayout);
        panel_movimientosLayout.setHorizontalGroup(
            panel_movimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_movimientosLayout.createSequentialGroup()
                .addComponent(lbl_historiy)
                .addGap(0, 42, Short.MAX_VALUE))
            .addComponent(scrolPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel_movimientosLayout.setVerticalGroup(
            panel_movimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_movimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_historiy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
        );

        lbl_nombre_cliente.setText("txtNombre_cliente");

        lblSaldo.setForeground(new java.awt.Color(146, 146, 146));
        lblSaldo.setText("Saldo:");

        txt_password.setText("jPasswordField1");

        lblNombre_empleado.setText("lblNombre_empleado");

        txtCodigo_cuenta.setText("jTextField1");

        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_close.setText("close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        lbl_user.setForeground(new java.awt.Color(236, 36, 26));
        lbl_user.setText("jLabel3");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");

        item_deposito.setText("Depositar");
        jMenu2.add(item_deposito);

        item_retirar.setText("Retirar");
        jMenu2.add(item_retirar);

        item_new_cuenta.setText("Nueva cuenta");
        item_new_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_new_cuentaActionPerformed(evt);
            }
        });
        jMenu2.add(item_new_cuenta);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSaldo)
                                .addComponent(txt_sado, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCodigo_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sucursal_eti)
                            .addComponent(lbl_direcion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panel_movimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_movimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_sucursal_eti)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre_empleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_direcion)
                            .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCodigo_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close)
                .addGap(282, 282, 282))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_sucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sucursalMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, cuenta.getSucursal().getDireccion(), "Direcion Sucursal", 1);
    }//GEN-LAST:event_lbl_sucursalMouseClicked

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        this.onClickLogin();

    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.reset_datos();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void item_new_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_new_cuentaActionPerformed
           this.form_nueva_cuenta.set_Codigo_empleado(this.empleado);
           this.form_nueva_cuenta.setVisible(true);
           this.form_nueva_cuenta.setLocationRelativeTo(this);
    }//GEN-LAST:event_item_new_cuentaActionPerformed

    private void onClickLogin() {
        String acc = this.txtCodigo_cuenta.getText();
        String pws = this.txt_password.getText();
        ProxyCuenta pcuenta = new ProxyCuenta();
        RealCuenta rcuenta = pcuenta.validar_datos_cuenta(acc, pws);
        if (rcuenta != null) {
            this.set_datos(pcuenta);
            this.ocultar_dato_cliente(true);
        } else {
            JOptionPane.showMessageDialog(this, "Error, datos incorrectos", "Error", 0);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_ok;
    private javax.swing.JMenuItem item_deposito;
    private javax.swing.JMenuItem item_new_cuenta;
    private javax.swing.JMenuItem item_retirar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblNombre_empleado;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lbl_direcion;
    private javax.swing.JLabel lbl_historiy;
    private javax.swing.JLabel lbl_nombre_cliente;
    private javax.swing.JLabel lbl_sucursal;
    private javax.swing.JLabel lbl_sucursal_eti;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPanel panel_movimientos;
    private javax.swing.JScrollPane scrolPanel;
    private javax.swing.JTextField txtCodigo_cuenta;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_sado;
    // End of variables declaration//GEN-END:variables
}
