package Modelo.Administrador.Veterinaria;

import Controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Veterinaria {
    
    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps = null;
    ResultSet res=null;
    
    public void Insertar(GSVeterinaria FGS){
        
        try {
        
        ps=cnn.prepareStatement("insert into veterinaria values(?,?,?,?,?)");
        ps.setString(1, FGS.getNitveterinaria());
        ps.setString(2, FGS.getTelefonoveterinaria());
        ps.setString(3, FGS.getNombreveterinaria());
        ps.setString(4, FGS.getDireccionveterinaria());
        ps.setInt(5, FGS.getRolveterinaria());
        ps.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se inserto "+e);
            
        }
        
    }
    public int Actualizar(GSVeterinaria AF){
        int x=0;
        try {
            ps=cnn.prepareStatement("update veterinaria set telefono_veterinaria='"+AF.getTelefonoveterinaria()+"',nombre_veterinaria='"+AF.getNombreveterinaria()+"',direccion_veterinaria='"+AF.getDireccionveterinaria()+"' where nit_veterinaria='"+AF.getNitveterinaria()+"'");
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return x;
    }
    
    public ArrayList<GSVeterinaria> Consultar(){
    ArrayList<GSVeterinaria> R = new ArrayList<>();
        try {
            ps=cnn.prepareStatement("Select * from veterinaria");
            res=ps.executeQuery();
            while (res.next()) {
                
                GSVeterinaria CF = new GSVeterinaria(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getInt(5));
                R.add(CF);
                
                
            }
        } catch (Exception e) {
        }
        return R;
    }
    
    public int Eliminar(GSVeterinaria FE){
        int x=0;
        try {
            ps=cnn.prepareStatement("delete from veterinaria where nit_veterinaria='"+FE.getNitveterinaria()+"'");
            x=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return x;
    }
}
