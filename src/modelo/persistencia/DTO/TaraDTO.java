package modelo.persistencia.DTO;

import java.util.Calendar;

public class TaraDTO extends GenericDTO {
	
	public int idTara;
	public String descripcion;
	public String tienda;
	public Calendar fechaId;
	public String articulo;
	public String estado;
	public int getIdTara() {
		return idTara;
	}
	public void setIdTara(int idTara) {
		this.idTara = idTara;
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
	public Calendar getFechaId() {
		return fechaId;
	}
	public void setFechaId(Calendar fechaId) {
		this.fechaId = fechaId;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public TaraDTO(int idTara, String descripcion, String tienda,
			Calendar fechaId, String articulo, String estado) {
		
		this.idTara = idTara;
		this.descripcion = descripcion;
		this.tienda = tienda;
		this.fechaId = fechaId;
		this.articulo = articulo;
		this.estado = estado;
	}
	
	

}
