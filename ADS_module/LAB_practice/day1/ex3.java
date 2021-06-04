//Calculate a factorial in Java with recursion
import java.util.*;
class ex3{
	static int  res=1;
	static int fact(int n){
		if(n<=1){
			return 1;
		}
		else{
			res=n*fact(n-1);
			return res;
		}

	}


	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		System.out.println("factorial of "+x+" is : "+fact(x));
	}
}