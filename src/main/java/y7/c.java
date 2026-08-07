package y7;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f125181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f125182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f125184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f125185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f125186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f125187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f125188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f125189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f125190j;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f125191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f125192b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i11, int i12) {
            this.f125192b.set(i11, i12);
            this.f125191a.setPattern(this.f125192b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f125191a = cryptoInfo;
            this.f125192b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f125189i = cryptoInfo;
        this.f125190j = new b(cryptoInfo);
    }

    public MediaCodec.CryptoInfo a() {
        return this.f125189i;
    }

    public void b(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f125184d == null) {
            int[] iArr = new int[1];
            this.f125184d = iArr;
            this.f125189i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f125184d;
        iArr2[0] = iArr2[0] + i11;
    }

    public void c(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        this.f125186f = i11;
        this.f125184d = iArr;
        this.f125185e = iArr2;
        this.f125182b = bArr;
        this.f125181a = bArr2;
        this.f125183c = i12;
        this.f125187g = i13;
        this.f125188h = i14;
        MediaCodec.CryptoInfo cryptoInfo = this.f125189i;
        cryptoInfo.numSubSamples = i11;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i12;
        ((b) s7.a.f(this.f125190j)).b(i13, i14);
    }
}
