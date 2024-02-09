package classes;
import java.lang.*;

public class LocalMedicine extends Medicine
{
	private double discountRate;
	
	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
	public double getDiscountRate()
	{
		return discountRate;
	}
	public void showInfo()
	{
		System.out.println("Local Medicine Pid : "+getMId());
		System.out.println("Local Medicine Name : "+getName());
		System.out.println("Local Medicine availableQuantity : "+getAvailableQuantity());
		System.out.println("Local Medicine Price : "+getPrice());
		System.out.println("Local Medicine Discount Rate : "+getDiscountRate());
		System.out.println("==============================");
	}
}