package realwork.work3;

public class RunnableTest {


    public static void main(String[] args) {

        Runnable runnable = createRunnable();
        runnable.run();

        executeTransaction(()->{
            System.out.println("操作数据库1");
            System.out.println("操作数据库2");
            System.out.println("操作数据库3");
        });
    }

    public static Runnable createRunnable(){

        return () -> {
            System.out.println("doing step one");
            System.out.println("doing step two");
        };
    }

    // 加上数据库的事务注解
    public static void executeTransaction(Runnable... runnableList) {
        for (Runnable runnable : runnableList) {
            try {
                runnable.run();
            } catch (Exception e) {
                System.out.println("数据库异常！");
                throw e;
            }
        }
    }
}
