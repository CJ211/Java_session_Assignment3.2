import java.util.*;

class stringmatch
{
	public static void main(String args[])
	{
		
		String s1,s2;
		boolean same;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String s1 ");	
		s1=sc.next();

		System.out.println("Enter second String s2 ");
		s2=sc.next();	
		
		 if (s1.equalsIgnoreCase(s2))
		{
			same=true;
		}
	
		else
		{
			same=false;
		}

		if(same)
		{
			System.out.println("Boolean value = "+same);	
			
		}

		else
		{
			System.out.println("Boolean value = "+same);
		}

	}
}	
