public class StringCompression{

	public static void main(String args[]){
		String str="abcd";
		String s = compressString(str);
		System.out.println(s);
	}

	public static String compressString(String str){
		String mystr="";
		char last =str.charAt(0);
		int count=1;
		for(int i =1;i<str.length();i++){
			if(str.charAt(i)==last){
			count++;
			}
			else{
			mystr+= last+""+count;
			last=str.charAt(i);
			count=1;
			}
		}
		return mystr+last+""+count;
	}

}