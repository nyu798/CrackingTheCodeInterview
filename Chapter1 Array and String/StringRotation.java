public class StringRotation{
	public static void main(String args[]){
	String s1="waterbottle";
	String s2="terbottlewa";
	StringRotation prob = new StringRotation();
	boolean result = prob.isRotation(s1,s2);
	if(result == true){
		System.out.println("Reflect");
	}
	else{
		System.out.println("Don't Reflect");
	}
	}
	
	private boolean isRotation(String s1,String s2){
		int len=s1.length();
		if(len==s2.length() && len>0){
				String s1s2 = s1+s2;
			//return isSubstring(s1s2,s2);
			return s1s2.contains(s2);	
		}	
		else{
			return false;
		}	
		
	}
}