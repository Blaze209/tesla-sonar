package atd.at;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.adyen.threeds2.R;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber extends AuthenticationRequestParameters<atd.e.getSDKTransactionID, atd.ax.getSDKReferenceNumber> {
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;

    public getSDKReferenceNumber(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        return getSDKTransactionID(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        int i11 = getSDKAppID + 111;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = R.layout.a3ds2_view_challenge_loading;
        int iIdentityHashCode = System.identityHashCode(getsdkreferencenumber);
        int i13 = ~iIdentityHashCode;
        int i14 = (-1129460442) & i13;
        int i15 = (i13 | (-1129460442)) & (~i14);
        int i16 = ~((i15 & i14) | (i15 ^ i14));
        int i17 = (-201672705) ^ iIdentityHashCode;
        int i18 = (-201672705) & iIdentityHashCode;
        int i19 = ~((i18 & i17) | (i17 ^ i18));
        int i21 = ((~i19) & i16) | ((~i16) & i19);
        int i22 = i16 & i19;
        int i23 = (-1790307722) - (~(-(~(-(-(((i22 & i21) | (i21 ^ i22)) * (-272)))))));
        int i24 = 1017497638 | iIdentityHashCode;
        int i25 = (i24 | (~i24)) & (~i24);
        int i26 = -(-(((i25 & (-2146958080)) | ((-2146958080) ^ i25)) * (-272)));
        int i27 = (((i23 | i26) << 1) - (~(-(i26 ^ i23)))) - 1;
        int i28 = (-1017497639) & iIdentityHashCode;
        int i29 = (iIdentityHashCode | (-1017497639)) & (~i28);
        int i31 = ~((i29 & i28) | (i29 ^ i28));
        int i32 = ((~i31) & 1945285375) | ((-1945285376) & i31);
        int i33 = i31 & 1945285375;
        int i34 = -(-(((i33 & i32) | (i32 ^ i33)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
        int i35 = i27 & i34;
        int i36 = i35 + ((i34 ^ i27) | i35);
        int iIdentityHashCode2 = System.identityHashCode(getsdkreferencenumber);
        int i37 = (~iIdentityHashCode2) & ((~iIdentityHashCode2) | iIdentityHashCode2);
        int i38 = ((~i37) & (-23615829)) | (23615828 & i37);
        int i39 = i37 & (-23615829);
        int i41 = -(~(-(-(((i39 & i38) | (i38 ^ i39)) * 184))));
        int i42 = (((-1740571753) ^ i41) + ((i41 & (-1740571753)) << 1)) - 1;
        int i43 = ~iIdentityHashCode2;
        int i44 = (i43 & 2055448203) | (i43 ^ 2055448203);
        int i45 = (i44 | (~i44)) & (~i44);
        int i46 = 679641600 ^ i45;
        int i47 = i45 & 679641600;
        int i48 = (i47 & i46) | (i46 ^ i47);
        int i49 = i48 ^ (-2079064032);
        int i51 = i48 & (-2079064032);
        int i52 = -(-(((i51 & i49) | (i49 ^ i51)) * 184));
        int i53 = i42 & i52;
        if (i36 > ((((i42 ^ i52) | i53) << 1) - (~(-((i52 | i42) & (~i53))))) - 1) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    public getSDKReferenceNumber(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // atd.at.AuthenticationRequestParameters
    protected final int getSDKTransactionID() {
        return ((Integer) getDeviceData(new Object[]{this}, 1418107862, -1418107862, System.identityHashCode(this))).intValue();
    }

    public getSDKReferenceNumber(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Button button = (Button) findViewById(R.id.button_cancel);
        if (button != null) {
            button.setEnabled(false);
        }
    }
}
