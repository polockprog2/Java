package interfaces;
import java.lang.*;
import classes.Ward;

public interface WardOperations
{
	boolean insertWard(Ward w);
	boolean removeWard(Ward w);
	Ward searchWard(String wrdId);
	void showAllWards();
}