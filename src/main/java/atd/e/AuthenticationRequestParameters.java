package atd.e;

import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters extends getMessageVersion {
    private static int BuildConfig = 0;
    private static int ChallengeResult = 1;
    private String AuthenticationRequestParameters;
    private String getDeviceData;
    private String getSDKAppID;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;

    AuthenticationRequestParameters(JsonObject jsonObject) {
        super(jsonObject);
        this.AuthenticationRequestParameters = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.ERROR_CODE).getSDKReferenceNumber();
        this.getSDKTransactionID = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.ERROR_COMPONENT).getSDKReferenceNumber();
        this.getSDKAppID = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.ERROR_DESCRIPTION).getSDKReferenceNumber();
        this.getSDKReferenceNumber = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.ERROR_DETAIL).getSDKReferenceNumber();
        this.getDeviceData = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.ERROR_MESSAGE_TYPE).getSDKReferenceNumber();
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        JsonObject jsonObject = (JsonObject) objArr[1];
        atd.am.getDeviceData getdevicedata = (atd.am.getDeviceData) objArr[2];
        int i11 = ChallengeResult;
        int i12 = i11 & 55;
        int i13 = ((i11 ^ 55) | i12) << 1;
        int i14 = -((i11 | 55) & (~i12));
        BuildConfig = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
        String sDKReferenceNumber = atd.d.getMessageVersion.BuildConfig(jsonObject, getdevicedata).getSDKReferenceNumber();
        int i15 = ChallengeResult;
        int i16 = i15 & 121;
        int i17 = ((i15 ^ 121) | i16) << 1;
        int i18 = -((i15 | 121) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        BuildConfig = i19 % 128;
        if (i19 % 2 != 0) {
            int i21 = 55 / 0;
        }
        return sDKReferenceNumber;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = BuildConfig;
        int i12 = i11 & 115;
        int i13 = (i11 ^ 115) | i12;
        ChallengeResult = ((i12 & i13) + (i12 | i13)) % 128;
        String str = authenticationRequestParameters.getSDKReferenceNumber;
        int i14 = i11 & 31;
        int i15 = (i11 | 31) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        ChallengeResult = i17 % 128;
        if (i17 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 450) + (i12 * (-448));
        int i15 = ~((~i11) | i12);
        int i16 = ~i12;
        int i17 = i14 + (((~(i16 | i11 | i13)) | i15) * 449) + (i15 * (-1347)) + (((~(i11 | i16 | (~i13))) | i15) * 449);
        if (i17 == 1) {
            int i18 = BuildConfig;
            int i19 = i18 & 103;
            ChallengeResult = ((i19 - (~(-(-((i18 ^ 103) | i19))))) - 1) % 128;
            return Boolean.FALSE;
        }
        if (i17 == 2) {
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            int i21 = ChallengeResult;
            BuildConfig = (((i21 | 43) << 1) - (i21 ^ 43)) % 128;
            super.ChallengeResultCancelled();
            authenticationRequestParameters.AuthenticationRequestParameters = null;
            authenticationRequestParameters.getSDKTransactionID = null;
            authenticationRequestParameters.getSDKAppID = null;
            authenticationRequestParameters.getSDKReferenceNumber = null;
            authenticationRequestParameters.getDeviceData = null;
            int i22 = ChallengeResult;
            BuildConfig = ((i22 ^ 41) + ((i22 & 41) << 1)) % 128;
            return null;
        }
        if (i17 == 3) {
            return getDeviceData(objArr);
        }
        if (i17 == 4) {
            AuthenticationRequestParameters authenticationRequestParameters2 = (AuthenticationRequestParameters) objArr[0];
            int i23 = ChallengeResult;
            BuildConfig = (i23 + 49) % 128;
            String str = authenticationRequestParameters2.AuthenticationRequestParameters;
            BuildConfig = (i23 + 37) % 128;
            return str;
        }
        if (i17 == 5) {
            return getSDKReferenceNumber(objArr);
        }
        AuthenticationRequestParameters authenticationRequestParameters3 = (AuthenticationRequestParameters) objArr[0];
        int i24 = BuildConfig;
        int i25 = i24 & 125;
        int i26 = ((i24 ^ 125) | i25) << 1;
        int i27 = -((i24 | 125) & (~i25));
        int i28 = ((i26 ^ i27) + ((i27 & i26) << 1)) % 128;
        ChallengeResult = i28;
        String str2 = authenticationRequestParameters3.getSDKAppID;
        int i29 = ((i28 ^ 109) | (i28 & 109)) << 1;
        int i31 = -((i28 & (-110)) | ((~i28) & 109));
        BuildConfig = ((i29 ^ i31) + ((i29 & i31) << 1)) % 128;
        return str2;
    }

    public final String AuthenticationRequestParameters() {
        return (String) getSDKTransactionID(new Object[]{this}, 97945187, -97945183, System.identityHashCode(this));
    }

    @Override // atd.e.getMessageVersion
    public final void ChallengeResultCancelled() {
        getSDKTransactionID(new Object[]{this}, -2064651259, 2064651261, System.identityHashCode(this));
    }

    public final String getSDKAppID() {
        return (String) getSDKTransactionID(new Object[]{this}, 1922381678, -1922381673, System.identityHashCode(this));
    }

    @Override // atd.e.getMessageVersion
    public final boolean getDeviceData() {
        return ((Boolean) getSDKTransactionID(new Object[]{this}, 1357831834, -1357831833, System.identityHashCode(this))).booleanValue();
    }

    public final String getSDKReferenceNumber() {
        return (String) getSDKTransactionID(new Object[]{this}, -285579322, 285579322, System.identityHashCode(this));
    }

    @Override // atd.e.getMessageVersion
    final String getSDKTransactionID(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) {
        return (String) getSDKTransactionID(new Object[]{this, jsonObject, getdevicedata}, -1236203226, 1236203229, System.identityHashCode(this));
    }
}
