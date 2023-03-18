/*
Q)  먼저 생성할 정수형 배열의 개수를 사용자로부터 입력 받고,
	해당하는 배열의 개수만큼 정수를 모두 입력받아 평균값을 계산하여 
	아래 화면처럼 결과가 나오도록 출력해보자.

	↓ Console1 ↓
	생성할 배열의 개수: 2
	정수를 입력하시오: 10
	정수를 입력하시오: 20
	평균은 15.0입니다.

    ↓ Console2 ↓
	생성할 배열의 개수: 5
	정수를 입력하시오: 10
	정수를 입력하시오: 20
	정수를 입력하시오: 25
	정수를 입력하시오: 30
	정수를 입력하시오: 35
	평균은 24.0입니다.
*/
package practices;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성할 배열의 개수: ");
		int length_array = sc.nextInt();
		int[] array = new int[length_array];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("정수를 입력하시오: ");
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i:array) {
			sum+=i;
		}
		double avg = sum/length_array;
		System.out.println("평균은 " + avg + "입니다.");
	}
}
