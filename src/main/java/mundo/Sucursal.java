package mundo;

import java.util.List;

public class Sucursal {

	/**
	 * lista de las areas que pertenecen a la sucursal
	 */
	private List<Area> areas;

	/**
	 * cliente al cual le pertenece la sucursal
	 */
	private Cliente cliente;

	/**
	 * @param areas
	 * @param cliente
	 */
	public Sucursal(List<Area> areas, Cliente cliente) {
		super();
		this.areas = areas;
		this.cliente = cliente;
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
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
