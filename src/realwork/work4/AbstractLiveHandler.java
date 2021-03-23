package realwork.work4;

public abstract class AbstractLiveHandler implements LiveHandler{

    @Override
    public void handle(LiveEvent event) throws Exception {
        if(event == null){
            throw  new Exception("事件参数为空！");
        }

        if(!match(event.getEventType(), event.getTargetSystem())){
            throw new Exception("匹配不到对应的事件！");
        }

        Lives lives = find(event.getLivePk());
        doHandle(event, lives);
    }

    public Lives find(long livePk){
        return new Lives();
    }

    public abstract void doHandle(LiveEvent event, Lives lives) throws Exception;
}
