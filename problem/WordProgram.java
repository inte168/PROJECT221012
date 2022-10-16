//�ǽ� 12��
package problem;

import java.util.*;

class Word {//Word Ŭ����.
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
	int ex[] = {-1, -1, -1, -1}; // 4���� ���� �迭�� -1�� �ʱ�ȭ �� ��.
	
	public Ex(int num, int size) {
		int answerNum = (int)(Math.random()*4); // ������ ��ȣ ���� ����
		ex[answerNum] = num; // ������ ���� ��ȣ�� ������ ����.
		for(int i=0; i<4; i++) {
            //ũ�� ��ü���� �������� ������ -1��(������ �ƴ�) ���⿡ �ִ´�.
			int n = (int)(Math.random()*size); 
			if(ex[i]==-1) ex[i] = n;
			
            //���� ������ ���԰ų�, ����� ���� ���� �ٽ�.
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
        //17�� �ܾ �־��ش�.
        v.add(new Word("love", "���"));
	    v.add(new Word("animal", "����"));
	    v.add(new Word("picture", "�׸�")); 
	    v.add(new Word("emotion", "����"));
	    v.add(new Word("baby", "�Ʊ�"));
	    v.add(new Word("error", "����"));
	    v.add(new Word("society", "��ȸ"));
	    v.add(new Word("doll", "����"));
	    v.add(new Word("bear", "��"));
	    v.add(new Word("example", "����"));
	    v.add(new Word("deal", "�ŷ�"));
	    v.add(new Word("photo", "����"));
	    v.add(new Word("human", "�ΰ�"));
	    v.add(new Word("statue", "������"));
	    v.add(new Word("eye", "��"));
	    v.add(new Word("hand", "��"));
	    v.add(new Word("ant", "����"));

        System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�. ****");

        while(true){
            System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>>");
            int mode = scanner.nextInt();
            //switch ������ ��� ����.
            switch(mode) {
                case 1:
                    testing();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    System.out.println("\"��ǰ����\"�� �����մϴ�.");
                    scanner.close();
                    return;
            }
        }
        
    }

    static void testing() {
        
        System.out.println("���� "+ v.size() +"���� �ܾ ��� �ֽ��ϴ�. -1�� �Է��ϸ� �����մϴ�.");


        while(true) {
            int right = (int)(Math.random() * v.size()); //���� �ε���
            String e = v.get(right).getEng(); //�������� ���� ���ܾ�
            System.out.println(e + "?");

            Ex exam = new Ex(right, v.size());
            for(int i=0; i<4; i++) {
				System.out.print("(" + (i+1) + ")" + v.get(exam.ex[i]).getKor() + " :");//���� ���.
			}
            
            int ans = scanner.nextInt();//������� ���� �Է�

            if(ans == -1){
                System.out.println();
                break;
            }
            else if(exam.ex[(ans-1)] == right) System.out.println("Excellent!!");
            else System.out.println("NO!!");


        }

    }

    static void insert() {//���� �Լ�
        System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
        while(true) {

            System.out.print("���� �ѱ� �Է� >> ");
            String eng = scanner.next();
            if(eng.equals("�׸�")) return;//�׸��� �ԷµǸ� ����(�޼ҵ� ����)
            String kor = scanner.next();
            v.add(new Word(eng, kor));//kor���� ������ ������ �Է�.
        }
    }
}
