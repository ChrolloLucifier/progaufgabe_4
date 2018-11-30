package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XmlRootElement(name = "duck")
public abstract class Duck {

	
	DuckState duckStatus;
	DuckCall call ;
	FlyBehavior f;
	QuackBehavior q;
	
	
	public Duck() {
		this.duckStatus = DuckState.STANDING;
	}
	
	public void fly(){
	
		f.fly(this);
		
	}
	
	//@XmlEnum( value = DuckState.class)
	
	//@XmlElement(name = "dst", type = DuckState.class)
	public DuckState getState(){
		
		return this.duckStatus;
		
	}
	
	public void land(){
		
		f.land(this);
		
	}

	public void setFlyBehavior(FlyBehavior fly){
		
		f = fly;
		
	}
	
	public void setQuackBehavior(QuackBehavior quack){
		
		q = quack;
		
	}
	
	public void setState(DuckState state){
		
		this.duckStatus = state;
		
	}

	
	public String quack(){
		return q.quack();
	}
	
}
