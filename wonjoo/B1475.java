package wonjoo;

import java.util.Scanner;
//�� ��ȣ
public class B1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int[] N = new int[10];//0~9 ���� ī�� ����
		int tmp;

		for(int i = 0; i < n.length(); i++) {
			tmp = n.charAt(i) - '0';//���������� ��ȯ
			N[tmp]++;//�迭�� ������ ����
		}
		
		int max = 0;
		
		if((N[6] + N[9]) % 2 == 1) {//������� 99999 �ټ��ڸ��̸� 6,9�� ������ ������ �ϳ��� ���´�.
			max = (N[6] + N[9]) % 2 + 1;
		}else {//¦�� �����̸� 2�� ����
			max = (N[6] + N[9]) / 2;
		}
		
		N[6] = 0;
		N[9] = 0;
		
		for (int p:N) {//�ִ밪 �̱� 
			max = Math.max(max, p);
		}
		System.out.println(max);
	}
}