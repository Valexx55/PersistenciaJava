package modelo.persistencia.instrucciones;

import modelo.persistencia.DAO.ConstantesDAO;

public class Modificacion {

	public static String Actualiza = "UPDATE";
	public static String ActualizaTalla = Actualiza +" "+ConstantesDAO.nombreTablaTalla+ " SET";
}
