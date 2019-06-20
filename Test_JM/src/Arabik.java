public class Arabik
{
	private int num1;
	private int num2;
	private int result;
	
	
	public Arabik(String number1, String number2)
	{
		
		// TODO Auto-generated constructor stub
	}


	public int getNumber1() 
	{
		return num1;
	}


	public void setNumber1(String number1)
	{
		this.num1 = Integer.parseInt(number1);
	}


	public int getNumber2() 
	{
		return num2;
	}


	public void setNumber2(String number2) 
	{
		this.num2 = Integer.parseInt(number2);
	}
	
	
	public String plus () 
	{
		result=num1+num2;
		return String.valueOf(result);
	}
	
	public String difference () 
	{
		result=num1-num2;
		return String.valueOf(result);
	}
	
	public String multiply () 
	{
		result=num1*num2;
		return String.valueOf(result);
	}
	
	public String divide () 
	{
		result=num1/num2;
		return String.valueOf(result);
	}



}
