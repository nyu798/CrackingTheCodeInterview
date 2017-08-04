import java.util.*;

public class isUnique{

	
	public boolean uniqueChar(String str)
		{
			if(str.length()>256)
			{
				return false;
			}
			else
			{
				boolean[] char_set=new boolean[256];
				for(int i=0;i<str.length();i++)
				{
					int val= str.charAt(i);
					if(char_set[val])
					{
						return false;
					}
					char_set[val]=true;
				}
			return true;
			}
		}
		
	public static void main(String[] args){
		isUnique instance = new isUnique();
		char response;
			{
		String input;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the string to check for unique character: ");
		input = in.nextLine();
		if(instance.uniqueChar(input)){
			System.out.println("The string has unique characters");
		}
		else{
			System.out.println("The string doesn't have all unique characters");
		}
		
		System.out.println("Do you want to continue?(y/n)");
		response = in.next().charAt(0);
		}while(response == 'y');
	
	
	}	
}