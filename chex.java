import java.util.*;
public class chex{
	static void elgible(int a,int b){
		try{
		if((a<80)||(b<20))
		{	
			Exception e=new Exception("low marks");
			e.initCause(new Exception("attendence is low not elgible"));
			throw e;
		}
		else
		{
			System.out.println(" you are elgible");
		}
	}
	catch(Exception e)
		{
			System.out.println("caught:"+e);
			System.out.println("original Cause"+e.getCause());
		}

	}
	public static void main(String argi[])
	{
		Scanner o= new Scanner(System.in);
		try{
			System.out.println(" enter the attendence of person");
			int a=o.nextInt();
			System.out.println(" enter the marks of cie");
			int b=o.nextInt();
			elgible(a,b);
		}
		catch(Exception e)
		{}
		
	}
}
