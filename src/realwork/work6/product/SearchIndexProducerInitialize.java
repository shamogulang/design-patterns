//package realwork.work6.product;
//
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@Slf4j
//@Data
//public class SearchIndexProducerInitialize implements InitializingBean, DisposableBean {
//    @Value("${rocketmq.searchIndex.namesrvAddr}")
//    protected String namesrvAddr;
//    @Value("${rocketmq.searchIndex.clientName:SearchIndexProducer}")
//    protected String instanceName;
//
//    private DefaultMQProducer producer;
//    @Value("${rocketmq.searchIndex.group:SearchIndexProducer}")
//    private String producerGroup;
//
//    private volatile int defaultTopicQueueNums = 4;
//
//    private int sendMsgTimeout = 1000;
//
//    private int retryTimesWhenSendFailed = 2;
//
//    @Bean("searchIndexProducer")
//    public DefaultMQProducer getSearchIndexProducer(){
//        return producer;
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        producer = new DefaultMQProducer(producerGroup);
//        producer.setInstanceName(instanceName);
//        producer.setNamesrvAddr(namesrvAddr);
//        producer.setDefaultTopicQueueNums(defaultTopicQueueNums);
//        producer.setSendMsgTimeout(sendMsgTimeout);
//        producer.setRetryTimesWhenSendFailed(retryTimesWhenSendFailed);
//        producer.start();
//        log.info("Producer Group {} started!", producerGroup);
//    }
//
//    @Override
//    public void destroy() {
//        if (producer != null) {
//            producer.shutdown();
//        }
//    }
//}
