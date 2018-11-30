package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "horsdek")
public class HoarseDuckDecorator extends DuckDecorator {
	
	public HoarseDuckDecorator(Duck duck) {

		super(duck);

	}

	@XmlElement
	public String quack() {
		String ch = "";
		if(duck.quack().indexOf("Quack!") != -1){
				for (int i = 0 ; i < duck.quack().length() / 6 ; i++){
					ch +="Qck!";
				}
				return ch;
		}
		if(duck.quack().indexOf("Quiek!") != -1){
			for (int i = 0 ; i < duck.quack().length() / 6 ; i++){
				ch +="Qk!";
			}
			return ch;
		}
		if(duck.quack().equals("Qk!")){
			return "Qk!";
		}
		else return "Qck!";

	}

}
