package realwork.work6.consumer;

import realwork.work6.consumer.base.GroupBaseConsumer;
import realwork.work6.consumer.config.GroupMqProperties;

//@Component
public class GroupConsumer extends GroupBaseConsumer<GroupMqProperties> {
//    @Autowired
    private GroupMqProperties groupMqProperties;

    @Override
    protected void subscribeConfig() {
        subscribeConfig(groupMqProperties);
    }
}
