package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class Tables4kGCMMultiplier implements GCMMultiplier {
    private byte[] H;
    private long[][] T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.T == null) {
            this.T = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (GCMUtil.areEqual(this.H, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.H = bArr2;
        GCMUtil.copy(bArr, bArr2);
        GCMUtil.asLongs(this.H, this.T[1]);
        long[] jArr = this.T[1];
        GCMUtil.multiplyP7(jArr, jArr);
        for (int i11 = 2; i11 < 256; i11 += 2) {
            long[][] jArr2 = this.T;
            GCMUtil.divideP(jArr2[i11 >> 1], jArr2[i11]);
            long[][] jArr3 = this.T;
            GCMUtil.xor(jArr3[i11], jArr3[1], jArr3[i11 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.T[bArr[15] & 255];
        long j11 = jArr[0];
        long j12 = jArr[1];
        for (int i11 = 14; i11 >= 0; i11--) {
            long[] jArr2 = this.T[bArr[i11] & 255];
            long j13 = j12 << 56;
            j12 = ((j12 >>> 8) | (j11 << 56)) ^ jArr2[1];
            j11 = (((((j11 >>> 8) ^ jArr2[0]) ^ j13) ^ (j13 >>> 1)) ^ (j13 >>> 2)) ^ (j13 >>> 7);
        }
        Pack.longToBigEndian(j11, bArr, 0);
        Pack.longToBigEndian(j12, bArr, 8);
    }
}
