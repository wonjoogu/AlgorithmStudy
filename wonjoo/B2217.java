package wonjoo;

import java.util.Arrays;
import java.util.Scanner;
//����
public class B2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] n = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
		}
		
		Arrays.sort(n);//�迭 �������� ����
		int max = 0;

		for (int i = N - 1; i >= 0; i--) {//�迭���� ���� ū ������ ����
				n[i] *= N-i;// �迭 ù��° ������ 10�� 2�� ����
				max = Math.max(max, n[i]);//0�� 20�� �ִ밪 ����
			}
		System.out.println(max);//�ִ밪 ���
	}
}


