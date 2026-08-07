package org.bouncycastle.pqc.crypto.cmce;

/* JADX INFO: loaded from: classes10.dex */
abstract class GF {
    GF() {
    }

    protected abstract short gf_frac(short s11, short s12);

    protected abstract short gf_inv(short s11);

    final short gf_iszero(short s11) {
        return (short) ((s11 - 1) >> 31);
    }

    protected abstract short gf_mul(short s11, short s12);

    protected abstract int gf_mul_ext(short s11, short s12);

    protected abstract void gf_mul_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2);

    protected abstract short gf_reduce(int i11);

    protected abstract short gf_sq(short s11);

    protected abstract int gf_sq_ext(short s11);

    protected abstract void gf_sqr_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2);
}
