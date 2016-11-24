package marksofstudents;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int studentcount = 0;
		// TODO Auto-generated method stub
		while (studentcount<5)
		{
		int subjectcount=0;
		Calculator Casio=new Calculator();
		System.out.println("Enter Student name");
		Scanner Scannerobj=new Scanner(System.in);
		String Studentname=Scannerobj.next();
		System.out.println("Student name is:"+Studentname);
		studentcount=studentcount+1;
		System.out.println("please enter your mark1");
		int mark1=Scannerobj.nextInt();
		System.out.println("please enter your mark2");
		int mark2=Scannerobj.nextInt();
		System.out.println("please enter your mark3");
		int mark3=Scannerobj.nextInt();
		System.out.println("please enter your mark4");
		int mark4=Scannerobj.nextInt();
		System.out.println("please enter your mark5");
		int mark5=Scannerobj.nextInt();
		subjectcount = subjectcount+5;
		Casio.add(mark1,mark2,mark3,mark4,mark5);
		
	}

	
	}
	private int add(int mark1,int mark2,int mark3,int mark4,int mark5)
	{
		// TODO Auto-generated method stub
	int total=mark1+mark2+mark3+mark4+mark5;
	System.out.println("total is"+total);
	return total;
	}
	} 