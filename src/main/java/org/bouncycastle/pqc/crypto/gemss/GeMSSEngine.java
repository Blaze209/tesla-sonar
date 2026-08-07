package org.bouncycastle.pqc.crypto.gemss;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class GeMSSEngine {
    final int ACCESS_last_equations8;
    Pointer Buffer_NB_WORD_GFqn;
    Pointer Buffer_NB_WORD_MUL;
    final boolean ENABLED_REMOVE_ODD_DEGREE;
    final int HFEDELTA;
    final int HFEDeg;
    final int HFEDegI;
    final int HFEDegJ;
    final int HFENr8;
    final int HFENr8c;
    int HFE_odd_degree;
    final int HFEm;
    final int HFEmq;
    final int HFEmq8;
    final int HFEmr;
    final int HFEmr8;
    final int HFEn;
    int HFEn1h_rightmost;
    int HFEn_1rightmost;
    final int HFEnq;
    final int HFEnr;
    final int HFEnv;
    final int HFEnvq;
    final int HFEnvr;
    final int HFEnvr8;
    final int HFEv;
    final int HFEvq;
    final int HFEvr;
    int II;
    int KP;
    int KX;
    final int LOST_BITS;
    int LTRIANGULAR_NV_SIZE;
    final int LTRIANGULAR_N_SIZE;
    final long MASK_GF2m;
    final long MASK_GF2n;
    final int MATRIXn_SIZE;
    final int MATRIXnv_SIZE;
    final int MLv_GFqn_SIZE;
    int MQv_GFqn_SIZE;
    final int NB_BYTES_EQUATION;
    final int NB_BYTES_GFqm;
    final int NB_BYTES_GFqn;
    final int NB_BYTES_GFqnv;
    int NB_COEFS_HFEPOLY;
    final int NB_ITE;
    int NB_MONOMIAL_PK;
    int NB_MONOMIAL_VINEGAR;
    int NB_UINT_HFEVPOLY;
    int NB_WORD_GF2m;
    int NB_WORD_GF2nv;
    final int NB_WORD_GF2nvm;
    int NB_WORD_GFqn;
    final int NB_WORD_GFqv;
    int NB_WORD_MMUL;
    final int NB_WORD_MUL;
    final int NB_WORD_UNCOMP_EQ;
    int POW_II;
    final int SIZE_DIGEST;
    final int SIZE_DIGEST_UINT;
    final int SIZE_ROW;
    final int SIZE_SEED_SK;
    final int SIZE_SIGN_UNCOMPRESSED;
    final int Sha3BitStrength;
    final int ShakeBitStrength;
    final int VAL_BITS_M;
    private int buffer;
    Mul_GF2x mul;
    private SecureRandom random;
    Rem_GF2n rem;
    SHA3Digest sha3Digest;
    final int NB_BITS_UINT = 64;
    final int LEN_UNROLLED_64 = 4;

    /* JADX INFO: renamed from: org.bouncycastle.pqc.crypto.gemss.GeMSSEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams;

        static {
            int[] iArr = new int[FunctionParams.values().length];
            $SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams = iArr;
            try {
                iArr[FunctionParams.N.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[FunctionParams.NV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[FunctionParams.V.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[FunctionParams.M.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum FunctionParams {
        NV,
        V,
        N,
        M
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0243  */
    /* JADX WARN: Code duplicated, block: B:108:0x024b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0253  */
    /* JADX WARN: Code duplicated, block: B:112:0x0263  */
    /* JADX WARN: Code duplicated, block: B:113:0x0265  */
    /* JADX WARN: Code duplicated, block: B:116:0x026e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0270  */
    /* JADX WARN: Code duplicated, block: B:120:0x0282  */
    /* JADX WARN: Code duplicated, block: B:121:0x028c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0290  */
    /* JADX WARN: Code duplicated, block: B:125:0x029e  */
    /* JADX WARN: Code duplicated, block: B:128:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02da  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0311  */
    /* JADX WARN: Code duplicated, block: B:147:0x0333  */
    /* JADX WARN: Code duplicated, block: B:149:0x033d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0353  */
    /* JADX WARN: Code duplicated, block: B:157:0x0359  */
    /* JADX WARN: Code duplicated, block: B:158:0x0363  */
    /* JADX WARN: Code duplicated, block: B:160:0x0367  */
    /* JADX WARN: Code duplicated, block: B:161:0x0371  */
    /* JADX WARN: Code duplicated, block: B:163:0x0375  */
    /* JADX WARN: Code duplicated, block: B:164:0x037f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0384  */
    /* JADX WARN: Code duplicated, block: B:168:0x0388  */
    /* JADX WARN: Code duplicated, block: B:171:0x038d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0396  */
    /* JADX WARN: Code duplicated, block: B:173:0x039f  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c2 A[LOOP:0: B:175:0x03bc->B:177:0x03c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x03d5 A[LOOP:1: B:179:0x03cd->B:181:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03c7 A[EDGE_INSN: B:184:0x03c7->B:178:0x03c7 BREAK  A[LOOP:0: B:175:0x03bc->B:177:0x03c2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:42:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    /* JADX WARN: Code duplicated, block: B:46:0x017f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0183  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x018f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:58:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0202  */
    /* JADX WARN: Code duplicated, block: B:92:0x0205  */
    /* JADX WARN: Code duplicated, block: B:93:0x0208  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0212  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01c0, please report this as an issue */
    public GeMSSEngine(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Mul_GF2x mul6;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        long jMaskUINT;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        Rem_GF2n rem192_specialized_trinomial_gf2x;
        int i46;
        int i47;
        int i48;
        int i49;
        int i51;
        this.HFEn = i12;
        this.HFEv = i13;
        this.HFEDELTA = i14;
        this.NB_ITE = i15;
        this.HFEDeg = i16;
        this.HFEDegI = i17;
        this.HFEDegJ = i18;
        this.NB_BYTES_GFqn = (i12 >>> 3) + ((i12 & 7) != 0 ? 1 : 0);
        int i52 = i17 + 1;
        this.SIZE_ROW = i52;
        int i53 = i12 + i13;
        this.HFEnv = i53;
        int i54 = i12 >>> 6;
        this.HFEnq = i54;
        int i55 = i12 & 63;
        this.HFEnr = i55;
        int i56 = i53 >>> 6;
        this.HFEnvq = i56;
        int i57 = i53 & 63;
        this.HFEnvr = i57;
        this.SIZE_SEED_SK = i11 >>> 3;
        int i58 = i12 - 1;
        int i59 = ((i58 << 1) >>> 6) + 1;
        this.NB_WORD_MUL = i59;
        if (i59 == 6) {
            mul6 = new Mul_GF2x.Mul6();
        } else if (i59 == 9) {
            mul6 = new Mul_GF2x.Mul9();
        } else if (i59 == 17) {
            mul6 = new Mul_GF2x.Mul17();
        } else if (i59 != 12) {
            if (i59 == 13) {
                mul6 = new Mul_GF2x.Mul13();
            }
            i19 = 64 - i55;
            int i61 = i12 - i14;
            this.HFEm = i61;
            int i62 = i61 >>> 6;
            this.HFEmq = i62;
            i21 = i61 & 63;
            this.HFEmr = i21;
            i22 = i13 >>> 6;
            this.HFEvq = i22;
            i23 = i13 & 63;
            this.HFEvr = i23;
            if (i23 != 0) {
                i24 = i22 + 1;
            } else {
                i24 = i22;
            }
            this.NB_WORD_GFqv = i24;
            int i63 = i61 >>> 3;
            this.HFEmq8 = i63;
            i25 = i61 & 7;
            this.HFEmr8 = i25;
            if (i25 != 0) {
                i26 = 1;
            } else {
                i26 = 0;
            }
            this.NB_BYTES_GFqm = i63 + i26;
            this.NB_WORD_UNCOMP_EQ = ((((i56 + 1) * i56) >>> 1) * 64) + ((i56 + 1) * i57);
            i27 = i53 & 7;
            this.HFEnvr8 = i27;
            int i64 = i53 >>> 3;
            if (i27 != 0) {
                i28 = 1;
            } else {
                i28 = 0;
            }
            this.NB_BYTES_GFqnv = i64 + i28;
            this.VAL_BITS_M = Math.min(i14 + i13, 8 - i25);
            this.MASK_GF2m = GeMSSUtils.maskUINT(i21);
            jMaskUINT = GeMSSUtils.maskUINT(i55);
            this.MASK_GF2n = jMaskUINT;
            if (i55 != 0) {
                i29 = 1;
            } else {
                i29 = 0;
            }
            int i65 = i54 + i29;
            this.NB_WORD_GFqn = i65;
            this.LTRIANGULAR_N_SIZE = (((i54 * (i54 + 1)) >>> 1) * 64) + (i65 * i55);
            this.MATRIXn_SIZE = i12 * i65;
            if (i57 != 0) {
                i31 = 1;
            } else {
                i31 = 0;
            }
            int i66 = i31 + i56;
            this.NB_WORD_GF2nv = i66;
            this.MATRIXnv_SIZE = i53 * i66;
            this.LTRIANGULAR_NV_SIZE = (((i56 * (i56 + 1)) >>> 1) * 64) + (i57 * i66);
            int i67 = i13 + 1;
            int i68 = ((i13 * i67) >>> 1) + 1;
            this.NB_MONOMIAL_VINEGAR = i68;
            int i69 = (i53 * (i53 + 1)) >>> 1;
            int i71 = i69 + 1;
            this.NB_MONOMIAL_PK = i71;
            this.MQv_GFqn_SIZE = i68 * i65;
            this.ACCESS_last_equations8 = i71 * i63;
            this.NB_BYTES_EQUATION = (i69 + 8) >>> 3;
            int i72 = i71 & 7;
            this.HFENr8 = i72;
            int i73 = (8 - i72) & 7;
            this.HFENr8c = i73;
            this.LOST_BITS = (i25 - 1) * i73;
            this.NB_WORD_MMUL = i59;
            if (i12 != 174) {
                i32 = 13;
            } else if (i12 != 175) {
                i32 = 16;
            } else if (i12 != 177) {
                i32 = 8;
            } else if (i12 != 178) {
                i32 = 31;
            } else if (i12 != 265) {
                i32 = 42;
            } else if (i12 != 266) {
                i32 = 47;
            } else if (i12 != 268) {
                i32 = 25;
            } else if (i12 != 354) {
                i32 = 99;
            } else if (i12 != 358) {
                i32 = 57;
            } else if (i12 != 364) {
                i32 = 9;
            } else if (i12 != 366) {
                i32 = 29;
            } else if (i12 != 402) {
                if (i12 != 537) {
                    i32 = 10;
                    i33 = 1;
                    i34 = 2;
                } else if (i12 != 544) {
                    i32 = 128;
                    i33 = 1;
                    i34 = 3;
                } else if (i12 != 270) {
                    i32 = 53;
                } else {
                    if (i12 == 271) {
                        throw new IllegalArgumentException("error: need to add support for HFEn=" + i12);
                    }
                    i32 = 58;
                }
                if (i34 != 0) {
                    i35 = 64 - i33;
                    i36 = 64 - i34;
                } else {
                    i35 = 0;
                    i36 = 0;
                }
                i37 = 64 - (i32 & 63);
                i38 = i16 & 1;
                if (i38 == 0) {
                    this.ENABLED_REMOVE_ODD_DEGREE = true;
                    i51 = (1 << i17) + 1;
                    this.HFE_odd_degree = i51;
                    if (i38 == 0) {
                        throw new IllegalArgumentException("HFEDeg is odd, so to remove the leading term would decrease the degree.");
                    }
                    if (i51 <= i16) {
                        throw new IllegalArgumentException("It is useless to remove 0 term.");
                    }
                    if (i51 > 1) {
                        throw new IllegalArgumentException("The case where the term X^3 is removing is not implemented.");
                    }
                    this.NB_COEFS_HFEPOLY = i18 + 2 + (((i17 - 1) * i17) >>> 1) + i17;
                    i39 = 0;
                } else {
                    i39 = 0;
                    this.ENABLED_REMOVE_ODD_DEGREE = false;
                    this.NB_COEFS_HFEPOLY = i18 + 2 + ((i17 * i52) >>> 1);
                }
                if (i21 != 0) {
                    i41 = 1;
                } else {
                    i41 = i39;
                }
                int i74 = i62 + i41;
                this.NB_WORD_GF2m = i74;
                int i75 = i66 - i74;
                if (i21 != 0) {
                    i42 = 1;
                } else {
                    i42 = i39;
                }
                int i76 = i75 + i42;
                this.NB_WORD_GF2nvm = i76;
                this.SIZE_SIGN_UNCOMPRESSED = i66 + ((i15 - 1) * i76);
                if (i11 <= 128) {
                    this.SIZE_DIGEST = 32;
                    this.SIZE_DIGEST_UINT = 4;
                    this.ShakeBitStrength = 128;
                    this.Sha3BitStrength = 256;
                } else {
                    if (i11 <= 192) {
                        this.SIZE_DIGEST = 48;
                        this.SIZE_DIGEST_UINT = 6;
                        this.ShakeBitStrength = 256;
                        i43 = KyberEngine.KyberPolyBytes;
                    } else {
                        this.SIZE_DIGEST = 64;
                        this.SIZE_DIGEST_UINT = 8;
                        this.ShakeBitStrength = 256;
                        i43 = 512;
                    }
                    this.Sha3BitStrength = i43;
                }
                this.sha3Digest = new SHA3Digest(this.Sha3BitStrength);
                int i77 = this.NB_COEFS_HFEPOLY + (this.NB_MONOMIAL_VINEGAR - 1) + (i52 * i13);
                int i78 = this.NB_WORD_GFqn;
                this.NB_UINT_HFEVPOLY = i77 * i78;
                this.MLv_GFqn_SIZE = i67 * i78;
                if (i16 > 34 || (i12 > 196 && i16 < 256)) {
                    if (i16 == 17) {
                        i44 = 4;
                    } else {
                        i44 = 6;
                    }
                    this.II = i44;
                    int i79 = this.II;
                    int i81 = 1 << i79;
                    this.POW_II = i81;
                    int i82 = (i16 >>> i79) + (i16 % i81 != 0 ? 1 : i39);
                    this.KP = i82;
                    this.KX = i16 - i82;
                }
                if (i34 == 0) {
                    if (i12 == 544 || i32 != 128) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(i33, i34, i32, i55, i19, i35, i36, i37, jMaskUINT);
                    } else {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_K3_IS_128_GF2X(i33, i34, i55, i19, i35, i36, jMaskUINT);
                    }
                } else if (i12 > 256 || i12 >= 289 || i32 <= 32 || i32 >= 64) {
                    i45 = i32;
                    if (i12 == 354) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 358) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 402) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 6) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 != 9) {
                        if (i59 == 12) {
                            rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                        }
                        this.Buffer_NB_WORD_MUL = new Pointer(i59);
                        this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
                        i46 = 31;
                        this.HFEn_1rightmost = 31;
                        while (true) {
                            i47 = this.HFEn_1rightmost;
                            if ((i58 >>> i47) == 0) {
                                break;
                            } else {
                                this.HFEn_1rightmost = i47 - 1;
                            }
                        }
                        i48 = (i12 + 1) >>> 1;
                        while (true) {
                            this.HFEn1h_rightmost = i46;
                            i49 = this.HFEn1h_rightmost;
                            if ((i48 >>> i49) == 0) {
                                this.HFEn1h_rightmost = i49 - 1;
                                return;
                            }
                            i46 = i49 - 1;
                        }
                    } else {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    }
                } else {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i32, i55, i19, i37, jMaskUINT);
                }
                this.rem = rem192_specialized_trinomial_gf2x;
                this.Buffer_NB_WORD_MUL = new Pointer(i59);
                this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
                i46 = 31;
                this.HFEn_1rightmost = 31;
                while (true) {
                    i47 = this.HFEn_1rightmost;
                    if ((i58 >>> i47) == 0) {
                        break;
                        break;
                    }
                    this.HFEn_1rightmost = i47 - 1;
                }
                i48 = (i12 + 1) >>> 1;
                while (true) {
                    this.HFEn1h_rightmost = i46;
                    i49 = this.HFEn1h_rightmost;
                    if ((i48 >>> i49) == 0) {
                        this.HFEn1h_rightmost = i49 - 1;
                        return;
                    }
                    i46 = i49 - 1;
                }
            } else {
                i32 = 171;
            }
            i34 = 0;
            i33 = 0;
            if (i34 != 0) {
                i35 = 64 - i33;
                i36 = 64 - i34;
            } else {
                i35 = 0;
                i36 = 0;
            }
            i37 = 64 - (i32 & 63);
            i38 = i16 & 1;
            if (i38 == 0) {
                this.ENABLED_REMOVE_ODD_DEGREE = true;
                i51 = (1 << i17) + 1;
                this.HFE_odd_degree = i51;
                if (i38 == 0) {
                    throw new IllegalArgumentException("HFEDeg is odd, so to remove the leading term would decrease the degree.");
                }
                if (i51 <= i16) {
                    throw new IllegalArgumentException("It is useless to remove 0 term.");
                }
                if (i51 > 1) {
                    throw new IllegalArgumentException("The case where the term X^3 is removing is not implemented.");
                }
                this.NB_COEFS_HFEPOLY = i18 + 2 + (((i17 - 1) * i17) >>> 1) + i17;
                i39 = 0;
            } else {
                i39 = 0;
                this.ENABLED_REMOVE_ODD_DEGREE = false;
                this.NB_COEFS_HFEPOLY = i18 + 2 + ((i17 * i52) >>> 1);
            }
            if (i21 != 0) {
                i41 = 1;
            } else {
                i41 = i39;
            }
            int i710 = i62 + i41;
            this.NB_WORD_GF2m = i710;
            int i711 = i66 - i710;
            if (i21 != 0) {
                i42 = 1;
            } else {
                i42 = i39;
            }
            int i712 = i711 + i42;
            this.NB_WORD_GF2nvm = i712;
            this.SIZE_SIGN_UNCOMPRESSED = i66 + ((i15 - 1) * i712);
            if (i11 <= 128) {
                this.SIZE_DIGEST = 32;
                this.SIZE_DIGEST_UINT = 4;
                this.ShakeBitStrength = 128;
                this.Sha3BitStrength = 256;
            } else {
                if (i11 <= 192) {
                    this.SIZE_DIGEST = 48;
                    this.SIZE_DIGEST_UINT = 6;
                    this.ShakeBitStrength = 256;
                    i43 = KyberEngine.KyberPolyBytes;
                } else {
                    this.SIZE_DIGEST = 64;
                    this.SIZE_DIGEST_UINT = 8;
                    this.ShakeBitStrength = 256;
                    i43 = 512;
                }
                this.Sha3BitStrength = i43;
            }
            this.sha3Digest = new SHA3Digest(this.Sha3BitStrength);
            int i713 = this.NB_COEFS_HFEPOLY + (this.NB_MONOMIAL_VINEGAR - 1) + (i52 * i13);
            int i714 = this.NB_WORD_GFqn;
            this.NB_UINT_HFEVPOLY = i713 * i714;
            this.MLv_GFqn_SIZE = i67 * i714;
            if (i16 > 34) {
                if (i16 == 17) {
                    i44 = 4;
                } else {
                    i44 = 6;
                }
                this.II = i44;
                int i715 = this.II;
                int i83 = 1 << i715;
                this.POW_II = i83;
                int i84 = (i16 >>> i715) + (i16 % i83 != 0 ? 1 : i39);
                this.KP = i84;
                this.KX = i16 - i84;
            } else {
                if (i16 == 17) {
                    i44 = 4;
                } else {
                    i44 = 6;
                }
                this.II = i44;
                int i716 = this.II;
                int i85 = 1 << i716;
                this.POW_II = i85;
                int i86 = (i16 >>> i716) + (i16 % i85 != 0 ? 1 : i39);
                this.KP = i86;
                this.KX = i16 - i86;
            }
            if (i34 == 0) {
                if (i12 > 256) {
                    i45 = i32;
                    if (i12 == 354) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 358) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 402) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 6) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 != 9) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 12) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    }
                } else {
                    i45 = i32;
                    if (i12 == 354) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 358) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 402) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 6) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 != 9) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 12) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    }
                }
                this.Buffer_NB_WORD_MUL = new Pointer(i59);
                this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
                i46 = 31;
                this.HFEn_1rightmost = 31;
                while (true) {
                    i47 = this.HFEn_1rightmost;
                    if ((i58 >>> i47) == 0) {
                        break;
                        break;
                    }
                    this.HFEn_1rightmost = i47 - 1;
                }
                i48 = (i12 + 1) >>> 1;
                while (true) {
                    this.HFEn1h_rightmost = i46;
                    i49 = this.HFEn1h_rightmost;
                    if ((i48 >>> i49) == 0) {
                        this.HFEn1h_rightmost = i49 - 1;
                        return;
                    }
                    i46 = i49 - 1;
                }
            } else if (i12 == 544) {
                rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(i33, i34, i32, i55, i19, i35, i36, i37, jMaskUINT);
            } else {
                rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(i33, i34, i32, i55, i19, i35, i36, i37, jMaskUINT);
            }
            this.rem = rem192_specialized_trinomial_gf2x;
            this.Buffer_NB_WORD_MUL = new Pointer(i59);
            this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
            i46 = 31;
            this.HFEn_1rightmost = 31;
            while (true) {
                i47 = this.HFEn_1rightmost;
                if ((i58 >>> i47) == 0) {
                    break;
                    break;
                }
                this.HFEn_1rightmost = i47 - 1;
            }
            i48 = (i12 + 1) >>> 1;
            while (true) {
                this.HFEn1h_rightmost = i46;
                i49 = this.HFEn1h_rightmost;
                if ((i48 >>> i49) == 0) {
                    this.HFEn1h_rightmost = i49 - 1;
                    return;
                }
                i46 = i49 - 1;
            }
        } else {
            mul6 = new Mul_GF2x.Mul12();
        }
        this.mul = mul6;
        i19 = 64 - i55;
        int i610 = i12 - i14;
        this.HFEm = i610;
        int i611 = i610 >>> 6;
        this.HFEmq = i611;
        i21 = i610 & 63;
        this.HFEmr = i21;
        i22 = i13 >>> 6;
        this.HFEvq = i22;
        i23 = i13 & 63;
        this.HFEvr = i23;
        if (i23 != 0) {
            i24 = i22 + 1;
        } else {
            i24 = i22;
        }
        this.NB_WORD_GFqv = i24;
        int i612 = i610 >>> 3;
        this.HFEmq8 = i612;
        i25 = i610 & 7;
        this.HFEmr8 = i25;
        if (i25 != 0) {
            i26 = 1;
        } else {
            i26 = 0;
        }
        this.NB_BYTES_GFqm = i612 + i26;
        this.NB_WORD_UNCOMP_EQ = ((((i56 + 1) * i56) >>> 1) * 64) + ((i56 + 1) * i57);
        i27 = i53 & 7;
        this.HFEnvr8 = i27;
        int i613 = i53 >>> 3;
        if (i27 != 0) {
            i28 = 1;
        } else {
            i28 = 0;
        }
        this.NB_BYTES_GFqnv = i613 + i28;
        this.VAL_BITS_M = Math.min(i14 + i13, 8 - i25);
        this.MASK_GF2m = GeMSSUtils.maskUINT(i21);
        jMaskUINT = GeMSSUtils.maskUINT(i55);
        this.MASK_GF2n = jMaskUINT;
        if (i55 != 0) {
            i29 = 1;
        } else {
            i29 = 0;
        }
        int i614 = i54 + i29;
        this.NB_WORD_GFqn = i614;
        this.LTRIANGULAR_N_SIZE = (((i54 * (i54 + 1)) >>> 1) * 64) + (i614 * i55);
        this.MATRIXn_SIZE = i12 * i614;
        if (i57 != 0) {
            i31 = 1;
        } else {
            i31 = 0;
        }
        int i615 = i31 + i56;
        this.NB_WORD_GF2nv = i615;
        this.MATRIXnv_SIZE = i53 * i615;
        this.LTRIANGULAR_NV_SIZE = (((i56 * (i56 + 1)) >>> 1) * 64) + (i57 * i615);
        int i616 = i13 + 1;
        int i617 = ((i13 * i616) >>> 1) + 1;
        this.NB_MONOMIAL_VINEGAR = i617;
        int i618 = (i53 * (i53 + 1)) >>> 1;
        int i717 = i618 + 1;
        this.NB_MONOMIAL_PK = i717;
        this.MQv_GFqn_SIZE = i617 * i614;
        this.ACCESS_last_equations8 = i717 * i612;
        this.NB_BYTES_EQUATION = (i618 + 8) >>> 3;
        int i718 = i717 & 7;
        this.HFENr8 = i718;
        int i719 = (8 - i718) & 7;
        this.HFENr8c = i719;
        this.LOST_BITS = (i25 - 1) * i719;
        this.NB_WORD_MMUL = i59;
        if (i12 != 174) {
            i32 = 13;
        } else if (i12 != 175) {
            i32 = 16;
        } else if (i12 != 177) {
            i32 = 8;
        } else if (i12 != 178) {
            i32 = 31;
        } else if (i12 != 265) {
            i32 = 42;
        } else if (i12 != 266) {
            i32 = 47;
        } else if (i12 != 268) {
            i32 = 25;
        } else if (i12 != 354) {
            i32 = 99;
        } else if (i12 != 358) {
            i32 = 57;
        } else if (i12 != 364) {
            i32 = 9;
        } else if (i12 != 366) {
            i32 = 29;
        } else if (i12 != 402) {
            if (i12 != 537) {
                i32 = 10;
                i33 = 1;
                i34 = 2;
            } else if (i12 != 544) {
                i32 = 128;
                i33 = 1;
                i34 = 3;
            } else if (i12 != 270) {
                i32 = 53;
            } else {
                if (i12 == 271) {
                    throw new IllegalArgumentException("error: need to add support for HFEn=" + i12);
                }
                i32 = 58;
            }
            if (i34 != 0) {
                i35 = 64 - i33;
                i36 = 64 - i34;
            } else {
                i35 = 0;
                i36 = 0;
            }
            i37 = 64 - (i32 & 63);
            i38 = i16 & 1;
            if (i38 == 0) {
                this.ENABLED_REMOVE_ODD_DEGREE = true;
                i51 = (1 << i17) + 1;
                this.HFE_odd_degree = i51;
                if (i38 == 0) {
                    throw new IllegalArgumentException("HFEDeg is odd, so to remove the leading term would decrease the degree.");
                }
                if (i51 <= i16) {
                    throw new IllegalArgumentException("It is useless to remove 0 term.");
                }
                if (i51 > 1) {
                    throw new IllegalArgumentException("The case where the term X^3 is removing is not implemented.");
                }
                this.NB_COEFS_HFEPOLY = i18 + 2 + (((i17 - 1) * i17) >>> 1) + i17;
                i39 = 0;
            } else {
                i39 = 0;
                this.ENABLED_REMOVE_ODD_DEGREE = false;
                this.NB_COEFS_HFEPOLY = i18 + 2 + ((i17 * i52) >>> 1);
            }
            if (i21 != 0) {
                i41 = 1;
            } else {
                i41 = i39;
            }
            int i7110 = i611 + i41;
            this.NB_WORD_GF2m = i7110;
            int i7111 = i615 - i7110;
            if (i21 != 0) {
                i42 = 1;
            } else {
                i42 = i39;
            }
            int i7112 = i7111 + i42;
            this.NB_WORD_GF2nvm = i7112;
            this.SIZE_SIGN_UNCOMPRESSED = i615 + ((i15 - 1) * i7112);
            if (i11 <= 128) {
                this.SIZE_DIGEST = 32;
                this.SIZE_DIGEST_UINT = 4;
                this.ShakeBitStrength = 128;
                this.Sha3BitStrength = 256;
            } else {
                if (i11 <= 192) {
                    this.SIZE_DIGEST = 48;
                    this.SIZE_DIGEST_UINT = 6;
                    this.ShakeBitStrength = 256;
                    i43 = KyberEngine.KyberPolyBytes;
                } else {
                    this.SIZE_DIGEST = 64;
                    this.SIZE_DIGEST_UINT = 8;
                    this.ShakeBitStrength = 256;
                    i43 = 512;
                }
                this.Sha3BitStrength = i43;
            }
            this.sha3Digest = new SHA3Digest(this.Sha3BitStrength);
            int i7113 = this.NB_COEFS_HFEPOLY + (this.NB_MONOMIAL_VINEGAR - 1) + (i52 * i13);
            int i7114 = this.NB_WORD_GFqn;
            this.NB_UINT_HFEVPOLY = i7113 * i7114;
            this.MLv_GFqn_SIZE = i616 * i7114;
            if (i16 > 34) {
                if (i16 == 17) {
                    i44 = 4;
                } else {
                    i44 = 6;
                }
                this.II = i44;
                int i7115 = this.II;
                int i87 = 1 << i7115;
                this.POW_II = i87;
                int i88 = (i16 >>> i7115) + (i16 % i87 != 0 ? 1 : i39);
                this.KP = i88;
                this.KX = i16 - i88;
            } else {
                if (i16 == 17) {
                    i44 = 4;
                } else {
                    i44 = 6;
                }
                this.II = i44;
                int i7116 = this.II;
                int i89 = 1 << i7116;
                this.POW_II = i89;
                int i810 = (i16 >>> i7116) + (i16 % i89 != 0 ? 1 : i39);
                this.KP = i810;
                this.KX = i16 - i810;
            }
            if (i34 == 0) {
                if (i12 > 256) {
                    i45 = i32;
                    if (i12 == 354) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 358) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 402) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 6) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 != 9) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 12) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    }
                } else {
                    i45 = i32;
                    if (i12 == 354) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 358) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i12 == 402) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 6) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 != 9) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    } else if (i59 == 12) {
                        rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                    }
                }
                this.Buffer_NB_WORD_MUL = new Pointer(i59);
                this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
                i46 = 31;
                this.HFEn_1rightmost = 31;
                while (true) {
                    i47 = this.HFEn_1rightmost;
                    if ((i58 >>> i47) == 0) {
                        break;
                        break;
                    }
                    this.HFEn_1rightmost = i47 - 1;
                }
                i48 = (i12 + 1) >>> 1;
                while (true) {
                    this.HFEn1h_rightmost = i46;
                    i49 = this.HFEn1h_rightmost;
                    if ((i48 >>> i49) == 0) {
                        this.HFEn1h_rightmost = i49 - 1;
                        return;
                    }
                    i46 = i49 - 1;
                }
            } else if (i12 == 544) {
                rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(i33, i34, i32, i55, i19, i35, i36, i37, jMaskUINT);
            } else {
                rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(i33, i34, i32, i55, i19, i35, i36, i37, jMaskUINT);
            }
            this.rem = rem192_specialized_trinomial_gf2x;
            this.Buffer_NB_WORD_MUL = new Pointer(i59);
            this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
            i46 = 31;
            this.HFEn_1rightmost = 31;
            while (true) {
                i47 = this.HFEn_1rightmost;
                if ((i58 >>> i47) == 0) {
                    break;
                    break;
                }
                this.HFEn_1rightmost = i47 - 1;
            }
            i48 = (i12 + 1) >>> 1;
            while (true) {
                this.HFEn1h_rightmost = i46;
                i49 = this.HFEn1h_rightmost;
                if ((i48 >>> i49) == 0) {
                    this.HFEn1h_rightmost = i49 - 1;
                    return;
                }
                i46 = i49 - 1;
            }
        } else {
            i32 = 171;
        }
        i34 = 0;
        i33 = 0;
        if (i34 != 0) {
            i35 = 64 - i33;
            i36 = 64 - i34;
        } else {
            i35 = 0;
            i36 = 0;
        }
        i37 = 64 - (i32 & 63);
        i38 = i16 & 1;
        if (i38 == 0) {
            this.ENABLED_REMOVE_ODD_DEGREE = true;
            i51 = (1 << i17) + 1;
            this.HFE_odd_degree = i51;
            if (i38 == 0) {
                throw new IllegalArgumentException("HFEDeg is odd, so to remove the leading term would decrease the degree.");
            }
            if (i51 <= i16) {
                throw new IllegalArgumentException("It is useless to remove 0 term.");
            }
            if (i51 > 1) {
                throw new IllegalArgumentException("The case where the term X^3 is removing is not implemented.");
            }
            this.NB_COEFS_HFEPOLY = i18 + 2 + (((i17 - 1) * i17) >>> 1) + i17;
            i39 = 0;
        } else {
            i39 = 0;
            this.ENABLED_REMOVE_ODD_DEGREE = false;
            this.NB_COEFS_HFEPOLY = i18 + 2 + ((i17 * i52) >>> 1);
        }
        if (i21 != 0) {
            i41 = 1;
        } else {
            i41 = i39;
        }
        int i7117 = i611 + i41;
        this.NB_WORD_GF2m = i7117;
        int i7118 = i615 - i7117;
        if (i21 != 0) {
            i42 = 1;
        } else {
            i42 = i39;
        }
        int i7119 = i7118 + i42;
        this.NB_WORD_GF2nvm = i7119;
        this.SIZE_SIGN_UNCOMPRESSED = i615 + ((i15 - 1) * i7119);
        if (i11 <= 128) {
            this.SIZE_DIGEST = 32;
            this.SIZE_DIGEST_UINT = 4;
            this.ShakeBitStrength = 128;
            this.Sha3BitStrength = 256;
        } else {
            if (i11 <= 192) {
                this.SIZE_DIGEST = 48;
                this.SIZE_DIGEST_UINT = 6;
                this.ShakeBitStrength = 256;
                i43 = KyberEngine.KyberPolyBytes;
            } else {
                this.SIZE_DIGEST = 64;
                this.SIZE_DIGEST_UINT = 8;
                this.ShakeBitStrength = 256;
                i43 = 512;
            }
            this.Sha3BitStrength = i43;
        }
        this.sha3Digest = new SHA3Digest(this.Sha3BitStrength);
        int i71110 = this.NB_COEFS_HFEPOLY + (this.NB_MONOMIAL_VINEGAR - 1) + (i52 * i13);
        int i71111 = this.NB_WORD_GFqn;
        this.NB_UINT_HFEVPOLY = i71110 * i71111;
        this.MLv_GFqn_SIZE = i616 * i71111;
        if (i16 > 34) {
            if (i16 == 17) {
                i44 = 4;
            } else {
                i44 = 6;
            }
            this.II = i44;
            int i71112 = this.II;
            int i811 = 1 << i71112;
            this.POW_II = i811;
            int i812 = (i16 >>> i71112) + (i16 % i811 != 0 ? 1 : i39);
            this.KP = i812;
            this.KX = i16 - i812;
        } else {
            if (i16 == 17) {
                i44 = 4;
            } else {
                i44 = 6;
            }
            this.II = i44;
            int i71113 = this.II;
            int i813 = 1 << i71113;
            this.POW_II = i813;
            int i814 = (i16 >>> i71113) + (i16 % i813 != 0 ? 1 : i39);
            this.KP = i814;
            this.KX = i16 - i814;
        }
        if (i34 == 0) {
            if (i12 > 256) {
                i45 = i32;
                if (i12 == 354) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i12 == 358) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i12 == 402) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i59 == 6) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i59 != 9) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i59 == 12) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                }
            } else {
                i45 = i32;
                if (i12 == 354) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i12 == 358) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i12 == 402) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i59 == 6) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i59 != 9) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                } else if (i59 == 12) {
                    rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM384_TRINOMIAL_GF2X(i45, i55, i19, i37, jMaskUINT);
                }
            }
            this.Buffer_NB_WORD_MUL = new Pointer(i59);
            this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
            i46 = 31;
            this.HFEn_1rightmost = 31;
            while (true) {
                i47 = this.HFEn_1rightmost;
                if ((i58 >>> i47) == 0) {
                    break;
                    break;
                }
                this.HFEn_1rightmost = i47 - 1;
            }
            i48 = (i12 + 1) >>> 1;
            while (true) {
                this.HFEn1h_rightmost = i46;
                i49 = this.HFEn1h_rightmost;
                if ((i48 >>> i49) == 0) {
                    this.HFEn1h_rightmost = i49 - 1;
                    return;
                }
                i46 = i49 - 1;
            }
        } else if (i12 == 544) {
            rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(i33, i34, i32, i55, i19, i35, i36, i37, jMaskUINT);
        } else {
            rem192_specialized_trinomial_gf2x = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(i33, i34, i32, i55, i19, i35, i36, i37, jMaskUINT);
        }
        this.rem = rem192_specialized_trinomial_gf2x;
        this.Buffer_NB_WORD_MUL = new Pointer(i59);
        this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
        i46 = 31;
        this.HFEn_1rightmost = 31;
        while (true) {
            i47 = this.HFEn_1rightmost;
            if ((i58 >>> i47) == 0) {
                break;
                break;
            }
            this.HFEn_1rightmost = i47 - 1;
        }
        i48 = (i12 + 1) >>> 1;
        while (true) {
            this.HFEn1h_rightmost = i46;
            i49 = this.HFEn1h_rightmost;
            if ((i48 >>> i49) == 0) {
                this.HFEn1h_rightmost = i49 - 1;
                return;
            }
            i46 = i49 - 1;
        }
    }

    private void CMP_AND_SWAP_CST_TIME(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        long jCMP_LT_UINT = 0;
        long jORBITS_UINT = 0;
        long j11 = 0;
        for (int i11 = this.NB_WORD_GFqn - 1; i11 > 0; i11--) {
            jORBITS_UINT |= GeMSSUtils.ORBITS_UINT(pointer2.get(i11) ^ pointer.get(i11));
            j11 += jORBITS_UINT;
        }
        int i12 = 0;
        while (true) {
            int i13 = this.NB_WORD_GFqn;
            if (i12 >= i13) {
                pointer3.setRangeFromXorAndMask_xor(pointer, pointer2, -jCMP_LT_UINT, i13);
                return;
            } else {
                jCMP_LT_UINT |= (-GeMSSUtils.NORBITS_UINT(((long) i12) ^ j11)) & GeMSSUtils.CMP_LT_UINT(pointer2.get(i12), pointer.get(i12));
                i12++;
            }
        }
    }

    private void LOOPIR(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12, int i13, int i14, boolean z11) {
        for (int i15 = 0; i15 < i11; i15++) {
            Pointer pointer4 = new Pointer(pointer3);
            int i16 = 1;
            while (i16 <= i12) {
                LOOPJR(pointer, pointer2, pointer4, 64, i14, i16);
                i16++;
            }
            if (z11) {
                LOOPJR(pointer, pointer2, pointer4, i13, i14, i16);
            }
            pointer2.move(i14);
        }
    }

    private void LOOPIR_INIT(Pointer pointer, Pointer pointer2, Pointer pointer3, Pointer pointer4, int i11, int i12) {
        while (i11 < i12) {
            pointer.setRangeClear(0, this.NB_WORD_GFqn);
            pointer2.changeIndex(pointer3);
            Pointer pointer5 = pointer;
            LOOPK_COMPLETE(pointer5, pointer4, pointer2, 0, this.HFEnvq);
            pointer4.move(this.NB_WORD_GF2nv);
            i11++;
            pointer = pointer5;
        }
    }

    private void LOOPIR_LOOPK_COMPLETE(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        while (i11 < i12) {
            LOOPK_COMPLETE(pointer, pointer2, pointer3, 0, this.HFEnvq);
            i11++;
        }
    }

    private void LOOPJR(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12, int i13) {
        int iMin = Math.min(i12, i13);
        pointer.set(0L);
        for (int i14 = 0; i14 < i11; i14++) {
            pointer.setXor(GeMSSUtils.XORBITS_UINT(pointer2.getDotProduct(0, pointer3, 0, iMin)) << i14);
            pointer3.move(i13);
        }
        pointer.moveIncremental();
    }

    private long LOOPJR_NOCST_64(Pointer pointer, PointerUnion pointerUnion, int i11, int i12, long j11, int i13, int i14) {
        while (i11 < i12) {
            if ((1 & j11) != 0) {
                pointer.setXorRange(0, pointerUnion, 0, i14);
            }
            pointerUnion.moveNextBytes(i13);
            j11 >>>= 1;
            i11++;
        }
        return j11;
    }

    private void LOOPJR_UNROLLED_64(Pointer pointer, PointerUnion pointerUnion, int i11, int i12, long j11, int i13, int i14) {
        int i15 = i11;
        long jLOOPJR_NOCST_64 = j11;
        while (i15 < i12 - 3) {
            jLOOPJR_NOCST_64 = LOOPJR_NOCST_64(pointer, pointerUnion, 0, 4, jLOOPJR_NOCST_64, i13, i14);
            i15 += 4;
        }
        LOOPJR_NOCST_64(pointer, pointerUnion, i15, i12, jLOOPJR_NOCST_64, i13, i14);
    }

    private void LOOPKR(Pointer pointer, Pointer pointer2, long j11, int i11, int i12) {
        while (i11 < i12) {
            pointer2.setXorRangeAndMaskMove(pointer, this.NB_WORD_GFqn, -(1 & j11));
            j11 >>>= 1;
            i11++;
        }
    }

    private void LOOPK_COMPLETE(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        for (int i13 = i11; i13 < i12; i13++) {
            LOOPKR(pointer3, pointer, pointer2.get(i13), 0, 64);
        }
        if (this.HFEnvr != 0) {
            LOOPKR(pointer3, pointer, pointer2.get(i12), 0, this.HFEnvr);
        }
        pointer.move(this.NB_WORD_GFqn);
    }

    private int chooseRootHFE_gf2nx(Pointer pointer, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        GeMSSEngine geMSSEngine;
        SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar2;
        Pointer pointer3 = new Pointer(this.SIZE_DIGEST_UINT);
        Pointer pointer4 = new Pointer(((this.HFEDeg << 1) - 1) * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer((this.HFEDeg + 1) * this.NB_WORD_GFqn);
        Pointer pointer6 = new Pointer(this.NB_WORD_GFqn);
        pointer6.setRangeFromXor(complete_sparse_monic_gf2nxVar.poly, pointer2, this.NB_WORD_GFqn);
        int i11 = this.HFEDeg;
        if (i11 <= 34 || (this.HFEn > 196 && i11 < 256)) {
            geMSSEngine = this;
            complete_sparse_monic_gf2nxVar2 = complete_sparse_monic_gf2nxVar;
            frobeniusMap_multisqr_HFE_gf2nx(pointer4, complete_sparse_monic_gf2nxVar2, pointer6);
        } else {
            int i12 = 2 << this.HFEDegI;
            pointer4.set(this.NB_WORD_GFqn * i12, 1L);
            geMSSEngine = this;
            geMSSEngine.divsqr_r_HFE_cstdeg_gf2nx(pointer4, i12, i12, this.HFEDeg, complete_sparse_monic_gf2nxVar, pointer6);
            complete_sparse_monic_gf2nxVar2 = complete_sparse_monic_gf2nxVar;
            geMSSEngine.for_sqr_divsqr(pointer4, geMSSEngine.HFEDegI + 1, geMSSEngine.HFEn, complete_sparse_monic_gf2nxVar2, pointer6);
        }
        pointer4.setXor(geMSSEngine.NB_WORD_GFqn, 1L);
        int index = pointer5.getIndex();
        pointer5.copyFrom(complete_sparse_monic_gf2nxVar2.poly, geMSSEngine.NB_WORD_GFqn);
        for_copy_move(pointer5, complete_sparse_monic_gf2nxVar2);
        pointer5.changeIndex(index);
        pointer5.set(geMSSEngine.HFEDeg * geMSSEngine.NB_WORD_GFqn, 1L);
        pointer5.setXorRange(pointer2, geMSSEngine.NB_WORD_GFqn);
        int iGcd_gf2nx = gcd_gf2nx(pointer5, geMSSEngine.HFEDeg, pointer4, pointer4.getD_for_not0_or_plus(geMSSEngine.NB_WORD_GFqn, geMSSEngine.HFEDeg - 1));
        if (geMSSEngine.buffer != 0) {
            pointer4.swap(pointer5);
        }
        if (pointer4.is0_gf2n(0, geMSSEngine.NB_WORD_GFqn) == 0) {
            return 0;
        }
        convMonic_gf2nx(pointer5, iGcd_gf2nx);
        Pointer pointer7 = new Pointer(geMSSEngine.NB_WORD_GFqn * iGcd_gf2nx);
        findRootsSplit_gf2nx(pointer7, pointer5, iGcd_gf2nx);
        if (iGcd_gf2nx == 1) {
            pointer.copyFrom(pointer7, geMSSEngine.NB_WORD_GFqn);
            return iGcd_gf2nx;
        }
        fast_sort_gf2n(pointer7, iGcd_gf2nx);
        getSHA3Hash(pointer3, 0, geMSSEngine.Sha3BitStrength >>> 3, pointer2.toBytes(geMSSEngine.NB_BYTES_GFqn), 0, geMSSEngine.NB_BYTES_GFqn, new byte[geMSSEngine.Sha3BitStrength >>> 3]);
        int iRemainderUnsigned = (int) remainderUnsigned(pointer3.get(), iGcd_gf2nx);
        int i13 = this.NB_WORD_GFqn;
        pointer.copyFrom(0, pointer7, iRemainderUnsigned * i13, i13);
        return iGcd_gf2nx;
    }

    private void choose_LOOPJR(Pointer pointer, PointerUnion pointerUnion, int i11, long j11, int i12, int i13) {
        int i14 = this.HFEnvr;
        if (i14 < 8) {
            LOOPJR_NOCST_64(pointer, pointerUnion, i11, i14, j11, i12, i13);
        } else {
            LOOPJR_UNROLLED_64(pointer, pointerUnion, i11, i14, j11, i12, i13);
        }
    }

    private long convMQ_last_uncompressL_gf2(Pointer pointer, PointerUnion pointerUnion) {
        GeMSSEngine geMSSEngine;
        Pointer pointer2;
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        int i11 = this.HFEnv - 1;
        int i12 = i11 >>> 6;
        int i13 = i11 & 63;
        int iFor_setpk2_end_move_plus = for_setpk2_end_move_plus(pointer, pointerUnion2, i12);
        if (i13 != 0) {
            int i14 = i13 + 1;
            geMSSEngine = this;
            pointer2 = pointer;
            iFor_setpk2_end_move_plus = geMSSEngine.setPk2Value(pointer2, pointerUnion2, iFor_setpk2_end_move_plus, i12, i14);
        } else {
            geMSSEngine = this;
            pointer2 = pointer;
        }
        int i15 = geMSSEngine.HFEnv;
        int i16 = geMSSEngine.LOST_BITS;
        int i17 = i15 - i16;
        int i18 = i17 >>> 6;
        int i19 = i17 & 63;
        if (i19 != 0) {
            int i21 = iFor_setpk2_end_move_plus & 63;
            if (i21 != 0) {
                int i22 = geMSSEngine.NB_MONOMIAL_PK;
                if (((((i22 - i16) + 7) >>> 3) & 7) != 0) {
                    int i23 = (i15 - ((64 - (((i22 - i16) - geMSSEngine.HFEnvr) & 63)) & 63)) >>> 6;
                    pointer2.setRangePointerUnion_Check(pointerUnion2, i23, iFor_setpk2_end_move_plus);
                    pointer2.set(i23, pointerUnion2.getWithCheck(i23) >>> i21);
                    if (i23 < i18) {
                        int i24 = i23 + 1;
                        long withCheck = pointerUnion2.getWithCheck(i24);
                        pointer2.setXor(i23, withCheck << (64 - i21));
                        pointer2.set(i24, withCheck >>> i21);
                    } else if (i19 + i21 > 64) {
                        pointer2.setXor(i23, pointerUnion2.getWithCheck(i23 + 1) << (64 - i21));
                    }
                } else {
                    pointer2.setRangePointerUnion(pointerUnion2, i18, i21);
                    pointer2.set(i18, pointerUnion2.get(i18) >>> i21);
                    if (i19 + i21 > 64) {
                        pointer2.setXor(i18, pointerUnion2.get(i18 + 1) << (64 - i21));
                    }
                }
            } else if (((((geMSSEngine.NB_MONOMIAL_PK - i16) + 7) >>> 3) & 7) != 0) {
                pointer2.setRangePointerUnion(pointerUnion2, i18);
                pointer2.set(i18, pointerUnion2.getWithCheck(i18));
            } else {
                i18++;
                pointer2.setRangePointerUnion(pointerUnion2, i18);
            }
        } else if (i18 != 0) {
            int i25 = iFor_setpk2_end_move_plus & 63;
            if (i25 == 0) {
                pointer2.setRangePointerUnion(pointerUnion2, i18);
            } else if (((((geMSSEngine.NB_MONOMIAL_PK - i16) + 7) >>> 3) & 7) != 0) {
                int i26 = i18 - 1;
                pointer2.setRangePointerUnion(pointerUnion2, i26, i25);
                pointer2.set(i26, pointerUnion2.get(i26) >>> i25);
                pointer2.setXor(i26, pointerUnion2.getWithCheck(i18) << (64 - i25));
            } else {
                pointer2.setRangePointerUnion(pointerUnion2, i18, i25);
            }
        }
        return pointerUnion.get() & 1;
    }

    private long convMQ_uncompressL_gf2(Pointer pointer, PointerUnion pointerUnion) {
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        int iFor_setpk2_end_move_plus = for_setpk2_end_move_plus(pointer, pointerUnion2, this.HFEnvq);
        int i11 = this.HFEnvr;
        if (i11 != 0) {
            setPk2Value(pointer, pointerUnion2, iFor_setpk2_end_move_plus, this.HFEnvq, i11 + 1);
        }
        return pointerUnion.get() & 1;
    }

    private void convMonic_gf2nx(Pointer pointer, int i11) {
        Pointer pointer2 = new Pointer(this.NB_WORD_GFqn);
        int index = pointer.getIndex();
        pointer.move(this.NB_WORD_GFqn * i11);
        inv_gf2n(pointer2, pointer, 0);
        pointer.set1_gf2n(0, this.NB_WORD_GFqn);
        while (true) {
            i11--;
            if (i11 == -1) {
                pointer.changeIndex(index);
                return;
            } else {
                pointer.move(-this.NB_WORD_GFqn);
                mul_gf2n(pointer, pointer, pointer2);
            }
        }
    }

    private void copy_for_casct(Pointer pointer, Pointer pointer2, Pointer pointer3, Pointer pointer4, Pointer pointer5, int i11, int i12) {
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        while (i11 > 1) {
            pointer4.changeIndex(pointer3, (i12 + i11) * this.NB_WORD_GFqn);
            CMP_AND_SWAP_CST_TIME(pointer, pointer4, pointer5);
            i11 >>>= 1;
        }
    }

    private void copy_move_matrix_move(Pointer pointer, Pointer pointer2, int i11) {
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        pointer2.move(this.NB_WORD_GFqn);
        pointer.setXorMatrix(pointer2, this.NB_WORD_GFqn, i11);
        pointer2.move(this.NB_WORD_GFqn * (this.HFEv + 1));
    }

    private void div_q_monic_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer();
        Pointer pointer4 = new Pointer();
        while (i11 >= i12) {
            int iSearchDegree = pointer.searchDegree(i11, i12, this.NB_WORD_GFqn);
            if (iSearchDegree < i12) {
                return;
            }
            pointer3.changeIndex(pointer, this.NB_WORD_GFqn * iSearchDegree);
            int iMax = Math.max(0, (i12 << 1) - iSearchDegree);
            pointer4.changeIndex(pointer, ((iSearchDegree - i12) + iMax) * this.NB_WORD_GFqn);
            for_mul_rem_xor_move(pointer4, pointer3, pointer2, iMax, i12);
            i11 = iSearchDegree - 1;
        }
    }

    private void div_r_monic_cst_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer();
        int index = pointer.getIndex();
        pointer.move(this.NB_WORD_GFqn * i11);
        while (i11 >= i12) {
            pointer3.changeIndex(pointer, (-i12) * this.NB_WORD_GFqn);
            Pointer pointer4 = pointer;
            for_mul_rem_xor_move(pointer3, pointer4, pointer2, 0, i12);
            pointer4.move(-this.NB_WORD_GFqn);
            i11--;
            pointer = pointer4;
        }
        pointer.changeIndex(index);
    }

    private int div_r_monic_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer();
        Pointer pointer4 = new Pointer();
        while (i11 >= i12) {
            i11 = pointer.searchDegree(i11, i12, this.NB_WORD_GFqn);
            if (i11 < i12) {
                break;
            }
            pointer3.changeIndex(pointer, this.NB_WORD_GFqn * i11);
            pointer4.changeIndex(pointer3, (-i12) * this.NB_WORD_GFqn);
            for_mul_rem_xor_move(pointer4, pointer3, pointer2, 0, i12);
            i11--;
        }
        if (i11 == -1) {
            i11++;
        }
        return pointer.searchDegree(i11, 1, this.NB_WORD_GFqn);
    }

    private void divsqr_r_HFE_cstdeg_gf2nx(Pointer pointer, int i11, int i12, int i13, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        Pointer pointer3 = new Pointer(pointer, i11 * this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer();
        while (i12 >= i13) {
            pointer4.changeIndex(pointer3, (-this.HFEDeg) * this.NB_WORD_GFqn);
            mul_rem_xorrange(pointer4, pointer3, pointer2);
            for (int i14 = 1; i14 < this.NB_COEFS_HFEPOLY; i14++) {
                pointer4.move(complete_sparse_monic_gf2nxVar.L[i14]);
                mul_rem_xorrange(pointer4, pointer3, complete_sparse_monic_gf2nxVar.poly, this.NB_WORD_GFqn * i14);
            }
            pointer3.move(-this.NB_WORD_GFqn);
            i12--;
        }
    }

    private void dotProduct_gf2n(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        Pointer pointer4 = new Pointer(this.NB_WORD_MUL);
        int index = pointer2.getIndex();
        int index2 = pointer3.getIndex();
        mul_move(pointer4, pointer2, pointer3);
        for_mul_xorrange_move(pointer4, pointer2, pointer3, i11 - 1);
        rem_gf2n(pointer, 0, pointer4);
        pointer2.changeIndex(index);
        pointer3.changeIndex(index2);
    }

    private void dotproduct_move_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        dotProduct_gf2n(pointer, pointer3, pointer2, i11);
        pointer.move(this.NB_WORD_GFqn);
        pointer2.move((i11 + this.HFEv + 1) * this.NB_WORD_GFqn);
    }

    private void evalMQShybrid8_uncomp_nocst_gf2_m(Pointer pointer, Pointer pointer2, PointerUnion pointerUnion, PointerUnion pointerUnion2) {
        PointerUnion pointerUnion3 = new PointerUnion(pointerUnion2);
        evalMQSnocst8_quo_gf2(pointer, pointer2, pointerUnion);
        if (this.HFEmr < 8) {
            pointer.set(this.HFEmq, 0L);
        }
        for (int i11 = this.HFEmr - this.HFEmr8; i11 < this.HFEmr; i11++) {
            pointer.setXor(this.HFEmq, evalMQnocst_unrolled_no_simd_gf2(pointer2, pointerUnion3) << i11);
            pointerUnion3.move(this.NB_WORD_UNCOMP_EQ);
        }
    }

    private void evalMQSnocst8_quo_gf2(Pointer pointer, Pointer pointer2, PointerUnion pointerUnion) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        GeMSSEngine geMSSEngine = this;
        Pointer pointer3 = pointer;
        int i16 = geMSSEngine.HFEnv;
        int i17 = geMSSEngine.HFEm;
        if ((i17 >>> 3) != 0) {
            i17 = (i17 >>> 3) << 3;
        }
        int i18 = i17;
        int i19 = (i18 & 7) != 0 ? (i18 >>> 3) + 1 : i18 >>> 3;
        int i21 = (i19 >>> 3) + ((i19 & 7) != 0 ? 1 : 0);
        int i22 = i16;
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        System.arraycopy(pointerUnion2.getArray(), 0, pointer3.getArray(), pointer3.getIndex(), i21);
        pointerUnion2.moveNextBytes(i19);
        int i23 = 0;
        while (true) {
            i11 = geMSSEngine.HFEnvq;
            if (i23 >= i11) {
                break;
            }
            int i24 = i22;
            long j11 = pointer2.get(i23);
            int i25 = 0;
            while (i25 < 64) {
                if ((j11 & 1) != 0) {
                    pointer3.setXorRange(0, pointerUnion2, 0, i21);
                    pointerUnion2.moveNextBytes(i19);
                    i13 = i21;
                    i14 = i19;
                    int i26 = i25;
                    i12 = i26;
                    geMSSEngine.LOOPJR_UNROLLED_64(pointer3, pointerUnion2, i26 + 1, 64, j11 >>> 1, i14, i13);
                    int i27 = i23 + 1;
                    while (true) {
                        i15 = geMSSEngine.HFEnvq;
                        if (i27 >= i15) {
                            break;
                        }
                        geMSSEngine.LOOPJR_UNROLLED_64(pointer, pointerUnion2, 0, 64, pointer2.get(i27), i14, i13);
                        i27++;
                    }
                    if (geMSSEngine.HFEnvr != 0) {
                        pointer3 = pointer;
                        geMSSEngine.choose_LOOPJR(pointer3, pointerUnion2, 0, pointer2.get(i15), i14, i13);
                        i14 = i14;
                    } else {
                        pointer3 = pointer;
                    }
                } else {
                    i12 = i25;
                    i13 = i21;
                    i14 = i19;
                    pointerUnion2.moveNextBytes(i24 * i14);
                }
                j11 >>>= 1;
                i25 = i12 + 1;
                i24--;
                i19 = i14;
                i21 = i13;
            }
            i23++;
            i21 = i21;
            i22 = i24;
        }
        int i28 = i21;
        int i29 = i19;
        if (geMSSEngine.HFEnvr != 0) {
            int i31 = i22;
            long j12 = pointer2.get(i11);
            int i32 = 0;
            while (i32 < geMSSEngine.HFEnvr) {
                if ((j12 & 1) != 0) {
                    pointer3.setXorRange(0, pointerUnion2, 0, i28);
                    pointerUnion2.moveNextBytes(i29);
                    int i33 = i29;
                    geMSSEngine.choose_LOOPJR(pointer3, pointerUnion2, i32 + 1, j12 >>> 1, i33, i28);
                    i29 = i33;
                } else {
                    pointerUnion2.moveNextBytes(i31 * i29);
                }
                j12 >>>= 1;
                i32++;
                i31--;
                geMSSEngine = this;
            }
        }
        int i34 = i18 & 63;
        if (i34 != 0) {
            pointer3.setAnd(i28 - 1, (1 << i34) - 1);
        }
    }

    private long evalMQnocst_unrolled_no_simd_gf2(Pointer pointer, PointerUnion pointerUnion) {
        int i11;
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        long j11 = pointer.get();
        long dotProduct = 0;
        for (int i12 = 0; i12 < 64; i12++) {
            if ((1 & (j11 >>> i12)) != 0) {
                dotProduct ^= pointerUnion2.get(i12) & j11;
            }
        }
        pointerUnion2.move(64);
        int i13 = 1;
        while (true) {
            int i14 = this.NB_WORD_GF2nv;
            if (i13 >= i14) {
                return GeMSSUtils.XORBITS_UINT(dotProduct);
            }
            int i15 = i13 + 1;
            if (i14 != i15 || (i11 = this.HFEnvr) == 0) {
                i11 = 64;
            }
            long j12 = pointer.get(i13);
            for (int i16 = 0; i16 < i11; i16++) {
                if (((j12 >>> i16) & 1) != 0) {
                    dotProduct ^= pointerUnion2.getDotProduct(0, pointer, 0, i15);
                }
                pointerUnion2.move(i15);
            }
            i13 = i15;
        }
    }

    private void findRootsSplit_gf2nx(Pointer pointer, Pointer pointer2, int i11) {
        int i12;
        int iGcd_gf2nx;
        int i13;
        if (i11 == 1) {
            pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
            return;
        }
        if ((this.HFEn & 1) != 0 && i11 == 2) {
            findRootsSplit2_HT_gf2nx(pointer, pointer2);
            return;
        }
        int i14 = (i11 << 1) - 1;
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn * i14);
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn * i11);
        int i15 = i11 + 1;
        Pointer pointer5 = new Pointer(this.NB_WORD_GFqn * i15);
        Pointer pointer6 = new Pointer(this.NB_WORD_GFqn);
        while (true) {
            pointer3.setRangeClear(0, this.NB_WORD_GFqn * i14);
            pointer4.setRangeClear(0, this.NB_WORD_GFqn * i11);
            do {
                pointer4.fillRandom(this.NB_WORD_GFqn, this.random, this.NB_BYTES_GFqn);
                pointer4.setAnd((this.NB_WORD_GFqn << 1) - 1, this.MASK_GF2n);
                i12 = this.NB_WORD_GFqn;
            } while (pointer4.is0_gf2n(i12, i12) != 0);
            pointer5.copyFrom(pointer2, this.NB_WORD_GFqn * i15);
            traceMap_gf2nx(pointer4, pointer3, pointer5, i11);
            iGcd_gf2nx = gcd_gf2nx(pointer5, i11, pointer4, pointer4.searchDegree(i11 - 1, 1, this.NB_WORD_GFqn));
            i13 = this.buffer;
            if (iGcd_gf2nx != 0 && iGcd_gf2nx != i11) {
                break;
            }
        }
        if (i13 != 0) {
            pointer4.swap(pointer5);
        }
        inv_gf2n(pointer6, pointer5, this.NB_WORD_GFqn * iGcd_gf2nx);
        int i16 = this.NB_WORD_GFqn;
        pointer5.set1_gf2n(iGcd_gf2nx * i16, i16);
        for_mul(pointer5, pointer6, iGcd_gf2nx - 1);
        div_q_monic_gf2nx(pointer2, i11, pointer5, iGcd_gf2nx);
        findRootsSplit_gf2nx(pointer, pointer5, iGcd_gf2nx);
        findRootsSplit_gf2nx(new Pointer(pointer, this.NB_WORD_GFqn * iGcd_gf2nx), new Pointer(pointer2, this.NB_WORD_GFqn * iGcd_gf2nx), i11 - iGcd_gf2nx);
    }

    private void for_and_xor_shift_incre_move(Pointer pointer, int i11, int i12) {
        long j11 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            pointer.setAnd(j11);
            pointer.setXor(1 << i13);
            j11 = (j11 << 1) + 1;
            pointer.move(i11);
        }
    }

    private void for_casct_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        int i13 = this.NB_WORD_GFqn * i12;
        int i14 = 0;
        while (i14 < i11) {
            CMP_AND_SWAP_CST_TIME(pointer, pointer2, pointer3);
            pointer.move(i13);
            pointer2.move(i13);
            i14 += i12;
        }
    }

    private void for_copy_move(Pointer pointer, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar) {
        for (int i11 = 1; i11 < this.NB_COEFS_HFEPOLY; i11++) {
            pointer.move(complete_sparse_monic_gf2nxVar.L[i11]);
            Pointer pointer2 = complete_sparse_monic_gf2nxVar.poly;
            int i12 = this.NB_WORD_GFqn;
            pointer.copyFrom(0, pointer2, i11 * i12, i12);
        }
    }

    private void for_mul(Pointer pointer, Pointer pointer2, int i11) {
        Pointer pointer3 = new Pointer(pointer, this.NB_WORD_GFqn * i11);
        while (i11 != -1) {
            mul_gf2n(pointer3, pointer3, pointer2);
            pointer3.move(-this.NB_WORD_GFqn);
            i11--;
        }
    }

    private void for_mul_rem_xor_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11, int i12) {
        int i13 = this.NB_WORD_GFqn * i11;
        while (i11 < i12) {
            mul_rem_xorrange(pointer, pointer2, pointer3, i13);
            pointer.move(this.NB_WORD_GFqn);
            i11++;
            i13 += this.NB_WORD_GFqn;
        }
    }

    private int for_setPK(byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        bArr[i11] = (byte) (bArr2[i12] & 3);
        int pk2 = 2;
        for (int i14 = 2; i14 < i13; i14++) {
            int i15 = this.HFEnv;
            pk2 = setPK(bArr, bArr2, i14, i11, i12, pk2, i15 - 1, i15 - i14);
        }
        return pk2;
    }

    private int for_setpk2_end_move_plus(Pointer pointer, PointerUnion pointerUnion, int i11) {
        int i12 = 1;
        int i13 = 0;
        while (i13 < i11) {
            Pointer pointer2 = pointer;
            PointerUnion pointerUnion2 = pointerUnion;
            int pk2Value = setPk2Value(pointer2, pointerUnion2, i12, i13, 64);
            setPk2_endValue(pointer2, pointerUnion2, pk2Value, i13);
            i13++;
            pointerUnion2.move(i13);
            pointer2.move(i13);
            i12 = pk2Value + (i13 << 6);
            pointer = pointer2;
            pointerUnion = pointerUnion2;
        }
        return i12;
    }

    private void for_sqr_divsqr(Pointer pointer, int i11, int i12, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        while (i11 < i12) {
            sqr_gf2nx(pointer, this.HFEDeg - 1);
            int i13 = this.HFEDeg;
            divsqr_r_HFE_cstdeg_gf2nx(pointer, (i13 - 1) << 1, (i13 - 1) << 1, i13, complete_sparse_monic_gf2nxVar, pointer2);
            i11++;
        }
    }

    private void frobeniusMap_multisqr_HFE_gf2nx(Pointer pointer, SecretKeyHFE.complete_sparse_monic_gf2nx complete_sparse_monic_gf2nxVar, Pointer pointer2) {
        Pointer pointer3 = new Pointer();
        Pointer pointer4 = new Pointer(this.HFEDeg * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer();
        Pointer pointer6 = new Pointer(((this.KX * this.HFEDeg) + this.POW_II) * this.NB_WORD_GFqn);
        int i11 = (this.POW_II * this.KP) - this.HFEDeg;
        Pointer pointer7 = new Pointer(pointer6, this.NB_WORD_GFqn * i11);
        pointer7.copyFrom(pointer2, this.NB_WORD_GFqn);
        for_copy_move(pointer7, complete_sparse_monic_gf2nxVar);
        int i12 = i11 - 1;
        divsqr_r_HFE_cstdeg_gf2nx(pointer6, this.HFEDeg + i12, i12, 0, complete_sparse_monic_gf2nxVar, pointer2);
        int i13 = this.KP + 1;
        while (true) {
            int i14 = this.HFEDeg;
            if (i13 >= i14) {
                break;
            }
            pointer7.changeIndex(pointer6, i14 * this.NB_WORD_GFqn);
            pointer7.setRangeClear(0, this.POW_II * this.NB_WORD_GFqn);
            int i15 = this.POW_II;
            int i16 = this.NB_WORD_GFqn;
            pointer7.copyFrom(i15 * i16, pointer6, 0, this.HFEDeg * i16);
            pointer6.changeIndex(pointer7);
            int i17 = this.POW_II;
            divsqr_r_HFE_cstdeg_gf2nx(pointer6, (i17 - 1) + this.HFEDeg, i17 - 1, 0, complete_sparse_monic_gf2nxVar, pointer2);
            i13++;
        }
        pointer6.indexReset();
        int i18 = (1 << this.HFEDegI) - this.KP;
        int i19 = this.HFEDeg;
        int i21 = this.NB_WORD_GFqn;
        pointer.copyFrom(0, pointer6, i18 * i19 * i21, i19 * i21);
        int i22 = 0;
        while (true) {
            int i23 = this.HFEn;
            int i24 = this.HFEDegI;
            int i25 = this.II;
            if (i22 >= ((i23 - i24) - i25) / i25) {
                for_sqr_divsqr(pointer, 0, (i23 - i24) % i25, complete_sparse_monic_gf2nxVar, pointer2);
                return;
            }
            loop_sqr(pointer4, pointer);
            for (int i26 = 1; i26 < this.II; i26++) {
                loop_sqr(pointer4, pointer4);
            }
            pointer5.changeIndex(pointer4, this.KP * this.NB_WORD_GFqn);
            pointer7.changeIndex(pointer6);
            pointer3.changeIndex(pointer);
            for (int i27 = 0; i27 < this.HFEDeg; i27++) {
                mul_gf2n(pointer3, pointer7, pointer5);
                pointer3.move(this.NB_WORD_GFqn);
                pointer7.move(this.NB_WORD_GFqn);
            }
            for (int i28 = this.KP + 1; i28 < this.HFEDeg; i28++) {
                pointer5.move(this.NB_WORD_GFqn);
                pointer3.changeIndex(pointer);
                for (int i29 = 0; i29 < this.HFEDeg; i29++) {
                    mul_rem_xorrange(pointer3, pointer7, pointer5);
                    pointer3.move(this.NB_WORD_GFqn);
                    pointer7.move(this.NB_WORD_GFqn);
                }
            }
            for (int i31 = 0; i31 < this.KP; i31++) {
                int i32 = this.POW_II * i31;
                int i33 = this.NB_WORD_GFqn;
                pointer.setXorRange(i32 * i33, pointer4, i31 * i33, i33);
            }
            i22++;
        }
    }

    private int gcd_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        int iDiv_r_monic_gf2nx;
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        this.buffer = 0;
        int i13 = i11;
        Pointer pointer4 = pointer;
        Pointer pointer5 = pointer2;
        while (true) {
            int i14 = i13;
            if (i12 == 0) {
                return i14;
            }
            if ((i12 << 1) > i14) {
                iDiv_r_monic_gf2nx = div_r_gf2nx(pointer4, i14, pointer5, i12);
            } else {
                inv_gf2n(pointer3, pointer5, this.NB_WORD_GFqn * i12);
                int i15 = this.NB_WORD_GFqn;
                pointer5.set1_gf2n(i12 * i15, i15);
                for_mul(pointer5, pointer3, i12 - 1);
                iDiv_r_monic_gf2nx = div_r_monic_gf2nx(pointer4, i14, pointer5, i12);
            }
            this.buffer = 1 - this.buffer;
            Pointer pointer6 = pointer4;
            pointer4 = pointer5;
            pointer5 = pointer6;
            i13 = i12;
            i12 = iDiv_r_monic_gf2nx;
        }
    }

    private void getSHA3Hash(Pointer pointer, int i11, int i12, byte[] bArr, int i13, int i14, byte[] bArr2) {
        this.sha3Digest.update(bArr, i13, i14);
        this.sha3Digest.doFinal(bArr2, 0);
        pointer.fill(i11, bArr2, 0, i12);
    }

    private void initListDifferences_gf2nx(int[] iArr) {
        iArr[1] = this.NB_WORD_GFqn;
        int arrayL = 2;
        int i11 = 0;
        while (i11 < this.HFEDegI) {
            if (!this.ENABLED_REMOVE_ODD_DEGREE || (1 << i11) + 1 <= this.HFE_odd_degree) {
                iArr[arrayL] = this.NB_WORD_GFqn;
                arrayL = setArrayL(iArr, arrayL + 1, 0, i11);
            } else {
                if (i11 != 0) {
                    iArr[arrayL] = this.NB_WORD_GFqn << 1;
                    arrayL++;
                }
                arrayL = setArrayL(iArr, arrayL, 1, i11);
            }
            i11++;
        }
        int i12 = this.HFEDegJ;
        if (i12 != 0) {
            if (!this.ENABLED_REMOVE_ODD_DEGREE || (1 << i11) + 1 <= this.HFE_odd_degree) {
                iArr[arrayL] = this.NB_WORD_GFqn;
                setArrayL(iArr, arrayL + 1, 0, i12 - 1);
            } else {
                iArr[arrayL] = this.NB_WORD_GFqn << 1;
                setArrayL(iArr, arrayL + 1, 1, i12 - 1);
            }
        }
    }

    private void inv_gf2n(Pointer pointer, Pointer pointer2, int i11) {
        int index = pointer2.getIndex();
        pointer2.move(i11);
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        for (int i12 = this.HFEn_1rightmost - 1; i12 != -1; i12--) {
            int i13 = (this.HFEn - 1) >>> (i12 + 1);
            sqr_gf2n(pointer3, pointer);
            for (int i14 = 1; i14 < i13; i14++) {
                sqr_gf2n(pointer3, pointer3);
            }
            mul_gf2n(pointer, pointer, pointer3);
            if ((((this.HFEn - 1) >>> i12) & 1) != 0) {
                sqr_gf2n(pointer3, pointer);
                mul_gf2n(pointer, pointer2, pointer3);
            }
        }
        sqr_gf2n(pointer, pointer);
        pointer2.changeIndex(index);
    }

    private void loop_sqr(Pointer pointer, Pointer pointer2) {
        for (int i11 = 0; i11 < this.HFEDeg; i11++) {
            int i12 = this.NB_WORD_GFqn;
            sqr_gf2n(pointer, i11 * i12, pointer2, i12 * i11);
        }
    }

    private int loop_xor_loop_move_xorandmask_move(Pointer pointer, Pointer pointer2, Pointer pointer3, Pointer pointer4, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 0;
        int i17 = i11;
        while (i16 < i13) {
            pointer.setXor(i12, 1 << i16);
            pointer2.changeIndex(pointer);
            pointer3.changeIndex(pointer4);
            for (int i18 = i17; i18 < i14; i18++) {
                pointer2.move(i15);
                pointer3.move((i18 >>> 6) + 1);
                pointer2.setXorRangeAndMask(pointer, i12 + 1, -((pointer3.get() >>> i16) & 1));
            }
            pointer.move(i15);
            pointer4.move(i12 + 1);
            i16++;
            i17++;
        }
        return i17;
    }

    private void mulMatricesLU_gf2(Pointer pointer, Pointer pointer2, Pointer pointer3, FunctionParams functionParams) {
        int i11;
        int i12;
        int i13;
        boolean z11;
        int index = pointer.getIndex();
        int i14 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
        if (i14 == 1) {
            int i15 = this.HFEnq;
            i11 = this.HFEnr;
            i12 = i15;
            i13 = 1;
            z11 = true;
        } else {
            if (i14 != 2) {
                throw new IllegalArgumentException("Invalid parameter for MULMATRICESLU_GF2");
            }
            int i16 = this.HFEnvq;
            i11 = this.HFEnvr;
            i12 = i16;
            i13 = 1;
            z11 = i11 != 0;
        }
        int i17 = i11;
        Pointer pointer4 = new Pointer(pointer2);
        int i18 = i13;
        while (true) {
            int i19 = i17;
            if (i18 > i12) {
                LOOPIR(pointer, pointer4, pointer3, i17, i12, i19, i18, z11);
                pointer.changeIndex(index);
                return;
            } else {
                LOOPIR(pointer, pointer4, pointer3, 64, i12, i19, i18, z11);
                i18++;
                i17 = i19;
            }
        }
    }

    private void precSignHFE(SecretKeyHFE secretKeyHFE, Pointer[] pointerArr, byte[] bArr) {
        precSignHFESeed(secretKeyHFE, bArr);
        initListDifferences_gf2nx(secretKeyHFE.F_struct.L);
        Pointer pointer = new Pointer(secretKeyHFE.F_HFEv);
        Pointer pointer2 = new Pointer(this.NB_COEFS_HFEPOLY * this.NB_WORD_GFqn);
        Pointer pointer3 = new Pointer(pointer, this.MQv_GFqn_SIZE);
        pointerArr[0] = pointer3;
        pointer.changeIndex(pointer3, this.MLv_GFqn_SIZE);
        Pointer pointer4 = new Pointer(pointer2, this.NB_WORD_GFqn * 2);
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i11 >= this.HFEDegI) {
                break;
            }
            if ((1 << i11) + 1 <= this.HFE_odd_degree || !this.ENABLED_REMOVE_ODD_DEGREE) {
                i12 = 0;
            }
            int i13 = i11 - i12;
            pointer4.copyFrom(pointer, this.NB_WORD_GFqn * i13);
            pointer.move(this.NB_WORD_GFqn * i13);
            pointer4.move(i13 * this.NB_WORD_GFqn);
            i11++;
            pointerArr[i11] = new Pointer(pointer);
            pointer.move(this.MLv_GFqn_SIZE);
            pointer4.move(this.NB_WORD_GFqn);
        }
        int i14 = this.HFEDegJ;
        if (i14 != 0) {
            pointer4.copyFrom(pointer, (i14 - ((1 << i11) + 1 > this.HFE_odd_degree ? 1 : 0)) * this.NB_WORD_GFqn);
        }
        secretKeyHFE.F_struct.poly = new Pointer(pointer2);
    }

    private void precSignHFESeed(SecretKeyHFE secretKeyHFE, byte[] bArr) {
        int i11 = this.NB_UINT_HFEVPOLY + ((this.LTRIANGULAR_NV_SIZE + this.LTRIANGULAR_N_SIZE) << 1);
        secretKeyHFE.sk_uncomp = new Pointer(this.MATRIXnv_SIZE + i11 + this.MATRIXn_SIZE);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(this.ShakeBitStrength);
        sHAKEDigest.update(bArr, 0, this.SIZE_SEED_SK);
        int i12 = i11 << 3;
        byte[] bArr2 = new byte[i12];
        sHAKEDigest.doFinal(bArr2, 0, i12);
        secretKeyHFE.sk_uncomp.fill(0, bArr2, 0, i12);
        Pointer pointer = new Pointer(secretKeyHFE.sk_uncomp, i11);
        secretKeyHFE.S = pointer;
        secretKeyHFE.T = new Pointer(pointer, this.MATRIXnv_SIZE);
        Pointer pointer2 = new Pointer(secretKeyHFE.sk_uncomp);
        secretKeyHFE.F_HFEv = pointer2;
        cleanMonicHFEv_gf2nx(pointer2);
        Pointer pointer3 = new Pointer(secretKeyHFE.sk_uncomp, this.NB_UINT_HFEVPOLY);
        Pointer pointer4 = new Pointer(pointer3, this.LTRIANGULAR_NV_SIZE);
        FunctionParams functionParams = FunctionParams.NV;
        cleanLowerMatrix(pointer3, functionParams);
        cleanLowerMatrix(pointer4, functionParams);
        mulMatricesLU_gf2(secretKeyHFE.S, pointer3, pointer4, functionParams);
        pointer3.move(this.LTRIANGULAR_NV_SIZE << 1);
        pointer4.changeIndex(pointer3, this.LTRIANGULAR_N_SIZE);
        FunctionParams functionParams2 = FunctionParams.N;
        cleanLowerMatrix(pointer3, functionParams2);
        cleanLowerMatrix(pointer4, functionParams2);
        mulMatricesLU_gf2(secretKeyHFE.T, pointer3, pointer4, functionParams2);
    }

    private void rem_gf2n(Pointer pointer, int i11, Pointer pointer2) {
        this.rem.rem_gf2n(pointer.array, i11 + pointer.getIndex(), pointer2.array);
    }

    private static long remainderUnsigned(long j11, long j12) {
        return (j11 <= 0 || j12 <= 0) ? new BigInteger(1, Pack.longToBigEndian(j11)).mod(new BigInteger(1, Pack.longToBigEndian(j12))).longValue() : j11 % j12;
    }

    private int setArrayL(int[] iArr, int i11, int i12, int i13) {
        while (i12 < i13) {
            iArr[i11] = this.NB_WORD_GFqn << i12;
            i12++;
            i11++;
        }
        return i11;
    }

    private int setPK(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, int i15, int i16) {
        while (i15 >= i16) {
            int i17 = (i14 >>> 3) + i12;
            bArr[i17] = (byte) (bArr[i17] ^ (((bArr2[(i11 >>> 3) + i13] >>> (i11 & 7)) & 1) << (i14 & 7)));
            i11 += i15;
            i15--;
            i14++;
        }
        this.buffer = i11;
        return i14;
    }

    private int setPk2Value(Pointer pointer, PointerUnion pointerUnion, int i11, int i12, int i13) {
        for (int i14 = 1; i14 < i13; i14++) {
            int i15 = i11 & 63;
            if (i15 != 0) {
                pointer.setRangePointerUnion(pointerUnion, i12, i15);
                pointer.set(i12, pointerUnion.get(i12) >>> i15);
                int i16 = i15 + i14;
                if (i16 > 64) {
                    pointer.setXor(i12, pointerUnion.get(i12 + 1) << (64 - i15));
                }
                if (i16 >= 64) {
                    pointerUnion.moveIncremental();
                }
            } else {
                pointer.setRangePointerUnion(pointerUnion, i12 + 1);
            }
            pointerUnion.move(i12);
            pointer.setAnd(i12, (1 << i14) - 1);
            pointer.move(i12 + 1);
            i11 += (i12 << 6) + i14;
        }
        return i11;
    }

    private void setPk2_endValue(Pointer pointer, PointerUnion pointerUnion, int i11, int i12) {
        int i13 = i11 & 63;
        int i14 = i12 + 1;
        if (i13 != 0) {
            pointer.setRangePointerUnion(pointerUnion, i14, i13);
        } else {
            pointer.setRangePointerUnion(pointerUnion, i14);
        }
    }

    private void special_buffer(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        int i11;
        int index = pointer2.getIndex();
        pointer2.move((this.NB_WORD_GFqn * (this.HFEv + 1)) << 1);
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        pointer.move(this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer(pointer2, this.NB_WORD_GFqn * (this.HFEv + 2));
        int i12 = 2;
        while (i12 < this.SIZE_ROW - 1) {
            copy_move_matrix_move(pointer, pointer4, i12 - 1);
            i12++;
        }
        if (this.ENABLED_REMOVE_ODD_DEGREE) {
            while (i12 < this.SIZE_ROW - 1) {
                copy_move_matrix_move(pointer, pointer4, i12 - 2);
                i12++;
            }
        }
        pointer.set1_gf2n(0, this.NB_WORD_GFqn);
        pointer.setXorMatrix(pointer4, this.NB_WORD_GFqn, this.HFEDegJ);
        for (int i13 = 0; i13 < this.HFEn - 1; i13++) {
            mul_gf2n(pointer, pointer3, pointer2);
            pointer.move(this.NB_WORD_GFqn);
            pointer4.changeIndex(pointer2, this.NB_WORD_GFqn * (this.HFEv + 2));
            int i14 = 2;
            while (i14 < this.HFEDegI) {
                dotproduct_move_move(pointer, pointer4, pointer3, i14);
                i14++;
            }
            if (this.ENABLED_REMOVE_ODD_DEGREE) {
                pointer3.move(this.NB_WORD_GFqn);
                while (i14 < this.SIZE_ROW - 1) {
                    dotproduct_move_move(pointer, pointer4, pointer3, i14 - 1);
                    i14++;
                }
                pointer3.move(-this.NB_WORD_GFqn);
            }
            int i15 = this.HFEDegJ;
            if (i15 == 0) {
                pointer.copyFrom(pointer3, this.NB_WORD_GFqn);
                pointer.move(this.NB_WORD_GFqn);
                i11 = this.SIZE_ROW;
            } else {
                dotProduct_gf2n(pointer, pointer3, pointer4, i15);
                pointer3.move(this.HFEDegJ * this.NB_WORD_GFqn);
                pointer.setXorRange_SelfMove(pointer3, this.NB_WORD_GFqn);
                i11 = this.SIZE_ROW - this.HFEDegJ;
            }
            pointer3.move(i11 * this.NB_WORD_GFqn);
        }
        pointer.indexReset();
        pointer2.changeIndex(index);
        pointer3.indexReset();
    }

    private void sqr_gf2n(Pointer pointer, int i11, Pointer pointer2, int i12) {
        this.mul.sqr_gf2x(this.Buffer_NB_WORD_MUL.array, pointer2.array, i12 + pointer2.f99075cp);
        rem_gf2n(pointer, i11, this.Buffer_NB_WORD_MUL);
    }

    private void sqr_gf2nx(Pointer pointer, int i11) {
        int i12 = this.NB_WORD_GFqn * i11;
        int index = pointer.getIndex();
        pointer.move(i12);
        Pointer pointer2 = new Pointer(pointer, i12);
        for (int i13 = 0; i13 < i11; i13++) {
            sqr_gf2n(pointer2, pointer);
            pointer.move(-this.NB_WORD_GFqn);
            pointer2.move(-this.NB_WORD_GFqn);
            pointer2.setRangeClear(0, this.NB_WORD_GFqn);
            pointer2.move(-this.NB_WORD_GFqn);
        }
        sqr_gf2n(pointer, pointer);
        pointer.changeIndex(index);
    }

    private void traceMap_gf2nx(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        int i12;
        int i13 = 1;
        while (true) {
            i12 = 1 << i13;
            if (i12 >= i11) {
                break;
            }
            int i14 = this.NB_WORD_GFqn;
            sqr_gf2n(pointer, i14 << i13, pointer, i14 << (i13 - 1));
            i13++;
        }
        if (i13 < this.HFEn) {
            int i15 = this.NB_WORD_GFqn;
            sqr_gf2n(pointer2, i15 << i13, pointer, i15 << (i13 - 1));
            div_r_monic_cst_gf2nx(pointer2, i12, pointer3, i11);
            pointer.setXorRange(pointer2, this.NB_WORD_GFqn * i11);
            for (int i16 = i13 + 1; i16 < this.HFEn; i16++) {
                int i17 = i11 - 1;
                sqr_gf2nx(pointer2, i17);
                div_r_monic_cst_gf2nx(pointer2, i17 << 1, pointer3, i11);
                pointer.setXorRange(pointer2, this.NB_WORD_GFqn * i11);
            }
        }
    }

    private void uncompress_signHFE(Pointer pointer, byte[] bArr) {
        PointerUnion pointerUnion = new PointerUnion(pointer);
        int i11 = (1 << this.HFEnvr8) - 1;
        pointerUnion.fillBytes(0, bArr, 0, this.NB_BYTES_GFqnv);
        if (this.HFEnvr8 != 0) {
            pointerUnion.setAndByte(this.NB_BYTES_GFqnv - 1, i11);
        }
        int i12 = this.HFEnv;
        pointerUnion.moveNextBytes((this.NB_WORD_GF2nv << 3) + (this.HFEmq8 & 7));
        for (int i13 = 1; i13 < this.NB_ITE; i13++) {
            int i14 = i12 & 7;
            int iMin = Math.min(this.HFEDELTA + this.HFEv, (8 - i14) & 7);
            if (i14 != 0) {
                pointerUnion.setXorByte(((bArr[i12 >>> 3] & 255) >>> i14) << this.HFEmr8);
                int i15 = iMin - this.VAL_BITS_M;
                if (i15 >= 0) {
                    pointerUnion.moveNextByte();
                }
                if (i15 > 0) {
                    int i16 = i12 + this.VAL_BITS_M;
                    pointerUnion.setXorByte((bArr[i16 >>> 3] & 255) >>> (i16 & 7));
                    i12 = i16 + i15;
                } else {
                    i12 += iMin;
                }
            }
            int i17 = (this.HFEDELTA + this.HFEv) - iMin;
            int i18 = (this.HFEm + iMin) & 7;
            if (i18 != 0) {
                for (int i19 = 0; i19 < ((i17 - 1) >>> 3); i19++) {
                    int i21 = i12 >>> 3;
                    pointerUnion.setXorByte((bArr[i21] & 255) << i18);
                    pointerUnion.moveNextByte();
                    pointerUnion.setXorByte((bArr[i21] & 255) >>> (8 - i18));
                    i12 += 8;
                }
                int i22 = i12 >>> 3;
                pointerUnion.setXorByte((bArr[i22] & 255) << i18);
                pointerUnion.moveNextByte();
                int i23 = ((i17 + 7) & 7) + 1;
                int i24 = 8 - i18;
                if (i23 > i24) {
                    pointerUnion.setByte((bArr[i22] & 255) >>> i24);
                    pointerUnion.moveNextByte();
                }
                i12 += i23;
            } else {
                for (int i25 = 0; i25 < ((i17 + 7) >>> 3); i25++) {
                    pointerUnion.setByte(bArr[i12 >>> 3]);
                    i12 += 8;
                    pointerUnion.moveNextByte();
                }
                i12 -= (8 - (i17 & 7)) & 7;
            }
            if (this.HFEnvr8 != 0) {
                pointerUnion.setAndByte(-1, i11);
            }
            pointerUnion.moveNextBytes(((8 - (this.NB_BYTES_GFqnv & 7)) & 7) + (this.HFEmq8 & 7));
        }
    }

    private void vmpv_xorrange_move(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        vecMatProduct(pointer, pointer2, new Pointer(pointer3, this.NB_WORD_GFqn), FunctionParams.V);
        pointer.setXorRange(pointer3, this.NB_WORD_GFqn);
        pointer3.move(this.MLv_GFqn_SIZE);
    }

    void changeVariablesMQS64_gf2(Pointer pointer, Pointer pointer2) {
        Pointer pointer3 = new Pointer();
        int i11 = this.HFEnv;
        Pointer pointer4 = new Pointer(i11 * i11 * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(pointer, this.NB_WORD_GFqn);
        Pointer pointer6 = new Pointer(pointer4);
        Pointer pointer7 = new Pointer(pointer2);
        int i12 = 0;
        for (int i13 = 0; i13 < this.HFEnv; i13++) {
            pointer3.changeIndex(pointer5);
            for (int i14 = 0; i14 < this.HFEnvq; i14++) {
                for (int i15 = 0; i15 < 64; i15++) {
                    Pointer pointer8 = pointer6;
                    Pointer pointer9 = pointer3;
                    LOOPKR(pointer9, pointer8, pointer7.get() >>> i15, i15, 64);
                    pointer3 = pointer9;
                    pointer6 = pointer8;
                    LOOPK_COMPLETE(pointer6, pointer7, pointer3, 1, this.HFEnvq - i14);
                }
                pointer7.moveIncremental();
            }
            if (this.HFEnvr != 0) {
                for (int i16 = 0; i16 < this.HFEnvr; i16++) {
                    Pointer pointer10 = pointer6;
                    Pointer pointer11 = pointer3;
                    LOOPKR(pointer11, pointer10, pointer7.get() >>> i16, i16, this.HFEnvr);
                    pointer3 = pointer11;
                    pointer6 = pointer10;
                    pointer6.move(this.NB_WORD_GFqn);
                }
                pointer7.moveIncremental();
            }
        }
        pointer5.changeIndex(pointer4);
        pointer6.changeIndex(pointer, this.NB_WORD_GFqn);
        Pointer pointer12 = new Pointer(pointer2);
        int i17 = 0;
        while (i17 < this.HFEnvq) {
            int i18 = 0;
            while (i18 < 64) {
                pointer7.changeIndex(pointer12);
                Pointer pointer13 = pointer3;
                Pointer pointer14 = pointer5;
                Pointer pointer15 = pointer7;
                LOOPIR_INIT(pointer6, pointer13, pointer14, pointer15, i18, 64);
                Pointer pointer16 = pointer6;
                Pointer pointer17 = pointer14;
                pointer3 = pointer13;
                int i19 = i18;
                for (int i21 = i17 + 1; i21 < this.HFEnvq; i21++) {
                    Pointer pointer18 = pointer3;
                    Pointer pointer19 = pointer17;
                    Pointer pointer20 = pointer16;
                    LOOPIR_INIT(pointer20, pointer18, pointer19, pointer15, 0, 64);
                    pointer16 = pointer20;
                    pointer17 = pointer19;
                    pointer3 = pointer18;
                }
                int i22 = this.HFEnvr;
                if (i22 != 0) {
                    Pointer pointer21 = pointer3;
                    Pointer pointer22 = pointer17;
                    Pointer pointer23 = pointer16;
                    LOOPIR_INIT(pointer23, pointer21, pointer22, pointer15, 0, i22);
                    pointer16 = pointer23;
                    pointer17 = pointer22;
                    pointer3 = pointer21;
                }
                pointer17.changeIndex(pointer3);
                pointer12.move(this.NB_WORD_GF2nv);
                i18 = i19 + 1;
                pointer5 = pointer17;
                pointer6 = pointer16;
                pointer7 = pointer15;
            }
            i17++;
            pointer6 = pointer6;
        }
        Pointer pointer24 = pointer6;
        Pointer pointer25 = pointer5;
        Pointer pointer26 = pointer7;
        if (this.HFEnvr != 0) {
            int i23 = 0;
            while (i23 < this.HFEnvr) {
                pointer26.changeIndex(pointer12);
                pointer3.changeIndex(pointer25);
                Pointer pointer27 = pointer3;
                Pointer pointer28 = pointer25;
                Pointer pointer29 = pointer24;
                LOOPIR_INIT(pointer29, pointer27, pointer28, pointer26, i23, this.HFEnvr);
                pointer3 = pointer27;
                pointer28.changeIndex(pointer3);
                pointer12.move(this.NB_WORD_GF2nv);
                i23++;
                pointer24 = pointer29;
                pointer25 = pointer28;
            }
        }
        Pointer pointer30 = pointer25;
        Pointer pointer31 = pointer24;
        pointer30.changeIndex(pointer4);
        pointer31.changeIndex(pointer, this.NB_WORD_GFqn);
        pointer26.changeIndex(pointer2);
        for (int i24 = 0; i24 < this.HFEnvq; i24++) {
            int i25 = 0;
            while (i25 < 64) {
                pointer31.move(this.NB_WORD_GFqn);
                pointer30.move(this.HFEnv * this.NB_WORD_GFqn);
                pointer3.changeIndex(pointer30);
                int i26 = i25 + 1;
                Pointer pointer32 = pointer26;
                LOOPIR_LOOPK_COMPLETE(pointer31, pointer32, pointer3, i26, 64);
                pointer26 = pointer32;
                for (int i27 = i24 + 1; i27 < this.HFEnvq; i27++) {
                    Pointer pointer33 = pointer26;
                    LOOPIR_LOOPK_COMPLETE(pointer31, pointer33, pointer3, 0, 64);
                    pointer26 = pointer33;
                }
                int i28 = this.HFEnvr;
                if (i28 != 0) {
                    Pointer pointer34 = pointer26;
                    LOOPIR_LOOPK_COMPLETE(pointer31, pointer34, pointer3, 0, i28);
                    pointer26 = pointer34;
                }
                pointer26.move(this.NB_WORD_GF2nv);
                i25 = i26;
            }
        }
        if (this.HFEnvr != 0) {
            while (i12 < this.HFEnvr - 1) {
                pointer31.move(this.NB_WORD_GFqn);
                pointer30.move(this.HFEnv * this.NB_WORD_GFqn);
                pointer3.changeIndex(pointer30);
                i12++;
                Pointer pointer35 = pointer26;
                LOOPIR_LOOPK_COMPLETE(pointer31, pointer35, pointer3, i12, this.HFEnvr);
                pointer35.move(this.NB_WORD_GF2nv);
                pointer26 = pointer35;
            }
        }
        pointer.indexReset();
        pointer2.indexReset();
    }

    void cleanLowerMatrix(Pointer pointer, FunctionParams functionParams) {
        int i11;
        int i12;
        int i13 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            i11 = this.HFEnq;
            i12 = this.HFEnr;
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException("");
            }
            i11 = this.HFEnvq;
            i12 = this.HFEnvr;
        }
        Pointer pointer2 = new Pointer(pointer);
        while (i14 <= i11) {
            for_and_xor_shift_incre_move(pointer2, i14, 64);
            pointer2.moveIncremental();
            i14++;
        }
        for_and_xor_shift_incre_move(pointer2, i14, i12);
    }

    void cleanMonicHFEv_gf2nx(Pointer pointer) {
        int i11 = this.NB_WORD_GFqn - 1;
        while (i11 < this.NB_UINT_HFEVPOLY) {
            pointer.setAnd(i11, this.MASK_GF2n);
            i11 += this.NB_WORD_GFqn;
        }
    }

    public void compress_signHFE(byte[] bArr, Pointer pointer) {
        int i11;
        byte[] bytes = pointer.toBytes(pointer.getLength() << 3);
        System.arraycopy(bytes, 0, bArr, 0, this.NB_BYTES_GFqnv);
        int i12 = this.HFEnv;
        int i13 = (this.NB_WORD_GF2nv << 3) + (this.HFEmq8 & 7);
        for (int i14 = 1; i14 < this.NB_ITE; i14++) {
            int i15 = i12 & 7;
            int iMin = Math.min(this.HFEDELTA + this.HFEv, (8 - i15) & 7);
            if (i15 != 0) {
                int i16 = this.HFEmr8;
                if (i16 != 0) {
                    int i17 = i12 >>> 3;
                    bArr[i17] = (byte) ((((bytes[i13] & 255) >>> i16) << i15) ^ bArr[i17]);
                    int i18 = this.VAL_BITS_M;
                    int i19 = iMin - i18;
                    if (i19 >= 0) {
                        i13++;
                    }
                    if (i19 > 0) {
                        int i21 = i12 + i18;
                        int i22 = i21 >>> 3;
                        bArr[i22] = (byte) (bArr[i22] ^ ((bytes[i13] & 255) << (i21 & 7)));
                        i12 = i21 + i19;
                    }
                } else {
                    int i23 = i12 >>> 3;
                    bArr[i23] = (byte) (((bytes[i13] & 255) << i15) ^ bArr[i23]);
                }
                i12 += iMin;
            }
            int i24 = (this.HFEDELTA + this.HFEv) - iMin;
            int i25 = (this.HFEm + iMin) & 7;
            if (i25 != 0) {
                for (int i26 = 0; i26 < ((i24 - 1) >>> 3); i26++) {
                    int i27 = (bytes[i13] & 255) >>> i25;
                    i13++;
                    bArr[i12 >>> 3] = (byte) (i27 ^ ((bytes[i13] & 255) << (8 - i25)));
                    i12 += 8;
                }
                int i28 = i12 >>> 3;
                i11 = i13 + 1;
                byte b11 = (byte) ((bytes[i13] & 255) >>> i25);
                bArr[i28] = b11;
                int i29 = ((i24 + 7) & 7) + 1;
                int i31 = 8 - i25;
                if (i29 > i31) {
                    bArr[i28] = (byte) (((byte) ((bytes[i11] & 255) << i31)) ^ b11);
                    i11 = i13 + 2;
                }
                i12 += i29;
            } else {
                int i32 = 0;
                while (i32 < ((i24 + 7) >>> 3)) {
                    bArr[i12 >>> 3] = bytes[i13];
                    i12 += 8;
                    i32++;
                    i13++;
                }
                i12 -= (8 - (i24 & 7)) & 7;
                i11 = i13;
            }
            i13 = ((8 - (this.NB_BYTES_GFqnv & 7)) & 7) + (this.HFEmq8 & 7) + i11;
        }
    }

    void convMQS_one_eq_to_hybrid_rep8_comp_gf2(byte[] bArr, PointerUnion pointerUnion, byte[] bArr2) {
        convMQ_UL_gf2(bArr, bArr2, this.HFEmr8);
        int bytesMove = 0;
        for (int i11 = 0; i11 < this.NB_MONOMIAL_PK; i11++) {
            bytesMove = pointerUnion.toBytesMove(bArr, bytesMove, this.HFEmq8);
            if (this.HFEmr8 != 0) {
                pointerUnion.moveNextByte();
            }
        }
    }

    void convMQS_one_eq_to_hybrid_rep8_uncomp_gf2(byte[] bArr, PointerUnion pointerUnion, byte[] bArr2) {
        int i11 = this.HFEmr8 - 1;
        convMQ_UL_gf2(bArr, bArr2, i11);
        int i12 = this.ACCESS_last_equations8;
        int i13 = this.NB_BYTES_EQUATION;
        int i14 = i12 + (i11 * i13);
        int i15 = i13 * i11;
        int iFor_setPK = for_setPK(bArr, bArr2, i14, i15, this.HFEnv);
        int i16 = this.HFEnv;
        setPK(bArr, bArr2, i16, i14, i15, iFor_setPK, i16 - 1, this.LOST_BITS);
        int i17 = this.buffer;
        long j11 = 0;
        for (int i18 = this.LOST_BITS - 1; i18 >= 0; i18--) {
            j11 ^= ((long) ((bArr2[(i17 >>> 3) + i15] >>> (i17 & 7)) & 1)) << ((this.LOST_BITS - 1) - i18);
            i17 += i18;
        }
        int i19 = this.ACCESS_last_equations8 - 1;
        for (int i21 = 0; i21 < this.HFEmr8 - 1; i21++) {
            i19 += this.NB_BYTES_EQUATION;
            bArr[i19] = (byte) (bArr[i19] ^ (((byte) (j11 >>> (this.HFENr8c * i21))) << this.HFENr8));
        }
        pointerUnion.indexReset();
        int bytesMove = 0;
        for (int i22 = 0; i22 < this.NB_MONOMIAL_PK; i22++) {
            bytesMove = pointerUnion.toBytesMove(bArr, bytesMove, this.HFEmq8);
            pointerUnion.moveNextByte();
        }
    }

    void convMQS_one_to_last_mr8_equations_gf2(byte[] bArr, PointerUnion pointerUnion) {
        int i11;
        pointerUnion.moveNextBytes(this.HFEmq8);
        PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
        int i12 = this.NB_MONOMIAL_PK >>> 3;
        int i13 = 0;
        for (int i14 = 0; i14 < this.HFEmr8; i14++) {
            pointerUnion2.changeIndex(pointerUnion);
            int i15 = 0;
            while (true) {
                if (i15 >= i12) {
                    break;
                }
                int i16 = (pointerUnion2.getByte() >>> i14) & 1;
                pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                for (int i17 = 1; i17 < 8; i17++) {
                    i16 ^= ((pointerUnion2.getByte() >>> i14) & 1) << i17;
                    pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                }
                bArr[i13] = (byte) i16;
                i15++;
                i13++;
            }
            if (this.HFENr8 != 0) {
                long withCheck = (pointerUnion2.getWithCheck() >>> i14) & 1;
                pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                for (i11 = 1; i11 < this.HFENr8; i11++) {
                    withCheck ^= ((pointerUnion2.getWithCheck() >>> i14) & 1) << i11;
                    pointerUnion2.moveNextBytes(this.NB_BYTES_GFqm);
                }
                bArr[i13] = (byte) withCheck;
                i13++;
            }
        }
    }

    void convMQ_UL_gf2(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.ACCESS_last_equations8;
            int i14 = this.NB_BYTES_EQUATION;
            for_setPK(bArr, bArr2, i13 + (i12 * i14), i12 * i14, this.HFEnv + 1);
        }
    }

    public int crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long j11;
        int i11;
        long j12;
        PointerUnion pointerUnion = new PointerUnion(bArr);
        int i12 = 0;
        long jConvMQ_uncompressL_gf2 = 0;
        if (this.HFENr8 == 0 || this.HFEmr8 <= 1) {
            j11 = 0;
        } else {
            PointerUnion pointerUnion2 = new PointerUnion(pointerUnion);
            pointerUnion2.moveNextBytes(this.ACCESS_last_equations8 - 1);
            j11 = 0;
            for (int i13 = 0; i13 < this.HFEmr8 - 1; i13++) {
                pointerUnion2.moveNextBytes(this.NB_BYTES_EQUATION);
                j11 ^= ((((long) pointerUnion2.getByte()) & 255) >>> this.HFENr8) << (this.HFENr8c * i13);
            }
        }
        int i14 = this.HFEmr8;
        if (i14 == 0) {
            Pointer pointer = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
            Pointer pointer2 = new Pointer(new Pointer(this.NB_WORD_GF2nv));
            Pointer pointer3 = new Pointer(this.SIZE_DIGEST_UINT);
            pointer.fill(0, bArr3, 0, this.NB_BYTES_GFqnv);
            getSHA3Hash(pointer3, 0, 64, bArr2, 0, bArr2.length, new byte[64]);
            evalMQSnocst8_quo_gf2(pointer2, pointer, pointerUnion);
            return pointer2.isEqual_nocst_gf2(pointer3, this.NB_WORD_GF2m);
        }
        Pointer pointer4 = new Pointer((this.NB_WORD_UNCOMP_EQ * i14) + 1);
        PointerUnion pointerUnion3 = new PointerUnion(pointerUnion);
        while (i12 < this.HFEmr8 - 1) {
            pointerUnion3.setByteIndex(this.ACCESS_last_equations8 + (this.NB_BYTES_EQUATION * i12));
            jConvMQ_uncompressL_gf2 ^= convMQ_uncompressL_gf2(new Pointer(pointer4, (this.NB_WORD_UNCOMP_EQ * i12) + 1), pointerUnion3) << i12;
            i12++;
        }
        pointerUnion3.setByteIndex(this.ACCESS_last_equations8 + (this.NB_BYTES_EQUATION * i12));
        long jConvMQ_last_uncompressL_gf2 = jConvMQ_uncompressL_gf2 ^ (convMQ_last_uncompressL_gf2(new Pointer(pointer4, (this.NB_WORD_UNCOMP_EQ * i12) + 1), pointerUnion3) << i12);
        if (this.HFENr8 != 0) {
            int i15 = this.HFEnvr;
            if (i15 == 0) {
                i11 = (i12 + 1) * this.NB_WORD_UNCOMP_EQ;
                j12 = j11 << (64 - this.LOST_BITS);
            } else {
                int i16 = this.LOST_BITS;
                int i17 = i12 + 1;
                if (i15 > i16) {
                    i11 = i17 * this.NB_WORD_UNCOMP_EQ;
                    j12 = j11 << (i15 - i16);
                } else if (i15 == i16) {
                    pointer4.set(i17 * this.NB_WORD_UNCOMP_EQ, j11);
                } else {
                    pointer4.setXor((this.NB_WORD_UNCOMP_EQ * i17) - 1, j11 << (64 - (i16 - i15)));
                    pointer4.set(i17 * this.NB_WORD_UNCOMP_EQ, j11 >>> (this.LOST_BITS - this.HFEnvr));
                }
            }
            pointer4.setXor(i11, j12);
        }
        pointer4.set(jConvMQ_last_uncompressL_gf2 << (this.HFEmr - this.HFEmr8));
        return sign_openHFE_huncomp_pk(bArr2, bArr2.length, bArr3, pointerUnion, new PointerUnion(pointer4));
    }

    int div_r_gf2nx(Pointer pointer, int i11, Pointer pointer2, int i12) {
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(pointer);
        inv_gf2n(pointer4, pointer2, this.NB_WORD_GFqn * i12);
        while (i11 >= i12) {
            i11 = pointer.searchDegree(i11, i12, this.NB_WORD_GFqn);
            if (i11 < i12) {
                break;
            }
            pointer5.changeIndex((i11 - i12) * this.NB_WORD_GFqn);
            mul_gf2n(pointer3, pointer, this.NB_WORD_GFqn * i11, pointer4);
            for_mul_rem_xor_move(pointer5, pointer3, pointer2, 0, i12);
            i11--;
        }
        return pointer.searchDegree(i11, 1, this.NB_WORD_GFqn);
    }

    void evalHFEv_gf2nx(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        Pointer pointer4 = new Pointer(this.NB_WORD_MUL);
        Pointer pointer5 = new Pointer(this.NB_WORD_MUL);
        int i11 = 1;
        Pointer pointer6 = new Pointer((this.HFEDegI + 1) * this.NB_WORD_GFqn);
        Pointer pointer7 = new Pointer();
        int index = pointer2.getIndex();
        Pointer pointer8 = new Pointer(this.NB_WORD_GFqv);
        Pointer pointer9 = new Pointer(pointer6, this.NB_WORD_GFqn);
        pointer6.copyFrom(pointer3, this.NB_WORD_GFqn);
        pointer6.setAnd(this.NB_WORD_GFqn - 1, this.MASK_GF2n);
        for (int i12 = 1; i12 <= this.HFEDegI; i12++) {
            sqr_gf2n(pointer9, 0, pointer9, -this.NB_WORD_GFqn);
            pointer9.move(this.NB_WORD_GFqn);
        }
        int i13 = this.NB_WORD_GFqn;
        int i14 = this.NB_WORD_GFqv;
        if (i13 + i14 != this.NB_WORD_GF2nv) {
            i14--;
        }
        int i15 = i14;
        pointer8.setRangeRotate(0, pointer3, i13 - 1, i15, 64 - this.HFEnr);
        int i16 = this.NB_WORD_GFqn;
        if (this.NB_WORD_GFqv + i16 != this.NB_WORD_GF2nv) {
            pointer8.set(i15, pointer3.get((i16 - 1) + i15) >>> this.HFEnr);
        }
        evalMQSv_unrolled_gf2(pointer4, pointer8, pointer2);
        pointer2.move(this.MQv_GFqn_SIZE);
        vmpv_xorrange_move(pointer5, pointer8, pointer2);
        pointer9.changeIndex(pointer6);
        mul_xorrange(pointer4, pointer9, pointer5);
        while (true) {
            int i17 = this.HFEDegI;
            vmpv_xorrange_move(pointer5, pointer8, pointer2);
            if (i11 >= i17) {
                break;
            }
            int i18 = this.NB_WORD_GFqn;
            pointer5.setRangeClear(i18, this.NB_WORD_MMUL - i18);
            pointer7.changeIndex(pointer9);
            for_mul_xorrange_move(pointer5, pointer2, pointer7, i11);
            rem_gf2n(pointer5, 0, pointer5);
            mul_xorrange(pointer4, pointer7, pointer5);
            i11++;
        }
        pointer7.changeIndex(pointer9);
        if (this.HFEDegJ != 0) {
            int i19 = this.NB_WORD_GFqn;
            pointer5.setRangeClear(i19, this.NB_WORD_MMUL - i19);
            for_mul_xorrange_move(pointer5, pointer2, pointer7, this.HFEDegJ);
            pointer5.setXorRange(pointer7, this.NB_WORD_GFqn);
            rem_gf2n(pointer5, 0, pointer5);
        } else {
            pointer5.setRangeFromXor(pointer5, pointer7, this.NB_WORD_GFqn);
        }
        pointer9.move(this.HFEDegI * this.NB_WORD_GFqn);
        mul_xorrange(pointer4, pointer9, pointer5);
        rem_gf2n(pointer, 0, pointer4);
        pointer2.changeIndex(index);
    }

    void evalMQSv_unrolled_gf2(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        Pointer pointer4 = new Pointer(this.HFEv);
        int i11 = this.HFEv;
        int i12 = i11 >>> 6;
        int i13 = i11 & 63;
        int i14 = this.HFEn;
        int i15 = 0;
        int i16 = (i14 >>> 6) + ((i14 & 63) != 0 ? 1 : 0);
        int index = pointer3.getIndex();
        Pointer pointer5 = new Pointer(i16);
        int i17 = 0;
        int range_xi = 0;
        while (i17 < i12) {
            range_xi = pointer4.setRange_xi(pointer2.get(i17), range_xi, 64);
            i17++;
        }
        if (i13 != 0) {
            pointer4.setRange_xi(pointer2.get(i17), range_xi, i13);
        }
        pointer.copyFrom(pointer3, i16);
        pointer3.move(i16);
        while (i15 < this.HFEv) {
            pointer5.copyFrom(pointer3, i16);
            pointer3.move(i16);
            int i18 = i15 + 1;
            int i19 = i18;
            while (i19 < this.HFEv - 3) {
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19));
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19 + 1));
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19 + 2));
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19 + 3));
                i19 += 4;
            }
            while (i19 < this.HFEv) {
                pointer5.setXorRangeAndMaskMove(pointer3, i16, pointer4.get(i19));
                i19++;
            }
            pointer.setXorRangeAndMask(pointer5, i16, pointer4.get(i15));
            i15 = i18;
        }
        pointer3.changeIndex(index);
    }

    void fast_sort_gf2n(Pointer pointer, int i11) {
        int i12;
        Pointer pointer2;
        int i13;
        Pointer pointer3 = pointer;
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer6 = new Pointer();
        Pointer pointer7 = new Pointer();
        int i14 = i11 - 1;
        int iHighest_One = GeMSSUtils.Highest_One(i14);
        int i15 = iHighest_One;
        while (true) {
            i12 = 0;
            if (i15 <= 1) {
                break;
            }
            int i16 = i15 << 1;
            int i17 = i11 / i16;
            int iMax = Math.max(0, (i11 - (i16 * i17)) - i15);
            pointer6.changeIndex(pointer3);
            pointer7.changeIndex(pointer3, this.NB_WORD_GFqn * i15);
            int i18 = 0;
            while (i18 < i17) {
                for_casct_move(pointer6, pointer7, pointer5, i15, 1);
                int i19 = i15;
                pointer6.move(this.NB_WORD_GFqn * i19);
                pointer7.move(this.NB_WORD_GFqn * i19);
                i18++;
                i15 = i19;
            }
            int i21 = i15;
            for_casct_move(pointer6, pointer7, pointer5, iMax, 1);
            int i22 = iHighest_One;
            while (i22 > i21) {
                while (i12 < i11 - i22) {
                    if ((i12 & i21) == 0) {
                        pointer7.changeIndex(pointer3, (i12 + i21) * this.NB_WORD_GFqn);
                        Pointer pointer8 = pointer5;
                        Pointer pointer9 = pointer3;
                        int i23 = i22;
                        Pointer pointer10 = pointer6;
                        Pointer pointer11 = pointer4;
                        i13 = i12;
                        copy_for_casct(pointer11, pointer7, pointer9, pointer10, pointer8, i23, i13);
                        pointer2 = pointer11;
                        pointer6 = pointer10;
                        i22 = i23;
                        pointer3 = pointer9;
                        pointer5 = pointer8;
                        pointer7.copyFrom(pointer2, this.NB_WORD_GFqn);
                    } else {
                        pointer2 = pointer4;
                        i13 = i12;
                    }
                    i12 = i13 + 1;
                    pointer4 = pointer2;
                }
                i22 >>>= 1;
                pointer4 = pointer4;
            }
            i15 = i21 >>> 1;
        }
        Pointer pointer12 = pointer4;
        pointer6.changeIndex(pointer3);
        pointer7.changeIndex(pointer3, this.NB_WORD_GFqn);
        for_casct_move(pointer6, pointer7, pointer5, i14, 2);
        pointer7.changeIndex(pointer3, this.NB_WORD_GFqn);
        while (iHighest_One > 1) {
            int i24 = i12;
            while (i24 < i11 - iHighest_One) {
                Pointer pointer13 = pointer6;
                Pointer pointer14 = pointer5;
                copy_for_casct(pointer12, pointer7, pointer3, pointer13, pointer14, iHighest_One, i24);
                pointer5 = pointer14;
                pointer7.copyFrom(pointer12, this.NB_WORD_GFqn);
                pointer7.move(this.NB_WORD_GFqn << 1);
                i24 += 2;
                pointer6 = pointer13;
                pointer3 = pointer;
            }
            iHighest_One >>>= 1;
            pointer3 = pointer;
            pointer6 = pointer6;
            i12 = i24;
        }
    }

    void findRootsSplit2_HT_gf2nx(Pointer pointer, Pointer pointer2) {
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
        int index = pointer2.getIndex();
        sqr_gf2n(pointer3, 0, pointer2, this.NB_WORD_GFqn);
        inv_gf2n(pointer, pointer3, 0);
        mul_gf2n(pointer3, pointer2, pointer);
        findRootsSplit_x2_x_c_HT_gf2nx(pointer4, pointer3);
        pointer2.move(this.NB_WORD_GFqn);
        mul_gf2n(pointer, pointer4, pointer2);
        int i11 = this.NB_WORD_GFqn;
        pointer.setRangeFromXor(i11, pointer, 0, pointer2, 0, i11);
        pointer2.changeIndex(index);
    }

    void findRootsSplit_x2_x_c_HT_gf2nx(Pointer pointer, Pointer pointer2) {
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        int i11 = (this.HFEn + 1) >>> 1;
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        int i12 = 1;
        for (int i13 = this.HFEn1h_rightmost; i13 != -1; i13--) {
            int i14 = i12 << 1;
            sqr_gf2n(pointer3, pointer);
            for (int i15 = 1; i15 < i14; i15++) {
                sqr_gf2n(pointer3, pointer3);
            }
            pointer.setXorRange(pointer3, this.NB_WORD_GFqn);
            i12 = i11 >>> i13;
            if ((i12 & 1) != 0) {
                sqr_gf2n(pointer3, pointer);
                sqr_gf2n(pointer, pointer3);
                pointer.setXorRange(pointer2, this.NB_WORD_GFqn);
            }
        }
    }

    void for_mul_xorrange_move(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.mul.mul_gf2x_xor(pointer, pointer2, pointer3);
            pointer2.move(this.NB_WORD_GFqn);
            pointer3.move(this.NB_WORD_GFqn);
        }
    }

    void genSecretMQS_gf2_opt(Pointer pointer, Pointer pointer2) {
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        int i11 = 1;
        Pointer pointer4 = new Pointer((this.HFEDegI + 1) * (this.HFEv + 1) * this.NB_WORD_GFqn);
        Pointer pointer5 = new Pointer(pointer2, this.MQv_GFqn_SIZE);
        for (int i12 = 0; i12 <= this.HFEDegI; i12++) {
            for (int i13 = 0; i13 <= this.HFEv; i13++) {
                int i14 = ((this.HFEDegI + 1) * i13) + i12;
                int i15 = this.NB_WORD_GFqn;
                pointer4.copyFrom(i14 * i15, pointer5, 0, i15);
                pointer5.move(this.NB_WORD_GFqn);
            }
            pointer5.move(this.NB_WORD_GFqn * i12);
        }
        Pointer pointer6 = new Pointer(this.SIZE_ROW * (this.HFEn - 1) * this.NB_WORD_GFqn);
        for (int i16 = 1; i16 < this.HFEn; i16++) {
            pointer6.set(i16 >>> 6, 1 << (i16 & 63));
            for (int i17 = 0; i17 < this.HFEDegI; i17++) {
                sqr_gf2n(pointer6, this.NB_WORD_GFqn, pointer6, 0);
                pointer6.move(this.NB_WORD_GFqn);
            }
            pointer6.move(this.NB_WORD_GFqn);
        }
        pointer6.indexReset();
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        pointer2.move(this.MQv_GFqn_SIZE);
        pointer.move(this.NB_WORD_GFqn);
        Pointer pointer7 = new Pointer(this.HFEDegI * this.HFEn * this.NB_WORD_GFqn);
        special_buffer(pointer7, pointer2, pointer6);
        Pointer pointer8 = new Pointer(pointer7);
        Pointer pointer9 = new Pointer(pointer7);
        pointer.copyFrom(pointer9, this.NB_WORD_GFqn);
        pointer9.move(this.NB_WORD_GFqn);
        pointer.setXorMatrix_NoMove(pointer9, this.NB_WORD_GFqn, this.HFEDegI - 1);
        pointer5.changeIndex(pointer4);
        pointer.setXorMatrix(pointer5, this.NB_WORD_GFqn, this.HFEDegI + 1);
        Pointer pointer10 = new Pointer(pointer6, this.NB_WORD_GFqn);
        int i18 = 1;
        while (i18 < this.HFEn) {
            dotProduct_gf2n(pointer, pointer10, pointer8, this.HFEDegI);
            pointer10.move(this.SIZE_ROW * this.NB_WORD_GFqn);
            pointer.setXorMatrix(pointer9, this.NB_WORD_GFqn, this.HFEDegI);
            i18++;
        }
        while (i18 < this.HFEnv) {
            pointer.copyFrom(pointer5, this.NB_WORD_GFqn);
            pointer5.move(this.NB_WORD_GFqn);
            pointer.setXorMatrix(pointer5, this.NB_WORD_GFqn, this.HFEDegI);
            i18++;
        }
        Pointer pointer11 = new Pointer(pointer6, this.NB_WORD_GFqn);
        Pointer pointer12 = new Pointer(this.NB_WORD_MUL);
        int i19 = 1;
        while (i19 < this.HFEn) {
            pointer8.move(this.HFEDegI * this.NB_WORD_GFqn);
            pointer10.changeIndex(pointer11);
            pointer9.changeIndex(pointer8);
            int i21 = i11;
            this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer4, new Pointer(pointer10, -this.NB_WORD_GFqn));
            int i22 = i21;
            while (i22 <= this.HFEDegI) {
                int i23 = this.NB_WORD_GFqn;
                int i24 = i19;
                Pointer pointer13 = pointer9;
                pointer3.setRangeFromXor(0, pointer13, 0, pointer4, i22 * i23, i23);
                mul_xorrange(this.Buffer_NB_WORD_MUL, pointer3, pointer10);
                pointer13.move(this.NB_WORD_GFqn);
                pointer10.move(this.NB_WORD_GFqn);
                i22++;
                pointer9 = pointer13;
                pointer12 = pointer12;
                i19 = i24;
            }
            Pointer pointer14 = pointer12;
            int i25 = i19;
            Pointer pointer15 = pointer9;
            pointer10.move(this.NB_WORD_GFqn);
            rem_gf2n(pointer, 0, this.Buffer_NB_WORD_MUL);
            pointer.move(this.NB_WORD_GFqn);
            int i26 = i25 + 1;
            int i27 = i26;
            while (i27 < this.HFEn) {
                int index = pointer10.getIndex();
                int index2 = pointer8.getIndex();
                int index3 = pointer11.getIndex();
                int index4 = pointer15.getIndex();
                mul_move(pointer14, pointer10, pointer8);
                for_mul_xorrange_move(pointer14, pointer10, pointer8, this.HFEDegI - 1);
                for_mul_xorrange_move(pointer14, pointer11, pointer15, this.HFEDegI);
                rem_gf2n(pointer, 0, pointer14);
                pointer10.changeIndex(index + (this.NB_WORD_GFqn * this.SIZE_ROW));
                pointer8.changeIndex(index2);
                pointer11.changeIndex(index3);
                pointer15.changeIndex(index4 + (this.HFEDegI * this.NB_WORD_GFqn));
                pointer.move(this.NB_WORD_GFqn);
                i27++;
                pointer3 = pointer3;
            }
            Pointer pointer16 = pointer3;
            pointer5.changeIndex(pointer4);
            pointer11.move(-this.NB_WORD_GFqn);
            while (i27 < this.HFEnv) {
                pointer5.move((this.HFEDegI + 1) * this.NB_WORD_GFqn);
                dotProduct_gf2n(pointer, pointer11, pointer5, this.HFEDegI + 1);
                pointer.move(this.NB_WORD_GFqn);
                i27++;
            }
            int i28 = this.NB_WORD_GFqn;
            pointer11.move(i28 + (this.SIZE_ROW * i28));
            pointer9 = pointer15;
            i11 = i21;
            pointer3 = pointer16;
            i19 = i26;
            pointer12 = pointer14;
        }
        pointer2.move(this.NB_WORD_GFqn - this.MQv_GFqn_SIZE);
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn * (this.NB_MONOMIAL_VINEGAR - 1));
        pointer.indexReset();
        pointer2.indexReset();
    }

    int interpolateHFE_FS_ref(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        Pointer pointer4 = new Pointer(this.NB_WORD_GF2nv);
        Pointer pointer5 = new Pointer();
        Pointer pointer6 = new Pointer();
        Pointer pointer7 = new Pointer(this.HFEnv * this.NB_WORD_GFqn);
        pointer.copyFrom(pointer2, this.NB_WORD_GFqn);
        Pointer pointer8 = new Pointer(pointer3);
        Pointer pointer9 = new Pointer(pointer7);
        for (int i11 = 0; i11 < this.HFEnv; i11++) {
            evalHFEv_gf2nx(pointer9, pointer2, pointer8);
            pointer9.move(this.NB_WORD_GFqn);
            pointer8.move(this.NB_WORD_GF2nv);
        }
        pointer8.changeIndex(pointer3);
        pointer9.changeIndex(pointer7);
        int i12 = 0;
        while (i12 < this.HFEnv) {
            pointer.move(this.NB_WORD_GFqn);
            pointer9.setXorRange(pointer2, this.NB_WORD_GFqn);
            pointer.copyFrom(pointer9, this.NB_WORD_GFqn);
            pointer5.changeIndex(pointer9);
            pointer6.changeIndex(pointer8);
            i12++;
            for (int i13 = i12; i13 < this.HFEnv; i13++) {
                pointer.move(this.NB_WORD_GFqn);
                pointer5.move(this.NB_WORD_GFqn);
                pointer6.move(this.NB_WORD_GF2nv);
                pointer4.setRangeFromXor(pointer8, pointer6, this.NB_WORD_GF2nv);
                evalHFEv_gf2nx(pointer, pointer2, pointer4);
                pointer.setXorRangeXor(0, pointer9, 0, pointer5, 0, this.NB_WORD_GFqn);
            }
            pointer9.move(this.NB_WORD_GFqn);
            pointer8.move(this.NB_WORD_GF2nv);
            pointer = pointer;
        }
        pointer.indexReset();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[LOOP:2: B:24:0x00a6->B:25:0x00a8, LOOP_END] */
    void invMatrixLU_gf2(Pointer pointer, Pointer pointer2, Pointer pointer3, FunctionParams functionParams) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        GeMSSEngine geMSSEngine = this;
        Pointer pointer4 = new Pointer(pointer2);
        Pointer pointer5 = new Pointer(pointer2);
        Pointer pointer6 = new Pointer(pointer3);
        int i17 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
        if (i17 == 1) {
            pointer.setRangeClear(0, geMSSEngine.MATRIXn_SIZE);
            i11 = geMSSEngine.HFEnq;
            i12 = geMSSEngine.HFEn - 1;
            i13 = geMSSEngine.NB_WORD_GFqn;
            i14 = geMSSEngine.HFEnr;
            i15 = geMSSEngine.LTRIANGULAR_N_SIZE;
        } else {
            if (i17 != 2) {
                throw new IllegalArgumentException("Invalid Input");
            }
            i11 = geMSSEngine.HFEnvq;
            i12 = geMSSEngine.HFEnv - 1;
            i13 = geMSSEngine.NB_WORD_GF2nv;
            i14 = geMSSEngine.HFEnvr;
            i15 = geMSSEngine.LTRIANGULAR_NV_SIZE;
        }
        int i18 = i11;
        int i19 = i12;
        int i21 = i13;
        int i22 = i14;
        Pointer pointer7 = new Pointer(pointer);
        Pointer pointer8 = new Pointer(pointer);
        int iLoop_xor_loop_move_xorandmask_move = 0;
        int i23 = 0;
        while (i23 < i18) {
            iLoop_xor_loop_move_xorandmask_move = geMSSEngine.loop_xor_loop_move_xorandmask_move(pointer7, pointer8, pointer4, pointer5, iLoop_xor_loop_move_xorandmask_move, i23, 64, i19, i21);
            pointer5.moveIncremental();
            i23++;
            geMSSEngine = this;
            i15 = i15;
        }
        int i24 = i15;
        if (i22 <= 1) {
            if (i22 == 1) {
                pointer7.set(i23, 1L);
            }
            pointer6.move(i24);
            while (i19 > 0) {
                pointer6.move((-1) - (i19 >>> 6));
                pointer7.move(-i21);
                pointer8.changeIndex(pointer);
                for (i16 = 0; i16 < i19; i16++) {
                    pointer8.setXorRangeAndMask(pointer7, i21, -((pointer6.get(i16 >>> 6) >>> (i16 & 63)) & 1));
                    pointer8.move(i21);
                }
                i19--;
            }
        }
        int i25 = i22 - 1;
        loop_xor_loop_move_xorandmask_move(pointer7, pointer8, pointer4, pointer5, iLoop_xor_loop_move_xorandmask_move, i23, i25, i19, i21);
        pointer7.setXor(i23, 1 << i25);
        pointer7.move(i21);
        pointer6.move(i24);
        while (i19 > 0) {
            pointer6.move((-1) - (i19 >>> 6));
            pointer7.move(-i21);
            pointer8.changeIndex(pointer);
            while (i16 < i19) {
                pointer8.setXorRangeAndMask(pointer7, i21, -((pointer6.get(i16 >>> 6) >>> (i16 & 63)) & 1));
                pointer8.move(i21);
            }
            i19--;
        }
    }

    void mul_gf2n(Pointer pointer, Pointer pointer2, int i11, Pointer pointer3) {
        int index = pointer2.getIndex();
        pointer2.move(i11);
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        pointer2.changeIndex(index);
        rem_gf2n(pointer, 0, this.Buffer_NB_WORD_MUL);
    }

    void mul_move(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x(pointer, pointer2, pointer3);
        pointer2.move(this.NB_WORD_GFqn);
        pointer3.move(this.NB_WORD_GFqn);
    }

    public void mul_rem_xorrange(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        this.rem.rem_gf2n_xor(pointer.array, pointer.f99075cp, this.Buffer_NB_WORD_MUL.array);
    }

    public void mul_xorrange(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x_xor(pointer, pointer2, pointer3);
    }

    public void signHFE_FeistelPatarin(SecureRandom secureRandom, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3) {
        int i13;
        long j11;
        PointerUnion pointerUnion;
        Pointer pointer;
        Pointer pointer2;
        SecureRandom secureRandom2 = secureRandom;
        this.random = secureRandom2;
        Pointer pointer3 = new Pointer(this.NB_WORD_GFqn);
        Pointer pointer4 = new Pointer(this.SIZE_DIGEST_UINT);
        Pointer pointer5 = new Pointer(new Pointer(this.SIZE_DIGEST_UINT));
        int i14 = this.HFEv;
        int i15 = i14 & 7;
        int i16 = (i14 >>> 3) + (i15 != 0 ? 1 : 0);
        long jMaskUINT = GeMSSUtils.maskUINT(this.HFEvr);
        SecretKeyHFE secretKeyHFE = new SecretKeyHFE(this);
        Pointer pointer6 = new Pointer(this.NB_WORD_GFqv);
        Pointer[] pointerArr = new Pointer[this.HFEDegI + 1];
        precSignHFE(secretKeyHFE, pointerArr, bArr3);
        Pointer pointer7 = new Pointer(secretKeyHFE.F_struct.poly);
        Pointer pointer8 = new Pointer(pointer4);
        int i17 = this.Sha3BitStrength >>> 3;
        byte[] bArr4 = new byte[i17];
        Pointer pointer9 = pointer5;
        Pointer pointer10 = pointer8;
        Pointer pointer11 = pointer7;
        long j12 = jMaskUINT;
        getSHA3Hash(pointer10, 0, i17, bArr2, i11, i12, bArr4);
        Pointer pointer12 = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
        Pointer pointer13 = new Pointer(this.NB_WORD_GF2nv);
        PointerUnion pointerUnion2 = new PointerUnion(pointer13);
        long j13 = 0;
        int i18 = 1;
        while (true) {
            i13 = this.NB_ITE;
            if (i18 > i13) {
                break;
            }
            pointer13.setRangeFromXor(pointer12, pointer10, this.NB_WORD_GF2m);
            if (this.HFEmr8 != 0) {
                pointer13.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m);
                j13 = pointerUnion2.getByte(this.HFEmq8);
            }
            long j14 = j13;
            while (true) {
                if (this.HFEmr8 != 0) {
                    pointerUnion2.fillRandomBytes(this.HFEmq8, secureRandom2, (this.NB_BYTES_GFqn - this.NB_BYTES_GFqm) + 1);
                    pointerUnion2.setAndThenXorByte(this.HFEmq8, -(1 << this.HFEmr8), j14);
                } else {
                    int i19 = this.NB_BYTES_GFqm;
                    pointerUnion2.fillRandomBytes(i19, secureRandom2, this.NB_BYTES_GFqn - i19);
                }
                if ((this.HFEn & 7) != 0) {
                    pointer13.setAnd(this.NB_WORD_GFqn - 1, this.MASK_GF2n);
                }
                vecMatProduct(pointer3, pointer13, secretKeyHFE.T, FunctionParams.N);
                pointer6.fillRandom(0, secureRandom2, i16);
                if (i15 != 0) {
                    j11 = j12;
                    pointer6.setAnd(this.NB_WORD_GFqv - 1, j11);
                } else {
                    j11 = j12;
                }
                Pointer pointer14 = pointer11;
                evalMQSv_unrolled_gf2(pointer14, pointer6, secretKeyHFE.F_HFEv);
                pointerUnion = pointerUnion2;
                int i21 = 0;
                while (i21 <= this.HFEDegI) {
                    int i22 = i21;
                    Pointer pointer15 = pointer14;
                    vecMatProduct(this.Buffer_NB_WORD_GFqn, pointer6, new Pointer(pointerArr[i22], this.NB_WORD_GFqn), FunctionParams.V);
                    int i23 = this.NB_WORD_GFqn;
                    i21 = i22 + 1;
                    pointer15.setRangeFromXor(i23 * (((i22 * i21) >>> 1) + 1), pointerArr[i22], 0, this.Buffer_NB_WORD_GFqn, 0, i23);
                    pointer14 = pointer15;
                }
                pointer11 = pointer14;
                if (chooseRootHFE_gf2nx(pointer13, secretKeyHFE.F_struct, pointer3) != 0) {
                    break;
                }
                secureRandom2 = secureRandom;
                j14 = j14;
                pointerUnion2 = pointerUnion;
                j12 = j11;
            }
            pointer13.setXor(this.NB_WORD_GFqn - 1, pointer6.get() << this.HFEnr);
            Pointer pointer16 = pointer13;
            pointer16.setRangeRotate(this.NB_WORD_GFqn, pointer6, 0, this.NB_WORD_GFqv - 1, 64 - this.HFEnr);
            int i24 = this.NB_WORD_GFqn;
            int i25 = this.NB_WORD_GFqv;
            if (i24 + i25 == this.NB_WORD_GF2nv) {
                pointer16.set((i24 + i25) - 1, pointer6.get(i25 - 1) >>> (64 - this.HFEnr));
            }
            vecMatProduct(pointer12, pointer16, secretKeyHFE.S, FunctionParams.NV);
            int i26 = this.NB_ITE;
            if (i18 != i26) {
                int i27 = this.NB_WORD_GF2nv;
                int i28 = this.NB_WORD_GF2nvm;
                int i29 = (((i26 - 1) - i18) * i28) + i27;
                pointer12.copyFrom(i29, pointer12, i27 - i28, i28);
                if (this.HFEmr != 0) {
                    pointer12.setAnd(i29, ~this.MASK_GF2m);
                }
                byte[] bytes = pointer10.toBytes(this.SIZE_DIGEST);
                pointer = pointer10;
                pointer2 = pointer9;
                getSHA3Hash(pointer2, 0, this.SIZE_DIGEST, bytes, 0, bytes.length, bytes);
                pointer2.swap(pointer);
            } else {
                pointer = pointer10;
                pointer2 = pointer9;
            }
            i18++;
            j13 = j14;
            pointer9 = pointer2;
            pointer10 = pointer;
            pointer12 = pointer12;
            pointer13 = pointer16;
            pointerUnion2 = pointerUnion;
            secureRandom2 = secureRandom;
            j12 = j11;
            i15 = i15;
        }
        Pointer pointer17 = pointer12;
        if (i13 == 1) {
            System.arraycopy(pointer17.toBytes(pointer17.getLength() << 3), 0, bArr, 0, this.NB_BYTES_GFqnv);
        } else {
            compress_signHFE(bArr, pointer17);
        }
    }

    public int sign_openHFE_huncomp_pk(byte[] bArr, int i11, byte[] bArr2, PointerUnion pointerUnion, PointerUnion pointerUnion2) {
        Pointer pointer = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
        Pointer pointer2 = new Pointer(this.NB_WORD_GF2nv);
        Pointer pointer3 = new Pointer(this.NB_WORD_GF2nv);
        Pointer pointer4 = new Pointer(pointer2);
        Pointer pointer5 = new Pointer(pointer3);
        byte[] bArr3 = new byte[64];
        Pointer pointer6 = new Pointer(this.NB_ITE * this.SIZE_DIGEST_UINT);
        long j11 = pointerUnion2.get();
        pointerUnion2.move(1);
        uncompress_signHFE(pointer, bArr2);
        getSHA3Hash(pointer6, 0, 64, bArr, 0, i11, bArr3);
        int i12 = 1;
        while (i12 < this.NB_ITE) {
            int i13 = i12;
            getSHA3Hash(pointer6, this.SIZE_DIGEST_UINT * i12, 64, bArr3, 0, this.SIZE_DIGEST, bArr3);
            pointer6.setAnd(((this.SIZE_DIGEST_UINT * (i13 - 1)) + this.NB_WORD_GF2m) - 1, this.MASK_GF2m);
            i12 = i13 + 1;
        }
        pointer6.setAnd(((this.SIZE_DIGEST_UINT * (i12 - 1)) + this.NB_WORD_GF2m) - 1, this.MASK_GF2m);
        evalMQShybrid8_uncomp_nocst_gf2_m(pointer4, pointer, pointerUnion, pointerUnion2);
        pointer4.setXor(this.HFEmq, j11);
        for (int i14 = this.NB_ITE - 1; i14 > 0; i14--) {
            pointer4.setXorRange(pointer6, this.SIZE_DIGEST_UINT * i14, this.NB_WORD_GF2m);
            int i15 = this.NB_WORD_GF2nv + (((this.NB_ITE - 1) - i14) * this.NB_WORD_GF2nvm);
            pointer4.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m);
            pointer4.setXor(this.NB_WORD_GF2m - 1, pointer.get(i15));
            int i16 = this.NB_WORD_GF2nvm;
            if (i16 != 1) {
                pointer4.copyFrom(this.NB_WORD_GF2m, pointer, i15 + 1, i16 - 1);
            }
            evalMQShybrid8_uncomp_nocst_gf2_m(pointer5, pointer4, pointerUnion, pointerUnion2);
            pointer5.setXor(this.HFEmq, j11);
            pointer5.swap(pointer4);
        }
        return pointer4.isEqual_nocst_gf2(pointer6, this.NB_WORD_GF2m);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[LOOP:1: B:16:0x005f->B:18:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6 A[LOOP:2: B:38:0x00b4->B:39:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    void vecMatProduct(Pointer pointer, Pointer pointer2, Pointer pointer3, FunctionParams functionParams) {
        int i11;
        int i12;
        int i13;
        int i14;
        long j11;
        int i15;
        int i16;
        long j12;
        Pointer pointer4 = new Pointer(pointer3);
        int i17 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
        int i18 = 0;
        if (i17 == 1) {
            pointer.setRangeClear(0, this.NB_WORD_GFqn);
            i11 = this.NB_WORD_GFqn;
            i12 = this.HFEnq;
        } else {
            if (i17 != 2) {
                if (i17 == 3) {
                    pointer.setRangeClear(0, this.NB_WORD_GFqn);
                    i11 = this.NB_WORD_GFqn;
                    i12 = this.HFEvq;
                } else {
                    if (i17 != 4) {
                        throw new IllegalArgumentException("Invalid input for vecMatProduct");
                    }
                    pointer.setRangeClear(0, this.NB_WORD_GF2m);
                    i12 = this.HFEnq;
                    i11 = this.NB_WORD_GF2m;
                    i13 = this.NB_WORD_GFqn;
                }
                while (i18 < i12) {
                    j12 = pointer2.get(i18);
                    while (i18 < 64) {
                        pointer.setXorRangeAndMask(pointer4, i11, -(j12 & 1));
                        pointer4.move(i13);
                        j12 >>>= 1;
                        i18++;
                    }
                    i18++;
                    i18 = 0;
                }
                i14 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
                if (i14 == 1) {
                    j11 = pointer2.get(this.HFEnq);
                    i15 = this.HFEnr;
                } else if (i14 != 2) {
                    if (this.HFEnvr == 0) {
                        return;
                    }
                    j11 = pointer2.get(this.HFEnvq);
                    i15 = this.HFEnvr;
                } else if (i14 != 3) {
                    if (i14 != 4) {
                        throw new IllegalArgumentException("Invalid input for vecMatProduct");
                    }
                    j11 = pointer2.get(this.HFEnq);
                    i15 = this.HFEnr;
                } else {
                    if (this.HFEvr == 0) {
                        return;
                    }
                    j11 = pointer2.get(this.HFEvq);
                    i15 = this.HFEvr;
                }
                for (i16 = 0; i16 < i15; i16++) {
                    pointer.setXorRangeAndMask(pointer4, i11, -(j11 & 1));
                    pointer4.move(i13);
                    j11 >>>= 1;
                }
                if (functionParams == FunctionParams.M || this.HFEmr == 0) {
                }
                pointer.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m);
                return;
            }
            pointer.setRangeClear(0, this.NB_WORD_GF2nv);
            i12 = this.HFEnvq;
            i11 = this.NB_WORD_GF2nv;
        }
        i13 = i11;
        while (i18 < i12) {
            j12 = pointer2.get(i18);
            while (i18 < 64) {
                pointer.setXorRangeAndMask(pointer4, i11, -(j12 & 1));
                pointer4.move(i13);
                j12 >>>= 1;
                i18++;
            }
            i18++;
            i18 = 0;
        }
        i14 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$gemss$GeMSSEngine$FunctionParams[functionParams.ordinal()];
        if (i14 == 1) {
            j11 = pointer2.get(this.HFEnq);
            i15 = this.HFEnr;
        } else if (i14 != 2) {
            if (this.HFEnvr == 0) {
                return;
            }
            j11 = pointer2.get(this.HFEnvq);
            i15 = this.HFEnvr;
        } else if (i14 != 3) {
            if (i14 != 4) {
                throw new IllegalArgumentException("Invalid input for vecMatProduct");
            }
            j11 = pointer2.get(this.HFEnq);
            i15 = this.HFEnr;
        } else {
            if (this.HFEvr == 0) {
                return;
            }
            j11 = pointer2.get(this.HFEvq);
            i15 = this.HFEvr;
        }
        while (i16 < i15) {
            pointer.setXorRangeAndMask(pointer4, i11, -(j11 & 1));
            pointer4.move(i13);
            j11 >>>= 1;
        }
        if (functionParams == FunctionParams.M) {
        }
    }

    private void sqr_gf2n(Pointer pointer, Pointer pointer2) {
        this.mul.sqr_gf2x(this.Buffer_NB_WORD_MUL.array, pointer2.array, pointer2.f99075cp);
        this.rem.rem_gf2n(pointer.array, pointer.f99075cp, this.Buffer_NB_WORD_MUL.array);
    }

    void mul_gf2n(Pointer pointer, Pointer pointer2, Pointer pointer3) {
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        rem_gf2n(pointer, 0, this.Buffer_NB_WORD_MUL);
    }

    public void mul_rem_xorrange(Pointer pointer, Pointer pointer2, Pointer pointer3, int i11) {
        int index = pointer3.getIndex();
        pointer3.move(i11);
        this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer2, pointer3);
        this.rem.rem_gf2n_xor(pointer.array, pointer.f99075cp, this.Buffer_NB_WORD_MUL.array);
        pointer3.changeIndex(index);
    }
}
