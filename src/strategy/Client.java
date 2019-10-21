package strategy;

/**
 * @author chenjianhui on 2019/10/21
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new AddStrategy();
        Context context = new Context(strategy);
        int result = context.execute(12,13);
        System.out.println(result);
        //结果为25，执行的是加法策略

        //现在比如说我要增加一个减法的操作，则加一个减法策略类即可
        context = new Context(new SubStrategy());
        System.out.println(context.execute(23,12));
        //返回结果为11

        //策略模式通过某个策略去执行某种算法，遵循开闭原则，但是客户端必须能区分使用的是哪种策略
        //同时如果策略很多，会使的策略类很多
    }
}
