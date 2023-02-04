//7.找出一个二维数组的鞍点，即该位置上的元素在所在的行上最大，在所在的列上最小(也可能没有鞍点).
public class FindAn_l
{
	public static void main(String[] args)
	{
		int[][] arr = new int[][]{{6,2,18},{43,66,96},{13,45,130}};

		for(int i = 0; i < arr.length; i++)
		{
			int max = 0;

			for(int j = 1; j < arr[i].length; j++)
			{
				if(arr[i][j]>arr[i][max])
				max = j;
			}

			int a = i;
			for(int k = 0; k < arr[i].length; k++)
			{
				if(arr[a][max] > arr[k][max])
				a = k;
			}
			if(a-i==0)
			System.out.println("value is: " + arr[i][max] + " row: " + i + " col:" + max);

		}
	}
}

