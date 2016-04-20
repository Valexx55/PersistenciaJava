package modelo.persistencia.DTO;

public class StockDTO extends GenericDTO {

	public String articulo;
	public String tienda;
	public String talla;
	public String color;
	public int unidades;
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public StockDTO(String articulo, String tienda, String talla, String color,
			int unidades) {
		
		this.articulo = articulo;
		this.tienda = tienda;
		this.talla = talla;
		this.color = color;
		this.unidades = unidades;
	}
	
	
}
