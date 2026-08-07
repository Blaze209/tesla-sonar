package b8;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f16858m = q0.f110459f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f16860o;

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        return super.a() && this.f16859n == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        if (i11 == 0) {
            return;
        }
        int iMin = Math.min(i11, this.f16857l);
        this.f16860o += (long) (iMin / this.f9037b.f9030d);
        this.f16857l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f16857l > 0) {
            return;
        }
        int i12 = i11 - iMin;
        int length = (this.f16859n + i12) - this.f16858m.length;
        ByteBuffer byteBufferK = k(length);
        int iR = q0.r(length, 0, this.f16859n);
        byteBufferK.put(this.f16858m, 0, iR);
        int iR2 = q0.r(length - iR, 0, i12);
        byteBuffer.limit(byteBuffer.position() + iR2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i13 = i12 - iR2;
        int i14 = this.f16859n - iR;
        this.f16859n = i14;
        byte[] bArr = this.f16858m;
        System.arraycopy(bArr, iR, bArr, 0, i14);
        byteBuffer.get(this.f16858m, this.f16859n, i13);
        this.f16859n += i13;
        byteBufferK.flip();
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        int i11;
        if (super.a() && (i11 = this.f16859n) > 0) {
            k(i11).put(this.f16858m, 0, this.f16859n).flip();
            this.f16859n = 0;
        }
        return super.d();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (!q0.R0(aVar.f9029c)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f16856k = true;
        return (this.f16854i == 0 && this.f16855j == 0) ? AudioProcessor.a.f9026e : aVar;
    }

    @Override // androidx.media3.common.audio.b
    protected void h() {
        if (this.f16856k) {
            this.f16856k = false;
            int i11 = this.f16855j;
            int i12 = this.f9037b.f9030d;
            this.f16858m = new byte[i11 * i12];
            this.f16857l = this.f16854i * i12;
        }
        this.f16859n = 0;
    }

    @Override // androidx.media3.common.audio.b
    protected void i() {
        if (this.f16856k) {
            int i11 = this.f16859n;
            if (i11 > 0) {
                this.f16860o += (long) (i11 / this.f9037b.f9030d);
            }
            this.f16859n = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    protected void j() {
        this.f16858m = q0.f110459f;
    }

    public long l() {
        return this.f16860o;
    }

    public void m() {
        this.f16860o = 0L;
    }

    public void n(int i11, int i12) {
        this.f16854i = i11;
        this.f16855j = i12;
    }
}
