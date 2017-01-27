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
public class FacturaDeVenta {

	@XmlElement(name = "id")
	private ObjectId id;
	/**
	 * numero asignado a la factura de venta por la compañia
	 */
	@XmlElement(name = "numeroFacturaDeVenta")
	private int numeroFacturaDeVenta;

	/**
	 * empleado encargado de la  factura de venta
	 */
	@XmlElement(name = "empleadoEncargado")
	private Usuario empleadoEncargado;

	/**
	 * fecha en la que se realiza la factura de venta
	 */
	@XmlElement(name = "fecha")
	private Date fecha;

	/**
	 * cliente que se le realiza la factura de venta
	 */
	@XmlElement(name = "cliente")
	private Cliente cliente;

	/**
	 * forma de pago en la que se realiza el pago
	 */
	@XmlElement(name = "formaDePago")
	private String formaDePago;

	/**
	 * mondea en la que se realiza  la factura
	 */
	@XmlElement(name = "moneda")
	private String moneda;

	/**
	 * valor antes de iva de la factura
	 */
	@XmlElement(name = "subtotal")
	private double subtotal;

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
			List<String> items) {
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
