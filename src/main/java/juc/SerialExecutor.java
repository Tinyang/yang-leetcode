package juc;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/**
 * @author: Yangx
 * @Date: 7/26/2022
 */
class SerialExecutor implements Executor {
    final Queue<Runnable> tasks = new ArrayDeque<>();
    final Executor executor;
    Runnable active;

    SerialExecutor(Executor executor) {
        this.executor = executor;
    }

    public synchronized void execute(Runnable r) {
        tasks.add(() -> {
            try {
                r.run();
            } finally {
                scheduleNext();
            }
        });
        tasks.add(() -> System.out.println("SerialExecutor.run"));
        if (active == null) {
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        if ((active = tasks.poll()) != null) {
            executor.execute(active);
        }
    }
}