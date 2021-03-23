package realwork.work2;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Work2 {


    public static void main(String[] args) {
           callAndConsume(()-> "hello",(result)->{
               System.out.println(result);
           }, "req", "action");
    }

    public static <T> T callAndConsume(Callable<T> callable, Consumer<T> consumer, Object req, String action) {
        try {
            T result = callable.call();
            consumer.accept(result);
            return result;
        } catch (Exception e) {
            System.out.println("action="+action+",req="+req);
        }
        return null;
    }
}
