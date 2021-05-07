class pattern11
{
public static void main(String args[])
{
int i,j;
int a,b;
int no=3;
a=no;
b=no;
for(i=no;i>=1;i--)
	{
	 for(j=1;j<=(no*2)-1;j++)
		{
		
		if(j>=a&&j<=b)		
		{
		
		System.out.print("*");
		}
		else
		System.out.print(" ");
		
		}
	a--;
	b++;	
	System.out.println();
	}







}
}
