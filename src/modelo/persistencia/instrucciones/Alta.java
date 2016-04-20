package modelo.persistencia.instrucciones;

import modelo.persistencia.DAO.ConstantesDAO;


public class Alta {
	

	public final static String InsertarTalla = "INSERT INTO talla (talla) VALUES ('"+ConstantesDAO.caracterParametro+"')";
}
