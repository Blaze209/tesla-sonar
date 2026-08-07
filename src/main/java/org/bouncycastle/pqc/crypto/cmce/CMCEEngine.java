package org.bouncycastle.pqc.crypto.cmce;

import com.google.android.gms.nearby.connection.ConnectionsClient;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;

    /* JADX INFO: renamed from: gf, reason: collision with root package name */
    private GF f99036gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i11, int i12, int i13, int[] iArr, boolean z11, int i14) {
        BENES benes13;
        this.usePivots = z11;
        this.SYS_N = i12;
        this.SYS_T = i13;
        this.GFBITS = i11;
        this.poly = iArr;
        this.defaultKeySize = i14;
        this.IRR_BYTES = i13 * 2;
        this.COND_BYTES = (1 << (i11 - 4)) * ((i11 * 2) - 1);
        int i15 = i13 * i11;
        this.PK_NROWS = i15;
        int i16 = i12 - i15;
        this.PK_NCOLS = i16;
        this.PK_ROW_BYTES = (i16 + 7) / 8;
        this.SYND_BYTES = (i15 + 7) / 8;
        this.GFMASK = (1 << i11) - 1;
        if (i11 == 12) {
            this.f99036gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.f99036gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void bm(short[] sArr, short[] sArr2) {
        int i11;
        int i12 = this.SYS_T;
        short[] sArr3 = new short[i12 + 1];
        short[] sArr4 = new short[i12 + 1];
        short s11 = 1;
        short[] sArr5 = new short[i12 + 1];
        int i13 = 0;
        for (int i14 = 0; i14 < this.SYS_T + 1; i14++) {
            sArr5[i14] = 0;
            sArr4[i14] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s12 = 1;
        short s13 = 0;
        short s14 = 0;
        while (s13 < this.SYS_T * 2) {
            int iGf_mul_ext = 0;
            for (int i15 = 0; i15 <= min(s13, this.SYS_T); i15++) {
                iGf_mul_ext ^= this.f99036gf.gf_mul_ext(sArr4[i15], sArr2[s13 - i15]);
            }
            short sGf_reduce = this.f99036gf.gf_reduce(iGf_mul_ext);
            short s15 = (short) (((short) (((short) (((short) (sGf_reduce - 1)) >> 15)) & s11)) - s11);
            short s16 = (short) (((short) (((short) (((short) (((short) (s13 - (s14 * 2))) >> 15)) & s11)) - s11)) & s15);
            for (int i16 = 0; i16 <= this.SYS_T; i16++) {
                sArr3[i16] = sArr4[i16];
            }
            short sGf_frac = this.f99036gf.gf_frac(s12, sGf_reduce);
            int i17 = 0;
            while (true) {
                i11 = this.SYS_T;
                if (i17 > i11) {
                    break;
                }
                sArr4[i17] = (short) ((this.f99036gf.gf_mul(sGf_frac, sArr5[i17]) & s15) ^ sArr4[i17]);
                i17++;
            }
            int i18 = ~s16;
            int i19 = s13 + 1;
            s14 = (short) (((i19 - s14) & s16) | (s14 & i18));
            for (int i21 = i11 - 1; i21 >= 0; i21--) {
                sArr5[i21 + 1] = (short) ((sArr5[i21] & i18) | (sArr3[i21] & s16));
            }
            sArr5[0] = 0;
            s12 = (short) ((i18 & s12) | (sGf_reduce & s16));
            s13 = (short) i19;
            s11 = 1;
        }
        while (true) {
            int i22 = this.SYS_T;
            if (i13 > i22) {
                return;
            }
            sArr[i13] = sArr4[i22 - i13];
            i13++;
        }
    }

    static void cbrecursion(byte[] bArr, long j11, long j12, short[] sArr, int i11, long j13, long j14, int[] iArr) {
        long j15;
        int i12;
        int i13;
        int i14;
        char c11;
        long j16;
        long j17;
        long j18;
        long j19 = j14;
        long j21 = 1;
        long j22 = 7;
        char c12 = 3;
        if (j13 == 1) {
            int i15 = (int) (j11 >> 3);
            bArr[i15] = (byte) ((get_q_short(iArr, i11) << ((int) (j11 & 7))) ^ bArr[i15]);
            return;
        }
        if (sArr != null) {
            long j23 = 0;
            while (j23 < j19) {
                int i16 = (int) j23;
                long j24 = j21;
                iArr[i16] = sArr[(int) (j23 ^ j24)] | ((sArr[i16] ^ 1) << 16);
                j23 += j24;
                j21 = j24;
            }
            j15 = j21;
        } else {
            j15 = 1;
            long j25 = 0;
            while (j25 < j19) {
                long j26 = i11;
                iArr[(int) j25] = ((get_q_short(iArr, (int) (j26 + j25)) ^ 1) << 16) | get_q_short(iArr, (int) (j26 + (j25 ^ 1)));
                j25++;
                j22 = j22;
            }
        }
        long j27 = j22;
        int i17 = (int) j19;
        sort32(iArr, 0, i17);
        long j28 = 0;
        while (true) {
            i12 = 65535;
            if (j28 >= j19) {
                break;
            }
            int i18 = (int) j28;
            int i19 = 65535 & iArr[i18];
            if (j28 >= i19) {
                i18 = i19;
            }
            iArr[(int) (j19 + j28)] = i18 | (i19 << 16);
            j28 += j15;
        }
        for (long j29 = 0; j29 < j19; j29 += j15) {
            int i21 = (int) j29;
            iArr[i21] = (int) (((long) (iArr[i21] << 16)) | j29);
        }
        sort32(iArr, 0, i17);
        long j31 = 0;
        while (j31 < j19) {
            int i22 = (int) j31;
            iArr[i22] = (iArr[i22] << 16) + (iArr[(int) (j19 + j31)] >> 16);
            j31 += j15;
            c12 = c12;
        }
        char c13 = c12;
        sort32(iArr, 0, i17);
        if (j13 <= 10) {
            for (long j32 = 0; j32 < j19; j32 += j15) {
                int i23 = (int) (j19 + j32);
                iArr[i23] = ((iArr[(int) j32] & 65535) << 10) | (iArr[i23] & 1023);
            }
            long j33 = j15;
            while (j33 < j13 - j15) {
                long j34 = 0;
                while (j34 < j19) {
                    iArr[(int) j34] = (int) (((long) ((iArr[(int) (j19 + j34)] & (-1024)) << 6)) | j34);
                    j34 += j15;
                    j33 = j33;
                }
                long j35 = j33;
                sort32(iArr, 0, i17);
                for (long j36 = 0; j36 < j19; j36 += j15) {
                    int i24 = (int) j36;
                    iArr[i24] = (iArr[i24] << 20) | iArr[(int) (j19 + j36)];
                }
                sort32(iArr, 0, i17);
                for (long j37 = 0; j37 < j19; j37 += j15) {
                    int i25 = iArr[(int) j37];
                    int i26 = 1048575 & i25;
                    int i27 = (int) (j19 + j37);
                    int i28 = (i25 & ConnectionsClient.MAX_BYTES_DATA_SIZE) | (iArr[i27] & 1023);
                    if (i26 >= i28) {
                        i26 = i28;
                    }
                    iArr[i27] = i26;
                }
                j33 = j35 + j15;
            }
            for (long j38 = 0; j38 < j19; j38 += j15) {
                int i29 = (int) (j19 + j38);
                iArr[i29] = iArr[i29] & 1023;
            }
            i13 = 65535;
            i14 = -65536;
            c11 = c13;
            j16 = j15;
        } else {
            int i31 = -65536;
            for (long j39 = 0; j39 < j19; j39 += j15) {
                int i32 = (int) (j19 + j39);
                iArr[i32] = (iArr[(int) j39] << 16) | (iArr[i32] & 65535);
            }
            long j41 = j15;
            while (j41 < j13 - j15) {
                long j42 = 0;
                while (j42 < j19) {
                    int i33 = i31;
                    iArr[(int) j42] = (int) (((long) (iArr[(int) (j19 + j42)] & i33)) | j42);
                    j42 += j15;
                    i12 = i12;
                    i31 = i33;
                }
                int i34 = i12;
                int i35 = i31;
                sort32(iArr, 0, i17);
                long j43 = 0;
                while (j43 < j19) {
                    int i36 = (int) j43;
                    long j44 = j15;
                    iArr[i36] = (iArr[i36] << 16) | (iArr[(int) (j19 + j43)] & i34);
                    j43 += j44;
                    c13 = c13;
                    j15 = j44;
                }
                char c14 = c13;
                long j45 = j15;
                if (j41 < j13 - 2) {
                    for (long j46 = 0; j46 < j19; j46 += j45) {
                        int i37 = (int) (j19 + j46);
                        iArr[i37] = (iArr[(int) j46] & i35) | (iArr[i37] >> 16);
                    }
                    sort32(iArr, i17, (int) (j19 * 2));
                    for (long j47 = 0; j47 < j19; j47 += j45) {
                        int i38 = (int) (j19 + j47);
                        iArr[i38] = (iArr[i38] << 16) | (iArr[(int) j47] & i34);
                    }
                }
                sort32(iArr, 0, i17);
                for (long j48 = 0; j48 < j19; j48 += j45) {
                    int i39 = (int) (j19 + j48);
                    int i41 = iArr[i39];
                    int i42 = (i41 & i35) | (iArr[(int) j48] & i34);
                    if (i42 < i41) {
                        iArr[i39] = i42;
                    }
                }
                j41 += j45;
                i12 = i34;
                c13 = c14;
                i31 = i35;
                j15 = j45;
            }
            i13 = i12;
            i14 = i31;
            c11 = c13;
            j16 = j15;
            for (long j49 = 0; j49 < j19; j49 += j16) {
                int i43 = (int) (j19 + j49);
                iArr[i43] = iArr[i43] & i13;
            }
        }
        long j51 = 0;
        if (sArr != null) {
            while (j51 < j19) {
                int i44 = (int) j51;
                iArr[i44] = (int) (((long) (sArr[i44] << 16)) + j51);
                j51 += j16;
            }
        } else {
            while (j51 < j19) {
                iArr[(int) j51] = (int) (((long) (get_q_short(iArr, (int) (((long) i11) + j51)) << 16)) + j51);
                j51 += j16;
            }
        }
        sort32(iArr, 0, i17);
        long j52 = j11;
        int i45 = i13;
        long j53 = 0;
        while (true) {
            j17 = j19 / 2;
            if (j53 >= j17) {
                break;
            }
            long j54 = j53 * 2;
            long j55 = j19 + j54;
            int i46 = (int) j55;
            int i47 = i45;
            int i48 = iArr[i46] & 1;
            char c15 = c11;
            int i49 = (int) (((long) i48) + j54);
            long j56 = j52;
            int i51 = (int) (j56 >> c15);
            bArr[i51] = (byte) ((i48 << ((int) (j56 & j27))) ^ bArr[i51]);
            j52 = j56 + j12;
            iArr[i46] = (iArr[(int) j54] << 16) | i49;
            iArr[(int) (j55 + j16)] = (iArr[(int) (j54 + j16)] << 16) | (i49 ^ 1);
            j53 += j16;
            i45 = i47;
            j19 = j14;
            c11 = c15;
        }
        int i52 = i45;
        char c16 = c11;
        long j57 = j14 * 2;
        sort32(iArr, i17, (int) j57);
        long j58 = j13 * 2;
        long j59 = j52 + ((j58 - 3) * j12 * j17);
        long j61 = 0;
        while (true) {
            j18 = j57;
            if (j61 >= j17) {
                break;
            }
            long j62 = j61 * 2;
            long j63 = j58;
            long j64 = j14 + j62;
            int i53 = iArr[(int) j64];
            int i54 = i53 & 1;
            int i55 = (int) (((long) i54) + j62);
            int i56 = i55 ^ 1;
            int i57 = (int) (j59 >> c16);
            bArr[i57] = (byte) (bArr[i57] ^ (i54 << ((int) (j59 & j27))));
            j59 += j12;
            iArr[(int) j62] = (i53 & i52) | (i55 << 16);
            iArr[(int) (j62 + j16)] = (i56 << 16) | (iArr[(int) (j64 + j16)] & i52);
            j61 += j16;
            j57 = j18;
            j58 = j63;
        }
        sort32(iArr, 0, i17);
        long j65 = j59 - (((j58 - 2) * j12) * j17);
        short[] sArr2 = new short[i17 * 4];
        for (long j66 = 0; j66 < j18; j66 += j16) {
            long j67 = j66 * 2;
            int i58 = iArr[(int) j66];
            sArr2[(int) j67] = (short) i58;
            sArr2[(int) (j67 + j16)] = (short) ((i58 & i14) >> 16);
        }
        for (long j68 = 0; j68 < j17; j68 += j16) {
            long j69 = j68 * 2;
            sArr2[(int) j68] = (short) ((iArr[(int) j69] & i52) >>> 1);
            sArr2[(int) (j68 + j17)] = (short) ((iArr[(int) (j69 + j16)] & i52) >>> 1);
        }
        for (long j71 = 0; j71 < j17; j71 += j16) {
            long j72 = j71 * 2;
            iArr[(int) (j14 + (j14 / 4) + j71)] = sArr2[(int) j72] | (sArr2[(int) (j72 + j16)] << 16);
        }
        long j73 = j12 * 2;
        long j74 = j14 + (j14 / 4);
        long j75 = j13 - j16;
        cbrecursion(bArr, j65, j73, null, ((int) j74) * 2, j75, j17, iArr);
        cbrecursion(bArr, j65 + j12, j73, null, (int) ((j74 * 2) + j17), j75, j17, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j11, long j12) {
        long j13 = j12;
        int[] iArr = new int[(int) (j13 * 2)];
        int i11 = (int) j13;
        short[] sArr2 = new short[i11];
        while (true) {
            short s11 = 0;
            for (int i12 = 0; i12 < (((((j11 * 2) - 1) * j13) / 2) + 7) / 8; i12++) {
                bArr[i12] = 0;
            }
            cbrecursion(bArr, 0L, 1L, sArr, 0, j11, j13, iArr);
            for (int i13 = 0; i13 < j12; i13++) {
                sArr2[i13] = (short) i13;
            }
            int i14 = 0;
            for (int i15 = 0; i15 < j11; i15++) {
                layer(sArr2, bArr, i14, i15, i11);
                i14 = (int) (((long) i14) + (j12 >> 4));
            }
            for (int i16 = (int) (j11 - 2); i16 >= 0; i16--) {
                layer(sArr2, bArr, i14, i16, i11);
                i14 = (int) (((long) i14) + (j12 >> 4));
            }
            int i17 = 0;
            while (i17 < j12) {
                short s12 = (short) (s11 | (sArr[i17] ^ sArr2[i17]));
                i17++;
                s11 = s12;
            }
            if (s11 == 0) {
                return;
            } else {
                j13 = j12;
            }
        }
    }

    private static int ctz(long j11) {
        long j12 = ~j11;
        long j13 = 72340172838076673L;
        long j14 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j13 &= j12 >>> i11;
            j14 += j13;
        }
        long j15 = 578721382704613384L & j14;
        long j16 = j15 | (j15 >>> 1);
        long j17 = j16 | (j16 >>> 2);
        long j18 = j14 >>> 8;
        long j19 = j14 + (j18 & j17);
        for (int i12 = 2; i12 < 8; i12++) {
            j17 &= j17 >>> 8;
            j18 >>>= 8;
            j19 += j18 & j17;
        }
        return ((int) j19) & 255;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11;
        int i12;
        int i13 = this.SYS_T;
        short[] sArr = new short[i13 + 1];
        int i14 = this.SYS_N;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i13 * 2];
        short[] sArr4 = new short[i13 * 2];
        short[] sArr5 = new short[i13 + 1];
        short[] sArr6 = new short[i14];
        byte[] bArr4 = new byte[i14 / 8];
        int i15 = 0;
        while (true) {
            i11 = this.SYND_BYTES;
            if (i15 >= i11) {
                break;
            }
            bArr4[i15] = bArr3[i15];
            i15++;
        }
        while (i11 < this.SYS_N / 8) {
            bArr4[i11] = 0;
            i11++;
        }
        int i16 = 0;
        while (true) {
            i12 = this.SYS_T;
            if (i16 >= i12) {
                break;
            }
            sArr[i16] = Utils.load_gf(bArr2, (i16 * 2) + 40, this.GFMASK);
            i16++;
        }
        sArr[i12] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i17 = 0; i17 < this.SYS_N / 8; i17++) {
            bArr[i17] = 0;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.SYS_N; i19++) {
            short sGf_iszero = (short) (this.f99036gf.gf_iszero(sArr6[i19]) & 1);
            int i21 = i19 / 8;
            bArr[i21] = (byte) (bArr[i21] | (sGf_iszero << (i19 % 8)));
            i18 += sGf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i22 = this.SYS_T ^ i18;
        for (int i23 = 0; i23 < this.SYS_T * 2; i23++) {
            i22 |= sArr3[i23] ^ sArr4[i23];
        }
        return (((i22 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s11) {
        int i11 = this.SYS_T;
        short sGf_mul = sArr[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            sGf_mul = (short) (this.f99036gf.gf_mul(sGf_mul, s11) ^ sArr[i12]);
        }
        return sGf_mul;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i11;
        int i12 = this.SYS_T;
        short[] sArr = new short[i12 * 2];
        short[] sArr2 = new short[i12];
        byte[] bArr2 = new byte[i12];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i13 = 0; i13 < this.SYS_T * 2; i13++) {
                    sArr[i13] = Utils.load_gf(bArr3, i13 * 2, this.GFMASK);
                }
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    i11 = this.SYS_T;
                    if (i14 >= i11 * 2 || i15 >= i11) {
                        break;
                    }
                    short s11 = sArr[i14];
                    if (s11 < this.SYS_N) {
                        sArr2[i15] = s11;
                        i15++;
                    }
                    i14++;
                }
                if (i15 < i11) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i16 = 0; i16 < this.SYS_T; i16++) {
                    sArr2[i16] = Utils.load_gf(bArr4, i16 * 2, this.GFMASK);
                }
            }
            boolean z11 = false;
            for (int i17 = 1; i17 < this.SYS_T && !z11; i17++) {
                for (int i18 = 0; i18 < i17; i18++) {
                    if (sArr2[i17] == sArr2[i18]) {
                        z11 = true;
                        break;
                    }
                }
            }
            if (!z11) {
                break;
            }
        }
        for (int i19 = 0; i19 < this.SYS_T; i19++) {
            bArr2[i19] = (byte) (1 << (sArr2[i19] & 7));
        }
        for (short s12 = 0; s12 < this.SYS_N / 8; s12 = (short) (s12 + 1)) {
            bArr[s12] = 0;
            for (int i21 = 0; i21 < this.SYS_T; i21++) {
                bArr[s12] = (byte) ((((short) (same_mask32(s12, (short) (sArr2[i21] >> 3)) & 255)) & bArr2[i21]) | bArr[s12]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i11;
        int i12 = this.SYS_T;
        int i13 = 2;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i12 + 1, i12);
        sArr2[0][0] = 1;
        System.arraycopy(sArr, 0, sArr2[1], 0, this.SYS_T);
        int[] iArr = new int[(this.SYS_T * 2) - 1];
        while (true) {
            i11 = this.SYS_T;
            if (i13 >= i11) {
                break;
            }
            this.f99036gf.gf_sqr_poly(i11, this.poly, sArr2[i13], sArr2[i13 >>> 1], iArr);
            int[] iArr2 = iArr;
            this.f99036gf.gf_mul_poly(this.SYS_T, this.poly, sArr2[i13 + 1], sArr2[i13], sArr, iArr2);
            iArr = iArr2;
            i13 += 2;
        }
        if (i13 == i11) {
            this.f99036gf.gf_sqr_poly(i11, this.poly, sArr2[i13], sArr2[i13 >>> 1], iArr);
        }
        int i14 = 0;
        while (true) {
            int i15 = this.SYS_T;
            if (i14 >= i15) {
                System.arraycopy(sArr2[i15], 0, sArr, 0, i15);
                return 0;
            }
            int i16 = i14 + 1;
            for (int i17 = i16; i17 < this.SYS_T; i17++) {
                short sGf_iszero = this.f99036gf.gf_iszero(sArr2[i14][i14]);
                for (int i18 = i14; i18 < this.SYS_T + 1; i18++) {
                    short[] sArr3 = sArr2[i18];
                    sArr3[i14] = (short) (sArr3[i14] ^ ((short) (sArr3[i17] & sGf_iszero)));
                }
            }
            short s11 = sArr2[i14][i14];
            if (s11 == 0) {
                return -1;
            }
            short sGf_inv = this.f99036gf.gf_inv(s11);
            for (int i19 = i14; i19 < this.SYS_T + 1; i19++) {
                short[] sArr4 = sArr2[i19];
                sArr4[i14] = this.f99036gf.gf_mul(sArr4[i14], sGf_inv);
            }
            for (int i21 = 0; i21 < this.SYS_T; i21++) {
                if (i21 != i14) {
                    short s12 = sArr2[i14][i21];
                    for (int i22 = i14; i22 <= this.SYS_T; i22++) {
                        short[] sArr5 = sArr2[i22];
                        sArr5[i21] = (short) (sArr5[i21] ^ this.f99036gf.gf_mul(sArr5[i14], s12));
                    }
                }
            }
            i14 = i16;
        }
    }

    static short get_q_short(int[] iArr, int i11) {
        int i12 = i11 / 2;
        return (short) (i11 % 2 == 0 ? iArr[i12] : (iArr[i12] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i11, int i12, int i13) {
        int i14 = 1 << i12;
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16 += i14 * 2) {
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = i16 + i17;
                short s11 = sArr[i18];
                int i19 = i18 + i14;
                int i21 = (sArr[i19] ^ s11) & (-((bArr[(i15 >> 3) + i11] >> (i15 & 7)) & 1));
                sArr[i18] = (short) (s11 ^ i21);
                sArr[i19] = (short) (sArr[i19] ^ i21);
                i15++;
            }
        }
    }

    private static int min(short s11, int i11) {
        return s11 < i11 ? s11 : i11;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long jLoad8;
        int i11 = 64;
        long[] jArr2 = new long[64];
        int i12 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i13 = this.PK_NROWS - 32;
        int i14 = i13 / 8;
        int i15 = i13 % 8;
        char c11 = 0;
        if (this.usePadding) {
            for (int i16 = 0; i16 < 32; i16++) {
                for (int i17 = 0; i17 < 9; i17++) {
                    bArr2[i17] = bArr[i13 + i16][i14 + i17];
                }
                int i18 = 0;
                while (i18 < 8) {
                    int i19 = i18 + 1;
                    bArr2[i18] = (byte) (((bArr2[i18] & 255) >> i15) | (bArr2[i19] << (8 - i15)));
                    i18 = i19;
                }
                jArr2[i16] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i21 = 0; i21 < 32; i21++) {
                jArr2[i21] = Utils.load8(bArr[i13 + i21], i14);
            }
        }
        long j11 = 0;
        jArr[0] = 0;
        int i22 = 0;
        while (true) {
            long j12 = 1;
            if (i22 >= 32) {
                int i23 = 0;
                while (i23 < i12) {
                    int i24 = i23 + 1;
                    int i25 = i24;
                    while (i25 < i11) {
                        int i26 = i13 + i23;
                        int i27 = i13 + i25;
                        long[] jArr4 = jArr3;
                        long jSame_mask64 = ((long) (sArr[i26] ^ sArr[i27])) & same_mask64((short) i25, (short) jArr4[i23]);
                        sArr[i26] = (short) (((long) sArr[i26]) ^ jSame_mask64);
                        sArr[i27] = (short) (jSame_mask64 ^ ((long) sArr[i27]));
                        i25++;
                        i24 = i24;
                        jArr3 = jArr4;
                        i11 = 64;
                        i12 = 32;
                    }
                    i23 = i24;
                }
                long[] jArr5 = jArr3;
                for (int i28 = 0; i28 < this.PK_NROWS; i28++) {
                    if (this.usePadding) {
                        for (int i29 = 0; i29 < 9; i29++) {
                            bArr2[i29] = bArr[i28][i14 + i29];
                        }
                        int i31 = 0;
                        while (i31 < 8) {
                            int i32 = i31 + 1;
                            bArr2[i31] = (byte) (((bArr2[i31] & 255) >> i15) | (bArr2[i32] << (8 - i15)));
                            i31 = i32;
                        }
                        jLoad8 = Utils.load8(bArr2, 0);
                    } else {
                        jLoad8 = Utils.load8(bArr[i28], i14);
                    }
                    for (int i33 = 0; i33 < 32; i33++) {
                        long j13 = jArr5[i33];
                        long j14 = ((jLoad8 >> i33) ^ (jLoad8 >> ((int) j13))) & 1;
                        jLoad8 = (jLoad8 ^ (j14 << ((int) j13))) ^ (j14 << i33);
                    }
                    if (this.usePadding) {
                        Utils.store8(bArr2, 0, jLoad8);
                        byte[] bArr3 = bArr[i28];
                        int i34 = i14 + 8;
                        int i35 = 8 - i15;
                        bArr3[i34] = (byte) ((((bArr3[i34] & 255) >>> i15) << i15) | ((bArr2[7] & 255) >>> i35));
                        bArr3[i14] = (byte) (((bArr2[0] & 255) << i15) | (((bArr3[i14] & 255) << i35) >>> i35));
                        for (int i36 = 7; i36 >= 1; i36--) {
                            bArr[i28][i14 + i36] = (byte) (((bArr2[i36] & 255) << i15) | ((bArr2[i36 - 1] & 255) >>> i35));
                        }
                    } else {
                        Utils.store8(bArr[i28], i14, jLoad8);
                    }
                }
                return 0;
            }
            long j15 = jArr2[i22];
            int i37 = i22 + 1;
            long j16 = j11;
            for (int i38 = i37; i38 < 32; i38++) {
                j15 |= jArr2[i38];
            }
            if (j15 == j16) {
                return -1;
            }
            int iCtz = ctz(j15);
            char c12 = c11;
            long j17 = iCtz;
            jArr3[i22] = j17;
            jArr[c12] = jArr[c12] | (1 << ((int) j17));
            for (int i39 = i37; i39 < 32; i39++) {
                long j18 = jArr2[i22];
                jArr2[i22] = j18 ^ (jArr2[i39] & (((j18 >> iCtz) & 1) - 1));
            }
            int i41 = i37;
            while (i41 < 32) {
                long j19 = jArr2[i41];
                long j21 = j12;
                jArr2[i41] = j19 ^ (jArr2[i22] & (-((j19 >> iCtz) & j21)));
                i41++;
                j12 = j21;
                c12 = 0;
            }
            c11 = c12;
            i22 = i37;
            j11 = j16;
        }
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i11;
        int i12;
        int i13 = this.SYS_T;
        short[] sArr2 = new short[i13 + 1];
        byte b11 = 1;
        sArr2[i13] = 1;
        for (int i14 = 0; i14 < this.SYS_T; i14++) {
            sArr2[i14] = Utils.load_gf(bArr2, (i14 * 2) + 40, this.GFMASK);
        }
        int i15 = 1 << this.GFBITS;
        long[] jArr2 = new long[i15];
        for (int i16 = 0; i16 < (1 << this.GFBITS); i16++) {
            long j11 = iArr[i16];
            jArr2[i16] = j11;
            long j12 = j11 << 31;
            jArr2[i16] = j12;
            long j13 = j12 | ((long) i16);
            jArr2[i16] = j13;
            jArr2[i16] = j13 & Long.MAX_VALUE;
        }
        sort64(jArr2, 0, i15);
        for (int i17 = 1; i17 < (1 << this.GFBITS); i17++) {
            if ((jArr2[i17 - 1] >> 31) == (jArr2[i17] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i18 = 0; i18 < (1 << this.GFBITS); i18++) {
            sArr[i18] = (short) (jArr2[i18] & ((long) this.GFMASK));
        }
        int i19 = 0;
        while (true) {
            i11 = this.SYS_N;
            if (i19 >= i11) {
                break;
            }
            sArr3[i19] = Utils.bitrev(sArr[i19], this.GFBITS);
            i19++;
        }
        short[] sArr4 = new short[i11];
        root(sArr4, sArr2, sArr3);
        int i21 = 0;
        while (true) {
            i12 = this.SYS_N;
            if (i21 >= i12) {
                break;
            }
            sArr4[i21] = this.f99036gf.gf_inv(sArr4[i21]);
            i21++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i12 / 8);
        for (int i22 = 0; i22 < this.PK_NROWS; i22++) {
            for (int i23 = 0; i23 < this.SYS_N / 8; i23++) {
                bArr3[i22][i23] = 0;
            }
        }
        int i24 = 0;
        while (i24 < this.SYS_T) {
            for (int i25 = 0; i25 < this.SYS_N; i25 += 8) {
                int i26 = 0;
                while (true) {
                    int i27 = this.GFBITS;
                    if (i26 < i27) {
                        bArr3[(i27 * i24) + i26][i25 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i25 + 7] >>> i26) & 1)) << 1)) | ((sArr4[i25 + 6] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 5] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 4] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 3] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 2] >>> i26) & 1))) << 1)) | ((sArr4[i25 + 1] >>> i26) & 1))) << 1)) | ((sArr4[i25] >>> i26) & 1));
                        i26++;
                    }
                }
            }
            for (int i28 = 0; i28 < this.SYS_N; i28++) {
                sArr4[i28] = this.f99036gf.gf_mul(sArr4[i28], sArr3[i28]);
            }
            i24++;
        }
        int i29 = 0;
        while (true) {
            int i31 = this.PK_NROWS;
            if (i29 >= i31) {
                if (bArr != null) {
                    if (!this.usePadding) {
                        int i32 = ((this.SYS_N - i31) + 7) / 8;
                        int i33 = 0;
                        while (true) {
                            int i34 = this.PK_NROWS;
                            if (i33 >= i34) {
                                break;
                            }
                            System.arraycopy(bArr3[i33], i34 / 8, bArr, i32 * i33, i32);
                            i33++;
                        }
                    } else {
                        int i35 = i31 % 8;
                        if (i35 != 0) {
                            int i36 = 0;
                            int i37 = 0;
                            while (true) {
                                int i38 = this.PK_NROWS;
                                if (i36 >= i38) {
                                    break;
                                }
                                int i39 = (i38 - 1) / 8;
                                while (i39 < (this.SYS_N / 8) - 1) {
                                    byte[] bArr4 = bArr3[i36];
                                    int i41 = (bArr4[i39] & 255) >>> i35;
                                    i39++;
                                    bArr[i37] = (byte) ((bArr4[i39] << (8 - i35)) | i41);
                                    i37++;
                                }
                                bArr[i37] = (byte) ((bArr3[i36][i39] & 255) >>> i35);
                                i36++;
                                i37++;
                            }
                        } else {
                            System.arraycopy(bArr3[i24], (i31 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        }
                    }
                }
                return 0;
            }
            i24 = i29 >>> 3;
            int i42 = i29 & 7;
            if (this.usePivots && i29 == i31 - 32) {
                if (mov_columns(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i43 = i29 + 1;
            for (int i44 = i43; i44 < this.PK_NROWS; i44++) {
                byte b12 = (byte) (-((byte) (((byte) (((byte) (bArr3[i29][i24] ^ bArr3[i44][i24])) >> i42)) & b11)));
                int i45 = 0;
                while (i45 < this.SYS_N / 8) {
                    byte[] bArr5 = bArr3[i29];
                    bArr5[i45] = (byte) (bArr5[i45] ^ (bArr3[i44][i45] & b12));
                    i45++;
                    b11 = b11;
                }
            }
            byte b13 = b11;
            if (((bArr3[i29][i24] >> i42) & 1) == 0) {
                return -1;
            }
            for (int i46 = 0; i46 < this.PK_NROWS; i46++) {
                if (i46 != i29) {
                    byte b14 = (byte) (-((byte) (((byte) (bArr3[i46][i24] >> i42)) & 1)));
                    for (int i47 = 0; i47 < this.SYS_N / 8; i47++) {
                        byte[] bArr6 = bArr3[i46];
                        bArr6[i47] = (byte) (bArr6[i47] ^ (bArr3[i29][i47] & b14));
                    }
                }
            }
            i29 = i43;
            b11 = b13;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i11 = 0; i11 < this.SYS_N; i11++) {
            sArr[i11] = eval(sArr2, sArr3[i11]);
        }
    }

    private static byte same_mask32(short s11, short s12) {
        return (byte) ((-(((s11 ^ s12) - 1) >>> 31)) & 255);
    }

    private static long same_mask64(short s11, short s12) {
        return -((((long) (s11 ^ s12)) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        int i14 = 1;
        while (i14 < i13 - i14) {
            i14 += i14;
        }
        for (int i15 = i14; i15 > 0; i15 >>>= 1) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13 - i15; i17++) {
                if ((i17 & i15) == 0) {
                    int i18 = i11 + i17;
                    int i19 = i18 + i15;
                    int i21 = iArr[i19];
                    int i22 = iArr[i18];
                    int i23 = i21 ^ i22;
                    int i24 = i21 - i22;
                    int i25 = ((((i21 ^ i24) & i23) ^ i24) >> 31) & i23;
                    iArr[i18] = i22 ^ i25;
                    iArr[i19] = iArr[i19] ^ i25;
                }
            }
            for (int i26 = i14; i26 > i15; i26 >>>= 1) {
                while (i16 < i13 - i26) {
                    if ((i16 & i15) == 0) {
                        int i27 = i11 + i16;
                        int i28 = i27 + i15;
                        int i29 = iArr[i28];
                        for (int i31 = i26; i31 > i15; i31 >>>= 1) {
                            int i32 = i27 + i31;
                            int i33 = iArr[i32];
                            int i34 = i33 ^ i29;
                            int i35 = i33 - i29;
                            int i36 = i34 & ((i35 ^ ((i35 ^ i33) & i34)) >> 31);
                            i29 ^= i36;
                            iArr[i32] = i33 ^ i36;
                        }
                        iArr[i28] = i29;
                    }
                    i16++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        int i14 = 1;
        while (i14 < i13 - i14) {
            i14 += i14;
        }
        for (int i15 = i14; i15 > 0; i15 >>>= 1) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13 - i15; i17++) {
                if ((i17 & i15) == 0) {
                    int i18 = i11 + i17;
                    int i19 = i18 + i15;
                    long j11 = jArr[i19];
                    long j12 = jArr[i18];
                    long j13 = (j11 ^ j12) & (-((j11 - j12) >>> 63));
                    jArr[i18] = j12 ^ j13;
                    jArr[i19] = jArr[i19] ^ j13;
                }
            }
            for (int i21 = i14; i21 > i15; i21 >>>= 1) {
                while (i16 < i13 - i21) {
                    if ((i16 & i15) == 0) {
                        int i22 = i11 + i16;
                        int i23 = i22 + i15;
                        long j14 = jArr[i23];
                        for (int i24 = i21; i24 > i15; i24 >>>= 1) {
                            int i25 = i22 + i24;
                            long j15 = jArr[i25];
                            long j16 = (-((j15 - j14) >>> 63)) & (j14 ^ j15);
                            j14 ^= j16;
                            jArr[i25] = j15 ^ j16;
                        }
                        jArr[i23] = j14;
                    }
                    i16++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        short s11 = (short) (bArr[0] & 1);
        short s12 = sArr3[0];
        short sEval = eval(sArr2, s12);
        GF gf2 = this.f99036gf;
        short sGf_inv = (short) ((-s11) & gf2.gf_inv(gf2.gf_sq(sEval)));
        sArr[0] = sGf_inv;
        for (int i11 = 1; i11 < this.SYS_T * 2; i11++) {
            sGf_inv = this.f99036gf.gf_mul(sGf_inv, s12);
            sArr[i11] = sGf_inv;
        }
        for (int i12 = 1; i12 < this.SYS_N; i12++) {
            short s13 = (short) ((bArr[i12 / 8] >> (i12 % 8)) & 1);
            short s14 = sArr3[i12];
            short sEval2 = eval(sArr2, s14);
            GF gf3 = this.f99036gf;
            short sGf_mul = this.f99036gf.gf_mul(gf3.gf_inv(gf3.gf_sq(sEval2)), s13);
            sArr[0] = (short) (sArr[0] ^ sGf_mul);
            for (int i13 = 1; i13 < this.SYS_T * 2; i13++) {
                sGf_mul = this.f99036gf.gf_mul(sGf_mul, s14);
                sArr[i13] = (short) (sArr[i13] ^ sGf_mul);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i11 = this.PK_NROWS % 8;
        for (int i12 = 0; i12 < this.SYND_BYTES; i12++) {
            bArr[i12] = 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.PK_NROWS; i14++) {
            for (int i15 = 0; i15 < this.SYS_N / 8; i15++) {
                sArr[i15] = 0;
            }
            int i16 = 0;
            while (true) {
                int i17 = this.PK_ROW_BYTES;
                if (i16 >= i17) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i17) + i16] = bArr2[i13 + i16];
                i16++;
            }
            if (this.usePadding) {
                for (int i18 = (this.SYS_N / 8) - 1; i18 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i18--) {
                    sArr[i18] = (short) ((((sArr[i18] & 255) << i11) | ((sArr[i18 - 1] & 255) >>> (8 - i11))) & 255);
                }
            }
            int i19 = i14 / 8;
            int i21 = i14 % 8;
            sArr[i19] = (short) (sArr[i19] | (1 << i21));
            byte b11 = 0;
            for (int i22 = 0; i22 < this.SYS_N / 8; i22++) {
                b11 = (byte) (b11 ^ (sArr[i22] & bArr3[i22]));
            }
            byte b12 = (byte) ((b11 >>> 4) ^ b11);
            byte b13 = (byte) (b12 ^ (b12 >>> 2));
            bArr[i19] = (byte) ((((byte) (1 & ((byte) (b13 ^ (b13 >>> 1))))) << i21) | bArr[i19]);
            i13 += this.PK_ROW_BYTES;
        }
    }

    int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & 255) >>> (this.PK_NROWS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    int check_pk_padding(byte[] bArr) {
        byte b11 = 0;
        for (int i11 = 0; i11 < this.PK_NROWS; i11++) {
            int i12 = this.PK_ROW_BYTES;
            b11 = (byte) (b11 | bArr[((i11 * i12) + i12) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b11 & 255) >>> (this.PK_NCOLS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i11;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i12 = (this.SYS_N / 8) + ((1 << this.GFBITS) * 4) + this.IRR_BYTES;
        int i13 = i12 + 32;
        byte[] bArr3 = new byte[i13];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i13);
        if (bArr.length <= 40) {
            short[] sArr = new short[this.SYS_T];
            int i14 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i14];
            int i15 = i12 - i14;
            for (int i16 = 0; i16 < this.SYS_T; i16++) {
                sArr[i16] = Utils.load_gf(bArr3, (i16 * 2) + i15, this.GFMASK);
            }
            generate_irr_poly(sArr);
            for (int i17 = 0; i17 < this.SYS_T; i17++) {
                Utils.store_gf(bArr4, i17 * 2, sArr[i17]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i18 = this.IRR_BYTES;
        if (length <= i18 + 40) {
            int i19 = this.GFBITS;
            int[] iArr = new int[1 << i19];
            short[] sArr2 = new short[1 << i19];
            int i21 = (i12 - i18) - ((1 << i19) * 4);
            int i22 = 0;
            while (true) {
                i11 = this.GFBITS;
                if (i22 >= (1 << i11)) {
                    break;
                }
                iArr[i22] = Utils.load4(bArr3, (i22 * 4) + i21);
                i22++;
            }
            if (this.usePivots) {
                pk_gen(null, bArr2, iArr, sArr2, new long[]{0});
            } else {
                int i23 = 1 << i11;
                long[] jArr = new long[i23];
                for (int i24 = 0; i24 < (1 << this.GFBITS); i24++) {
                    long j11 = iArr[i24];
                    jArr[i24] = j11;
                    long j12 = j11 << 31;
                    jArr[i24] = j12;
                    long j13 = j12 | ((long) i24);
                    jArr[i24] = j13;
                    jArr[i24] = j13 & Long.MAX_VALUE;
                }
                sort64(jArr, 0, i23);
                for (int i25 = 0; i25 < (1 << this.GFBITS); i25++) {
                    sArr2[i25] = (short) (jArr[i25] & ((long) this.GFMASK));
                }
            }
            int i26 = this.COND_BYTES;
            byte[] bArr5 = new byte[i26];
            int i27 = this.GFBITS;
            controlbitsfrompermutation(bArr5, sArr2, i27, 1 << i27);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i26);
        }
        int privateKeySize = getPrivateKeySize();
        int i28 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i28 / 8), i28 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i11 = this.GFBITS;
        short[] sArr = new short[1 << i11];
        long[] jArr = {0};
        int[] iArr = new int[1 << i11];
        int i12 = (this.SYS_N / 8) + ((1 << i11) * 4);
        byte[] bArr3 = new byte[i12];
        int i13 = ((i12 - 32) - this.IRR_BYTES) - ((1 << i11) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i12);
        for (int i14 = 0; i14 < (1 << this.GFBITS); i14++) {
            iArr[i14] = Utils.load4(bArr3, (i14 * 4) + i13);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return this.COND_BYTES + this.IRR_BYTES + (this.SYS_N / 8) + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i11 = this.PK_NROWS;
        return i11 * ((this.SYS_N / 8) - ((i11 - 1) / 8));
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.SYS_N;
        byte[] bArr4 = new byte[i11 / 8];
        int i12 = (i11 / 8) + 1 + this.SYND_BYTES;
        byte[] bArr5 = new byte[i12];
        int iCheck_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        short sDecrypt = (short) (((short) (((short) (((byte) decrypt(bArr4, bArr3, bArr2)) - 1)) >> 8)) & 255);
        bArr5[0] = (byte) (sDecrypt & 1);
        int i13 = 0;
        while (i13 < this.SYS_N / 8) {
            int i14 = i13 + 1;
            bArr5[i14] = (byte) ((bArr4[i13] & sDecrypt) | ((~sDecrypt) & bArr3[i13 + 40 + this.IRR_BYTES + this.COND_BYTES]));
            i13 = i14;
        }
        for (int i15 = 0; i15 < this.SYND_BYTES; i15++) {
            bArr5[(this.SYS_N / 8) + 1 + i15] = bArr2[i15];
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, i12);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b11 = (byte) iCheck_c_padding;
        for (int i16 = 0; i16 < bArr.length; i16++) {
            bArr[i16] = (byte) (bArr[i16] | b11);
        }
        return iCheck_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i11 = this.SYS_N / 8;
        byte[] bArr4 = new byte[i11];
        int iCheck_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i11);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b11 = (byte) (((byte) iCheck_pk_padding) ^ 255);
        for (int i12 = 0; i12 < this.SYND_BYTES; i12++) {
            bArr[i12] = (byte) (bArr[i12] & b11);
        }
        for (int i13 = 0; i13 < 32; i13++) {
            bArr2[i13] = (byte) (bArr2[i13] & b11);
        }
        return iCheck_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i11;
        int i12;
        int i13;
        short[] sArr;
        int i14;
        long j11;
        int i15 = 32;
        byte[] bArr3 = new byte[32];
        int i16 = 1;
        int i17 = 0;
        byte[] bArr4 = {64};
        secureRandom.nextBytes(bArr3);
        int i18 = (this.SYS_N / 8) + ((1 << this.GFBITS) * 4) + (this.SYS_T * 2);
        int i19 = i18 + 32;
        byte[] bArr5 = new byte[i19];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        while (true) {
            sHAKEDigest.update(bArr4, i17, i16);
            sHAKEDigest.update(bArr3, i17, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i17, i19);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, i18, i18 + 32);
            System.arraycopy(bArr6, i17, bArr2, i17, i15);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i17, i15);
            int i21 = this.SYS_T;
            short[] sArr2 = new short[i21];
            int i22 = i18 - (i21 * 2);
            i11 = i16;
            for (int i23 = i17; i23 < this.SYS_T; i23++) {
                sArr2[i23] = Utils.load_gf(bArr5, (i23 * 2) + i22, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i24 = i17; i24 < this.SYS_T; i24++) {
                    Utils.store_gf(bArr2, 40 + (i24 * 2), sArr2[i24]);
                }
                int i25 = this.GFBITS;
                int[] iArr = new int[i11 << i25];
                i12 = i22 - ((i11 << i25) * 4);
                int i26 = 0;
                while (true) {
                    i13 = this.GFBITS;
                    if (i26 >= (i11 << i13)) {
                        break;
                    }
                    iArr[i26] = Utils.load4(bArr5, (i26 * 4) + i12);
                    i26++;
                }
                sArr = new short[i11 << i13];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            bArr3 = bArrCopyOfRange;
            bArr6 = bArrCopyOfRange2;
            i16 = i11;
            i15 = 32;
            i17 = 0;
        }
        int i27 = this.COND_BYTES;
        byte[] bArr7 = new byte[i27];
        int i28 = this.GFBITS;
        controlbitsfrompermutation(bArr7, sArr, i28, i11 << i28);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i27);
        int i29 = this.SYS_N;
        System.arraycopy(bArr5, i12 - (i29 / 8), bArr2, bArr2.length - (i29 / 8), i29 / 8);
        if (this.usePivots) {
            i14 = 32;
            j11 = jArr[0];
        } else {
            j11 = 4294967295L;
            i14 = 32;
        }
        Utils.store8(bArr2, i14, j11);
    }
}
