package fr;

import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f66349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f66350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f66351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f66352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f66353l;

    private void b(long j11, int i11) {
        this.f66352k += j11;
        this.f66353l += i11;
    }

    public void a(long j11) {
        b(j11, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return p0.B("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f66342a), Integer.valueOf(this.f66343b), Integer.valueOf(this.f66344c), Integer.valueOf(this.f66345d), Integer.valueOf(this.f66346e), Integer.valueOf(this.f66347f), Integer.valueOf(this.f66348g), Integer.valueOf(this.f66349h), Integer.valueOf(this.f66350i), Integer.valueOf(this.f66351j), Long.valueOf(this.f66352k), Integer.valueOf(this.f66353l));
    }
}
