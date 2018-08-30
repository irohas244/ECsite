package rensyuu;

public class cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	void selfAid(){
		this.hp = this.MAXHP;
		this.mp -= 5;

	}

	void pray(){

	}


}
