package atd.at;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import atd.e.ChallengeResultError;
import atd.e.ChallengeResultKt;
import atd.e.getAdditionalDetails;
import com.adyen.threeds2.R;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKEphemeralPublicKey extends getDeviceData<ChallengeResultKt, atd.ax.getSDKAppID> implements View.OnClickListener {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData;
    private final EditText getSDKReferenceNumber;
    private final Button getSDKTransactionID;

    public getSDKEphemeralPublicKey(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (i11 * (-209)) + (i12 * (-209)) + ((~(i14 | i15)) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        int i17 = ~i13;
        int i18 = i16 + (((~(i15 | i17)) | (~(i14 | i13))) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i11 | i15 | i13)) | (~(i12 | i14 | i17))) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        if (i18 == 1) {
            return getSDKAppID(objArr);
        }
        if (i18 == 2) {
            getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
            getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[1];
            int i19 = AuthenticationRequestParameters;
            int i21 = i19 | 57;
            getDeviceData = (((i21 << 1) - (~(-((~(i19 & 57)) & i21)))) - 1) % 128;
            super.getSDKAppID(getadditionaldetails);
            int i22 = AuthenticationRequestParameters;
            int i23 = i22 & 111;
            int i24 = (i22 | 111) & (~i23);
            int i25 = i23 << 1;
            getDeviceData = (((i24 | i25) << 1) - (i24 ^ i25)) % 128;
            return null;
        }
        if (i18 == 3) {
            return getSDKReferenceNumber(objArr);
        }
        if (i18 != 4) {
            return getSDKTransactionID(objArr);
        }
        getSDKEphemeralPublicKey getsdkephemeralpublickey2 = (getSDKEphemeralPublicKey) objArr[0];
        View view = (View) objArr[1];
        int i26 = AuthenticationRequestParameters;
        int i27 = i26 & 53;
        getDeviceData = (i27 + ((i26 ^ 53) | i27)) % 128;
        super.onClick(view);
        if (getsdkephemeralpublickey2.getSDKReferenceNumber() != 0) {
            int i28 = getDeviceData;
            AuthenticationRequestParameters = (((((i28 ^ 77) | (i28 & 77)) << 1) - (~(-(((~i28) & 77) | (i28 & (-78)))))) - 1) % 128;
            if (view.equals(getsdkephemeralpublickey2.getSDKTransactionID)) {
                getDeviceData = (AuthenticationRequestParameters + 81) % 128;
                getsdkephemeralpublickey2.getSDKTransactionID.setEnabled(false);
                String string = getsdkephemeralpublickey2.getSDKReferenceNumber.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    int i29 = AuthenticationRequestParameters;
                    int i31 = i29 ^ 85;
                    getDeviceData = (((((i29 & 85) | i31) << 1) - (~(-i31))) - 1) % 128;
                    ((atd.ax.getSDKAppID) getsdkephemeralpublickey2.getSDKReferenceNumber()).getSDKTransactionID(getsdkephemeralpublickey2.getMessageVersion());
                    int i32 = AuthenticationRequestParameters;
                    getDeviceData = ((i32 & 23) + (i32 | 23)) % 128;
                    return null;
                }
                ((atd.ax.getSDKAppID) getsdkephemeralpublickey2.getSDKReferenceNumber()).getSDKAppID(string, getsdkephemeralpublickey2.getMessageVersion());
                int i33 = getDeviceData;
                int i34 = i33 ^ 15;
                AuthenticationRequestParameters = ((((i33 & 15) | i34) << 1) - i34) % 128;
            }
        }
        int i35 = AuthenticationRequestParameters;
        int i36 = i35 & 117;
        int i37 = -(-((i35 ^ 117) | i36));
        getDeviceData = ((i36 ^ i37) + ((i37 & i36) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        int i11 = getDeviceData;
        int i12 = i11 & 27;
        int i13 = i12 + ((i11 ^ 27) | i12);
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 != 0) {
            return Integer.valueOf(R.layout.a3ds2_view_challenge_text);
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        ChallengeResultKt challengeResultKt = (ChallengeResultKt) objArr[1];
        int i11 = getDeviceData;
        int i12 = i11 ^ 33;
        int i13 = ((i11 & 33) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 == 0) {
            getsdkephemeralpublickey.getSDKReferenceNumber(getsdkephemeralpublickey.getSDKReferenceNumber.getId());
            getsdkephemeralpublickey.getSDKTransactionID.setText((String) ChallengeResultError.getSDKTransactionID(new Object[]{challengeResultKt}, 856692704, -856692704, System.identityHashCode(challengeResultKt)));
            getsdkephemeralpublickey.getSDKTransactionID.setOnClickListener(getsdkephemeralpublickey);
            throw null;
        }
        getsdkephemeralpublickey.getSDKReferenceNumber(getsdkephemeralpublickey.getSDKReferenceNumber.getId());
        getsdkephemeralpublickey.getSDKTransactionID.setText((String) ChallengeResultError.getSDKTransactionID(new Object[]{challengeResultKt}, 856692704, -856692704, System.identityHashCode(challengeResultKt)));
        getsdkephemeralpublickey.getSDKTransactionID.setOnClickListener(getsdkephemeralpublickey);
        int i16 = getDeviceData;
        int i17 = i16 ^ 7;
        int i18 = (i16 & 7) << 1;
        AuthenticationRequestParameters = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[1];
        int i11 = getDeviceData;
        int i12 = i11 ^ 69;
        int i13 = -(-((i11 & 69) << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        AuthenticationRequestParameters = i14 % 128;
        Object[] objArr2 = {getsdkephemeralpublickey, (ChallengeResultKt) getadditionaldetails};
        if (i14 % 2 != 0) {
            AuthenticationRequestParameters(objArr2, -2137978214, 2137978217, System.identityHashCode(getsdkephemeralpublickey));
            return null;
        }
        AuthenticationRequestParameters(objArr2, -2137978214, 2137978217, System.identityHashCode(getsdkephemeralpublickey));
        int i15 = 43 / 0;
        return null;
    }

    @Override // atd.at.getDeviceData, android.view.View.OnClickListener
    public final void onClick(View view) {
        AuthenticationRequestParameters(new Object[]{this, view}, 1872418615, -1872418611, System.identityHashCode(this));
    }

    public getSDKEphemeralPublicKey(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // atd.at.getDeviceData
    public final /* synthetic */ void getSDKAppID(getAdditionalDetails getadditionaldetails) {
        AuthenticationRequestParameters(new Object[]{this, getadditionaldetails}, -1730254345, 1730254347, System.identityHashCode(this));
    }

    @Override // atd.at.getDeviceData
    protected final /* synthetic */ void getSDKTransactionID(getAdditionalDetails getadditionaldetails) {
        AuthenticationRequestParameters(new Object[]{this, getadditionaldetails}, -2055731026, 2055731026, System.identityHashCode(this));
    }

    public getSDKEphemeralPublicKey(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.getSDKReferenceNumber = (EditText) findViewById(R.id.editText_text);
        this.getSDKTransactionID = (Button) findViewById(R.id.button_continue);
    }

    @Override // atd.at.getDeviceData
    protected final int getSDKAppID() {
        return ((Integer) AuthenticationRequestParameters(new Object[]{this}, 1694382994, -1694382993, System.identityHashCode(this))).intValue();
    }

    private void AuthenticationRequestParameters(ChallengeResultKt challengeResultKt) {
        AuthenticationRequestParameters(new Object[]{this, challengeResultKt}, -2137978214, 2137978217, System.identityHashCode(this));
    }
}
