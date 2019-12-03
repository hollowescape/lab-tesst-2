 class thread1 extends Thread{
public void run()
	{
		int fib1,fib2,fib3;
		fib1=0;
		fib2=1;
		try{
		System.out.print(" "+fib1+" "+fib2);
		for(int i=2;i<20;i++)
		{
			fib3=fib1+fib2;
			System.out.print(" "+fib3);
			fib1=fib2;
			fib2=fib3;
			Thread.sleep(500);
		}
	}
	catch(Exception e)
	{

	}
	}
}
class thread2 extends Thread{
	public void run()
	{
		for(int i=2;i<=50;i++)
		{
			int counter=1;
			for(int j=i;j>1;j--)
			{
				if(i%j==0)
				{
					counter+=counter;
				}
			}
			try{
			if(counter==2)
			{
				System.out.println(""+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{

		}
		}
	}
}
