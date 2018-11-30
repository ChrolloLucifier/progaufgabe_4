package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "duckcall")
public class DuckCall {
	
	QuackBehavior q;
	
	public DuckCall(){
		q = new Quack();
	}
	
	public DuckCall(QuackBehavior q){
		this.q = q;
	}
	

	public String makeSound(){
		
		return q.quack();
	
	}
	
	public void setQuackBehavior(QuackBehavior quack){
		
		this.q = quack;
		
	}

}
