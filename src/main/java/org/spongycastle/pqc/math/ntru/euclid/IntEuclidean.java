package org.spongycastle.pqc.math.ntru.euclid;

/* JADX INFO: loaded from: classes10.dex */
public class IntEuclidean {
    public int gcd;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f99867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f99868y;

    private IntEuclidean() {
    }

    public static IntEuclidean calculate(int i11, int i12) {
        int i13 = 0;
        int i14 = i11;
        int i15 = i12;
        int i16 = 1;
        int i17 = 1;
        int i18 = 0;
        while (i15 != 0) {
            int i19 = i14 / i15;
            int i21 = i14 % i15;
            int i22 = i17 - (i19 * i18);
            i14 = i15;
            i15 = i21;
            int i23 = i16;
            i16 = i13 - (i19 * i16);
            i13 = i23;
            i17 = i18;
            i18 = i22;
        }
        IntEuclidean intEuclidean = new IntEuclidean();
        intEuclidean.f99867x = i17;
        intEuclidean.f99868y = i13;
        intEuclidean.gcd = i14;
        return intEuclidean;
    }
}
