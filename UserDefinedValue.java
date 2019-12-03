import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UserDefinedValue 
{
	
	public static void main(String[] args)
	{

	int i=8,j;
	int k=0;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	//one way of taking values from the user
	//j=Integer.parseInt(br.readLine());//br.readLine takes value from the user in the form of string
	
		try
		{
		    j=Integer.parseInt(br.readLine());
			k=i/j;
		}
		 
		catch(IOException e)//checked exception
		{
			System.out.println(" Some sort of io error");//?example to check this
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot be divided by zero");
		}
		
		catch(Exception e)
		{
			System.out.println("Unknown Exception encountered");
		}
		
		System.out.println(k);
    } 
}
