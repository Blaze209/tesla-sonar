package vl;

import android.os.Handler;
import android.os.HandlerThread;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&¨\u0006)"}, d2 = {"Lvl/e;", "", "<init>", "()V", "", "j", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Lvl/i;", "animation", "", "delta", "Ljn0/h0;", "k", "(Lvl/i;I)V", "Lvl/l;", "frameResult", "h", "(Lvl/i;Lvl/l;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "successCounter", "c", "failuresCounter", DateTokenConverter.CONVERTER_KEY, "criticalCounter", "Ljava/util/concurrent/ConcurrentHashMap;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "runningAnimations", "Landroid/os/Handler;", "f", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "g", "Ljava/lang/Runnable;", "calculatePerformance", "clearUnusedFrameLoaders", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f119534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicInteger successCounter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final AtomicInteger failuresCounter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final AtomicInteger criticalCounter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<i, Integer> runningAnimations;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final Lazy handler;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final Runnable calculatePerformance;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final Runnable clearUnusedFrameLoaders;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119542a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.NEAREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f119542a = iArr;
        }
    }

    static {
        e eVar = new e();
        f119534a = eVar;
        successCounter = new AtomicInteger(0);
        failuresCounter = new AtomicInteger(0);
        criticalCounter = new AtomicInteger(0);
        runningAnimations = new ConcurrentHashMap<>();
        handler = jn0.m.b(new wn0.a() { // from class: vl.b
            @Override // wn0.a
            public final Object invoke() {
                return e.g();
            }
        });
        Runnable runnable = new Runnable() { // from class: vl.c
            @Override // java.lang.Runnable
            public final void run() {
                e.d();
            }
        };
        calculatePerformance = runnable;
        Runnable runnable2 = new Runnable() { // from class: vl.d
            @Override // java.lang.Runnable
            public final void run() {
                e.e();
            }
        };
        clearUnusedFrameLoaders = runnable2;
        eVar.f().post(runnable);
        eVar.f().post(runnable2);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        float andSet = successCounter.getAndSet(0);
        float andSet2 = failuresCounter.getAndSet(0);
        float andSet3 = criticalCounter.getAndSet(0);
        float f11 = andSet + andSet2 + andSet3;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            float f12 = andSet / f11;
            float f13 = andSet3 / f11;
            if (andSet2 / f11 > 0.25f || f13 > 0.1f) {
                for (Map.Entry<i, Integer> entry : runningAnimations.entrySet()) {
                    f119534a.k(entry.getKey(), -entry.getValue().intValue());
                }
            } else if (f12 > 0.98f) {
                for (Map.Entry<i, Integer> entry2 : runningAnimations.entrySet()) {
                    f119534a.k(entry2.getKey(), entry2.getValue().intValue());
                }
            }
            runningAnimations.clear();
        }
        f119534a.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        k.INSTANCE.a(new Date(System.currentTimeMillis() - 10000));
        f119534a.i();
    }

    private final Handler f() {
        return (Handler) handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler g() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    private final boolean i() {
        return f().postDelayed(clearUnusedFrameLoaders, 10000L);
    }

    private final boolean j() {
        return f().postDelayed(calculatePerformance, 2000L);
    }

    private final void k(i animation, int delta) {
        int iN = n.n(animation.b() + delta, (int) n.e(animation.c() * 0.5f, 1.0f), animation.c());
        if (iN != animation.b()) {
            animation.a(iN);
        }
    }

    public final void h(i animation, l frameResult) {
        s.k(animation, "animation");
        s.k(frameResult, "frameResult");
        ConcurrentHashMap<i, Integer> concurrentHashMap = runningAnimations;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.c() * 0.2f)));
        }
        int i11 = a.f119542a[frameResult.getType().ordinal()];
        if (i11 == 1) {
            successCounter.incrementAndGet();
        } else if (i11 == 2) {
            failuresCounter.incrementAndGet();
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            criticalCounter.incrementAndGet();
        }
    }
}
