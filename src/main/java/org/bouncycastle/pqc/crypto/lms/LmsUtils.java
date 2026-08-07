package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes10.dex */
class LmsUtils {
    LmsUtils() {
    }

    static void byteArray(byte[] bArr, int i11, int i12, Digest digest) {
        digest.update(bArr, i11, i12);
    }

    static int calculateStrength(LMSParameters lMSParameters) {
        if (lMSParameters == null) {
            throw new NullPointerException("lmsParameters cannot be null");
        }
        LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        return (1 << lMSigParam.getH()) * lMSigParam.getM();
    }

    static void u16str(short s11, Digest digest) {
        digest.update((byte) (s11 >>> 8));
        digest.update((byte) s11);
    }

    static void u32str(int i11, Digest digest) {
        digest.update((byte) (i11 >>> 24));
        digest.update((byte) (i11 >>> 16));
        digest.update((byte) (i11 >>> 8));
        digest.update((byte) i11);
    }

    static void byteArray(byte[] bArr, Digest digest) {
        digest.update(bArr, 0, bArr.length);
    }
}
