public class Main {
    public static final String project = "java project";
    public String name = "lixinchen";   //实例变量对子类可见
    private Integer time = 19950912;    //私有变量，仅在该类可见


    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text);

        Main main = new Main();
        main.printInfo();

    }

    public void printInfo(){
        String author = "lxc";
        System.out.println("Hello: " + author + " " + name);
        System.out.println("This is first " + project + " " + time);
    }


}