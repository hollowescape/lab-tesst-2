public class t2 extends Thread{

	public static void main(String argu[])
	{
		try{
			for (int i=1;i<10;i++){
			System.out.println(" bengulurur");
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			System.out.println(" caught"+e);
		}

	}
}