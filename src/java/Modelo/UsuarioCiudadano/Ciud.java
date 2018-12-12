package Modelo.UsuarioCiudadano;

import Controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Ciud {
    
    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    
    public void Ingresar_ciud(GSAdminCiud ing){
        try{
            ps=cnn.prepareStatement("insert into login_usuarios values(?,?,?)");
            ps.setString(1,ing.getNom());
            ps.setString(2,ing.getCla());
            ps.setInt(3,ing.getRol());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ciudadano Ingresado Correctamente");
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido Ingresar el Ciudadano");
        }
    }

}
