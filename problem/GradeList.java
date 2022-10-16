//실습 2번

package problem;

import java.util.*;

public class GradeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> grade = new ArrayList<>();
        System.out.print("학점 6개 빈칸으로 분리하여 입력(A/B/C/D/F)>>");

        for(int i=0;i<6;i++) {//6번 반복하며 입력받음.
            char c = scanner.next().charAt(0);
            grade.add(c);
        }

        int sum = 0;
        for(int i =0;i<grade.size(); i++) {
            char c=grade.get(i);
            switch(c){//학점 switch문으로 더함.
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
