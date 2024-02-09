package HMS;
import java.io.*;
public class Staffs {
    String name;
    int id;
    int workingHours;
    double salary;
    public Staffs (String name, int id, int workingHours, double salary ){
        this.id = id;
        this.name = name;
        this.workingHours = workingHours;
        this.salary = salary;
    }
    String staffsInfo() {
        return "\nID: " + id + "\tName: "+ name + "\tWorking Hours: "+ workingHours + "\tSalary: "+ salary;
    }
    void addStaffsFile  () {
        File file = new File("Staffs.txt");
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(staffsInfo());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
