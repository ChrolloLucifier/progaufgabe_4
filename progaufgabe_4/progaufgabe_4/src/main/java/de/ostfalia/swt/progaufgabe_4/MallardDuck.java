package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mduck")
public class MallardDuck extends Duck{
	
	
	
	public MallardDuck(){
		super.setFlyBehavior(new FlyNot());
        super.setQuackBehavior(new Quiek());

	}
	
	

}
