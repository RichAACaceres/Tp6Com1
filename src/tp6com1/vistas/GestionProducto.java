/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6com1.vistas;

import java.util.TreeSet;
import javax.swing.JOptionPane;
import tp6com1.entidades.Categoria;
import tp6com1.entidades.Producto;

/**
 *
 * @author ST-P
 */
public class GestionProducto extends javax.swing.JInternalFrame {
private TreeSet<Producto> productos;
private Producto auxiliar;
    /**
     * Creates new form GestionProducto
     */
    public GestionProducto(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        cargarProductos();
        llenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcProducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestión de productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Rubro");

        jcProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Stock");

        jbNuevo.setBackground(new java.awt.Color(0, 255, 255));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(0, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(0, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(0, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(0, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp6com1/imagenes/Lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE)
                                    .addComponent(jtStock, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int resp=JOptionPane.showConfirmDialog(this,"Desea Eliminar",
                "Confirmacion",JOptionPane.YES_NO_OPTION);
        if(resp==JOptionPane.YES_OPTION){
            productos.remove(auxiliar);
            JOptionPane.showMessageDialog(this,"Producto Eliminado");
            limpiar();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jcProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcProductoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        int codigo;
        double precio;
        int stock;
        
        try{
               codigo=Integer.parseInt(jtCodigo.getText());
   
        }catch(Exception ex){
        
            JOptionPane.showMessageDialog(this,"Este coódigo debe ser un nro entero");
            jtCodigo.setText("");
            jtCodigo.requestFocus();
            return;
        }
          
        try{
        
            precio=Double.parseDouble(jtPrecio.getText());
            
        }catch(Exception ex){
        
            JOptionPane.showMessageDialog(this,"El precio debe ser un nro");
            jtPrecio.setText("");
            jtPrecio.requestFocus();
            return;
        }
        try{
        
            stock=Integer.parseInt(jtStock.getText());
            
        }catch(Exception ex){
        
            JOptionPane.showMessageDialog(this,"El stock debe ser un nro entero");
            jtStock.setText("");
            jtStock.requestFocus();
            return;
        }
        
        String descripcion=jtDescripcion.getText();
        Categoria categoria=(Categoria)jcProducto.getSelectedItem();
        Producto prodAGuardar=new Producto(codigo,descripcion,precio,stock,categoria);
        if(productos.add(prodAGuardar)){
        
            JOptionPane.showMessageDialog(this, "Producto Guardado");
        }else{
        
            JOptionPane.showMessageDialog(this, "Ya existe un prod. con ese código");
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        jbEliminar.setEnabled(false);
      jtCodigo.setText("");
      jtDescripcion.setText("");
      jtPrecio.setText("");
      jtStock.setText("");
      jcProducto.setSelectedIndex(0);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try{
            int codigo=Integer.parseInt(jtCodigo.getText());
            for(Producto prod:productos){
           
                if(prod.getCodigo()==codigo){
                
                    jtDescripcion.setText(prod.getDescripcion());
                    jtPrecio.setText(prod.getPrecio()+"");
                    jtStock.setText(prod.getStock()+"");
                    jcProducto.setSelectedItem(prod.getCategoria());
                    auxiliar=prod;
                    jbEliminar.setEnabled(true);
                    return;
                }
            }
            JOptionPane.showMessageDialog(this,"Producto inexistente");
            
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(this,"Debe ingresar un nro entero");
            jtCodigo.setText("");
            jtCodigo.requestFocus();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void llenarCombo(){
    
        Categoria limpieza=new Categoria(1,"Limpieza");
        Categoria comestible=new Categoria(2,"Comestible");
        Categoria perfumeria=new Categoria(3,"Perfumeria");
        
        jcProducto.addItem(limpieza);
        jcProducto.addItem(comestible);
        jcProducto.addItem(perfumeria);
        
    }
    
    private void limpiar(){
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jbEliminar.setEnabled(false);
    }
    private void cargarProductos(){
    Producto arroz=new Producto(1,"Arroz",899.99,77,new Categoria(2,"Comestible"));
     Producto manteca=new Producto(2,"Manteca",699.99,44,new Categoria(2,"Comestible"));
      Producto limpiaPisos=new Producto(3,"Brilla pisos",59.99,100,new Categoria(1,"Limpieza"));
       Producto paco=new Producto(4,"Perfume paco",999.99,42,new Categoria(3,"Perfumeria"));
        Producto cepillo=new Producto(5,"Cepillo de dientes",599.99,32,new Categoria(1,"Limpieza"));
         Producto chayanne=new Producto(6,"Perfume chayanne",1500.99,5,new Categoria(3,"Perfumeria"));
         productos.add(arroz);
          productos.add(manteca);
           productos.add(limpiaPisos);
            productos.add(paco);
             productos.add(cepillo);
              productos.add(chayanne);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Categoria> jcProducto;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
