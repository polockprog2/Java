package interfaces;
import java.lang.*;
import classes.Staff;

public interface StaffOperations
{
	boolean insertStaff(Staff s);
	boolean removeStaff(Staff s);
	Staff searchStaff(String stfId);
	void showAllStaffs();
}