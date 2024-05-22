package exercise;

import java.util.*;
import java.util.regex.Pattern;

public class NumberBaseBall {
    static Scanner scanner = new Scanner(System.in);
    static int[] answer = new int[3];
    static int[] score = new int[3];
    static int idx = 1;
    public static void main(String[] args) {

        answer[0] = 5;
        answer[1] = 2;
        answer[2] = 7;

        System.out.println(Arrays.toString(answer));
        while(idx <= 10){
            StringBuilder sb =new StringBuilder();

            try {
                Arrays.fill(score,0);

                System.out.print(idx+"번째 숫자입력 :");
                String input = scanner.next();

                if(!isNumber(input)){
                    throw new NumberFormatException();
                }
                if (!is3word(input)) {
                    continue;
                }
                if(!isNotUsed(input)){
                    continue;
                }

                play(input);
                if(score[0] != 0)
                    sb.append(score[0]).append("S ");
                if(score[1] != 0)
                    sb.append(score[1]).append("B ");
                if(score[2] != 0)
                    sb.append(score[2]).append("O ");
                System.out.println(sb);

                if(score[0] == 3){
                    System.out.println("you win!");
                    return;
                }

                idx++;
            }catch (NumberFormatException e){
                System.out.println("3자리 숫자 형식으로 입력해주세요");
            }
        }
        System.out.println("you lose!");
    }



    public static boolean isNumber(String num){
        if (Pattern.matches("^[0-9]*$", num)){
            return true;
        }
        return false;
    }

    public static boolean is3word(String num){
        if(num.length() == 3){
            return true;
        }else{
            System.out.println("3자리 숫자를 입력해주세요");
            return false;
        }
    }

    public static boolean isNotUsed(String num){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            int n = num.charAt(i)-'0';

            if(list.contains(n)) {
                System.out.println("숫자가 중복되면 안됩니다. 횟수차감");
                idx++;
                return false;
            }
            list.add(n);
        }
        return true;
    }

    public static void play(String num){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            list.add(answer[i]);
        }

        for(int i=0; i<3; i++){
            if(num.charAt(i)-'0' == answer[i]){
                score[0]++;
            }else if(list.contains(num.charAt(i)-'0')){
                score[1]++;
            }else{
                score[2]++;
            }
        }
    }


}
