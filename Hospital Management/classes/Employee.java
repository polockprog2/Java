package classes;
import java.lang.*;
import interfaces.*;


public class Employee implements DocOperations,NurseOperations,StaffOperations
{
	public String empList;
	private Doctor doctors[] = new Doctor[100];
	private Nurse nurses[] = new Nurse[200];
	private Staff staffs[] = new Staff[500];
	
	
	public void setEmpList(String empList)
	{
		this.empList = empList;
	}
	public String getEmpList()
	{
		return empList;
	}
	
	
		public boolean insertDoctor(Doctor d)
	{
		boolean flag = false;
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] == null)
			{
				doctors[i] = d;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeDoctor(Doctor d)
	{
		boolean flag = false;
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] == d)
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
				System.out.println("Doctor Name : "+ doctors[i].getName());
				System.out.println("Doctor Gender : "+ doctors[i].getGender());
				System.out.println("Doctor Id : "+ doctors[i].getDocId());
				System.out.println("=====================");
			}
		}
	}
	public Doctor searchDoctor(String docId)
	{
		Doctor d = null;
		
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				if(doctors[i].getDocId().equals(docId))
				{
					d = doctors[i];
					break;
				}
			}
		}
		return d;
	}
	
	
	public boolean insertNurse(Nurse n)
	{
		boolean flag = false;
		for(int i=0; i<nurses.length; i++)
		{
			if(nurses[i] == null)
			{
				nurses[i] = n;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeNurse(Nurse n)
	{
		boolean flag = false;
		for(int i=0; i<nurses.length; i++)
		{
			if(nurses[i] == n)
			{
				nurses[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllNurses()
	{
		for(int i=0; i<nurses.length; i++)
		{
			if(nurses[i] != null)
			{
				System.out.println("Nurse Name : "+ nurses[i].getName());
				System.out.println("Nurse Id : "+ nurses[i].getNid());
				System.out.println("=====================");
			}
		}
	}
	public Nurse searchNurse(String nid)
	{
		Nurse n = null;
		
		for(int i=0; i<nurses.length; i++)
		{
			if(nurses[i] != null)
			{
				if(nurses[i].getNid().equals(nid))
				{
					n = nurses[i];
					break;
				}
			}
		}
		return n;
	}
	
	
	
		public boolean insertStaff(Staff s)
	{
		boolean flag = false;
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == null)
			{
				staffs[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeStaff(Staff s)
	{
		boolean flag = false;
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == s)
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
				System.out.println("Staff Name: "+ staffs[i].getName());
				System.out.println("Staff ID: "+ staffs[i].getSid());
				System.out.println("Salary: "+ staffs[i].getSalary());
				System.out.println("========================");
			}
			
		}
	}
	public Staff searchStaff(String sid)
	{
		Staff s = null;
		
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				if(staffs[i].getSid().equals(sid))
				{
					s = staffs[i];
					break;
				}
			}
		}
		return s;
	}
	
}