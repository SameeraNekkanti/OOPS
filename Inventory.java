package hello_world;
class Product{
	String productName;
	int quantity;
	Product(String productName, int quantity){
		this.productName=productName;
		this.quantity=quantity;
	}
}
public class Inventory {
	public static void main(String[]args) {
		Product[] products=new Product[5];
		products[0]=new Product("Laptop",15);
		products[1]=new Product("Monitor",5);
		products[2]=new Product("Keyboard",8);
		products[3]=new Product("Webcam",20);
		for(int i=0;i<products.length;i++) {
			if(products[i].quantity<10) {
				System.out.println(products[i].productName+" :restock. current: "+products[i].quantity);
			}
		}
	
	}

}
