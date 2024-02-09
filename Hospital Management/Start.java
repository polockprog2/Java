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
					
					        System.out.print("Enter Employee List : ");
					        String empList1 =  sc.next();
					
					        Employee e1 = new Employee();
					        e1.setEmpList(empList1);
					
					        if(hms.insertEmployee(e1))
					        {
								System.out.println("=========================");
						        System.out.println("Inserted an employee list : "+e1.getEmpList());
								System.out.println("=========================");
					        }
					        else
					        {
						        System.out.println("Cannot insert  an employee list.");
								System.out.println("=========================");
				            }
					        break; 
						
						case 2:
						    System.out.println("=================================================");
					        System.out.println("You have chosen to Remove An Exixting Employee list.");
					        System.out.println("=========================");
					
					        System.out.print("Enter an employee list to remove : ");
							String empList2 = sc.next();
                            
                            Employee e2 = hms.searchEmployee(empList2);
                            
                            if(e2 != null)
							{
								if(hms.removeEmployee(e2))
								{
									System.out.println("Removed an employee list : "+e2.getEmpList());
									System.out.println("=========================");
							    }
								else
								{
									System.out.println("Employee list can not be removed.");
									System.out.println("=========================");
							    }
							}
                            else
						    {
								System.out.println("Employee list does not exist.");
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
							System.out.println("You Have Chosen to Search An Employee list");
							System.out.println("=========================");
							
							System.out.print("Enter an Employee list to Search : ");
							String empList3 = sc.next();
							
							Employee e3 = hms.searchEmployee(empList3);
							
							if(e3 != null)
							{
								System.out.println("=========================");
								System.out.println("Employee list Found.");
							    System.out.println("'!          !'");
		                        System.out.println("  '!       !' ");
		                        System.out.println("    '!   !'   ");
		                        System.out.println("      !'!     ");
								System.out.println("Employee List : "+e3.getEmpList());
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
							System.out.println("You Have Chosen to Insert A Doctor In Employee List.");
							System.out.println("=========================");
							
							System.out.print("Enter Employee List : ");
							String empList1 = sc.next();
							
							if(hms.searchEmployee(empList1)!= null)
							{
							   System.out.print("Enter Doctor ID : ");
						       String docId1 = sc.next();
							   System.out.println("Ender Doctor Gender :");
							   String gender1 = sc.next();
							   System.out.print("Enter Doctor Name : ");
							   String name1 = sc.next();
							
							   Doctor d1 = new Doctor();
							   d1.setDocId(docId1);
							   d1.setGender(gender1);            
							   d1.setName(name1);
							
							   if(hms.searchEmployee(empList1).insertDoctor(d1))
							   {
								System.out.println("Doctor Inserted with ID : "+d1.getDocId());
								System.out.println("=========================");
						       }
							   else
							   {
								System.out.println("Doctor ID can not be inserted");
								System.out.println("=========================");
						       }
							
		                    }
							else
							{
								System.out.println("Employee List Not Found.");
								System.out.println("=========================");
							}
							
						break;
							
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Doctor.");
					        System.out.println("=========================");
							
							System.out.print("Enter Employee List : ");
							String empList2= sc.next();
							
							if(hms.searchEmployee(empList2) != null)
							{
							    System.out.print("Enter Doctor ID : ");
								String docId2=sc.next();
                            
                                if(hms.searchEmployee(empList2).searchDoctor(docId2)!=null)
							    {
									System.out.print("Enter ID to Remove Doctor.");
									String docId3= sc.next();
									
									Doctor d2 = hms.searchEmployee(empList2).searchDoctor(docId2);
									if(hms.searchEmployee(empList2).removeDoctor(d2))
								    {
									System.out.println("Doctor Removed with ID : "+d2.getDocId());
									System.out.println("=========================");
							        }
								    else
								    {
									System.out.println("Doctor ID Can Not be Removed.");
									System.out.println("=========================");
								    }
							    }
					            else
						        {
								System.out.println("Doctor ID Does Not Exist.");
								System.out.println("=========================");
							    }	
							}
							else
						    {
								System.out.println("No Employee List Found.");
								System.out.println("=========================");
							}
							
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Doctors.");
							System.out.println("=========================");
							System.out.println("Enter Employee List : ");
							String empList3=sc.next();
							Employee e3 = hms.searchEmployee(empList3);
							if(e3!=null)
							{
								e3.showAllDoctors();
							}
							else
							{
								System.out.println("No Doctor Information Found.");
								System.out.println("=========================");
							}
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search Doctor.");
							System.out.println("=========================");
							
							System.out.print("Enter Employee List : ");
							String empList4=sc.next();
							if(empList4!=null)
							{
								System.out.print("Enter a Doctor ID to Search : ");
							    String docId4 = sc.next();
							
							    Doctor d4 = hms.searchEmployee(empList4).searchDoctor(docId4);
								if(d4 != null)
							    {
								System.out.println("Doctor Found.");
								System.out.println("Doctor ID : "+d4.getDocId());
								System.out.println("Doctor Gender : "+d4.getGender());
								System.out.println("Doctor Name : "+d4.getName());
						
							    }
							    else
							    {
								System.out.println("Doctor Does Not Exist");
								System.out.println("=========================");
							    }
							}
							else
							{
								System.out.println("Employee List Does Not Exist");
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
					System.out.println("You Have Chosen Nurse Management.");
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
							
							System.out.print("Enter Employee List : ");
							String empList1 = sc.next();
							
							if(hms.searchEmployee(empList1) != null)
							{
								System.out.print("Enter Nurse ID : ");
						        String nid1 = sc.next();
							    System.out.print("Enter Nurse Name : ");
							    String name1 = sc.next();
							
							    Nurse n1 = new Nurse();
							    n1.setNid(nid1);
							    n1.setName(name1);
								
								if(hms.searchEmployee(empList1).insertNurse(n1))
							    {
								    System.out.println("Nurse Inserted with ID: "+n1.getNid());
								    System.out.println("=========================");
						        }
							    else
							    {
								    System.out.println("Nurse ID can not be inserted");
								    System.out.println("=========================");
						        }
							}
							else
							{
								System.out.println("No Employee List Found.");
								System.out.println("============================");
							}
							break;
							 
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Nurse Id.");
					        System.out.println("=========================");
							
							System.out.print("Enter Employee List : ");
							String empList2= sc.next();
							
							if(hms.searchEmployee(empList2)!=null)
							{
								System.out.print("Enter Nurse ID : ");
								String Nid2=sc.next();
								if(hms.searchEmployee(empList2).searchNurse(Nid2)!=null)
								{
									
					              System.out.print("Enter a Nurse ID to Remove : ");
							      String nid2 = sc.next();
                            
                                  Nurse n2 =  hms.searchEmployee(empList2).searchNurse(Nid2);
									if(hms.searchEmployee(empList2).removeNurse(n2))
									{
										System.out.println("Nurse Removed with ID : "+n2.getNid());
									    System.out.println("=========================");
									}
									else
								    {
									    System.out.println("Nurse Id Can Not be Removed.");
									    System.out.println("=========================");
								    }
                                }
								else
						        {
								   System.out.println("Nurse Id Does Not Exist.");
								   System.out.println("=========================");
							    }	
							}
							else
							{
								System.out.println("Employee List Not Found");
								System.out.println("=========================");
							}
					
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Nurses.");
							System.out.println("=========================");
							System.out.println("Enter Employee List : ");
							String empList3=sc.next();
							Employee e3 = hms.searchEmployee(empList3);
							if(e3!=null)
							{
								e3.showAllNurses();
							}
							else
							{
								System.out.println("No Nurse Information Found.");
								System.out.println("=========================");
							}
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search Nurse Id");
							System.out.println("=========================");
							
							System.out.print("Enter Employee List : ");
							String empList4=sc.next();
							if(empList4!=null)
							{
								
							  System.out.print("Enter a Nurse ID to Search : ");
							  String nid3 = sc.next();
							
							  Nurse n3 = hms.searchEmployee(empList4).searchNurse(nid3);
							
							  if(n3 != null)
							  {
								System.out.println("Nurse Id Found.");
								System.out.println("Nurse ID : "+n3.getNid());
								System.out.println("Nurse Name : "+n3.getName());
						
							  }
							  else
							  {
								System.out.println("Nurse Id Does Not Exist");
								System.out.println("=========================");
							  }
							}
							else
							{
								System.out.println("Employee List Does Not Exist");
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
							
							System.out.print("Enter Employee List : ");
							String empList1 = sc.next();
							
							if(hms.searchEmployee(empList1)!=null)
							{
								System.out.print("Enter Staff ID : ");
						        String sid1 = sc.next();
							    System.out.print("Enter Staff Name : ");
							    String name1 = sc.next();
							
							    Staff s1 = new Staff();
							    s1.setSid(sid1);
							    s1.setName(name1);
							
							    if(hms.searchEmployee(empList1).insertStaff(s1))
							    {
								  System.out.println("Staff Inserted with ID: "+s1.getSid());
								  System.out.println("=========================");
						        }
							    else
							    {
								  System.out.println("Staff Id can not be inserted");
								  System.out.println("=========================");
						        }
								
							}
							else
							{
							   System.out.println("No Employee List Found.");
							   System.out.println("=======================");
							}
					
							break; 
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Staff Id.");
					        System.out.println("=========================");
							
							System.out.print("Enter Employee List : ");
							String empList2= sc.next();
							
							if(hms.searchEmployee(empList2)!=null)
							{
								System.out.print("Enter a Staff ID : ");
							    String sid2 = sc.next();
                            
							    if(hms.searchEmployee(empList2).searchStaff(sid2) != null)
							    {
								
					               System.out.print("Enter a Staff ID to Remove : ");
							       String sid3 = sc.next();
                            
                                   Staff s2 = hms.searchEmployee(empList2).searchStaff(sid3);
							  
							       if(hms.searchEmployee(empList2).removeStaff(s2))
							       {
								  	  System.out.println("Staff Removed with ID : "+s2.getSid());
									  System.out.println("=========================");
							       }
							       else
							       {
									  System.out.println("Staff Id Can Not be Removed.");
									  System.out.println("=========================");
							       }
							    }
							    else
						        {
								   System.out.println("Staff Id Does Not Exist.");
								   System.out.println("=========================");
							    }
						    }
							else
							{
								System.out.println("Employee List Does Not Exist.");
								System.out.println("=========================");
							}
								
							break;
							
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Staffs.");
							System.out.println("=========================");
							System.out.println("Enter Employee List : ");
							String empList3=sc.next();
							Employee e3 = hms.searchEmployee(empList3);
							if(e3!=null)
							{
								e3.showAllStaffs();
							}
							else
							{
								System.out.println("No Staff Information Found.");
								System.out.println("=========================");
							}
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search Staff");
							System.out.println("=========================");
							
							System.out.print("Enter Employee List : ");
							String empList4 = sc.next();
							if(empList4 != null)
							{
								
							  System.out.print("Enter a Staff ID to Search : ");
							  String sid4 = sc.next();
							
							  Staff s4 = hms.searchEmployee(empList4).searchStaff(sid4);
							  if(s4 != null)
							  {
								System.out.println("Staff Id Found.");
								System.out.println("Staff ID : "+s4.getSid());
								System.out.println("Staff Name : "+s4.getName());
						
							  }
							  else
							  {
								System.out.println("Staff Id Does Not Exist");
								System.out.println("=========================");
							  }
							}
							else
							{
								System.out.println("Employee List Does Not Exist");
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
							System.out.println("You Have Chosen to Insert A Ward Number.");
							System.out.println("=========================");
							
							System.out.print("Enter Ward Number : ");
						    String wardNumber1 = sc.next();
							System.out.print("Enter Ward Name : ");
							String name1 = sc.next();
							
							Ward w1 = new Ward();
							w1.setWardNumber(wardNumber1);
							w1.setName(name1);
							
							if(hms.insertWard(w1))
							{
								System.out.println("Ward Inserted with ID: "+w1.getWardNumber());
								System.out.println("=========================");
						    }
							else
							{
								System.out.println("Ward Id can not be inserted");
								System.out.println("=========================");
						    }
							
							break; 
						
						case 2:
						    System.out.println("=========================");
					        System.out.println("You have chosen to Remove an Existing Ward Id.");
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
									System.out.println("Ward Id Can Not be Removed.");
									System.out.println("=========================");
								}
							}
                            else
						    {
								System.out.println("Ward Id Does Not Exist.");
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
								System.out.println("Ward Id Found.");
								System.out.println("Ward ID : "+w3.getWardNumber());
								System.out.println("Ward Name : "+w3.getName());
						
							}
							else
							{
								System.out.println("Ward Id Does Not Exist");
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
					
					
				case 6:
				    System.out.println("=========================");
					System.out.println("You have chosen Medicine Management.");
					System.out.println("=========================");
					
					System.out.println("You have following options : \n");
					System.out.println("\t1. Insert New Medicine.");
					System.out.println("\t2. Remove Existing Medicine.");
					System.out.println("\t3. Show All Medicine.");
					System.out.println("\t4. Search A Medicine.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option6 = sc.nextInt();
					
					
					switch(option6)
					{
						case 1:
							
							System.out.println("=========================");
							System.out.println("You have chose to Insert a Medicine for Hospital Pharmacy.");
							System.out.println("=========================");
							
							System.out.print("Enter Medicine ID : ");
							String mid1 = sc.next();
							
							if(hms.searchMedicine(mid1)!=null)
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
									String mid2 = sc.next();
									System.out.print("Enter Medicine Name : ");
									String name1 = sc.next();
									System.out.print("Enter Available Quantity : ");
									int availableQuantity1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double price1 = sc.nextDouble();
									System.out.print("Enter Discount Rate : ");
									double discountRate1 = sc.nextDouble();
									
									LocalMedicine lm1 = new LocalMedicine();
									lm1.setMid(mid2);
									lm1.setName(name1);
									lm1.setAvailableQuantity(availableQuantity1);
									lm1.setPrice(price1);
									
									if(hms.insertMedicine(lm1))
									{
										System.out.println("Medicine name : "+lm1.getName());
										System.out.println("=========================");
									}
									else
									{
										System.out.println("Medicine Not be inserted");
										System.out.println("=========================");
									}
								}
								else if(Type == 2)
								{
			                        System.out.print("Enter Medicine ID : ");
									String mid3 = sc.next();
									System.out.print("Enter Medicine Name : ");
									String name2 = sc.next();
									System.out.print("Enter Availabe Quantity : ");
									int availableQuantity2 = sc.nextInt();
									System.out.print("Enter Price : ");
									double price2 = sc.nextDouble();
									System.out.print("Enter Country Name : ");
									String countryName2 = sc.next();
									
									ImportedMedicine im1 = new ImportedMedicine();
									im1.setMid(mid3);
									im1.setName(name2);
									im1.setAvailableQuantity(availableQuantity2);
									im1.setCountryName(countryName2);
									
									if(hms.insertMedicine(im1))
									{
										System.out.println("Product Name : "+im1.getName());
										System.out.println("=========================");
									}
									else
									{
										System.out.println("Medicine Can Not be inserted");
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
								System.out.println("No Medicine ID Found.");
								System.out.println("=========================");
							}
							
							break;
							
						case 2:
						    System.out.println("=================================================");
					        System.out.println("You have chosen to Remove An Exixting Medicine.");
					        System.out.println("=========================");
					
					        System.out.print("Enter an Medicine ID to Remove : ");
							String mid4 = sc.next();
                            
                            Medicine m4 = hms.searchMedicine(mid4);
							
							if(m4 != null)
								{
									if(hms.removeMedicine(m4))
									{
										System.out.println("Medicine ID Removed With ID : "+m4.getMid());
										System.out.println("=========================");
									}
									else
									{
										System.out.println("Medicine Id Can not Removed.");
										System.out.println("=========================");
									}
							    }
                                else
						            {
								System.out.println("Staff Id Does Not Exist.");
							        }	
							    break;
								
						case 3:
							System.out.println("=========================");
							System.out.println("You Have Chosen See All Medicine Identity.");
							System.out.println("=========================");
							hms.showAllMedicines();
							break;
							
						case 4:
							System.out.println("=========================");
							System.out.println("You Have Chosen to Search A Medicine.");
							System.out.println("=========================");
							
							System.out.print("Enter a Medicine ID to Search : ");
							String mid5 = sc.next();
							
							Medicine m5 = hms.searchMedicine(mid5);
							
							if(m5 != null)
							{
								System.out.println("Medicine Id Found.");
								System.out.println("Medicine ID : "+m5.getMid());
								System.out.println("Medicine Name : "+m5.getName());
						
							}
							else
							{
								System.out.println("Medicine Id Does Not Exist");
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
					
				case 7:
					System.out.println("=========================");
					System.out.println("You Have Chosen Medicine Quantity management.");
					System.out.println("=========================");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Medicine.");
					System.out.println("\t2. Sell Medicine.");
					System.out.println("\t3. Show Add Sell History.");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter Your Option : ");
					int option7 = sc.nextInt();
					
					switch(option7)
					{
						case 1: 
							
							System.out.println("=========================");
							System.out.println("You Choose to Add a Medicine.");
							System.out.println("=========================");
							
							System.out.print("Enter Medicine ID : ");
							String mid1 = sc.next();
							System.out.print("Amount Added : ");
							int am1 = sc.nextInt();
							
							 if(hms.searchMedicine(mid1).addQauntity(am1))
									{
										System.out.println("=========================");
										System.out.println("Added Successfully.");
										frw.writeInFile("Added :  "+am1+"  in Medicine ID : "+mid1);
										System.out.println("=========================");
									}
									else
									{
										System.out.println("Medicine Can Not Add");
										System.out.println("=========================");
									}
								
							        break;	
						case 2:
						    System.out.println("=========================");
							System.out.println("You Choose to Sell a Medicine.");
							System.out.println("=========================");
							
							System.out.print("Enter Medicine ID : ");
							String mid2 = sc.next();
							System.out.print("Selling Amount  : ");
							int am2 = sc.nextInt();
							
							if(hms.searchMedicine(mid2).sellQuantity(am2))
									{
										System.out.println("=========================");
										System.out.println("Sold Successfully.");
										System.out.println("=========================");
										frw.writeInFile("Sold :  "+am2+"  in Medicine ID  : "+mid2);
									}
									else
									{
										System.out.println("Can Not Sell");
										System.out.println("=========================");
									}
							
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
				
				case 8:
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