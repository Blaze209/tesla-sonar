package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.spongycastle.pqc.crypto.rainbow.Layer;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowPrivateKeySpec implements KeySpec {
    private short[][] A1inv;
    private short[][] A2inv;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private short[] f99853b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private short[] f99854b2;
    private Layer[] layers;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private int[] f99855vi;

    public RainbowPrivateKeySpec(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.A1inv = sArr;
        this.f99853b1 = sArr2;
        this.A2inv = sArr3;
        this.f99854b2 = sArr4;
        this.f99855vi = iArr;
        this.layers = layerArr;
    }

    public short[] getB1() {
        return this.f99853b1;
    }

    public short[] getB2() {
        return this.f99854b2;
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public Layer[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.f99855vi;
    }
}
