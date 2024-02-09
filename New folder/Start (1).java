import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;
import java.io.*;

public class Start
{
	public static void main (String args[]) throws Exception
	{
		HMS hms = new HMS();
		FileReadWrite frw = new FileReadWrite();
		Scanner sc= new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.println();
		System.out.println("Welcome to Hospital Management Application.");
		System.out.println("=========================");
		
		boolean repeat = true;
		
		
		while (repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management .");
			System.out.println("\t2. Doctor Management.");
			System.out.println("\t3. Nurse Management.");
			System.out.println("\t4. Staff Management.");
			System.out.println("\t5. Ward Management.");
			System.out.println("\t6. Medicine Management.");
			System.out.println("\t7. Medicine Quantity Management.");
			System.out.println("\t8. Exit.");
			System.out.println("=========================");
			
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			
			
			switch(choice)
			{
				case 1:
					System.out.println("=========================");
					System.out.println("You have chosen Employee Management.");
					System.out.println("=========================");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Employee.");
					System.out.println("\t2. Remove Existing Employee.");
					System.out.println("\t3. Show All Employees.");
					System.out.println("\t4. Search An Employee.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option1 = sc.nextInt();
					
					
					switch(option1)
					{
						case 1:
						    System.out.println("=========================");
					        System.out.println("You have chosen to insert an employee list.");
					        System.out.println("=========================");
							
							System.out.println("Insert Employee List : ");
							String empList1 = sc.next();
							
							Employee e1 = new Employee();
							e1.setEmpList(empList1);
							
							if(hms.insertEmployee(e1))
					        {
								System.out.println("=========================");
						        System.out.println("Employee List : "+s1.getEmpList());
								System.out.println("=========================");
					        }
					        else
					        {
						        System.out.println("Cannot insert any employee list.");
								System.out.println("=========================");
				            }
					        break;
							
						case 2:
						    System.out.println("You have chosen to remove an employee list");
					        System.out.println("=========================");
					
					        System.out.println("=================================================");
					        System.out.print("Enter an employee list to Remove : ");
							String empList2 = sc.next();
                            
                            Employee e2 = hms.searchEmpList(empList2);
							
							if(e2 != null)
							{
								if(hms.removeEmployee(e2))
								{
									System.out.println("Employee list removed : "+e2.getEmpList());
									System.out.println("=========================");
							    }
								else
								{
									System.out.println("Employee list can not removed");
									System.out.println("=========================");
							    }
							}
                            else
						    {
								System.out.println("Employee list Does Not Exist.");
								System.out.println("=========================");
							}	
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen to See All Employee list");
							System.out.println("=========================");
							hms.showAllEmployees();
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search An employee list.");
							System.out.println("=========================");
							
							System.out.print("Enter an employee list number to Search : ");
							String empList3 = sc.next();
							
							empList e3 = hms.searchempList(empList3);
							
							if(e3 != null)
							{
								System.out.println("=========================");
								System.out.println("Employee List Found.");
								System.out.println();
								System.out.println("Employee List number : "+e3.getEmpist());
						
								System.out.println("=========================");
							}
							else
							{
								System.out.println("=========================");
								System.out.println("Employee list Does Not Exist");
								System.out.println("=========================");
							}
							break;
							
						case 5:
							System.out.println("=========================");
							System.out.println("You have Chosen to Go Back.");
							System.out.println("=========================");
							
							break;
					}
					
					break; 



			}
		}
	}
}			