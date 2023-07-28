package Package1;

public class Assignment3 
{
	// (((((10/2)-2)+2)-2)*2)

	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int div(int a1, int b1)
	{
		int c1=a1/b1;
		return c1;
	}
	
	public int sub(int a2, int b2)
	{
		int c2=a2-b2;
		return c2;
	}
	
	public void mult(int a3, int b3)
	{
		int c3=a3*b3;
		System.out.println("The result of (((((10/2)-2)+2)-2)*2) =" + c3);
	}
	
	public static void main (String[] args)
	{
		Assignment3 calc2=new Assignment3();
		{
			int div=calc2.div(10, 2);
			int sub=calc2.sub(div, 2);
			int add=calc2.sum(sub, 2);
			int sub1=calc2.sub(add, 2);
			calc2.mult(sub1, 2);
		}
	}
	
}
