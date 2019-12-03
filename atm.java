class atm extends Exception{
	float money;
	public atm(float money)
	{
		this.money=money;
	} 
	public String toString()
	{
		return "Sorry"+money+" cannot be withdrawn transcaion limit exeed";
	}
}
class insuffuient extends Exception{
	float money;
	public insuffuient(float money)
	{
		this.money=money;
	}
	public String toString(){
		return " insuffient balance";
	}
}