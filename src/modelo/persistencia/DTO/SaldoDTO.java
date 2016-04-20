package modelo.persistencia.DTO;

public class SaldoDTO extends GenericDTO {
	
	public String tienda;
	public float saldo;
	
	
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public SaldoDTO(String tienda, float saldo) {
		
		this.tienda = tienda;
		this.saldo = saldo;
	}
	
	

}
