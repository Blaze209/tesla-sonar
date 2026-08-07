package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f10577a;

    public r(MediaCodec mediaCodec) {
        this.f10577a = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void g(int i11, int i12, y7.c cVar, long j11, int i13) {
        this.f10577a.queueSecureInputBuffer(i11, i12, cVar.a(), j11, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f10577a.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void setParameters(Bundle bundle) {
        this.f10577a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
    }
}
