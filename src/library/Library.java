package library;
import java.util.*;
public class Library {

	String BookName[]=new String[]{"Physics","Chemistry","Math"};
	String AuthorName[]=new String[] {"AP","Jp","Cp"};
	int AvailableCopies=3;

	
	

		
	
	public void searchBookByBookName(String s2)
	{
	for(int i=0;i<3;i++)
	{
		if(s2==BookName[i])
		{
			System.out.println("Book is available");
			this.issueBook();
		}

	}
	
	}
	
	
	public void issueBook()
	{
		
		System.out.println("Issue the book");
		AvailableCopies--;
	
			
		
		System.out.println("After  Issuing Book Available copies are"   +AvailableCopies);
		
	}
	
	public void searchBookByAuthorName(String s3)
	{
		for(int i=0;i<3;i++)
		{
			if(s3==AuthorName[i])
			{
				System.out.println("Book is Available");
				this.issueBook();
				
			}
			
		}
	
	}

	public void returnBook()
	{
		System.out.println("Book return Succesfully");
		AvailableCopies++;
		System.out.println("Available copies After Book Return "   +AvailableCopies);
	}
	public static void main(String args[]) {
		
		System.out.println("What u want to Do");
		System.out.println("Enter Your Choice\n 1:SearchBookByBookNmae  \n2:SearchBookByAuthorName  \n3:Return Book");
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		Library L =new Library();
		switch(s1)
		{
		case 1: L.searchBookByBookName("Physics");
				break;
				
		case 2: L.searchBookByAuthorName("hp");
				break;
		case 3: L.returnBook();
		
		}
	}

}
