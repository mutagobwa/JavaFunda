
public class ArithMetic {
	//Addition func Start
	public static int AddNumbers(int a,int b) {
		int sum=a+b;
		
	return sum;  	
	}
	//Addition func End
	
	
	//Division func Start
	public static int DivideTwoNumbers(int a,int b) {
		int div=a/b;
		return div;
	}
	//Division func End
	
	
	//Subtraction func Start
		public static int SubtractTwoNumbers(int a,int b) {
			int sub=a-b;
			return sub;
		}
		//Subtraction func End
		
		//Multiplication func Start
				public static int MultiplicationTwoNumbers(int a,int b) {
					int mul=a*b;
					return mul;
				}
				//Multiplication func End
				
				//Modulus func Start
				public static int ModulusTwoNumbers(int a,int b) {
					int mod=a%b;
					return mod;
				}
				//Modulus func End
				
				
	public static void main(String[] args) {
		//Addition call Start
		int a =10;
		int b=7000;
		int sum=AddNumbers(a,b);
		System.out.println("Sum of "+a+" "+"and"+" "+b+" "+" "+"Is"+" "+sum);
		//Addition call End
		
		//Division func call Start
		a =7000;
		b=10;
		int divres=DivideTwoNumbers(a,b);
		System.out.println("Division of "+a+" "+"and"+" "+b+" "+" "+"Is"+" "+divres);
		//Division func call end
		//Multiplication
		int mul=MultiplicationTwoNumbers(a,b);
		System.out.println("Modulus of "+a+" "+"and"+" "+b+" "+" "+"Is"+" "+mul);
		
		      //Modulus
				int mod=ModulusTwoNumbers(a,b);
				System.out.println("Modulus of "+a+" "+"and"+" "+b+" "+" "+"Is"+" "+mod);
				
				//Modulus
				int sub=SubtractTwoNumbers(a,b);
				System.out.println("Subtraction of "+a+" "+"and"+" "+b+" "+" "+"Is"+" "+sub);
		
	}

}
