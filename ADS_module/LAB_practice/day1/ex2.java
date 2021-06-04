//Sum a series of numbers with Java recursion
class ex2{
	static int sum =0;
	static int add(int i){
		if(i<=10){
		sum+=i;
		add(++i);
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println(add(1));
		
	}

}