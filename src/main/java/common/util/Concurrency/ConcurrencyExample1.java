package common.util.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package common.util.Concurrency
 * @date 2019/6/24 10:01
 * @Description:
 */

public class ConcurrencyExample1 {

    private static int value =  0;

    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i< 500 ;i++){
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(()->{
                System.out.println("线程:"+Thread.currentThread().getId()+":"+getNextValue());
            });
        }
    }

    public static int getNextValue(){
        return value++;
    }

}