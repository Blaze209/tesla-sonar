package com.google.android.exoplayer2.audio;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.nio.ByteBuffer;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f39607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f39608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final short f39609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f39612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f39613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f39616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f39617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f39618t;

    public l() {
        this(150000L, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, (short) 1024);
    }

    private int l(long j11) {
        return (int) ((j11 * ((long) this.f39585b.f39417a)) / 1000000);
    }

    private int m(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f39609k);
        int i11 = this.f39610l;
        return ((iLimit / i11) * i11) + i11;
    }

    private int n(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f39609k) {
                int i11 = this.f39610l;
                return i11 * (iPosition / i11);
            }
        }
        return byteBuffer.limit();
    }

    private void p(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        k(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f39617s = true;
        }
    }

    private void q(byte[] bArr, int i11) {
        k(i11).put(bArr, 0, i11).flip();
        if (i11 > 0) {
            this.f39617s = true;
        }
    }

    private void r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        int iPosition = iN - byteBuffer.position();
        byte[] bArr = this.f39612n;
        int length = bArr.length;
        int i11 = this.f39615q;
        int i12 = length - i11;
        if (iN < iLimit && iPosition < i12) {
            q(bArr, i11);
            this.f39615q = 0;
            this.f39614p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i12);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f39612n, this.f39615q, iMin);
        int i13 = this.f39615q + iMin;
        this.f39615q = i13;
        byte[] bArr2 = this.f39612n;
        if (i13 == bArr2.length) {
            if (this.f39617s) {
                q(bArr2, this.f39616r);
                this.f39618t += (long) ((this.f39615q - (this.f39616r * 2)) / this.f39610l);
            } else {
                this.f39618t += (long) ((i13 - this.f39616r) / this.f39610l);
            }
            v(byteBuffer, this.f39612n, this.f39615q);
            this.f39615q = 0;
            this.f39614p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f39612n.length));
        int iM = m(byteBuffer);
        if (iM == byteBuffer.position()) {
            this.f39614p = 1;
        } else {
            byteBuffer.limit(iM);
            p(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void t(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        byteBuffer.limit(iN);
        this.f39618t += (long) (byteBuffer.remaining() / this.f39610l);
        v(byteBuffer, this.f39613o, this.f39616r);
        if (iN < iLimit) {
            q(this.f39613o, this.f39616r);
            this.f39614p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void v(ByteBuffer byteBuffer, byte[] bArr, int i11) {
        int iMin = Math.min(byteBuffer.remaining(), this.f39616r);
        int i12 = this.f39616r - iMin;
        System.arraycopy(bArr, i11 - i12, this.f39613o, 0, i12);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f39613o, i12, iMin);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i11 = this.f39614p;
            if (i11 == 0) {
                s(byteBuffer);
            } else if (i11 == 1) {
                r(byteBuffer);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                t(byteBuffer);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f39419c == 2) {
            return this.f39611m ? aVar : AudioProcessor.a.f39416e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void h() {
        if (this.f39611m) {
            this.f39610l = this.f39585b.f39420d;
            int iL = l(this.f39607i) * this.f39610l;
            if (this.f39612n.length != iL) {
                this.f39612n = new byte[iL];
            }
            int iL2 = l(this.f39608j) * this.f39610l;
            this.f39616r = iL2;
            if (this.f39613o.length != iL2) {
                this.f39613o = new byte[iL2];
            }
        }
        this.f39614p = 0;
        this.f39618t = 0L;
        this.f39615q = 0;
        this.f39617s = false;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void i() {
        int i11 = this.f39615q;
        if (i11 > 0) {
            q(this.f39612n, i11);
        }
        if (this.f39617s) {
            return;
        }
        this.f39618t += (long) (this.f39616r / this.f39610l);
    }

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f39611m;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void j() {
        this.f39611m = false;
        this.f39616r = 0;
        byte[] bArr = p0.f115045f;
        this.f39612n = bArr;
        this.f39613o = bArr;
    }

    public long o() {
        return this.f39618t;
    }

    public void u(boolean z11) {
        this.f39611m = z11;
    }

    public l(long j11, long j12, short s11) {
        ts.a.a(j12 <= j11);
        this.f39607i = j11;
        this.f39608j = j12;
        this.f39609k = s11;
        byte[] bArr = p0.f115045f;
        this.f39612n = bArr;
        this.f39613o = bArr;
    }
}
