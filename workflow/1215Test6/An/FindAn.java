
//7.找出一个二维数组的鞍点，即该位置上的元素在所在的行上最大，在所在的列
//上最小(也可能没有鞍点).

public class FindAn
{
	public static void main(String[] args)
	{
		int[][] arr = new int[][]{{23,45,77},{12,34,87},{51,42,120}};

		for(int i = 0; i < arr.length; i++)
		{
			int max = 0;

			for(int j = 1; j < arr[i].length; j++)
			{
				if(arr[i][j]>arr[i][max])
				max = j;
			}

			//arr[i][max] ==> 此处这个数为第i个数组的最大数
			boolean x = true;
			for(int k = 0; k < arr[i].length; k++)
			{
				if(arr[i][max] > arr[k][max])//一旦这个数大于了该列的任何一个数，则不是
				x = false;
			}
			if(x)
			System.out.println("value is: " + arr[i][max] + " row: " + i + " col:" + max);

		}
	}
}

