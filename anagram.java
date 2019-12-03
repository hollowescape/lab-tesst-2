class anagram{


	void check3(String a, String b)
	{
		for(int h=0;h<b.length();h++)
		{  
			if(a.length()==b.length())
		{
			if(a.charAt(2)==b.charAt(h))
			{
				System.out.println(" strings are anagram");
			}
		}
		}
	}
	void check2(String a,String b)
	{
		for(int j=0;j<b.length();j++)
		{	
			if(a.length()==b.length()){


			if(a.charAt(1)==b.charAt(j))
			{
				check3(a,b);
			}
		}
		}
	}
	void check(String a,String b)
	{	int i=0;
		for(i=0;i<b.length();i++)
		{	
			if(a.length()==b.length()){
			if(a.charAt(0)==b.charAt(i))
			{	System.out.println("hi");
				check2(a,b);
			}
		}
	}
	}
}