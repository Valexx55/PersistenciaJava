package modelo.persistencia.DTO;

import java.util.Calendar;

public class PeticionDTO extends GenericDTO {
	
	public String empleado;
	public Calendar fecha;
	public String estado;
	public String descripcion;
	public int idPeticion;
	
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIdPeticion() {
		return idPeticion;
	}
	public void setIdPeticion(int idPeticion) {
		this.idPeticion = idPeticion;
	}
	public PeticionDTO(String empleado, Calendar fecha, String estado,
			String descripcion, int idPeticion) {

		this.empleado = empleado;
		this.fecha = fecha;
		this.estado = estado;
		this.descripcion = descripcion;
		this.idPeticion = idPeticion;
	}
	
	
	

}
