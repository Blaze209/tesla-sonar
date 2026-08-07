package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99766n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99767t;

    public McElieceCCA2PublicKeyParameters(int i11, int i12, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f99766n = i11;
        this.f99767t = i12;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f99766n;
    }

    public int getT() {
        return this.f99767t;
    }
}
