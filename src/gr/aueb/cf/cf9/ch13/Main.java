package gr.aueb.cf.cf9.ch13;

public class Main {

    public static void main(String[] args) {
        HelloUtil.sayHello();
        OnlyOneCodingFactory onlyOneCodingFactory = OnlyOneCodingFactory.getInstance();
        OnlyOneCodingFactory onlyOneCodingFactory1 = OnlyOneCodingFactory.getInstance();

        OnlyOneCodingLazy onlyOneCodingLazy = OnlyOneCodingLazy.getInstance();
        OnlyOneCodingLazy onlyOneCodingLazy1 = OnlyOneCodingLazy.getInstance();
        System.out.println(onlyOneCodingLazy1);
        System.out.println(onlyOneCodingLazy.toString());
        System.out.println(onlyOneCodingFactory);
        System.out.println(onlyOneCodingFactory1.toString());
        onlyOneCodingLazy.doSomething();
    }
}
