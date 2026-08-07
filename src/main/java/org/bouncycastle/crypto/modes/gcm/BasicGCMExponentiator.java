package org.bouncycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes9.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long[] f98765x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j11, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        if (j11 > 0) {
            long[] jArr = new long[2];
            GCMUtil.copy(this.f98765x, jArr);
            do {
                if ((1 & j11) != 0) {
                    GCMUtil.multiply(jArrOneAsLongs, jArr);
                }
                GCMUtil.square(jArr, jArr);
                j11 >>>= 1;
            } while (j11 > 0);
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f98765x = GCMUtil.asLongs(bArr);
    }
}
