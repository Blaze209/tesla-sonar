package atd.as;

import android.content.Context;
import androidx.annotation.NonNull;
import atd.ap.getSDKEphemeralPublicKey;
import com.adyen.threeds2.Warning;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKAppID extends getDeviceData {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private final atd.ar.getDeviceData getSDKReferenceNumber;

    getSDKAppID(atd.ar.getDeviceData getdevicedata) {
        this.getSDKReferenceNumber = getdevicedata;
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = ~i13;
        int i16 = ~(i14 | i15);
        int i17 = ~i11;
        int i18 = (i11 * 371) + (i12 * 371) + ((i16 | (~(i17 | i13))) * (-370));
        int i19 = (~(i13 | i14)) | (~(i15 | i17));
        int i21 = ~(i11 | i12);
        return (i18 + ((i19 | i21) * (-370))) + (i21 * 370) != 1 ? getSDKReferenceNumber(objArr) : getDeviceData(objArr);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        AuthenticationRequestParameters = (getDeviceData + 59) % 128;
        if (getsdkappid.getSDKReferenceNumber.getSDKAppID()) {
            int i11 = AuthenticationRequestParameters;
            getDeviceData = (((i11 & (-32)) | ((~i11) & 31)) + ((i11 & 31) << 1)) % 128;
            return Boolean.FALSE;
        }
        int i12 = getDeviceData;
        int i13 = i12 ^ 69;
        int i14 = ((i12 & 69) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        int i17 = i16 % 128;
        AuthenticationRequestParameters = i17;
        boolean z11 = i16 % 2 == 0;
        int i18 = i17 & 125;
        int i19 = -(-(i17 | 125));
        int i21 = ((i18 | i19) << 1) - (i19 ^ i18);
        getDeviceData = i21 % 128;
        if (i21 % 2 != 0) {
            return Boolean.valueOf(z11);
        }
        int i22 = 49 / 0;
        return Boolean.valueOf(z11);
    }

    @Override // atd.as.getDeviceData
    protected final boolean AuthenticationRequestParameters(Context context) {
        return ((Boolean) getDeviceData(new Object[]{this, context}, -1010508407, 1010508407, System.identityHashCode(this))).booleanValue();
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 23;
        getDeviceData = ((((i11 | 23) & (~i12)) - (~(i12 << 1))) - 1) % 128;
        getSDKEphemeralPublicKey getsdkephemeralpublickey = getSDKEphemeralPublicKey.getSDKTransactionID;
        int i13 = ~System.identityHashCode(getsdkappid);
        int i14 = ~((-1578538355) | i13);
        int i15 = 1443103826 & i14;
        int i16 = (i14 | 1443103826) & (~i15);
        int i17 = ((i16 & i15) | (i16 ^ i15)) * (-241);
        int i18 = (((1632617314 | i17) << 1) - (i17 ^ 1632617314)) - (-40600532);
        int i19 = ((~i13) & (-1578538355)) | (1578538354 & i13);
        int i21 = i13 & (-1578538355);
        int i22 = (i21 & i19) | (i19 ^ i21);
        int i23 = i22 ^ (-144429482);
        int i24 = i22 & (-144429482);
        int i25 = ~((i24 & i23) | (i23 ^ i24));
        int i26 = -(-(((i25 & (-1587533308)) | ((-1587533308) ^ i25)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE));
        int i27 = i18 & i26;
        int i28 = (i27 - (~(-(-((i26 ^ i18) | i27))))) - 1;
        int iIdentityHashCode = System.identityHashCode(getsdkappid);
        int i29 = (~iIdentityHashCode) & ((~iIdentityHashCode) | iIdentityHashCode);
        int i31 = ((~i29) & (-1610252531)) | (1610252530 & i29);
        int i32 = i29 & (-1610252531);
        int i33 = (i32 & i31) | (i31 ^ i32);
        int i34 = (~((i33 & 1783358674) | (i33 ^ 1783358674))) * (-783);
        int i35 = 1500957953 & i34;
        int i36 = i34 | 1500957953;
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        int i38 = ~iIdentityHashCode;
        int i39 = i38 ^ 1783358674;
        int i41 = i38 & 1783358674;
        int i42 = ~((i41 & i39) | (i39 ^ i41));
        int i43 = (-1610252531) & i42;
        int i44 = (i42 | (-1610252531)) & (~i43);
        int i45 = ((i44 & i43) | (i44 ^ i43)) * 783;
        if (i28 > (((i37 | i45) << 1) - (~(-(i45 ^ i37)))) - 1) {
            return getsdkephemeralpublickey;
        }
        throw null;
    }

    @Override // atd.as.getDeviceData
    @NonNull
    protected final Warning getDeviceData() {
        return (Warning) getDeviceData(new Object[]{this}, -1298151710, 1298151711, System.identityHashCode(this));
    }
}
