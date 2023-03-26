package practices;

public class Prac05 {
	public static void main(String[] args) {
//		주어진 2차원 배열
//		10	20	30	
//		40	50	60	
//		70	80	90
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = k*10;
				k++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		// Q1) 전체 합 출력하기
		// 결과) 450	
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		
		// Q2) 4의 배수만 출력하기
		// 결과) 20 40 60 80
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr[i][j]%4 == 0) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		// Q3) 15의 배수의 합, 15의 배수의 개수 출력하기
		// 결과) 180, 3
		int sum2 = 0;
		int counter = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr[i][j]%15 == 0) {
					sum2 += arr[i][j];
					counter++;
				}
			}
		}
		System.out.println(sum2 + "\t" + counter);
	}
}
