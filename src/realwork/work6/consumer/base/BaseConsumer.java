package realwork.work6.consumer.base;


public abstract class BaseConsumer {

    /**
     * rocketmq引入地址
     * 加@Value注解
     */
    protected String namesrvAddr;
    /**
     * 消费组
     */
    protected String groupName;
    /**
     * 主题
     */
    protected String topic;
    /**
     * 标签（注：同一消费组的消费者消费的tag需一致，否则会消费错误）
     */
    protected String tag = "*";
    /**
     * 单个线程单次消费数量,即List<MessageExt> msgs的长度
     */
    protected int consumeMessageBatchMaxSize = 1;
    /**
     * 每次拉取的数量
     */
    protected int pullBatchSize = 32;

    protected abstract void subscribeConfig();
}
