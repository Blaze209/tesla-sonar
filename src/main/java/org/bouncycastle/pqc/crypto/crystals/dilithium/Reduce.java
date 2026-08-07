package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes10.dex */
class Reduce {
    Reduce() {
    }

    static int conditionalAddQ(int i11) {
        return i11 + ((i11 >> 31) & DilithiumEngine.DilithiumQ);
    }

    static int montgomeryReduce(long j11) {
        return (int) ((j11 - (((long) ((int) (58728449 * j11))) * 8380417)) >>> 32);
    }

    static int reduce32(int i11) {
        return i11 - (((4194304 + i11) >> 23) * DilithiumEngine.DilithiumQ);
    }
}
