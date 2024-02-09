package classes;
import java.lang.*;

public class Staff
{
	private String name;
	private String StfId;
	private double salary;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmpId(String empId)
	{
		this.StfId=empId;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public String geStfId()
	{
		return StfId;
	}
	public double getSalary()
	{
		return salary;
	}
}