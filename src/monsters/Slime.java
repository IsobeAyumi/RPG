package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	Dice dice = new Dice();
	public Slime(String name,String weapon) {
		super(name,weapon);
		super.hp=dice.get(70,130) ;
		super.offensive=dice.get(5,11) ;
	}

}
