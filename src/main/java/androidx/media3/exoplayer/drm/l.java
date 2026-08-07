package androidx.media3.exoplayer.drm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f9808a;

    public l(DrmSession.DrmSessionException drmSessionException) {
        this.f9808a = (DrmSession.DrmSessionException) s7.a.f(drmSessionException);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException a() {
        return this.f9808a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public y7.b c() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> d() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID e() {
        return p7.h.f101348a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean f(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void h(h.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void i(h.a aVar) {
    }
}
