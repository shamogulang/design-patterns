package realwork.work6.consumer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

//@Data
public class MqMessage {

    /**
     * 64位，消息唯一id，格式为YYYYMMDDHHMISS【14位】+UUID【32位】+18位0【扩展位】
     */
    private String messageId;

    /**
     * 一个sid批量传输多个数据内容
     */
    private String sid;

    /**
     * sid事务传输块为最后一块时为1，否则为0
     */
    private Integer sidFinish;

    /**
     * 多个对象内容,数组形式
     */
    private List<MqMessageData> data;

}
