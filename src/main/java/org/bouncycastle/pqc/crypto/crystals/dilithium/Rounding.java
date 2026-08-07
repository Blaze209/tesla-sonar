package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes10.dex */
class Rounding {
    Rounding() {
    }

    public static int[] decompose(int i11, int i12) {
        int i13;
        int i14 = (i11 + 127) >> 7;
        if (i12 == 261888) {
            i13 = (((i14 * 1025) + PKIFailureInfo.badSenderNonce) >> 22) & 15;
        } else {
            if (i12 != 95232) {
                throw new RuntimeException("Wrong Gamma2!");
            }
            int i15 = ((i14 * 11275) + 8388608) >> 24;
            i13 = i15 ^ (((43 - i15) >> 31) & i15);
        }
        int i16 = i11 - ((i13 * 2) * i12);
        return new int[]{i16 - (((4190208 - i16) >> 31) & DilithiumEngine.DilithiumQ), i13};
    }

    public static int makeHint(int i11, int i12, DilithiumEngine dilithiumEngine) {
        int i13;
        int dilithiumGamma2 = dilithiumEngine.getDilithiumGamma2();
        if (i11 <= dilithiumGamma2 || i11 > (i13 = DilithiumEngine.DilithiumQ - dilithiumGamma2)) {
            return 0;
        }
        return (i11 == i13 && i12 == 0) ? 0 : 1;
    }

    public static int[] power2Round(int i11) {
        int i12 = (i11 + 4095) >> 13;
        return new int[]{i12, i11 - (i12 << 13)};
    }

    public static int useHint(int i11, int i12, int i13) {
        int[] iArrDecompose = decompose(i11, i13);
        int i14 = iArrDecompose[0];
        int i15 = iArrDecompose[1];
        if (i12 == 0) {
            return i15;
        }
        if (i13 == 261888) {
            return (i14 > 0 ? i15 + 1 : i15 - 1) & 15;
        }
        if (i13 != 95232) {
            throw new RuntimeException("Wrong Gamma2!");
        }
        if (i14 > 0) {
            if (i15 == 43) {
                return 0;
            }
            return i15 + 1;
        }
        if (i15 == 0) {
            return 43;
        }
        return i15 - 1;
    }
}
