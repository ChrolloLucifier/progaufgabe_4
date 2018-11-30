package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mduck")
public class RedheadDuck extends Duck{
	
	public RedheadDuck (){
		super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());

	}
}
