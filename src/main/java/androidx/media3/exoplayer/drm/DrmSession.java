package androidx.media3.exoplayer.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9783a;

        public DrmSessionException(Throwable th2, int i11) {
            super(th2);
            this.f9783a = i11;
        }
    }

    static void g(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.i(null);
        }
        if (drmSession != null) {
            drmSession.h(null);
        }
    }

    DrmSessionException a();

    default boolean b() {
        return false;
    }

    y7.b c();

    Map<String, String> d();

    UUID e();

    boolean f(String str);

    int getState();

    void h(h.a aVar);

    void i(h.a aVar);
}
