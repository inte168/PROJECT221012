//실습 12번
package problem;

import java.util.*;

class Word {//Word 클래스.
    private String eng;
    private String kor;
    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }
    public String getEng() {return eng;}
    public String getKor() {return kor;}
}

class Ex {
	int ex[] = {-1, -1, -1, -1}; // 4개의 보기 배열을 -1로 초기화 해 둠.
	
	public Ex(int num, int size) {
		int answerNum = (int)(Math.random()*4); // 정답의 번호 랜덤 생성
		ex[answerNum] = num; // 보기중 정답 번호에 정답을 넣음.
		for(int i=0; i<4; i++) {
            //크기 전체에서 랜덤으로 돌려서 -1인(정답이 아닌) 보기에 넣는다.
			int n = (int)(Math.random()*size); 
			if(ex[i]==-1) ex[i] = n;
			
            //만약 이전에 나왔거나, 정답과 같은 경우는 다시.
			for(int j=0; j<4; j++) {
				if(i!=j && ex[j]==ex[i]) ex[i--] = -1;
			}
		}
	}
}



public class WordProgram {
    static Vector<Word> v = new Vector<Word>();
    static Scanner scanner = new Scanner(System.in);
        
    
    public static void main(String[] args){
        //17개 단어를 넣어준다.
        v.add(new Word("love", "사랑"));
	    v.add(new Word("animal", "동물"));
	    v.add(new Word("picture", "그림")); 
	    v.add(new Word("emotion", "감정"));
	    v.add(new Word("baby", "아기"));
	    v.add(new Word("error", "오류"));
	    v.add(new Word("society", "사회"));
	    v.add(new Word("doll", "인형"));
	    v.add(new Word("bear", "곰"));
	    v.add(new Word("example", "보기"));
	    v.add(new Word("deal", "거래"));
	    v.add(new Word("photo", "사진"));
	    v.add(new Word("human", "인간"));
	    v.add(new Word("statue", "조각상"));
	    v.add(new Word("eye", "눈"));
	    v.add(new Word("hand", "손"));
	    v.add(new Word("ant", "개미"));

        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");

        while(true){
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>>");
            int mode = scanner.nextInt();
            //switch 문으로 모드 설정.
            switch(mode) {
                case 1:
                    testing();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    System.out.println("\"명품영어\"를 종료합니다.");
                    scanner.close();
                    return;
            }
        }
        
    }

    static void testing() {
        
        System.out.println("현재 "+ v.size() +"개의 단어가 들어 있습니다. -1을 입력하면 종료합니다.");


        while(true) {
            int right = (int)(Math.random() * v.size()); //정답 인덱스
            String e = v.get(right).getEng(); //랜덤으로 뽑은 영단어
            System.out.println(e + "?");

            Ex exam = new Ex(right, v.size());
            for(int i=0; i<4; i++) {
				System.out.print("(" + (i+1) + ")" + v.get(exam.ex[i]).getKor() + " :");//보기 출력.
			}
            
            int ans = scanner.nextInt();//사용자의 정답 입력

            if(ans == -1){
                System.out.println();
                break;
            }
            else if(exam.ex[(ans-1)] == right) System.out.println("Excellent!!");
            else System.out.println("NO!!");


        }

    }

    static void insert() {//삽입 함수
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while(true) {

            System.out.print("영어 한글 입력 >> ");
            String eng = scanner.next();
            if(eng.equals("그만")) return;//그만이 입력되면 리턴(메소드 종료)
            String kor = scanner.next();
            v.add(new Word(eng, kor));//kor까지 무사히 들어오면 입력.
        }
    }
}
