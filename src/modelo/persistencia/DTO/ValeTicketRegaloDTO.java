package modelo.persistencia.DTO;

import java.util.Calendar;

public class ValeTicketRegaloDTO extends GenericDTO {
	
	public String codTicketDTO;
	public Calendar fechaCaducidad;
	public Calendar fechaEdicion;
	public float importeDTO;
	public String estado;
	public String ticketVenta;
	
	public String getCodTicketDTO() {
		return codTicketDTO;
	}
	public void setCodTicketDTO(String codTicketDTO) {
		this.codTicketDTO = codTicketDTO;
	}
	public Calendar getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Calendar fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public Calendar getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(Calendar fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public float getPorcentajeDTO() {
		return importeDTO;
	}
	public void setPorcentajeDTO(float porcentajeDTO) {
		this.importeDTO = porcentajeDTO;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTicketVenta() {
		return ticketVenta;
	}
	public void setTicketVenta(String ticketVenta) {
		this.ticketVenta = ticketVenta;
	}
	public ValeTicketRegaloDTO(String codTicketDTO, Calendar fechaCaducidad,
			Calendar fechaEdicion, float porcentajeDTO, String estado,
			String ticketVenta) {
		
		this.codTicketDTO = codTicketDTO;
		this.fechaCaducidad = fechaCaducidad;
		this.fechaEdicion = fechaEdicion;
		this.importeDTO = porcentajeDTO;
		this.estado = estado;
		this.ticketVenta = ticketVenta;
	}
	
	

}
