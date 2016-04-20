package modelo.persistencia.DTO;

import java.util.Calendar;

public class TicketDTO extends GenericDTO {
	
	public String idTicket;
	public Calendar fecha;
	public float importeTotal;
	public float importeTarjeta;
	public float importeEfectivo;
	public String tienda;
	public String empleado;
	public String cliente;
	public String getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public float getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(float importeTotal) {
		this.importeTotal = importeTotal;
	}
	public float getImporteTarjeta() {
		return importeTarjeta;
	}
	public void setImporteTarjeta(float importeTarjeta) {
		this.importeTarjeta = importeTarjeta;
	}
	public float getImporteEfectivo() {
		return importeEfectivo;
	}
	public void setImporteEfectivo(float importeEfectivo) {
		this.importeEfectivo = importeEfectivo;
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public TicketDTO(String idTicket, Calendar fecha, float importeTotal,
			float importeTarjeta, float importeEfectivo, String tienda,
			String empleado, String cliente) {
		
		this.idTicket = idTicket;
		this.fecha = fecha;
		this.importeTotal = importeTotal;
		this.importeTarjeta = importeTarjeta;
		this.importeEfectivo = importeEfectivo;
		this.tienda = tienda;
		this.empleado = empleado;
		this.cliente = cliente;
	}
	
	
	

}
