package realwork.work.chain;

import work.NotNullCheck;
import work.TypeValidate0;

public class Chain0 extends AbstractChain{

    public Chain0() {
        validateParamList.add(new NotNullCheck());
        validateParamList.add(new TypeValidate0());
    }
}
