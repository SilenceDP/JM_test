
public class Roman //extends Arabik
{
	public Roman(String number1, String number2) 
	{	
	 //super(number1, number2);
	
	}


    int num1;
    int num2;
    int result;
    
    public void setNumber1(String number1)
	{
    	Converter converterArab=new Converter(number1);
    	num1=converterArab.converterInArab(number1);
    	
	}
    
	public void setNumber2(String number2) 
	{
		Converter converterArab=new Converter(number2);
		num2=converterArab.converterInArab(number2);	
	}
	
	public String plus() 
	{
		
		result=num1+num2;
		Converter converterRim=new Converter(result);
		return converterRim.converterInRim(result);
	}
	
	
	public String difference ()
	{
		result=num1-num2;
		Converter converterRim=new Converter(result);
		if(num1<num2) 
		{
			return "-"+converterRim.converterInRim(Math.abs(result));
		}else 
		{
			return converterRim.converterInRim(result);
		}	
	}
	
	public String multiply () 
	{
		result=num1*num2;
		Converter converterRim=new Converter(result);
		return converterRim.converterInRim(result);
	}
	
	public String divide()
	{
		try 
		{
			result=num1/num2;
			
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль недопустимо.");
		}finally 
		{
			System.exit(0);
		}
		Converter converterRim=new Converter(result);
		return converterRim.converterInRim(result);	
	}
		
}