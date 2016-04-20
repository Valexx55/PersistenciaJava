package modelo.persistencia.DAO.tablas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import modelo.persistencia.DAO.CRUD;
import modelo.persistencia.DAO.ConstantesDAO;
import modelo.persistencia.DAO.GenericDAO;
import modelo.persistencia.DAO.Recuperable;
import modelo.persistencia.DTO.GenericDTO;
import modelo.persistencia.DTO.TallaDTO;
import modelo.persistencia.instrucciones.Alta;
import modelo.persistencia.instrucciones.Consulta;


public class TallaDAO extends GenericDAO implements CRUD, Recuperable 
{
	
	
	
	
	@Override
	public void create(GenericDTO ObjectDTO) throws Exception 
		{
		TallaDTO tallaDTO = null;
		List<Object> listaArgs = null;
		String sentencia = Alta.InsertarTalla;
		
		/*ESTO QUEDA COMO MODELO. No se van a crear Tallas*/
			
			tallaDTO = (TallaDTO) ObjectDTO;
			listaArgs = new LinkedList<Object>();
			listaArgs.add(tallaDTO.getTalla());
		    this.ejecutaSentencia(sentencia, listaArgs);
		}

	@Override
	public void delete(String condicion) throws SQLException {
		//no se pueden borrar tallas. Acceso directo por bd 
	}

	@Override
	public GenericDTO read(String condicion) throws Exception {
		//no se puede leer una talla sólo
		return null;
	}

	@Override
	public void update(GenericDTO ObjectDTO) throws Exception {
		// No aplica. Clave = único valor
				
	}

	@Override
	public String getNombreDAO() {
		return ConstantesDAO.nombreTablaTalla;
	}

	@Override
	public GenericDTO componerObjeto(ResultSet rs) throws SQLException {
		TallaDTO tallaDTO = null;
		
		tallaDTO = new TallaDTO (rs.getString(ConstantesDAO.campoTallaTalla));
		
		return tallaDTO;
	}

	@Override
	public List<GenericDTO> recuperarTodos() throws Exception {
		
		List<GenericDTO> ldev = null;
		
		ldev = this.ejecutaConsultaMultiple(Consulta.ConsultarTallas, null);
		
		return ldev;
	}

	
}
