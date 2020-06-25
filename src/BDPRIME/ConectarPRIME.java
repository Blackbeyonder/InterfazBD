
package BDPRIME;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarPRIME {
   
     
    public static Connection getConnection(){
       Connection con = null;
       String URL = "grelty.sqlite"; //ruta de la base de datos
       //C:\\Users\\Beyon\\OneDrive\\Documentos\\NetBeansProjects\\SimulacionBD\\TABLAF.sqlite
       try{
       Class.forName("org.sqlite.JDBC");
       con= DriverManager.getConnection("jdbc:sqlite:"+URL);//DriverManager.getConnection(URL,USER, PASSWORD);
           //JOptionPane.showMessageDialog(null, "Conexion exitosa");
       
       }catch(Exception e){
           System.out.println(e);
       
       }
    return con; 
   }
}
