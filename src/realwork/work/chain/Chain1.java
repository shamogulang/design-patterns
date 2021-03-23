package realwork.work.chain;

import work.NotNullCheck;
import work.TypeValidate1;

public class Chain1 extends AbstractChain {

    public Chain1() {
        validateParamList.add(new NotNullCheck());
        validateParamList.add(new TypeValidate1());
    }
}
