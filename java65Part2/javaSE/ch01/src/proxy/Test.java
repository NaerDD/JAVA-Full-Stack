package proxy;

public class Test {
    public static void main(String[] args) {
        // 自己登录，自己打怪，然后升级
        // 被代理者
        IGame realPlayer = new GamePlayer("快来针对我！");

        // 得到代理对象
        IGame proxy = new GamePlayerProxy(realPlayer);

        // 调用方法时，直接使用代理对象，不使用被代理者
        proxy.login("admin", "123456");
        proxy.killBoss();
        proxy.upgrade();
        //匿名内部类 一定要实现一个接口的时候使用 实例化一个接口 不赋名字
        //接口的匿名实现类是指在实现接口时，不给出类名，只给出方法体，这种方式也称为匿名内部类。
        //new 接口名(){
        //    public 返回值类型 方法名(){
        //        //方法体
        //    }
        //}

        //匿名内部类可以实现一个或多个接口，也可以继承一个类。
        //匿名内部类的使用场景：
        //
        //1. 当需要实现一个很简单的接口，并且不需要该接口的对象时。
        //2. 当需要在方法中创建一个接口的对象，并且只使用一次时。
        //3. 当需要在一个方法中创建多个接口的对象时。

        //匿名内部类的注意事项：
        //
        //1. 匿名内部类不能有构造方法。
        //2. 匿名内部类不能是静态的。
        //3. 匿名内部类不能是 final 的。
        //4. 匿名内部类不能继承另一个匿名内部类。
        //5. 匿名内部类不能实现另一个匿名内部类。

        //匿名内部类可以给名字，但是名字只能在内部使用，不能在外部使用。
        // 创建一个实现了 Runnable 接口的匿名内部类对象
        Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello World!");
                }
            };
            // 启动线程
            new Thread(runnable).start();



    }
    //Lambda 表达式是 Java 8 中引入的新特性，它可以用来简化匿名内部类的写法。
    public static void run(){
        Runnable runnable1 = () -> {
            System.out.println("Hello2 World!");
        };
    }
}
