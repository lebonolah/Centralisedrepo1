package Package1;

public class Assignment2 {
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int a1, int b1)
	{
		int	c1=a1-b1;
		return c1;
	}
	
	public int mult(int a2, int b2)
	{
		int c2=a2*b2;
		return c2;
	}
	
	public void div(int a3, int b3)
	{
		int c3=a3/b3;
		System.out.println("The result of (((((10+2)+2)-2)*2)/2) = " +c3); 
	}
	
	
		public static void main(String[] args)
	{   //TODO Auto-generated method
			Assignment2 calc3=new Assignment2();
		int sum1=calc3.sum(10, 2);
		int sum2=calc3.sum(sum1, 2);
		int sub1=calc3.sub(sum2, 2);
		int mul1=calc3.mult(sub1, 2);
		calc3.div(mul1, 2);
		
	}
	
}
