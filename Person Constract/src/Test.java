
public class Test {

	public static void main(String[] args) {
		Person taro=new Person();

		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person saburo=new Person("saburo.0");
		System.out.println(saburo.name);

		Person def=new Person("名前なし.25");
		System.out.println(def.name);

		Person ghi=new Person("hanako.17");
		System.out.println(ghi.name);

}
}