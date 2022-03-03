package realwork.work6.consumer.base;

import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.common.message.MessageExt;
import realwork.work6.consumer.ActionData;
import realwork.work6.consumer.config.GroupMqBaseProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GroupBaseConsumer<T extends GroupMqBaseProperties> extends BaseOrderlyConsumer {

//    @Autowired
//    private GroupService groupService;

    @Override
    protected ConsumeOrderlyStatus consume(List<MessageExt> msgs, ConsumeOrderlyContext context) {
        Map<String, ActionData> dataResult = new ConcurrentHashMap<>();
//        log.info("msgSize: {}", msgs.size());
        for (MessageExt msg : msgs) {
            String message = new String(msg.getBody());
//            log.info("msg: {}", message);
            //MqMessage mqMessage = JSON.parseObject(message, MqMessage.class);
//            batchManage(mqMessage, dataResult);
        }
        List resultList = new ArrayList<>();
        resultList.addAll(dataResult.values());
        //groupService.batchConsumer(resultList);
        return ConsumeOrderlyStatus.SUCCESS;
    }

//    private void batchManage(MqMessage mqMessage, Map<String, ActionData> dataResult) {
//        String messageId = mqMessage.getMessageId();
//        String sId = mqMessage.getSid();
//        List<MqMessageData> mqMessageDataList = mqMessage.getData();
//        if (mqMessageDataList == null || mqMessageDataList.size() == 0) {
//            return;
//        }
//        for (MqMessageData mqMessageData : mqMessageDataList) {
//            ActionData data = new ActionData();
//            data.setObjectId(mqMessageData.getObjectId());
//            data.setMessageId(messageId);
//            data.setSid(sId);
//            data.setContent(mqMessageData.getContent());
//            data.setAction(mqMessageData.getAction());
//            data.setObjectType(mqMessageData.getObjectType());
//            dataResult.put(mqMessageData.getObjectId(), data);
//        }
//    }

    protected void subscribeConfig(T groupMqProperties) {
//        super.setTag(groupMqProperties.getTag());
//        super.setTopic(groupMqProperties.getTopic());
//        super.setGroupName(groupMqProperties.getGroupName());
//        super.setConsumeMessageBatchMaxSize(groupMqProperties.getConsumeMessageBatchMaxSize());
    }
}
