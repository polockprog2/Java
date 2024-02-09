package interfaces;
import java.lang.*;
import classes.*;


public interface NurseOperations
{
	public boolean insertNurse(Nurse n);
	public boolean removeNurse(Nurse n);
	public Nurse searchNurse(String nurseId);
	public void showAllNurses();
}