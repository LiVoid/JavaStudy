import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static final String project = "java project";
    public String name = "lixinchen";   //实例变量对子类可见
    LocalDate birthday = LocalDate.of(1955,9,12);    //静态工厂方法来构造LocalDate类的对象


    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text);

        Main main = new Main();
        main.printInfo();

    }

    public void printInfo(){
        String [] author = {"lxc", "li", "lee", "anyone"};
        for (String a : author)
            System.out.println("Hello, author: " + a );
        System.out.println("This is first " + project + " " + birthday);
    }


}