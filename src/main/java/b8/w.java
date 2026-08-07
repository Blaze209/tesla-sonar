package b8;

import androidx.media3.common.audio.AudioProcessor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f16839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f16840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f16841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f16842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f16843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f16846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f16847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f16849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f16850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f16851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f16852v;

    public w() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private void A(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f16849s.length));
        int iR = r(byteBuffer);
        if (iR == byteBuffer.position()) {
            this.f16846p = 1;
        } else {
            byteBuffer.limit(Math.min(iR, byteBuffer.capacity()));
            w(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void B(byte[] bArr, int i11, int i12) {
        if (i12 >= 32767) {
            bArr[i11] = -1;
            bArr[i11 + 1] = 127;
        } else if (i12 <= -32768) {
            bArr[i11] = 0;
            bArr[i11 + 1] = -128;
        } else {
            bArr[i11] = (byte) (i12 & 255);
            bArr[i11 + 1] = (byte) (i12 >> 8);
        }
    }

    private void D(ByteBuffer byteBuffer) {
        int length;
        int i11;
        s7.a.h(this.f16850t < this.f16849s.length);
        int iLimit = byteBuffer.limit();
        int iS = s(byteBuffer);
        int iPosition = iS - byteBuffer.position();
        int i12 = this.f16850t;
        int i13 = this.f16851u;
        int i14 = i12 + i13;
        byte[] bArr = this.f16849s;
        if (i14 < bArr.length) {
            length = bArr.length - (i13 + i12);
            i11 = i12 + i13;
        } else {
            int length2 = i13 - (bArr.length - i12);
            length = i12 - length2;
            i11 = length2;
        }
        boolean z11 = iS < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f16849s, i11, iMin);
        int i15 = this.f16851u + iMin;
        this.f16851u = i15;
        s7.a.h(i15 <= this.f16849s.length);
        boolean z12 = z11 && iPosition < length;
        y(z12);
        if (z12) {
            this.f16846p = 0;
            this.f16848r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int E(byte b11, byte b12) {
        return (b11 << 8) | (b12 & 255);
    }

    private int l(float f11) {
        return m((int) f11);
    }

    private int m(int i11) {
        int i12 = this.f16844n;
        return (i11 / i12) * i12;
    }

    private int n(int i11, int i12) {
        int i13 = this.f16841k;
        return i13 + ((((100 - i13) * (i11 * 1000)) / i12) / 1000);
    }

    private int o(int i11, int i12) {
        return (((this.f16841k - 100) * ((i11 * 1000) / i12)) / 1000) + 100;
    }

    private int p(int i11) {
        int iQ = ((q(this.f16843m) - this.f16848r) * this.f16844n) - (this.f16849s.length / 2);
        s7.a.h(iQ >= 0);
        return l(Math.min((i11 * this.f16839i) + 0.5f, iQ));
    }

    private int q(long j11) {
        return (int) ((j11 * ((long) this.f9037b.f9027a)) / 1000000);
    }

    private int r(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (u(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i11 = this.f16844n;
                return ((iLimit / i11) * i11) + i11;
            }
        }
        return byteBuffer.position();
    }

    private int s(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (u(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i11 = this.f16844n;
                return i11 * (iPosition / i11);
            }
        }
        return byteBuffer.limit();
    }

    private boolean u(byte b11, byte b12) {
        return Math.abs(E(b11, b12)) > this.f16840j;
    }

    private void v(byte[] bArr, int i11, int i12) {
        if (i12 == 3) {
            return;
        }
        for (int i13 = 0; i13 < i11; i13 += 2) {
            B(bArr, i13, (E(bArr[i13 + 1], bArr[i13]) * (i12 == 0 ? o(i13, i11 - 1) : i12 == 2 ? n(i13, i11 - 1) : this.f16841k)) / 100);
        }
    }

    private void w(ByteBuffer byteBuffer) {
        k(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void x(byte[] bArr, int i11, int i12) {
        s7.a.b(i11 % this.f16844n == 0, "byteOutput size is not aligned to frame size " + i11);
        v(bArr, i11, i12);
        k(i11).put(bArr, 0, i11).flip();
    }

    private void y(boolean z11) {
        int length;
        int iP;
        int i11 = this.f16851u;
        byte[] bArr = this.f16849s;
        if (i11 == bArr.length || z11) {
            if (this.f16848r == 0) {
                if (z11) {
                    z(i11, 3);
                    length = i11;
                } else {
                    s7.a.h(i11 >= bArr.length / 2);
                    length = this.f16849s.length / 2;
                    z(length, 0);
                }
                iP = length;
            } else if (z11) {
                int length2 = i11 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iP2 = p(length2) + (this.f16849s.length / 2);
                z(iP2, 2);
                iP = iP2;
                length = length3;
            } else {
                length = i11 - (bArr.length / 2);
                iP = p(length);
                z(iP, 1);
            }
            s7.a.i(length % this.f16844n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            s7.a.h(i11 >= iP);
            this.f16851u -= length;
            int i12 = this.f16850t + length;
            this.f16850t = i12;
            this.f16850t = i12 % this.f16849s.length;
            int i13 = this.f16848r;
            int i14 = this.f16844n;
            this.f16848r = i13 + (iP / i14);
            this.f16847q += (long) ((length - iP) / i14);
        }
    }

    private void z(int i11, int i12) {
        if (i11 == 0) {
            return;
        }
        s7.a.a(this.f16851u >= i11);
        if (i12 == 2) {
            int i13 = this.f16850t;
            int i14 = this.f16851u;
            int i15 = i13 + i14;
            byte[] bArr = this.f16849s;
            if (i15 <= bArr.length) {
                System.arraycopy(bArr, (i13 + i14) - i11, this.f16852v, 0, i11);
            } else {
                int length = i14 - (bArr.length - i13);
                if (length >= i11) {
                    System.arraycopy(bArr, length - i11, this.f16852v, 0, i11);
                } else {
                    int i16 = i11 - length;
                    System.arraycopy(bArr, bArr.length - i16, this.f16852v, 0, i16);
                    System.arraycopy(this.f16849s, 0, this.f16852v, i16, length);
                }
            }
        } else {
            int i17 = this.f16850t;
            int i18 = i17 + i11;
            byte[] bArr2 = this.f16849s;
            if (i18 <= bArr2.length) {
                System.arraycopy(bArr2, i17, this.f16852v, 0, i11);
            } else {
                int length2 = bArr2.length - i17;
                System.arraycopy(bArr2, i17, this.f16852v, 0, length2);
                System.arraycopy(this.f16849s, 0, this.f16852v, length2, i11 - length2);
            }
        }
        s7.a.b(i11 % this.f16844n == 0, "sizeToOutput is not aligned to frame size: " + i11);
        s7.a.h(this.f16850t < this.f16849s.length);
        x(this.f16852v, i11, i12);
    }

    public void C(boolean z11) {
        this.f16845o = z11;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i11 = this.f16846p;
            if (i11 == 0) {
                A(byteBuffer);
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException();
                }
                D(byteBuffer);
            }
        }
    }

    @Override // androidx.media3.common.audio.b
    protected AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f9029c == 2) {
            return aVar.f9027a == -1 ? AudioProcessor.a.f9026e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.b
    public void h() {
        if (isActive()) {
            this.f16844n = this.f9037b.f9028b * 2;
            int iM = m(q(this.f16842l) / 2) * 2;
            if (this.f16849s.length != iM) {
                this.f16849s = new byte[iM];
                this.f16852v = new byte[iM];
            }
        }
        this.f16846p = 0;
        this.f16847q = 0L;
        this.f16848r = 0;
        this.f16850t = 0;
        this.f16851u = 0;
    }

    @Override // androidx.media3.common.audio.b
    public void i() {
        if (this.f16851u > 0) {
            y(true);
            this.f16848r = 0;
        }
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.f16845o;
    }

    @Override // androidx.media3.common.audio.b
    public void j() {
        this.f16845o = false;
        byte[] bArr = q0.f110459f;
        this.f16849s = bArr;
        this.f16852v = bArr;
    }

    public long t() {
        return this.f16847q;
    }

    public w(long j11, float f11, long j12, int i11, short s11) {
        boolean z11 = false;
        this.f16848r = 0;
        this.f16850t = 0;
        this.f16851u = 0;
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 1.0f) {
            z11 = true;
        }
        s7.a.a(z11);
        this.f16842l = j11;
        this.f16839i = f11;
        this.f16843m = j12;
        this.f16841k = i11;
        this.f16840j = s11;
        byte[] bArr = q0.f110459f;
        this.f16849s = bArr;
        this.f16852v = bArr;
    }
}
