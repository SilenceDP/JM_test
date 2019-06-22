
public class Converter
{
	public Converter(String number)
	{
		
	}
	
	
	public Converter(int result) 
	{
		
	}


	public int converterInArab (String number) 
	{ 
		String numRim=number;
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
	
		public String converterInRim(int number) 
		{
			int numArab=number;
	        StringBuffer a = new StringBuffer("");        
	        int c1 = numArab / 100;
	        a.append(numeralC(c1));
	        // остаток
	        int c2 = numArab % 100;

	        // Выделяем полсотни
	        int l1 = c2 / 50;
	        a.append(numeralL(l1));
	        // остаток
	        int l2 = c2 % 50;

	        // Выделяем десятки
	        int x1 = l2 / 10;
	        a.append(numeralX(x1));
	        // остаток
	        int x2 = l2 % 10;

	        // Выделяем то что осталось
	        a.append(basic(x2));
	        return a.toString();
	    }
		
		
		// преобразовываем целые сотни
		private String numeralC(int in) 
		{
		    StringBuffer a = new StringBuffer("");
		    int i = 0;
		    while(i < in) 
		    {
		    	a.append("C");
		        i++;
		    }
		        return a.toString();
		  }
		
//		    // преобразовываем пол сотни
	     private String numeralL(int in) 
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
		        else 
		        {
		        	return "";
		        }
		     }
		
	    // целые десятки
	    private String numeralX(int in) 
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
	        else 
	        {
	        	return "";
	        }
	    }
	   
	    // От 1 до 9
	    private String basic(int in) 
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
