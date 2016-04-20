package modelo.persistencia.DAO;

import java.util.List;
import modelo.persistencia.DTO.GenericDTO;


public interface Recuperable {
	
	
	List <GenericDTO> recuperarTodos () throws Exception;

}
