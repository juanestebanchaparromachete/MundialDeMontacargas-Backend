package mundo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HojaDeVida {

	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 * activo fijo asociado a la hoja de vida
	 */
	@XmlElement(name = "activoFijo")
	private ActivoFijo activoFijo;
	
	/**
	 * infromes que pertenecen a la infromacion de la hoja de vida
	 */
	@XmlElement(name = "informes")
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

	public HojaDeVida()
	{
		
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
