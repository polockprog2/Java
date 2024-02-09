package classes;
import java.lang.*;
import interfaces.*;


public class HMS implements EmpOperations,WardOperations,MedOperations
{
	private Employee employees[] = new Employee[50];
	private Ward wards[] = new Ward [500];
	private Medicine medicines[] = new Medicine[100];

	
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("Employee List : "+employees[i].getEmpId());
				System.out.println("===================================");

			}
		}
	}
	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	
	public boolean insertWard(Ward w)
	{
		boolean flag = false;
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] == null)
			{
				wards[i] = w;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeWard(Ward w)
	{
		boolean flag = false;
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] == w)
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
				System.out.println("Ward Number: "+ wards[i].getWardNumber());
				System.out.println("=====================");
			}
		}
	}
	public Ward searchWard(String wardNumber)
	{
		Ward w = null;
		
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] != null)
			{
				if(wards[i].getWardNumber().equals(wardNumber))
				{
					w = wards[i];
					break;
				}
			}
		}
		return w;
	}
	
	
	public boolean insertMedicine(Medicine m)
	{
		boolean flag = false;
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] == null)
			{
				medicines[i] = m;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeMedicine(Medicine m)
	{
		boolean flag = false;
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] == m)
			{
				medicines[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllMedicines()
	{
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				medicines[i].showInfo();
				System.out.println("=====================");
			}
		}
	}
	public Medicine searchMedicine(String mId)
	{
		Medicine m = null;
		
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				if(medicines[i].getMId().equals(mId))
				{
					m = medicines[i];
					break;
				}
			}
		}
		return m;
	}
	


}