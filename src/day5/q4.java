package day5;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		n= sc.nextInt();
		int a[][]=new int [n][n];
		System.out.println(" the elements for matrix are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			a[i][j]=sc.nextInt();
			}
		} 
		for( int i=0;i<n;i++)
		{
			for( int j=0;j<n;j++)
			{

				if(i!=j)
				{
					if(a[i][j]==0)
					{

						flag=0;
					}
					else {break;}
				}

			}
		}
		if(flag==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

	}

