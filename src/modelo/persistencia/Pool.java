package modelo.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

public class Pool {
	
	private static final String fuente = "java:comp/env/jdbc/pool";
	private static final Logger log = Logger.getRootLogger();
	private static DataSource fuenteDatos = null;;
	private static final Pool pool = new Pool ();
	
	
	
	public static Pool getInstance ()
	{
		return pool;
	}
	
	private Pool ()
	{
		fuenteDatos = iniciarFuente();
	}
	
		

	private static DataSource iniciarFuente ()
	{
		DataSource ds = null;
		
		try
		{
			InitialContext ct = new InitialContext ();
			ds = (DataSource)ct.lookup(fuente);
		}
		catch (Exception e) {
			log.error("Error al acceder a los recursos del context.xml para configurar el Pool de la base de datos");
		}
		return ds;
	}
	
	
	
	public static Connection getConnection ()
	{
		Connection conexion = null;
		try
		{
			conexion = fuenteDatos.getConnection();
		}
		catch (Exception e) {
			log.error("Imposible obtener conexi�n a la base de datos");
		}
		return conexion;
	}
	
	public static void liberarRecursos (Connection conexion, Statement st, ResultSet rs)
	{
		
			try 
			 {conexion.close();
			 
			 } catch (SQLException e) {
				log.error("Error al liberar la conexi�n");
			}
			 try 
			 {
				 st.close(); 
			 }
			 catch (SQLException e)
			 {
				 log.error("Error al liberar el Statement"); 
			 }
			 try 
			 {
				 rs.close(); 
			 }
			 catch (SQLException e)
			 {
				 log.error("Error al liberar el ResultSet");
			 }
		
		
	}
	
	
	public static void liberarRecursos (Connection conexion, Statement st)
	{
		
			try 
			 {conexion.close();
			 
			 } catch (SQLException e) {
				log.error("Error al liberar la conexi�n");
			}
			 try 
			 {
				 st.close(); 
			 }
			 catch (SQLException e)
			 {
				 log.error("Error al liberar el Statement"); 
			 }
		
	}
}
