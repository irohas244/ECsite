
public class TrainToy {
	private String code_;
	private int price_;

	public TrainToy(String code,int price){
		code_ = code;
		price_ = price;
	}

	public String getCode(){
		return code_;
	}
	public int getPrice(){
		return price_;
	}

	public void setPrice(int newPrice){
		if(newPrice > 0){
			price_ = newPrice;
		}else{
		}
	}

	public void go(){
		System.out.println("gatangoton");
	}
	public void horn(){
		System.out.println("警笛");
	}

}
