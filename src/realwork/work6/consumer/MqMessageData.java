package realwork.work6.consumer;


//@Data
public class MqMessageData {

    /**
     * 对象唯一id，取得json的主键。
     */
    private String objectId;

    /**
     * 对象类型：
     * 0001圈子，0002圈子用户信息，0003圈子动态，0004圈子资源
     * 业务分区按这个来。
     */
    private String objectType;

    /**
     * 当前对象的动作
     * 新建0000 | 修改0001 | 删除0002
     */
    private String action;

    /**
     * 对象json全文，具体参照2.content说明，根据对象类型不同，结构不同
     */
    private String content;

    /**
     * 对象创建时间，格式为时间戳 如果历史数据错误则默认为1970年
     */
    private Long createTime;

    /**
     * 对象最新修改时间，格式为时间戳 如果历史数据错误则默认为1970年
     */
    private Long updateTime;
}
