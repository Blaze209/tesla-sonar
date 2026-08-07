package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99219n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99220t;

    public McElieceCCA2PublicKeyParameters(int i11, int i12, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f99219n = i11;
        this.f99220t = i12;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f99219n;
    }

    public int getT() {
        return this.f99220t;
    }
}
