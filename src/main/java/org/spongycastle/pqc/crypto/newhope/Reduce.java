package org.spongycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes10.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    Reduce() {
    }

    static short barrett(short s11) {
        int i11 = s11 & HPKE.aead_EXPORT_ONLY;
        return (short) (i11 - (((i11 * 5) >>> 16) * 12289));
    }

    static short montgomery(int i11) {
        return (short) (((((i11 * QInv) & RMask) * 12289) + i11) >>> 18);
    }
}
