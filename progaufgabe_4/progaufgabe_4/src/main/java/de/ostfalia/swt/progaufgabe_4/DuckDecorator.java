package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dekoraator")
public abstract class DuckDecorator extends Duck{
	
	
	protected Duck duck;
	
	public DuckDecorator(Duck duck){
		
		this.duck = duck;
		
	}
	
	

}
