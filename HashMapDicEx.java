//7-5
import java.util.*;

public class HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner scanner = new Scanner(System.in);
        while(true) {//exit 입력시 종료. 영단어를 받아서 한단어 검색
            System.out.print("찾고 싶은 단어는>");
            String eng = scanner.next();
            if(eng.equals("eixt")){
                System.out.println("종료합니다.");
                break;
            }

            //검색
            String kor = dic.get(eng);
            if(kor == null)
                System.out.println(eng + "는 없는 단어입니다.");
            else
                System.out.println(kor);
        }
        scanner.close();
    }
}
