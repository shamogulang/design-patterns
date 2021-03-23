package realwork.work4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LivesHandlerFacade implements EventHandler<LiveEvent>{


    private List<LiveHandler> liveHandlers = new ArrayList<>();

    @Override
    public void handle(LiveEvent event) throws Exception {

        List<LiveHandler> liveHandlers = this.liveHandlers.stream().filter(item -> item.match(event.getEventType(), event.getTargetSystem())).collect(Collectors.toList());
        if(liveHandlers.isEmpty()){
            throw new Exception("无法配置到事件处理器。");
        }
        if(liveHandlers.size() > 1){
            throw new Exception("匹配到多个事件处理器。");
        }
        liveHandlers.get(0).handle(event);
    }
}
