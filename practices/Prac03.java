/*
Q)  반복문을 사용하여 다음 배열 값들 중에서 
	최대값과 최소값을 찾고 평균값을 구하시오.
    [20, 55, 10, 3, 85, 36, 70, 64]

    ↓ Conslole ↓  
    최대값: 85
    최소값: 3
    평균값: 42.875

*/
package practices;

public class Prac03 {
	public static void main(String[] args) {
		int[] array = { 20, 55, 10, 3, 85, 36, 70, 64 };

		int max = array[0];
		int min = array[0];
		int sum = 0;
		
		for (int i : array) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
			sum += i;
		}
		double avg = (double) sum / array.length;
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		System.out.println("평균값: " + avg);
	}
}
