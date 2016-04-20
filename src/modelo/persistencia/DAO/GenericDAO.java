package modelo.persistencia.DAO;

import modelo.errores.Error;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import modelo.persistencia.Pool;
import modelo.persistencia.DAO.ConstantesDAO;
import modelo.persistencia.DTO.GenericDTO;

public class GenericDAO   {
	
	
	
	protected Connection conexion;
	protected Statement st;
	protected ResultSet rs;
	
	private static Logger log = Logger.getRootLogger();
	
	
	
	public GenericDTO componerObjeto (ResultSet rs) throws SQLException
	{
		return null;
	}
	
	public String sustituirArgumentos (String sentencia, List<Object> argumentos) throws Exception
	{
		String sentenciatraducida = "";
		
		boolean sustituido = false;
		int numargs = argumentos.size();
		int numargsEncontrados = 0;
		int pos = -1;
		int longuitud = sentencia.length() - 1;
		char carcateractual = '0';
		String argaux = null;
		
		try
		{
		
		while (!sustituido)
		{
			pos = pos + 1;
			carcateractual = sentencia.charAt(pos);
			if (carcateractual == ConstantesDAO.caracterParametro)
			{
				argaux = argumentos.get(numargsEncontrados).toString();
				sentenciatraducida = sentenciatraducida + argaux;
				numargsEncontrados = numargsEncontrados + 1;
			}
			else
			{
				sentenciatraducida = sentenciatraducida + carcateractual;
			}
			sustituido = ((numargsEncontrados == numargs) || (longuitud == pos));
		}
		
		if ((numargsEncontrados == numargs) && (longuitud != pos))
		{
			sentenciatraducida = sentenciatraducida + sentencia.substring(pos+1, longuitud+1);
		}
		
		}catch (Exception e) {
			log.error(Error.NumeroArgumentosQuery);
			throw e;
		}
		
		return sentenciatraducida;
	}
	
	public GenericDTO ejecutaConsultaSimple (String consulta, List<Object> argumentos) throws Exception
	{
		GenericDTO dtoAux = null;
		String consultaTraducida = null;
		
		try
			{
				consultaTraducida = sustituirArgumentos (consulta, argumentos);
				conexion = Pool.getConnection();
				st = conexion.createStatement();
				st.execute(consultaTraducida);
				rs = st.getResultSet();
				if (rs != null)
				{
					if (rs.next())
					{
						dtoAux = this.componerObjeto(rs);					
					
					}
				}
		}
		finally
		{
			Pool.liberarRecursos(conexion, st, rs);
		}
								
		return dtoAux;
	}
	
	public List<GenericDTO> ejecutaConsultaMultiple (String consulta , List<Object> argumentos) throws Exception
	{
		List<GenericDTO> ldev = null;
		GenericDTO dtoAux = null;
		String consultaTraducida = null;
		
		try
			{
				if (argumentos != null)
				{
					consultaTraducida = sustituirArgumentos (consulta, argumentos);
				}
				else 
					consultaTraducida = consulta;
				conexion = Pool.getConnection();
				st = conexion.createStatement();
				st.execute(consultaTraducida);
				rs = st.getResultSet();
				if (rs != null)
				{
					ldev = new LinkedList<GenericDTO>();
					if (rs.next())
					{
						dtoAux = this.componerObjeto(rs);
						ldev.add(dtoAux);
					
					}
			
				}
		}
		finally
		{
			Pool.liberarRecursos(conexion, st, rs);
		}
		return ldev;
	}
	
	public void ejecutaSentencia (String instruccion, List<Object> argumentos) throws Exception
	{
		String instruccionTraducida = null;
		
		
		try
		
			{
				if (argumentos != null)
				{
					instruccionTraducida = sustituirArgumentos(instruccion, argumentos);
				}
				else
					instruccionTraducida = instruccion;
				conexion = Pool.getConnection();
				st = conexion.createStatement();
				st.execute(instruccionTraducida);
				conexion.commit();
		}
		finally
		{
			Pool.liberarRecursos(conexion, st);
		}
		
	}

	

	
	
}
