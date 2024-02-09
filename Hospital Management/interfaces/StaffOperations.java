package interfaces;
import java.lang.*;
import classes.*;


public interface StaffOperations
{
	boolean insertStaff(Staff s);
	boolean removeStaff(Staff s);
	Staff searchStaff(String sid);
	void showAllStaffs();
}