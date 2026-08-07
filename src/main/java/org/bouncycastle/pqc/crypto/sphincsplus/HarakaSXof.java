package org.bouncycastle.pqc.crypto.sphincsplus;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
class HarakaSXof extends HarakaSBase {
    public HarakaSXof(byte[] bArr) {
        byte[] bArr2 = new byte[640];
        update(bArr, 0, bArr.length);
        doFinal(bArr2, 0, 640);
        this.haraka512_rc = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 10, 8);
        this.haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
        for (int i11 = 0; i11 < 10; i11++) {
            interleaveConstant32(this.haraka256_rc[i11], bArr2, i11 << 5);
            interleaveConstant(this.haraka512_rc[i11], bArr2, i11 << 6);
        }
    }

    public int doFinal(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.buffer;
        int i13 = this.off;
        bArr2[i13] = (byte) (bArr2[i13] ^ 31);
        bArr2[31] = (byte) (bArr2[31] ^ 128);
        int i14 = i12;
        while (i14 >= 32) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i11, 32);
            i11 += 32;
            i14 -= 32;
        }
        if (i14 > 0) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i11, i14);
        }
        reset();
        return i12;
    }

    public String getAlgorithmName() {
        return "Haraka-S";
    }

    public void update(byte b11) {
        byte[] bArr = this.buffer;
        int i11 = this.off;
        int i12 = i11 + 1;
        this.off = i12;
        bArr[i11] = (byte) (b11 ^ bArr[i11]);
        if (i12 == 32) {
            haraka512Perm(bArr);
            this.off = 0;
        }
    }

    public void update(byte[] bArr, int i11, int i12) {
        int i13 = (this.off + i12) >> 5;
        int i14 = i11;
        for (int i15 = 0; i15 < i13; i15++) {
            while (true) {
                int i16 = this.off;
                if (i16 < 32) {
                    byte[] bArr2 = this.buffer;
                    this.off = i16 + 1;
                    bArr2[i16] = (byte) (bArr[i14] ^ bArr2[i16]);
                    i14++;
                }
            }
            haraka512Perm(this.buffer);
            this.off = 0;
        }
        while (i14 < i11 + i12) {
            byte[] bArr3 = this.buffer;
            int i17 = this.off;
            this.off = i17 + 1;
            bArr3[i17] = (byte) (bArr3[i17] ^ bArr[i14]);
            i14++;
        }
    }
}
