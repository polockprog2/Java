import classes.*;
import java.lang.*;


public class Start
{
	public static void main(String[] args)
	{
		StoryBook sb1 = new StoryBook("35444342753699","hawa me urta jaye",120.75,10,"3");
		sb1.addQuantity(17);
        sb1.sellQuantity(40);
		sb1.showDetails();
        
		StoryBook sb2 = new StoryBook("364342442699","tere lal dupatta",130.75,20,"8");
		sb2.addQuantity(17);
        sb2.sellQuantity(20);
		sb2.showDetails();
   
		StoryBook sb3 = new StoryBook("374443242699","ur ur ur",140.75,30,"2");
		sb3.addQuantity(17);
        sb3.sellQuantity(50);
		sb3.showDetails();
        
		StoryBook sb4 = new StoryBook("38442432699","ure ure",150.75,40,"4");
		sb4.addQuantity(17);
        sb4.sellQuantity(23);
		sb4.showDetails();
        
		StoryBook sb5 = new StoryBook("39434322699","uri jaw ar asio na",160.75,50,"1");
		sb5.addQuantity(17);
        sb5.sellQuantity(25);
		sb5.showDetails();

	    TextBook tb1 = new TextBook("4543263249","one piece",420.75,41,15);
		tb1.addQuantity(12);
        tb1.sellQuantity(35);
		tb1.showDetails();
        
		TextBook tb2 = new TextBook("4553264239","one piece new world",520.75,50,23);
		tb2.addQuantity(13);
        tb2.sellQuantity(36);
		tb2.showDetails();
       
		TextBook tb3 = new TextBook("46442432469","one piece-to the fish man island",620.75,52,26);
		tb3.addQuantity(14);
        tb3.sellQuantity(37);
		tb3.showDetails();
        
		TextBook tb4 = new TextBook("47432432697","one piece new dignity",720.75,70,28);
		tb4.addQuantity(15);
        tb4.sellQuantity(38);
		tb4.showDetails();
        
		TextBook tb5 = new TextBook("48432643296","one piece life",820.75,80,30);
		tb5.addQuantity(16);
        tb5.sellQuantity(39);
		tb5.showDetails();
        
		
		BookShop b1 = new BookShop("pinikmama\n");
		
		System.out.println("\n-----------------------------------\n");
		b1.showDetails();
		System.out.println("*****************Customer Book Details********************\n");
		b1.showAllBooks();
		System.out.println();
		
		System.out.println("\n-----------------------------------\n");
		
		
		if(b1.insertBook(sb1))
		{
			System.out.println(sb1.getIsbn() + " Inserted for Isbn " +   b1.getName());
		}
		else
		{
			System.out.println(sb1.getIsbn() + " Not Inserted for Isbn: " + b1.getName());
		}
		
		if(b1.insertBook(sb2)){System.out.println(sb2.getIsbn() + " Inserted");}
		else{System.out.println(sb2.getIsbn() + " Not Inserted");}
		
		if(b1.insertBook(sb3)){System.out.println(sb3.getIsbn() + " Inserted");}
		else{System.out.println(sb3.getIsbn() + " Not Inserted");}
		
		if(b1.insertBook(sb4)){System.out.println(sb4.getIsbn() + " Inserted");}
		else{System.out.println(sb4.getIsbn() + " Not Inserted");}
		
		if(b1.insertBook(sb5)){System.out.println(sb5.getIsbn() + " Inserted");}
		else{System.out.println(sb5.getIsbn() + " Not Inserted");}
		
		if(b1.insertBook(tb1)){System.out.println(tb1.getIsbn() + " Inserted for  "+  b1.getName());}
		else{System.out.println(tb1.getIsbn() + " Not Inserted for sb " + b1.getName());}
		
		if(b1.insertBook(tb2)){System.out.println(tb2.getIsbn() + " Inserted");}
		else{System.out.println(tb2.getIsbn() + " Not Inserted");}
		
		if(b1.insertBook(tb3)){System.out.println(tb3.getIsbn() + " Inserted");}
		else{System.out.println(tb3.getIsbn() + " Not Inserted");}
		
		if(b1.insertBook(tb4)){System.out.println(tb4.getIsbn() + " Inserted");}
		else{System.out.println(tb4.getIsbn() + " Not Inserted");}
		
		if(b1.insertBook(tb5)){System.out.println(tb5.getIsbn() + " Inserted");}
		else{System.out.println(tb5.getIsbn() + " Not Inserted");}
		
		
		
		System.out.println("\n-----------------------------------\n");
		b1.showDetails();
		System.out.println("*****************Customer Books********************\n");
		b1.showAllBooks();
		System.out.println();
		
		System.out.println("\n-----------------------------------\n");
		
		if(b1.removeBook(sb3)){System.out.println(sb3.getIsbn() + " Removed for Isbn: " + b1.getName());}
		else{System.out.println(sb3.getIsbn() + " Not Removed for Isbn: " + b1.getName());}
		
		if(b1.removeBook(tb2)){System.out.println(tb2.getIsbn() + " Removed for Isbn: " + b1.getName());}
		else{System.out.println(tb2.getIsbn() + " Not Removed for Isbn: " + b1.getName());}
		
		if(b1.removeBook(tb4)){System.out.println(tb4.getIsbn() + " Removed for Isbn: " + b1.getName());}
		else{System.out.println(tb4.getIsbn() + " Not Removed for Isbn: " + b1.getName());}
		
		
		System.out.println("\n-----------------------------------\n");
		b1.showDetails();
		System.out.println("*****************Customer Books********************\n");
		b1.showAllBooks();
		System.out.println();
		
		System.out.println("\n-----------------------------------\n");
		
		Book sb = b1.searchBook(sb2.getIsbn());
		
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
		Book tb = b1.searchBook(tb2.getIsbn());
		
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