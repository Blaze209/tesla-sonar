package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class q extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f39661m = p0.f115045f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f39663o;

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return super.a() && this.f39662n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        if (i11 == 0) {
            return;
        }
        int iMin = Math.min(i11, this.f39660l);
        this.f39663o += (long) (iMin / this.f39585b.f39420d);
        this.f39660l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f39660l > 0) {
            return;
        }
        int i12 = i11 - iMin;
        int length = (this.f39662n + i12) - this.f39661m.length;
        ByteBuffer byteBufferK = k(length);
        int iQ = p0.q(length, 0, this.f39662n);
        byteBufferK.put(this.f39661m, 0, iQ);
        int iQ2 = p0.q(length - iQ, 0, i12);
        byteBuffer.limit(byteBuffer.position() + iQ2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i13 = i12 - iQ2;
        int i14 = this.f39662n - iQ;
        this.f39662n = i14;
        byte[] bArr = this.f39661m;
        System.arraycopy(bArr, iQ, bArr, 0, i14);
        byteBuffer.get(this.f39661m, this.f39662n, i13);
        this.f39662n += i13;
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer d() {
        int i11;
        if (super.a() && (i11 = this.f39662n) > 0) {
            k(i11).put(this.f39661m, 0, this.f39662n).flip();
            this.f39662n = 0;
        }
        return super.d();
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f39419c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f39659k = true;
        return (this.f39657i == 0 && this.f39658j == 0) ? AudioProcessor.a.f39416e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void h() {
        if (this.f39659k) {
            this.f39659k = false;
            int i11 = this.f39658j;
            int i12 = this.f39585b.f39420d;
            this.f39661m = new byte[i11 * i12];
            this.f39660l = this.f39657i * i12;
        }
        this.f39662n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void i() {
        if (this.f39659k) {
            int i11 = this.f39662n;
            if (i11 > 0) {
                this.f39663o += (long) (i11 / this.f39585b.f39420d);
            }
            this.f39662n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void j() {
        this.f39661m = p0.f115045f;
    }

    public long l() {
        return this.f39663o;
    }

    public void m() {
        this.f39663o = 0L;
    }

    public void n(int i11, int i12) {
        this.f39657i = i11;
        this.f39658j = i12;
    }
}
