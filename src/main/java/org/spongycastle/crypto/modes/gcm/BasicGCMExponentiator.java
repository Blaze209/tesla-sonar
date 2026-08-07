package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[] f99549x;

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j11, byte[] bArr) {
        int[] iArrOneAsInts = GCMUtil.oneAsInts();
        if (j11 > 0) {
            int[] iArrClone = Arrays.clone(this.f99549x);
            do {
                if ((1 & j11) != 0) {
                    GCMUtil.multiply(iArrOneAsInts, iArrClone);
                }
                GCMUtil.multiply(iArrClone, iArrClone);
                j11 >>>= 1;
            } while (j11 > 0);
        }
        GCMUtil.asBytes(iArrOneAsInts, bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f99549x = GCMUtil.asInts(bArr);
    }
}
