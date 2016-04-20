package modelo.persistencia.DTO;

import java.util.Calendar;

public class ReservaDTO extends GenericDTO {
	
	public String codReserva;
	public String tiendaOrigen;
	public String tiendaDestino;
	public String comentario;
	public Calendar fechaRecogida;
	public Calendar fechaReserva;
	public Calendar fechaCaducidad;
	public float senhal;
	public String estado;
	public String cliente;
	public String articulo;
	public String ticket;
	
	public String getCodReserva() {
		return codReserva;
	}
	public void setCodReserva(String codReserva) {
		this.codReserva = codReserva;
	}
	public String getTiendaOrigen() {
		return tiendaOrigen;
	}
	public void setTiendaOrigen(String tiendaOrigen) {
		this.tiendaOrigen = tiendaOrigen;
	}
	public String getTiendaDestino() {
		return tiendaDestino;
	}
	public void setTiendaDestino(String tiendaDestino) {
		this.tiendaDestino = tiendaDestino;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Calendar getFechaRecogida() {
		return fechaRecogida;
	}
	public void setFechaRecogida(Calendar fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
	public Calendar getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(Calendar fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public Calendar getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Calendar fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public float getSenhal() {
		return senhal;
	}
	public void setSenhal(float senhal) {
		this.senhal = senhal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public ReservaDTO(String codReserva, String tiendaOrigen,
			String tiendaDestino, String comentario, Calendar fechaRecogida,
			Calendar fechaReserva, Calendar fechaCaducidad, float senhal,
			String estado, String cliente, String articulo, String ticket) {
		
		this.codReserva = codReserva;
		this.tiendaOrigen = tiendaOrigen;
		this.tiendaDestino = tiendaDestino;
		this.comentario = comentario;
		this.fechaRecogida = fechaRecogida;
		this.fechaReserva = fechaReserva;
		this.fechaCaducidad = fechaCaducidad;
		this.senhal = senhal;
		this.estado = estado;
		this.cliente = cliente;
		this.articulo = articulo;
		this.ticket = ticket;
	}
	
	
	
}
