package de.ostfalia.swt.progaufgabe_4;



public class FlyWithWings implements FlyBehavior{

	public FlyWithWings(){
		
	}
	
	public void fly(Duck parent) {
		
		parent.setState(DuckState.FLYING);
		
	}

	public void land(Duck parent) {
		
		parent.setState(DuckState.STANDING);
		
	}

}
