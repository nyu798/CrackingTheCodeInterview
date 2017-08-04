import java.util.*;

public class CheckPermutation
{
	public boolean permutation(String s1, String s2)
	{	
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			int[] char_set = new int[128];
			char[] str1 = s1.toCharArray();
			
			for(char c : str1)
			{
				char_set[c]++;
			}
			for(int i=0;i<s2.length();i++)
			{
				int value = (int)s2.charAt(i);
				char_set[value]--;
				if(char_set[value]<0)
				{
					return false;
				}	
			}
		}
		return true;	
	}
	
		


	public static void main(String[] args){
		CheckPermutation instance = new CheckPermutation();
		char response;
		do
		{
			String string1,string2;
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter the first string : ");
			string1 = in.nextLine();
			System.out.println("Please enter the second string : ");
			string2 = in.nextLine();
			if(instance.permutation(string1,string2))
			{
				System.out.println("The strings are permutation of each other");
			}
			else
			{
				System.out.println("Not permutation of each other");
			}
			System.out.println("Do you want to continue?(y/n)");
			response = in.next().charAt(0);
		}while(response == 'y');
	
	
	}
}