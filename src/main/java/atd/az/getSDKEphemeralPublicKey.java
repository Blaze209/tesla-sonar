package atd.az;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKEphemeralPublicKey {
    private static int AuthenticationRequestParameters(int i11, int[][] iArr) {
        return ((iArr[0][i11 >>> 24] + iArr[1][(i11 >>> 16) & 255]) ^ iArr[2][(i11 >>> 8) & 255]) + iArr[3][i11 & 255];
    }

    public static void getSDKAppID(int i11, int i12, boolean z11, int i13, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z11) {
            getSDKReferenceNumber(iArr);
        }
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i11 ^ iArr[i14];
            int iAuthenticationRequestParameters = i12 ^ AuthenticationRequestParameters(i15, iArr2);
            i14++;
            i12 = i15;
            i11 = iAuthenticationRequestParameters;
        }
        int i16 = i11 ^ iArr[iArr.length - 2];
        int i17 = i12 ^ iArr[iArr.length - 1];
        if (!z11) {
            getSDKReferenceNumber(iArr);
        }
        iArr3[0] = i17;
        iArr3[1] = i16;
    }

    private static void getSDKReferenceNumber(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length / 2; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[(iArr.length - i11) - 1];
            iArr[(iArr.length - i11) - 1] = i12;
        }
    }
}
