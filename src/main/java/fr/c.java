package fr;

import android.media.MediaCodec;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f66331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f66333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f66334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f66337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f66338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f66339j;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f66340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f66341b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i11, int i12) {
            this.f66341b.set(i11, i12);
            this.f66340a.setPattern(this.f66341b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f66340a = cryptoInfo;
            this.f66341b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f66338i = cryptoInfo;
        this.f66339j = p0.f115040a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f66338i;
    }

    public void b(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f66333d == null) {
            int[] iArr = new int[1];
            this.f66333d = iArr;
            this.f66338i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f66333d;
        iArr2[0] = iArr2[0] + i11;
    }

    public void c(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        this.f66335f = i11;
        this.f66333d = iArr;
        this.f66334e = iArr2;
        this.f66331b = bArr;
        this.f66330a = bArr2;
        this.f66332c = i12;
        this.f66336g = i13;
        this.f66337h = i14;
        MediaCodec.CryptoInfo cryptoInfo = this.f66338i;
        cryptoInfo.numSubSamples = i11;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i12;
        if (p0.f115040a >= 24) {
            ((b) ts.a.e(this.f66339j)).b(i13, i14);
        }
    }
}
