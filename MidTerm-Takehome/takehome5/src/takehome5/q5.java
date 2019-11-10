package takehome5;


import java.util.List;
import java.util.ArrayList;

public class q5 {

	public static void main(String[] args) {
		List<BakedGoods> b = new ArrayList<BakedGoods>();
		Cookie c = new Cookie(5, "choco chip cookie", "6/12/2019");
		CinnamonRoll cr = new CinnamonRoll(8, "snacks", "16/11/2019");
		Brownie br = new Brownie(8, "Dessert", "6/11/2019");
		b.add(c);
		b.add(br);
		b.add(cr);
		
		for(BakedGoods i : b) {
			System.out.println("price " + i.getPrice() );
			System.out.println("Description  "+ i.getDescription() );
			System.out.println("SellByDate "+i.getSellByDate() );
		}
		
		

	}

}
