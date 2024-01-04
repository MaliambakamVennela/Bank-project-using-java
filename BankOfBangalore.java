package bank.updation.com;
import java.util.Scanner;

public interface BankOfBangalore 
{
  void balance();
  void transfer();
}
class SBI implements  BankOfBangalore 
{

	@Override
	public void balance() 
	{
	   
		System.out.println("50000/- is your balance amount");
	}

	@Override
	public void transfer() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the amount you want to transfer");
		int amount=sc.nextInt();
		System.out.println(amount+"/- transfered successfully");
		
	}
	
}
class UBI implements  BankOfBangalore 
{

	@Override
	public void balance() {
	
		System.out.println("50000/- is your balance amount");
	}

	@Override
	public void transfer() {
	
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the amount you wantc to transfer");
		int amount=sc.nextInt();
		System.out.println(amount+"/- transfered successfully");
	}
	
}
class Axis implements  BankOfBangalore 
{

	@Override
	public void balance() {
		System.out.println("50000/- is your balance amount");
	}

	@Override
	public void transfer() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the amount you want to transfer");
		int amount=sc.nextInt();
		System.out.println(amount+"/- transfered successfully");
		
	}
	
}
//single tone class
 class Info
{
	static String  accountHolderName="VENNELA";
	static long phonenumber=9652743406l;	
	static int pin=540687;
	static int count = 0;
	private   Info()
	{
		count++;
	}
	public static  Info getObj()
	{
		if (count==1)
		{
			return new Info();
		}
		else
		return null;
	}
}
//validating the info
 //USING factory method 
  class Validate 
 {
	public  static  BankOfBangalore  validation()
	 {
		Scanner sc= new Scanner(System.in);
		
			System.out.println("1.SBI\n2.UBI\n3.Axis");
			System.out.println("Enter your option ");
	        int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter your pin number");
				int pinnum=sc.nextInt();
				if(Info.pin==pinnum)
				{
					return new SBI();
//					
				}
//				else
//				{
//					return null;
//				}
			}
			break;
			case 2:
			{
				System.out.println("Enter your pin number");
				int pinnum=sc.nextInt();
				if(Info.pin==pinnum)
				{
					return new UBI();
				}
//				else
//				{
//					return null;
//				}
			}
			break;
			case 3:
			{
				System.out.println("Enter your pin number");
				int pinnum=sc.nextInt();
				if(Info.pin==pinnum)
				{
					return new Axis();
				}
//				else
//				{
//					return null;
//				}
			}
		
			default :System.out.println("PLEASE CHOOSE VALID BANK");
			
			}
			return null;
	 }
 }

//class validating
//{
//	public  static  BankOfBangalore  validation()
//
//	{
//		Scanner sc= new Scanner(System.in);
//	System.out.println("1.balance\n2.transfer");
//	int choice=sc.nextInt();
//	if(choice==1)
//	ref.balance();
//	else if(choice==2)
//	{
//		ref.transfer();
//	}
//	else
//		System.out.println("Enter valid option");
//	}
//
//}












