package org.spongycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public class Tables8kGCMMultiplier implements GCMMultiplier {
    private byte[] H;
    private int[][][] M;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        int i11 = 0;
        if (this.M == null) {
            this.M = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 16, 4);
        } else if (Arrays.areEqual(this.H, bArr)) {
            return;
        }
        this.H = Arrays.clone(bArr);
        GCMUtil.asInts(bArr, this.M[1][8]);
        for (int i12 = 4; i12 >= 1; i12 >>= 1) {
            int[][] iArr = this.M[1];
            GCMUtil.multiplyP(iArr[i12 + i12], iArr[i12]);
        }
        int[][][] iArr2 = this.M;
        GCMUtil.multiplyP(iArr2[1][1], iArr2[0][8]);
        for (int i13 = 4; i13 >= 1; i13 >>= 1) {
            int[][] iArr3 = this.M[0];
            GCMUtil.multiplyP(iArr3[i13 + i13], iArr3[i13]);
        }
        while (true) {
            for (int i14 = 2; i14 < 16; i14 += i14) {
                for (int i15 = 1; i15 < i14; i15++) {
                    int[][] iArr4 = this.M[i11];
                    GCMUtil.xor(iArr4[i14], iArr4[i15], iArr4[i14 + i15]);
                }
            }
            int i16 = i11 + 1;
            if (i16 == 32) {
                return;
            }
            if (i16 > 1) {
                for (int i17 = 8; i17 > 0; i17 >>= 1) {
                    int[][][] iArr5 = this.M;
                    GCMUtil.multiplyP8(iArr5[i11 - 1][i17], iArr5[i16][i17]);
                }
            }
            i11 = i16;
        }
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i11 = 15; i11 >= 0; i11--) {
            int[][][] iArr2 = this.M;
            int i12 = i11 + i11;
            int[][] iArr3 = iArr2[i12];
            byte b11 = bArr[i11];
            int[] iArr4 = iArr3[b11 & 15];
            int i13 = iArr[0] ^ iArr4[0];
            iArr[0] = i13;
            int i14 = iArr[1] ^ iArr4[1];
            iArr[1] = i14;
            int i15 = iArr[2] ^ iArr4[2];
            iArr[2] = i15;
            int i16 = iArr[3] ^ iArr4[3];
            iArr[3] = i16;
            int[] iArr5 = iArr2[i12 + 1][(b11 & 240) >>> 4];
            iArr[0] = iArr5[0] ^ i13;
            iArr[1] = iArr5[1] ^ i14;
            iArr[2] = iArr5[2] ^ i15;
            iArr[3] = iArr5[3] ^ i16;
        }
        Pack.intToBigEndian(iArr, bArr, 0);
    }
}
