package modelo.persistencia.DTO;

public class TipoArticuloDTO extends GenericDTO {
	
	public String tipoArticulo;

	public String getTipoArticulo() {
		return tipoArticulo;
	}

	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}

	public TipoArticuloDTO(String tipoArticulo) {
		
		this.tipoArticulo = tipoArticulo;
	}
	
	

}
