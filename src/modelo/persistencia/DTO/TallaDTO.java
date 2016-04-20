package modelo.persistencia.DTO;

public class TallaDTO extends GenericDTO {
	
	
	public String talla;
	
	public TallaDTO (String talla)
	{
		this.talla = talla;
	}

		
	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}


}
