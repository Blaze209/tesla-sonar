package org.bouncycastle.math.ec.rfc7748;

import com.plaid.internal.EnumC4419g;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class X25519 {
    private static final int C_A = 486662;
    private static final int C_A24 = 121666;
    public static final int POINT_SIZE = 32;
    public static final int SCALAR_SIZE = 32;

    private static class F extends X25519Field {
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
        return !Arrays.areAllZeroes(bArr3, i13, 32);
    }

    private static int decode32(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private static void decodeScalar(byte[] bArr, int i11, int[] iArr) {
        for (int i12 = 0; i12 < 8; i12++) {
            iArr[i12] = decode32(bArr, (i12 * 4) + i11);
        }
        iArr[0] = iArr[0] & (-8);
        int i13 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i13;
        iArr[7] = i13 | 1073741824;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b11 = (byte) (bArr[31] & 127);
        bArr[31] = b11;
        bArr[31] = (byte) (b11 | 64);
    }

    public static void generatePublicKey(byte[] bArr, int i11, byte[] bArr2, int i12) {
        scalarMultBase(bArr, i11, bArr2, i12);
    }

    private static void pointDouble(int[] iArr, int[] iArr2) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.apm(iArr, iArr2, iArrCreate, iArrCreate2);
        X25519Field.sqr(iArrCreate, iArrCreate);
        X25519Field.sqr(iArrCreate2, iArrCreate2);
        X25519Field.mul(iArrCreate, iArrCreate2, iArr);
        X25519Field.sub(iArrCreate, iArrCreate2, iArrCreate);
        X25519Field.mul(iArrCreate, C_A24, iArr2);
        X25519Field.add(iArr2, iArrCreate2, iArr2);
        X25519Field.mul(iArr2, iArrCreate, iArr2);
    }

    public static void precompute() {
        Ed25519.precompute();
    }

    public static void scalarMult(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int[] iArr = new int[8];
        decodeScalar(bArr, i11, iArr);
        int[] iArrCreate = X25519Field.create();
        X25519Field.decode(bArr2, i12, iArrCreate);
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.copy(iArrCreate, 0, iArrCreate2, 0);
        int[] iArrCreate3 = X25519Field.create();
        iArrCreate3[0] = 1;
        int[] iArrCreate4 = X25519Field.create();
        iArrCreate4[0] = 1;
        int[] iArrCreate5 = X25519Field.create();
        int[] iArrCreate6 = X25519Field.create();
        int[] iArrCreate7 = X25519Field.create();
        int i14 = EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
        int i15 = 1;
        while (true) {
            X25519Field.apm(iArrCreate4, iArrCreate5, iArrCreate6, iArrCreate4);
            X25519Field.apm(iArrCreate2, iArrCreate3, iArrCreate5, iArrCreate2);
            X25519Field.mul(iArrCreate6, iArrCreate2, iArrCreate6);
            X25519Field.mul(iArrCreate4, iArrCreate5, iArrCreate4);
            X25519Field.sqr(iArrCreate5, iArrCreate5);
            X25519Field.sqr(iArrCreate2, iArrCreate2);
            X25519Field.sub(iArrCreate5, iArrCreate2, iArrCreate7);
            X25519Field.mul(iArrCreate7, C_A24, iArrCreate3);
            X25519Field.add(iArrCreate3, iArrCreate2, iArrCreate3);
            X25519Field.mul(iArrCreate3, iArrCreate7, iArrCreate3);
            X25519Field.mul(iArrCreate2, iArrCreate5, iArrCreate2);
            X25519Field.apm(iArrCreate6, iArrCreate4, iArrCreate4, iArrCreate5);
            X25519Field.sqr(iArrCreate4, iArrCreate4);
            X25519Field.sqr(iArrCreate5, iArrCreate5);
            X25519Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
            i14--;
            int i16 = (iArr[i14 >>> 5] >>> (i14 & 31)) & 1;
            int i17 = i15 ^ i16;
            X25519Field.cswap(i17, iArrCreate2, iArrCreate4);
            X25519Field.cswap(i17, iArrCreate3, iArrCreate5);
            if (i14 < 3) {
                break;
            } else {
                i15 = i16;
            }
        }
        for (int i18 = 0; i18 < 3; i18++) {
            pointDouble(iArrCreate2, iArrCreate3);
        }
        X25519Field.inv(iArrCreate3, iArrCreate3);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate2);
        X25519Field.normalize(iArrCreate2);
        X25519Field.encode(iArrCreate2, bArr3, i13);
    }

    public static void scalarMultBase(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        Ed25519.scalarMultBaseYZ(Friend.INSTANCE, bArr, i11, iArrCreate, iArrCreate2);
        X25519Field.apm(iArrCreate2, iArrCreate, iArrCreate, iArrCreate2);
        X25519Field.inv(iArrCreate2, iArrCreate2);
        X25519Field.mul(iArrCreate, iArrCreate2, iArrCreate);
        X25519Field.normalize(iArrCreate);
        X25519Field.encode(iArrCreate, bArr2, i12);
    }
}
