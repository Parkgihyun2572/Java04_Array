package contents;

public class C01_Array2 {
	public static void main(String[] args) {
		/* 실수 타입 배열 생성하기 */
		double[] grade = {4.3, 3.7, 2.5, 3.3, 4.2, 4.0, 3.2};
		
		//학점이 3.5 이상인 학생 수 찾기
		int count=0;
		for (int i = 0; i < grade.length; i++) {
			if(grade[i] >= 3.5) {
				count++;
			}
		}
		System.out.println("학점이 3.5 이상인 학생 수: "+count);
		
		/* 문자 타입 배열 생성하기 */
		char[] ch = new char[5];
		ch[0] = 'H';
		ch[1] = 'a';
		ch[2] = 'p';
		ch[3] = 'p';
		ch[4] = 'y';
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		/* 문자열 배열 생성하기 */
		String[] names = {"문동은", "박연진", "전재준", "존박", "하니",
				"딘", "샘해밍턴", "개코", "윤하", "침착맨", "주호민"};
		System.out.println(names[names.length-1]);
		
		//이름이 두글자인 인원 확인하기
		int cnt = 0;
		for (int i = 0; i < names.length; i++) {
			//문자열 길이 구하기: 문자열.length()
			if(names[i].length() == 2) {
				cnt++;
			}
		}
		System.out.println("이름 두글자인 사람은 "+cnt+"명입니다.");
		
		/* 문자와 문자열의 관계 */
		String season = "spring";
		
		//문자열에서 index값으로 문자를 읽어올 수 있다.
		System.out.println(season.charAt(1));
		for(int i=0;i<season.length();i++) {
			System.out.print(season.charAt(i));
		}
		System.out.println();
		
		//문자 배열 <- 문자열 변환하여 저장
		char[] abc = season.toCharArray(); 
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		//문자열 <- 문자 배열
		String msg = new String(ch);
		System.out.println(msg);
		System.out.println("타입확인: "+ msg.getClass().getName());
	}
}
