package etc;

public enum EnumAfterDemo {
    AMERICANO(0, "아메리카노"),
    LATTE(1,"라떼"),
    STRAWBERRYADE(2,"딸기에이드"),
    ESPRESSO(2, "에스프레소");
    private final int menuNum;
    private final String menuName;


    EnumAfterDemo(int menuNum, String menuName){
        this.menuNum = menuNum;
        this.menuName = menuName;
    }

    public void selectNenu(){
        System.out.println(menuName);
    }

}
