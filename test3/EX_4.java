import java.util.*;
class EX_4{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		//inputMismatchException();
	
		//ArithmeticException();
		ArrayIndexOutOfBound();
		
		
		
	}

	private static void ArrayIndexOutOfBound() {
		Scanner sc=new Scanner (System.in);
		try {
		int arr[]= {10,20,30,40};
		System.out.println("enter array index");
		int n=sc.nextInt();
		System.out.println(arr[n]);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("plz Enter array index within range of 0 to 3 ");
		}
	}

	private static void ArithmeticException() {
		Scanner sc=new Scanner (System.in);
		try {
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a/b;
		System.out.println(res);
		}catch(ArithmeticException ae) {
			System.out.println("cannot divide by zero, enter non zero value in denominator");
		}
		
	}

	private static void inputMismatchException() {
		Scanner sc=new Scanner (System.in);
		try
		{
			System.out.println("Enter integer no");
			int a=sc.nextInt();
			System.out.println(a);
		}catch(InputMismatchException ime) {
			System.out.println("plz enter integr value only");
		}
		
		
	}
}