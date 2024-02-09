package interfaces;
import java.lang.*;
import classes.Employee;


public interface DocOperations
{
	public boolean insertDoctor(Doctor d);
	public boolean removeDoctor(Doctor d);
	public Doctor searchDoctor(String docid);
	public void showAllDoctors();
}