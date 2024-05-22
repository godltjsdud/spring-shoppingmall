package exercise;

public class ArithmeticsEx {

    public static void main(String[] args) {
        try{
            divide(100,0);
        }catch (ArithmeticException e){
            System.out.println("내가 대신 처리할게");
        }
    }

    public static int divide(int x , int y) throws ArithmeticException{

        return x/y;


    }
}
