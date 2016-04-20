package modelo.persistencia.DTO;

public class TipoPsicologicoDTO extends GenericDTO {
	
	public String articulo;
	public float tioRin;
	public float maruja;
	public float puton;
	public float pijin;
	public float clasico;
	public float moderno;
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public float getTioRin() {
		return tioRin;
	}
	public void setTioRin(float tioRin) {
		this.tioRin = tioRin;
	}
	public float getMaruja() {
		return maruja;
	}
	public void setMaruja(float maruja) {
		this.maruja = maruja;
	}
	public float getPuton() {
		return puton;
	}
	public void setPuton(float puton) {
		this.puton = puton;
	}
	public float getPijin() {
		return pijin;
	}
	public void setPijin(float pijin) {
		this.pijin = pijin;
	}
	public float getClasico() {
		return clasico;
	}
	public void setClasico(float clasico) {
		this.clasico = clasico;
	}
	public float getModerno() {
		return moderno;
	}
	public void setModerno(float moderno) {
		this.moderno = moderno;
	}
	public TipoPsicologicoDTO(String articulo, float tioRin, float maruja,
			float puton, float pijin, float clasico, float moderno) {
		
		this.articulo = articulo;
		this.tioRin = tioRin;
		this.maruja = maruja;
		this.puton = puton;
		this.pijin = pijin;
		this.clasico = clasico;
		this.moderno = moderno;
	}
	
	

}
