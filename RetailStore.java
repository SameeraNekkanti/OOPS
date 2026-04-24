
interface StockManagement{
	public void addStock(int quantity);
	public void removeStock(int quantity);
	public void checkStock();
}

interface DiscountManagement{
	double discountRate=0.10;
	
	double applyDiscount(double price);
	double calculateFinalPrice(double price);
}

interface InventorySystem extends StockManagement, DiscountManagement{
	
}

class Product implements InventorySystem{
	String name;
	double price;
	int stock;
	
	Product(String name, double price, int stock){
		this.name=name;
		this.price=price;
		this.stock=stock;
		
	}
	
	public void addStock(int quantity) {
		stock+=quantity;
		System.out.println(quantity + " units added. Current stock: " + stock);
		
	}
	
	public void removeStock(int quantity) {
		if(stock>=quantity) {
			stock-=quantity;
			 System.out.println(quantity + " units removed. Current stock: " + stock);
			 
		}else {
			System.out.println("Not enough stock");
	}
	}
	public void checkStock() {
		System.out.println("stock available: "+stock);
	}
	public double applyDiscount(double price) {
		return price*discountRate;
	}
	public double calculateFinalPrice(double price) {
		return price-applyDiscount(price);
	}
	public void displayDetails() {
		System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + calculateFinalPrice(price));
        System.out.println("Stock Available: " + stock);
	}
}

public class RetailStore {

	public static void main(String[] args) {
		Product product=new Product("Laptop", 10000.0,10);
		product.displayDetails();
		product.addStock(5);
        product.removeStock(3);
        product.displayDetails();

	}

}
