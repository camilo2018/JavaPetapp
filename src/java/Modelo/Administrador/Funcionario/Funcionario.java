package Modelo.Administrador.Funcionario;

import Controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Funcionario {
    
    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps = null;
    ResultSet res=null;
    
    public void Insertar(GSFuncionario FGS){
        
        try {
        
        ps=cnn.prepareStatement("insert into funcionario values(?,?,?,?,?,?)");
        ps.setString(1, FGS.getCedulafuncionario());
        ps.setString(2, FGS.getTelefonofuncionario());
        ps.setString(3, FGS.getNombrefuncionario());
        ps.setString(4, FGS.getCorreofuncionario());
        ps.setInt(6, FGS.getRolfuncionario());
        ps.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se inserto "+e);
            
        }
        
    }
    public int Actualizar(GSFuncionario AF){
        int x=0;
        try {
            ps=cnn.prepareStatement("update funcionario set telefono_funcionario='"+AF.getTelefonofuncionario()+"',nombre_funcionario='"+AF.getNombrefuncionario()+"',correo_funcionario='"+AF.getCorreofuncionario()+"' where cedula_funcionario='"+AF.getCedulafuncionario()+"'");
            x=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return x;
    }
    
    public ArrayList<GSFuncionario> Consultar(){
    ArrayList<GSFuncionario> R = new ArrayList<>();
        try {
            ps=cnn.prepareStatement("Select * from funcionario");
            res=ps.executeQuery();
            while (res.next()) {
                
                GSFuncionario CF = new GSFuncionario(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getInt(5));
                R.add(CF);
                
                
            }
        } catch (Exception e) {
        }
        return R;
    }
    
    public int Eliminar(GSFuncionario FE){
        int x=0;
        try {
            ps=cnn.prepareStatement("delete from funcionario where cedula_funcionario='"+FE.getCedulafuncionario()+"'");
            x=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return x;
    }
}
