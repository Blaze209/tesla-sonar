package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f98710iv;
    private byte[] shared;

    protected BaseKDFBytesGenerator(int i11, Digest digest) {
        this.counterStart = i11;
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13 = i12;
        int i14 = i11;
        if (bArr.length - i13 < i14) {
            throw new OutputLengthException("output buffer too small");
        }
        long j11 = i13;
        int digestSize = this.digest.getDigestSize();
        if (j11 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j12 = digestSize;
        int i15 = (int) (((j11 + j12) - 1) / j12);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Pack.intToBigEndian(this.counterStart, bArr3, 0);
        int i16 = this.counterStart & (-256);
        for (int i17 = 0; i17 < i15; i17++) {
            Digest digest = this.digest;
            byte[] bArr4 = this.shared;
            digest.update(bArr4, 0, bArr4.length);
            this.digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.f98710iv;
            if (bArr5 != null) {
                this.digest.update(bArr5, 0, bArr5.length);
            }
            this.digest.doFinal(bArr2, 0);
            if (i13 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i14, digestSize);
                i14 += digestSize;
                i13 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i14, i13);
            }
            byte b11 = (byte) (bArr3[3] + 1);
            bArr3[3] = b11;
            if (b11 == 0) {
                i16 += 256;
                Pack.intToBigEndian(i16, bArr3, 0);
            }
        }
        this.digest.reset();
        return (int) j11;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f98710iv = kDFParameters.getIV();
        } else {
            if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                throw new IllegalArgumentException("KDF parameters required for generator");
            }
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.f98710iv = null;
        }
    }
}
