//Print a series of numbers with recursive Java methods

class ex1{
	static void numberSeries(int i){

		if(i<=20){
		System.out.println(i);
		numberSeries(++i);	
		}
	}

	public static void main(String args[]){
		numberSeries(1);

	}

}