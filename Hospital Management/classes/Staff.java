package classes;
import java.lang.*;

public class Staff
{
	private String name;
	private String sid;
	private double salary;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSid(String sid)
	{
		this.sid = sid;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public String getSid()
	{
		return sid;
	}
	public double getSalary()
	{
		return salary;
	}
}