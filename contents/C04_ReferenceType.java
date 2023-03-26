/*
# 기본 타입(Primitive Type)
	int, double, char, boolean..
기본 타입은 변수에 데이터(값)를 직접 저장하는 타입이다.

# 참조 타입(Reference Type)
	int[], char[], String, class, interface..
참조 타입은 객체의 주소를 참조하는 타입이다.
참조 타입은 변수에 데이터를 직접 저장하지 않고,
실제 데이터를 저장하고 있는 다른 공간의 객체를 참조한다. 

배열: 같은 자료형의 여러개 데이터를 묶어서 저장하는 참조 자료형

*/
package contents;

import java.util.Arrays;

public class C04_ReferenceType {
	public static void main(String[] args) {
		/* 기본 자료형 */
		int a = 10;
		int b = 10;
		System.out.println(a==b);//기본 타입 변수 간의 값 비교
	
		/* 참조 자료형 */
		int[] arr = { 10, 20, 30 };
		int[] brr = { 10, 20, 30 };
		System.out.println(arr==brr);//참조 타입 변수 간의 주소값 비교
		System.out.println(arr[0]==brr[0]);//배열 데이터 값 비교
		System.out.println("arr: " + arr);
		System.out.println("brr: " + brr);
		System.out.println(Arrays.toString(arr));//배열 데이터 확인
		System.out.println(Arrays.toString(brr));

		String str1 = new String("spring");
		String str2 = new String("spring");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println(str1==str2);//참조 타입 변수 간의 주소값 비교
		System.out.println(str1.equals(str2));//문자열 데이터 비교
		
		/* 배열의 초기값 */
		//참조 타입 변수는 해당 데이터 타입의 디폴트값이 저장되어 있다.
		//참조 타입의 디폴트값(기본값)은 null이다.
		int num;
		int[] arrInt = new int[3];
		double[] arrDoub = new double[3];
		char[] arrChar = new char[3];
		boolean[] arrBool = new boolean[3];
		String[] arrStr = new String[3];
		
//		System.out.println(num); 에러: 기본타입 변수는 초기값이 없다.
		System.out.println(Arrays.toString(arrInt));
		System.out.println(Arrays.toString(arrDoub));
		System.out.println(Arrays.toString(arrChar));
		System.out.println(Arrays.toString(arrBool));
		System.out.println(Arrays.toString(arrStr));
		
		/* 기본 타입은 null을 저장할 수 없다. */
//		int num2 = null;
		int[] arrNum = null;
		System.out.println(arrNum);
		String msg = null;
		System.out.println(msg);
	}
}
