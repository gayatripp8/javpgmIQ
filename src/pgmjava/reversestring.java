package pgmjava;

public class reversestring {

	public static void main(String[] args) {
		
		String str="gayatri";
		String reverse ="";
	int len=str.length();
	//System.out.println(len);
	
	for (int i=len-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		
	}
	System.out.println("reverse string:"+reverse);
	}
}
