package atd.ag;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID {
    private static int getSDKAppID = 0;
    private static int getSDKTransactionID = 1;
    private final byte[] AuthenticationRequestParameters;
    private final byte[] getDeviceData;
    private final byte[] getSDKReferenceNumber;

    getSDKAppID(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.getSDKReferenceNumber = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.AuthenticationRequestParameters = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : null;
        this.getDeviceData = bArr3 != null ? Arrays.copyOf(bArr3, bArr3.length) : null;
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i13;
        int i16 = i14 | i15;
        int i17 = ~(i16 | i12);
        int i18 = ~i12;
        int i19 = i15 | i18;
        int i21 = (i11 * (-183)) + (i12 * (-183)) + ((i17 | (~(i19 | i11))) * (-184)) + (((~i19) | (~(i14 | i18)) | (~i16)) * 184) + ((i11 | i12) * 184);
        if (i21 == 1) {
            return getDeviceData(objArr);
        }
        if (i21 != 2) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i22 = getSDKAppID;
            getSDKTransactionID = ((i22 & 85) + (i22 | 85)) % 128;
            byte[] bArr = getsdkappid.AuthenticationRequestParameters;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i23 = getSDKTransactionID;
            getSDKAppID = ((i23 & 67) + (i23 | 67)) % 128;
            return bArrCopyOf;
        }
        getSDKAppID getsdkappid2 = (getSDKAppID) objArr[0];
        int i24 = getSDKTransactionID;
        int i25 = i24 & 15;
        int i26 = (i24 ^ 15) | i25;
        int i27 = (((i25 | i26) << 1) - (i26 ^ i25)) % 128;
        getSDKAppID = i27;
        byte[] bArr2 = getsdkappid2.getSDKReferenceNumber;
        if (bArr2 != null) {
            int i28 = i27 & 97;
            getSDKTransactionID = ((((i27 ^ 97) | i28) << 1) - ((i27 | 97) & (~i28))) % 128;
            Arrays.fill(bArr2, (byte) 0);
            int i29 = getSDKTransactionID;
            getSDKAppID = ((i29 & 79) + (i29 | 79)) % 128;
        }
        byte[] bArr3 = getsdkappid2.AuthenticationRequestParameters;
        if (bArr3 != null) {
            int i31 = getSDKTransactionID;
            int i32 = ((i31 ^ 38) + ((i31 & 38) << 1)) - 1;
            getSDKAppID = i32 % 128;
            if (i32 % 2 != 0) {
                Arrays.fill(bArr3, (byte) 1);
            } else {
                Arrays.fill(bArr3, (byte) 0);
            }
            int i33 = getSDKTransactionID;
            getSDKAppID = ((-2) - (((i33 & 8) + (i33 | 8)) ^ (-1))) % 128;
        }
        byte[] bArr4 = getsdkappid2.getDeviceData;
        if (bArr4 != null) {
            int i34 = getSDKAppID;
            int i35 = i34 ^ 31;
            int i36 = ((i34 & 31) | i35) << 1;
            int i37 = -i35;
            int i38 = (i36 & i37) + (i36 | i37);
            getSDKTransactionID = i38 % 128;
            if (i38 % 2 == 0) {
                Arrays.fill(bArr4, (byte) 1);
            } else {
                Arrays.fill(bArr4, (byte) 0);
            }
            int i39 = getSDKTransactionID;
            int i41 = i39 & 103;
            int i42 = (i39 ^ 103) | i41;
            getSDKAppID = ((i41 & i42) + (i42 | i41)) % 128;
        }
        int i43 = getSDKAppID;
        int i44 = i43 & 37;
        int i45 = -(-((i43 ^ 37) | i44));
        getSDKTransactionID = ((i44 & i45) + (i45 | i44)) % 128;
        return null;
    }

    public final byte[] AuthenticationRequestParameters() {
        return (byte[]) getDeviceData(new Object[]{this}, -1354625395, 1354625395, System.identityHashCode(this));
    }

    public final byte[] getSDKTransactionID() {
        return (byte[]) getDeviceData(new Object[]{this}, 1072173015, -1072173014, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        byte[] bArrCopyOf;
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = getSDKTransactionID + 27;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = getsdkappid.getDeviceData;
        if (i12 != 0) {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i13 = 70 / 0;
        } else {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        int i14 = getSDKTransactionID;
        int i15 = (i14 & 106) + (i14 | 106);
        getSDKAppID = ((i15 ^ (-1)) + (i15 << 1)) % 128;
        return bArrCopyOf;
    }

    public final void getDeviceData() {
        getDeviceData(new Object[]{this}, -792410552, 792410554, System.identityHashCode(this));
    }
}
