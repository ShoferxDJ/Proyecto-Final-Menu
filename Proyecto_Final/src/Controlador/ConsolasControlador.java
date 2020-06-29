package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Consolas;

public class ConsolasControlador {
    	private conexion con;
    	
    	//----------CREAR CONSOLAS----------//
        public void crearConsolas (Consolas C) {
        	
        	String insertSQL = "INSERT INTO `consolas`(`idcategorias`, `Nombre`, `Marca`, `Descripcion`, `Precio`)"
    + " VALUES ("+C.getId()+",'"+C.getNombre()+"','"+C.getMarca()+"','"+C.getDescripcion()+"',"+C.getPrecio()+")";
        	con = new conexion ();
        	con.ejecutarQery(insertSQL);
        }
    	//----------EDITAR CONSOLAS----------//    
        public void editarConsolas (Consolas C)  {
        	
        	String insertSQL = "UPDATE `consolas` SET Nombre='"+C.getNombre()+"', Marca= '"+C.getMarca()+"',Descripcion= '" +C.getDescripcion()+"',Precio= "+C.getPrecio()+" WHERE idcategorias = "+C.getId()+";";
        	con = new conexion ();
        	con.ejecutarQery(insertSQL);
        }
    	//----------ELIMINAR CONSOLAS----------//    
        
        public String eliminarConsolas (String id) {
        	String response = "";
        	String insertSQL = "DELETE FROM `consolas` WHERE idcategorias = "+ id+";";
        	con = new conexion ();
        	response = con.ejecutarQery(insertSQL);
        	return response;
        }
    	//----------CONSULTAR CONSOLAS----------//    
        public void consultarConsolas (String id) {
        	String response = "";
        	String insertSQL = "SELECT * FROM `consolas` WHERE idcategorias = "+ id+";";
        	con = new conexion ();
        	
        	try {
        		ResultSet rs = con.consultarRegistros (insertSQL);
        	while (rs.next()) {
        		System.out.println("\nID: "+rs.getInt (1)+ "\nNombre del Producto: "+ rs.getString (2) + "\nMarca: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $ "+ rs.getString (5) + " MXN" );
        	}
        	}catch  (SQLException e) {
        		e.printStackTrace();
        		
        	}
        }
    }