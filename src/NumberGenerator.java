public class NumberGenerator implements Runnable {
    private Thread thread;
    private String threadName;

    public NumberGenerator(String threadName) {
        super();
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getThreadName() + " = " + i);
            count++;
            if (count == 10) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("running thread name is: "
                + Thread.currentThread().getName());
        System.out.println("running thread priority is: "
                + Thread.currentThread().getPriority());
    }
}
