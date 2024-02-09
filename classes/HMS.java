package classes;
import java.lang.*;
import interfaces.*;

public class HMS implements WardOperations, StaffOperations ,DocOperations
{
	private Ward Wards[] = new Ward [500];
	private Staff Staffs[] = new Staff [100];
	private Doctor doctors[] = new Doctor[100]
	
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
				System.out.println("Ward Sid: "+ wards[i].getWrdId());
				System.out.println("=====================");
			}
		}
	}
	public Ward searchWard(String wrdId)
	{
		Ward red = null;
		
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] != null)
			{
				if(wards[i].getWrdId().equals(wrdId))
				{
					red = wards[i];
					break;
				}
			}
		}
		return red;
	}
	
	
	
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
				System.out.println("Staff ID: "+ Staffs[i].getStfId());
				System.out.println("Salary: "+ Staffs[i].getSalary());
				System.out.println("========================");
			}
			
		}
	}
	public Staff searchStaff(String stfId)
	{
		Staff stf = null;
		
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				if(staffs[i].getStfId().equals(stfId))
				{
					stf = staffs[i];
					break;
				}
			}
		}
		return stf;
	}
	public boolean insertDoctor(Doctor red)
	{
		boolean flag = false;
		for(int i=0; i<docotrs.length; i++)
		{
			if(doctors[i] == null)
			{
				docotors[i] = red;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeDoctor(Doctor red)
	{
		boolean flag = false;
		for(int i=0; i<dortors.length; i++)
		{
			if(doctors[i]==red)
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
				System.out.println("Ward Sid: "+ docotrs[i].getDocId());
				System.out.println("=====================");
			}
		}
	}
	public Ward searchDoctor(String DocId)
	{
		Doctor red = null;
		
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				if(docotors[i].getDocId().equals(docId))
				{
					red = doctors[i];
					break;
				}
			}
		}
		return red;
	}
	
}