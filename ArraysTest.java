import java.util.Arrays;
class ArraysTest 
{
	public static void main(String[] args) 
	{
		//Arrays : 배열관련 클래스
		//					2			6
		int data[] = {90,49,20,40,50,20,40,91,5};

//		Arrays.sort(data); //배열의 값을 정렬한다.

		Arrays.sort(data, 2, 6);//index기준으로 정렬범위를 지정한다. 6앞까지. 40은 포함 안됨
								//2부터 6앞 index까지 정렬

		System.out.println(Arrays.toString(data));
	                         //toString은 배열의 값을 문자열로 만든다.

		
		//배열의 복사
		int dataCopy[] = Arrays.copyOfRange(data, 2, 6);
		System.out.println(Arrays.toString(dataCopy));

		String name[] = {"홍길동","이순신","세종대왕","강감찬","김삿갓"};
		Arrays.sort(name);
		String nameStr = Arrays.toString(name);
		System.out.println(nameStr);

		int data2[] = {90,49,20,40,50,20,40,91,5};
		int data3[] = data;
		boolean boo = Arrays.equals(data, data2);//두 데이터 비교
		boolean boo2 = Arrays.equals(data, data3); // 객체의 주소를 비교하여 같은지 확인해준다.
		System.out.println(boo);
		System.out.println(boo2);
		//data의 주소가 다르기때문에 배열 내의 숫자가 같더라도 false가 나온다.
		//data를 다른 data에 넣어주면 주소도 같이 복사가 되기 때문에 비교해보면 true가 나온다.

		
	}
}
