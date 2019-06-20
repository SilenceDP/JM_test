
public class Roman extends Arabik
{
	public Roman(String number1, String number2) 
	{	
	 super(number1, number2);
	// TODO Auto-generated constructor stub
	}


    int num1;
    int num2;
    int result;

//	public int getNumber1() 
//	{
//		return num1;
//	}

    public void setNumber1(String number1)
	{
		num1=converterInArab(number1);		
	}
	
//    public int getNumber2() 
//	{
//		return num2;
//	}
    
	public void setNumber2(String number2) 
	{
		num2=converterInArab(number2);	
	}
	
	

	public String plus() 
	{
		result=num1+num2;
		return converterInRim(result);
	}
	
	
	public String difference ()
	{
		result=num1-num2;
		if(num1<num2) 
		{
			return "-"+converterInRim(Math.abs(result));
		}else 
		{
			return converterInRim(result);
		}	
	}
	
	public String multiply () 
	{
		result=num1*num2;
		return converterInRim(result);
	}
	
	public String divide () 
	{
		result=num1/num2;
		//не забыть!!! обработать деление на ноль
		return converterInRim(result);
	}
		
	
	public int converterInArab (String numRim) 
	{ 
		
		int numArab = 0;
		switch (numRim)
		 {
		 case "I"   :numArab = 1;
		 	break;
		 case "II"  :numArab = 2;
		 	break;
		 case "III" :numArab = 3;
		 	break;
		 case "IV"  :numArab = 4;
		 	break;
		 case "V"   :numArab = 5;
		 	break;
		 case "VI"  :numArab = 6;
		 	break;
		 case "VII" :numArab = 7;
		 	break;
		 case "VIII":numArab = 8;
		 	break;
		 case "IX"  :numArab = 9;
		 	break;
		 case "X"   :numArab = 10;
		 	break;
		     default: System.out.print("Введен не корректный символ");
		 }
		return numArab;
		
		
	}
	
		public static String converterInRim(int numArab) 
		{
	        StringBuffer a = new StringBuffer("");
	        // Выделяем тысячи
	        int m1 = numArab/1000;
	        a.append(M(m1));
	        // то что осталось после тысяч
	        int m2 = numArab % 1000;

	        // Выделяем пятьсот из остатка от тысячи
	        int d1 = m2 / 500;
	        a.append(D(d1));
	        // остаток после выделения полтысячи
	        int d2 = m2 % 500;

	        // Выделяем сотни из остатка
	        int c1 = d2 / 100;
	        a.append(C(c1));
	        // остаток из сотен
	        int c2 = d2 % 100;

	        // Выделяем полсотни
	        int l1 = c2 / 50;
	        a.append(L(l1));
	        // остаток
	        int l2 = c2 % 50;

	        // Выделяем десятки
	        int x1 = l2 / 10;
	        a.append(X(x1));
	        // остаток
	        int x2 = l2 % 10;

	        // Выделяем то что осталось
	        a.append(basic(x2));
	        return a.toString();
	    }

	    // преобразовываем целые тысячи
	    private static String M(int in) 
	    {
	        StringBuffer a = new StringBuffer("");
	        int i = 0;
	        while(i < in) 
	        {
	            a.append("M");
	            i++;
	        }
	        return a.toString();
	    }
	    
	    // преобразовываем пол тысячи
	     private static String D(int in) 
	     {
	        if (in == 4) 
	        {
	        	return "CM";// если 900, то 1000-100
	        } 
	        
	        else if (in != 0 && in < 4) 
	        {
	            StringBuffer a = new StringBuffer("");
	            int i = 0;
	            while(i < in) 
	            {
	                a.append("D");
	                i++;
	            }
	            return a.toString();
	        }
	        else return "";
	     }
	    
	    // преобразовываем пол сотни
	     private static String L(int in) 
		    {
		        if (in == 4) 
		        {
		        	return "XC";// если90 то100 - 10
		        } 
		        else if (in != 0 && in < 4) 
		        {
		            StringBuffer a = new StringBuffer("");
		            int i = 0;
		            while (i < in) 
		            {
		                a.append("L");
		                i++;
		            }
		            return a.toString();
		        }
		        else return "";
		     }
	    
	    // преобразовываем целые сотни
	    private static String C(int in) 
	    {
	        if (in == 4) 
	        {
	        	return "CD"; //если 400, то 500-100
	        }
	        else if (in != 0 && in < 4) 
	        {
	            StringBuffer a = new StringBuffer("");
	            int i = 0;
	            while (i < in) 
	            {
	                a.append("C");
	                i++;
	            }
	            return a.toString();
	        }
	        else return "";
	    }

	    // целые десятки
	    private static String X(int in) 
	    {
	        if (in == 4) 
	        {
	        	return "XL"; // если 40, то 50-10
	        }
	        else if (in != 0 && in < 4) 
	        {
	            StringBuffer a = new StringBuffer("");
	            int i = 0;
	            while (i < in) 
	            {
	                a.append("X");
	                i++;
	            }
	            return a.toString();
	        }
	        else return "";
	    }
	   
	            // От 1 до 9
	            private static String basic(int in) 
	            {
	                String[] a = 
	                {
	                    "",
	                    "I",
	                    "II",
	                    "III",
	                    "IV",
	                    "V",
	                    "VI",
	                    "VII",
	                    "VIII",
	                    "IX"
	                };
	                return a[in];
	            }

	        
}


