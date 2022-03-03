package realwork.work6.consumer.base;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import javax.annotation.PostConstruct;
import java.util.List;

public abstract class BaseConcurrentlyConsumer extends BaseConsumer {

    /**
     * 最大线程
     */
    private int consumeThreadMax=16;
    /**
     * 最小线程
     */
    private int consumeThreadMin=1;

    @PostConstruct
    public void init() {
        subscribeConfig();
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupName);
        consumer.setNamesrvAddr(namesrvAddr);
        consumer.setConsumeThreadMin(consumeThreadMin);
        consumer.setConsumeThreadMax(consumeThreadMax);
        consumer.setConsumeMessageBatchMaxSize(consumeMessageBatchMaxSize);
        consumer.setPullBatchSize(pullBatchSize);
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
        try {
            consumer.subscribe(topic, tag);
            consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
                try {
                    return consume(msgs, context);
                } catch (Exception e) {
                    //log.error(e.getMessage(), e);
                    return ConsumeConcurrentlyStatus.RECONSUME_LATER;
                }
            });
            consumer.start();
        } catch (Exception e) {
            //log.error(e.getMessage(), e);
        }
    }

    protected abstract ConsumeConcurrentlyStatus consume(List<MessageExt> msgs, ConsumeConcurrentlyContext context);
}
