package realwork.work4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewsHandlerFacade implements EventHandler<NewsEvent>{


    private List<NewsHandler> newsHandlers = new ArrayList<>();

    @Override
    public void handle(NewsEvent event) throws Exception {

        List<NewsHandler> newsHandlers = this.newsHandlers.stream().filter(item -> item.match(event.getEventType(), event.getTargetSystem())).collect(Collectors.toList());
        if(newsHandlers.isEmpty()){
            throw new Exception("无法配置到事件处理器。");
        }
        if(newsHandlers.size() > 1){
            throw new Exception("匹配到多个事件处理器。");
        }
        newsHandlers.get(0).handle(event);
    }
}
