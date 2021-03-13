/**
* name: sahana B V
*Description : convert celsious temperature to fahrenhiet 
* date:3/12/2021
*/
import java.util.Scanner;
class celcius
{
	public static void main(String[] args)
	{
		int c;
		double f;
		Scanner in=new Scanner(System.in);
		c=in.nextInt();
		f=(c*1.8)+32;
		System.out.println("after converting celsius to fahrenhiet is"+f);
	}
}