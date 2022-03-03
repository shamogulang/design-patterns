package realwork.work6.consumer.base;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @discribe: 顺序消费基类
 */
public abstract class BaseOrderlyConsumer extends BaseConsumer {

    /**
     * 顺序消费必须保证单线程 最大线程
     */
    private int consumeThreadMax = 1;
    /**
     * 最小线程
     */
    private int consumeThreadMin = 1;

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
            consumer.registerMessageListener((MessageListenerOrderly) (msgs, context) -> {
                try {
                    return consume(msgs, context);
                } catch (Exception e) {
                    //log.error(e.getMessage(), e);
                    //记录异常后返回成功，避免阻塞队列
                    return ConsumeOrderlyStatus.SUCCESS;
                }
            });
            consumer.start();
        } catch (Exception e) {
            //log.error(e.getMessage(), e);
        }
    }

    protected abstract ConsumeOrderlyStatus consume(List<MessageExt> msgs, ConsumeOrderlyContext context);
}
