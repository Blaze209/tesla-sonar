package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements m {
    @Override // androidx.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d b() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public int g() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public y7.b h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void j(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.a k(byte[] bArr, List<p7.n.b> list, int i11, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void m(m.b bVar) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void release() {
    }
}
