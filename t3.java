public class t3{
	public static void main(String argu[])
	{
		thread1 th =new thread1();
		thread2 tr=new thread2();
		th.start();
		tr.start();
	}
}