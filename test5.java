import java.util.*;
public class test5{
	static void compute(float money) throws atm, insuffuient
	{
		if(money>40000)
		{
			throw new insuffuient(money);
		}
		if(money>25000)
		{
			throw new atm(money);
		}
		else
		{
			System.out.println(" you can take the cash");
		}
	}
	public static void main(String arg[])
	{	
		Scanner o=new Scanner(System.in);
		try{
			System.out.println(" ente the amount of cash withdrawn");
			float m=o.nextFloat();
			compute(m);
		}
		catch(atm e)
		{
			System.out.println(" caught "+e);
		}
		catch(insuffuient e)
		{
			System.out.println("caught"+e);
		}
	}
}