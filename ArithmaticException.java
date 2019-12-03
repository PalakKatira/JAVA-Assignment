
public class ArithmaticException {

	public static void main(String[] args) {
		int k = 0;// Variable has to be assigned with some value
		int i = 5;
		int j = 1;//if j=0 then try block encounters error at 1st step itself and does not execute the next codes 
		int[] a = new int[4];
		
		try// 1 try can have multiple catches
		{
			k = i / j;// critical statement
			for (int x = 0; x <= 4; x++) {
				a[x] = x + 1;
			}
			for (int value : a) {
				System.out.print(value);
			}
		}
		
		/*catch(Exception e) {
			System.out.println(Unknown Exception);
		}*/
		
		catch (ArithmeticException e)// every try block is accompanied by a (particular/general)catch block
		{
			System.out.println("Cannot divide by zero" + e);// user defined error message
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum number of value is 4");// that is you can only add 4 elements
		}
		
		catch(Exception e)
		{
			System.out.println("Unknown Exception Encountered");
		}
		
		
		System.out.println(k);
	}
}
