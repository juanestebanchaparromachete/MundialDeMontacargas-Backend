package mundo;

import java.util.List;

public class HojaDeVida {

	
	/**
	 * activo fijo asociado a la hoja de vida
	 */
	private ActivoFijo activoFijo;
	
	/**
	 * infromes que pertenecen a la infromacion de la hoja de vida
	 */
	private List<Informe> informes;
	
	/**
	 * @param activoFijo
	 * @param informes
	 */
	public HojaDeVida(ActivoFijo activoFijo, List<Informe> informes) {
		super();
		this.activoFijo = activoFijo;
		this.informes = informes;
	}

	/**
	 * @return
	 */
	public ActivoFijo getActivoFijo() {
		return activoFijo;
	}

	/**
	 * @param activoFijo
	 */
	public void setActivoFijo(ActivoFijo activoFijo) {
		this.activoFijo = activoFijo;
	}

	/**
	 * @return
	 */
	public List<Informe> getInformes() {
		return informes;
	}

	/**
	 * @param informes
	 */
	public void setInformes(List<Informe> informes) {
		this.informes = informes;
	}
	
	
	
}
