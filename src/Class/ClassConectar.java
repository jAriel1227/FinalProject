package Class;


import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Johanly Baez
 * 
 */

public class ClassConectar {

    //Declaramos estas variables para poder tener un codigo mas limpio...
    
    private final String user = "rootjohanly";
    private final String contraseña = "jbl122702";
    private final String url = "jdbc:mysql://db4free.net:3306/userproduct";
    
    
    
   //Este metodo nos permite conectarnos a la base de datos....
   public Connection Conexion(){
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
        
           Connection con = DriverManager.getConnection(url, user, contraseña);
           System.out.println("Coneccion exitosa...!");
           return con;
           
       } catch (Exception e) {
           return null;
       } 
}
}

