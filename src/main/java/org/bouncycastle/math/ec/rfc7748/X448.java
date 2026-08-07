package org.bouncycastle.math.ec.rfc7748;

import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class X448 {
    private static final int C_A = 156326;
    private static final int C_A24 = 39082;
    public static final int POINT_SIZE = 56;
    public static final int SCALAR_SIZE = 56;

    private static class F extends X448Field {
        private F() {
        }
    }

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public static boolean calculateAgreement(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        scalarMult(bArr, i11, bArr2, i12, bArr3, i13);
        return !Arrays.areAllZeroes(bArr3, i13, 56);
    }

    private static int decode32(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private static void decodeScalar(byte[] bArr, int i11, int[] iArr) {
        for (int i12 = 0; i12 < 14; i12++) {
            iArr[i12] = decode32(bArr, (i12 * 4) + i11);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length != 56) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public static void generatePublicKey(byte[] bArr, int i11, byte[] bArr2, int i12) {
        scalarMultBase(bArr, i11, bArr2, i12);
    }

    private static void pointDouble(int[] iArr, int[] iArr2) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.add(iArr, iArr2, iArrCreate);
        X448Field.sub(iArr, iArr2, iArrCreate2);
        X448Field.sqr(iArrCreate, iArrCreate);
        X448Field.sqr(iArrCreate2, iArrCreate2);
        X448Field.mul(iArrCreate, iArrCreate2, iArr);
        X448Field.sub(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.mul(iArrCreate, C_A24, iArr2);
        X448Field.add(iArr2, iArrCreate2, iArr2);
        X448Field.mul(iArr2, iArrCreate, iArr2);
    }

    public static void precompute() {
        Ed448.precompute();
    }

    public static void scalarMult(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int[] iArr = new int[14];
        decodeScalar(bArr, i11, iArr);
        int[] iArrCreate = X448Field.create();
        X448Field.decode(bArr2, i12, iArrCreate);
        int[] iArrCreate2 = X448Field.create();
        X448Field.copy(iArrCreate, 0, iArrCreate2, 0);
        int[] iArrCreate3 = X448Field.create();
        iArrCreate3[0] = 1;
        int[] iArrCreate4 = X448Field.create();
        iArrCreate4[0] = 1;
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArrCreate7 = X448Field.create();
        int i14 = 447;
        int i15 = 1;
        while (true) {
            X448Field.add(iArrCreate4, iArrCreate5, iArrCreate6);
            X448Field.sub(iArrCreate4, iArrCreate5, iArrCreate4);
            X448Field.add(iArrCreate2, iArrCreate3, iArrCreate5);
            X448Field.sub(iArrCreate2, iArrCreate3, iArrCreate2);
            X448Field.mul(iArrCreate6, iArrCreate2, iArrCreate6);
            X448Field.mul(iArrCreate4, iArrCreate5, iArrCreate4);
            X448Field.sqr(iArrCreate5, iArrCreate5);
            X448Field.sqr(iArrCreate2, iArrCreate2);
            X448Field.sub(iArrCreate5, iArrCreate2, iArrCreate7);
            X448Field.mul(iArrCreate7, C_A24, iArrCreate3);
            X448Field.add(iArrCreate3, iArrCreate2, iArrCreate3);
            X448Field.mul(iArrCreate3, iArrCreate7, iArrCreate3);
            X448Field.mul(iArrCreate2, iArrCreate5, iArrCreate2);
            X448Field.sub(iArrCreate6, iArrCreate4, iArrCreate5);
            X448Field.add(iArrCreate6, iArrCreate4, iArrCreate4);
            X448Field.sqr(iArrCreate4, iArrCreate4);
            X448Field.sqr(iArrCreate5, iArrCreate5);
            X448Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
            i14--;
            int i16 = (iArr[i14 >>> 5] >>> (i14 & 31)) & 1;
            int i17 = i15 ^ i16;
            X448Field.cswap(i17, iArrCreate2, iArrCreate4);
            X448Field.cswap(i17, iArrCreate3, iArrCreate5);
            if (i14 < 2) {
                break;
            } else {
                i15 = i16;
            }
        }
        for (int i18 = 0; i18 < 2; i18++) {
            pointDouble(iArrCreate2, iArrCreate3);
        }
        X448Field.inv(iArrCreate3, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.normalize(iArrCreate2);
        X448Field.encode(iArrCreate2, bArr3, i13);
    }

    public static void scalarMultBase(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        Ed448.scalarMultBaseXY(Friend.INSTANCE, bArr, i11, iArrCreate, iArrCreate2);
        X448Field.inv(iArrCreate, iArrCreate);
        X448Field.mul(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.encode(iArrCreate, bArr2, i12);
    }
}
