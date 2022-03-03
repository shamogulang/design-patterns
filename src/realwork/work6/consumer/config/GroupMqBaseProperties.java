package realwork.work6.consumer.config;

//@Data
public class GroupMqBaseProperties {

    /**
     * 主题
     */
    private String topic;
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 批量入库条数
     */
    private int consumeMessageBatchMaxSize;
    /**
     * 标签名称，分组里的标签要一直
     */
    private String tag;
}
