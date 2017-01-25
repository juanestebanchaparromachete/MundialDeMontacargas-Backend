package mundo;

import java.util.Date;
import java.util.List;

public class Remision {

	/**
	 *  numero asignado a la remision por la compañia
	 */
	private int numeroRemision;

	/**
	 * numero de la orden de trabajo 
	 */
	private int numeroOrdenDeTrabajo;

	/**
	 * empleado que realiza la remision
	 */
	private Usuario empleadoEncargado;

	/**
	 * fecha en la que se realiza la remision
	 */
	private Date fecha;

	/**
	 * cliente al cual se le realiza la remision de una salida del almacen 
	 */
	private Cliente cliente;

	/**
	 * numero de items  en al remision
	 */
	private int cantidadItems;

	/**
	 * lista de activos fijos de la remision
	 */
	private List<ActivoFijo> activosFijos;

	/**
	 * lista de areas donde van a ir los activod fijos
	 */
	private List<Area> areas;

	/**
	 * lista de devoluciones asociadas a esta remision
	 */
	private List<Devolucion> devoluciones;

	/**
	 * lista de items que se encuentran en la remision
	 */
	private List<Item> items;

	/**
	 * @param numeroRemision
	 * @param numeroOrdenDeTrabajo
	 * @param empleadoEncargado
	 * @param fecha
	 * @param cliente
	 * @param cantidadItems
	 * @param activosFijos
	 * @param areas
	 * @param devoluciones
	 * @param items
	 */
	public Remision(int numeroRemision, int numeroOrdenDeTrabajo, Usuario empleadoEncargado, Date fecha,
			Cliente cliente, int cantidadItems, List<ActivoFijo> activosFijos, List<Area> areas,
			List<Devolucion> devoluciones, List<Item> items) {
		super();
		this.numeroRemision = numeroRemision;
		this.numeroOrdenDeTrabajo = numeroOrdenDeTrabajo;
		this.empleadoEncargado = empleadoEncargado;
		this.fecha = fecha;
		this.cliente = cliente;
		this.cantidadItems = cantidadItems;
		this.activosFijos = activosFijos;
		this.areas = areas;
		this.devoluciones = devoluciones;
		this.items = items;
	}

	/**
	 * @return
	 */
	public int getNumeroRemision() {
		return numeroRemision;
	}

	/**
	 * @param numeroRemision
	 */
	public void setNumeroRemision(int numeroRemision) {
		this.numeroRemision = numeroRemision;
	}

	/**
	 * @return
	 */
	public int getNumeroOrdenDeTrabajo() {
		return numeroOrdenDeTrabajo;
	}

	/**
	 * @param numeroOrdenDeTrabajo
	 */
	public void setNumeroOrdenDeTrabajo(int numeroOrdenDeTrabajo) {
		this.numeroOrdenDeTrabajo = numeroOrdenDeTrabajo;
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
	public List<ActivoFijo> getActivosFijos() {
		return activosFijos;
	}

	/**
	 * @param activosFijos
	 */
	public void setActivosFijos(List<ActivoFijo> activosFijos) {
		this.activosFijos = activosFijos;
	}

	/**
	 * @return
	 */
	public List<Area> getAreas() {
		return areas;
	}

	/**
	 * @param areas
	 */
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	/**
	 * @return
	 */
	public List<Devolucion> getDevoluciones() {
		return devoluciones;
	}

	/**
	 * @param devoluciones
	 */
	public void setDevoluciones(List<Devolucion> devoluciones) {
		this.devoluciones = devoluciones;
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
