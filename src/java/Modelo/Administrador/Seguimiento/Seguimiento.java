package Modelo.Administrador.Seguimiento;

import Controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Seguimiento {

    conexion con=new conexion();
    Connection cnn=con.conexionpa();
    PreparedStatement ps=null;
    
    public void Ingresar_segui(GSSeguimientoAdmin ing){
        try{
            ps=cnn.prepareStatement("insert into seguimiento values(?,?)");
            ps.setInt(1,ing.getCods());
            ps.setInt(2,ing.getCodp());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Seguimiento Ingresado Correctamente");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido Ingresar el seguimiento");
        }
    }
}
