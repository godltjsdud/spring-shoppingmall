package exercise;

import java.util.Scanner;

public class InputMismatchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while(true) {
//            int score = scanner.nextInt();
//            if (score >= 60)
//                System.out.println("합격");
//            else
//                System.out.println("다음에 다시봐요");
//        }
//

        try{
            String input = scanner.nextLine();
            if(input.equals("q")){
                System.out.println("종료");
                scanner.close();

            }else  {
                int num = Integer.parseInt(input);
                if(num > 60 ){
                    System.out.println("합격");
                }else {
                    System.out.println("불합격");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }


//        System.out.println("프로그램 종료");
//        scanner.close();
    }
}
