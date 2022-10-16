//실습 4번
package problem;

import java.util.*;

public class RainVector{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Integer> stack = new Vector<Integer>();
        while(true) {
            System.out.print("강수량 입력(0 입력시 종료)>>");
            int n = scanner.nextInt();

            if(n==0) break;
            stack.add(n);
            int sum=0;
            int avg=0;

            for(int i =0; i<stack.size(); i++) {//지금까지의 입력을 출력
                System.out.print(stack.get(i)+" ");
                sum += stack.get(i);
            }
            System.out.println();

            avg = sum/stack.size();//평균 계산 및 출력
            System.out.println("현재 평균 "+avg);
        }
        scanner.close();
    }
}