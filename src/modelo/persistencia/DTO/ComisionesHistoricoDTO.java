package modelo.persistencia.DTO;

import java.util.Calendar;

public class ComisionesHistoricoDTO  extends GenericDTO {
	
	public String empleado;
	public Calendar mes;
	public float comisiones;
	public int numVentas;
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public Calendar getMes() {
		return mes;
	}
	public void setMes(Calendar mes) {
		this.mes = mes;
	}
	public float getComisiones() {
		return comisiones;
	}
	public void setComisiones(float comisiones) {
		this.comisiones = comisiones;
	}
	public int getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	public ComisionesHistoricoDTO(String empleado, Calendar mes, float comisiones,
			int numVentas) {
		
		this.empleado = empleado;
		this.mes = mes;
		this.comisiones = comisiones;
		this.numVentas = numVentas;
	}

}
