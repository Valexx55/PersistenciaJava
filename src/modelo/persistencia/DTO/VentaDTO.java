package modelo.persistencia.DTO;

public class VentaDTO extends GenericDTO {

		public int idVenta;
		public String idTicket;
		public float importe;
		public String articulo;
		public int getIdVenta() {
			return idVenta;
		}
		public void setIdVenta(int idVenta) {
			this.idVenta = idVenta;
		}
		public String getIdTicket() {
			return idTicket;
		}
		public void setIdTicket(String idTicket) {
			this.idTicket = idTicket;
		}
		public float getImporte() {
			return importe;
		}
		public void setImporte(float importe) {
			this.importe = importe;
		}
		public String getArticulo() {
			return articulo;
		}
		public void setArticulo(String articulo) {
			this.articulo = articulo;
		}
		public VentaDTO(int idVenta, String idTicket, float importe,
				String articulo) {
			
			this.idVenta = idVenta;
			this.idTicket = idTicket;
			this.importe = importe;
			this.articulo = articulo;
		}
		
		
}
