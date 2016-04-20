package modelo.persistencia.DAO;

public abstract class ConstantesDAO {

	
	
	public final static char caracterParametro = '#';
	
	public static final String nombreTablaTalla = "talla";
	public static final String campoTallaTalla = "talla";
	
	public static final String nombreTablaTipoArticulo = "tipo_articulo";
	public static final String campoClaveTipoArticulo = "nombre";
	
	public static final String nombreTablaTipoPsicologico = "tipo_psicologico";
	public static final String campoClaveTipoPsicologico = "articulo";
	public static final String campoTioRinTipoPsicologico = "tio_rin";
	public static final String campoPutonTipoPsicologico = "puton";
	public static final String campoPijinTipoPsicologico = "pijin";
	public static final String campoMarujaTipoPsicologico = "maruja";
	public static final String campoClasicoTipoPsicologico = "tio_rin";
	public static final String campoModernoTipoPsicologico = "moderno";
	
	
	public static final String nombreTablaProveedor = "proveedor";
	public static final String campoClaveProveedor = "idproveedor";
	public static final String campoNombreProveedor = "nombre";
	public static final String campoDireccionProveedor = "direccion";
	public static final String campoTelefonoProveedor = "telefono";
	public static final String campoEmailProveedor = "email";
	public static final String campoSkypeProveedor = "skype";
	public static final String campoPersonaContactoProveedor = "persona_contacto";
	
		
	public static final String nombreTablaArticulo = "articulo";
	public static final String campoClaveArticulo = "idarticulo";
	public static final String campoPrecioCosteArticulo = "precio_coste";
	public static final String campoPVPArticulo = "pvp";
	public static final String campoRebajadoArticulo = "rebajado";
	public static final String campoPVPRebajaArticulo = "pvp_rebaja";
	public static final String campoTipoArticuloArticulo = "tipoArticulo";
	public static final String campoSexoArticulo = "sexo";
	public static final String campoProveedorArticulo = "proveedor";
	public static final String campoFechaCompraArticulo = "fecha_compra";
	public static final String campoDescripcionArticulo = "descripcion";
	public static final String campoRefProveedorArticulo = "ref_proveedor";
	public static final String campoAlbumArticulo = "album";
	public static final String campoMarcaArticulo = "marca";
	public static final String campoTallajeArticulo = "tallaje";
	public static final String campoTejidoArticulo = "tejido";
	
	
	
	public static final String nombreTablaVenta = "venta";
	public static final String campoClaveVenta = "idventa";
	public static final String campoArticuloVenta = "articulo";
	public static final String campoImporteVenta = "importe";
	public static final String campoTicketVenta = "ticket";
	
	public static final String nombreTablaCliente = "cliente";
	public static final String campoClaveCliente = "idcliente";
	public static final String campoSexoCliente = "sexo";
	public static final String campoFechaNacimientoCliente = "fecha_nacimiento";
	public static final String campoNombreCliente = "nombre";
	public static final String campoTelefonoCliente = "telefono";
	public static final String campoEmailCliente = "email";
	
	public static final String nombreTablaTara = "tara";
	public static final String campoClaveTara = "idtara";
	public static final String campoArticuloTara = "articulo";
	public static final String campoTiendaTara = "tienda";
	public static final String campoDescripcionTara = "descripcion";
	public static final String campoFechaIdTara = "fecha_identificacion";
	public static final String campoEstadoTara = "estado";

	
	public static final String nombreTablaTejido = "tejido";
	public static final String campoClaveTejido = "tejido";
	
	public static final String nombreTablaStock = "stock";
	public static final String campoArticuloStock = "articulo";
	public static final String campoColorStock = "color";
	public static final String campoTallaStock = "talla";
	public static final String campoUnidadesStock = "unidades";
	public static final String campoTiendaStock = "tienda";
	
	
	
	public static final String nombreTablaColor = "color";
	public static final String campoClaveColor = "cod_color";
	public static final String campoDescripcionColor = "descripcion";
	
	
	
	
	
	
	public static final String nombreTablaArreglo = "arreglo";
	public static final String campoClaveArreglo = "cod_arreglo";
	public static final String campoTicketArreglo = "ticket";
	public static final String campoPagadoArreglo = "pagado";
	public static final String campoCosteArreglo = "coste";
	public static final String campoDescripcionArreglo = "descripcion";
	public static final String campoTiendaArreglo = "tienda";
	public static final String campoClienteArreglo = "cliente";
	public static final String campoEstadoArreglo = "estado";
	public static final String campoFechaEntregaArreglo = "fecha_entrega";
	public static final String campoFechaDepositoArreglo = "fecha_deposito";
	public static final String campoArticuloArreglo = "articulo";
	
	
	
	public static final String nombreTablaTienda = "tienda";
	public static final String campoClaveTienda = "nombre";
	public static final String campoDireccionTienda = "direccion";
	public static final String campoResponsableTienda = "responsable";
	public static final String campoTelefonoTienda= "telefono";
	
	
	public static final String nombreTablaTicket = "ticket";
	public static final String campoClaveTicket = "idticket";
	public static final String campoFechaTicket = "fecha";
	public static final String campoImporteTotalTicket = "importe_total";
	public static final String campoImporteEfectivoTicket = "importe_efectivo";
	public static final String campoImporteTarjetaTicket = "importe_tarjeta";
	public static final String campoEmpleadoTicket = "empleado";
	public static final String campoClienteTicket = "cliente";
	public static final String campoTiendaTicket = "tienda";
	

	public static final String nombreTablaPerfil = "perfil";
	public static final String campoClavePerfil = "perfil";
	public static final String campoUsuarioPerfil = "usuario";
	public static final String campoDescripcionPerfil = "descripcion";
	
	public static final String nombreTablaEmpleado = "empleado";
	public static final String campoClaveEmpleado = "usuario";
	public static final String campoNombreEmpleado = "nombre";
	public static final String campoTelefonoEmpleado = "telefono";
	public static final String campoDireccionEmpleado = "direccion";
	public static final String campoEmailEmpleado = "email";
	public static final String campoPasswordEmpleado = "password";
	
	
	
	public static final String nombreTablaSaldo = "saldo";
	public static final String campoClaveSaldo= "tienda";
	public static final String campoSaldoSaldo= "saldo";
	
	
	
	public static final String nombreTablaPeticiones = "peticiones";
	public static final String campoClavePeticion= "id_peticion";
	public static final String campoEmpleadoPeticion= "empleado";
	public static final String campoFechaPeticion= "fecha";
	public static final String campoDescripcionPeticion= "descripcion";
	public static final String campoEstadoPeticion= "estado";
	
	
	public static final String nombreTablaComisionesActual = "comisiones_actual";
	public static final String campoClaveComisionesActual = "empleado";
	public static final String campoMesComisionesActual = "mes";
	public static final String campoComisionComisionesActual = "comision";
	public static final String campoNumVentasComisionesActual = "num_ventas";
	
	
	
	public static final String nombreTablaComisionesHistorico = "comisiones_historico";
	public static final String campoEmpleadoComisionesHistorico = "empleado";
	public static final String campoFechaComisionesHistorico  = "fecha";
	public static final String campoComisionComisionesHistorico  = "comision";
	public static final String campoNumVentasComisionesHistorico  = "num_ventas";
	
	public static final String nombreTablaValeDTO = "vale_dto";
	public static final String campoCodTicketValeDto  = "cod_ticket";
	public static final String campoFechaEdicionValeDto  = "fecha_edicion";
	public static final String campoFechaCaducidadValeDto  = "fecha_caducidad";
	public static final String campoPorcentajeDtoValeDto  = "porcentaje_dto";
	public static final String campoEstadoValeDto  = "estado";
	public static final String campoTicketVentaValeDto  = "ticket_venta";
	
	public static final String nombreTablaValeTicketRegalo = "vale_ticket_regalo";
	public static final String campoCodTicketTicketRegalo  = "cod_ticket";
	public static final String campoFechaEdicionTicketRegalo  = "fecha_edicion";
	public static final String campoFechaCaducidadTicketRegalo  = "fecha_caducidad";
	public static final String campoImporteTicketRegalo  = "importe";
	public static final String campoEstadoTicketRegalo  = "estado";
	public static final String campoTicketVentaTicketRegalo  = "ticket_venta";
	
	public static final String nombreTablaResumenVentasDiario = "resumen_ventas_diario";
	public static final String campoTiendaResumenVentasDiario = "tienda";
	public static final String campoFechaResumenVentasDiario = "fecha";
	public static final String campoImporteTarjetaResumenVentasDiario = "importe_tarjeta";
	public static final String campoImporteEfectivoResumenVentasDiario = "importe_efectivo";
	
	public static final String nombreTablaReserva = "reserva";
	public static final String campoReservaReserva = "cod_reserva";
	public static final String campoTiendaOrigenReserva = "tienda_origen";
	public static final String campoTiendaDestinoReserva = "tienda_destino";
	public static final String campoComentarioReserva = "comentario";
	public static final String campoFechaReservaReserva = "fecha_reserva";
	public static final String campoFechaRecogidaReserva = "fecha_recogida";
	public static final String campoFechaCaducidadReserva = "fecha_caducidad";
	
	
	
	
}
