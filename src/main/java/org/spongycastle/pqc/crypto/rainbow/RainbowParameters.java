package org.spongycastle.pqc.crypto.rainbow;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private int[] f99836vi;

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.f99836vi = iArr;
    }

    private void checkParams() throws Exception {
        int[] iArr;
        int i11;
        int[] iArr2 = this.f99836vi;
        if (iArr2 == null) {
            throw new Exception("no layers defined.");
        }
        if (iArr2.length <= 1) {
            throw new Exception("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i12 = 0;
        do {
            iArr = this.f99836vi;
            if (i12 >= iArr.length - 1) {
                return;
            }
            i11 = iArr[i12];
            i12++;
        } while (i11 < iArr[i12]);
        throw new Exception("v[i] has to be smaller than v[i+1]");
    }

    public int getDocLength() {
        int[] iArr = this.f99836vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f99836vi.length - 1;
    }

    public int[] getVi() {
        return this.f99836vi;
    }

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f99836vi = iArr;
        try {
            checkParams();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
