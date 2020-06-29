package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Instrumentos;

public class InstrumentosControlador {
	private conexion con;
	
	//----------CREAR INSTRUMENTO----------//
    public void crearInstrumentos (Instrumentos i) {
    	
    	String insertSQL = "INSERT INTO `instrumentos`(`idcategorias`, `Tipo`, `Nombre`, `Descripcion`, `Precio`)"
+ " VALUES ("+i.getId()+",'"+i.getTipo()+"','"+i.getNombre()+"','"+i.getDesc()+"',"+i.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR INSTRUMENTO----------//    
    public void editarInstrumentos (Instrumentos i) {
    	
    	String insertSQL = "UPDATE `instrumentos` SET Tipo='"+i.getTipo()+"',Nombre = '"+i.getNombre()+"',Descripcion= '" +i.getDesc()+"',Precio= "+i.getPrecio()+" WHERE idcategorias = "+i.getId()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR INSTRUMENTO----------//    
    
    public String eliminarInstrumentos (String id) {
    	String response = "";
    	String insertSQL = "DELETE FROM `instrumentos` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR INSTRUMENTO----------//    
    public void consultarInstrumentos (String id) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `instrumentos` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nTipo: "+ rs.getString (2) + "\nNombre: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}