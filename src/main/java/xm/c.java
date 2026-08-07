package xm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxm/c;", "", "<init>", "()V", "Lxm/b;", "a", "()Lxm/b;", "", "b", "I", "MAX_BITMAP_TOTAL_SIZE", "c", "maxBitmapCount", DateTokenConverter.CONVERTER_KEY, "Lxm/b;", "bitmapCounter", "()I", "maxSizeHardCap", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f123718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int MAX_BITMAP_TOTAL_SIZE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static int maxBitmapCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static volatile b bitmapCounter;

    static {
        c cVar = new c();
        f123718a = cVar;
        MAX_BITMAP_TOTAL_SIZE = cVar.b();
        maxBitmapCount = KyberEngine.KyberPolyBytes;
    }

    private c() {
    }

    public static final b a() {
        if (bitmapCounter == null) {
            synchronized (c.class) {
                try {
                    if (bitmapCounter == null) {
                        bitmapCounter = new b(maxBitmapCount, MAX_BITMAP_TOTAL_SIZE);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        b bVar = bitmapCounter;
        p013kotlin.jvm.internal.s.h(bVar);
        return bVar;
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
