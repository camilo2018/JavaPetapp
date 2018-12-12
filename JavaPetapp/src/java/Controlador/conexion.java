
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
        Connection cnn=null;
    public Connection conexionpa(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    cnn=DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","camilo57");
    }
    catch(Exception e){
        System.out.println("Error de conexion" +e);
    }
    
    
    return cnn;
}
}
