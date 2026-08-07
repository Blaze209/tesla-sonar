package org.bouncycastle.math.ec.rfc8032;

import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes10.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 32;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;
    private static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE};

    Scalar25519() {
    }

    static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    static void getOrderWnafVar(int i11, byte[] bArr) {
        Wnaf.getSignedVar(L, i11, bArr);
    }

    static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    static byte[] reduce384(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & M32L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & M32L;
        long jDecode33 = ((long) Codec.decode32(bArr, 7)) & M32L;
        long jDecode25 = ((long) (Codec.decode24(bArr, 11) << 4)) & M32L;
        long jDecode34 = ((long) Codec.decode32(bArr, 14)) & M32L;
        long jDecode26 = ((long) (Codec.decode24(bArr, 18) << 4)) & M32L;
        long jDecode35 = ((long) Codec.decode32(bArr, 21)) & M32L;
        long jDecode27 = ((long) (Codec.decode24(bArr, 25) << 4)) & M32L;
        long jDecode36 = ((long) Codec.decode32(bArr, 28)) & M32L;
        long jDecode28 = Codec.decode24(bArr, 32) << 4;
        long j11 = jDecode28 & M32L;
        long jDecode37 = Codec.decode32(bArr, 35);
        long j12 = jDecode37 & M32L;
        long jDecode29 = Codec.decode24(bArr, 39) << 4;
        long j13 = jDecode29 & M32L;
        long jDecode38 = Codec.decode32(bArr, 42);
        long jDecode16 = (((long) (Codec.decode16(bArr, 46) << 4)) & M32L) + ((jDecode38 & M32L) >> 28);
        long j14 = jDecode36 - (jDecode16 * 5343);
        long j15 = (jDecode38 & M28L) + (j13 >> 28);
        long j16 = (jDecode34 - (jDecode16 * (-50998291))) - (j15 * 19280294);
        long j17 = (jDecode26 - (jDecode16 * 19280294)) - (j15 * 127719000);
        long j18 = (jDecode35 - (jDecode16 * 127719000)) - (j15 * (-6428113));
        long j19 = (jDecode27 - (jDecode16 * (-6428113))) - (j15 * 5343);
        long j21 = (jDecode29 & M28L) + (j12 >> 28);
        long j22 = jDecode33 - (j21 * (-50998291));
        long j23 = (jDecode25 - (j15 * (-50998291))) - (j21 * 19280294);
        long j24 = j16 - (j21 * 127719000);
        long j25 = j17 - (j21 * (-6428113));
        long j26 = j18 - (j21 * 5343);
        long j27 = (jDecode37 & M28L) + (j11 >> 28);
        long j28 = jDecode28 & M28L;
        long j29 = jDecode24 - (j27 * (-50998291));
        long j31 = j22 - (j27 * 19280294);
        long j32 = j23 - (j27 * 127719000);
        long j33 = j24 - (j27 * (-6428113));
        long j34 = j25 - (j27 * 5343);
        long j35 = j14 + (j19 >> 28);
        long j36 = j19 & M28L;
        long j37 = j28 + (j35 >> 28);
        long j38 = j35 & M28L;
        long j39 = j38 >>> 27;
        long j41 = j37 + j39;
        long j42 = jDecode32 - (j41 * (-50998291));
        long j43 = j31 - (j41 * 127719000);
        long j44 = j32 - (j41 * (-6428113));
        long j45 = j33 - (j41 * 5343);
        long j46 = (j29 - (j41 * 19280294)) + (j42 >> 28);
        long j47 = j42 & M28L;
        long j48 = j43 + (j46 >> 28);
        long j49 = j46 & M28L;
        long j51 = j44 + (j48 >> 28);
        long j52 = j48 & M28L;
        long j53 = j45 + (j51 >> 28);
        long j54 = j51 & M28L;
        long j55 = j34 + (j53 >> 28);
        long j56 = j53 & M28L;
        long j57 = j26 + (j55 >> 28);
        long j58 = j55 & M28L;
        long j59 = j36 + (j57 >> 28);
        long j61 = j57 & M28L;
        long j62 = j38 + (j59 >> 28);
        long j63 = j59 & M28L;
        long j64 = j62 >> 28;
        long j65 = j62 & M28L;
        long j66 = j64 - j39;
        long j67 = j47 + (j66 & (-50998291));
        long j68 = j49 + (j66 & 19280294) + (j67 >> 28);
        long j69 = j67 & M28L;
        long j71 = j52 + (j66 & 127719000) + (j68 >> 28);
        long j72 = j68 & M28L;
        long j73 = j54 + (j66 & (-6428113)) + (j71 >> 28);
        long j74 = j71 & M28L;
        long j75 = j56 + (j66 & 5343) + (j73 >> 28);
        long j76 = j73 & M28L;
        long j77 = j58 + (j75 >> 28);
        long j78 = j75 & M28L;
        long j79 = j61 + (j77 >> 28);
        long j81 = j77 & M28L;
        long j82 = j63 + (j79 >> 28);
        long j83 = j79 & M28L;
        long j84 = j65 + (j82 >> 28);
        long j85 = M28L & j82;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j69 | (j72 << 28), bArr2, 0);
        Codec.encode56(j74 | (j76 << 28), bArr2, 7);
        Codec.encode56((j81 << 28) | j78, bArr2, 14);
        Codec.encode56((j85 << 28) | j83, bArr2, 21);
        Codec.encode32((int) j84, bArr2, 28);
        return bArr2;
    }

    static byte[] reduce512(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & M32L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & M32L;
        long jDecode33 = ((long) Codec.decode32(bArr, 7)) & M32L;
        long jDecode25 = ((long) (Codec.decode24(bArr, 11) << 4)) & M32L;
        long jDecode34 = ((long) Codec.decode32(bArr, 14)) & M32L;
        long jDecode26 = ((long) (Codec.decode24(bArr, 18) << 4)) & M32L;
        long jDecode35 = ((long) Codec.decode32(bArr, 21)) & M32L;
        long jDecode27 = ((long) (Codec.decode24(bArr, 25) << 4)) & M32L;
        long jDecode36 = ((long) Codec.decode32(bArr, 28)) & M32L;
        long jDecode28 = ((long) (Codec.decode24(bArr, 32) << 4)) & M32L;
        long jDecode37 = ((long) Codec.decode32(bArr, 35)) & M32L;
        long jDecode29 = ((long) (Codec.decode24(bArr, 39) << 4)) & M32L;
        long jDecode38 = ((long) Codec.decode32(bArr, 42)) & M32L;
        long jDecode210 = ((long) (Codec.decode24(bArr, 46) << 4)) & M32L;
        long jDecode39 = Codec.decode32(bArr, 49);
        long j11 = jDecode39 & M32L;
        long jDecode211 = ((long) (Codec.decode24(bArr, 53) << 4)) & M32L;
        long jDecode310 = Codec.decode32(bArr, 56);
        long j12 = jDecode310 & M32L;
        long jDecode212 = ((long) (Codec.decode24(bArr, 60) << 4)) & M32L;
        long j13 = ((long) bArr[63]) & M08L;
        long j14 = jDecode212 + (j12 >> 28);
        long j15 = jDecode310 & M28L;
        long j16 = (jDecode38 - (j13 * (-6428113))) - (j14 * 5343);
        long j17 = (jDecode36 - (j14 * (-50998291))) - (j15 * 19280294);
        long j18 = ((jDecode28 - (j13 * (-50998291))) - (j14 * 19280294)) - (j15 * 127719000);
        long j19 = ((jDecode37 - (j13 * 19280294)) - (j14 * 127719000)) - (j15 * (-6428113));
        long j21 = ((jDecode29 - (j13 * 127719000)) - (j14 * (-6428113))) - (j15 * 5343);
        long j22 = jDecode211 + (j11 >> 28);
        long j23 = jDecode39 & M28L;
        long j24 = j19 - (j22 * 5343);
        long j25 = (j18 - (j22 * (-6428113))) - (j23 * 5343);
        long j26 = (jDecode210 - (j13 * 5343)) + (j16 >> 28);
        long j27 = ((jDecode35 - (j22 * (-50998291))) - (j23 * 19280294)) - (j26 * 127719000);
        long j28 = (((jDecode27 - (j15 * (-50998291))) - (j22 * 19280294)) - (j23 * 127719000)) - (j26 * (-6428113));
        long j29 = ((j17 - (j22 * 127719000)) - (j23 * (-6428113))) - (j26 * 5343);
        long j31 = (j16 & M28L) + (j21 >> 28);
        long j32 = (jDecode34 - (j26 * (-50998291))) - (j31 * 19280294);
        long j33 = ((jDecode26 - (j23 * (-50998291))) - (j26 * 19280294)) - (j31 * 127719000);
        long j34 = j28 - (j31 * 5343);
        long j35 = (j21 & M28L) + (j24 >> 28);
        long j36 = jDecode33 - (j35 * (-50998291));
        long j37 = (jDecode25 - (j31 * (-50998291))) - (j35 * 19280294);
        long j38 = j32 - (j35 * 127719000);
        long j39 = j33 - (j35 * (-6428113));
        long j41 = (j27 - (j31 * (-6428113))) - (j35 * 5343);
        long j42 = (j24 & M28L) + (j25 >> 28);
        long j43 = j25 & M28L;
        long j44 = jDecode24 - (j42 * (-50998291));
        long j45 = j36 - (j42 * 19280294);
        long j46 = j37 - (j42 * 127719000);
        long j47 = j38 - (j42 * (-6428113));
        long j48 = j39 - (j42 * 5343);
        long j49 = j29 + (j34 >> 28);
        long j51 = j34 & M28L;
        long j52 = j43 + (j49 >> 28);
        long j53 = j49 & M28L;
        long j54 = j53 >>> 27;
        long j55 = j52 + j54;
        long j56 = jDecode32 - (j55 * (-50998291));
        long j57 = j45 - (j55 * 127719000);
        long j58 = j46 - (j55 * (-6428113));
        long j59 = j47 - (j55 * 5343);
        long j61 = (j44 - (j55 * 19280294)) + (j56 >> 28);
        long j62 = j56 & M28L;
        long j63 = j57 + (j61 >> 28);
        long j64 = j61 & M28L;
        long j65 = j58 + (j63 >> 28);
        long j66 = j63 & M28L;
        long j67 = j59 + (j65 >> 28);
        long j68 = j65 & M28L;
        long j69 = j48 + (j67 >> 28);
        long j71 = j67 & M28L;
        long j72 = j41 + (j69 >> 28);
        long j73 = j69 & M28L;
        long j74 = j51 + (j72 >> 28);
        long j75 = j72 & M28L;
        long j76 = j53 + (j74 >> 28);
        long j77 = j74 & M28L;
        long j78 = j76 >> 28;
        long j79 = j76 & M28L;
        long j81 = j78 - j54;
        long j82 = j62 + (j81 & (-50998291));
        long j83 = j64 + (j81 & 19280294) + (j82 >> 28);
        long j84 = j82 & M28L;
        long j85 = j66 + (j81 & 127719000) + (j83 >> 28);
        long j86 = j83 & M28L;
        long j87 = j68 + (j81 & (-6428113)) + (j85 >> 28);
        long j88 = j85 & M28L;
        long j89 = j71 + (j81 & 5343) + (j87 >> 28);
        long j91 = j87 & M28L;
        long j92 = j73 + (j89 >> 28);
        long j93 = j89 & M28L;
        long j94 = j75 + (j92 >> 28);
        long j95 = j92 & M28L;
        long j96 = j77 + (j94 >> 28);
        long j97 = j94 & M28L;
        long j98 = j79 + (j96 >> 28);
        long j99 = j96 & M28L;
        byte[] bArr2 = new byte[32];
        Codec.encode56(j84 | (j86 << 28), bArr2, 0);
        Codec.encode56(j88 | (j91 << 28), bArr2, 7);
        Codec.encode56((j95 << 28) | j93, bArr2, 14);
        Codec.encode56((j99 << 28) | j97, bArr2, 21);
        Codec.encode32((int) j98, bArr2, 28);
        return bArr2;
    }

    static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int i11 = 1016;
        int[] iArr12 = iArr11;
        int[] iArr13 = new int[4];
        int[] iArr14 = iArr9;
        int[] iArr15 = iArr10;
        int i12 = 15;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr5;
        while (bitLengthPositive > 254) {
            i11--;
            if (i11 < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i12, iArr6) - bitLengthPositive;
            int i13 = bitLength & (~(bitLength >> 31));
            if (iArr6[i12] < 0) {
                ScalarUtil.addShifted_NP(i12, i13, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i13, iArr14, iArr13, iArr15, iArr12);
            } else {
                ScalarUtil.subShifted_NP(i12, i13, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i13, iArr14, iArr13, iArr15, iArr12);
            }
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr12;
            if (ScalarUtil.lessThan(i12, iArr16, iArr17)) {
                int i14 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i14, iArr16);
                int[] iArr20 = iArr17;
                iArr17 = iArr16;
                iArr16 = iArr20;
                i12 = i14;
                bitLengthPositive = bitLengthPositive2;
                iArr15 = iArr14;
                iArr12 = iArr13;
                iArr13 = iArr19;
                iArr14 = iArr18;
            } else {
                iArr12 = iArr19;
                iArr15 = iArr18;
            }
        }
        System.arraycopy(iArr15, 0, iArr2, 0, 4);
        System.arraycopy(iArr12, 0, iArr3, 0, 4);
        return true;
    }

    static void toSignedDigits(int i11, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
