
public class Cleric {
	String name;
	int hp;
	int MAX_HP;
	int mp;
	int MAX_MP;


	public void Aid(){
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.MAX_HP;

	}
	Cleric(String name){
		this.hp = 100;

	}
}