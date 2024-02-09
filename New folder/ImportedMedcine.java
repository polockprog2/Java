package classes;
import java.lang.*;

public class ImportedMedicine extends Medcine
{
	private String countryName;
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public void showInfo()
	{
		System.out.println("Imported Medicine Pid : "+getmid());
		System.out.println("Imporoted Medicine Name : "+getName());
		System.out.println("Imported Medicine availableQuantity : "+getAvailableQuantity());
		System.out.println("Imported Medicine Price : "+getPrice());
		System.out.println("Country Name : "+getCountryName());
		System.out.println("==================================");
	}
}