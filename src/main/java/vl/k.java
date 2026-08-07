package vl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lvl/k;", "", "Lmm/d;", "platformBitmapFactory", "", "maxFpsRender", "bufferLengthMilliseconds", "<init>", "(Lmm/d;II)V", "", "cacheKey", "Lrl/c;", "bitmapFrameRenderer", "Lql/d;", "animationInformation", "Lvl/j;", "b", "(Ljava/lang/String;Lrl/c;Lql/d;)Lvl/j;", "a", "Lmm/d;", "I", "c", DateTokenConverter.CONVERTER_KEY, "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f119564e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mm.d platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxFpsRender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int bufferLengthMilliseconds;

    /* JADX INFO: renamed from: vl.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lvl/k$a;", "", "<init>", "()V", "", "cacheKey", "Lvl/j;", "frameLoader", "Ljn0/h0;", "b", "(Ljava/lang/String;Lvl/j;)V", "Ljava/util/Date;", "until", "a", "(Ljava/util/Date;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Lvl/m;", "UNUSED_FRAME_LOADERS", "Ljava/util/concurrent/ConcurrentHashMap;", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Date until) {
            s.k(until, "until");
            synchronized (k.f119564e) {
                try {
                    ConcurrentHashMap concurrentHashMap = k.f119564e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((m) entry.getValue()).getInsertedTime().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((m) entry2.getValue()).getFrameLoader().clear();
                        k.f119564e.remove(entry2.getKey());
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b(String cacheKey, j frameLoader) {
            s.k(cacheKey, "cacheKey");
            s.k(frameLoader, "frameLoader");
            k.f119564e.put(cacheKey, new m(frameLoader, new Date()));
        }

        private Companion() {
        }
    }

    public k(mm.d platformBitmapFactory, int i11, int i12) {
        s.k(platformBitmapFactory, "platformBitmapFactory");
        this.platformBitmapFactory = platformBitmapFactory;
        this.maxFpsRender = i11;
        this.bufferLengthMilliseconds = i12;
    }

    public final j b(String cacheKey, rl.c bitmapFrameRenderer, ql.d animationInformation) {
        s.k(cacheKey, "cacheKey");
        s.k(bitmapFrameRenderer, "bitmapFrameRenderer");
        s.k(animationInformation, "animationInformation");
        ConcurrentHashMap<String, m> concurrentHashMap = f119564e;
        synchronized (concurrentHashMap) {
            m mVar = concurrentHashMap.get(cacheKey);
            if (mVar == null) {
                h0 h0Var = h0.f84049a;
                return new g(this.platformBitmapFactory, bitmapFrameRenderer, new ul.c(this.maxFpsRender), animationInformation, this.bufferLengthMilliseconds);
            }
            concurrentHashMap.remove(cacheKey);
            return mVar.getFrameLoader();
        }
    }
}
