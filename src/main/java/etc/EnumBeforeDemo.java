package etc;

public class EnumBeforeDemo {


    int menu;
    public static final int americano =0;
    public static final int latte = 1;
    public static final int strawberryAde = 2;
    public static final int espresso = 3;

    EnumBeforeDemo(int menu){
        this.menu = menu;
    }

    public void seleltMenu(){

        switch (menu){
            case 0:
                System.out.println("아메리카노");
            case 1:
                System.out.println("라떼");
            case 2:
                System.out.println("딸기에이드");
            case 3:
                System.out.println("에스프레소");
        }
    }
}
