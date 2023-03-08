
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {202, 77, 10, 39, 129, 22}; // 배열 a 생성 및 값 넣기
		
		int i, j, k;
		
		System.out.println("데이터표시");
		for (i = 0; i < 6; i++) {
			System.out.print(a[i] + ", ");
		}
		i=i++;
		System.out.println(a[i]);
		
		System.out.println("작은 순서대로 정렬");
		for (j = 0; j < 6; j++) {
			for (i = j+1; 7; i++) {
				if (a[j] > a[i]) {
					k = a[j];
					a[j] = a[i];
					a[i] = k;
				}
			}
		}
		for (i = 0; i < l-1; i++) {
			System.out.print(a[i] + ", ");
		}
		i=i++;
		System.out.println(a[i]);
		
		
		
	}

}
