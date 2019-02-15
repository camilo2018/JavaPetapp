package Modelo.Preguntas;

import Controlador.conexion;
import Modelo.Administrador.Ciudadano.GSCiudadanoAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Respuestas {

    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    ResultSet res=null;
    
    public void Respuestas(GSRespuestas ing){
        try{
        ps=cnn.prepareStatement("call pregunta(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1,ing.getRe1());
        ps.setInt(2,ing.getRe2());
        ps.setInt(3,ing.getRe3());
        ps.setInt(4,ing.getRe4());
        ps.setInt(5,ing.getRe5());
        ps.setInt(6,ing.getRe6());
        ps.setInt(7,ing.getRe7());
        ps.setInt(8,ing.getRe8());
        ps.setInt(9,ing.getRe9());
        ps.setInt(10,ing.getRe10());
        ps.setInt(11,ing.getRe11());
        ps.setInt(12,ing.getRe12());
        ps.setInt(13,ing.getRe13());
        ps.setInt(14,ing.getRe14());
        ps.setInt(15,ing.getRe15());
        ps.setInt(16,ing.getRe16());
        ps.setInt(17,ing.getRe17());
        ps.setInt(18,ing.getRe18());
        ps.setInt(19,ing.getRe19());
        ps.setInt(20,ing.getRe20());
        ps.setString(21,ing.getCed());
        ps.executeUpdate();
        }
        catch(Exception e){
        }
    }
    public void RespuestaFin(GSRespuestaFin ing){
        try{
        ps=cnn.prepareStatement("call preguntafin(?,?)");
        ps.setInt(1,ing.getRe1());
        ps.setString(2,ing.getCed());
        ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Exito");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido Ingresar las respuestas"+e);
        }
    }
    
        public ArrayList<GSCiudadanoAdmin> Consultar1(String pr){
        ArrayList<GSCiudadanoAdmin> R = new ArrayList<>();
        try {
            ps=cnn.prepareStatement("Select cedula from ciudadano where usuario_ciu='"+pr+"'");
            res=ps.executeQuery();
            while (res.next()) {
                
                GSCiudadanoAdmin CF = new GSCiudadanoAdmin(res.getString(1));
                R.add(CF);
                
                
            }
            } catch (Exception e) {
            }
            return R;
        }
        
        public ArrayList<GSRespuestaFin> envio(GSRespuestaFin a){
    ArrayList<GSRespuestaFin> arreglo = new ArrayList<>();
        try {
            ps=cnn.prepareStatement("select * from respuesta_pre where cedula='"+a.getCed()+"'");
            res=ps.executeQuery();
            JOptionPane.showMessageDialog(null, res.next());
            while(res.next()){
                GSRespuestaFin as = new GSRespuestaFin(res.getInt(1),res.getString(2));
                arreglo.add(as);
                
            }
        } catch (Exception e) {
            
        }
        JOptionPane.showMessageDialog(null, arreglo);
        return arreglo;
    }
}
