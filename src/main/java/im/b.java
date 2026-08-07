package im;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import nk.g;
import nm.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pm.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lim/b;", "", "<init>", "()V", "Lmm/d;", "platformBitmapFactory", "Lpm/p;", "executorSupplier", "Lnm/n;", "Ljk/d;", "Lum/e;", "backingCache", "", "downscaleFrameToDrawableDimensions", "useBalancedAnimationStrategy", "", "animationFpsLimit", "bufferLengthMilliseconds", "Ljava/util/concurrent/ExecutorService;", "serialExecutorService", "Lim/a;", "a", "(Lmm/d;Lpm/p;Lnm/n;ZZIILjava/util/concurrent/ExecutorService;)Lim/a;", "b", "Z", "implLoaded", "c", "Lim/a;", "impl", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f78284a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean implLoaded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static a impl;

    private b() {
    }

    public static final a a(mm.d platformBitmapFactory, p executorSupplier, n<jk.d, um.e> backingCache, boolean downscaleFrameToDrawableDimensions, boolean useBalancedAnimationStrategy, int animationFpsLimit, int bufferLengthMilliseconds, ExecutorService serialExecutorService) {
        if (!implLoaded) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(mm.d.class, p.class, n.class, cls, cls, cls2, cls2, g.class).newInstance(platformBitmapFactory, executorSupplier, backingCache, Boolean.valueOf(downscaleFrameToDrawableDimensions), Boolean.valueOf(useBalancedAnimationStrategy), Integer.valueOf(animationFpsLimit), Integer.valueOf(bufferLengthMilliseconds), serialExecutorService);
                s.i(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                impl = (a) objNewInstance;
            } catch (Throwable unused) {
            }
            if (impl != null) {
                implLoaded = true;
            }
        }
        return impl;
    }
}
