package z7;

import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f127061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f127062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f127063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f127064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f127065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f127066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f127067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f127068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f127069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f127070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f127071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f127072l;

    private void b(long j11, int i11) {
        this.f127071k += j11;
        this.f127072l += i11;
    }

    public void a(long j11) {
        b(j11, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return q0.J("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f127061a), Integer.valueOf(this.f127062b), Integer.valueOf(this.f127063c), Integer.valueOf(this.f127064d), Integer.valueOf(this.f127065e), Integer.valueOf(this.f127066f), Integer.valueOf(this.f127067g), Integer.valueOf(this.f127068h), Integer.valueOf(this.f127069i), Integer.valueOf(this.f127070j), Long.valueOf(this.f127071k), Integer.valueOf(this.f127072l));
    }
}
