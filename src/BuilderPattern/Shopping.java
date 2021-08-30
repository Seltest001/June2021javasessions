package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {
		
		EcommApp ecom = new EcommApp();
		
       // case:1
				
		ecom.login("rupa@gmail.com", "test123")
		   .search("T-shirts", "blue")
		     .addToCart("T-shirts")
				.doPayment("1234hdfc", 7890)
				    .getOrderInfo().logout();
		System.out.println("___________________________");
		
		//case :2
		
		ecom.login("rupa@gmail.com", "test123") 
		   .search("macbook")
		     .addToCart("macbook")
		        .logout();
		System.out.println("_____________________________");
		
		//case:3
		
		ecom.login("rupa@gmail.com", "test123")
		    .search()
		      .search("LG TV")
		        .addToCart("LG TV")
		          .doPayment("icici CC",5678)
		             .getOrderInfo()
		                .logout();
		System.out.println("_______________________________");

	}

}
