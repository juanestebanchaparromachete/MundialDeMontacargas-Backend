package mundo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OrdenDeCompra {

	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 *  numero asignado a la orden de compra por la compañia
	 */
	@XmlElement(name = "numeroOrdenDeCompra")
	private int numeroOrdenDeCompra;

	/**
	 * 	empleado que realiza la orden de compra
	 */
	@XmlElement(name = "empleadoEncargado")
	private Usuario empleadoEncargado;

	/**
	 * fecha en la que se realiza la orden de compra
	 */
	@XmlElement(name = "fecha")
	private Date fecha;

	/**
	 * proveedor que se le realiza la orden de compra
	 */
	@XmlElement(name = "proveedor")
	private Proveedor proveedor;

	/**
	 * forma de pago en la que se realiza el pago
	 */
	@XmlElement(name = "formaDePago")
	private String formaDePago;

	/**
	 * mondea en la que se realiza la factura
	 */
	@XmlElement(name = "moneda")
	private String moneda;

	/**
	 * determina si es una importacio o una compra nacional (no 0 y si es 1 ) 
	 */
	@XmlElement(name = "importacion")
	private int importacion;

	/**
	 * valor antes de iva de la factura
	 */
	@XmlElement(name = "subTotal")
	private double subTotal;

	/**
	 * iva asociado a la factura
	 */
	@XmlElement(name = "iva")
	private double iva;

	/**
	 * valor total de la factura iva incluido
	 */
	@XmlElement(name = "total")
	private double total;

	/**
	 * catidad de items totales
	 */
	@XmlElement(name = "cantidadItems")
	private int cantidadItems;

	/**
	 * lista de items asociados a la factura
	 */
	@XmlElement(name = "items")
	private List<String> items;

	/**
	 * lista de facturas de compra asociadas a la orden de compra
	 */
	@XmlElement(name = "facturasDeCompra")
	private List<String> facturasDeCompra;

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
			String formaDePago, String moneda, int importacion, double subtotal, double iva, double total,
			int cantidadItems, List<String> items, List<String> facturasDeCompra) {
		super();
		this.numeroOrdenDeCompra = numeroOrdenDeCompra;
		this.empleadoEncargado = empleadoEncargado;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.formaDePago = formaDePago;
		this.moneda = moneda;
		this.importacion = importacion;
		this.subTotal = subtotal;
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
	public int isImportacion() {
		return importacion;
	}

	/**
	 * @param importacion
	 */
	public void setImportacion(int importacion) {
		this.importacion = importacion;
	}

	/**
	 * @return
	 */
	public double getSubtotal() {
		return subTotal;
	}

	/**
	 * @param subtotal
	 */
	public void setSubtotal(double subtotal) {
		this.subTotal = subtotal;
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
	public List<String> getItems() {
		return items;
	}

	/**
	 * @param items
	 */
	public void setItems(List<String> items) {
		this.items = items;
	}

	/**
	 * @return
	 */
	public List<String> getFacturasDeCompra() {
		return facturasDeCompra;
	}

	/**
	 * @param facturasDeCompra
	 */
	public void setFacturasDeCompra(List<String> facturasDeCompra) {
		this.facturasDeCompra = facturasDeCompra;
	}

	/**
	 * @return
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}
}
