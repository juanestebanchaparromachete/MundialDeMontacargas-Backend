package mundo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Informe {


	@XmlElement(name = "id")
	private ObjectId id;
	
	@XmlElement(name = "hojaDeVida")
	private HojaDeVida hojaDeVida;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
