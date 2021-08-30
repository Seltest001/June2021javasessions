package BuilderPattern;

public class EcommApp {
	
	public EcommApp login(String un, String pwd) {
		System.out.println("Login with :"+ "  "+ un + " &" +pwd);
		return this;
	}
	
	public EcommApp search() {
		System.out.println("Search the product");
		return this;
	}
	
	public EcommApp search(String productName) {
		System.out.println("Search the product "+ productName);
		return this;
	}
	
	public EcommApp search(String productName, String color) {
		System.out.println("Search the product " + productName +"  " +"Color :" + "  "+ color); 
		return this;
	}
	
	public EcommApp addToCart(String productName) {
		System.out.println("Adding product to the cart" + "   "+ productName);
		return this;
	}
	
	public EcommApp doPayment(String cc, int otp) {
		System.out.println("Payment with : " + cc + "  "+ otp);
		return this;
	}
	
	public EcommApp doPayment(String upi, int otp, String password) {
		System.out.println("Payment with : " + upi + "  " +otp + " " + password);
		return this;
	}
	
	public EcommApp getOrderInfo () {
		System.out.println("Display the order details.....");
		return this;
	}
	
	public EcommApp logout( ) {
		System.out.println("Logged out from the application");
		return this;
	}

}
