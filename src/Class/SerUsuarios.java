package Class;

import Formularios.Logger;
import Formularios.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Johanly Baez 
 * 
 */
public class SerUsuarios {
    
     //Instancioamos la clase con la conexion a nuestra base de datos...
    
    ClassConectar conexion = new ClassConectar();
    ResultSet set = null;
    Logger login = new Logger();
    
    //Metodo lo cual nos permite el inicio de sesion en el sistema...
    
    public void login(Usuarios usuario) {
        try {
            /*
            Con esta consulta en la base de datos, seleccionamos estos dos campos: 
            Usuario y Contraseña de la tabla de la misma.
            */
            PreparedStatement estadoSQL = conexion.Conexion().prepareStatement("SELECT * FROM usuarios where Nombre_Usuario=? AND Contraseña=?");
            estadoSQL.setString(1, usuario.Usuario);
            estadoSQL.setString(2, usuario.Contraseña);

            set = estadoSQL.executeQuery();
            if (set.next()) {
                System.out.println("Inicio de sesion Correcta...");

                usuario.Nombre = set.getString(2);
                usuario.Apellido = set.getString(3);
                JOptionPane.showMessageDialog(login, "Bienvenido " + usuario.Nombre, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                Menu princ = new Menu();
                princ.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(login, "No esta registrado o contraseña erronea", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(login, "Ha Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    /*Podemos registrar los datos en sus repectivos campos segun este metodo, para
      Los Usuarios...
    */
    public void registroUsuario(Usuarios usuario) {
        try {
            //Consulta pra ingresar los datos en la base de datos...
            String Query = "insert into usuarios values(?,?,?,?,?,?,?)";
            PreparedStatement estadoSQL = conexion.Conexion().prepareStatement(Query);
            estadoSQL.setInt(1, usuario.Id);
            estadoSQL.setString(2, usuario.Usuario);
            estadoSQL.setString(3, usuario.Nombre);
            estadoSQL.setString(4, usuario.Apellido);
            estadoSQL.setString(5, usuario.Telefono);
            estadoSQL.setString(6, usuario.Correo);
            estadoSQL.setString(7, usuario.Contraseña);
            int status = estadoSQL.executeUpdate();
            if (status > 0) {
                System.out.println("Usuario Insertado...");
                JOptionPane.showMessageDialog(login, "El usuario fue insertado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
        }

    }
    
    //Editando los usuarios con este metodo...
    
     public void editarUsuario(Usuarios usuario) {
        try {
            //Consulta para actualizar los datos de la base de datos...
            String Query = "update usuarios set Nombre_Usuario=?,Nombre=?,Apellido=?,Telefono=?,Correo=?,Contraseña=? where Idusuarios=?";
            PreparedStatement estadoSQL = conexion.Conexion().prepareStatement(Query);
            estadoSQL.setString(1, usuario.Usuario);
            estadoSQL.setString(2, usuario.Nombre);
            estadoSQL.setString(3, usuario.Apellido);
            estadoSQL.setString(4, usuario.Telefono);
            estadoSQL.setString(5, usuario.Correo);
            estadoSQL.setString(6, usuario.Contraseña);
            estadoSQL.setInt(7, usuario.Id);
            int status = estadoSQL.executeUpdate();
            if (status > 0) {
                System.out.println("Actualizado Correctamente !!!");
                JOptionPane.showMessageDialog(login, "El usuario fue editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
        }

    }
     
     //Eliminaremos los usuarios con este metodo...
     
  public boolean eliminarUs(Usuarios usuario) {
        try {
            //Consulta para eliminar los datos de la base de datos...
            String Query = "delete from usuarios where Idusuarios=?";
            PreparedStatement state = conexion.Conexion().prepareStatement(Query);
            state.setInt(1, usuario.Id);
            int status = state.executeUpdate();
            if (status > 0) {
                System.out.println("Eliminado Correctamente...");
                return true;
            }
            return false;

        } catch (Exception e) {
            return false;
        }

    }
    
    
}
