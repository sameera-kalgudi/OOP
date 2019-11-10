package takehome5;

public class Cookie implements BakedGoods{

	int price = 0;
	String Description;
	String SellByDate;
	
	public  Cookie(int a, String b, String c) {
		this.price = a;
		this.Description =b;
		this.SellByDate=c;
	}

	@Override
	public int getPrice() {
		return(price);
	}

	@Override
	public String getDescription() {
		return(Description);
		
	}

	@Override
	public String getSellByDate() {
		return(SellByDate);
		
	}


}
