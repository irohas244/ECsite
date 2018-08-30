package obenkyo;

class Main {
	  public static void main(String[] args) {
	    // 引数に「Kate Jones」を渡してください
	    printData("Kate Jones",26,178.5);

	    // 引数に「John Christopher Smith」を渡してください
	    printData("John Christopher Smith",7);

	  }

	  // 引数を受け取るようにしてください
	  public static void printData(String name,int age,double height) {
	    // 「私の名前は◯◯です」と出力されるように書き換えてください
	    System.out.println("私の名前は" + name + "です");
	    System.out.println("年齢は" + age + "才です");
	    System.out.println("身長は" + height + "cmです");
	  }


		  public static void printData(String name,int age) {
			    // 「私の名前は◯◯です」と出力されるように書き換えてください
			    System.out.println("私の名前は" + name + "です");
			    System.out.println("年齢は" + age + "才です");


	  }
	}