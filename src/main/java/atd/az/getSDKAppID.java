package atd.az;

import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID {
    private static byte[] getMessageVersion = new byte[256];
    static final byte[] getSDKTransactionID = new byte[256];
    static final int[] getSDKAppID = new int[256];
    static final int[] getSDKReferenceNumber = new int[256];
    static final int[] getDeviceData = new int[256];
    static final int[] AuthenticationRequestParameters = new int[256];
    private static int[] ChallengeResultCancelled = new int[10];

    static {
        byte[] bArr;
        int i11;
        byte b11 = 1;
        byte b12 = 1;
        do {
            b11 = (byte) (((b11 & 128) != 0 ? 27 : 0) ^ ((b11 << 1) ^ b11));
            byte b13 = (byte) (b12 ^ (b12 << 1));
            byte b14 = (byte) (b13 ^ (b13 << 2));
            byte b15 = (byte) (b14 ^ (b14 << 4));
            b12 = (byte) (b15 ^ ((b15 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = getMessageVersion;
            i11 = b11 & 255;
            int i12 = b12 & 255;
            bArr[i11] = (byte) (((((b12 ^ 99) ^ ((i12 << 1) | (i12 >> 7))) ^ ((i12 << 2) | (i12 >> 6))) ^ ((i12 << 3) | (i12 >> 5))) ^ ((i12 >> 4) | (i12 << 4)));
        } while (i11 != 1);
        bArr[0] = 99;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = getMessageVersion[i13] & 255;
            getSDKTransactionID[i14] = (byte) i13;
            int i15 = i13 << 1;
            if (i15 >= 256) {
                i15 ^= EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE;
            }
            int i16 = i15 << 1;
            if (i16 >= 256) {
                i16 ^= EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE;
            }
            int i17 = i16 << 1;
            if (i17 >= 256) {
                i17 ^= EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE;
            }
            int i18 = i17 ^ i13;
            int i19 = ((i15 ^ (i16 ^ i17)) << 24) | (i18 << 16) | ((i18 ^ i16) << 8) | (i18 ^ i15);
            getSDKAppID[i14] = i19;
            getSDKReferenceNumber[i14] = (i19 >>> 8) | (i19 << 24);
            getDeviceData[i14] = (i19 >>> 16) | (i19 << 16);
            AuthenticationRequestParameters[i14] = (i19 << 8) | (i19 >>> 24);
        }
        ChallengeResultCancelled[0] = 16777216;
        int i21 = 1;
        for (int i22 = 1; i22 < 10; i22++) {
            i21 <<= 1;
            if (i21 >= 256) {
                i21 ^= EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE;
            }
            ChallengeResultCancelled[i22] = i21 << 24;
        }
    }

    static int[] AuthenticationRequestParameters(byte[] bArr, int i11) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i12 = 4;
        int i13 = (i11 + 1) * 4;
        int[] iArr = new int[i13];
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i14 + 3;
            int i17 = ((bArr[i14 + 1] & 255) << 16) | (bArr[i14] << 24) | ((bArr[i14 + 2] & 255) << 8);
            i14 += 4;
            iArr[i15] = i17 | (bArr[i16] & 255);
        }
        int i18 = 4;
        int i19 = 0;
        int i21 = 0;
        while (i18 < i13) {
            int i22 = iArr[i18 - 1];
            if (i19 == 0) {
                byte[] bArr2 = getMessageVersion;
                i22 = ((bArr2[i22 >>> 24] & 255) | (((bArr2[(i22 >>> 16) & 255] << 24) | ((bArr2[(i22 >>> 8) & 255] & 255) << 16)) | ((bArr2[i22 & 255] & 255) << 8))) ^ ChallengeResultCancelled[i21];
                i19 = 4;
                i21++;
            }
            iArr[i18] = i22 ^ iArr[i18 - 4];
            i18++;
            i19--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i13];
        int i23 = i11 * 4;
        iArr2[0] = iArr[i23];
        int i24 = 1;
        iArr2[1] = iArr[i23 + 1];
        iArr2[2] = iArr[i23 + 2];
        char c11 = 3;
        iArr2[3] = iArr[i23 + 3];
        int i25 = i23 - 4;
        while (i24 < i11) {
            int i26 = iArr[i25];
            int[] iArr3 = getSDKAppID;
            byte[] bArr3 = getMessageVersion;
            int i27 = iArr3[bArr3[i26 >>> 24] & 255];
            int[] iArr4 = getSDKReferenceNumber;
            int i28 = i27 ^ iArr4[bArr3[(i26 >>> 16) & 255] & 255];
            int[] iArr5 = getDeviceData;
            int i29 = i28 ^ iArr5[bArr3[(i26 >>> 8) & 255] & 255];
            int[] iArr6 = AuthenticationRequestParameters;
            iArr2[i12] = iArr6[bArr3[i26 & 255] & 255] ^ i29;
            int i31 = iArr[i25 + 1];
            char c12 = c11;
            int[] iArr7 = iArr2;
            iArr7[i12 + 1] = ((iArr4[bArr3[(i31 >>> 16) & 255] & 255] ^ iArr3[bArr3[i31 >>> 24] & 255]) ^ iArr5[bArr3[(i31 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i31 & 255] & 255];
            int i32 = iArr[i25 + 2];
            int i33 = i12 + 3;
            iArr7[i12 + 2] = iArr6[bArr3[i32 & 255] & 255] ^ ((iArr3[bArr3[i32 >>> 24] & 255] ^ iArr4[bArr3[(i32 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i32 >>> 8) & 255] & 255]);
            int i34 = iArr[i25 + 3];
            i12 += 4;
            iArr7[i33] = iArr6[bArr3[i34 & 255] & 255] ^ ((iArr3[bArr3[i34 >>> 24] & 255] ^ iArr4[bArr3[(i34 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i34 >>> 8) & 255] & 255]);
            i25 -= 4;
            i24++;
            c11 = c12;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i12] = iArr[i25];
        iArr8[i12 + 1] = iArr[i25 + 1];
        iArr8[i12 + 2] = iArr[i25 + 2];
        iArr8[i12 + 3] = iArr[i25 + 3];
        return iArr8;
    }

    public static byte[][] getSDKAppID(int i11) {
        byte[][] bArr = new byte[4][];
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 >>> (i12 << 3);
            bArr[i12] = new byte[]{(byte) (i13 & 3), (byte) ((i13 >> 2) & 3), (byte) ((i13 >> 4) & 3), (byte) ((i13 >> 6) & 3)};
        }
        return bArr;
    }
}
