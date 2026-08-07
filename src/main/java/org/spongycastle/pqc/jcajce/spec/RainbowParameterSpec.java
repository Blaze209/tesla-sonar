package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowParameterSpec implements AlgorithmParameterSpec {
    private static final int[] DEFAULT_VI = {6, 12, 17, 22, 33};

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private int[] f99852vi;

    public RainbowParameterSpec() {
        this.f99852vi = DEFAULT_VI;
    }

    private void checkParams() {
        int[] iArr;
        int i11;
        int[] iArr2 = this.f99852vi;
        if (iArr2 == null) {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (iArr2.length <= 1) {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i12 = 0;
        do {
            iArr = this.f99852vi;
            if (i12 >= iArr.length - 1) {
                return;
            }
            i11 = iArr[i12];
            i12++;
        } while (i11 < iArr[i12]);
        throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
    }

    public int getDocumentLength() {
        int[] iArr = this.f99852vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f99852vi.length - 1;
    }

    public int[] getVi() {
        return Arrays.clone(this.f99852vi);
    }

    public RainbowParameterSpec(int[] iArr) {
        this.f99852vi = iArr;
        try {
            checkParams();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
