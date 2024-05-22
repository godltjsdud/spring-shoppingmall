package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MbtiThrowsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("=== 엠비티아이 검사를 시작합니다. ===");

            checkEorI(scanner);
            //1. 나는 밖에서 에너지를 얻는다.
            //2. 나는 이불 속에서 에너지를 얻는다.

            // 당신의 선택은? _ (숫자로 입력 불가)
            // 1 -> E 2 -> I 입니다
            //만약 1a 처럼 잘못 입력 하면 예외
            System.out.println("=== 엠비티아이 검사가 종료되었습니다. ===");

            if(scanner != null)
                scanner.close();
        }catch (InputMismatchException e){
            System.out.println("키보드 입력이 잘못되었습니다.");
        }
    }

    private static void checkEorI(Scanner scanner) throws InputMismatchException{
        System.out.println("1. 나는 밖에서 에너지를 얻는다.");
        System.out.println("2. 나는 이불 속에서 에너지를 얻는다.");
        int num = scanner.nextInt();

        if(num == 1){
            System.out.println("당신은 E!");
        } else if (num ==2) {
            System.out.println("당신은 I!");
        }
        {
            System.out.println();
        }
    }
}
