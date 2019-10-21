package strategy;

/**
 * @author chenjianhui on 2019/10/21
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //执行算法
    public int execute(int num0,int num1){
       return strategy.algorithm(num0,num1);
    }
}
