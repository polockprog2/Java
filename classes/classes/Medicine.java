package classes;
import java.lang.*;
import interfaces.MedQuantity;


public abstract class Medicine implements MedQuantity
{
	protected String mId;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setMId(String mId)
	{
		this.mId = mId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getMId()
	{
		return mId;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	
	public abstract void showInfo();
	
	public boolean addQauntity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Price : "+getPrice());
			System.out.println("Add Amount : "+amount);
			availableQuantity = availableQuantity + amount;
			System.out.println("Current Price : "+availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("Previous Price : "+getPrice());
			System.out.println("Sell Amount : "+amount);
			availableQuantity = availableQuantity - amount;
			System.out.println("Current Price : "+availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}
}
	
	