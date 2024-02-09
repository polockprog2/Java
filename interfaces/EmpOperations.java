package interfaces;
import java.lang.*;
import classes.HMS;


public interface EmpOperations
{
	public boolean insertEmployee(Employee e);
	public boolean removeEmployee(Employee e);
	public Employee searchEmployee(String empId);
	public void showAllEmployees();
}