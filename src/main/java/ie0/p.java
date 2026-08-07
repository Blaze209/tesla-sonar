package ie0;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lie0/p;", "", "", "maximumDelayMs", "Lie0/p$b;", "scheduler", "Lkotlin/Function0;", "Ljn0/h0;", "action", "Lzn0/c;", "random", "<init>", "(JLie0/p$b;Lwn0/a;Lzn0/c;)V", DateTokenConverter.CONVERTER_KEY, "()V", "e", "b", "a", "J", "Lie0/p$b;", "c", "Lzn0/c;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "", "I", "retryCounter", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long maximumDelayMs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b scheduler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zn0.c random;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Runnable runnable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int retryCounter;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lie0/p$a;", "Lie0/p$b;", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "runnable", "", "delayMs", "Ljn0/h0;", "b", "(Ljava/lang/Runnable;J)V", "a", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Handler handler;

        public a(Handler handler) {
            p013kotlin.jvm.internal.s.k(handler, "handler");
            this.handler = handler;
        }

        @Override // ie0.p.b
        public void a(Runnable runnable) {
            p013kotlin.jvm.internal.s.k(runnable, "runnable");
            this.handler.removeCallbacks(runnable);
        }

        @Override // ie0.p.b
        public void b(Runnable runnable, long delayMs) {
            p013kotlin.jvm.internal.s.k(runnable, "runnable");
            this.handler.postDelayed(runnable, delayMs);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lie0/p$b;", "", "Ljava/lang/Runnable;", "runnable", "", "delayMs", "Ljn0/h0;", "b", "(Ljava/lang/Runnable;J)V", "a", "(Ljava/lang/Runnable;)V", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(Runnable runnable);

        void b(Runnable runnable, long delayMs);
    }

    public p(long j11, b scheduler, final wn0.a<jn0.h0> action, zn0.c random) {
        p013kotlin.jvm.internal.s.k(scheduler, "scheduler");
        p013kotlin.jvm.internal.s.k(action, "action");
        p013kotlin.jvm.internal.s.k(random, "random");
        this.maximumDelayMs = j11;
        this.scheduler = scheduler;
        this.random = random;
        this.runnable = new Runnable() { // from class: ie0.o
            @Override // java.lang.Runnable
            public final void run() {
                p.c(action);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(wn0.a aVar) {
        aVar.invoke();
    }

    public final void b() {
        int i11 = this.retryCounter + 1;
        this.retryCounter = i11;
        long jK = bo0.n.k(((long) bo0.n.h(Math.pow(2.0d, i11) * ((double) 1000), this.maximumDelayMs)) + ((long) this.random.e(0, 1001)), this.maximumDelayMs);
        this.scheduler.a(this.runnable);
        this.scheduler.b(this.runnable, jK);
    }

    public final void d() {
        this.retryCounter = 0;
        this.scheduler.a(this.runnable);
        this.scheduler.b(this.runnable, 0L);
    }

    public final void e() {
        this.retryCounter = 0;
        this.scheduler.a(this.runnable);
    }

    public /* synthetic */ p(long j11, b bVar, wn0.a aVar, zn0.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DataPersistorKt.EXPIRATION_TIME : j11, (i11 & 2) != 0 ? new a(new Handler(Looper.getMainLooper())) : bVar, aVar, (i11 & 8) != 0 ? zn0.c.INSTANCE : cVar);
    }
}
