package realwork.work6.consumer;

import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.common.message.MessageExt;
import realwork.work6.consumer.base.BaseConcurrentlyConsumer;
import realwork.work6.consumer.config.GroupMqProperties;

import java.util.ArrayList;
import java.util.List;

//@Component
public class GroupMsgSubscriber extends BaseConcurrentlyConsumer {


//    @Autowired
//    private GroupService groupService;
//    @Autowired
    private GroupMqProperties groupMqProperties;

    @Override
    protected ConsumeConcurrentlyStatus consume(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
        //log.info("msgSize: {}", msgs.size());
        List<MqMessage> messageList = new ArrayList<>();
        for (MessageExt msg : msgs) {
            String message = new String(msg.getBody());
            //log.info("msg: {}", message);
//            MqMessage mqMessage = JSON.parseObject(message, MqMessage.class);
//            messageList.add(mqMessage);
        }
        // todo 完善代码
        //groupService.batchConsumer(messageList);
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }

    @Override
    protected void subscribeConfig() {
//        super.setTag(groupMqProperties.getTag());
//        super.setTopic(groupMqProperties.getTopic());
//        super.setGroupName(groupMqProperties.getGroupName());
//        super.setConsumeMessageBatchMaxSize(groupMqProperties.getConsumeMessageBatchMaxSize());
    }

}
