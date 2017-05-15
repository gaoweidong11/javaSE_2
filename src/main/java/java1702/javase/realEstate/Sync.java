package java1702.javase.realEstate;

/**
 * Created by 高伟冬 on 2017/5/12.
 * javaSE_2
 * 15:28
 * 星期五
 */
class Sync {
    synchronized void waitTest() {
        System.out.println(Thread.currentThread().getName() + " wait start...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " wait end...");
    }

    synchronized void notifyTest() {
        System.out.println(Thread.currentThread().getName() + " notify start...");
        this.notify();
        System.out.println(Thread.currentThread().getName() + " notify end...");
    }
}

class SyncTest implements Runnable {
    private static Sync sync = new Sync();

    public void run() {
        if (Thread.currentThread().getName().endsWith("9")) {
            sync.notifyTest();
            return;
        }
        sync.waitTest();
    }

    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(syncTest, "thread " + i);
            thread.start();
        }
    }
}

