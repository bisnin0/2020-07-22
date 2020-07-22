class ArraySelectionSort
//선택정렬 과제 풀이
{
	public static void main(String[] args) 
	{
		int ran[] = new int[10];
		//난수 생성
		System.out.println("=========정렬전=========");
		for(int i=0; i<ran.length; i++){
			ran[i] = (int)(Math.random()*(100-1+1))+1;
			System.out.print(ran[i]+"\t");
		}//for
		//				10-1
		for(int i=0; i<ran.length-1; i++){//0,1,2,....8
			//   i가 5면 6부터 출발.. 배열의 길이보다 작을때까지(0부터~)
			for(int j=i+1; j<ran.length; j++){
				if(ran[i] < ran[j]){
					int temp = ran[j];
					ran[j] = ran[i];
					ran[i] = temp;
				}
			}
		}//for
		
		System.out.println("\n========정렬후========");
		for(int i=0; i<ran.length; i++){
			System.out.print(ran[i]+"\
			t");
		}
	}
}
