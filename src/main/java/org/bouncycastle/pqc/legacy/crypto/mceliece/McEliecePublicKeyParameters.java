package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GF2Matrix f99248g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99249n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99250t;

    public McEliecePublicKeyParameters(int i11, int i12, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f99249n = i11;
        this.f99250t = i12;
        this.f99248g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f99248g;
    }

    public int getK() {
        return this.f99248g.getNumRows();
    }

    public int getN() {
        return this.f99249n;
    }

    public int getT() {
        return this.f99250t;
    }
}
