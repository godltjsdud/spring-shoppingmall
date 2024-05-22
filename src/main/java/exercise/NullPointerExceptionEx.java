package exercise;

public class NullPointerExceptionEx{
    public static void main(String[] args) {
        System.out.println("?");
        String[] strings = null;
        String str = null;

        try{
            System.out.println(str.charAt(0));
        }catch (NullPointerException e){
           e.printStackTrace();
        }

    }
}
