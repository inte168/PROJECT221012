//�ǽ� 4��
package problem;

import java.util.*;

public class RainVector{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Integer> stack = new Vector<Integer>();
        while(true) {
            System.out.print("������ �Է�(0 �Է½� ����)>>");
            int n = scanner.nextInt();

            if(n==0) break;
            stack.add(n);
            int sum=0;
            int avg=0;

            for(int i =0; i<stack.size(); i++) {//���ݱ����� �Է��� ���
                System.out.print(stack.get(i)+" ");
                sum += stack.get(i);
            }
            System.out.println();

            avg = sum/stack.size();//��� ��� �� ���
            System.out.println("���� ��� "+avg);
        }
        scanner.close();
    }
}