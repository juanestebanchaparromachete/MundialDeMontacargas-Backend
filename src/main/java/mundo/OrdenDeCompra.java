package mundo;

import java.util.Date;
import java.util.List;

public class OrdenDeCompra {

	/**
	 *  numero asignado a la orden de compra por la compañia
	 */
	private int numeroOrdenDeCompra;

	/**
	 * 	empleado que realiza la orden de compra
	 */
	private Usuario empleadoEncargado;

	/**
	 * fecha en la que se realiza la orden de compra
	 */
	private Date fecha;

	/**
	 * proveedor que se le realiza la orden de compra
	 */
	private Proveedor proveedor;

	/**
	 * forma de pago en la que se realiza el pago
	 */
	private String formaDePago;

	/**
	 * mondea en la que se realiza la factura
	 */
	private String moneda;

	/**
	 * determina si es una importacio o una compra nacional
	 */
	private boolean importacion;

	/**
	 * valor antes de iva de la factura
	 */
	private double subtotal;

	/**
	 * iva asociado a la factura
	 */
	private double iva;

	/**
	 * valor total de la factura iva incluido
	 */
	private double total;

	/**
	 * catidad de items totales
	 */
	private int cantidadItems;

	/**
	 * lista de items asociados a la factura
	 */
	private List<Item> items;

	/**
	 * lista de facturas de compra asociadas a la orden de compra
	 */
	private List<FacturaDeCompra> facturasDeCompra;

	/**
	 * @param numeroOrdenDeCompra
	 * @param empleadoEncargado
	 * @param fecha
	 * @param proveedor
	 * @param formaDePago
	 * @param moneda
	 * @param importacion
	 * @param subtotal
	 * @param iva
	 * @param total
	 * @param cantidadItems
	 * @param items
	 * @param facturasDeCompra
	 */
	public OrdenDeCompra(int numeroOrdenDeCompra, Usuario empleadoEncargado, Date fecha, Proveedor proveedor,
			String formaDePago, String moneda, boolean importacion, double subtotal, double iva, double total,
			int cantidadItems, List<Item> items, List<FacturaDeCompra> facturasDeCompra) {
		super();
		this.numeroOrdenDeCompra = numeroOrdenDeCompra;
		this.empleadoEncargado = empleadoEncargado;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.formaDePago = formaDePago;
		this.moneda = moneda;
		this.importacion = importacion;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.cantidadItems = cantidadItems;
		this.items = items;
		this.facturasDeCompra = facturasDeCompra;
	}

	/**
	 * @return
	 */
	public int getNumeroOrdenDeCompra() {
		return numeroOrdenDeCompra;
	}

	/**
	 * @param numeroOrdenDeCompra
	 */
	public void setNumeroOrdenDeCompra(int numeroOrdenDeCompra) {
		this.numeroOrdenDeCompra = numeroOrdenDeCompra;
	}

	/**
	 * @return
	 */
	public Usuario getEmpleadoEncargado() {
		return empleadoEncargado;
	}

	/**
	 * @param empleadoEncargado
	 */
	public void setEmpleadoEncargado(Usuario empleadoEncargado) {
		this.empleadoEncargado = empleadoEncargado;
	}

	/**
	 * @return
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return
	 */
	public String getFormaDePago() {
		return formaDePago;
	}

	/**
	 * @param formaDePago
	 */
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	/**
	 * @return
	 */
	public String getMoneda() {
		return moneda;
	}

	/**
	 * @param moneda
	 */
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	/**
	 * @return
	 */
	public boolean isImportacion() {
		return importacion;
	}

	/**
	 * @param importacion
	 */
	public void setImportacion(boolean importacion) {
		this.importacion = importacion;
	}

	/**
	 * @return
	 */
	public double getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * @param iva
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * @return
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return
	 */
	public int getCantidadItems() {
		return cantidadItems;
	}

	/**
	 * @param cantidadItems
	 */
	public void setCantidadItems(int cantidadItems) {
		this.cantidadItems = cantidadItems;
	}

	/**
	 * @return
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * @return
	 */
	public List<FacturaDeCompra> getFacturasDeCompra() {
		return facturasDeCompra;
	}

	/**
	 * @param facturasDeCompra
	 */
	public void setFacturasDeCompra(List<FacturaDeCompra> facturasDeCompra) {
		this.facturasDeCompra = facturasDeCompra;
	}

}
