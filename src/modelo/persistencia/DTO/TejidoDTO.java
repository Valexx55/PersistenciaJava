package modelo.persistencia.DTO;

public class TejidoDTO extends GenericDTO {
	
	public String tejido;

	public String getTejido() {
		return tejido;
	}

	public void setTejido(String tejido) {
		this.tejido = tejido;
	}

	public TejidoDTO(String tejido) {
		this.tejido = tejido;
	}
	

}
