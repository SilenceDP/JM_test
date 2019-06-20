import java.util.Scanner;

/*Задача: программа “Калькулятор”
Описание:
Создайте консольное приложение “Калькулятор”.
Приложение должно читать из консоли введенные пользователем арифметические операции и выводить в консоль результат их выполнения.
Требования:
Калькулятор умеет выполнять операции сложения, 
вычитания, умножения и деления с двумя числами:
 a + b, a - b, a * b, a / b. 
Данные передаются в одну строку (смотрите пример)! 
Решения, в которых каждое число и арифмитеческая операция
передаются с новой строки считаются неверными.
Калькулятор умеет работать как с арабскими (1,2,3,4,5…),
так и с римскими (I,II,III,IV,V…) цифрами.
Калькулятор умеет работать с цифрами от 1 до 10 включительно.
Калькулятор умеет работать только с целыми числами.
Калькулятор умеет работать только с арабскими или 
римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II 
калькулятор должен выбросить исключение и прекратить свою работу.
При вводе пользователем неподходящих чисел приложение выбрасывает исключение и 
завершает свою работу.
При вводе пользователем строки не соответствующей одной из вышеописанных 
арифметических операций приложение выбрасывает исключение и завершает свою работу.
Пример работы программы:

Input:
1 + 2

Output:
3
Input:
VI / III

Output:
II

Принципы оценки работы:
Обратите внимание на принципы ООП, постарайтесь разбить программу на логические классы. 
Решения, в которых весь код программы находится в одном классе будут низко оценены. 
Продемонстрируйте своё умение в работе с разными синтаксическими конструкциями, 
не забудьте про исключительные ситуации, при которых выполнение программы невозможно 
из-за некорректных входных данных.
Как отправить решение?
Если вы не знакомы с git и Github вам нужно ознакомиться с этой статьей, 
в ней описаны основы работы с git.
Если вы уже ознакомились с основами работы с git или 
были знакомы ранее - вам нужно создать собственный репозиторий и 
добавить туда проект с решением.
Ссылку на репозиторий отправьте нам на почту info@java-mentor.com 
с темой Тестовое задание калькулятор.
 * 
 */
public class Main 
{

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input:");
		//String str = scanner.next("[1234567890IVX]");
		String str = scanner.nextLine();
		
		String[] number = str.replace(" ", "").split("[+\\-\\*\\/|]");
//		for(String s:number) 
//		{
//			System.out.println(s);
//		}
				
		//char symbolForce;
		for(int i=0;i<str.length();i++) 
		{
			if (str.charAt(i)=='+'||
				str.charAt(i)=='-'||
				str.charAt(i)=='*'||
				str.charAt(i)=='/') 								
			{
				
				char symbolForce= str.charAt(i);
				String valid=validation (number[0]);
			    
				
				if(valid=="arab")
			    { 
			    	//класс арабский
			    	//Arabik arabik=new Arabik(number[0],number[1],symbolForce);
			    	
					Arabik arabik=new Arabik(number[0],number[1]);
			    	arabik.setNumber1(number[0]);
			    	arabik.setNumber2(number[1]);
					switch (symbolForce) 
			    	{
					case '+':
						//String res= arabik.plus();
					
						System.out.println("Output:\n"+arabik.plus());
						break;
					case '-':
						System.out.println("Output:\n"+arabik.difference());
						break;
					case '*':
						System.out.println("Output:\n"+arabik.multiply());
						break;
					case '/':
						System.out.println("Output:\n"+arabik.divide());
						break;	
					default:
						break;
					}
			
			    	    	
			    }else if (valid=="rim") {
					// класс римский

			    	
			    	Roman roman=new Roman(number[0],number[1]);
			    	
			    roman.setNumber1(number[0]);
			    roman.setNumber2(number[1]);
			    	switch (symbolForce) 
			    	{
					case '+':
						System.out.println("Output:\n"+roman.plus());
						break;
					case '-':
						System.out.println("Output:\n"+roman.difference());
						break;
					case '*':
						System.out.println("Output:\n"+roman.multiply());
						break;
					case '/':
						System.out.println("Output:\n"+roman.divide());
						break;	
					default:
						break;
					}
			    	
			    	
			    	
				}else if (valid=="error") 
			    {
					System.out.println("Ошибка: "+"Неверный аргумент "+number[0]);
					
			    }			
				break; //предотвращаем холостой пробег
			}
			else if(i==str.length()-1)
			{
				System.out.println("Запись не является корректной. Отсутствует знак действия(+, -, * или /)");
			
			}
		}
		
	    			
	}
		
	static String validation (String argument)
	{			
			String typeDigitl = "";
			
				if ( argument.equals("I")   ||  
					 argument.equals("II")  ||
					 argument.equals("III") ||
					 argument.equals("IV")  ||
					 argument.equals("V")   ||
					 argument.equals("VI")  ||
					 argument.equals("VII") ||
					 argument.equals("VIII")||
					 argument.equals("IX")  ||
					 argument.equals("X"))
				{
					typeDigitl="rim";					
				}else if(Integer.parseInt(argument) >= 1 && Integer.parseInt(argument) <= 10)
				{
					typeDigitl="arab";						
				}else 
				{
					typeDigitl="error";
				}				
				return typeDigitl;			
	}	

}

//String[] rim= {"I","II","III","IV","V","VI","VII","VII","VIII","IX","X"};
//доступные арабские цифры: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//доступные римские  цифры: I, II, III, IV, V, VI, VII, VIII, IX, X
//операторы +, -, *, /

