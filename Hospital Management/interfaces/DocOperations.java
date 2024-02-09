package interfaces;
import java.lang.*;
import classes.*;


public interface DocOperations
{
	public boolean insertDoctor(Doctor d);
	public boolean removeDoctor(Doctor d);
	public Doctor searchDoctor(String docId);
	public void showAllDoctors();
}