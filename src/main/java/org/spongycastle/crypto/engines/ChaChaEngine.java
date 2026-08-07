package org.spongycastle.crypto.engines;

import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i11, int[] iArr, int[] iArr2) {
        int i12 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i11 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        char c11 = 3;
        int i16 = iArr[3];
        char c12 = 4;
        int i17 = iArr[4];
        char c13 = 5;
        int i18 = iArr[5];
        char c14 = 6;
        int i19 = iArr[6];
        int i21 = 7;
        int i22 = iArr[7];
        int i23 = 8;
        int i24 = iArr[8];
        int i25 = iArr[9];
        int i26 = iArr[10];
        int i27 = iArr[11];
        int i28 = 12;
        int i29 = iArr[12];
        int i31 = iArr[13];
        int i32 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i32;
        int iRotl3 = i31;
        int iRotl4 = i29;
        int i33 = i27;
        int i34 = i26;
        int i35 = i25;
        int i36 = i24;
        int iRotl5 = i22;
        int iRotl6 = i19;
        int iRotl7 = i18;
        int iRotl8 = i17;
        int i37 = i16;
        int i38 = i15;
        int i39 = i14;
        int i41 = i13;
        int i42 = i11;
        while (i42 > 0) {
            int i43 = i41 + iRotl8;
            char c15 = c11;
            int iRotl9 = Salsa20Engine.rotl(iRotl4 ^ i43, i12);
            int i44 = i36 + iRotl9;
            int iRotl10 = Salsa20Engine.rotl(iRotl8 ^ i44, i28);
            int i45 = i43 + iRotl10;
            int iRotl11 = Salsa20Engine.rotl(iRotl9 ^ i45, i23);
            int i46 = i44 + iRotl11;
            int iRotl12 = Salsa20Engine.rotl(iRotl10 ^ i46, i21);
            int i47 = i39 + iRotl7;
            char c16 = c12;
            int iRotl13 = Salsa20Engine.rotl(iRotl3 ^ i47, i12);
            int i48 = i35 + iRotl13;
            char c17 = c13;
            int iRotl14 = Salsa20Engine.rotl(iRotl7 ^ i48, i28);
            int i49 = i47 + iRotl14;
            int iRotl15 = Salsa20Engine.rotl(iRotl13 ^ i49, i23);
            int i51 = i48 + iRotl15;
            int iRotl16 = Salsa20Engine.rotl(iRotl14 ^ i51, i21);
            int i52 = i38 + iRotl6;
            char c18 = c14;
            int iRotl17 = Salsa20Engine.rotl(iRotl2 ^ i52, i12);
            int i53 = i34 + iRotl17;
            int iRotl18 = Salsa20Engine.rotl(iRotl6 ^ i53, i28);
            int i54 = i52 + iRotl18;
            int iRotl19 = Salsa20Engine.rotl(iRotl17 ^ i54, i23);
            int i55 = i53 + iRotl19;
            int iRotl20 = Salsa20Engine.rotl(iRotl18 ^ i55, i21);
            int i56 = i37 + iRotl5;
            int iRotl21 = Salsa20Engine.rotl(iRotl ^ i56, 16);
            int i57 = i33 + iRotl21;
            int iRotl22 = Salsa20Engine.rotl(iRotl5 ^ i57, i28);
            int i58 = i56 + iRotl22;
            int iRotl23 = Salsa20Engine.rotl(iRotl21 ^ i58, 8);
            int i59 = i57 + iRotl23;
            int iRotl24 = Salsa20Engine.rotl(iRotl22 ^ i59, 7);
            int i61 = i45 + iRotl16;
            int iRotl25 = Salsa20Engine.rotl(iRotl23 ^ i61, 16);
            int i62 = i55 + iRotl25;
            int iRotl26 = Salsa20Engine.rotl(iRotl16 ^ i62, 12);
            i41 = i61 + iRotl26;
            iRotl = Salsa20Engine.rotl(iRotl25 ^ i41, 8);
            i34 = i62 + iRotl;
            iRotl7 = Salsa20Engine.rotl(iRotl26 ^ i34, 7);
            int i63 = i49 + iRotl20;
            int iRotl27 = Salsa20Engine.rotl(iRotl11 ^ i63, 16);
            int i64 = i59 + iRotl27;
            int iRotl28 = Salsa20Engine.rotl(iRotl20 ^ i64, 12);
            i39 = i63 + iRotl28;
            iRotl4 = Salsa20Engine.rotl(iRotl27 ^ i39, 8);
            i33 = i64 + iRotl4;
            iRotl6 = Salsa20Engine.rotl(iRotl28 ^ i33, 7);
            int i65 = i54 + iRotl24;
            int iRotl29 = Salsa20Engine.rotl(iRotl15 ^ i65, 16);
            int i66 = i46 + iRotl29;
            int iRotl30 = Salsa20Engine.rotl(iRotl24 ^ i66, 12);
            i38 = i65 + iRotl30;
            iRotl3 = Salsa20Engine.rotl(iRotl29 ^ i38, 8);
            i36 = i66 + iRotl3;
            iRotl5 = Salsa20Engine.rotl(iRotl30 ^ i36, 7);
            int i67 = i58 + iRotl12;
            int iRotl31 = Salsa20Engine.rotl(iRotl19 ^ i67, 16);
            int i68 = i51 + iRotl31;
            int iRotl32 = Salsa20Engine.rotl(iRotl12 ^ i68, 12);
            i37 = i67 + iRotl32;
            iRotl2 = Salsa20Engine.rotl(iRotl31 ^ i37, 8);
            i35 = i68 + iRotl2;
            iRotl8 = Salsa20Engine.rotl(iRotl32 ^ i35, 7);
            i42 -= 2;
            i12 = 16;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            c14 = c18;
            i21 = 7;
            i23 = 8;
            i28 = 12;
        }
        char c19 = c11;
        char c21 = c12;
        char c22 = c13;
        char c23 = c14;
        iArr2[0] = i41 + iArr[0];
        iArr2[1] = i39 + iArr[1];
        iArr2[2] = i38 + iArr[2];
        iArr2[c19] = i37 + iArr[c19];
        iArr2[c21] = iRotl8 + iArr[c21];
        iArr2[c22] = iRotl7 + iArr[c22];
        iArr2[c23] = iRotl6 + iArr[c23];
        iArr2[7] = iRotl5 + iArr[7];
        iArr2[8] = i36 + iArr[8];
        iArr2[9] = i35 + iArr[9];
        iArr2[10] = i34 + iArr[10];
        iArr2[11] = i33 + iArr[11];
        iArr2[12] = iRotl4 + iArr[12];
        iArr2[13] = iRotl3 + iArr[13];
        iArr2[14] = iRotl2 + iArr[14];
        iArr2[15] = iRotl + iArr[15];
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i11;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[12];
        int i14 = i12 + i13;
        iArr2[12] = i14;
        if (i13 == 0 || i14 >= i13) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f99496x);
        Pack.intToLittleEndian(this.f99496x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[13]) << 32) | (((long) iArr[12]) & 4294967295L);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 != 0) {
            int[] iArr = this.engineState;
            int i13 = iArr[13];
            if ((((long) i13) & 4294967295L) < (((long) i11) & 4294967295L)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[13] = i13 - i11;
        }
        int[] iArr2 = this.engineState;
        int i14 = iArr2[12];
        if ((((long) i14) & 4294967295L) >= (4294967295L & ((long) i12))) {
            iArr2[12] = i14 - i12;
            return;
        }
        int i15 = iArr2[13];
        if (i15 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[13] = i15 - 1;
        iArr2[12] = i14 - i12;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i11) {
        super(i11);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[12] + 1;
        iArr[12] = i11;
        if (i11 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[12];
        if (i11 == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i12 = i11 - 1;
        iArr[12] = i12;
        if (i12 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }
}
