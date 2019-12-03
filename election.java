import java.util.*; 
class elect extends Exception{
	int age;
	public elect(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "the age "+age+" is not eligible not vote";
	}
}

public  class election{
	 static void check(int a) throws elect
	 {
	 	if((a<2)||(a>120))
	 	{
	 		throw new elect(a);
	 	}
	 	else
	 	{
	 		System.out.println(" you are elegible to vote");
	 	}
	 }
	 public static void main(String argu[])
	 {
	 	Scanner o=new Scanner(System.in);
	 	try{
	 		System.out.println(" enter the age of person");
	 			int a=o.nextInt();
	 			check(a);
	 	}
	 	catch(elect e)
	 	{
	 		System.out.println(" caught :"+ e);
	 	}
	 }

}