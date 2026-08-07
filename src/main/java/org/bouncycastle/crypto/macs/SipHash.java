package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f98740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f98741d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected long f98742k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    protected long f98743k1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f98744m;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected long f98745v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    protected long f98746v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    protected long f98747v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    protected long f98748v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f98744m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f98740c = 2;
        this.f98741d = 4;
    }

    protected static long rotateLeft(long j11, int i11) {
        return (j11 >>> (-i11)) | (j11 << i11);
    }

    protected void applySipRounds(int i11) {
        long jRotateLeft = this.f98745v0;
        long jRotateLeft2 = this.f98746v1;
        long jRotateLeft3 = this.f98747v2;
        long jRotateLeft4 = this.f98748v3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jRotateLeft + jRotateLeft2;
            long j12 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j11;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j12;
            long j13 = j12 + jRotateLeft5;
            jRotateLeft = rotateLeft(j11, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j13;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j13, 32);
        }
        this.f98745v0 = jRotateLeft;
        this.f98746v1 = jRotateLeft2;
        this.f98747v2 = jRotateLeft3;
        this.f98748v3 = jRotateLeft4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        Pack.longToLittleEndian(doFinal(), bArr, i11);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f98740c + "-" + this.f98741d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f98742k0 = Pack.littleEndianToLong(key, 0);
        this.f98743k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    protected void processMessageWord() {
        this.wordCount++;
        this.f98748v3 ^= this.f98744m;
        applySipRounds(this.f98740c);
        this.f98745v0 ^= this.f98744m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j11 = this.f98742k0;
        this.f98745v0 = 8317987319222330741L ^ j11;
        long j12 = this.f98743k1;
        this.f98746v1 = 7237128888997146477L ^ j12;
        this.f98747v2 = j11 ^ 7816392313619706465L;
        this.f98748v3 = 8387220255154660723L ^ j12;
        this.f98744m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b11) {
        this.f98744m = (this.f98744m >>> 8) | ((((long) b11) & 255) << 56);
        int i11 = this.wordPos + 1;
        this.wordPos = i11;
        if (i11 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i11, int i12) {
        this.f98744m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f98740c = i11;
        this.f98741d = i12;
    }

    public long doFinal() {
        long j11 = this.f98744m;
        int i11 = this.wordPos;
        this.f98744m = ((j11 >>> ((7 - i11) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i11)) & 255) << 56);
        processMessageWord();
        this.f98747v2 ^= 255;
        applySipRounds(this.f98741d);
        long j12 = ((this.f98745v0 ^ this.f98746v1) ^ this.f98747v2) ^ this.f98748v3;
        reset();
        return j12;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = i12 & (-8);
        int i14 = this.wordPos;
        char c11 = '8';
        long j11 = 255;
        int i15 = 0;
        if (i14 == 0) {
            while (i15 < i13) {
                this.f98744m = Pack.littleEndianToLong(bArr, i11 + i15);
                processMessageWord();
                i15 += 8;
            }
            while (i15 < i12) {
                long j12 = this.f98744m >>> 8;
                this.f98744m = j12;
                this.f98744m = j12 | ((((long) bArr[i11 + i15]) & 255) << 56);
                i15++;
            }
            this.wordPos = i12 - i13;
            return;
        }
        int i16 = i14 << 3;
        int i17 = 0;
        while (i17 < i13) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i11 + i17);
            this.f98744m = (this.f98744m >>> (-i16)) | (jLittleEndianToLong << i16);
            processMessageWord();
            this.f98744m = jLittleEndianToLong;
            i17 += 8;
            c11 = c11;
            j11 = j11;
        }
        char c12 = c11;
        long j13 = j11;
        while (i17 < i12) {
            long j14 = this.f98744m >>> 8;
            this.f98744m = j14;
            this.f98744m = j14 | ((((long) bArr[i11 + i17]) & j13) << c12);
            int i18 = this.wordPos + 1;
            this.wordPos = i18;
            if (i18 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i17++;
        }
    }
}
