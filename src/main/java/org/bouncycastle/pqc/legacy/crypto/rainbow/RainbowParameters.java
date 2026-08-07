package org.bouncycastle.pqc.legacy.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private int[] f99257vi;

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.f99257vi = iArr;
    }

    private void checkParams() {
        int[] iArr;
        int i11;
        int[] iArr2 = this.f99257vi;
        if (iArr2 == null) {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (iArr2.length <= 1) {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i12 = 0;
        do {
            iArr = this.f99257vi;
            if (i12 >= iArr.length - 1) {
                return;
            }
            i11 = iArr[i12];
            i12++;
        } while (i11 < iArr[i12]);
        throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
    }

    public int getDocLength() {
        int[] iArr = this.f99257vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f99257vi.length - 1;
    }

    public int[] getVi() {
        return this.f99257vi;
    }

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f99257vi = iArr;
        checkParams();
    }
}
