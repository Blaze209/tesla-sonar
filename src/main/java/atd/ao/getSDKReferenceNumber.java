package atd.ao;

import co0.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0003\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f*\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001b\u0010\u0004\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f*\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u001b\u0010\u0005\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0016\u0010\u000f*\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;", "", "", "platform", "platformVersion", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljn0/h0;", "destroy", "()V", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "_platform", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "getPlatform", "()Ljava/lang/String;", "getPlatform$delegate", "(Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;)Ljava/lang/Object;", "_platformVersion", "getPlatformVersion", "getPlatformVersion$delegate", "_model", "getModel", "getModel$delegate", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber {
    private static int getDeviceData = 0;
    private static /* synthetic */ m<Object>[] getSDKAppID = {o0.k(new f0(getSDKReferenceNumber.class, "platform", "getPlatform()Ljava/lang/String;", 0)), o0.k(new f0(getSDKReferenceNumber.class, "platformVersion", "getPlatformVersion()Ljava/lang/String;", 0)), o0.k(new f0(getSDKReferenceNumber.class, "model", "getModel()Ljava/lang/String;", 0))};
    private static int getSDKEphemeralPublicKey = 1;
    private final atd.json.AuthenticationRequestParameters AuthenticationRequestParameters;
    private final atd.json.AuthenticationRequestParameters getSDKReferenceNumber;
    private final atd.json.AuthenticationRequestParameters getSDKTransactionID;

    static {
        int i11 = getDeviceData;
        int i12 = i11 | 45;
        int i13 = (i12 << 1) - ((~(i11 & 45)) & i12);
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public getSDKReferenceNumber(String str, String str2, String str3) {
        s.k(str, "");
        s.k(str2, "");
        s.k(str3, "");
        this.getSDKTransactionID = new atd.json.AuthenticationRequestParameters(str);
        this.getSDKReferenceNumber = new atd.json.AuthenticationRequestParameters(str2);
        this.AuthenticationRequestParameters = new atd.json.AuthenticationRequestParameters(str3);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        int i11 = getDeviceData;
        int i12 = i11 & 51;
        int i13 = -(-((i11 ^ 51) | i12));
        getSDKEphemeralPublicKey = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters = getsdkreferencenumber.getSDKReferenceNumber;
        String str = (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters, getSDKAppID[1]}, 574190206, -574190205, System.identityHashCode(authenticationRequestParameters));
        int i14 = getSDKEphemeralPublicKey;
        int i15 = (i14 & 59) + (i14 | 59);
        getDeviceData = i15 % 128;
        if (i15 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        int i11 = getDeviceData;
        int i12 = i11 | 33;
        int i13 = i12 << 1;
        int i14 = -((~(i11 & 33)) & i12);
        getSDKEphemeralPublicKey = ((i13 & i14) + (i14 | i13)) % 128;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters = getsdkreferencenumber.getSDKTransactionID;
        atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters));
        atd.json.AuthenticationRequestParameters authenticationRequestParameters2 = getsdkreferencenumber.getSDKReferenceNumber;
        atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters2));
        atd.json.AuthenticationRequestParameters authenticationRequestParameters3 = getsdkreferencenumber.AuthenticationRequestParameters;
        atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters3}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters3));
        int i15 = getDeviceData;
        int i16 = ((i15 & 31) - (~(-(-(i15 | 31))))) - 1;
        getSDKEphemeralPublicKey = i16 % 128;
        if (i16 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 465) + (i12 * (-463));
        int i15 = ~i12;
        int i16 = ~i13;
        int i17 = ~(i15 | i16);
        int i18 = ~(i15 | i11);
        int i19 = i14 + (((~(i16 | i11)) | i17 | i18) * 464) + ((i15 | (~i11) | i13) * (-464)) + (((~(i11 | i13)) | i18) * 464);
        if (i19 == 1) {
            return getSDKAppID(objArr);
        }
        if (i19 == 2) {
            return AuthenticationRequestParameters(objArr);
        }
        if (i19 == 3) {
            getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
            int i21 = getSDKEphemeralPublicKey + 21;
            getDeviceData = i21 % 128;
            int i22 = i21 % 2;
            atd.json.AuthenticationRequestParameters authenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters;
            return i22 != 0 ? (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters, getSDKAppID[2]}, 574190206, -574190205, System.identityHashCode(authenticationRequestParameters)) : (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters, getSDKAppID[2]}, 574190206, -574190205, System.identityHashCode(authenticationRequestParameters));
        }
        getSDKReferenceNumber getsdkreferencenumber2 = (getSDKReferenceNumber) objArr[0];
        int i23 = getDeviceData;
        int i24 = i23 & 97;
        int i25 = -(-((i23 ^ 97) | i24));
        int i26 = (i24 & i25) + (i25 | i24);
        getSDKEphemeralPublicKey = i26 % 128;
        int i27 = i26 % 2;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters2 = getsdkreferencenumber2.getSDKTransactionID;
        m<Object>[] mVarArr = getSDKAppID;
        String str = (String) (i27 == 0 ? atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2, mVarArr[1]}, 574190206, -574190205, System.identityHashCode(authenticationRequestParameters2)) : atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2, mVarArr[0]}, 574190206, -574190205, System.identityHashCode(authenticationRequestParameters2)));
        int i28 = getDeviceData;
        getSDKEphemeralPublicKey = (((((i28 ^ 43) | (i28 & 43)) << 1) - (~(-(((~i28) & 43) | (i28 & (-44)))))) - 1) % 128;
        return str;
    }

    public final void getDeviceData() {
        getSDKTransactionID(new Object[]{this}, -990024658, 990024659, System.identityHashCode(this));
    }

    public final String getSDKReferenceNumber() {
        return (String) getSDKTransactionID(new Object[]{this}, 765513546, -765513543, System.identityHashCode(this));
    }

    public final String AuthenticationRequestParameters() {
        return (String) getSDKTransactionID(new Object[]{this}, 1916747622, -1916747622, System.identityHashCode(this));
    }

    public final String getSDKAppID() {
        return (String) getSDKTransactionID(new Object[]{this}, -1640721886, 1640721888, System.identityHashCode(this));
    }
}
