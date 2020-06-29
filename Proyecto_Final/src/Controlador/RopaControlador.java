package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Ropa;

public class RopaControlador {
	private conexion con;
	
	//----------CREAR ROPA----------//
    public void crearRopa (Ropa r) {
    	
    	String insertSQL = "INSERT INTO `ropa`(`idcategorias`, `Tipo`, `Marca`,`Precio`)"
+ " VALUES ("+r.getId()+",'"+r.getTipo()+"','"+r.getMarca()+"',"+r.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR ROPA----------//    
    public void editarRopa (Ropa r) {
    	
    	String insertSQL = "UPDATE `ropa` SET Tipo='"+r.getTipo()+"', Marca= '"+r.getMarca()+"',Precio= "+r.getPrecio()+" WHERE idcategorias = "+r.getId()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR ROPA----------//    
    
    public String eliminarRopa (String id) {
    	String response = "";
    	String insertSQL = "DELETE FROM `ropa` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR ROPA----------//    
    public void consultarRopa (String id) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `ropa` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nTipo: "+ rs.getString (2) + "\nMarca: "+ rs.getString (3) + "\nPrecio: $"+ rs.getString (4) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}