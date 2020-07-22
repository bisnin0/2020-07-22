import java.util.Scanner;
class Lotto

// 로또번호를 출력하는데 중복되는값은 다른수는 제외하고 변경. 내가 풀어본것. 중복검사 불확실
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);


		int lotto[] = new int[7];
		for(int r=1; r<2; r++){
			System.out.print("게임수=");
			int game = scan.nextInt();
			for(int i=1; i<=game; i++){
				for(int j=0; j<lotto.length; j++){
					lotto[j] = (int)(Math.random()*(45-1+1))+1;
					
				}
				//중복검사
				for(int k=0; k<lotto.length-1; k++){
					for(int a=k+1; a<lotto.length; a++){
						if(lotto[a] == lotto[k]){
							lotto[a] = (int)(Math.random()*(45-1+1))+1;
						}
					}	
					
				} //중복검사종료 <==중복 발생함
				//정렬
				for(int k=0; k<lotto.length-2; k++){
					for(int a=k+1; a<lotto.length; a++){
						if(lotto[k] > lotto[a]){
							int temp = lotto[a];
							lotto[a] = lotto[k];
							lotto[k] = temp;	
						}
					}			
				}//정렬종료
				
				System.out.println(i+"게임=["+lotto[0]+", "+lotto[1]+", "+lotto[2]+", "+lotto[3]+", "+lotto[4]+", "+lotto[5]+"], bonus="+lotto[6]);

					
			} //for
			System.out.print("계속하시겠습니까?(1:예, 2:아니오)");
			int restart = scan.nextInt();
			if(restart==1){
				r=0;			
			}else{
				break;
			}
			System.out.println();
		}//for


	}
	}

// 45번 번호 안에서 난수로  7개(보너스 포함)
// 오름차순 정렬
// 같은번호 나오면 먼저 생성된거 놔두고 나중에 생성된거 버려야함(중복검사)