public class t1 extends Thread{
	public static void main(String arg[])
	{
		Thread t=Thread.currentThread();
		System.out.println(" current threaa"+t);
		t.setName("hello");
		System.out.println(" current threaa"+t);
		t.setPriority(6);
		System.out.println(" current threaa"+t);
		System.out.println(" current threaa"+t.isAlive());
		System.out.println(" current threaa"+t.getName());
		System.out.println(" current threaa"+t.getPriority());
	}	

}