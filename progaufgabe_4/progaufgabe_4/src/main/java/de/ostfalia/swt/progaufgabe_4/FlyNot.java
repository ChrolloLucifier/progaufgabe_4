package de.ostfalia.swt.progaufgabe_4;


public class FlyNot implements FlyBehavior{

	public FlyNot(){
		
	}
	
	public void fly(Duck parent) {

		parent.setState(DuckState.STANDING);
		
	}

	public void land(Duck parent) {
		
		parent.setState(DuckState.STANDING);
		
	}

}
