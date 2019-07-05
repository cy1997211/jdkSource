package common.util.deadLock;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package common.util.deadLock
 * @date 2019/7/5 8:36
 * @Description: 死锁
 */

public class DeadLock implements Runnable{
    private static Object o1 = new Object(), o2 = new Object();

    private int flag = 1;

    @Override
    public void run() {
        if(flag == 1){
            synchronized (o1 ){
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("1111111111");
                }
            }
        }

        if (flag == 0){
            synchronized (o2){
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("222222222222222");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock();
        DeadLock d2 = new DeadLock();

        d1.flag = 1;
        d2.flag = 0;

        new Thread(d1).start();
        new Thread(d2).start();
    }

}