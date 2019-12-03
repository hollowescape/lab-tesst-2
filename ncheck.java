package numbercheck;

public class ncheck extends Exception{

	String s;
	public ncheck(String s)
	{
		this.s=s;
	}
	public String toString()
	{
		return "the number"+s+" is not correct";
	}

}