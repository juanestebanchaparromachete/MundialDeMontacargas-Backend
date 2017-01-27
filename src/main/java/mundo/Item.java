package mundo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
	
	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 * unidades del repuesto asociado
	 */
	@XmlElement(name = "cantidad")
	private int cantidad;

	/**
	 * valor total del item cantidades*valorUnitario
	 */
	@XmlElement(name = "valorTotal")
	private double valorTotal;

	/**
	 * Repuesto asociado al item
	 */
	@XmlElement(name = "repuesto")
	private Repuesto repuesto;

	/**
	 * remision a la que se encuentra asociado el item
	 */
	@XmlElement(name = "salidaDeAlmacen")
	private Remision salidaDelAlmacen; 

	/**
	 * factura de venta  a la cual se encuentra asociado el item
	 */
	@XmlElement(name = "facturaDeVenta")
	private FacturaDeVenta facturaDeVenta;

	/**
	 * factura de compra a la cual se encuentra asociado el item
	 */
	@XmlElement(name = "facturaDeCompra")
	private FacturaDeCompra facturaDeCompra;

	/**
	 * devolucion a la cual se encuentra asociada el item
	 */
	@XmlElement(name = "devolucion")
	private Devolucion devolucion;

	/**
	 * orden de compra a la cual se encuentra asociada el item
	 */
	@XmlElement(name = "ordenDeCompra")
	private OrdenDeCompra ordenDeCompra;

	/**
	 * @param cantidad
	 * @param valortotal
	 * @param repuesto
	 * @param salidaDelAlmacen
	 * @param facturaDeVenta
	 * @param facturaDeCompra
	 * @param devolucion
	 * @param ordenDeCompra
	 */
	public Item(int cantidad, double valortotal, Repuesto repuesto, Remision salidaDelAlmacen,
			FacturaDeVenta facturaDeVenta, FacturaDeCompra facturaDeCompra, Devolucion devolucion,
			OrdenDeCompra ordenDeCompra) {
		super();
		this.cantidad = cantidad;
		this.valorTotal = valortotal;
		this.repuesto = repuesto;
		this.salidaDelAlmacen = salidaDelAlmacen;
		this.facturaDeVenta = facturaDeVenta;
		this.facturaDeCompra = facturaDeCompra;
		this.devolucion = devolucion;
		this.ordenDeCompra = ordenDeCompra;
	}

	/**
	 * @return
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return
	 */
	public double getValortotal() {
		return valorTotal;
	}

	/**
	 * @param valortotal
	 */
	public void setValortotal(double valortotal) {
		this.valorTotal = valortotal;
	}

	/**
	 * @return
	 */
	public Repuesto getRepuesto() {
		return repuesto;
	}

	/**
	 * @param repuesto
	 */
	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}

	/**
	 * @return
	 */
	public Remision getSalidaDelAlmacen() {
		return salidaDelAlmacen;
	}

	/**
	 * @param salidaDelAlmacen
	 */
	public void setSalidaDelAlmacen(Remision salidaDelAlmacen) {
		this.salidaDelAlmacen = salidaDelAlmacen;
	}

	/**
	 * @return
	 */
	public FacturaDeVenta getFacturaDeVenta() {
		return facturaDeVenta;
	}

	/**
	 * @param facturaDeVenta
	 */
	public void setFacturaDeVenta(FacturaDeVenta facturaDeVenta) {
		this.facturaDeVenta = facturaDeVenta;
	}

	/**
	 * @return
	 */
	public FacturaDeCompra getFacturaDeCompra() {
		return facturaDeCompra;
	}

	/**
	 * @param facturaDeCompra
	 */
	public void setFacturaDeCompra(FacturaDeCompra facturaDeCompra) {
		this.facturaDeCompra = facturaDeCompra;
	}

	/**
	 * @return
	 */
	public Devolucion getDevolucion() {
		return devolucion;
	}

	/**
	 * @param devolucion
	 */
	public void setDevolucion(Devolucion devolucion) {
		this.devolucion = devolucion;
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
