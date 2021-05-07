class pattern9
{
	public static void main(String args[])
	{
		int i,j,c;
		int no=5;
		int a=no;
		int b=no;
		for(i=1;i<=5;i++)
		{
			c=1;
			for(j=1;j<=(no*2-1);j++)
				
			{
				if(j>=a&&j<=b)
				{
					System.out.print((char) (64+c)+" ");
					c++;
					j++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			a--;
			b++;
		}
	}
	
	
	
	
}
