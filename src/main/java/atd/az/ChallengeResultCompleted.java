package atd.az;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCompleted {
    public int getDeviceData;
    public int getSDKAppID;
    public int getSDKReferenceNumber;

    public static void getSDKAppID(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length / 2; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[(iArr.length - i11) - 1];
            iArr[(iArr.length - i11) - 1] = i12;
        }
    }

    public static int getSDKAppID(int i11) {
        int[][] iArr = ChallengeResultCancelled.getDeviceData.getSDKAppID;
        return ((iArr[0][(i11 >>> 24) & 255] + iArr[1][(i11 >>> 16) & 255]) ^ iArr[2][(i11 >>> 8) & 255]) + iArr[3][i11 & 255];
    }
}
