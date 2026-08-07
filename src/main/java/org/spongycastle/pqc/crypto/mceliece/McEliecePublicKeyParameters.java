package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GF2Matrix f99795g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99796n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99797t;

    public McEliecePublicKeyParameters(int i11, int i12, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f99796n = i11;
        this.f99797t = i12;
        this.f99795g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f99795g;
    }

    public int getK() {
        return this.f99795g.getNumRows();
    }

    public int getN() {
        return this.f99796n;
    }

    public int getT() {
        return this.f99797t;
    }
}
