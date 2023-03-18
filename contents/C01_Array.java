/*
# 배열(Array)
같은 자료형의 여러개 데이터를 묶어서 저장하는 공간
index번호로 0번이 첫번째이며 순서를 가진다


# 배열 선언 방법
1. 데이터 목록으로 배열 생성하기
	자료형[] 변수명 = {데이터1, 데이터2, 데이터3..};

2. new 키워드로 배열 생성하기
1) 배열 변수 선언
	자료형[] 변수명;
	자료형 변수명[];

2) 배열의 객체 생성
	변수명 = new 자료형[크기];

3) 배열값 초기화
  
# 배열 데이터 변경하기
	배열명[index] = 데이터;
	
# 배열의 길이(크기, 개수)
	배열명.length
*/
package contents;

import java.util.Scanner;

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

		//배열 선언을 해놓고, 나중에 데이터 목록을 넣을 경우
		int[] arr2;
		arr2 = new int[] {10, 20, 30};
		
		/* 배열 선언하기2 */
		System.out.println("=====배열 생성하기2=====");
		int[] ref = new int[3]; //배열 선언
		ref[0] = 10;
		ref[1] = 20;
		ref[2] = 30;
		
		//모든 배열값에 15를 더하고 값 출력하기
		for (int i = 0; i < ref.length; i++) {
			ref[i] += 15;
		}
		
		for (int i = 0; i < ref.length; i++) {
			System.out.println("ref["+i+"] = "+ ref[i]);
		}
		
		/* 배열 입력받기 */
		System.out.println("=====배열 입력받기=====");
		Scanner sc = new Scanner(System.in);
		int[] glory = new int[4];
		for (int i = 0; i < glory.length; i++) {
			System.out.print((i+1)+"번째 배열 입력: ");
			glory[i] = sc.nextInt();
		}
			
		System.out.print("입력받은 배열: ");
		for (int i = 0; i < glory.length; i++) {
			System.out.print(glory[i] + " ");
		}

	}
}
