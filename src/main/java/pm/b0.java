package pm;

import android.os.Process;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpm/b0;", "Ljava/util/concurrent/ThreadFactory;", "", "threadPriority", "", "prefix", "", "addThreadNumber", "<init>", "(ILjava/lang/String;Z)V", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "a", "I", "b", "Ljava/lang/String;", "c", "Z", "Ljava/util/concurrent/atomic/AtomicInteger;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int threadPriority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String prefix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean addThreadNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger threadNumber;

    public b0(int i11, String prefix, boolean z11) {
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        this.threadPriority = i11;
        this.prefix = prefix;
        this.addThreadNumber = z11;
        this.threadNumber = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b0 this$0, Runnable runnable) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.threadPriority);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        p013kotlin.jvm.internal.s.k(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: pm.a0
            @Override // java.lang.Runnable
            public final void run() {
                b0.b(this.f103200a, runnable);
            }
        };
        if (this.addThreadNumber) {
            str = this.prefix + "-" + this.threadNumber.getAndIncrement();
        } else {
            str = this.prefix;
        }
        return new Thread(runnable2, str);
    }
}
