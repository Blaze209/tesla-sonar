package atd.json;

import co0.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/adyen/threeds2/internal/util/DestroyableString;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "thisRef", "Lco0/m;", "property", "getValue", "(Ljava/lang/Object;Lco0/m;)Ljava/lang/String;", "get", "()Ljava/lang/String;", "Ljn0/h0;", "destroy", "()V", "_value", "Ljava/lang/String;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters {
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private String AuthenticationRequestParameters;

    public AuthenticationRequestParameters(String str) {
        s.k(str, "");
        this.AuthenticationRequestParameters = str;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        m mVar = (m) objArr[1];
        int i11 = getSDKReferenceNumber;
        int i12 = i11 & 125;
        int i13 = ((i11 ^ 125) | i12) << 1;
        int i14 = -((i11 | 125) & (~i12));
        getSDKAppID = ((i13 & i14) + (i14 | i13)) % 128;
        s.k(mVar, "");
        String str = (String) getDeviceData(new Object[]{authenticationRequestParameters}, -993560543, 993560546, System.identityHashCode(authenticationRequestParameters));
        int iIdentityHashCode = System.identityHashCode(authenticationRequestParameters);
        int i15 = ~iIdentityHashCode;
        int i16 = ((-8602753) & i15) | ((~i15) & 8602752);
        int i17 = i15 & 8602752;
        int i18 = (i17 & i16) | (i16 ^ i17);
        int i19 = ((i18 & (-1860435709)) | (i18 ^ (-1860435709))) * 1444;
        int i21 = 1043001284 & i19;
        int i22 = i21 + ((i19 ^ 1043001284) | i21);
        int i23 = ~(209974436 | iIdentityHashCode);
        int i24 = (i23 & (-1860435709)) | ((-1860435709) ^ i23);
        int i25 = (iIdentityHashCode & 1659064024) | (1659064024 ^ iIdentityHashCode);
        int i26 = (i25 | (~i25)) & (~i25);
        int i27 = i24 ^ i26;
        int i28 = i26 & i24;
        int i29 = ((i28 & i27) | (i27 ^ i28)) * (-1444);
        int i31 = (i22 ^ i29) + ((i29 & i22) << 1);
        int i32 = i31 & 1288565176;
        int i33 = -(-((1288565176 ^ i31) | i32));
        int i34 = (i32 & i33) + (i33 | i32);
        int iIdentityHashCode2 = System.identityHashCode(authenticationRequestParameters);
        int i35 = ((~iIdentityHashCode2) & 8055277) | ((-8055278) & iIdentityHashCode2);
        int i36 = 8055277 & iIdentityHashCode2;
        int i37 = ~((i35 & i36) | (i35 ^ i36));
        int i38 = -(~(((i37 & (-1157295104)) | ((-1157295104) ^ i37)) * 576));
        int i39 = (-2) - (((2145992670 & i38) + (i38 | 2145992670)) ^ (-1));
        int i41 = (~iIdentityHashCode2) | 8055277;
        int i42 = ~((i41 & (-1153450676)) | (i41 ^ (-1153450676)));
        int i43 = 3844428 & i42;
        int i44 = (i42 | 3844428) & (~i43);
        int i45 = ((i44 & i43) | (i44 ^ i43)) * 576;
        if (i34 > (((i39 | i45) << 1) - (i45 ^ i39)) - 882049024) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = i14 | i11;
        int i16 = (i11 * 624) + (i12 * (-622)) + ((~(i15 | i13)) * 623) + (((~(i12 | (~i11))) | (~i13)) * (-623)) + (((~(i11 | i13)) | (~i15) | (~(i14 | i13))) * 623);
        if (i16 == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        if (i16 == 2) {
            return getSDKReferenceNumber(objArr);
        }
        if (i16 == 3) {
            return getDeviceData(objArr);
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i17 = getSDKAppID;
        int i18 = ((i17 ^ 45) + ((i17 & 45) << 1)) % 128;
        getSDKReferenceNumber = i18;
        authenticationRequestParameters.AuthenticationRequestParameters = null;
        getSDKAppID = (((i18 & 53) - (~(-(-(i18 | 53))))) - 1) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = ((i11 & 126) + (i11 | 126)) - 1;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            return (String) getDeviceData(new Object[]{authenticationRequestParameters}, -993560543, 993560546, System.identityHashCode(authenticationRequestParameters));
        }
        int i13 = 51 / 0;
        return (String) getDeviceData(new Object[]{authenticationRequestParameters}, -993560543, 993560546, System.identityHashCode(authenticationRequestParameters));
    }

    private final String getSDKReferenceNumber() {
        return (String) getDeviceData(new Object[]{this}, -993560543, 993560546, System.identityHashCode(this));
    }

    public final void AuthenticationRequestParameters() {
        getDeviceData(new Object[]{this}, -1497589000, 1497589000, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws getSDKTransactionID {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = i11 ^ 125;
        int i13 = ((i11 & 125) | i12) << 1;
        int i14 = -i12;
        getSDKAppID = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        String str = authenticationRequestParameters.AuthenticationRequestParameters;
        if (str == null) {
            throw new getSDKTransactionID();
        }
        int i15 = ((i11 | 80) << 1) - (i11 ^ 80);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        getSDKAppID = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 74 / 0;
        }
        return str;
    }

    public final String getDeviceData(m<?> mVar) {
        return (String) getDeviceData(new Object[]{this, mVar}, 574190206, -574190205, System.identityHashCode(this));
    }

    public final String getDeviceData() {
        return (String) getDeviceData(new Object[]{this}, 680619687, -680619685, System.identityHashCode(this));
    }
}
