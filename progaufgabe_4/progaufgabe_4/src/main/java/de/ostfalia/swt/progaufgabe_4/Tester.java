package de.ostfalia.swt.progaufgabe_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Tester {
	
	
	

	public static void main(String[] args) throws JAXBException, IOException, InstantiationException {

		
		
		
		DuckSim d = new DuckSim();
		
		SavegameManager s = new SavegameManager();
		
		File f = new File("ducksimjaxb.xml");
		
		f.toString();
		
		d.addDuck(new RubberDuck());
		d.addDuck(new ChattyDuckDecorator(new RedheadDuck()) );
		d.addDuck(new MallardDuck());
		
		//System.out.println(d.list.toString());
		d.list.get(1).setState(DuckState.FLYING);
		s.save(d, f);
		
		d.list.get(1).setState(DuckState.STANDING);
		
		s.save(d, f);
		d.addDuck(new HoarseDuckDecorator(new RubberDuck()));
	
		
		
		System.out.println(d.list.get(1).getState());
		
		
		DuckSim s1 = s.load(f);
		
		System.out.println(s1.list.get(1));
		

	}

}
