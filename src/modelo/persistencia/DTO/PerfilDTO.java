package modelo.persistencia.DTO;

public class PerfilDTO extends GenericDTO {
	
	public int perfil;
	public String empleado;
	public String descripcion;
	
	public int getPerfil() {
		return perfil;
	}
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public PerfilDTO(int perfil, String empleado, String descripcion) {
		
		this.perfil = perfil;
		this.empleado = empleado;
		this.descripcion = descripcion;
	}
	
	

}
