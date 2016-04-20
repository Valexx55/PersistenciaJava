package modelo.persistencia.DTO;

public class ProveedorDTO extends GenericDTO 
{
	
	public int idProveedor;
	public String nombre;
	public String direccion;
	public String telefono;
	public String email;
	public String skype;
	public String personaContacto;
	
	public ProveedorDTO(int idProveedor, String nombre, String direccion,
			String telefono, String email, String skype, String personaContacto) {
		
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.skype = skype;
		this.personaContacto = personaContacto;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getPersonaContacto() {
		return personaContacto;
	}

	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	

	
	
}
