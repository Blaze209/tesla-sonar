package org.spongycastle.pqc.crypto.newhope;

import android.R;
import org.bouncycastle.crypto.hpke.HPKE;
import org.spongycastle.crypto.digests.SHAKEDigest;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class Poly {
    Poly() {
    }

    static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i11 = 0; i11 < 1024; i11++) {
            sArr3[i11] = Reduce.barrett((short) (sArr[i11] + sArr2[i11]));
        }
    }

    static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = i11 * 7;
            int i13 = bArr[i12] & 255;
            byte b11 = bArr[i12 + 1];
            int i14 = bArr[i12 + 2] & 255;
            byte b12 = bArr[i12 + 3];
            int i15 = bArr[i12 + 4] & 255;
            byte b13 = bArr[i12 + 5];
            int i16 = bArr[i12 + 6] & 255;
            int i17 = i11 * 4;
            sArr[i17] = (short) (i13 | ((b11 & 63) << 8));
            sArr[i17 + 1] = (short) (((b11 & 255) >>> 6) | (i14 << 2) | ((b12 & 15) << 10));
            sArr[i17 + 2] = (short) (((b12 & 255) >>> 4) | (i15 << 4) | ((b13 & 3) << 12));
            sArr[i17 + 3] = (short) ((i16 << 6) | ((b13 & 255) >>> 2));
        }
    }

    static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    static void getNoise(short[] sArr, byte[] bArr, byte b11) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b11;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i11 = 0; i11 < 1024; i11++) {
            int iBigEndianToInt = Pack.bigEndianToInt(bArr3, i11 * 4);
            int i12 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                i12 += (iBigEndianToInt >> i13) & R.attr.cacheColorHint;
            }
            sArr[i11] = (short) (((((i12 >>> 24) + i12) & 255) + 12289) - (((i12 >>> 16) + (i12 >>> 8)) & 255));
        }
    }

    private static short normalize(short s11) {
        short sBarrett = Reduce.barrett(s11);
        int i11 = sBarrett - 12289;
        return (short) (((sBarrett ^ i11) & (i11 >> 31)) ^ i11);
    }

    static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i11 = 0; i11 < 1024; i11++) {
            sArr3[i11] = Reduce.montgomery((sArr[i11] & HPKE.aead_EXPORT_ONLY) * (65535 & Reduce.montgomery((sArr2[i11] & HPKE.aead_EXPORT_ONLY) * 3186)));
        }
    }

    static void toBytes(byte[] bArr, short[] sArr) {
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = i11 * 4;
            short sNormalize = normalize(sArr[i12]);
            short sNormalize2 = normalize(sArr[i12 + 1]);
            short sNormalize3 = normalize(sArr[i12 + 2]);
            short sNormalize4 = normalize(sArr[i12 + 3]);
            int i13 = i11 * 7;
            bArr[i13] = (byte) sNormalize;
            bArr[i13 + 1] = (byte) ((sNormalize >> 8) | (sNormalize2 << 6));
            bArr[i13 + 2] = (byte) (sNormalize2 >> 2);
            bArr[i13 + 3] = (byte) ((sNormalize2 >> 10) | (sNormalize3 << 4));
            bArr[i13 + 4] = (byte) (sNormalize3 >> 4);
            bArr[i13 + 5] = (byte) ((sNormalize3 >> 12) | (sNormalize4 << 2));
            bArr[i13 + 6] = (byte) (sNormalize4 >> 6);
        }
    }

    static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i11 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i12 = 0; i12 < 256; i12 += 2) {
                int i13 = ((bArr2[i12] & 255) | ((bArr2[i12 + 1] & 255) << 8)) & 16383;
                if (i13 < 12289) {
                    int i14 = i11 + 1;
                    sArr[i11] = (short) i13;
                    if (i14 == 1024) {
                        return;
                    } else {
                        i11 = i14;
                    }
                }
            }
        }
    }
}
