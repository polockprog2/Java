package interfaces;
import java.lang.*;
import classes.DoctorManage;


public interface DocOperations
{
	boolean insertDoctor(Doctor dt);
	boolean removeDoctor(Doctor dt);
	Product searchDoctor(String did);
	void showAllDoctors();
}