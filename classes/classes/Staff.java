package classes;
import java.lang.*;

public class Staff
{
	private String name;
	private String stfId;
	private double salary;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setStfId(String stfId)
	{
		this.stfId = stfId;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public String getStfId()
	{
		return stfId;
	}
	public double getSalary()
	{
		return salary;
	}
}