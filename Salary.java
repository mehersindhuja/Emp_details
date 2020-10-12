import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Emp x=new Emp();
		x.getInput();
		x.display();
		x.sala();
		}
}
class Emp
{
	String name;
	//int dob;
	int sal;
	public void getInput()
	{
		System.out.println("Enter your Name, DOB, and monthly salary");
		Scanner kb = new Scanner(System.in);
		name=kb.next();
		//dob=kb.nextInt();
		sal=kb.nextInt();
	}
	public void sala()
	{
		int total;
		total=sal*12;
		System.out.println("Total Annual Salary is "+total);
		if(total>500000)
		{
			System.out.println("Tax amount >20%");
		}
		else if(total>=400000 && total<=500000)
		{
			System.out.println("Tax amount 20%");
		}
		else if(total>=300000 && total<400000)
		{
			System.out.println("Tax amount 10%");
		}
		else if(total>=200000 && total<300000)
		{
			System.out.println("Tax amount 5%");
		}
		else
		{
			System.out.println("No Tax");
		}
	}
	public void display()
	{
		System.out.println("The name is "+name);
	}

}
