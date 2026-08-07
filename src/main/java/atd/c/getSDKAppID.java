package atd.c;

import atd.d.AuthenticationRequestParameters;
import atd.d.getSDKTransactionID;
import atd.e.getMessageVersion;
import atd.e.getSDKEphemeralPublicKey;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKTransactionID = 1;
    private final ExecutorService getDeviceData = Executors.newFixedThreadPool(3);
    private getSDKReferenceNumber getSDKAppID;
    private final getSDKTransactionID<getMessageVersion> getSDKReferenceNumber;

    public getSDKAppID(String str, Object obj, getSDKTransactionID<getMessageVersion> getsdktransactionid) {
        this.getSDKAppID = new getSDKReferenceNumber(str, obj);
        this.getSDKReferenceNumber = getsdktransactionid;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = ~i13;
        if ((i11 * 46) + (i12 * 46) + (((~(i14 | i15)) | i11) * (-90)) + (((~(i12 | i11)) | (~(i14 | i13))) * (-45)) + (((~(i11 | i15)) | (~((~i11) | i13)) | i14) * 45) == 1) {
            return getSDKTransactionID(objArr);
        }
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[1];
        getSDKReferenceNumber getsdkreferencenumber = getsdkappid.getSDKAppID;
        getsdkappid.getDeviceData.submit(new AuthenticationRequestParameters(getsdkappid.getSDKReferenceNumber, (Callable) getSDKReferenceNumber.getDeviceData(new Object[]{getsdkreferencenumber, getsdkephemeralpublickey}, -1002560179, 1002560180, System.identityHashCode(getsdkreferencenumber))));
        AuthenticationRequestParameters = (getSDKTransactionID + 3) % 128;
        return null;
    }

    public final void AuthenticationRequestParameters() {
        getSDKTransactionID(new Object[]{this}, -923573567, 923573568, System.identityHashCode(this));
    }

    public final void getSDKReferenceNumber(getSDKEphemeralPublicKey getsdkephemeralpublickey) {
        getSDKTransactionID(new Object[]{this, getsdkephemeralpublickey}, 1877211052, -1877211052, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) throws Throwable {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = getSDKTransactionID;
        AuthenticationRequestParameters = (i11 + 7) % 128;
        getSDKReferenceNumber getsdkreferencenumber = getsdkappid.getSDKAppID;
        if (getsdkreferencenumber != null) {
            int i12 = i11 ^ 69;
            int i13 = ((i11 & 69) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            AuthenticationRequestParameters = i15 % 128;
            if (i15 % 2 == 0) {
                getsdkreferencenumber.getSDKAppID();
                getsdkappid.getSDKAppID = null;
            } else {
                getsdkreferencenumber.getSDKAppID();
                getsdkappid.getSDKAppID = null;
                throw null;
            }
        }
        int i16 = getSDKTransactionID + 79;
        AuthenticationRequestParameters = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 37 / 0;
        }
        return null;
    }
}
