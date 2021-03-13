/**
* name: sahana B V
*Description : sum of digits
* date:3/12/2021
*/
import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args)
	{
		int num,n,sum=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
		System.out.println("sum of digits is"+sum);
		
		
	}
}