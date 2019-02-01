package Modelo.Usuario;

import Controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Usuario {
    
    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    
    public void Ingresar_ciud(GSUsuario ing){
        try{
            ps=cnn.prepareStatement("insert into login_usuarios values(?,?,?,?)");
            ps.setString(1,ing.getNom());
            ps.setString(2,ing.getCla());
            ps.setInt(3,ing.getRol());
            ps.setString(4,ing.getFot());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario Ciudadano Ingresado Correctamente");
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido Ingresar el Ciudadano");
        }
    }

}
