package bases;

import utils.Dice;

//モンスターを表現する抽象クラス
public class Monster extends Living {
	
	//コンストラクタ
	public Monster(String name,String weapon) {
		//Livingクラスで定義したコンストラクタを利用する
		super(name,weapon);
	}
		
	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		Dice dice = new Dice();
		int damage=dice.get(1,10) * super.getOffensive();
		
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp()-damage);

		// コンソールにステータスを表示
		System.out.println("「"+super.name+"」が「"+super.weapon+"」で攻撃！「"+target+"」に"+damage+"のダメージを与えた。");
	}

}

//自分をどうあらわすか