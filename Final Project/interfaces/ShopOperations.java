package interfaces;
import java.lang.*;
import classes.Shop;

public interface ShopOperations
{
	boolean insertShop(Shop sh);
	boolean removeShop(Shop sh);
	Shop searchShop(String sid);
	void showAllShops();
}