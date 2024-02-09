package classes;
import java.lang.*;
import interfaces.*;

public class HMS implements WardOperations, StaffOperations ,DocOperations
{
	private Staff Staffs[] = new Staff [100];
	private Ward Wards[] = new Ward [500];
	private Doctor doctors[] = new Doctor[100]
	
	public boolean insertStaff(Staff red)
	{
		boolean flag = false;
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == null)
			{
				staffs[i] = red;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeStaff(Staff red)
	{
		boolean flag = false;
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == red)
			{
				staffs[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllStaffs()
	{
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				System.out.println("Staff Name: "+ Staffs[i].getName());
				System.out.println("Staff ID: "+ Staffs[i].getSid());
				System.out.println("Salary: "+ Staffs[i].getSalary());
				System.out.println("========================");
			}
			
		}
	}
	public Staff searchStaff(String sid)
	{
		Staff stf = null;
		
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				if(staffs[i].getSid().equals(sid))
				{
					stf = staffs[i];
					break;
				}
			}
		}
		return stf;
	}
	
	public boolean insertWard(Ward blue)
	{
		boolean flag = false;
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] == null)
			{
				wards[i] = blue;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeWard(Ward blue)
	{
		boolean flag = false;
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i]== blue)
			{
				wards[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllWards()
	{
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] != null)
			{
				System.out.println("Ward Name: "+ wards[i].getName());
				System.out.println("Ward Sid: "+ wards[i].getWid());
				System.out.println("=====================");
			}
		}
	}
	public Ward searchWard(String wid)
	{
		Ward flag = null;
		
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] != null)
			{
				if(wards[i].getWid().equals(wid))
				{
					flag = wards[i];
					break;
				}
			}
		}
		return flag;
	}
	
	
	public boolean insertDoctor(Doctor dt)
	{
		boolean flag = false;
		for(int i=0; i<doctors.length; i++)
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
	
	public boolean removeDoctor(Doctor dt)
	{
		boolean flag = false;
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i]== dt)
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
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				System.out.println("Ward Name: "+ doctors[i].getName());
				System.out.println("Ward Sid: "+ doctors[i].getDocId());
				System.out.println("=====================");
			}
		}
	}
	public Doctor searchDoctor(String DocId)
	{
		Doctor dt = null;
		
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				if(doctors[i].getDocId().equals(docId))
				{
					dt = doctors[i];
					break;
				}
			}
		}
		return dt;
	}
	
}