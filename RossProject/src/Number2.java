
public class Number2 
{
	int max;
	public static int tempAnswer;
	
	
	public Number2(int maxNumber)
	{
		max= maxNumber;
	}

	public static void BaseConversionVoid(int number , int base)
	{
		int answer = 0;
		
		if(number >= base) 
		{
			
			 BaseConversion(number / base , base);
		     answer = 10*answer + (number % base);               
		     
		}
		else
		{
			answer += number;
		}
		
		tempAnswer = answer;
	}
	
	public static int BaseConversion(int number , int base)
	{
		BaseConversionVoid( number ,  base);
		return tempAnswer;
		
		
	}
	
	public void layout()
	{
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		System.out.println (BaseConversion(50 , 3)) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
