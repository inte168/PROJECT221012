//실습 8번
package problem;
import java.util.*;

public class PointHash {
    
    static HashMap<String, Integer> manage = new HashMap<String, Integer>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** 포인트 관리 프로그램입니다 **");

        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            
            String name = scanner.next();
            if(name.equals("그만")) break; //그만이 입력되면 중단
            int point = scanner.nextInt();
            
            Integer n = manage.get(name); //이름으로 검색
            if(n !=null) point +=n;

            manage.put(name, point); //이름이랑 포인트 갱신
            printer();
        }
        scanner.close();
    }

    static void printer() {
        Set<String> keys = manage.keySet();
        Iterator<String> it = keys.iterator();
        
        while(it.hasNext()) {
            String name = it.next();
            int point = manage.get(name);
            System.out.print("(" + name + ", " + point + ")");
        }
        System.out.println();
    }
}
