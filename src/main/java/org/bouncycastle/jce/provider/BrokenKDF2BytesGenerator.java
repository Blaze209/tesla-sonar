package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KDFParameters;

/* JADX INFO: loaded from: classes9.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f98877iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) {
        if (bArr.length - i12 < i11) {
            throw new OutputLengthException("output buffer too small");
        }
        long j11 = ((long) i12) * 8;
        if (j11 > ((long) this.digest.getDigestSize()) * 17179869184L) {
            throw new IllegalArgumentException("Output length too large");
        }
        int digestSize = (int) (j11 / ((long) this.digest.getDigestSize()));
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        for (int i13 = 1; i13 <= digestSize; i13++) {
            Digest digest = this.digest;
            byte[] bArr3 = this.shared;
            digest.update(bArr3, 0, bArr3.length);
            this.digest.update((byte) (i13 & 255));
            this.digest.update((byte) ((i13 >> 8) & 255));
            this.digest.update((byte) ((i13 >> 16) & 255));
            this.digest.update((byte) ((i13 >> 24) & 255));
            Digest digest2 = this.digest;
            byte[] bArr4 = this.f98877iv;
            digest2.update(bArr4, 0, bArr4.length);
            this.digest.doFinal(bArr2, 0);
            int i14 = i12 - i11;
            if (i14 > digestSize2) {
                System.arraycopy(bArr2, 0, bArr, i11, digestSize2);
                i11 += digestSize2;
            } else {
                System.arraycopy(bArr2, 0, bArr, i11, i14);
            }
        }
        this.digest.reset();
        return i12;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.shared = kDFParameters.getSharedSecret();
        this.f98877iv = kDFParameters.getIV();
    }
}
