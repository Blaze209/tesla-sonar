package v;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lv/p5;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljn0/h0;", "f", "()V", "c", "h", "", "e", "()I", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger mVideoUsage;

    public p5(Executor executor) {
        p013kotlin.jvm.internal.s.k(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p5 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        int iDecrementAndGet = this$0.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            c0.y0.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
            return;
        }
        c0.y0.l("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p5 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        c0.y0.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.mVideoUsage.incrementAndGet());
    }

    public final void c() {
        this.executor.execute(new Runnable() { // from class: v.n5
            @Override // java.lang.Runnable
            public final void run() {
                p5.d(this.f117135a);
            }
        });
    }

    public final int e() {
        return this.mVideoUsage.get();
    }

    public final void f() {
        this.executor.execute(new Runnable() { // from class: v.o5
            @Override // java.lang.Runnable
            public final void run() {
                p5.g(this.f117150a);
            }
        });
    }

    public final void h() {
        this.mVideoUsage.set(0);
        c0.y0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
