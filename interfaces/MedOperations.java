package interfaces;
import java.lang.*;
import classes.HMS;


public interface MedOperations
{
	public boolean insertMedicine(Medicine m);
	public boolean removeMedicine(Medicine m);
	public Medicine searchMedicine(String mId);
	public void showAllMedicines();
}