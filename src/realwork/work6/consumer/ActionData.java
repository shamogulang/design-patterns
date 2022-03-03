package realwork.work6.consumer;


//@Data
public class ActionData  {

    /**
     * 对象唯一id，取得json的主键
     */
    private String objectId;

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
     * 对象类型：
     * 0001圈子，0002圈子用户信息，0003圈子动态，0004圈子资源
     * 业务分区按这个来。
     */
    private String objectType;
}
