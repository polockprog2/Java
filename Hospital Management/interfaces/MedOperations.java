package interfaces;
import java.lang.*;
import classes.*;


public interface MedOperations
{
	public boolean insertMedicine(Medicine m);
	public boolean removeMedicine(Medicine m);
	public Medicine searchMedicine(String mid);
	public void showAllMedicines();
}