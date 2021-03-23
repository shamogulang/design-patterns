package realwork.work4;

public class LivesUpdateCacheHandler extends AbstractLiveHandler{


    @Override
    public void doHandle(LiveEvent event, Lives lives) throws Exception {

        boolean b = doWork();
        // 修改数据库的记录为已经执行
        if(b){
            updateEventStatus();
        }
    }

    public boolean doWork(){
        return true;
    }

    public void updateEventStatus(){

    }

    @Override
    public boolean match(byte eventType, String targetSystem) {
        return EventType.UPDATE_CACHE.getValue() == eventType
                 && TargetSystem.LIVE.name().equals(targetSystem);
    }
}
