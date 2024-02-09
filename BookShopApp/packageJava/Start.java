import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("35444342753699");
		sb1.setPrice(120.75);
		sb1.setBookTitle("hawa me urta jaye");
		sb1.setAvailableQuantity(10);
		sb1.setCategory("3");
		sb1.addQuantity(17);
        sb1.sellQuantity(40);
        sb1.showDetails();
		
	
		StoryBook sb2 = new StoryBook();
		sb2.setIsbn("364342442699");
		sb2.setPrice(130.75);
		sb2.setBookTitle("tere lal dupatta");
		sb2.setAvailableQuantity(20);
		sb2.setCategory("8");
		sb2.addQuantity(17);
        sb2.sellQuantity(20);
        sb2.showDetails();
	
		
		StoryBook sb3 = new StoryBook();
		sb3.setIsbn("374443242699");
		sb3.setPrice(140.75);
		sb3.setBookTitle("ur ur ur");
		sb3.setAvailableQuantity(30);
		sb3.setCategory("2");
		sb3.addQuantity(17);
        sb3.sellQuantity(50);
        sb3.showDetails();
	
		
		StoryBook sb4 = new StoryBook();
		sb4.setIsbn("38442432699");
		sb4.setPrice(150.75);
		sb4.setBookTitle("ure ure");
		sb4.setAvailableQuantity(40);
		sb4.setCategory("4");
		sb4.addQuantity(17);
        sb4.sellQuantity(23);
        sb4.showDetails();
		
		
		StoryBook sb5 = new StoryBook();
		sb5.setIsbn("39434322699");
		sb5.setPrice(160.75);
		sb5.setBookTitle("uri jaw ar asio na");
		sb5.setAvailableQuantity(50);
		sb5.setCategory("1");
		sb5.addQuantity(17);
        sb5.sellQuantity(25);
        sb5.showDetails();
		
	    TextBook tb1 = new TextBook();
		tb1.setIsbn("4543263249");
		tb1.setBookTitle("one piece");
		tb1.setPrice(420.75);
		tb1.setAvailableQuantity(41);
		tb1.setStandard(15);
		tb1.addQuantity(12);
        tb1.sellQuantity(35);
        tb1.showDetails();
		
		
		TextBook tb2 = new TextBook();
		tb2.setIsbn("4553264239");
		tb2.setBookTitle("one piece new world");
		tb2.setPrice(520.75);
		tb2.setAvailableQuantity(50);
		tb2.setStandard(23);
		tb2.addQuantity(13);
        tb2.sellQuantity(36);
        tb2.showDetails();
		
		
		TextBook tb3 = new TextBook();
		tb3.setIsbn("46442432469");
		tb3.setBookTitle("one piece-to the fish man island");
		tb3.setPrice(620.75);
		tb3.setAvailableQuantity(52);
		tb3.setStandard(26);
		tb3.addQuantity(14);
        tb3.sellQuantity(37);
        tb3.showDetails();
		
		
		TextBook tb4 = new TextBook();
		tb4.setIsbn("47432432697");
		tb4.setBookTitle("one piece new dignity");
		tb4.setPrice(720.75);
		tb4.setAvailableQuantity(70);
		tb4.setStandard(28);
		tb4.addQuantity(15);
        tb4.sellQuantity(38);
        tb4.showDetails();
	
		
		TextBook tb5 = new TextBook();
		tb5.setIsbn("48432643296");
		tb5.setBookTitle("one piece life");
		tb5.setPrice(820.75);
		tb5.setAvailableQuantity(80);
		tb5.setStandard(30);
		tb5.addQuantity(16);
        tb5.sellQuantity(39);
        tb5.showDetails();
		
	
		
		BookShop b1 = new BookShop("pinikmama\n");
		
		System.out.println("\n-----------------------------------\n");
		b1.showDetails();
		System.out.println("*****************Text Book********************\n");
		b1.showAllTextBooks();
		System.out.println();
		System.out.println("*****************Story Book********************\n");
		b1.showAllStoryBooks();
		System.out.println();
		
		System.out.println("\n-----------------------------------\n");
		
		
		if(b1.insertStoryBook(sb1))
		{
			System.out.println(sb1.getIsbn() + " Inserted for Isbn " +   b1.getName());
		}
		else
		{
			System.out.println(sb1.getIsbn() + " Not Inserted for Isbn: " + b1.getName());
		}
		
		if(b1.insertStoryBook(sb2)){System.out.println(sb2.getIsbn() + " Inserted");}
		else{System.out.println(sb2.getIsbn() + " Not Inserted");}
		
		if(b1.insertStoryBook(sb3)){System.out.println(sb3.getIsbn() + " Inserted");}
		else{System.out.println(sb3.getIsbn() + " Not Inserted");}
		
		if(b1.insertStoryBook(sb4)){System.out.println(sb4.getIsbn() + " Inserted");}
		else{System.out.println(sb4.getIsbn() + " Not Inserted");}
		
		if(b1.insertStoryBook(sb5)){System.out.println(sb5.getIsbn() + " Inserted");}
		else{System.out.println(sb5.getIsbn() + " Not Inserted");}
		
		if(b1.insertTextBook(tb1)){System.out.println(tb1.getIsbn() + " Inserted for  "+  b1.getName());}
		else{System.out.println(tb1.getIsbn() + " Not Inserted for sb " + b1.getName());}
		
		if(b1.insertTextBook(tb2)){System.out.println(tb2.getIsbn() + " Inserted");}
		else{System.out.println(tb2.getIsbn() + " Not Inserted");}
		
		if(b1.insertTextBook(tb3)){System.out.println(tb3.getIsbn() + " Inserted");}
		else{System.out.println(tb3.getIsbn() + " Not Inserted");}
		
		if(b1.insertTextBook(tb4)){System.out.println(tb4.getIsbn() + " Inserted");}
		else{System.out.println(tb4.getIsbn() + " Not Inserted");}
		
		if(b1.insertTextBook(tb5)){System.out.println(tb5.getIsbn() + " Inserted");}
		else{System.out.println(tb5.getIsbn() + " Not Inserted");}
		
		
		
		System.out.println("\n-----------------------------------\n");
		b1.showDetails();
		System.out.println("*****************Story Books********************\n");
		b1.showAllStoryBooks();
		System.out.println();
		System.out.println("*****************Text Books********************\n");
		b1.showAllTextBooks();
		System.out.println();
		
		
		System.out.println("\n-----------------------------------\n");
		
		if(b1.removeStoryBook(sb3)){System.out.println(sb3.getIsbn() + " Removed for Isbn: " + b1.getName());}
		else{System.out.println(sb3.getIsbn() + " Not Removed for Isbn: " + b1.getName());}
		
		if(b1.removeTextBook(tb2)){System.out.println(tb2.getIsbn() + " Removed for Isbn: " + b1.getName());}
		else{System.out.println(tb2.getIsbn() + " Not Removed for Isbn: " + b1.getName());}
		
		if(b1.removeTextBook(tb4)){System.out.println(tb4.getIsbn() + " Removed for Isbn: " + b1.getName());}
		else{System.out.println(tb4.getIsbn() + " Not Removed for Isbn: " + b1.getName());}
		
		
		System.out.println("\n-----------------------------------\n");
		b1.showDetails();
		System.out.println("*****************Story Books********************\n");
		b1.showAllStoryBooks();
		System.out.println();
		System.out.println("*****************TextBooks********************\n");
		b1.showAllTextBooks();
		System.out.println();
		
		System.out.println("\n-----------------------------------\n");
		StoryBook sb = b1.searchStoryBook(sb2.getIsbn());
		
		if(sb != null)
		{
			System.out.println("Book Found......");
			sb.showDetails();
		}
		else
		{
			System.out.println("No book Found with Isbn: " + sb2.getIsbn());
		}
		
		System.out.println("\n-----------------------------------\n");
		TextBook tb = b1.searchTextBook(tb2.getIsbn());
		
		if(tb != null)
		{
			System.out.println("Book Found......");
			tb.showDetails();
		}
		else
		{
			System.out.println("No Book Found with Isbn: " + tb2.getIsbn());
		}
		
	}
}