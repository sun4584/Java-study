package section05;

public class EX05_02 {
	public static void main(String[] args) {
		int sum = 0; // 변수를 저장할 변수
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("합: " + sum);
	}

}
