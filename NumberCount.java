import java.util.Scanner;
class NumberCount
//숙제로 나왔던 1~1000까지 숫자중 1,2,3,4,5,6,7,8,9,0이 몇개나 들어있는지 찾는 수식 풀이
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("양의 정수 입력 = ");
		int max = scan.nextInt();

		int cnt[] = new int[10];//각 숫자를 카운트할 배열
		for(int i=1; i<=max; i++){//1,2,3,....1000
			//1의 자리는 10으로 나눈 나머지값 구하면 나온다. %10
			//10의 자리는 먼저 10으로 나누고, 10으로 나눈 나머지 값 구한다. /10%10

			cnt[i%10]++; //단자리 1을 나누고남은값 1->1번배열에 +1을 해준다.
						 //1~9까지의 숫자

			if(i>=10){//10의 자리
				cnt[i/10%10]++;
			}
			if(i>=100) cnt[i/100%10]++; //100의 자리
			if(i>=1000) cnt[i/1000%10]++; //1000의 자리
				
			
		}//for

		for(int idx=0; idx<cnt.length; idx++){ //출력
			System.out.println(idx+"->"+cnt[idx]);
		}//for
	}
}
