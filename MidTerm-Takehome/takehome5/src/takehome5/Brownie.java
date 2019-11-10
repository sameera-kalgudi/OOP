package takehome5;

public class Brownie implements BakedGoods{
	
	int price = 0;
	String Description;
	String SellByDate;
	
	public Brownie(int a, String b, String c) {
		this.price = a;
		this.Description =b;
		this.SellByDate=c;
	}

	@Override
	public int getPrice() {
		return(price);
	}

	public String getDescription() {
		return(Description);
		
	}
	public String getSellByDate() {
		return(SellByDate);	
	}

}
