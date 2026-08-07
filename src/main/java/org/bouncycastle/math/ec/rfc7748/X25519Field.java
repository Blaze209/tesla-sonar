package org.bouncycastle.math.ec.rfc7748;

import org.bouncycastle.math.raw.Mod;

/* JADX INFO: loaded from: classes10.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};
    public static final int SIZE = 10;

    protected X25519Field() {
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr3[i11] = iArr[i11] + iArr2[i11];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = iArr[i11];
            int i13 = iArr2[i11];
            iArr3[i11] = i12 + i13;
            iArr4[i11] = i12 - i13;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            i11 |= iArr[i12] ^ iArr2[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        int i22 = i13 + (i12 >> 26);
        int i23 = i12 & M26;
        int i24 = i15 + (i14 >> 26);
        int i25 = i14 & M26;
        int i26 = i18 + (i17 >> 26);
        int i27 = i17 & M26;
        int i28 = i21 + (i19 >> 26);
        int i29 = i19 & M26;
        int i31 = i25 + (i22 >> 25);
        int i32 = i22 & M25;
        int i33 = i16 + (i24 >> 25);
        int i34 = i24 & M25;
        int i35 = i29 + (i26 >> 25);
        int i36 = i26 & M25;
        int i37 = i11 + ((i28 >> 25) * 38);
        int i38 = i28 & M25;
        int i39 = i23 + (i37 >> 26);
        int i41 = i37 & M26;
        int i42 = i27 + (i33 >> 26);
        int i43 = i33 & M26;
        int i44 = i32 + (i39 >> 26);
        int i45 = i39 & M26;
        int i46 = i34 + (i31 >> 26);
        int i47 = i31 & M26;
        int i48 = i36 + (i42 >> 26);
        int i49 = i42 & M26;
        int i51 = i38 + (i35 >> 26);
        int i52 = i35 & M26;
        iArr[0] = i41;
        iArr[1] = i45;
        iArr[2] = i44;
        iArr[3] = i47;
        iArr[4] = i46;
        iArr[5] = i43;
        iArr[6] = i49;
        iArr[7] = i48;
        iArr[8] = i52;
        iArr[9] = i51;
    }

    public static void cmov(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < 10; i14++) {
            int i15 = i13 + i14;
            int i16 = iArr2[i15];
            iArr2[i15] = i16 ^ ((iArr[i12 + i14] ^ i16) & i11);
        }
    }

    public static void cnegate(int i11, int[] iArr) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 10; i13++) {
            iArr[i13] = (iArr[i13] ^ i12) - i12;
        }
    }

    public static void copy(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < 10; i13++) {
            iArr2[i12 + i13] = iArr[i11 + i13];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i11) {
        return new int[i11 * 10];
    }

    public static void cswap(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 10; i13++) {
            int i14 = iArr[i13];
            int i15 = iArr2[i13];
            int i16 = (i14 ^ i15) & i12;
            iArr[i13] = i14 ^ i16;
            iArr2[i13] = i15 ^ i16;
        }
    }

    public static void decode(byte[] bArr, int i11, int[] iArr) {
        decode128(bArr, i11, iArr, 0);
        decode128(bArr, i11 + 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    private static void decode128(byte[] bArr, int i11, int[] iArr, int i12) {
        int iDecode32 = decode32(bArr, i11);
        int iDecode33 = decode32(bArr, i11 + 4);
        int iDecode34 = decode32(bArr, i11 + 8);
        int iDecode35 = decode32(bArr, i11 + 12);
        iArr[i12] = iDecode32 & M26;
        iArr[i12 + 1] = ((iDecode32 >>> 26) | (iDecode33 << 6)) & M26;
        iArr[i12 + 2] = ((iDecode33 >>> 20) | (iDecode34 << 12)) & M25;
        iArr[i12 + 3] = M26 & ((iDecode35 << 19) | (iDecode34 >>> 13));
        iArr[i12 + 4] = iDecode35 >>> 7;
    }

    private static int decode32(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public static void encode(int[] iArr, int i11, byte[] bArr, int i12) {
        encode128(iArr, i11, bArr, i12);
        encode128(iArr, i11 + 5, bArr, i12 + 16);
    }

    private static void encode128(int[] iArr, int i11, byte[] bArr, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        encode32((i14 << 26) | i13, bArr, i12);
        encode32((i14 >>> 6) | (i15 << 20), bArr, i12 + 4);
        encode32((i15 >>> 12) | (i16 << 13), bArr, i12 + 8);
        encode32((i17 << 7) | (i16 >>> 19), bArr, i12 + 12);
    }

    private static void encode32(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i11 = iArr[0] ^ 1;
        for (int i12 = 1; i12 < 10; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i11, int[] iArr2) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = iArr[7];
        int i21 = iArr[8];
        int i22 = iArr[9];
        long j11 = i11;
        long j12 = ((long) i14) * j11;
        int i23 = ((int) j12) & M25;
        long j13 = j12 >> 25;
        long j14 = ((long) i16) * j11;
        int i24 = ((int) j14) & M25;
        long j15 = ((long) i19) * j11;
        int i25 = ((int) j15) & M25;
        long j16 = ((long) i22) * j11;
        int i26 = ((int) j16) & M25;
        long j17 = ((j16 >> 25) * 38) + (((long) i12) * j11);
        iArr2[0] = ((int) j17) & M26;
        long j18 = (j14 >> 25) + (((long) i17) * j11);
        iArr2[5] = ((int) j18) & M26;
        long j19 = (j17 >> 26) + (((long) i13) * j11);
        iArr2[1] = ((int) j19) & M26;
        long j21 = j13 + (((long) i15) * j11);
        iArr2[3] = ((int) j21) & M26;
        long j22 = (j18 >> 26) + (((long) i18) * j11);
        iArr2[6] = ((int) j22) & M26;
        long j23 = (j15 >> 25) + (((long) i21) * j11);
        iArr2[8] = ((int) j23) & M26;
        iArr2[2] = i23 + ((int) (j19 >> 26));
        iArr2[4] = i24 + ((int) (j21 >> 26));
        iArr2[7] = i25 + ((int) (j22 >> 26));
        iArr2[9] = i26 + ((int) (j23 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr2[i11] = -iArr[i11];
        }
    }

    public static void normalize(int[] iArr) {
        int i11 = (iArr[9] >>> 23) & 1;
        reduce(iArr, i11);
        reduce(iArr, -i11);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            iArr[i11] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] iArrCreate = create();
        sqr(iArr2, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        sqr(iArrCreate, 2, iArrCreate);
        mul(iArr2, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, 5, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 5, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 10, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 25, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 25, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 50, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 125, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 2, iArrCreate);
        mul(iArrCreate, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i11) {
        int i12 = iArr[9];
        int i13 = M24 & i12;
        long j11 = ((long) (((i12 >> 24) + i11) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j11) & M26;
        long j12 = (j11 >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j12) & M26;
        long j13 = (j12 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j13) & M25;
        long j14 = (j13 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j14) & M26;
        long j15 = (j14 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j15) & M25;
        long j16 = (j15 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j16) & M26;
        long j17 = (j16 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j17) & M26;
        long j18 = (j17 >> 26) + ((long) iArr[7]);
        iArr[7] = M25 & ((int) j18);
        long j19 = (j18 >> 25) + ((long) iArr[8]);
        iArr[8] = M26 & ((int) j19);
        iArr[9] = i13 + ((int) (j19 >> 26));
    }

    public static void sqr(int[] iArr, int i11, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        mul(iArr, iArr2, iArrCreate);
        sqr(iArr2, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate);
        sqr(iArrCreate2, iArrCreate2);
        mul(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = create();
        int[] iArrCreate4 = create();
        powPm5d8(iArrCreate2, iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArrCreate, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, iArrCreate5);
        mul(iArrCreate5, iArr2, iArrCreate5);
        sub(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (isZeroVar(iArrCreate3)) {
            copy(iArrCreate4, 0, iArr3, 0);
            return true;
        }
        add(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (!isZeroVar(iArrCreate3)) {
            return false;
        }
        mul(iArrCreate4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr3[i11] = iArr[i11] - iArr2[i11];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr[i11] = 0;
        }
    }

    public static void addOne(int[] iArr, int i11) {
        iArr[i11] = iArr[i11] + 1;
    }

    public static void decode(byte[] bArr, int i11, int[] iArr, int i12) {
        decode128(bArr, i11, iArr, i12);
        decode128(bArr, i11 + 16, iArr, i12 + 5);
        int i13 = i12 + 9;
        iArr[i13] = iArr[i13] & M24;
    }

    private static void decode128(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        iArr2[i12] = i13 & M26;
        iArr2[i12 + 1] = ((i13 >>> 26) | (i14 << 6)) & M26;
        iArr2[i12 + 2] = ((i14 >>> 20) | (i15 << 12)) & M25;
        iArr2[i12 + 3] = M26 & ((i16 << 19) | (i15 >>> 13));
        iArr2[i12 + 4] = i16 >>> 7;
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode128(iArr, 0, bArr, 0);
        encode128(iArr, 5, bArr, 16);
    }

    private static void encode128(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        iArr2[i12] = (i14 << 26) | i13;
        iArr2[i12 + 1] = (i14 >>> 6) | (i15 << 20);
        iArr2[i12 + 2] = (i15 >>> 12) | (i16 << 13);
        iArr2[i12 + 3] = (i17 << 7) | (i16 >>> 19);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = iArr[1];
        int i14 = iArr2[1];
        int i15 = iArr[2];
        int i16 = iArr2[2];
        int i17 = iArr[3];
        int i18 = iArr2[3];
        int i19 = iArr[4];
        int i21 = iArr2[4];
        int i22 = iArr[5];
        int i23 = iArr2[5];
        int i24 = iArr[6];
        int i25 = iArr2[6];
        int i26 = iArr[7];
        int i27 = iArr2[7];
        int i28 = iArr[8];
        int i29 = iArr2[8];
        int i31 = iArr[9];
        int i32 = iArr2[9];
        long j11 = i11;
        long j12 = i12;
        long j13 = j11 * j12;
        long j14 = i14;
        long j15 = j11 * j14;
        long j16 = i13;
        long j17 = j15 + (j16 * j12);
        long j18 = i16;
        long j19 = (j11 * j18) + (j16 * j14);
        long j21 = i15;
        long j22 = j19 + (j21 * j12);
        long j23 = ((j16 * j18) + (j21 * j14)) << 1;
        long j24 = i18;
        long j25 = j11 * j24;
        long j26 = i17;
        long j27 = j23 + j25 + (j26 * j12);
        long j28 = (j21 * j18) << 1;
        long j29 = i21;
        long j31 = i19;
        long j32 = j28 + (j11 * j29) + (j16 * j24) + (j26 * j14) + (j12 * j31);
        long j33 = ((((j16 * j29) + (j21 * j24)) + (j26 * j18)) + (j31 * j14)) << 1;
        long j34 = (((j21 * j29) + (j31 * j18)) << 1) + (j26 * j24);
        long j35 = (j26 * j29) + (j31 * j24);
        long j36 = (j31 * j29) << 1;
        long j37 = i22;
        long j38 = i23;
        long j39 = j37 * j38;
        long j41 = i25;
        long j42 = j37 * j41;
        long j43 = i24;
        long j44 = j42 + (j43 * j38);
        long j45 = i27;
        long j46 = (j37 * j45) + (j43 * j41);
        long j47 = i26;
        long j48 = i29;
        long j49 = j37 * j48;
        long j51 = i28;
        long j52 = (((j43 * j45) + (j47 * j41)) << 1) + j49 + (j51 * j38);
        long j53 = i32;
        long j54 = (j37 * j53) + (j43 * j48) + (j51 * j41);
        long j55 = i31;
        long j56 = ((j47 * j45) << 1) + j54 + (j38 * j55);
        long j57 = j13 - (((((j43 * j53) + (j47 * j48)) + (j51 * j45)) + (j55 * j41)) * 76);
        long j58 = j17 - (((((j47 * j53) + (j55 * j45)) << 1) + (j51 * j48)) * 38);
        long j59 = j22 - (((j51 * j53) + (j55 * j48)) * 38);
        long j61 = j27 - ((j55 * j53) * 76);
        long j62 = j33 - j39;
        long j63 = j34 - j44;
        long j64 = j35 - (j46 + (j47 * j38));
        long j65 = j36 - j52;
        int i33 = i12 + i23;
        int i34 = i13 + i24;
        long j66 = i11 + i22;
        long j67 = i33;
        long j68 = j66 * j67;
        long j69 = i14 + i25;
        long j71 = j66 * j69;
        long j72 = i34;
        long j73 = j71 + (j72 * j67);
        long j74 = i16 + i27;
        long j75 = i15 + i26;
        long j76 = (j66 * j74) + (j72 * j69) + (j75 * j67);
        long j77 = ((j72 * j74) + (j75 * j69)) << 1;
        long j78 = i18 + i29;
        long j79 = i17 + i28;
        long j81 = j77 + (j66 * j78) + (j79 * j67);
        long j82 = i21 + i32;
        long j83 = i19 + i31;
        long j84 = ((j75 * j74) << 1) + (j66 * j82) + (j72 * j78) + (j79 * j69) + (j83 * j67);
        long j85 = ((((j72 * j82) + (j75 * j78)) + (j79 * j74)) + (j83 * j69)) << 1;
        long j86 = (((j75 * j82) + (j74 * j83)) << 1) + (j79 * j78);
        long j87 = j65 + (j81 - j61);
        int i35 = ((int) j87) & M26;
        long j88 = (j87 >> 26) + ((j84 - j32) - j56);
        int i36 = ((int) j88) & M25;
        long j89 = j57 + ((((j88 >> 25) + j85) - j62) * 38);
        iArr3[0] = ((int) j89) & M26;
        long j91 = (j89 >> 26) + j58 + ((j86 - j63) * 38);
        iArr3[1] = ((int) j91) & M26;
        long j92 = (j91 >> 26) + j59 + ((((j79 * j82) + (j83 * j78)) - j64) * 38);
        iArr3[2] = ((int) j92) & M25;
        long j93 = (j92 >> 25) + j61 + ((((j83 * j82) << 1) - j65) * 38);
        iArr3[3] = ((int) j93) & M26;
        long j94 = (j93 >> 26) + j32 + (j56 * 38);
        iArr3[4] = ((int) j94) & M25;
        long j95 = (j94 >> 25) + j62 + (j68 - j57);
        iArr3[5] = ((int) j95) & M26;
        long j96 = (j95 >> 26) + j63 + (j73 - j58);
        iArr3[6] = ((int) j96) & M26;
        long j97 = (j96 >> 26) + j64 + (j76 - j59);
        iArr3[7] = ((int) j97) & M25;
        long j98 = (j97 >> 25) + ((long) i35);
        iArr3[8] = ((int) j98) & M26;
        iArr3[9] = i36 + ((int) (j98 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        long j11 = i11;
        long j12 = j11 * j11;
        long j13 = i12 * 2;
        long j14 = j11 * j13;
        long j15 = i13 * 2;
        long j16 = j11 * j15;
        long j17 = i12;
        long j18 = j16 + (j17 * j17);
        long j19 = i14 * 2;
        long j21 = (j13 * j15) + (j11 * j19);
        long j22 = i15 * 2;
        long j23 = (((long) i13) * j15) + (j11 * j22) + (j17 * j19);
        long j24 = (j13 * j22) + (j15 * j19);
        long j25 = j15 * j22;
        long j26 = i14;
        long j27 = j25 + (j26 * j26);
        long j28 = j26 * j22;
        long j29 = i16;
        long j31 = j29 * j29;
        long j32 = i17 * 2;
        long j33 = j29 * j32;
        long j34 = i18 * 2;
        long j35 = j29 * j34;
        long j36 = i17;
        long j37 = j35 + (j36 * j36);
        long j38 = j32 * j34;
        long j39 = i19 * 2;
        long j41 = i21 * 2;
        long j42 = (((long) i18) * j34) + (j29 * j41) + (j36 * j39);
        long j43 = (j32 * j41) + (j34 * j39);
        long j44 = j34 * j41;
        long j45 = i19;
        long j46 = j12 - (j43 * 38);
        long j47 = j14 - ((j44 + (j45 * j45)) * 38);
        long j48 = j18 - ((j45 * j41) * 38);
        long j49 = j21 - ((((long) i21) * j41) * 38);
        long j51 = j24 - j31;
        long j52 = j27 - j33;
        long j53 = j28 - j37;
        long j54 = (((long) i15) * j22) - (j38 + (j29 * j39));
        int i22 = i12 + i17;
        int i23 = i13 + i18;
        int i24 = i14 + i19;
        int i25 = i15 + i21;
        long j55 = i11 + i16;
        long j56 = j55 * j55;
        long j57 = i22 * 2;
        long j58 = j55 * j57;
        long j59 = i23 * 2;
        long j61 = i22;
        long j62 = (j55 * j59) + (j61 * j61);
        long j63 = i24 * 2;
        long j64 = (j57 * j59) + (j55 * j63);
        long j65 = i25 * 2;
        long j66 = (((long) i23) * j59) + (j55 * j65) + (j61 * j63);
        long j67 = (j57 * j65) + (j63 * j59);
        long j68 = i24;
        long j69 = (j59 * j65) + (j68 * j68);
        long j71 = j68 * j65;
        long j72 = ((long) i25) * j65;
        long j73 = j54 + (j64 - j49);
        int i26 = ((int) j73) & M26;
        long j74 = (j73 >> 26) + ((j66 - j23) - j42);
        int i27 = ((int) j74) & M25;
        long j75 = j46 + ((((j74 >> 25) + j67) - j51) * 38);
        iArr2[0] = ((int) j75) & M26;
        long j76 = (j75 >> 26) + j47 + ((j69 - j52) * 38);
        iArr2[1] = ((int) j76) & M26;
        long j77 = (j76 >> 26) + j48 + ((j71 - j53) * 38);
        iArr2[2] = ((int) j77) & M25;
        long j78 = (j77 >> 25) + j49 + ((j72 - j54) * 38);
        iArr2[3] = ((int) j78) & M26;
        long j79 = (j78 >> 26) + j23 + (j42 * 38);
        iArr2[4] = ((int) j79) & M25;
        long j81 = (j79 >> 25) + j51 + (j56 - j46);
        iArr2[5] = ((int) j81) & M26;
        long j82 = (j81 >> 26) + j52 + (j58 - j47);
        iArr2[6] = ((int) j82) & M26;
        long j83 = (j82 >> 26) + j53 + (j62 - j48);
        iArr2[7] = ((int) j83) & M25;
        long j84 = (j83 >> 25) + ((long) i26);
        iArr2[8] = ((int) j84) & M26;
        iArr2[9] = i27 + ((int) (j84 >> 26));
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode128(bArr, 0, iArr, 0);
        decode128(bArr, 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    public static void encode(int[] iArr, byte[] bArr, int i11) {
        encode128(iArr, 0, bArr, i11);
        encode128(iArr, 5, bArr, i11 + 16);
    }

    public static void decode(int[] iArr, int i11, int[] iArr2) {
        decode128(iArr, i11, iArr2, 0);
        decode128(iArr, i11 + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & M24;
    }

    public static void encode(int[] iArr, int[] iArr2, int i11) {
        encode128(iArr, 0, iArr2, i11);
        encode128(iArr, 5, iArr2, i11 + 4);
    }
}
