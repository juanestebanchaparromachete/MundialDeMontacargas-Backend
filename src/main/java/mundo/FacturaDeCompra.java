package mundo;

import java.util.Date;
import java.util.List;


public class FacturaDeCompra {

	/**
	 * numero asignado a la factura de compra por la compañia
	 */
	private int numeroFacturaDeCompra;

	/**
	 * 	empleado que realiza la factura de compra
	 */
	private Usuario empleadoEncargado;

	/**
	 * fecha en la que se realiza la factura de compra
	 */
	private Date fecha;

	/**
	 * proveedor que se le realiza la factura de compra
	 */
	private Proveedor proveedor;

	/**
	 * orden de compra asociada  a la factura de compra
	 */
	private OrdenDeCompra ordenDeCompra;

	/**
	 * forma de pago en la que se realiza el pago
	 */
	private String formaDePago;

	/**
	 * mondea en la que se realiza  la factura
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
	 * @param numeroFacturaDeCompra
	 * @param empleadoEncargado
	 * @param fecha
	 * @param proveedor
	 * @param ordenDeCompra
	 * @param formaDePago
	 * @param moneda
	 * @param importacion
	 * @param subtotal
	 * @param iva
	 * @param total
	 * @param cantidadItems
	 * @param items
	 */
	public FacturaDeCompra(int numeroFacturaDeCompra, Usuario empleadoEncargado, Date fecha, Proveedor proveedor,
			OrdenDeCompra ordenDeCompra, String formaDePago, String moneda, boolean importacion,
			double subtotal, double iva, double total, int cantidadItems, List<Item> items) {
		super();
		this.numeroFacturaDeCompra = numeroFacturaDeCompra;
		this.empleadoEncargado = empleadoEncargado;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.ordenDeCompra = ordenDeCompra;
		this.formaDePago = formaDePago;
		this.moneda = moneda;
		this.importacion = importacion;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.cantidadItems = cantidadItems;
		this.items = items;
	}

	/**
	 * @return
	 */
	public int getNumeroFacturaDeCompra() {
		return numeroFacturaDeCompra;
	}

	/**
	 * @param numeroFacturaDeCompra
	 */
	public void setNumeroFacturaDeCompra(int numeroFacturaDeCompra) {
		this.numeroFacturaDeCompra = numeroFacturaDeCompra;
	}

	/**
	 * @return
	 */
	public Usuario getempleadoEncargado() {
		return empleadoEncargado;
	}

	/**
	 * @param empleadoEncargado
	 */
	public void setempleadoEncargado(Usuario empleadoEncargado) {
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
	public OrdenDeCompra getOrdenDeCompra() {
		return ordenDeCompra;
	}

	/**
	 * @param ordenDeCompra
	 */
	public void setOrdenDeCompra(OrdenDeCompra ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
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

}
