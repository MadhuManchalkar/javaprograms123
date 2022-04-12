package array123;

public class Two_dimensional_array {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{1,23,4}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
