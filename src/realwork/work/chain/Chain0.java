package realwork.work.chain;

import realwork.work.NotNullCheck;
import realwork.work.TypeValidate0;

public class Chain0 extends AbstractChain{

    public Chain0() {
        validateParamList.add(new NotNullCheck());
        validateParamList.add(new TypeValidate0());
    }
}
