package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	Dice dice = new Dice();
	public  Fighter(String name,String weapon) {
		super(name,weapon);
		super.hp=dice.get(240,300) ;
		super.offensive=dice.get(17,23) ;
	}

}
