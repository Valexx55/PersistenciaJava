package modelo.persistencia.DTO;

import java.util.Calendar;

public class ArticuloDTO extends GenericDTO {
	
	public String idArticulo;
	public char rebajado;
	public float precioCoste;
	public float pvp;
	public float pvpRebajado;
	public String tipoArticulo;
	public char sexo;
	public int proveedor;
	public String refProveedor;
	public Calendar fechaCompra;
	public String descripcion;
	public String album;
	public String tejido;
	public String tallaje;
	public String marca;
	
	public ArticuloDTO(String idArticulo, char rebajado, float precioCoste,
			float pvp, float pvpRebajado, String tipoArticulo, char sexo,
			int proveedor, String refProveedor, Calendar fechaCompra,
			String descripcion, String album, String tejido, String tallaje,
			String marca) {
		
		this.idArticulo = idArticulo;
		this.rebajado = rebajado;
		this.precioCoste = precioCoste;
		this.pvp = pvp;
		this.pvpRebajado = pvpRebajado;
		this.tipoArticulo = tipoArticulo;
		this.sexo = sexo;
		this.proveedor = proveedor;
		this.refProveedor = refProveedor;
		this.fechaCompra = fechaCompra;
		this.descripcion = descripcion;
		this.album = album;
		this.tejido = tejido;
		this.tallaje = tallaje;
		this.marca = marca;
	}
	
	public String getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}
	public char getRebajado() {
		return rebajado;
	}
	public void setRebajado(char rebajado) {
		this.rebajado = rebajado;
	}
	public float getPrecioCoste() {
		return precioCoste;
	}
	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	public float getPvpRebajado() {
		return pvpRebajado;
	}
	public void setPvpRebajado(float pvpRebajado) {
		this.pvpRebajado = pvpRebajado;
	}
	public String getTipoArticulo() {
		return tipoArticulo;
	}
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getProveedor() {
		return proveedor;
	}
	public void setProveedor(int proveedor) {
		this.proveedor = proveedor;
	}
	public String getRefProveedor() {
		return refProveedor;
	}
	public void setRefProveedor(String refProveedor) {
		this.refProveedor = refProveedor;
	}
	public Calendar getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Calendar fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getTejido() {
		return tejido;
	}
	public void setTejido(String tejido) {
		this.tejido = tejido;
	}
	public String getTallaje() {
		return tallaje;
	}
	public void setTallaje(String tallaje) {
		this.tallaje = tallaje;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
