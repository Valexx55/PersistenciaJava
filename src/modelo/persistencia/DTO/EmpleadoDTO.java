package modelo.persistencia.DTO;

public class EmpleadoDTO extends GenericDTO {
	
	
	public String usuario;
	public String nombre;
	public String telefono;
	public String direccion;
	public String email;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmpleadoDTO(String usuario, String nombre, String telefono,
			String direccion, String email) {

		this.usuario = usuario;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}

	
}
