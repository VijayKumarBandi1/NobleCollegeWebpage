package business;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

 class VijayHotel {
	public static void main(String args[])
	{
		int count=0;
		ArrayList at =new ArrayList();
		System.out.println("WELCOME TO vijay HOTEL");
		System.out.println("If u  want to book A room PLEASE Enter below details");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Name");
		String a=sc.next();
		System.out.println("Choose Your Room");
		System.out.println("1Star=600 2Star=700 3Star=850 4Star=1000 5Star=1200 plese entre(1,2,3,4,5)");
		int i=sc.nextInt();
		System.out.println("How many days  u r staying here");
		int j=sc.nextInt();
		
		if(i==1&&j<=4) {
			int total=600*j;	
			System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+total);
			count++;
		}
		else if(i==2 && j<=4){
			int total=700*j;	
			System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+total);
			count++;

		}
		else if(i==3 && j<=4){
			int total=850*j;	
			System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+total);
			count++;

		}
		else if(i==4 && j<=4){
			int total=1000*j;	
			System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+total);
			count++;

		}
		else if(i==5 && j<=4){
			int total=1200*j;	
			System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+total);
			count++;

		}
		else if(i==1 && j>5)
			{
				int total=600*j;
				float Subtotal=(float) (total-(total*0.1));
				System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
				count++;
			}
			
				else if(i==2 && j>5)
				{
					int total=700*j;
					int Subtotal=(int)(total-(total*0.1));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				}
				else if(i==3 && j>5)
				{
					int total=850*j;
					int Subtotal=(int)(total-(total*0.1));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				}
				else if(i==4&& j>5)
				{
					int total=1000*j;
					int Subtotal=(int)(total-(total*0.1));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				}
				else if(i==5 && j>5)
				{
					int total=1200*j;
					int Subtotal=(int)(total-(total*0.1));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				}
				else if(i==1 && j>10)
				{
					int total=600*j;
					int Subtotal=(int)(total-(total*0.15));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
					
				}
				else if(i==2 && j>10)
				{
					int total=700*j;
					int Subtotal=(int)(total-(total*0.15));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				}
				else if(i==3 && j>10)
				{
					int total=850*j;
					int Subtotal=(int)(total-(total*0.15));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
					
				}
				else if(i==4 && j>10)
				{
					int total=1000*j;
					int Subtotal=(int)(total-(total*0.15));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				}
				else if(i==5 && j>10)
				{
					int total=1200*j;
					int Subtotal=(int)(total-(total*0.15));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
					
				}
				else if(i==1 &&j>=15)
				{
					int total=600*j;
					float Subtotal=(float) (total-(total*0.2));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
					
				}
				else if(i==2&&j>=15)
				{
					int total=700*j;
					int Subtotal=(int)(total-(total*0.2));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;

				}
				else if(i==3&&j>=15) {
					int total=850*j;
					int Subtotal=(int)(total-(total*0.2));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				
					
				}
				else if(i==4&&j>=15)
				{
					int total=1000*j;
					int Subtotal=(int)(total-(total*0.2));
					System.out.println("TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
				}
				else if(i==5&&j>=15)
				{
					int total=1200*j;
					int Subtotal=(int)(total-(total*0.2));
					System.out.println( "TOTAL AMOUNT U HAVE TO BE PAID AFTER DISCOUNT IS"+Subtotal);
					count++;
					
				}
				else
				{
					System.out.println("invalid");
				}
			if(count>20)
			{
				System.out.println("Hotel is full");
			}
			
	
			
	}
	
			
		
		
		
	}





