package mundo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("Informe")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Informe {

	@Id
	@XmlElement(name = "id")
	private ObjectId id;
	
	@XmlElement(name = "hojaDeVida")
	private HojaDeVida hojaDeVida;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
