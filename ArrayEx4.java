import java.util.Scanner;
class ArrayEx4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 = ");
		int stu = scan.nextInt();
		String arr[] = new String[stu+2];
		int arr2[][];
		arr2 = new int[stu+2][6];	
		int arr3[] = new int[stu];

		for(int i=0; i<stu; i++){
			System.out.print("이름 = ");
			String name = scan.next();
			arr[i] = name;
			System.out.print("국어 = ");
			int lang = scan.nextInt();
			System.out.print("영어 = ");
			int eng = scan.nextInt();
			System.out.print("수학 = ");
			int math = scan.nextInt();
				for(int j=0; j<arr3.length; j++){
				arr2[i][0] = lang;
				arr2[i][1] = eng;
				arr2[i][2] = math;
				arr2[i][3] = lang+eng+math;
				arr2[i][4] = (lang+eng+math)/3;

				}
				arr3[i] = arr2[i][4];		
		}

		int sum = 0;	//아래쪽 합계 평균
		for(int i=0; i<6; i++){ //열
			sum =0;
			for(int j=0; j<stu+1; j++){ 
				sum += arr2[j][i];
			} //행
			arr2[stu][i] = sum;
			arr2[stu+1][i] = sum/3;
		}
		int rank; //석차 구하는중
		for(int q=0; q<arr3.length; q++){
			rank = 1;
			for(int w=0; w<arr3.length; w++){

				if(arr3[q] < arr3[w]){
					rank+=1;
				}				
				arr2[q][5] = rank;
			}
			
		}
//		2차원 배열 석차별 정렬 포기
	
		arr[stu] = "총점";
		arr[stu+1] = "평균";

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차"); //출력시작

		for(int i=0; i<arr2.length; i++){//출력?
			for(int j=0; j<arr2[i].length; j++){
				if(j==0) System.out.print(arr[i]+"\t");
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}

	}
}

/*
학생수를 입력받고 3과목 점수를 입력받은 후 개인별 총점, 평균, 석차를 구하고
각 과목별 총점과, 평균을 구하라.
단, 석차순으로 출력(가능하다면)

실행
학생수 = 3
이름 = 
국어 = 
영어 = 
수학 = 
이름 = 
국어 =
:
:

*/