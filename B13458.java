package algorithm;

import java.util.Scanner;

public class B13458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //������ ��
		int[] a = new int[n];//������ ��
		
		long cnt = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();//�Ѱ�����
		int c = sc.nextInt();//�ΰ�����
		
		for (int i = 0; i < n; i++) {
			a[i]-=b;//�Ѱ������� ������ 1���̾���Ѵ�.
			cnt++;
			if(a[i] <= 0) {
				continue;
			}
			else {
				cnt += a[i] / c;
				if(a[i] % c > 0) //������ �ΰ��������� ä���
					cnt++;
			}
			}
		System.out.println(cnt);
		}				


	}

