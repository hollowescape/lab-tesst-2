class commandex extends Exception{
	private int a;
	commandex(int a)
	{
		this.a=a;
	}
	public String toString()
	{
		return "  no of command line arguments is less";
	}
}
public class command{
	static void command(int a) throws commandex
	{
		if(a<3)
		{
			throw new commandex(a);
		}
		else
		{
			System.out.println(" no of command line argument are more than 3");
		}
	}
	public static void main(String argu[])
	{
		try{
			int n;
			n=argu.length;
			command(n);
		}
		catch(commandex e)
		{
			System.out.println("caught"+ e);
		}
	}
}