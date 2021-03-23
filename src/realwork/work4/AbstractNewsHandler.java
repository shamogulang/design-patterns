package realwork.work4;

public abstract class AbstractNewsHandler implements NewsHandler {

    @Override
    public void handle(NewsEvent event) throws Exception {

        if(event == null){
            throw  new Exception("事件参数为空！");
        }

        if(!match(event.getEventType(), event.getTargetSystem())){
            throw new Exception("匹配不到对应的事件！");
        }

        News news = find(event.getNewsId());
        doHandle(event, news);
    }

    public News find(long newsId){
        return new News();
    }

    public abstract void doHandle(NewsEvent event, News news) throws Exception;

}
