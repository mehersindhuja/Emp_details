import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int marks[]=new int[5];
		int i;
		float per = 0;
		float sum=0;
		System.out.println("Enter the 5 subject marks ");
		Scanner kb=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			marks[i]=kb.nextInt();
			sum=sum+marks[i];
			per=(sum/500)*100;
		}
		System.out.println("Total percentage is: "+per+"%");
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per>=70 && per<90)
		{
			System.out.println("Grade B");
		}
		else if(per>=50 && per<70)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Grade D");
		}
	}
}
