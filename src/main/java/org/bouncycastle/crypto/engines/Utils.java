package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* JADX INFO: loaded from: classes9.dex */
class Utils {
    Utils() {
    }

    static CryptoServicePurpose getPurpose(boolean z11) {
        return z11 ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
