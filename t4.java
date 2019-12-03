public class t4{
	public static void main(String arg[])
	{
		goo g1=new goo(1000,"good m");
		goo g2=new goo(2000," m");
		goo g3=new goo(3000,"hell m");
		Thread t1=new Thread(g1);
		Thread t2=new Thread(g2);
		Thread t3=new Thread(g3);
		t1.start();
		t2.start();
		t3.start();
	}
}