package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeThrowCheckerEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int age = 0;
            while(-1 != (age = sc.nextInt())){
                if(age > 100 || age < 0)
                    throw new InputBoundErrorException("잘못 입력하셨쓰비나디");
                System.out.println("당신의 나이는 " + age +"살이시네요. 반갑습니다");

            }

            System.out.println("시스템을 종료합니다.");
        }catch (InputBoundErrorException e){
            System.out.println(e.getMessage());
//            System.out.println("잘못입력 하셨습니다.");
        }
    }
}
