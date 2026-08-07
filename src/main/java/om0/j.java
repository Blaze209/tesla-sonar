package om0;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f98130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f98131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f98132c;

    static final class a extends Thread implements i {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public j(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f98130a + CoreConstants.DASH_CHAR + incrementAndGet();
        Thread aVar = this.f98132c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f98131b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f98130a + "]";
    }

    public j(String str, int i11) {
        this(str, i11, false);
    }

    public j(String str, int i11, boolean z11) {
        this.f98130a = str;
        this.f98131b = i11;
        this.f98132c = z11;
    }
}
