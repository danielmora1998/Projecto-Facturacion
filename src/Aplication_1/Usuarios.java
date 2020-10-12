
package Aplication_1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Usuarios extends javax.swing.JFrame {
    
    public static final String URL="jdbc:mysql://localhost:8889/facturacion?autoReconnet=true&useSSL=false";// la utoconeccion a mi vbase de datos sea verdadera
                                                                                                             // ya no nos sale el mensaje de error 
     public static final String usuario="root";
     public static final String contraseña="root";
     
     PreparedStatement ps;
     ResultSet  rs;
    
    public Connection getConnection(){
        
        Connection conexion=null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
          conexion = (Connection)  DriverManager.getConnection(URL,usuario,contraseña);
        
            //JOptionPane.showMessageDialog(null, "Coneccion Exitosa");
          
        }catch(Exception ex){
        
            System.err.print("Error"+ex);
        }
        return conexion;
    }
    
    public void limpiarCajas(){
        cajaBuscar.setText(null);
        cajaClave.setText(null);
        cajaNombre.setText(null);
        cajaDomicilio.setText(null);
        cajaReferenciaDomicilio.setText(null);
        cajaCelular.setText(null);
        cajaCorreoElectronico.setText(null);
        cajaFecha.setText(null);
        cajaPais.setText(null);
        
    }

  
    public Usuarios() {
        initComponents();
        cajaID.setVisible(false);
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cajaClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaCorreoElectronico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaFecha = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        cajaID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaReferenciaDomicilio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajaPais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre y Apellido");

        jLabel3.setText("Domicilio");

        jLabel4.setText("Celular");

        jLabel5.setText("Correo Electronico");

        jLabel6.setText("Fecha");

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

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Vaciar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        cajaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDActionPerformed(evt);
            }
        });

        jLabel7.setText("Referencia Domicilio");

        jLabel8.setText("Pais");

        jLabel9.setText("Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonInsertar)
                .addGap(18, 18, 18)
                .addComponent(botonModificar)
                .addGap(23, 23, 23)
                .addComponent(botonEliminar)
                .addGap(18, 18, 18)
                .addComponent(botonLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(1, 1, 1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cajaNombre)
                        .addComponent(cajaDomicilio)
                        .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cajaCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonBuscar)))
                    .addComponent(cajaReferenciaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaPais, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cajaReferenciaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cajaPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar)
                    .addComponent(botonLimpiar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Connection conexion = null;
        
        try{
            conexion=getConnection();
            
            ps = conexion.prepareStatement("insert into Cliente(cedula,nombre_Apell,Domicilio,referencia_cli,Telefono,Correo_electronico,Fecha,pais_clientes) values(?,?,?,?,?,?,?,?)");
            ps.setInt(1,Integer.valueOf(cajaClave.getText()));
            ps.setString(2,cajaNombre.getText());
            ps.setString(3,cajaDomicilio.getText());
            ps.setString(4,cajaReferenciaDomicilio.getText());
            ps.setString(5,cajaCelular.getText());
            ps.setString(6,cajaCorreoElectronico.getText());
            ps.setDate(7,Date.valueOf(cajaFecha.getText()));
            ps.setString(8,cajaPais.getText());
            
            int resultado = ps.executeUpdate(); // ejecutamos la insercion en la base de datos 
            
            if (resultado>0) {
                
                JOptionPane.showMessageDialog(null,"Registro insertado correctamente ");
                limpiarCajas();
            } 
            else{
                 JOptionPane.showMessageDialog(null,"Error al ingresar el Registro ");
                 limpiarCajas();
            }
            
            
            conexion.close();
            
        }catch(Exception ex){
            
            System.err.println("Error ,"+ex);
        
        }
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("select * from Cliente where cedula=?");
            ps.setString(1,cajaBuscar.getText());
            rs = ps.executeQuery();// cuando obtenemos algo de la base de datos se utiliza executeQuery() 
        
            if (rs.next()) {
                cajaID.setText(String.valueOf(rs.getInt("idClientes")));
                 cajaClave.setText(String.valueOf(rs.getInt("cedula")));
                 cajaNombre.setText(rs.getString("nombre_Apell"));
                 cajaDomicilio.setText(rs.getString("Domicilio"));
                 cajaReferenciaDomicilio.setText(rs.getString("referencia_cli"));
                 cajaCelular.setText(rs.getString("Telefono"));
                 cajaCorreoElectronico.setText(rs.getString("Correo_electronico"));
                 cajaFecha.setText(String.valueOf(rs.getDate("Fecha")));
                 cajaPais.setText(String.valueOf(rs.getString("pais_clientes")));
                 
            
            } 
            else{
                JOptionPane.showMessageDialog(null," No existe registro con esos datos");
                
            }
            
            conexion.close();
            
            
            
        }
        catch(Exception ex){
            System.err.println("Error"+ex);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection conexion = null;
        
        try{
            conexion=getConnection();
            
            ps = conexion.prepareStatement("update Cliente set cedula=?,nombre_Apell=?,Domicilio=?,referencia_cli=?,Telefono=?,Correo_electronico=?,Fecha=?,pais_clientes=? where idClientes=?");
            ps.setInt(1,Integer.valueOf(cajaClave.getText()));
            ps.setString(2,cajaNombre.getText());
            ps.setString(3,cajaDomicilio.getText());
            ps.setString(4,cajaReferenciaDomicilio.getText());
            ps.setString(5,cajaCelular.getText());
            ps.setString(6,cajaCorreoElectronico.getText());
            ps.setDate(7,Date.valueOf(cajaFecha.getText()));
            ps.setString(8,cajaPais.getText());
            ps.setInt(9, Integer.parseInt(cajaID.getText()));
            
            int resultado = ps.executeUpdate(); // ejecutamos la Modificacion en la base de datos 
            
            if (resultado>0) {
                
                        JOptionPane.showMessageDialog(null,"Registro Modificado correctamente ");
                limpiarCajas();
            } 
            else{
                 JOptionPane.showMessageDialog(null,"Error al Modificar  el Registro ");
                 limpiarCajas();
            }
            
            
            conexion.close();
            
        }catch(Exception ex){
            
            System.err.println("Error ,"+ex);
        
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
         Connection conexion = null;
        
        try{
            conexion=getConnection();
            
            ps = conexion.prepareStatement("delete from Cliente where idClientes=?");
            
            ps.setInt(1, Integer.parseInt(cajaID.getText()));
            
            int resultado = ps.executeUpdate(); // ejecutamos la Eliminacion en la base de datos 
            
            if (resultado>0) {
                
                        JOptionPane.showMessageDialog(null,"Registro Eliminado correctamente ");
                limpiarCajas();
            } 
            else{
                 JOptionPane.showMessageDialog(null,"Error al Eliminar el Registro ");
                 limpiarCajas();
            }
            
            
            conexion.close();
            
        }catch(Exception ex){
            
            System.err.println("Error ,"+ex);
        
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void cajaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIDActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaClave;
    private javax.swing.JTextField cajaCorreoElectronico;
    private javax.swing.JTextField cajaDomicilio;
    private javax.swing.JTextField cajaFecha;
    private javax.swing.JTextField cajaID;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPais;
    private javax.swing.JTextField cajaReferenciaDomicilio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
