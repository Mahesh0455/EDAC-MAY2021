class pattern8
{
public static void main(String args[ ])
{
int i,j,no;
no=5;
int a=no;
int b= no;
int c=5;

for(i=no;i>=1;i--)
	{
			

	for(j=1;j<=no*2-1;j++)
		{
			if(j>=a && j<=b)
			{
				System.out.print(c+" ");
				c++;
				j++;
				
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	a--;
	b++;
	c=i-1;
	}




}








}