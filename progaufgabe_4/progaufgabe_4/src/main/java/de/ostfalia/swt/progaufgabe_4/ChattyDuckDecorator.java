package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "chtdek")
public class ChattyDuckDecorator extends DuckDecorator {

	
	public ChattyDuckDecorator(Duck duck) {
		
		super(duck);
		
	}
	
	//@XmlElement
	public String quack(){
		
		return duck.quack()+duck.quack();
		
	}

}
