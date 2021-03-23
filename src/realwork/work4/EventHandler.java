package realwork.work4;

public interface EventHandler<T> {

    void handle(T event) throws Exception;
}
