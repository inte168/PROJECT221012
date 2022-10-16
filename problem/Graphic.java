//실습 10

package problem;
import java.util.*;


public class Graphic {
    static Scanner scanner = new Scanner(System.in);
    static Vector<Shape> v = new Vector<Shape>();

    static void view() {
        for(int i =0; i<v.size(); i++) v.get(i).draw();
    }

    static boolean delete(int index) {
        if(v.size()==0 || index >= v.size()) return false;
        v.remove(index);
        return true;
    }

    static void insert(int choice) {
        Shape shape = null;
        switch(choice) {
            case 1:
                shape = new Line();
                break;

            case 2:
                shape = new Rect();
                break;

            case 3:
                shape = new Circle();
                break;
        }
        v.add(shape);
    }
    public static void main(String[] args) {
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        int choice = 0;

        while(choice !=4) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>>");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    int type = scanner.nextInt();
                    if(type<1||type>3) {
                        System.out.println("잘못 선택하셨습니다.");
                        break;
                    }
                    insert(type);
                    break;

                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int index = scanner.nextInt();
                    if(!delete(index)) System.out.println("삭제할 수 없습니다.");
                    break;

                case 3:
                    view();
                    break;

                case 4:
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
            
        }
        System.out.println("beauty을 종료합니다.");
    }
}
