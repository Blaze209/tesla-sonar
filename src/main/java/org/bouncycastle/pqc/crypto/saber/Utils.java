package org.bouncycastle.pqc.crypto.saber;

/* JADX INFO: loaded from: classes10.dex */
class Utils {
    private final int SABER_EP;
    private final int SABER_ET;
    private final int SABER_KEYBYTES;
    private final int SABER_L;
    private final int SABER_N;
    private final int SABER_POLYBYTES;
    private final boolean usingEffectiveMasking;

    public Utils(SABEREngine sABEREngine) {
        this.SABER_N = sABEREngine.getSABER_N();
        this.SABER_L = sABEREngine.getSABER_L();
        this.SABER_ET = sABEREngine.getSABER_ET();
        this.SABER_POLYBYTES = sABEREngine.getSABER_POLYBYTES();
        this.SABER_EP = sABEREngine.getSABER_EP();
        this.SABER_KEYBYTES = sABEREngine.getSABER_KEYBYTES();
        this.usingEffectiveMasking = sABEREngine.usingEffectiveMasking;
    }

    private void BS2POLq(byte[] bArr, int i11, short[] sArr) {
        short s11 = 0;
        if (this.usingEffectiveMasking) {
            while (s11 < this.SABER_N / 2) {
                short s12 = (short) (s11 * 2);
                int i12 = ((short) (s11 * 3)) + i11;
                int i13 = bArr[i12] & 255;
                byte b11 = bArr[i12 + 1];
                sArr[s12] = (short) (i13 | ((b11 & 15) << 8));
                sArr[s12 + 1] = (short) (((bArr[i12 + 2] & 255) << 4) | ((b11 >> 4) & 15));
                s11 = (short) (s11 + 1);
            }
            return;
        }
        while (s11 < this.SABER_N / 8) {
            short s13 = (short) (s11 * 8);
            int i14 = ((short) (s11 * 13)) + i11;
            int i15 = bArr[i14] & 255;
            byte b12 = bArr[i14 + 1];
            sArr[s13] = (short) (i15 | ((b12 & 31) << 8));
            int i16 = ((b12 >> 5) & 7) | ((bArr[i14 + 2] & 255) << 3);
            byte b13 = bArr[i14 + 3];
            sArr[s13 + 1] = (short) (i16 | ((b13 & 3) << 11));
            int i17 = (b13 >> 2) & 63;
            byte b14 = bArr[i14 + 4];
            sArr[s13 + 2] = (short) (i17 | ((b14 & 127) << 6));
            int i18 = ((b14 >> 7) & 1) | ((bArr[i14 + 5] & 255) << 1);
            byte b15 = bArr[i14 + 6];
            sArr[s13 + 3] = (short) (i18 | ((b15 & 15) << 9));
            int i19 = ((b15 >> 4) & 15) | ((bArr[i14 + 7] & 255) << 4);
            byte b16 = bArr[i14 + 8];
            sArr[s13 + 4] = (short) (i19 | ((b16 & 1) << 12));
            int i21 = (b16 >> 1) & 127;
            byte b17 = bArr[i14 + 9];
            sArr[s13 + 5] = (short) (i21 | ((b17 & 63) << 7));
            int i22 = ((b17 >> 6) & 3) | ((bArr[i14 + 10] & 255) << 2);
            byte b18 = bArr[i14 + 11];
            sArr[s13 + 6] = (short) (i22 | ((b18 & 7) << 10));
            sArr[s13 + 7] = (short) (((bArr[i14 + 12] & 255) << 5) | ((b18 >> 3) & 31));
            s11 = (short) (s11 + 1);
        }
    }

    private void POLp2BS(byte[] bArr, int i11, short[] sArr) {
        for (short s11 = 0; s11 < this.SABER_N / 4; s11 = (short) (s11 + 1)) {
            short s12 = (short) (s11 * 4);
            int i12 = ((short) (s11 * 5)) + i11;
            short s13 = sArr[s12];
            bArr[i12] = (byte) (s13 & 255);
            short s14 = sArr[s12 + 1];
            bArr[i12 + 1] = (byte) (((s13 >> 8) & 3) | ((s14 & 63) << 2));
            int i13 = (s14 >> 6) & 15;
            short s15 = sArr[s12 + 2];
            bArr[i12 + 2] = (byte) (i13 | ((s15 & 15) << 4));
            short s16 = sArr[s12 + 3];
            bArr[i12 + 3] = (byte) (((s15 >> 4) & 63) | ((s16 & 3) << 6));
            bArr[i12 + 4] = (byte) ((s16 >> 2) & 255);
        }
    }

    private void POLq2BS(byte[] bArr, int i11, short[] sArr) {
        short s11 = 0;
        if (this.usingEffectiveMasking) {
            while (s11 < this.SABER_N / 2) {
                short s12 = (short) (s11 * 2);
                int i12 = ((short) (s11 * 3)) + i11;
                short s13 = sArr[s12];
                bArr[i12] = (byte) (s13 & 255);
                short s14 = sArr[s12 + 1];
                bArr[i12 + 1] = (byte) (((s13 >> 8) & 15) | ((s14 & 15) << 4));
                bArr[i12 + 2] = (byte) ((s14 >> 4) & 255);
                s11 = (short) (s11 + 1);
            }
            return;
        }
        while (s11 < this.SABER_N / 8) {
            short s15 = (short) (s11 * 8);
            int i13 = ((short) (s11 * 13)) + i11;
            short s16 = sArr[s15];
            bArr[i13] = (byte) (s16 & 255);
            short s17 = sArr[s15 + 1];
            bArr[i13 + 1] = (byte) (((s16 >> 8) & 31) | ((s17 & 7) << 5));
            bArr[i13 + 2] = (byte) ((s17 >> 3) & 255);
            int i14 = (s17 >> 11) & 3;
            short s18 = sArr[s15 + 2];
            bArr[i13 + 3] = (byte) (i14 | ((s18 & 63) << 2));
            int i15 = (s18 >> 6) & 127;
            short s19 = sArr[s15 + 3];
            bArr[i13 + 4] = (byte) (i15 | ((s19 & 1) << 7));
            bArr[i13 + 5] = (byte) ((s19 >> 1) & 255);
            int i16 = (s19 >> 9) & 15;
            short s21 = sArr[s15 + 4];
            bArr[i13 + 6] = (byte) (i16 | ((s21 & 15) << 4));
            bArr[i13 + 7] = (byte) ((s21 >> 4) & 255);
            int i17 = (s21 >> 12) & 1;
            short s22 = sArr[s15 + 5];
            bArr[i13 + 8] = (byte) (i17 | ((s22 & 127) << 1));
            int i18 = (s22 >> 7) & 63;
            short s23 = sArr[s15 + 6];
            bArr[i13 + 9] = (byte) (i18 | ((s23 & 3) << 6));
            bArr[i13 + 10] = (byte) ((s23 >> 2) & 255);
            short s24 = sArr[s15 + 7];
            bArr[i13 + 11] = (byte) (((s23 >> 10) & 7) | ((s24 & 31) << 3));
            bArr[i13 + 12] = (byte) ((s24 >> 5) & 255);
            s11 = (short) (s11 + 1);
        }
    }

    public void BS2POLT(byte[] bArr, int i11, short[] sArr) {
        int i12 = this.SABER_ET;
        short s11 = 0;
        if (i12 == 3) {
            while (s11 < this.SABER_N / 8) {
                short s12 = (short) (s11 * 8);
                int i13 = ((short) (s11 * 3)) + i11;
                byte b11 = bArr[i13];
                sArr[s12] = (short) (b11 & 7);
                sArr[s12 + 1] = (short) ((b11 >> 3) & 7);
                byte b12 = bArr[i13 + 1];
                sArr[s12 + 2] = (short) (((b11 >> 6) & 3) | ((b12 & 1) << 2));
                sArr[s12 + 3] = (short) ((b12 >> 1) & 7);
                sArr[s12 + 4] = (short) ((b12 >> 4) & 7);
                byte b13 = bArr[i13 + 2];
                sArr[s12 + 5] = (short) (((b12 >> 7) & 1) | ((b13 & 3) << 1));
                sArr[s12 + 6] = (short) ((b13 >> 2) & 7);
                sArr[s12 + 7] = (short) ((b13 >> 5) & 7);
                s11 = (short) (s11 + 1);
            }
            return;
        }
        if (i12 == 4) {
            while (s11 < this.SABER_N / 2) {
                short s13 = (short) (s11 * 2);
                byte b14 = bArr[i11 + s11];
                sArr[s13] = (short) (b14 & 15);
                sArr[s13 + 1] = (short) ((b14 >> 4) & 15);
                s11 = (short) (s11 + 1);
            }
            return;
        }
        if (i12 == 6) {
            while (s11 < this.SABER_N / 4) {
                short s14 = (short) (s11 * 4);
                int i14 = ((short) (s11 * 3)) + i11;
                byte b15 = bArr[i14];
                sArr[s14] = (short) (b15 & 63);
                byte b16 = bArr[i14 + 1];
                sArr[s14 + 1] = (short) (((b15 >> 6) & 3) | ((b16 & 15) << 2));
                byte b17 = bArr[i14 + 2];
                sArr[s14 + 2] = (short) (((b16 & 255) >> 4) | ((b17 & 3) << 4));
                sArr[s14 + 3] = (short) ((b17 & 255) >> 2);
                s11 = (short) (s11 + 1);
            }
        }
    }

    public void BS2POLVECp(byte[] bArr, short[][] sArr) {
        for (byte b11 = 0; b11 < this.SABER_L; b11 = (byte) (b11 + 1)) {
            BS2POLp(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b11, sArr[b11]);
        }
    }

    public void BS2POLVECq(byte[] bArr, int i11, short[][] sArr) {
        for (byte b11 = 0; b11 < this.SABER_L; b11 = (byte) (b11 + 1)) {
            BS2POLq(bArr, (this.SABER_POLYBYTES * b11) + i11, sArr[b11]);
        }
    }

    public void BS2POLmsg(byte[] bArr, short[] sArr) {
        for (byte b11 = 0; b11 < this.SABER_KEYBYTES; b11 = (byte) (b11 + 1)) {
            for (byte b12 = 0; b12 < 8; b12 = (byte) (b12 + 1)) {
                sArr[(b11 * 8) + b12] = (short) ((bArr[b11] >> b12) & 1);
            }
        }
    }

    public void BS2POLp(byte[] bArr, int i11, short[] sArr) {
        for (short s11 = 0; s11 < this.SABER_N / 4; s11 = (short) (s11 + 1)) {
            short s12 = (short) (s11 * 4);
            int i12 = ((short) (s11 * 5)) + i11;
            int i13 = bArr[i12] & 255;
            byte b11 = bArr[i12 + 1];
            sArr[s12] = (short) (i13 | ((b11 & 3) << 8));
            byte b12 = bArr[i12 + 2];
            sArr[s12 + 1] = (short) (((b11 >> 2) & 63) | ((b12 & 15) << 6));
            int i14 = (b12 >> 4) & 15;
            byte b13 = bArr[i12 + 3];
            sArr[s12 + 2] = (short) (i14 | ((b13 & 63) << 4));
            sArr[s12 + 3] = (short) (((bArr[i12 + 4] & 255) << 2) | ((b13 >> 6) & 3));
        }
    }

    public void POLT2BS(byte[] bArr, int i11, short[] sArr) {
        int i12 = this.SABER_ET;
        short s11 = 0;
        if (i12 == 3) {
            while (s11 < this.SABER_N / 8) {
                short s12 = (short) (s11 * 8);
                int i13 = ((short) (s11 * 3)) + i11;
                int i14 = (sArr[s12] & 7) | ((sArr[s12 + 1] & 7) << 3);
                short s13 = sArr[s12 + 2];
                bArr[i13] = (byte) (i14 | ((s13 & 3) << 6));
                int i15 = ((s13 >> 2) & 1) | ((sArr[s12 + 3] & 7) << 1) | ((sArr[s12 + 4] & 7) << 4);
                short s14 = sArr[s12 + 5];
                bArr[i13 + 1] = (byte) (i15 | ((s14 & 1) << 7));
                bArr[i13 + 2] = (byte) (((sArr[s12 + 7] & 7) << 5) | ((s14 >> 1) & 3) | ((sArr[s12 + 6] & 7) << 2));
                s11 = (short) (s11 + 1);
            }
            return;
        }
        if (i12 == 4) {
            while (s11 < this.SABER_N / 2) {
                short s15 = (short) (s11 * 2);
                bArr[i11 + s11] = (byte) (((sArr[s15 + 1] & 15) << 4) | (sArr[s15] & 15));
                s11 = (short) (s11 + 1);
            }
            return;
        }
        if (i12 == 6) {
            while (s11 < this.SABER_N / 4) {
                short s16 = (short) (s11 * 4);
                int i16 = ((short) (s11 * 3)) + i11;
                int i17 = sArr[s16] & 63;
                short s17 = sArr[s16 + 1];
                bArr[i16] = (byte) (i17 | ((s17 & 3) << 6));
                short s18 = sArr[s16 + 2];
                bArr[i16 + 1] = (byte) (((s17 >> 2) & 15) | ((s18 & 15) << 4));
                bArr[i16 + 2] = (byte) (((sArr[s16 + 3] & 63) << 2) | ((s18 >> 4) & 3));
                s11 = (short) (s11 + 1);
            }
        }
    }

    public void POLVECp2BS(byte[] bArr, short[][] sArr) {
        for (byte b11 = 0; b11 < this.SABER_L; b11 = (byte) (b11 + 1)) {
            POLp2BS(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b11, sArr[b11]);
        }
    }

    public void POLVECq2BS(byte[] bArr, short[][] sArr) {
        for (byte b11 = 0; b11 < this.SABER_L; b11 = (byte) (b11 + 1)) {
            POLq2BS(bArr, this.SABER_POLYBYTES * b11, sArr[b11]);
        }
    }

    public void POLmsg2BS(byte[] bArr, short[] sArr) {
        for (byte b11 = 0; b11 < this.SABER_KEYBYTES; b11 = (byte) (b11 + 1)) {
            for (byte b12 = 0; b12 < 8; b12 = (byte) (b12 + 1)) {
                bArr[b11] = (byte) (bArr[b11] | ((sArr[(b11 * 8) + b12] & 1) << b12));
            }
        }
    }
}
