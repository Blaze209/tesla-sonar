package atd.az;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdditionalDetails {
    public int getDeviceData;
    public int getSDKTransactionID;

    public static char[] getDeviceData(long j11, char[] cArr, int i11) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 4;
        while (i12 < cArr.length) {
            if ((((j11 >>> i12) & 1) != i11 || i13 >= 4) && i14 < length) {
                cArr2[i14] = cArr[i12];
                i14++;
            } else {
                cArr2[i13] = cArr[i12];
                i13++;
            }
            i12++;
        }
        return cArr2;
    }
}
