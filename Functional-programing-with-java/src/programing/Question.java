package programing;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
	private String productId;
	private String productName;
	private String UnitOfMeasure;
	private String LaunchDate;
	
	
	
	public String getLaunchDate() {
		return LaunchDate;
	}


	public void setLaunchDate(String launchDate) {
		LaunchDate = launchDate;
	}


	public Product(String productId, String productName, String UnitOfMeasure, String LaunchDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.UnitOfMeasure = UnitOfMeasure;
		this.LaunchDate = LaunchDate;
		
	}
	

public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getUnitOfMeasure() {
		return UnitOfMeasure;
	}


	public void setUnitOfMeasure(String unitOfMeasure) {
		UnitOfMeasure = unitOfMeasure;
	}


public static class Question {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<Product> Productist = List.of(new Product("Prod2","Trousers","EACH","2021-02-09"),
				new Product("Prod1","Shirt","EACH","2021-02-21"),
				new Product("Prod3","Tie","EACH","2021-02-22"),
				new Product("Prod3","Tie","EACH","2021-02-24")
				);
		
		
		
		//sorted
		
		Comparator <Product> comparingByNoOfProduct = Comparator.comparing(Product :: getProductId);
		
		System.out.println(
				Product.stream().sorted(comparingByNoOfProduct).collect(Collectors.toList()));
		
Comparator <Product> comparingByNoOfProductincreasing 
		= Comparator.comparing(Product :: getProductId);
Comparator <Product> comparingByNoOfProductdecreasing 
		= Comparator.comparing(Product :: getProductId).reversed();
		
		System.out.println(
				Productist.stream().
				sorted(comparingByNoOfProductincreasing).
				collect(Collectors.toList()));
		
		System.out.println(
				Productist.stream().
				sorted(comparingByNoOfProductdecreasing).
				collect(Collectors.toList()));
		
		Comparator <Product> comparingByNoOfProductsincreasingAndLaunchDate
		= Comparator.comparing(Product :: getLaunchDate).
		thenComparing(Product :: getLaunchDate).
		reversed();
		
		System.out.println(
				Product.stream().
				sorted(comparingByNoOfProductsincreasingAndLaunchDate).
				collect(Collectors.toList()));
		
		
								
	}

}


public static Stream<Product> stream() {
	// TODO Auto-generated method stub
	return null;
}
}
