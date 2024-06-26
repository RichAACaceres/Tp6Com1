/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp6com1.vistas;

import java.util.TreeSet;
import tp6com1.entidades.Producto;

/**
 *
 * @author esteb
 */
public class Menu extends javax.swing.JFrame {
public static TreeSet<Producto> productos=new TreeSet<>();

    public static TreeSet<Producto>getProductos() {
        return productos;
    }
    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        busquedaPorRubro = new javax.swing.JMenuItem();
        busquedaPorNombre = new javax.swing.JMenuItem();
        busquedaPorPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setPreferredSize(new java.awt.Dimension(500, 458));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp6com1/imagenes/super.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 688, 460));

        jMenu1.setText("Administracion");

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("consultas");

        busquedaPorRubro.setText("Por rubro");
        busquedaPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaPorRubroActionPerformed(evt);
            }
        });
        jMenu2.add(busquedaPorRubro);

        busquedaPorNombre.setText("Por nombre");
        busquedaPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaPorNombreActionPerformed(evt);
            }
        });
        jMenu2.add(busquedaPorNombre);

        busquedaPorPrecio.setText("Por precio");
        busquedaPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaPorPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(busquedaPorPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionProducto gp=new GestionProducto(productos);
        gp.setVisible(true);
        escritorio.add(gp);
        escritorio.moveToFront(gp);
    }//GEN-LAST:event_jmiProductosActionPerformed

    private void busquedaPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaPorNombreActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorNombre bPn=new BusquedaPorNombre(productos);
        bPn.setVisible(true);
        escritorio.add(bPn);
        escritorio.moveToFront(bPn);
    }//GEN-LAST:event_busquedaPorNombreActionPerformed

    private void busquedaPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaPorRubroActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       BusquedaPorRubro bpr=new BusquedaPorRubro(productos);
       escritorio.add(bpr);
    bpr.setVisible(true);
       escritorio.moveToFront(bpr);
    }//GEN-LAST:event_busquedaPorRubroActionPerformed

    private void busquedaPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaPorPrecioActionPerformed
          escritorio.removeAll();
       escritorio.repaint();
       BusquedaPorPrecio bpp=new BusquedaPorPrecio(productos);
       escritorio.add(bpp);
    bpp.setVisible(true);
       escritorio.moveToFront(bpp);
       
    }//GEN-LAST:event_busquedaPorPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem busquedaPorNombre;
    private javax.swing.JMenuItem busquedaPorPrecio;
    private javax.swing.JMenuItem busquedaPorRubro;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiProductos;
    // End of variables declaration//GEN-END:variables
}
