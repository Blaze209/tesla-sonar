package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
public class n implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39642c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f39643d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f39644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f39645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f39646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f39647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m f39649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f39650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f39651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f39652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f39653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f39654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f39655p;

    public n() {
        AudioProcessor.a aVar = AudioProcessor.a.f39416e;
        this.f39644e = aVar;
        this.f39645f = aVar;
        this.f39646g = aVar;
        this.f39647h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f39415a;
        this.f39650k = byteBuffer;
        this.f39651l = byteBuffer.asShortBuffer();
        this.f39652m = byteBuffer;
        this.f39641b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean a() {
        if (!this.f39655p) {
            return false;
        }
        m mVar = this.f39649j;
        return mVar == null || mVar.k() == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            m mVar = (m) ts.a.e(this.f39649j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f39653n += (long) iRemaining;
            mVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void c() {
        m mVar = this.f39649j;
        if (mVar != null) {
            mVar.s();
        }
        this.f39655p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer d() {
        int iK;
        m mVar = this.f39649j;
        if (mVar != null && (iK = mVar.k()) > 0) {
            if (this.f39650k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f39650k = byteBufferOrder;
                this.f39651l = byteBufferOrder.asShortBuffer();
            } else {
                this.f39650k.clear();
                this.f39651l.clear();
            }
            mVar.j(this.f39651l);
            this.f39654o += (long) iK;
            this.f39650k.limit(iK);
            this.f39652m = this.f39650k;
        }
        ByteBuffer byteBuffer = this.f39652m;
        this.f39652m = AudioProcessor.f39415a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f39419c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i11 = this.f39641b;
        if (i11 == -1) {
            i11 = aVar.f39417a;
        }
        this.f39644e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i11, aVar.f39418b, 2);
        this.f39645f = aVar2;
        this.f39648i = true;
        return aVar2;
    }

    public final long f(long j11) {
        if (this.f39654o < 1024) {
            return (long) (((double) this.f39642c) * j11);
        }
        long jL = this.f39653n - ((long) ((m) ts.a.e(this.f39649j)).l());
        int i11 = this.f39647h.f39417a;
        int i12 = this.f39646g.f39417a;
        return i11 == i12 ? p0.M0(j11, jL, this.f39654o) : p0.M0(j11, jL * ((long) i11), this.f39654o * ((long) i12));
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f39644e;
            this.f39646g = aVar;
            AudioProcessor.a aVar2 = this.f39645f;
            this.f39647h = aVar2;
            if (this.f39648i) {
                this.f39649j = new m(aVar.f39417a, aVar.f39418b, this.f39642c, this.f39643d, aVar2.f39417a);
            } else {
                m mVar = this.f39649j;
                if (mVar != null) {
                    mVar.i();
                }
            }
        }
        this.f39652m = AudioProcessor.f39415a;
        this.f39653n = 0L;
        this.f39654o = 0L;
        this.f39655p = false;
    }

    public final void g(float f11) {
        if (this.f39643d != f11) {
            this.f39643d = f11;
            this.f39648i = true;
        }
    }

    public final void h(float f11) {
        if (this.f39642c != f11) {
            this.f39642c = f11;
            this.f39648i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f39645f.f39417a != -1) {
            return Math.abs(this.f39642c - 1.0f) >= 1.0E-4f || Math.abs(this.f39643d - 1.0f) >= 1.0E-4f || this.f39645f.f39417a != this.f39644e.f39417a;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f39642c = 1.0f;
        this.f39643d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f39416e;
        this.f39644e = aVar;
        this.f39645f = aVar;
        this.f39646g = aVar;
        this.f39647h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f39415a;
        this.f39650k = byteBuffer;
        this.f39651l = byteBuffer.asShortBuffer();
        this.f39652m = byteBuffer;
        this.f39641b = -1;
        this.f39648i = false;
        this.f39649j = null;
        this.f39653n = 0L;
        this.f39654o = 0L;
        this.f39655p = false;
    }
}
