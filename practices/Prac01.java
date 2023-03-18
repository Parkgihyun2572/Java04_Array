/*
연습문제 Q1, Q2
*/
package practices;

public class Prac01 {
	public static void main(String[] args) {
//		Q1) 10부터 50까지 arr 배열에 저장하고 출력하기
//		결과) 10 20 30 40 50
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10*(i+1);
		}
		for(int a: arr) {
			System.out.println(a);
		}
		
//		Q2) 전체 합 출력하기
//		결과) 150
		int sum = 0;
		for(int a : arr) {
			sum+=a;
		}
		System.out.println("전체 합은 "+sum);
		
//		Q3) 4의 배수만 출력하기
//		결과) 20 40
		for(int a: arr) {
			if(a%4==0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		
//		Q4) 4의 배수의 합과 개수 출력하기
//		결과) 60, 2
		int sum2 = 0;
		int count = 0;
		for(int a : arr) {
			if(a%4==0) {
				count++;
				sum2+=a;
			}
		}
		System.out.println(sum2+ ", " + count);
	}
}
