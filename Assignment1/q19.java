import java.util.*;
class q19
{
public static void main(String args[])
{
int i=1;;
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
System.out.println("Given number is"+no);
long binaryno=0;
int remainder=0;
while(no!=0)
	{

	remainder=no%2;
	no/=2;

	binaryno=binary+remainder*i;
		i*=10;
	}
System.out.println("Binary no is :"+binaryno);









}








}
