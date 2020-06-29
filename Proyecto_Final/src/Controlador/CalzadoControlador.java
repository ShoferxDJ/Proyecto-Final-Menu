package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Calzado;

public class CalzadoControlador {
	private conexion con;
	
	//----------CREAR CALZADO----------//
    public void crearCalzado (Calzado zap) {
    	
    	String insertSQL = "INSERT INTO `calzado`(`idproductos`, `Producto`, `Marca`, `Numero`, `Precio`)"
    			+ " VALUES ("+zap.getIdproductos()+",'"+zap.getProducto()+"','"+zap.getMarca()+"','"+zap.getNumero()+"',"+zap.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR CALZADO----------//    
    public void editarCalzado (Calzado zap) {
    	
    	String insertSQL = "UPDATE `calzado` SET Producto='"+zap.getProducto()+"', Marca= '"+zap.getMarca()+"',Numero= '" +zap.getNumero()+"',Precio= "+zap.getPrecio()+" WHERE idproductos = "+zap.getIdproductos()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR CALZADO----------//    
    
    public String eliminarCalzado (String idproductos) {
    	String response = "";
    	String insertSQL = "DELETE FROM `calzado` WHERE idproductos = "+ idproductos+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR CALZADO----------//    
    public void consultarCalzado (String idproductos) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `calzado` WHERE idproductos = "+ idproductos+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nProducto: "+ rs.getString (2) + "\nMarca: "+ rs.getString (3) + "\nNumero de zapato: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}