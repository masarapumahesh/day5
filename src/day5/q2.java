package day5;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		int n ,max=0,min=1; 

		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();

		int a[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) 
		{
			if(max<a[i]) 
			{

				max=a[i];
			}
		
	}
	System.out.println(max);
	
	for(int i=0;i<n;i++) 
	{
		if(a[i]<min) 
		{

			min=a[i];
		}
	}
	System.out.println("the minimum element"+min);

}
}