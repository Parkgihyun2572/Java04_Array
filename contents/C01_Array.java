/*
# 배열(Array)
같은 자료형의 여러개 데이터를 묶어서 저장하는 공간
index번호로 0번이 첫번째이며 순서를 가진다


# 배열 선언 방법
1. 데이터 목록으로 배열 생성하기
	자료형[] 변수명 = {데이터1, 데이터2, 데이터3..};
  
*/
package contents;

public class C01_Array {
	public static void main(String[] args) {
		/* 배열 생성하기1 */
		System.out.println("=====배열 생성하기1=====");
		//정수 데이터 10, 20, 30 3개를 저장하기
		int a = 10, b = 20, c = 30;
		
		//배열 선언과 동시에 초기화
		int[] arr = {10, 20, 30};
//		System.out.println(arr);
		System.out.println("첫번째 값: " + arr[0]); //0번: 첫번째
		System.out.println("두번째 값: " + arr[1]); //1번: 두번째
		System.out.println("세번째 값: " + arr[2]); //2번: 세번째
		
		//배열의 길이(크기, 개수) 구하기 => 배열명.length
		System.out.println("배열의 길이: " + arr.length);
		
		//반복문으로 배열 전체 데이터 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"] = ");
			System.out.println(arr[i]);
		}
		
		//배열 데이터 변경하기
		arr[0] = 200;
		System.out.println("arr[0] = " + arr[0]);
		arr[1] = arr[0] + 50;
		System.out.println("arr[1] = " + arr[1]);
		arr[2] = arr[0] + arr[1];
		System.out.println("arr[2] = " + arr[2]);
	}
}
