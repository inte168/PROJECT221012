//7-3
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next(); //이름 입력
            a.add(s); //컬렉션에 삽입
        }

        for(int i =0;i<a.size(); i++) {//들어있는 이름 출력
            //ArrayList의 i 번째 문자열 얻어오기
            String name = a.get(i);
            System.out.print(name + " ");
        }
        //가장 긴 이름.
        int longestIndex = 0; 
        for(int i=0;i<a.size(); i++) {
            if(a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
        scanner.close();
    }
    
}
