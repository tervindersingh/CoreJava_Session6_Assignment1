import java.io.*;
interface interface1
{
	public void printnum(int a);
}
class ClfPrintNum implements interface1
{
	public void printnum(int a)
	{
		System.out.println("Number is : "+a);
	}
}
class ClfPrintSqr implements interface1
{
	public void printnum(int a)
	{
		System.out.println("Square of the Number is : "+a*a);
	}
}
public class ExpInterface
{
	public static void main(String args[]) throws Exception
	{	int a;
		String str;	
		try
		{ 
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter any number:");
			str=br.readLine();
			a=Integer.parseInt(str);

			ClfPrintNum CN=new ClfPrintNum();
			ClfPrintSqr CS=new ClfPrintSqr();
			CN.printnum(a);
			CS.printnum(a);
		
		} 
		catch (IOException e)
		{	e.printStackTrace();
		}
		
	}
}