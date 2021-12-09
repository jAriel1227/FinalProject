package Class;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Johanly Baez
 * 
 */
public class SerProductos {

    //Instanciamos la clase con la conexion a nuestra base de datos...
    
    ClassConectar conexion = new ClassConectar();
    ResultSet set = null;
    Productos reg = new Productos();
    
    /*
    Este metodo nos permite registrar y almacenar en sus repectivos campos los datos
    de los productos...
    */
    public void registroProductos(Productos productos) {
        try {
            //Consulta para insertar datos en la base de datos...
            String Query = "insert into productos values(?,?,?,?,?,?)";
            PreparedStatement estadoSQL = conexion.Conexion().prepareStatement(Query);
            estadoSQL.setInt(1, productos.IdProductos);
            estadoSQL.setString(2, productos.NombreProductos);
            estadoSQL.setString(3, productos.MarcaProductos);
            estadoSQL.setString(4, productos.CategoriaProductos);
            estadoSQL.setInt(5, productos.PrecioProducto);
            estadoSQL.setInt(6, productos.CantidadProducto);
            int status = estadoSQL.executeUpdate();
            if (status > 0) {
                System.out.println("Producto Guardado...!");
                JOptionPane.showMessageDialog(null, "El producto fue agregado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
        }

    }
    
    //Metodo para editar los productos...
    
     public void editarProducto(Productos productos) {
        try {
            //Consulta para actualizar en la base de datos...
            String Query = "update productos set Nombre=?,Marca=?,Categoria=?,Precio=?,Cantidad_Disponible=? where idproductos=?";
            PreparedStatement estadoSQL = conexion.Conexion().prepareStatement(Query);
            estadoSQL.setString(1, productos.NombreProductos);
            estadoSQL.setString(2, productos.MarcaProductos);
            estadoSQL.setString(3, productos.CategoriaProductos);
            estadoSQL.setInt(4, productos.PrecioProducto);
            estadoSQL.setInt(5, productos.CantidadProducto);
            estadoSQL.setInt(6, productos.IdProductos);
            int status = estadoSQL.executeUpdate();
            if (status > 0) {
                System.out.println("Actualizado Correctamente !!!");
                JOptionPane.showMessageDialog(null, "El producto fue actualizado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
        }

    }  
     
     //Metodo para eliminar los productos...
     
  public boolean eliminarProductos(Productos productos) {
        try {
            //Consulta para eliminar datos en la base de datos, solo tomamos el id de ese dato...
            String Query = "delete from productos where idproductos=?";
            PreparedStatement state = conexion.Conexion().prepareStatement(Query);
            state.setInt(1, productos.IdProductos);
            int status = state.executeUpdate();
            if (status > 0) {
                System.out.println("Eliminado Correctamente...!");
                return true;
            }
            return false;

        } catch (Exception e) {
            return false;
        }

    }
    
    
}
