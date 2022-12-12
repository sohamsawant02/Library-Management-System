/*Java Microproject
Topic- Library Management System
*/

import java.util.Scanner;
class memberdetails 
{
	String name;
	int age;
	int id;
	long phno;

	void getdata()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Name of Member=");
	name = sc.nextLine();
	
	System.out.println("Enter Age of Member=");
	age=sc.nextInt();

	System.out.println("Enter ID of Member=");
	id=sc.nextInt();
	
	System.out.println("Enter Phone Number of Member=");
	phno=sc.nextLong();
	}
	void putdata()
	{
	System.out.println("   Details of Student who issued Book From Library");
	System.out.println("  ________________________________________________");
	System.out.println("        Member Name:- "+name);
	System.out.println("        Age:- "+age);
	System.out.println("        Member ID:- "+id);
	System.out.println("        Phone No:- "+phno);
	}
}
class book extends memberdetails
{
	String bname;
	int bid;
	int idate;
	int rdate;
	void getdata()
	{
	super.getdata();
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Book Name=");
	bname =sc.nextLine();
	
	System.out.println("Enter Book ID=");
	bid =sc.nextInt();
	
	System.out.println("Enter Issue Date=");
	idate =sc.nextInt();
	
	System.out.println("Enter Return Date=");
	rdate =sc.nextInt();
	
	System.out.println("\n");
	}
	void putdata()
	{
	super.putdata();
	System.out.println("        Book Name:- "+bname);
	System.out.println("        Book ID:- "+bid);
	System.out.println("        Issue Date:- "+idate);
	System.out.println("        Return Date:- "+rdate);
	}
}	
class fine extends book
{
	void getdata()
	{
		super.getdata();
	}
	void putdata()
	{
		super.putdata();
	}
	void collectfine()
	{
		if((rdate-idate)>0 && (rdate-idate)<=7)
		{
			System.out.println("  ________________________________________________");
			System.out.println("   No Fine ");
			System.out.println("  ________________________________________________");
		}
		else if((rdate-idate)>7 && (rdate-idate)<=15)
		{
			System.out.println("  ________________________________________________");
			System.out.println("   Collect Fine Rs.100/- Only ");
			System.out.println("  ________________________________________________");
		}
		else if((rdate-idate)>15 && (rdate-idate)<=30 )
		{
			System.out.println("  ________________________________________________");
			System.out.println("   Collect Fine Rs.500/- Only ");
			System.out.println("  ________________________________________________");
		}
		else
		{
		System.out.println("  ________________________________________________");
		System.out.println("   Date Not Valid ");
		System.out.println("  ________________________________________________");
		}
	}
}
class details
{
	public static void main(String args[])
	{
	fine arr[];
	arr=new fine[3];
	int i;
	for(i=0;i<3;i++)
		arr[i]=new fine();
	
	for(i=0;i<3;i++)
		arr[i].getdata();
	
	for(i=0;i<3;i++)
		{	
		arr[i].putdata();	
		arr[i].collectfine();
		System.out.println("\n");
		}

	}
}