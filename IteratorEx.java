//7-4
import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector <Integer>();

        v.add(5); //삽입
        v.add(4);
        v.add(-1);
        v.add(2, 100); //중간에 삽입- 2번째 자리에 100 추가

        //모든 요소 출력-Iterator 이용
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
        //모든 정수의 합-Iterator 이용
        int sum = 0;
        it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            sum +=n;
        }
        System.out.println("벡터에 있는 정수 합:" + sum);
    }    
}
