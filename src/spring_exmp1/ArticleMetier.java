package spring_exmp1;

public class ArticleMetier {
	
	private ArticleData articleData = new ArticleData();
	
	public double computePrice() {
		double price = articleData.getPrice();
		return price + (price * 0.2);
		
	}

}
