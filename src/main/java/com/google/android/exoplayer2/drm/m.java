package com.google.android.exoplayer2.drm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f39837a;

    public m(DrmSession.DrmSessionException drmSessionException) {
        this.f39837a = (DrmSession.DrmSessionException) ts.a.e(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public DrmSession.DrmSessionException a() {
        return this.f39837a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public fr.b c() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> d() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID e() {
        return br.d.f17902a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean f(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void g(i.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void i(i.a aVar) {
    }
}
