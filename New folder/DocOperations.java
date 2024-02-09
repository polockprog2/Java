package interfaces;
import java.lang.*;
import classes.Doctor;

public interface DocOperations
{
	boolean insertDoctor(Doctor d);
	boolean removeDoctor(Doctor d);
	Doctor searchDoctor(String DocId);
	void showAllDoctors();
}