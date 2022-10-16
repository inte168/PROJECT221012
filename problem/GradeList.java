//�ǽ� 2��

package problem;

import java.util.*;

public class GradeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> grade = new ArrayList<>();
        System.out.print("���� 6�� ��ĭ���� �и��Ͽ� �Է�(A/B/C/D/F)>>");

        for(int i=0;i<6;i++) {//6�� �ݺ��ϸ� �Է¹���.
            char c = scanner.next().charAt(0);
            grade.add(c);
        }

        int sum = 0;
        for(int i =0;i<grade.size(); i++) {
            char c=grade.get(i);
            switch(c){//���� switch������ ����.
                case 'A':
                    sum+=4;
                    break;

                case 'B':
                    sum+=3;
                    break;
                
                case 'C':
                    sum+=2;
                    break;

                case 'D':
                    sum+=2;
                    break;

                case 'F':
                    sum+=0;
                    break;
            }
        }
        double avg = (double)sum/grade.size();
        System.out.println(avg);
        scanner.close();
    }
}
