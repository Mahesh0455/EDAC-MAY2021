//4.Print the Fibonacci series with Java and recursion
class ex4{
		static int n1=0,n2=1,n3=1,i=1;
		static void display(){
			if(i<=10){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
			i++;
			display();

			}

		}

	public static void main(String[] args) {
		System.out.print("Fibonacci series: "+n1+","+n2);
		display();
		System.out.println();
		
	}
}