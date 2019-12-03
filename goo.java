class goo implements Runnable{
	int time;
	String str;
	public goo(int time,String str)
	{
		this.time=time;
		this.str=str;
	}
	public void run()
	{
		try{
			Thread.sleep(time);
			System.out.println(str);
		}
		catch(Exception e)
		{

		}
	}
}
