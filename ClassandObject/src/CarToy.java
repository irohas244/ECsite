
public class CarToy {
	private String code_;
	private int price_;

    //コンストラクタ
	public CarToy(String code,int price){
		code_ = code;
		price_ = price;
	}

	public String getCode(){
		return code_;
	}

	public int getPrice(){
		return price_;
	}

	public void setPice(int newPrice){
		if(newPrice > 0){
			price_ = newPrice;
		}else{
		}
	}
	public void go(){
		System.out.println("BRRRR");
	}

	public void light(){
		System.out.println("lightning");
	}

}
