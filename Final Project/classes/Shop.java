package classes;
import java.lang.*;
import interfaces.*;


public class Doctor implements DocOperations
{
	private String did;
	private String name;
	private Doctor doctors[] = new Doctor [20];
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDid(String did)
	{
		this.sid = sid;
	}
	
	public String getName()
	{
		return name;
	}
	public String getDid()
	{
		return did;
	}
	
	public boolean insertDoctor(Doctor dt)
	{
		boolean flag = false;
		for(int i=0; i<Doctors.length; i++)
		{
			if(doctors[i] == null)
			{
				doctors[i] = dt;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeDoctor(Doctor pd)
	{
		boolean flag = false;
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] == dt)
			{
				doctors[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllDoctors()
	{
		for(int i =0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				doctors[i].showInfo();
			}
		}
	}
	public Doctor searchDoctor(String did)
	{
		Doctor dt = null;
		
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				if(doctors[i].getDid().equals(did))
				{
					dt = docotors[i];
					break;
				}
			}
		}
		return dt;
	}
}
		