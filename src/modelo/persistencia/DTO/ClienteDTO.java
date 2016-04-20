package modelo.persistencia.DTO;

import java.util.Calendar;

public class ClienteDTO extends GenericDTO {
	
	public String idCliente;
	public String email;
	public String telefono;
	public String nombre;
	public Calendar fecha;
	public char sexo;
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public ClienteDTO(String idCliente, String email, String telefono,
			String nombre, Calendar fecha, char sexo) {
		
		this.idCliente = idCliente;
		this.email = email;
		this.telefono = telefono;
		this.nombre = nombre;
		this.fecha = fecha;
		this.sexo = sexo;
	}
	
	
	

}
