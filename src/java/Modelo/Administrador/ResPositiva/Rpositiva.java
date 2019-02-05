/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Administrador.ResPositiva;

import Controlador.conexion;
import Modelo.Administrador.Animal.GSAnimalAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author KnokinGm
 */
public class Rpositiva {
    
    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    ResultSet res=null;
    
    public void Ingresar_Positiva(GSRespositiva ing){
        try{
            ps=cnn.prepareStatement("insert into respuestausuario (cedula_respuesta,mensaje) values(?,?)");
            ps.setString(1,ing.getCed());
            ps.setString(2,ing.getMen());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Respuesta enviada");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido enviar la Respuesta");
        }
    }
    
     public int EliminarAnim(GSAnimalAdmin igs) {
        
    int x=0;
    
    try{
        
        ps=cnn.prepareStatement("DELETE from animal WHERE codigo_animal='"+igs.getCod()+"'");
        
        ps.executeUpdate();
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        
    }
    return x;   
    }
}
