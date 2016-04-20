package modelo.persistencia.DTO;

import java.util.Calendar;

public class ArregloDTO extends GenericDTO {
	
	public String articulo;
	public Calendar fechaDeposito;
	public Calendar fechaEntrega;
	public String estado;
	public String cliente;
	public String codArreglo;
	public String descripcion;
	public String tienda;
	public float coste;
	public String ticket;
	public char pagado;
	
	
	
	public ArregloDTO (String articulo, Calendar fecha_deposito,
			Calendar fecha_entrega, String estado, String cliente,
			String cod_arreglo, String descripcion, String tienda, float coste,
			String ticket, char pagado) 
	{
		this.articulo = articulo;
		this.fechaDeposito = fecha_deposito;
		this.fechaEntrega = fecha_entrega;
		this.estado = estado;
		this.cliente = cliente;
		this.codArreglo = cod_arreglo;
		this.descripcion = descripcion;
		this.tienda = tienda;
		this.coste = coste;
		this.ticket = ticket;
		this.pagado = pagado;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public Calendar getFecha_deposito() {
		return fechaDeposito;
	}
	public void setFecha_deposito(Calendar fecha_deposito) {
		this.fechaDeposito = fecha_deposito;
	}
	public Calendar getFecha_entrega() {
		return fechaEntrega;
	}
	public void setFecha_entrega(Calendar fecha_entrega) {
		this.fechaEntrega = fecha_entrega;
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
	public String getCod_arreglo() {
		return codArreglo;
	}
	public void setCod_arreglo(String cod_arreglo) {
		this.codArreglo = cod_arreglo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public float getCoste() {
		return coste;
	}
	public void setCoste(float coste) {
		this.coste = coste;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public char getPagado() {
		return pagado;
	}
	public void setPagado(char pagado) {
		this.pagado = pagado;
	}
	
	

}
