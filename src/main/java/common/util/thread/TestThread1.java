package common.util.thread;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package common.util.thread
 * @date 2019/5/5 10:06
 * @Description:
 */
public class TestThread1 {

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("111111");
            }
        }).start();
    }

}