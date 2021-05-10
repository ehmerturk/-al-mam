package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1= new Product(1,"Lenovo V14",15000,"32GB Ram",10);
		
		Product product2= new Product();
		product2.setId(2);
		product2.setName("Lenovo 15");
		product2.setDiscount(10);
		product2.setDetail("32GB Ram");
		product2.setUnitPrice(135000);
		System.out.println(product2.getUnitPriceAfterDiscount());
	}
}
