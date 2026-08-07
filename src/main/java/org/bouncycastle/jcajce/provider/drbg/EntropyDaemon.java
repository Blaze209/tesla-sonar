package org.bouncycastle.jcajce.provider.drbg;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
class EntropyDaemon implements Runnable {
    private static final Logger LOG = Logger.getLogger(EntropyDaemon.class.getName());
    private final LinkedList<Runnable> tasks = new LinkedList<>();

    void addTask(Runnable runnable) {
        synchronized (this.tasks) {
            this.tasks.add(runnable);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnablePoll;
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (this.tasks) {
                runnablePoll = this.tasks.poll();
            }
            if (runnablePoll != null) {
                runnablePoll.run();
            } else {
                try {
                    Thread.sleep(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        Logger logger = LOG;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("entropy thread interrupted - exiting");
        }
    }
}
