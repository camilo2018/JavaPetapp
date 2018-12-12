package Modelo.Administrador.Usuario;

import Controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Usuario {
    
    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    
    public void  Ingresar_usuario(GSUsuarioAdmin ing){
        try{
            ps=cnn.prepareStatement("insert into registro_usuario values(?,?,?,?)");
            ps.setString(1,ing.getCedula());
            ps.setString(2,ing.getNombre());
            ps.setString(3,ing.getClave());
            ps.setInt(4,ing.getRol());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Nuevo Usuario Registrado");
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null,"No se puede registrar el Usuario"+e);
        }
    }
}
