package modelo.persistencia.DTO;

public class ColorDTO extends GenericDTO {
	
	public String codColor;
	public String descripcion;
	
	public String getCodColor() {
		return codColor;
	}
	public void setCodColor(String codColor) {
		this.codColor = codColor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ColorDTO(String codColor, String descripcion) {
		this.codColor = codColor;
		this.descripcion = descripcion;
	}
	

	
}
