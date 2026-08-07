package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
class HKDF {
    private static final String versionLabel = "HPKE-v1";
    private final int hashLength;
    private final HKDFBytesGenerator kdf;

    HKDF(short s11) {
        Digest sHA256Digest;
        if (s11 == 1) {
            sHA256Digest = new SHA256Digest();
        } else if (s11 == 2) {
            sHA256Digest = new SHA384Digest();
        } else {
            if (s11 != 3) {
                throw new IllegalArgumentException("invalid kdf id");
            }
            sHA256Digest = new SHA512Digest();
        }
        this.kdf = new HKDFBytesGenerator(sHA256Digest);
        this.hashLength = sHA256Digest.getDigestSize();
    }

    protected byte[] Expand(byte[] bArr, byte[] bArr2, int i11) {
        if (i11 > 65536) {
            throw new IllegalArgumentException("Expand length cannot be larger than 2^16");
        }
        this.kdf.init(HKDFParameters.skipExtractParameters(bArr, bArr2));
        byte[] bArr3 = new byte[i11];
        this.kdf.generateBytes(bArr3, 0, i11);
        return bArr3;
    }

    protected byte[] Extract(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = new byte[this.hashLength];
        }
        return this.kdf.extractPRK(bArr, bArr2);
    }

    protected byte[] LabeledExpand(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i11) {
        if (i11 > 65536) {
            throw new IllegalArgumentException("Expand length cannot be larger than 2^16");
        }
        this.kdf.init(HKDFParameters.skipExtractParameters(bArr, Arrays.concatenate(Arrays.concatenate(Pack.shortToBigEndian((short) i11), versionLabel.getBytes(), bArr2, str.getBytes()), bArr3)));
        byte[] bArr4 = new byte[i11];
        this.kdf.generateBytes(bArr4, 0, i11);
        return bArr4;
    }

    protected byte[] LabeledExtract(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        if (bArr == null) {
            bArr = new byte[this.hashLength];
        }
        return this.kdf.extractPRK(bArr, Arrays.concatenate(versionLabel.getBytes(), bArr2, str.getBytes(), bArr3));
    }

    int getHashSize() {
        return this.hashLength;
    }
}
