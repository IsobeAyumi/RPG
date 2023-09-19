package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human{
	Dice dice = new Dice();
	public  Brave(String name,String weapon) {
		super(name,weapon);
		super.hp=dice.get(170,230) ;
		super.offensive=dice.get(7,13) ;
		
	}
	
	

}
