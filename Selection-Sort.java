
import java.util.*;
public class Selection {
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	int num= s.nextInt();
	int min=Integer.MIN_VALUE;
	int arr[] = new int[num];
	for(int i=0;i<num;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<num;i++)
	{
		min=i;
		for(int j=i+1;j<num;j++)
		{
			if(arr[j]<arr[min])
			{
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
}
}
