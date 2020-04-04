import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] array = new int[101];
		int[] array1 = new int[101];
		for(int k=0;k<test;k++)
		{
			int n,row=0,col=0;
			n = sc.nextInt();
			int[][] array2 = new int[n][n];                                                                                   
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<101;j++)
				{
					array[j]=0;
				}
				for (int j=0;j<n;j++)
				{
					int x = sc.nextInt();
					array2[i][j]=x;                                                                                         
					array[x]++;
				}
				for (int j=0;j<101;j++)
				{
					if(array[j]>1)                                                                             
					{
						row++;
						break;
					}
				}
			}
			for (int i=0;i<n;i++)                                                                       
			{
				for (int j=0;j<101;j++)
				{
					array1[j]=0;
				}
				for (int j=0;j<n;j++)                                                                     
				{                                           
					array1[array2[j][i]]++;
				}
				for (int j=0;j<101;j++)                                                                 
				{
					if(array1[j]>1)
					{
						col++;
						break;
					}
				}
			}
			int temp =0;
			for (int i=0;i<n;i++)                                                            
			{
				temp+=array2[i][i];
			}
			System.out.println("Case #"+(k+1)+": "+temp+" "+row+" "+col);
		}
	}
}