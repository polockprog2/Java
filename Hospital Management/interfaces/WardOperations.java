package interfaces;
import java.lang.*;
import classes.*;


public interface WardOperations
{
	boolean insertWard(Ward w);
	boolean removeWard(Ward w);
	Ward searchWard(String wardNumber);
	void showAllWards();
}