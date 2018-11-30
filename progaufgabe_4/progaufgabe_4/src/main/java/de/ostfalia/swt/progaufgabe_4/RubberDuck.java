package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rubduck")
public class RubberDuck extends Duck{
	
	
	
	public RubberDuck(){
		super.setFlyBehavior(new FlyNot());
        super.setQuackBehavior(new Quiek());
        super.setState(DuckState.STANDING);
	}
	
	public String quack(){
		
		return "Quiek!";
		
	}

}
