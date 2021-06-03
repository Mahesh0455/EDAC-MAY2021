import java.util.*;
class ArrayDemo{
	Scanner sc=new Scanner(System.in);
	int addition(int arr []) {
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		return sum;	
	}
	void searchElements(int arr[]) {
		System.out.println("enter no to be searched in array");
		int no=sc.nextInt();
		for(int a:arr) {
			if(no==a) {
				System.out.println("Given value is present in array");
				return;
			}
			
		}System.out.println("Given value is not present");
	}
	
	void riverseArray(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}
}
public class test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element of array");
			arr[i]=sc.nextInt();
		}
		ArrayDemo e=new ArrayDemo();
		boolean input=false;
		do {
			System.out.println("Press 1:To perform Addition");
			System.out.println("Press 2:To Search value");
			System.out.println("press 3:to Reverse array");
			System.out.println("press 4:To exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:int res=e.addition(arr);
			System.out.println("Addition of array is:"+res);
			System.out.println("------------------------");
			break;
			case 2:e.searchElements(arr);
			System.out.println("----------------------");
			break;
			case 3:e.riverseArray(arr);
			System.out.println("----------------------");
			break;
			case 4:
				System.exit(0);
				
			}
			
		}while(true);

	}

}
