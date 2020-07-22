class ArrayEx3_2
{
	public static void main(String[] args) 
	{
		int arr[][] = new int[10][10];

		for(int r=0; r<arr.length; r++){
			for(int c=0; c<arr[r].length; c++){
				if(r==c || r+c==arr.length-1){arr[r][c] += 100;};/*행열의 크기가 달라져도 작동할 수 있게 길이로*/
//				if(r+c==9){arr[r][c] += 100;}; //0~9다. 9열이다.
			}
		}




		for(int r=0; r<arr.length; r++){
			for(int c=0; c<arr[r].length; c++){
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
		


	}
}
