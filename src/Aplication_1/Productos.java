
package Aplication_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author danielmora
 */
public class Productos extends javax.swing.JFrame {
                                                 // Creamos variables de tipo locales para conectar la base de datos 
    public static final String URL = "jdbc:mysql://localhost:8889/facturacion"; // la ubicacion o direccion de mi base de datos y puerto 
    public static final String usuario="root"; // idicamos cual es nuestro usuario para acceder a la base de datos
    public static final String contraseña="root";// indicamos cual es nuestra contraseña para acceder a la base de datos 
    PreparedStatement ps; // para poder hacer consultas en mi base de datos debemos utilizar la variable
    ResultSet rs;
    
    
    public Productos() {
        initComponents();
        cajaID.setVisible(false); // hacemos Invisible la caja id para que no se muestra al momento de correr el programa 
        
        setLocationRelativeTo(null);
    }
    
    
    public Connection getConnection(){ // creamos un metodo tipo conexion nos  retorna una conexion
    
        Connection conexion=null;  // creamos una variable de tipo conexion para lograr conctar la base de datos 
        
        // utilizamos un try - catch para captural los errores o ecepciones en la conccion de base de datos 
    
        try{ // dentro del try establecemos la conexion 
            Class.forName("com.mysql.jdbc.Driver");
           conexion=(Connection)DriverManager.getConnection(URL,usuario,contraseña);// guardamos la conexion en la variable conexion 
            
        
        }
        catch(Exception ex){ // con la variable Exception ex capturamos cualquier exepcion
            System.err.println("Eroor ,"+ex); // Mostramos un mensaje que existio una ecpcion o error
            // atajo de teclado serr + tab  
            
        }
        
        return conexion;// retornamos la coneccion
    }
    
    public void limpiarCajas(){ // metodo para vaciar los registros 
        
        
        cajaBuscar.setText(null);
        cajaCodigo.setText(null);
        cajaNombrePro.setText(null);
        cajaExistencia.setText(null);
        cajaPrecio.setText(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaNombrePro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaExistencia = new javax.swing.JTextField();
        cajaPrecio = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        cajaID = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonVaciar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Productos");

        jLabel2.setText("Nombre-Producto");

        jLabel3.setText("Existencia");

        jLabel4.setText("Precio");

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar ");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonVaciar.setText("Vaciar ");
        botonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo");

        cajaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCodigoActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonModificar)
                                .addGap(12, 12, 12)
                                .addComponent(botonEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4)))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaNombrePro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cajaExistencia)
                                        .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cajaCodigo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVaciar)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBuscar)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar))
                        .addGap(8, 8, 8)
                        .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar)
                    .addComponent(botonVaciar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Connection conexion = null;
        
        try{
            
            conexion= getConnection(); // establecemos la coeccion con el obheto conexion y el el metodo get Connectionn
            
            ps = conexion.prepareStatement("insert into Producto(nombre_producto,Codigo,existencia,precio)values(?,?,?,?)"); // establecemos los campos que vamos a llenar 
            ps.setString(1,cajaNombrePro.getText());
            ps.setString(2,cajaCodigo.getText());
            ps.setInt(3,Integer.parseInt(cajaExistencia.getText()));
            ps.setDouble(4,Double.parseDouble(cajaPrecio.getText()));
            
            // ejecutamos la inserccion con la variavle resultado y guardamos executeUpdate()
           int resultado= ps.executeUpdate(); 
           
            if (resultado>0) {
                
                JOptionPane.showMessageDialog(null,"Registro Insertado Correctamente");
                limpiarCajas();
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Error al Inseertar los datos");
                limpiarCajas();
            }
            
           
            
            
            
        
        }
        catch(Exception ex){
            System.err.println("Error"+ex);
            
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void cajaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCodigoActionPerformed

    private void botonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_botonVaciarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null; // nps conectamos a la base de datos 
        
        try{
            conexion = getConnection(); // logeamos cona la base de datos 
            ps = conexion.prepareStatement("select * from Producto where Codigo=?");
            ps.setString(1,cajaBuscar.getText());
            rs = ps.executeQuery(); // cuando Obtemos algo de la base de datos utilizamos executeQuery()
            
            if (rs.next()) { // si obtenemos un resultado de la base de datos se pondria en tru 
                cajaID.setText(String.valueOf(rs.getInt("idProducto")));
                cajaCodigo.setText(rs.getString("Codigo"));
                cajaNombrePro.setText(rs.getString("nombre_producto"));
                cajaExistencia.setText(String.valueOf(rs.getInt("existencia")));
                cajaPrecio.setText(String.valueOf(rs.getDouble("precio")));
                
                
            }
            else{
                JOptionPane.showMessageDialog(null,"No se encontro Registro ");
            }
            conexion.close();
        
        }
        catch(Exception ex){
            System.err.println("Error "+ex);
            
            
        
        }
        
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
         Connection conexion = null;
        
        try{
            
            conexion= getConnection(); // establecemos la coeccion con el obheto conexion y el el metodo get Connectionn
            
            ps = conexion.prepareStatement("update Producto set Codigo=?,existencia=?,precio=? where idProducto=?"); // establecemos los campos que vamos a llenar 
            
            ps.setString(1,cajaCodigo.getText());
            ps.setInt(2,Integer.parseInt(cajaExistencia.getText()));
            ps.setDouble(3,Double.parseDouble(cajaPrecio.getText()));
            ps.setInt(4,Integer.parseInt(cajaID.getText()));
            // ejecutamos la inserccion con la variavle resultado y guardamos executeUpdate()
           int resultado= ps.executeUpdate(); 
           
            if (resultado>0) {
                
                JOptionPane.showMessageDialog(null,"Registro Modificado  Correctamente");
                limpiarCajas();
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Error al Modificar  los datos");
                limpiarCajas();
            }
            
           
            
            
            
        
        }
        catch(Exception ex){
            System.err.println("Error"+ex);
            
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       Connection conexion = null;
        
        try{
            
            conexion= getConnection(); // establecemos la coeccion con el obheto conexion y el el metodo get Connectionn
            
            ps = conexion.prepareStatement("delete from Producto  where idProducto=?"); // establecemos los campos que vamos a llenar 
            
            ps.setInt(1 ,Integer.parseInt(cajaID.getText()));
            // ejecutamos la inserccion con la variavle resultado y guardamos executeUpdate()
           int resultado= ps.executeUpdate(); 
           
            if (resultado>0) {
                
                JOptionPane.showMessageDialog(null,"Registro Eliminado Correctamente");
                limpiarCajas();
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Error al Eliminar  los datos");
                limpiarCajas();
            }
            
           
            
            
            
        
        }
        catch(Exception ex){
            System.err.println("Error"+ex);
            
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonVaciar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextField cajaExistencia;
    private javax.swing.JTextField cajaID;
    private javax.swing.JTextField cajaNombrePro;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
