package com.google.android.exoplayer2.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39803a;

        public DrmSessionException(Throwable th2, int i11) {
            super(th2);
            this.f39803a = i11;
        }
    }

    static void h(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.i(null);
        }
        if (drmSession != null) {
            drmSession.g(null);
        }
    }

    DrmSessionException a();

    default boolean b() {
        return false;
    }

    fr.b c();

    Map<String, String> d();

    UUID e();

    boolean f(String str);

    void g(i.a aVar);

    int getState();

    void i(i.a aVar);
}
