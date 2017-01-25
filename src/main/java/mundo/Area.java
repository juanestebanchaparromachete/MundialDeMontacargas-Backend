package mundo;

import java.util.List;

public class Area {

	/**
	 * sucursal del cliente  a la cual se encuentra asociada el area
	 */
	private Sucursal sucursal;
	
	/**
	 * empleado encargado de los activos fijos que se encuentren en el area 
	 */
	private Usuario empleadoEncargado;
	
	/**
	 * 
	 */
	private Remision remision; // revisar este atributo no lo considero necesario 
	
	/**
	 * activos fijos que se encuentran en el area
	 */
	private List<ActivoFijo> activosFijos;

	/**
	 * @param sucursal
	 * @param empleadoEncargado
	 * @param remision
	 * @param activosFijos
	 */
	public Area(Sucursal sucursal, Usuario empleadoEncargado, Remision remision, List<ActivoFijo> activosFijos) {
		super();
		this.sucursal = sucursal;
		this.empleadoEncargado = empleadoEncargado;
		this.remision = remision;
		this.activosFijos = activosFijos;
	}

	/**
	 * @return
	 */
	public Sucursal getSucursal() {
		return sucursal;
	}

	/**
	 * @param sucursal
	 */
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
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
	public Remision getRemision() {
		return remision;
	}

	/**
	 * @param remision
	 */
	public void setRemision(Remision remision) {
		this.remision = remision;
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

}
