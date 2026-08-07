package atd.ac;

import atd.an.getSDKEphemeralPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSDKAppID {
    private static int getSDKAppID = 0;
    private static int getSDKTransactionID = 1;

    static {
        getSDKEphemeralPublicKey.getSDKTransactionID(new Object[0], 549537595, -549537595, (int) System.currentTimeMillis());
        int i11 = getSDKAppID;
        int i12 = ((i11 | 45) << 1) - (i11 ^ 45);
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 29 / 0;
        }
    }

    public abstract String getSDKAppID();
}
