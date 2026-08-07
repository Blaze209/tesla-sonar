package androidx.media3.common;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9021a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f9022b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9023c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i11, int i12) {
            super("Priority too low [priority=" + i11 + ", highest=" + i12 + "]");
        }
    }

    public void a(int i11) {
        synchronized (this.f9021a) {
            this.f9022b.add(Integer.valueOf(i11));
            this.f9023c = Math.max(this.f9023c, i11);
        }
    }

    public void b(int i11) {
        synchronized (this.f9021a) {
            try {
                if (this.f9023c != i11) {
                    throw new PriorityTooLowException(i11, this.f9023c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(int i11) {
        synchronized (this.f9021a) {
            this.f9022b.remove(Integer.valueOf(i11));
            this.f9023c = this.f9022b.isEmpty() ? Integer.MIN_VALUE : ((Integer) q0.l(this.f9022b.peek())).intValue();
            this.f9021a.notifyAll();
        }
    }
}
