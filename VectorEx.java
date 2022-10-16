//7-1
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector <Integer>();

        v.add(5); //삽입
        v.add(4);
        v.add(-1);

        v.add(2, 100); //중간에 삽입- 2번째 자리에 100 추가

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량: " + v.capacity());

        //모든 요소 출력
        for(int i=0;i<v.size();i++) {
            int n = v.get(i);
            System.out.println(n);
        }
        //모든 정수의 합
        int sum = 0;
        for(int i =0;i<v.size();i++) {
            int n = v.elementAt(i);
            sum +=n;
        }
        System.out.println("벡터에 있는 정수 합:" + sum);
    }
}
