package classes;
import java.lang.*;
import interfaces.*;

public class HMS implements WardOperations, StaffOperations
{
	private Ward Wards[] = new Ward [500];
	private Staff Staffs[] = new Staff [100];
	
	public boolean insertWard(Ward red)
	{
		boolean flag = false;
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] == null)
			{
				wards[i] = red;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeWard(Ward red)
	{
		boolean flag = false;
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i]==red)
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
				System.out.println("Ward Sid: "+ wards[i].getSid());
				System.out.println("=====================");
			}
		}
	}
	public Ward searchWard(String wid)
	{
		Ward red = null;
		
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] != null)
			{
				if(wards[i].getWid().equals(wid))
				{
					red = wards[i];
					break;
				}
			}
		}
		return red;
	}
	
	
	
	public boolean insertStaff(Staff eml)
	{
		boolean flag = false;
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == null)
			{
				staffs[i] = eml;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeStaff(Staff eml)
	{
		boolean flag = false;
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == eml)
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
				System.out.println("Staff ID: "+ Staffs[i].getEmpId());
				System.out.println("Salary: "+ Staffs[i].getSalary());
				System.out.println("========================");
			}
			
		}
	}
	public Staff searchStaff(String empId)
	{
		Staff eml = null;
		
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				if(staffs[i].getEmpId().equals(empId))
				{
					eml = staffs[i];
					break;
				}
			}
		}
		return eml;
	}
}