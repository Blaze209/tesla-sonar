package org.bouncycastle.pqc.crypto.crystals.kyber;

/* JADX INFO: loaded from: classes10.dex */
class Reduce {
    Reduce() {
    }

    public static short barretReduce(short s11) {
        return (short) (s11 - ((short) (((short) ((((short) 20159) * s11) >> 26)) * 3329)));
    }

    public static short conditionalSubQ(short s11) {
        short s12 = (short) (s11 - 3329);
        return (short) (s12 + ((s12 >> 15) & KyberEngine.KyberQ));
    }

    public static short montgomeryReduce(int i11) {
        return (short) ((i11 - (((short) (KyberEngine.KyberQinv * i11)) * 3329)) >> 16);
    }
}
