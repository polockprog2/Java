package HMS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    boolean quit;
    Scanner inputKey = new Scanner(System.in);
    Managment managment = new Managment();

    public static void main(String[] args) {
        Main menu = new Main();
        menu.runMenu();
    }

    // This runs menu
    public void runMenu() {
       
        while (!quit) {
            showHeader();
            showMenu();
            int choice = getInput();
            try {
                performAction(choice);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void showHeader() {
        System.out.println("===========================================");
        System.out.println("!     Hospital Managment Application       !");
        System.out.println("!                   CLI APP                !");
        System.out.println("============================================");
    }

    void showMenu() {
        System.out.println("Select your options:");
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        System.out.println("3. Add Staffs");
        System.out.println("4. Show Paitents");
        System.out.println("5. Show Doctors");
        System.out.println("6. Show Staffs");
        System.out.println("0. QUIT");
        
        
    }

    private int getInput() {
        int choice = -1;
        System.out.print("Enter your choice:");
        do {
            try {
                choice = Integer.parseInt(inputKey.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selected");
            }
            if (choice < 0 || choice > 6) {
                System.out.println("Choice is outside of range");
            }
        } while (choice < 0 || choice > 6);
        return choice;
    }

    private void performAction(int choice) throws IOException {
        switch (choice) {
            case 0:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            case 1:

                addDoctors();
                break;
           
            case 2:
                addPatient();
                break;
            case 3:
                addStuffS();
                break;
            case 4:
                showPatient();
                break;
            case 5:
                showDoctors();
                break;

            case 6:
                showStaffs();
                break;
            default:
                System.out.println("Error selection!");
        }
    }

    private void showStaffs() {
        try {
            FileReader fr = new FileReader("Staffs.txt");
            BufferedReader br = new BufferedReader(fr);
            String data ;
            while((data= br.readLine())!= null ){
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void showDoctors() throws IOException {
        FileReader fileReader = new FileReader("Doctor.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String data;
       try {
           while((data = br.readLine()) != null){
               System.out.println(data);
           }

       }
       catch(FileNotFoundException e){
           System.out.println("File not found");
       }
       
    }

    private void showPatient() throws FileNotFoundException {
        FileReader fileReader = new FileReader("Patient.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String data;
       try {
           while((data = br.readLine()) != null){
               System.out.println(data);
           }

       }
       catch(FileNotFoundException e){
           System.out.println("File not found");
       } catch (IOException e) {
           
           e.printStackTrace();
       }
    }

   

    private void addPatient() {
        String patientName="";
        String disease="";
        double fees=0.0;
        String bed="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();
        System.out.print("Enter disease: ");
        disease = sc.nextLine();
        System.out.print("Enter Bed No: ");
        bed = sc.nextLine();
        System.out.print("Enter Fees: ");
        fees = sc.nextDouble();
        
        Patient patient = new Patient(patientName, disease, fees, bed);
        managment.addPatient(patient);
    }

    

    private void addDoctors() {
        String doctorName="";
        String designation="";
        double salary=0.0;
        String chember="";
        int id= 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();
        System.out.print("Enter designation: ");
        designation = sc.nextLine();
        System.out.print("Enter Chember: ");
        chember = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        System.out.println("Enter Doctor's ID: ");
        id = sc.nextInt();
        Doctor doctor = new Doctor(doctorName, designation, chember, salary, id);
        managment.addDoctor(doctor);
    }
   private void addStuffS () {
        String name;
        int id;
        int workingHours;
        double salary;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Staffs Name:");
        name = sc2.nextLine();
        System.out.println("Enter ID:");
        id= sc2.nextInt();
        System.out.println("Enter Working Hours:");
        workingHours = sc2.nextInt();
        System.out.println("Enter Salary:");
        salary = sc2.nextInt();
        Staffs staff = new Staffs(name,id,workingHours,salary);
        managment.addStaffs(staff);
   }
}

