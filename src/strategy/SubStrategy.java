package strategy;

/**
 * @author chenjianhui on 2019/10/21
 */
public class SubStrategy implements Strategy {

    @Override
    public int algorithm(int num0, int num1) {
        return num0-num1;
    }
}
