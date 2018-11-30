package de.ostfalia.swt.progaufgabe_4;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

//import javax.xml.bind.JAXB;

public class SavegameManager {

	public void save ( DuckSim sim , File savegameFile ) throws javax.xml.bind.JAXBException , InstantiationException{
		
		
		
		JAXBContext sc = JAXBContext.newInstance(DuckSim.class);
		//System.out.println("innnnn");
		Marshaller m = sc.createMarshaller();
		
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		m.marshal(sim, System.out);
		
		m.marshal(sim, savegameFile);
		
		//System.out.println("outttttt");
		
	}
	
	
	public DuckSim load(java.io.File savegameFile) throws javax.xml.bind.JAXBException,InstantiationException{
		
		JAXBContext sc = JAXBContext.newInstance(Duck.class);
		Unmarshaller um = sc.createUnmarshaller();
		DuckSim d = (DuckSim) um.unmarshal(savegameFile);
		
		return d;
		
	}
	
	

}
