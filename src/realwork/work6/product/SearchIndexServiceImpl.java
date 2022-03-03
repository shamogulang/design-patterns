//package realwork.work6.product;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.apache.rocketmq.client.producer.MessageQueueSelector;
//import org.apache.rocketmq.client.producer.SendCallback;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.apache.rocketmq.common.message.Message;
//import org.apache.rocketmq.common.message.MessageQueue;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@Slf4j
//@Service
//public class SearchIndexServiceImpl implements SearchIndexService{
//    @Value("${rocketmq.searchIndex.producer.group.topic}")
//    private String groupIndexTopic;
//    @Resource(name="searchIndexProducer")
//    DefaultMQProducer searchIndexProducer;
//    private long SEND_TIME_OUT = 1000L;
//
//    @Override
//    public void createGroupSearchIndex() {
//        try {
//            //TODO 从数据中获取用户ID
//            Long userId = 1L;
//            Message msg = new Message();
//            msg.setBody("test".getBytes());
//            //设置业务key便于排查问题，这里可以将contentId、userId等放进来
//            msg.setKeys(userId.toString());
//            msg.setTopic(groupIndexTopic);
//            searchIndexProducer.send(msg, new MessageQueueSelector() {
//                @Override
//                public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
//                    Long userId = (Long) arg;
//                    long index = userId % mqs.size();
//                    //绑定指定的key
//                    return mqs.get((int) index);
//                }
//            },userId,new SendCallback() {
//                @Override
//                public void onSuccess(SendResult sendResult) {
//                    log.info(sendResult.getMsgId() + " >>>>" + sendResult.getSendStatus());
//                }
//
//                @Override
//                public void onException(Throwable e) {
//                    //TODO 打印出错的数据
//                    log.error(e.getMessage(),e);
//                }
//            },SEND_TIME_OUT);
//        } catch (Exception e) {
//            //TODO 打印出错的数据
//           log.error(e.getMessage(),e);
//        }
//    }
//}
