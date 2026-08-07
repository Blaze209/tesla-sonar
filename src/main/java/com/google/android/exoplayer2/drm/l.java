package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l implements n {
    @Override // com.google.android.exoplayer2.drm.n
    public Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public n.d b() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public int g() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.n
    public fr.b h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void j(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.n
    public n.a k(byte[] bArr, List<h.b> list, int i11, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void l(n.b bVar) {
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void release() {
    }
}
