package realwork.work4;

public class LivesUpdateCntHandler extends AbstractLiveHandler{


    @Override
    public void doHandle(LiveEvent event, Lives news) throws Exception {

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
        return EventType.UPDATE_CNT.getValue() == eventType
                 && TargetSystem.LIVE.name().equals(targetSystem);
    }
}
