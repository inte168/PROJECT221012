//7-6
import java.util.*;

public class HashMapScoreEx {
    public static void main(String[] args){
        HashMap <String, Integer> javaScore = new HashMap <String, Integer>();

        //강의자료에는 javaScore가 아닌 scoremap이라 되어있고, 교재는 전부 scoremap으로 통일되어있지만
        //일단 이쪽을 javaScore로 통일함.
        javaScore.put("김성동", 97);
        javaScore.put("황기태", 88);
        javaScore.put("김남윤", 98);
        javaScore.put("이재문", 70);
        javaScore.put("한원선", 99);

        System.out.println("HashMap의 요소 개수 :" + javaScore.size());

        Set<String> keys = javaScore.keySet();

        Iterator<String> it = keys.iterator();

        while(it.hasNext()) {
            String name = it.next();
            int score = javaScore.get(name);
            System.out.println(name + " : " + score);
        }
    }
}
