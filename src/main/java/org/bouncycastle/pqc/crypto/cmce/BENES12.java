package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
class BENES12 extends BENES {
    public BENES12(int i11, int i12, int i13) {
        super(i11, i12, i13);
    }

    private void apply_benes(byte[] bArr, byte[] bArr2, int i11) {
        int i12;
        int i13;
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        for (int i14 = 0; i14 < 64; i14++) {
            jArr[i14] = Utils.load8(bArr, i14 * 8);
        }
        int i15 = 256;
        if (i11 == 0) {
            i12 = (this.SYS_T * 2) + 40;
        } else {
            i12 = (this.SYS_T * 2) + 40 + (((this.GFBITS * 2) - 2) * 256);
            i15 = -256;
        }
        BENES.transpose_64x64(jArr, jArr);
        int i16 = 0;
        while (true) {
            if (i16 > 5) {
                break;
            }
            for (int i17 = 0; i17 < 64; i17++) {
                jArr2[i17] = Utils.load4(bArr2, (i17 * 4) + i12);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i16);
            i12 += i15;
            i16++;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i18 = 0; i18 <= 5; i18++) {
            for (int i19 = 0; i19 < 32; i19++) {
                jArr2[i19] = Utils.load8(bArr2, (i19 * 8) + i12);
            }
            layerBenes(jArr, jArr2, i18);
            i12 += i15;
        }
        for (int i21 = 4; i21 >= 0; i21--) {
            for (int i22 = 0; i22 < 32; i22++) {
                jArr2[i22] = Utils.load8(bArr2, (i22 * 8) + i12);
            }
            layerBenes(jArr, jArr2, i21);
            i12 += i15;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (i13 = 5; i13 >= 0; i13--) {
            for (int i23 = 0; i23 < 64; i23++) {
                jArr2[i23] = Utils.load4(bArr2, (i23 * 4) + i12);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i13);
            i12 += i15;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i24 = 0; i24 < 64; i24++) {
            Utils.store8(bArr, i24 * 8, jArr[i24]);
        }
    }

    static void layerBenes(long[] jArr, long[] jArr2, int i11) {
        int i12 = 1 << i11;
        int i13 = 0;
        for (int i14 = 0; i14 < 64; i14 += i12 * 2) {
            int i15 = i14;
            while (i15 < i14 + i12) {
                long j11 = jArr[i15];
                int i16 = i15 + i12;
                long j12 = (jArr[i16] ^ j11) & jArr2[i13];
                jArr[i15] = j11 ^ j12;
                jArr[i16] = jArr[i16] ^ j12;
                i15++;
                i13++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.BENES
    public void support_gen(short[] sArr, byte[] bArr) {
        int i11 = this.GFBITS;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, (1 << i11) / 8);
        for (int i12 = 0; i12 < this.GFBITS; i12++) {
            for (int i13 = 0; i13 < (1 << this.GFBITS) / 8; i13++) {
                bArr2[i12][i13] = 0;
            }
        }
        int i14 = 0;
        while (true) {
            int i15 = this.GFBITS;
            if (i14 >= (1 << i15)) {
                break;
            }
            short sBitrev = Utils.bitrev((short) i14, i15);
            for (int i16 = 0; i16 < this.GFBITS; i16++) {
                byte[] bArr3 = bArr2[i16];
                int i17 = i14 / 8;
                bArr3[i17] = (byte) (bArr3[i17] | (((sBitrev >> i16) & 1) << (i14 % 8)));
            }
            i14++;
        }
        for (int i18 = 0; i18 < this.GFBITS; i18++) {
            apply_benes(bArr2[i18], bArr, 0);
        }
        for (int i19 = 0; i19 < this.SYS_N; i19++) {
            sArr[i19] = 0;
            for (int i21 = this.GFBITS - 1; i21 >= 0; i21--) {
                short s11 = (short) (sArr[i19] << 1);
                sArr[i19] = s11;
                sArr[i19] = (short) (s11 | ((bArr2[i21][i19 / 8] >> (i19 % 8)) & 1));
            }
        }
    }
}
