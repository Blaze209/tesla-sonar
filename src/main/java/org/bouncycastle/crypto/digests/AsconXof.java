package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes9.dex */
public class AsconXof implements Xof {
    private final int ASCON_PB_ROUNDS;
    private final String algorithmName;
    AsconParameters asconParameters;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long f98599x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f98600x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f98601x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private long f98602x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private long f98603x4;
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private final int CRYPTO_BYTES = 32;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.digests.AsconXof$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters = iArr;
            try {
                iArr[AsconParameters.AsconXof.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters[AsconParameters.AsconXofA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AsconParameters {
        AsconXof,
        AsconXofA
    }

    public AsconXof(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters[asconParameters.ordinal()];
        if (i11 == 1) {
            this.ASCON_PB_ROUNDS = 12;
            str = "Ascon-Xof";
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException("Invalid parameter settings for Ascon Hash");
            }
            this.ASCON_PB_ROUNDS = 8;
            str = "Ascon-XofA";
        }
        this.algorithmName = str;
        reset();
    }

    private long LOADBYTES(byte[] bArr, int i11, int i12) {
        long j11 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            j11 |= (((long) bArr[i13 + i11]) & 255) << ((7 - i13) << 3);
        }
        return j11;
    }

    private void P(int i11) {
        if (i11 == 12) {
            ROUND(240L);
            ROUND(225L);
            ROUND(210L);
            ROUND(195L);
        }
        if (i11 >= 8) {
            ROUND(180L);
            ROUND(165L);
        }
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long PAD(int i11) {
        return 128 << (56 - (i11 << 3));
    }

    private long ROR(long j11, int i11) {
        return (j11 << (64 - i11)) | (j11 >>> i11);
    }

    private void ROUND(long j11) {
        long j12 = this.f98599x0;
        long j13 = this.f98600x1;
        long j14 = this.f98601x2;
        long j15 = this.f98602x3;
        long j16 = this.f98603x4;
        long j17 = ((((j12 ^ j13) ^ j14) ^ j15) ^ j11) ^ ((((j12 ^ j14) ^ j16) ^ j11) & j13);
        long j18 = ((((j12 ^ j14) ^ j15) ^ j16) ^ j11) ^ (((j13 ^ j14) ^ j11) & (j13 ^ j15));
        long j19 = (((j13 ^ j14) ^ j16) ^ j11) ^ (j15 & j16);
        long j21 = ((j14 ^ (j12 ^ j13)) ^ j11) ^ ((~j12) & (j15 ^ j16));
        long j22 = ((j12 ^ j16) & j13) ^ ((j13 ^ j15) ^ j16);
        this.f98599x0 = ROR(j17, 28) ^ (ROR(j17, 19) ^ j17);
        this.f98600x1 = (ROR(j18, 39) ^ j18) ^ ROR(j18, 61);
        this.f98601x2 = ~(ROR(j19, 6) ^ (ROR(j19, 1) ^ j19));
        this.f98602x3 = (ROR(j21, 10) ^ j21) ^ ROR(j21, 17);
        this.f98603x4 = ROR(j22, 41) ^ (ROR(j22, 7) ^ j22);
    }

    private void STOREBYTES(byte[] bArr, int i11, long j11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i13 + i11] = (byte) (j11 >>> ((7 - i13) << 3));
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        return doOutput(bArr, i11, getDigestSize());
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i11, int i12) {
        long j11;
        if (i11 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int size = this.buffer.size();
        int i13 = 0;
        while (true) {
            j11 = this.f98599x0;
            if (size < 8) {
                break;
            }
            this.f98599x0 = j11 ^ LOADBYTES(byteArray, i13, 8);
            P(this.ASCON_PB_ROUNDS);
            i13 += 8;
            size -= 8;
        }
        long jLOADBYTES = j11 ^ LOADBYTES(byteArray, i13, size);
        this.f98599x0 = jLOADBYTES;
        this.f98599x0 = PAD(size) ^ jLOADBYTES;
        P(12);
        int i14 = i11;
        int i15 = 32;
        while (i15 > 8) {
            byte[] bArr2 = bArr;
            STOREBYTES(bArr2, i14, this.f98599x0, 8);
            P(this.ASCON_PB_ROUNDS);
            i14 += 8;
            i15 -= 8;
            bArr = bArr2;
        }
        STOREBYTES(bArr, i14, this.f98599x0, i15);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        long j11;
        this.buffer.reset();
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters[this.asconParameters.ordinal()];
        if (i11 == 1) {
            this.f98599x0 = -5368810569253202922L;
            this.f98600x1 = 3121280575360345120L;
            this.f98601x2 = 7395939140700676632L;
            this.f98602x3 = 6533890155656471820L;
            j11 = 5710016986865767350L;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f98599x0 = 4940560291654768690L;
            this.f98600x1 = -3635129828240960206L;
            this.f98601x2 = -597534922722107095L;
            this.f98602x3 = 2623493988082852443L;
            j11 = -6283826724160825537L;
        }
        this.f98603x4 = j11;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b11) {
        this.buffer.write(b11);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i11, int i12) {
        return doOutput(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i11, i12);
    }
}
