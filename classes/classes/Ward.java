package classes;
import java.lang.*;

public class Ward extends HMS
{
	 String name;
	 String wardNumber;
	
	/*public Ward(){System.out.println("ward - d");}*/
	public Ward(String name,String wardNumber){
		this.name = name;
		this.wardNumber = wardNumber;
		/*System.out.println("ward - p");*/
	}
	
	public void setName(String name)
	{
         this.name = name;		
	}
	public void setWardNumber(String wardNumber)
	{
		this.wardNumber = wardNumber;
	}
	
	public String getName()
	{
		return name;
	}
	public String getWardNumber()
	{
		return wardNumber;
	}

}