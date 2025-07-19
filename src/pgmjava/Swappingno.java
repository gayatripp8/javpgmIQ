package pgmjava;

public class Swappingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		/*//With using 3rd variable 
		int c=a;//=>10
		a=b;//a=20
		b=c;//b=10;
		System.out.println("After swapping the value:"+a+" "+b);
		*/
		//without using 3rd variable
		//+ -
		a=a+b;//a=10+20=30
		//a=30
		
		b=a-b; //30-20=10
		//b=10;
		
		a=a-b; //30-10=20
		
		//a=20;
		
		System.out.println("Swapping variable:"+a+" "+b);
		
		
	}

}
