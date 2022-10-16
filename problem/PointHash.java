//�ǽ� 8��
package problem;
import java.util.*;

public class PointHash {
    
    static HashMap<String, Integer> manage = new HashMap<String, Integer>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

        while(true) {
            System.out.print("�̸��� ����Ʈ �Է�>> ");
            
            String name = scanner.next();
            if(name.equals("�׸�")) break; //�׸��� �ԷµǸ� �ߴ�
            int point = scanner.nextInt();
            
            Integer n = manage.get(name); //�̸����� �˻�
            if(n !=null) point +=n;

            manage.put(name, point); //�̸��̶� ����Ʈ ����
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
