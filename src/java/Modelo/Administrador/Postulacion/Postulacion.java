package Modelo.Administrador.Postulacion;

import Controlador.conexion;
import Modelo.Administrador.Seguimiento.GSSeguimientoAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Postulacion {

    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    ResultSet res=null;
    
    public void Ingresar_postulacion(GSPostulacionAdmin ing){
        try{
            ps=cnn.prepareStatement("insert into postulacion (telefono_contacto,direccion_contacto,telefono_fijo,certificado_laboral,cedu,codigo_animal)values(?,?,?,?,?,?)");
       ps.setString(1,ing.getTel());
       ps.setString(2,ing.getDir());
       ps.setString(3,ing.getFij());
       ps.setString(4,ing.getCer());
       ps.setString(5,ing.getCed());
       ps.setInt(6,ing.getCoda());
       ps.executeUpdate();
       JOptionPane.showMessageDialog(null,"Postulacion Ingresado Correctamente");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido Ingresar la Postulacion"+e);
        }
    }
    
    public ArrayList<GSPostulacionAdmin> ConsultaAdmin(){
        ArrayList<GSPostulacionAdmin> R=new ArrayList<>();
        try{
            ps=cnn.prepareStatement("select * from postulacion");
            res=ps.executeQuery();
            while(res.next()){
                GSPostulacionAdmin cp=new GSPostulacionAdmin(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getInt(7));
                R.add(cp);
            }
        }catch(Exception e){
            
        }return R;
    }
    public ArrayList<GSSeguimientoAdmin> Consultapos(){
        ArrayList<GSSeguimientoAdmin> s=new ArrayList<>();
        try{
            ps=cnn.prepareStatement("select * from seguimiento");
            res=ps.executeQuery();
            while(res.next()){
                GSSeguimientoAdmin sp=new GSSeguimientoAdmin(res.getInt(1),res.getInt(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getInt(7));
                s.add(sp);
            }
        }catch(Exception e){
            
        }return s;
    }

    public ArrayList<GSPostulacionAdmin> Consultar(){
        ArrayList<GSPostulacionAdmin> R = new ArrayList<>();
        try {
            ps=cnn.prepareStatement("Select * from login_usuarios where rol_login=1");
            res=ps.executeQuery();
            while (res.next()) {
                
                GSPostulacionAdmin CF = new GSPostulacionAdmin(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getInt(7));
                R.add(CF);
                
                
            }
            } catch (Exception e) {
            }
            return R;
        }
        
}
