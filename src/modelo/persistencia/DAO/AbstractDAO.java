package modelo.persistencia.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.persistencia.DTO.GenericDTO;

public abstract class AbstractDAO {
	
	public abstract GenericDTO componerObjeto (ResultSet rs) throws SQLException;

}
