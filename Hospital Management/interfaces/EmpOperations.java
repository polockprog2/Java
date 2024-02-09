package interfaces;
import java.lang.*;
import classes.*;


public interface EmpOperations
{
	public boolean insertEmployee(Employee e);
	public boolean removeEmployee(Employee e);
	public Employee searchEmployee(String empList);
	public void showAllEmployees();
}