package de.ostfalia.swt.progaufgabe_4;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.JAXB ;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "de.ostfalia.swt.progaufgabe_4")
@XmlType(propOrder = { "list", "ducks" })
@XmlAccessorType(XmlAccessType.FIELD)
public class DuckSim {
	
	//@XmlElementWrapper(name = "list")
	//@XmlElement(name = "duck")
	List<Duck> list = new ArrayList<Duck>();

	private static DuckSim DuckSim_Instanz = null;

	public DuckSim() {

	}

	//@XmlElement//(name="instanze"/*, namespace="instanze", type=DuckSim.class , required=false, defaultValue=null, nillable=false*/)
	public static DuckSim getInstance() {
		
		if (DuckSim_Instanz == null) {
			
			DuckSim_Instanz = new DuckSim();
		}
		
		return DuckSim_Instanz;
	}
	
	public void addDuck(Duck duck){
		
		this.list.add(duck);
		
	}
	
	//@XmlAttribut(name = "counter")
	@XmlAttribute
	public int getDuckCount(){
		
		return this.list.size();
		
	}
	
	@XmlElement(name = "ducks")
	public List<Duck> getDucks(){
		
		return this.list;
		
	}

}
