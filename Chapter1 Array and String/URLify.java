import java.util.*;

public class URLify
{
	
	public static void main(String[] args)
	{
		String input ="Mr John Smith";
		System.out.println(input.length());
		char[] input_array = input.toCharArray();
		int space_count=0;
		for(char c : input_array)
		{
			if(c==' ')
			{
				space_count++;
			}
		}
		int new_array_lenght = input.length() + 2*space_count;
		char[] output_array = new char[new_array_lenght];
		int curr_pointer = -1;
		for(char c : input_array)
		{
			if(c==' ')
			{
				output_array[++curr_pointer]='%';
				output_array[++curr_pointer]='2';
				output_array[++curr_pointer]='0';
			}
			else
			{
				output_array[++curr_pointer]=c;
			}
		}
		System.out.println(output_array);
		
	}	
	
}