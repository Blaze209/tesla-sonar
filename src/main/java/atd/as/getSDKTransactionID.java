package atd.as;

import android.content.Context;
import androidx.annotation.NonNull;
import com.adyen.threeds2.Warning;
import com.plaid.internal.EnumC4419g;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKTransactionID extends getDeviceData {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKAppID;
    private final String getDeviceData;
    private final Collection<String> getSDKReferenceNumber;
    private final atd.ar.getSDKTransactionID getSDKTransactionID;

    getSDKTransactionID(String str, Collection<String> collection, atd.ar.getSDKTransactionID getsdktransactionid) {
        this.getDeviceData = str;
        this.getSDKReferenceNumber = collection;
        this.getSDKTransactionID = getsdktransactionid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r0.getSDKAppID(r7, r2) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getDeviceData(java.lang.Object[] r7) {
        /*
            r0 = 0
            r0 = r7[r0]
            atd.as.getSDKTransactionID r0 = (atd.as.getSDKTransactionID) r0
            r1 = 1
            r7 = r7[r1]
            android.content.Context r7 = (android.content.Context) r7
            int r2 = atd.as.getSDKTransactionID.getSDKAppID
            int r2 = r2 + 71
            int r3 = r2 % 128
            atd.as.getSDKTransactionID.AuthenticationRequestParameters = r3
            int r2 = r2 % 2
            r3 = 0
            if (r2 == 0) goto L6d
            atd.ar.getSDKTransactionID r2 = r0.getSDKTransactionID
            java.util.Collection<java.lang.String> r4 = r0.getSDKReferenceNumber
            boolean r2 = r2.AuthenticationRequestParameters(r7, r4)
            if (r2 == 0) goto L5e
            java.lang.String r2 = r0.getDeviceData
            if (r2 == 0) goto L48
            int r4 = atd.as.getSDKTransactionID.AuthenticationRequestParameters
            r5 = r4 ^ 117(0x75, float:1.64E-43)
            r4 = r4 & 117(0x75, float:1.64E-43)
            r4 = r4 | r5
            int r4 = r4 << r1
            int r5 = -r5
            r6 = r4 ^ r5
            r4 = r4 & r5
            int r4 = r4 << r1
            int r6 = r6 + r4
            int r4 = r6 % 128
            atd.as.getSDKTransactionID.getSDKAppID = r4
            int r6 = r6 % 2
            atd.ar.getSDKTransactionID r0 = r0.getSDKTransactionID
            if (r6 != 0) goto L44
            boolean r7 = r0.getSDKAppID(r7, r2)
            if (r7 != 0) goto L48
            goto L5e
        L44:
            r0.getSDKAppID(r7, r2)
            throw r3
        L48:
            int r7 = atd.as.getSDKTransactionID.AuthenticationRequestParameters
            r0 = r7 | 109(0x6d, float:1.53E-43)
            int r0 = r0 << r1
            r2 = r7 & (-110(0xffffffffffffff92, float:NaN))
            int r7 = ~r7
            r7 = r7 & 109(0x6d, float:1.53E-43)
            r7 = r7 | r2
            int r7 = -r7
            int r7 = ~r7
            int r0 = r0 - r7
            int r0 = r0 - r1
            int r0 = r0 % 128
            atd.as.getSDKTransactionID.getSDKAppID = r0
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L5e:
            int r7 = atd.as.getSDKTransactionID.AuthenticationRequestParameters
            r0 = r7 | 115(0x73, float:1.61E-43)
            int r0 = r0 << r1
            r7 = r7 ^ 115(0x73, float:1.61E-43)
            int r0 = r0 - r7
            int r0 = r0 % 128
            atd.as.getSDKTransactionID.getSDKAppID = r0
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L6d:
            atd.ar.getSDKTransactionID r1 = r0.getSDKTransactionID
            java.util.Collection<java.lang.String> r0 = r0.getSDKReferenceNumber
            r1.AuthenticationRequestParameters(r7, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getSDKTransactionID.getDeviceData(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = (i11 * (-129)) + (i12 * 131) + ((~((~i13) | i14 | i11)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        int i16 = i14 | i11;
        return (i15 + ((~i16) * (-260))) + (((~((~i11) | i12)) | (~(i16 | i13))) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) != 1 ? getSDKTransactionID(objArr) : getDeviceData(objArr);
    }

    @Override // atd.as.getDeviceData
    protected final boolean AuthenticationRequestParameters(Context context) {
        return ((Boolean) getSDKTransactionID(new Object[]{this, context}, 345683003, -345683002, System.identityHashCode(this))).booleanValue();
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 13;
        int i13 = -(-((i11 ^ 13) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        getSDKAppID = i14 % 128;
        int i15 = i14 % 2;
        atd.ap.getDeviceData getdevicedata = atd.ap.getDeviceData.getSDKAppID;
        if (i15 != 0) {
            int i16 = 78 / 0;
        }
        int i17 = getSDKAppID;
        int i18 = ((i17 | 23) << 1) - (i17 ^ 23);
        AuthenticationRequestParameters = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 87 / 0;
        }
        return getdevicedata;
    }

    @Override // atd.as.getDeviceData
    @NonNull
    protected final Warning getDeviceData() {
        return (Warning) getSDKTransactionID(new Object[]{this}, -2004133962, 2004133962, System.identityHashCode(this));
    }
}
