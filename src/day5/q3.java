package day5;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		int n ,max=0,rows,cols; 

		Scanner sc=new Scanner(System.in);
	//	n=sc.nextInt();
		System.out.println(" enter no. of rows");
		rows=sc.nextInt();
		System.out.println("enter no.of clos");
		cols=sc.nextInt();
		int []a[]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				{
				 if (max<a[i][j])
				 {
					 max=a[i][j];
				 }
				}


		}System.out.println("the maximum  element in matrix is:"+max);
	}


	}

