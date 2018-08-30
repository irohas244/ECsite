package jp.co.internous.action;

public class Human {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        //　変数abcのなかにHumanNameクラスのコピーが代入される。
		HumanName abc=new HumanName();
		System.out.println(abc.getName());

		HumanAge efg=new HumanAge();
		System.out.println(efg.getAge());

		HumanAddress hij=new HumanAddress();
		System.out.println(hij.getAddress());

		HumanWeight jkl=new HumanWeight();
		System.out.println(jkl.getWeight());
	}

}
