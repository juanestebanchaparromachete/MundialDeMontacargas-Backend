package mundo;

import java.util.Date;
import java.util.List;

public class FacturaDeVenta {

	/**
	 * numero asignado a la factura de venta por la compañia
	 */
	private int numeroFacturaDeVenta;

	/**
	 * empleado encargado de la  factura de venta
	 */
	private Usuario empleadoEncargado;

	/**
	 * fecha en la que se realiza la factura de venta
	 */
	private Date fecha;

	/**
	 * cliente que se le realiza la factura de venta
	 */
	private Cliente cliente;

	/**
	 * forma de pago en la que se realiza el pago
	 */
	private String formaDePago;

	/**
	 * mondea en la que se realiza  la factura
	 */
	private String moneda;

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
	 * @param numeroFacturaDeVenta
	 * @param empleadoEncargadoario
	 * @param fecha
	 * @param cliente
	 * @param direccion
	 * @param formaDePago
	 * @param moneda
	 * @param subtotal
	 * @param iva
	 * @param total
	 * @param cantidadItems
	 * @param items
	 */
	public FacturaDeVenta(int numeroFacturaDeVenta, Usuario empleadoEncargado, Date fecha, Cliente cliente, 
			String formaDePago, String moneda, double subtotal, double iva, double total, int cantidadItems,
			List<Item> items) {
		super();
		this.numeroFacturaDeVenta = numeroFacturaDeVenta;
		this.empleadoEncargado = empleadoEncargado;
		this.fecha = fecha;
		this.cliente = cliente;
		this.formaDePago = formaDePago;
		this.moneda = moneda;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.cantidadItems = cantidadItems;
		this.items = items;
	}

	/**
	 * @return
	 */
	public int getNumeroFacturaDeVenta() {
		return numeroFacturaDeVenta;
	}

	/**
	 * @param numeroFacturaDeVenta
	 */
	public void setNumeroFacturaDeVenta(int numeroFacturaDeVenta) {
		this.numeroFacturaDeVenta = numeroFacturaDeVenta;
	}

	/**
	 * @return
	 */
	public Usuario getempleadoEncargadoario() {
		return empleadoEncargado;
	}

	/**
	 * @param empleadoEncargadoario
	 */
	public void setempleadoEncargadoario(Usuario empleadoEncargado) {
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
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
