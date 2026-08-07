package kotlinx.coroutines.internal;

import jn0.s;
import jn0.t;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
        Object objB;
        try {
            s.Companion companion = s.INSTANCE;
            objB = s.b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            s.Companion companion2 = s.INSTANCE;
            objB = s.b(t.a(th2));
        }
        s.h(objB);
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
