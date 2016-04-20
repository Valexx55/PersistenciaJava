package modelo.persistencia.DTO;

public class TiendaDTO extends GenericDTO {
	
	public String nombre;
	public String direccion;
	public String responsable;
	public String telefono;
	
	public TiendaDTO(String nombre, String direccion, String responsable,
			String telefono) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.responsable = responsable;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
