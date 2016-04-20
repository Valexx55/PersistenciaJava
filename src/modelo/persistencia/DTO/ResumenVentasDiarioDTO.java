package modelo.persistencia.DTO;

import java.util.Calendar;

public class ResumenVentasDiarioDTO extends GenericDTO {
	
	public String tienda;
	public Calendar fecha;
	public float importeTarjeta;
	public float importeEfectivo;
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
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
	public ResumenVentasDiarioDTO(String tienda, Calendar fecha,
			float importeTarjeta, float importeEfectivo) {
		
		this.tienda = tienda;
		this.fecha = fecha;
		this.importeTarjeta = importeTarjeta;
		this.importeEfectivo = importeEfectivo;
	}
	
	

}
