package interfaces;
import java.lang.*;
import classes.Employee;

public interface EmployeeOperations
{
	boolean insertEmployee(Employee eml);
	boolean removeEmployee(Employee eml);
	Employee searchEmployee(String empId);
	void showAllEmployees();
}