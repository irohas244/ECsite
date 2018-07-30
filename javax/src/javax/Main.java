package javax;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.getname = "あああ";
		h.hp = 100;

        Matanago m1 = new Matanago();
        m1.hp = 50;
        m1.suffix = 'A';
		h.sit(5);
		m1.run();
		h.slip();
		h.sit(25);
		h.run();

	}

}
