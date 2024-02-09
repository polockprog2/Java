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
		
		
		System.out.println("'!          !'");
		System.out.println("  '!       !' ");
		System.out.println("    '!   !'   ");
		System.out.println("      !'!     ");
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
					        System.out.println("You have chosen to Insert New Employee.");
					        System.out.println("=========================");
					
					        System.out.print("Enter Employee ID : ");
					        String empId1 = sc.next();
					        System.out.print("Enter Employee Name : ");
					        String name1 = sc.next();
					        System.out.print("Enter Employee Salary : ");
					        double salary1 =  sc.nextDouble();
					
					        Employee e1 = new Employee();
					        e1.setempId(sid1);
					        e1.setName(name1);
					        e1.setSalary(salary1);
					
					        if(hms.insertEmployee(e1))
					        {
								System.out.println("=========================");
						        System.out.println("Employee Inserted With ID : "+e1.getempId());
								System.out.println("=========================");
					        }
					        else
					        {
						        System.out.println("Cannot Insert  An Employee.");
								System.out.println("=========================");
				            }
					        break; 
						
						case 2:
						    System.out.println("=================================================");
					        System.out.println("You have chosen to Remove An Exixting Employee.");
					        System.out.println("=========================");
					
					        System.out.print("Enter an Employee ID to Remove : ");
							String empId2 = sc.next();
                            
                            Employee e2 = hms.searchEmployee(empId2);
                            
                            if(e2 != null)
							{
								if(hms.removeEmployee(e2))
								{
									System.out.println("Employee Removed with ID : "+e2.getempId());
									System.out.println("=========================");
							    }
								else
								{
									System.out.println("Employee Can Not be Removed.");
									System.out.println("=========================");
							    }
							}
                            else
						    {
								System.out.println("Employee Does Not Exist.");
								System.out.println("=========================");
							}	
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen to See All Employee");
							System.out.println("=========================");
							hms.showAllEmployees();
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search An Employee");
							System.out.println("=========================");
							
							System.out.print("Enter an Employee ID to Search : ");
							String empId3 = sc.next();
							
							Employee e3 = hms.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("=========================");
								System.out.println("Employee Found.");
							    System.out.println("'!          !'");
		                        System.out.println("  '!       !' ");
		                        System.out.println("    '!   !'   ");
		                        System.out.println("      !'!     ");
								System.out.println("Employee ID : "+e3.getempId());
								System.out.println("Employee Name : "+e3.getName());
								System.out.println("Employee Salary : "+e3.getSalary());
								System.out.println("=========================");
							}
							else
							{
								System.out.println("=========================");
								System.out.println("Employee Does Not Exist");
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
				case 2:
					System.out.println("=========================");
					System.out.println("You Have Chosen Doctor Management.");
					System.out.println("=========================");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Doctor.");
					System.out.println("\t2. Remove Existing Doctor.");
					System.out.println("\t3. Show All Doctors.");
					System.out.println("\t4. Search A Doctor.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						    System.out.println("=========================");
							System.out.println("You Have Chosen to Insert A Doctor");
							System.out.println("=========================");
							
							System.out.print("Enter Doctor ID : ");
						    String docId1 = sc.next();
							System.out.println("Ender Doctor Gender :");
							String Gender = sc.next();
							System.out.print("Enter Doctor Name : ");
							String name1 = sc.next();
							
							Doctor d1 = new Doctor();
							d1.setDocId(docId1);
							d1.setGender();            //No idea how to write this
							d1.setName(name1);
							
							if(hms.insertDoctor(d1))
							{
								System.out.println("Ward Inserted with ID: "+d1.getDocId());
								System.out.println("=========================");
						    }
							else
							{
								System.out.println("Ward can not be inserted");
								System.out.println("=========================");
						    }
							
							break; 
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Ward.");
					        System.out.println("=========================");
					
					        System.out.print("Enter a Ward ID to Remove : ");
							String docId2 = sc.next();
                            
                            Doctor d2 = hms.searchDoctor(docId2);
                            
                            if(d2 != null)
							{
								if(hms.removedoctor(d2))
								{
									System.out.println("Doctor Removed with ID : "+d2.getDocId());
									System.out.println("=========================");
							    }
								else
								{
									System.out.println("Doctor Can Not be Removed.");
									System.out.println("=========================");
								}
							}
                            else
						    {
								System.out.println("Doctor Does Not Exist.");
							}	
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Doctors.");
							System.out.println("=========================");
							hms.showAllDoctors();
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search Doctor");
							System.out.println("=========================");
							
							System.out.print("Enter a Ward ID to Search : ");
							String docId3 = sc.next();
							
							Doctor d3 = hms.searchDoctor(docId3);
							
							if(d3 != null)
							{
								System.out.println("Doctor Found.");
								System.out.println("Doctor ID : "+d3.getdocId());
								System.out.println("Doctor Gender : "+d3.getGender());
								System.out.println("Doctor Name : "+d3.getName());
						
							}
							else
							{
								System.out.println("Ward Does Not Exist");
								System.out.println("=========================");
							}
						    break;
						
						
							
					    case 5:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("=========================");
							
							break;
					}
					
					break;
				case 3:
					System.out.println("=========================");
					System.out.println("You Have Chosen nurse Management.");
					System.out.println("=========================");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Nurse.");
					System.out.println("\t2. Remove Existing Nurse.");
					System.out.println("\t3. Show All Nurses.");
					System.out.println("\t4. Search A Nurse.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						    System.out.println("=========================");
							System.out.println("You Have Chosen to Insert A Nurse");
							System.out.println("=========================");
							
							System.out.print("Enter Nurse ID : ");
						    String nurseId1 = sc.next();
							System.out.print("Enter Nurse Name : ");
							String name1 = sc.next();
							
							Nurse n1 = new Nurse();
							n1.setNurseId(nurseId1);
							n1.setName(name1);
							
							if(hms.insertNurse(n1))
							{
								System.out.println("Ward Inserted with ID: "+n1.getNurseId());
								System.out.println("=========================");
						    }
							else
							{
								System.out.println("Ward can not be inserted");
								System.out.println("=========================");
						    }
							
							break; 
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Ward.");
					        System.out.println("=========================");
					
					        System.out.print("Enter a Ward ID to Remove : ");
							String nurseId2 = sc.next();
                            
                            Nurse n2 = hms.searchNurse(nurseId2);
                            
                            if(n2 != null)
							{
								if(hms.removeNurse(n2))
								{
									System.out.println("Nurse Removed with ID : "+n2.getNurseId());
									System.out.println("=========================");
							    }
								else
								{
									System.out.println("Nurse Can Not be Removed.");
									System.out.println("=========================");
								}
							}
                            else
						    {
								System.out.println("Nurse Does Not Exist.");
							}	
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Nurses.");
							System.out.println("=========================");
							hms.showAllNurses();
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search Nurse");
							System.out.println("=========================");
							
							System.out.print("Enter a Ward ID to Search : ");
							String nurseId3 = sc.next();
							
							Nurse n3 = hms.searchNurse(nurseId3);
							
							if(n3 != null)
							{
								System.out.println("Ward Found.");
								System.out.println("Ward ID : "+n3.getNurseId());
								System.out.println("Ward Name : "+n3.getName());
						
							}
							else
							{
								System.out.println("Ward Does Not Exist");
								System.out.println("=========================");
							}
						    break;
						
						
							
					    case 5:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("=========================");
							
							break;
					}
					
					break;
					
				case 4:
					System.out.println("=========================");
					System.out.println("You Have Chosen Staff Management.");
					System.out.println("=========================");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Staff.");
					System.out.println("\t2. Remove Existing Staff.");
					System.out.println("\t3. Show All Staffs.");
					System.out.println("\t4. Search A Staff.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						    System.out.println("=========================");
							System.out.println("You Have Chosen to Insert A Staff");
							System.out.println("=========================");
							
							System.out.print("Enter Staff ID : ");
						    String stfId1 = sc.next();
							System.out.print("Enter Staff Name : ");
							String name1 = sc.next();
							System.out.println("Enter Staff Salay :");
							double salary1 = sc.next();
							
							Staff s1 = new Staff();
							s1.setWid(stfId1);
							s1.setName(name1);
							s1.setsalary(salary1); 
							
							if(hms.insertStaff(s1))
							{
								System.out.println("Staff Inserted with ID: "+s1.getStfId());
								System.out.println("=========================");
						    }
							else
							{
								System.out.println("Staff can not be inserted");
								System.out.println("=========================");
						    }
							
							break; 
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Staff.");
					        System.out.println("=========================");
					
					        System.out.print("Enter a Staff ID to Remove : ");
							String stfId2 = sc.next();
                            
                            Staff s2 = hms.searchStaff(stfId2);
                            
                            if(s2 != null)
							{
								if(hms.removeStaff(s2))
								{
									System.out.println("Staff Removed with ID : "+s2.getStfId());
									System.out.println("=========================");
							    }
								else
								{
									System.out.println("Staff Can Not be Removed.");
									System.out.println("=========================");
								}
							}
                            else
						    {
								System.out.println("Staff Does Not Exist.");
							}	
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Staffs.");
							System.out.println("=========================");
							hms.showAllStaffs();
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search Staff");
							System.out.println("=========================");
							
							System.out.print("Enter a Staff ID to Search : ");
							String stfId3 = sc.next();
							
							Staff stfI3 = hms.searchStaff(stfId3);
							
							if(s3 != null)
							{
								System.out.println("Staff Found.");
								System.out.println("Staff ID : "+s3.getStfId());
								System.out.println("Staff Name : "+s3.getName());
								System.out.println("Staff salay : "+s3.getSalary());
						
							}
							else
							{
								System.out.println("Staff Does Not Exist");
								System.out.println("=========================");
							}
						    break;
						
						
							
					    case 5:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("=========================");
							
							break;
					}
					
					break;
					
				case 5:
					System.out.println("=========================");
					System.out.println("You Have Chosen Ward Management.");
					System.out.println("=========================");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Ward.");
					System.out.println("\t2. Remove Existing Ward.");
					System.out.println("\t3. Show All Wards.");
					System.out.println("\t4. Search A Ward.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option5 = sc.nextInt();
					
					switch(option5)
					{
						case 1:
						    System.out.println("=========================");
							System.out.println("You Have Chosen to Insert A Ward");
							System.out.println("=========================");
							
							System.out.print("Enter Ward ID : ");
						    String wardNumber1 = sc.next();
							System.out.print("Enter Ward Name : ");
							String name1 = sc.next();
							
							Ward w1 = new Ward();
							w1.setwardNumber(wardNumber1);
							w1.setName(name1);
							
							if(hms.insertWard(w1))
							{
								System.out.println("Ward Inserted with ID: "+w1.getWardNumber());
								System.out.println("=========================");
						    }
							else
							{
								System.out.println("Ward can not be inserted");
								System.out.println("=========================");
						    }
							
							break; 
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Ward.");
					        System.out.println("=========================");
					
					        System.out.print("Enter a Ward ID to Remove : ");
							String wardNumber2 = sc.next();
                            
                            Ward w2 = hms.searchWard(wardNumber2);
                            
                            if(w2 != null)
							{
								if(hms.removeWard(w2))
								{
									System.out.println("Ward Removed with ID : "+w2.getWardNumber());
									System.out.println("=========================");
							    }
								else
								{
									System.out.println("Ward Can Not be Removed.");
									System.out.println("=========================");
								}
							}
                            else
						    {
								System.out.println("Ward Does Not Exist.");
							}	
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Wards.");
							System.out.println("=========================");
							hms.showAllWards();
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search Ward");
							System.out.println("=========================");
							
							System.out.print("Enter a Ward ID to Search : ");
							String wardNumber3 = sc.next();
							
							Ward w3 = hms.searchWard(wardNumber3);
							
							if(w3 != null)
							{
								System.out.println("Ward Found.");
								System.out.println("Ward ID : "+w3.getWardNumber());
								System.out.println("Ward Name : "+w3.getName());
						
							}
							else
							{
								System.out.println("Ward Does Not Exist");
								System.out.println("=========================");
							}
						    break;
						
						
							
					    case 5:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("=========================");
							
							break;
					}
					
				    break;
					
				
				case 5:
				    System.out.println("=========================");
					System.out.println("You have chosen Ward Medicine Management.");
					System.out.println("=========================");
					
					System.out.println("You have following options : \n");
					System.out.println("\t1. Insert New Medicine.");
					System.out.println("\t2. Remove Existing Medicine.");
					System.out.println("\t3. Show All Medicine.");
					System.out.println("\t4. Search A Medicine.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option5 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							
							System.out.println("=========================");
							System.out.println("You have chose to Insert a Medicine for Ward.");
							System.out.println("=========================");
							
							System.out.print("Enter Ward ID : ");
							String mId1 = sc.next();
							
							if(hms.searchWard(mId1)!=null)
							{
								System.out.println("Which type Of Medicine do you want?");
								System.out.println("\t1. Local Medicine.");
								System.out.println("\t2. Imported Medicine.");
								System.out.println("\t3. Go Back.");
								
								System.out.print("Enter Medicine Type: ");
								int Type = sc.nextInt();
								
								if(Type == 1)
								{
									System.out.print("Enter Medicine ID : ");
									String mId5 = sc.next();
									System.out.print("Enter Medicine Name : ");
									String mn1 = sc.next();
									System.out.print("Enter Available Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double pr1 = sc.nextDouble();
									System.out.print("Enter Discount Rate : ");
									double dr1 = sc.nextDouble();
									
									LocalMedicine lm1 = new LocalMedicine();
									lm1.setmid(mid5);
									lm1.setName(mn1);
									lm1.setAvailableQuantity(aq1);
									lm1.setPrice(pr1);
									
									if(hms.searchWard(mId1).insertMedicine(lm1))
									{
										System.out.println("Medicine name  "+mn1+"  inserted for Ward ID  "+wardNumber1);
										System.out.println("=========================");
									}
									else
									{
										System.out.println("MedicineCan NOt be inserted");
										System.out.println("=========================");
									}
								}
								else if(Type == 2)
								{
			                        System.out.print("Enter Medicine ID : ");
									String mI6 = sc.next();
									System.out.print("Enter Medicine Name : ");
									String mn1 = sc.next();
									System.out.print("Enter Availabe Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double pr2 = sc.nextDouble();
									System.out.print("Enter Country Name : ");
									String cn1 = sc.next();
									
									ImportedMedicine ip1 = new ImportedMedicine();
									ip1.setPid(mid6);
									ip1.setName(mn1);
									ip1.setAvailableQuantity(aq1);
									ip1.setCountryName(cn1);
									
									if(hms.searchWard(wid1).insertMedicine(ip1))
									{
										System.out.println("Medicine Name  "+mn1+"  inserted for  Ward  ID  "+wardNumber1);
										System.out.println("=========================");
									}
									else
									{
										System.out.println("Medicine Can NOt be inserted");
										System.out.println("=========================");
									}
								}
								else if(Type == 3)
								{
									System.out.println("=========================");
									System.out.println("Going Back.............");
									System.out.println("=========================");
								}
								else
								{
									System.out.println("------------------------");
									System.out.println("Invalid Type.");
									System.out.println("=========================");
								}
									
							}
							else
							{
								System.out.println("No Ward ID Found.");
								System.out.println("=========================");
							}
							
							break;
							
							
					    case 2:
						
						    System.out.println("=========================");
							System.out.println("You Have Chosen to Remove an Existing Medicine.");
							System.out.println("=========================");
							
							System.out.print("Enter Ward ID : ");
							String wardNumber4= sc.next();
							
							if(hms.searchWard(wardNumber4)!=null)
							{
								System.out.print("Enter Medicine ID : ");
								String mId2=sc.next();
								if(hms.searchWard(wardNumber4).searchMedicine(mId2)!=null)
								{
									System.out.print("Enter ID to Remove Medicine.");
									String mId3= sc.next();
									
									Medicine m4 = hms.searchWard(wardNumber4).searchMedicine(mId2);
									if(hms.searchWard(wardNumber4).removeMedicine(m4))
									{
										System.out.println("Medicine ID Removed With ID : "+m4.getMId());
										System.out.println("=========================");
									}
									else
									{
										System.out.println("Can not Removed.");
										System.out.println("=========================");
									}
								}
								else
								{
									System.out.println("No Medicine ID Found.");
									System.out.println("=========================");
								}
							}
						    else
							{
								System.out.println("No Ward ID Found.");
							}	
					    
						    
					    case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Medicines.");
							System.out.println("=========================");
							System.out.println("Enetr Ward ID : ");
							String wardNumber6=sc.next();
							Ward w4 = hms.searchWard(wardNumber6);
							if(w4!=null)
							{
								w4.showAllMedicines();
							}
							else
							{
								System.out.println("No Prouct Available.");
								System.out.println("=========================");
							}
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search a Medicine.");
							System.out.println("=========================");
							
							System.out.print("Enter Ward ID : ");
							String wardNumber5=sc.next();
							if(wardNumber5!=null)
							{
							    System.out.print("Enter a Medicine ID to Search : ");
							    String mId4 = sc.next();
							
							    Medicine m3 = hms.searchWard(wId5).searchMedicine(mId4);
							
							 if(m3 != null)
							 { 
								System.out.println("Medicine Found.");
								System.out.println("Medicine Name : "+m3.getName());
								System.out.println("Medicine Available Quantity : "+m3.getAvailableQuantity());
								System.out.println("Medicine Price : "+m3.getPrice());
							 }
							 else
							 {
								System.out.println("Medicine Does Not Exist");
								System.out.println("=========================");
							 }
							 
							}
							
							break;
							
						case 5:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("=========================");
							
							break;
							
					}

					break;
					
				case 4:
					System.out.println("=========================");
					System.out.println("You Have Chosen Medicine Quantity management.");
					System.out.println("=========================");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Medicine.");
					System.out.println("\t2. Sell Medicine.");
					System.out.println("\t3. Show Add Sell History.");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter Your Option : ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("=========================");
							System.out.println("You Choose to Add a Medicine.");
							System.out.println("=========================");
							
							System.out.print("Enter Ward ID: ");
							String wardNumber1 = sc.next();
							
							if(hms.searchWard(wardNumber1) != null)
							{
								System.out.print("Enter  Medicine ID : ");
								String mId1 = sc.next();
								
								if(hms.searchWard(wId1).searchMedicine(mId1) != null)
								{
									System.out.print("Enter Amount to Add : ");
									int am1 = sc.nextInt();
									
									if(hms.searchWard(wardNumber1).searchMedicine(mId1).addQauntity(am1))
									{
										System.out.println("=========================");
										System.out.println("Added Successfully.");
										frw.writeInFile("Added :  $"+am1+"  in Medicine ID  "+mid1+"  in Ward ID  "+wardNumber1);
										System.out.println("=========================");
									}
									else
									{
										System.out.println("Can Not Add");
										System.out.println("=========================");
									}
								}
								else
								{
									System.out.println("No Medicine ID Found.");
									System.out.println("=========================");
								}
								
							}
							else
							{
								System.out.println("No Ward ID Found");
								System.out.println("=========================");
							}
							
							break;
							
						case 2:
						    System.out.println("=========================");
							System.out.println("You Choose to Sell a Medicine.");
							System.out.println("=========================");
							
							System.out.print("Enter Ward ID : ");
							String wardNumber6 = sc.next();
							
							if(hms.searchWard(wardNumber6) != null)
							{
								System.out.print("Enter  Medicine ID : ");
								String mId1 = sc.next();
								
								if(hms.searchWard(wardNumber6).searchMedicine(mId1) != null)
								{
									System.out.print("Enter Amount to Sell : ");
									int am2 = sc.nextInt();
									
									if(hms.searchWard(wardNumber6).searchMedicine(mId1).sellQuantity(am2))
									{
										System.out.println("=========================");
										System.out.println("Sold Successfully.");
										System.out.println("=========================");
										frw.writeInFile("Sold :  $"+am2+"  in Medicine ID  "+mid1+"  by Ward ID  "+wardNumber6);
									}
									else
									{
										System.out.println("Can Not Sell");
										System.out.println("=========================");
									}
								}
								else
								{
									System.out.println("No Medicine ID Found.");
									System.out.println("=========================");
								}
								
							}
							else
							{
								System.out.println("No Ward ID Found.");
								System.out.println("=========================");
							}
							
			
						
							break;
							
						case 3:
							
							System.out.println("========================");
							System.out.println("You Have Chosen to Show All Sell History.");
							System.out.println("========================");
							
							frw.readFromFile();
							
							break;
							
						case 4:
						    
							System.out.println("=========================");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("=========================");
						
							break;
							
						default:
						
							break;
					}
					
					break;
				
				case 5:
					System.out.println("=========================");
					System.out.println("You Have Chosen to Exit");
					System.out.println("=========================");
					repeat = false;
					break;
				
				    default:
					System.out.println("========================");
					System.out.println("Invalid Choice.");
					System.out.println("========================");
					break;
			
			 
					
				
				    
			}
		}
	}
}