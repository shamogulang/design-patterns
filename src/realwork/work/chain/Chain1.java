package realwork.work.chain;

import realwork.work.NotNullCheck;
import realwork.work.TypeValidate1;

public class Chain1 extends AbstractChain {

    public Chain1() {
        validateParamList.add(new NotNullCheck());
        validateParamList.add(new TypeValidate1());
    }
}
