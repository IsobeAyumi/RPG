package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	Dice dice = new Dice();
	public Dragon(String name,String weapon) {
		super(name,weapon);
		super.hp=dice.get(270,330) ;
		super.offensive=dice.get(12,18) ;
	}
}
