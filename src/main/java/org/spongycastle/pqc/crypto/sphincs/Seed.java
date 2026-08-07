package org.spongycastle.pqc.crypto.sphincs;

import org.spongycastle.crypto.engines.ChaChaEngine;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class Seed {
    Seed() {
    }

    static void get_seed(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, Tree.leafaddr leafaddrVar) {
        byte[] bArr3 = new byte[40];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr3[i12] = bArr2[i12];
        }
        Pack.longToLittleEndian((leafaddrVar.subleaf << 59) | ((long) leafaddrVar.level) | (leafaddrVar.subtree << 4), bArr3, 32);
        hashFunctions.varlen_hash(bArr, i11, bArr3, 40);
    }

    static void prg(byte[] bArr, int i11, long j11, byte[] bArr2, int i12) {
        ChaChaEngine chaChaEngine = new ChaChaEngine(12);
        chaChaEngine.init(true, new ParametersWithIV(new KeyParameter(bArr2, i12, 32), new byte[8]));
        chaChaEngine.processBytes(bArr, i11, (int) j11, bArr, i11);
    }
}
