package Modelo.Administrador.Adopcion;

import Controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Adopcion {
 
    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    ResultSet res=null;
    
    public ArrayList<GSAdopcion> Consultar(){
    ArrayList<GSAdopcion> R = new ArrayList<>();
        try {
            ps=cnn.prepareStatement("Select * from adopcion");
            res=ps.executeQuery();
            while (res.next()) {
                
                GSAdopcion CF = new GSAdopcion(res.getInt(1),res.getInt(2),res.getInt(3),res.getString(4));
                R.add(CF);
                
                
            }
            } catch (Exception e) {
            }
            return R;
    }
    
    public void Ingresar_adop(GSAdopcion ing){
        try{
            ps=cnn.prepareStatement("insert into adopcion values(?,?,?,?)");
            ps.setInt(1,ing.getCod());
            ps.setInt(2,ing.getAni());
            ps.setInt(3,ing.getSeg());
            ps.setString(4,ing.getMen());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Proceso Finalizado Correctamente");
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error verifica los datos Ingresados");
        }
    }
}
