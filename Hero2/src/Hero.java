
public class Hero { //クラスの宣言
		int hp;
		String name;



			// TODO 自動生成されたメソッド・スタブ



	}
	void attack(){
		System.out.println(this.name + "は攻撃した");
	}



	void sleep(){
		this.hp = 100;          //自分自身のHPフィールド
		System.out.println(this.name + "は眠って回復した");
	}
	void run(){
		System.out.println(this.name + "は逃げ出した");
	}

	}

