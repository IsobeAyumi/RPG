package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	Dice dice = new Dice();
	public  Wizard(String name,String weapon) {
		super(name,weapon);
		super.hp=dice.get(120,180) ;
		super.offensive=dice.get(12,18) ;
	}
}
