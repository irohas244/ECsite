
public class Test {

	public static void main(String[] args) {
		Robot aibo=new Robot();

		aibo.name="aibo";

		System.out.println(aibo.name);


		Robot asimo=new Robot();

		asimo.name="asimo";

		System.out.println(asimo.name);


		Robot pepper=new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);

		Robot doraemon=new Robot();
		doraemon.name="doraemon";
		System.out.println(doraemon.name);


		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();

		doraemon.talk();
		doraemon.walk();
		doraemon.run();


	}
}

