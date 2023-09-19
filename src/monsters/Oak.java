package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	Dice dice = new Dice();
	public Oak(String name,String weapon) {
		super(name,weapon);
		super.hp=dice.get(170,230) ;
		super.offensive=dice.get(9,15) ;
	}

}
