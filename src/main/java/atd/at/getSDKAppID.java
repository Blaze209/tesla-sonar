package atd.at;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import atd.e.ChallengeResultTimeout;
import atd.e.getAdditionalDetails;
import com.adyen.threeds2.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID extends getDeviceData<ChallengeResultTimeout, atd.ax.AuthenticationRequestParameters> implements View.OnClickListener {
    private static int getDeviceData = 1;
    private static int getSDKAppID;
    private final Button getSDKReferenceNumber;
    private final Button getSDKTransactionID;

    public getSDKAppID(Context context) {
        this(context, null);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        View view = (View) objArr[1];
        int i11 = getSDKAppID + 123;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            super.onClick(view);
            getsdkappid.getSDKReferenceNumber();
            throw null;
        }
        super.onClick(view);
        if (getsdkappid.getSDKReferenceNumber() != 0) {
            int i12 = getDeviceData;
            int i13 = ((i12 ^ 111) - (~((i12 & 111) << 1))) - 1;
            getSDKAppID = i13 % 128;
            if (i13 % 2 != 0) {
                view.equals(getsdkappid.getSDKTransactionID);
                throw null;
            }
            if (view.equals(getsdkappid.getSDKTransactionID)) {
                getsdkappid.getSDKTransactionID.setEnabled(false);
                ((atd.ax.AuthenticationRequestParameters) getsdkappid.getSDKReferenceNumber()).AuthenticationRequestParameters((String) getDeviceData(new Object[]{getsdkappid}, 1327006645, -1327006645, System.identityHashCode(getsdkappid)));
                int i14 = getSDKAppID;
                getDeviceData = ((((i14 | 68) << 1) - (i14 ^ 68)) - 1) % 128;
                return null;
            }
            if (view.equals(getsdkappid.getSDKReferenceNumber)) {
                int i15 = getDeviceData;
                int i16 = i15 & 79;
                int i17 = ((i15 ^ 79) | i16) << 1;
                int i18 = -((i15 | 79) & (~i16));
                getSDKAppID = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                ((atd.ax.AuthenticationRequestParameters) getsdkappid.getSDKReferenceNumber()).dh_((Uri) getsdkappid.getSDKReferenceNumber.getTag(), (String) getDeviceData(new Object[]{getsdkappid}, 1327006645, -1327006645, System.identityHashCode(getsdkappid)));
                getSDKAppID = (getDeviceData + 7) % 128;
            }
        }
        getSDKAppID = (getDeviceData + 113) % 128;
        return null;
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-391)) + (i12 * (-195));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i13 | i12);
        switch (i14 + ((i16 | i17) * (-196)) + ((i12 | i11) * 392) + (((~((~i11) | i15)) | i17) * 196)) {
            case 1:
                return getSDKAppID(objArr);
            case 2:
                getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
                getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[1];
                int i18 = getSDKAppID;
                getDeviceData = ((((i18 & (-94)) | ((~i18) & 93)) - (~(-(-((i18 & 93) << 1))))) - 1) % 128;
                super.getSDKAppID(getadditionaldetails);
                int i19 = getDeviceData;
                getSDKAppID = ((i19 ^ 91) + ((i19 & 91) << 1)) % 128;
                return null;
            case 3:
                return getSDKReferenceNumber(objArr);
            case 4:
                int i21 = getDeviceData;
                int i22 = R.layout.a3ds2_view_challenge_out_of_band;
                getSDKAppID = (i21 + 63) % 128;
                return Integer.valueOf(i22);
            case 5:
                return getDeviceData(objArr);
            case 6:
                return AuthenticationRequestParameters(objArr);
            default:
                return getSDKTransactionID(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r3
      0x002e: PHI (r3v6 java.lang.String) = (r3v5 java.lang.String), (r3v17 java.lang.String) binds: [B:8:0x002c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        String strChallengeResultKt;
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[1];
        int i11 = getDeviceData;
        int i12 = i11 ^ 21;
        int i13 = (i11 & 21) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        getSDKAppID = i14 % 128;
        if (i14 % 2 != 0) {
            strChallengeResultKt = challengeResultTimeout.ChallengeResultKt();
            int i15 = 76 / 0;
            if (strChallengeResultKt != null) {
                int i16 = getDeviceData;
                int i17 = ((i16 | 13) << 1) - (((~i16) & 13) | (i16 & (-14)));
                getSDKAppID = i17 % 128;
                int i18 = i17 % 2;
                getsdkappid.getSDKReferenceNumber.setTag(Uri.parse(strChallengeResultKt));
                getsdkappid.getSDKReferenceNumber.setText(challengeResultTimeout.ChallengeStatusReceiver());
                getsdkappid.getSDKReferenceNumber.setOnClickListener(getsdkappid);
                getsdkappid.getSDKReferenceNumber.setVisibility(0);
                int i19 = getDeviceData;
                int i21 = i19 & 111;
                getSDKAppID = ((((i19 ^ 111) | i21) << 1) - ((i19 | 111) & (~i21))) % 128;
            } else {
                getsdkappid.getSDKReferenceNumber.setVisibility(8);
                getDeviceData = (getSDKAppID + 9) % 128;
            }
        } else {
            strChallengeResultKt = challengeResultTimeout.ChallengeResultKt();
            if (strChallengeResultKt != null) {
                int i110 = getDeviceData;
                int i111 = ((i110 | 13) << 1) - (((~i110) & 13) | (i110 & (-14)));
                getSDKAppID = i111 % 128;
                int i112 = i111 % 2;
                getsdkappid.getSDKReferenceNumber.setTag(Uri.parse(strChallengeResultKt));
                getsdkappid.getSDKReferenceNumber.setText(challengeResultTimeout.ChallengeStatusReceiver());
                getsdkappid.getSDKReferenceNumber.setOnClickListener(getsdkappid);
                getsdkappid.getSDKReferenceNumber.setVisibility(0);
                int i113 = getDeviceData;
                int i22 = i113 & 111;
                getSDKAppID = ((((i113 ^ 111) | i22) << 1) - ((i113 | 111) & (~i22))) % 128;
            } else {
                getsdkappid.getSDKReferenceNumber.setVisibility(8);
                getDeviceData = (getSDKAppID + 9) % 128;
            }
        }
        getsdkappid.getSDKTransactionID.setText(challengeResultTimeout.completed());
        getsdkappid.getSDKTransactionID.setOnClickListener(getsdkappid);
        int i23 = getSDKAppID;
        int i24 = i23 ^ 19;
        getDeviceData = ((((i23 & 19) | i24) << 1) - i24) % 128;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c A[PHI: r6
      0x003c: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v16 java.lang.String) binds: [B:8:0x003a, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        String strChallengeStatusHandler;
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[1];
        int i11 = getDeviceData;
        int i12 = (i11 & (-126)) | ((~i11) & 125);
        int i13 = -(-((i11 & 125) << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        getSDKAppID = i14 % 128;
        if (i14 % 2 != 0) {
            strChallengeStatusHandler = challengeResultTimeout.ChallengeStatusHandler();
            int i15 = 41 / 0;
            if (!TextUtils.isEmpty(strChallengeStatusHandler)) {
                getsdkappid.getSDKTransactionID(strChallengeStatusHandler);
                getsdkappid.getDeviceData();
                int i16 = getSDKAppID;
                getDeviceData = (((i16 ^ 73) - (~(-(-((i16 & 73) << 1))))) - 1) % 128;
            }
        } else {
            strChallengeStatusHandler = challengeResultTimeout.ChallengeStatusHandler();
            if (!TextUtils.isEmpty(strChallengeStatusHandler)) {
                getsdkappid.getSDKTransactionID(strChallengeStatusHandler);
                getsdkappid.getDeviceData();
                int i17 = getSDKAppID;
                getDeviceData = (((i17 ^ 73) - (~(-(-((i17 & 73) << 1))))) - 1) % 128;
            }
        }
        int i18 = getSDKAppID;
        int i19 = ((i18 & 125) - (~(i18 | 125))) - 1;
        getDeviceData = i19 % 128;
        if (i19 % 2 == 0) {
            int i21 = 80 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) throws Throwable {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = getSDKAppID + 10;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            return super.getMessageVersion();
        }
        super.getMessageVersion();
        throw null;
    }

    @Override // atd.at.getDeviceData
    public final String getMessageVersion() {
        return (String) getDeviceData(new Object[]{this}, 1327006645, -1327006645, System.identityHashCode(this));
    }

    @Override // atd.at.getDeviceData, android.view.View.OnClickListener
    public final void onClick(View view) {
        getDeviceData(new Object[]{this, view}, -137081326, 137081332, System.identityHashCode(this));
    }

    public getSDKAppID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // atd.at.getDeviceData
    protected final /* synthetic */ void getSDKTransactionID(getAdditionalDetails getadditionaldetails) {
        getDeviceData(new Object[]{this, getadditionaldetails}, 1885964020, -1885964015, System.identityHashCode(this));
    }

    public getSDKAppID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.getSDKReferenceNumber = (Button) findViewById(R.id.button_app);
        this.getSDKTransactionID = (Button) findViewById(R.id.button_continue);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[1];
        int i11 = getSDKAppID + 113;
        getDeviceData = i11 % 128;
        Object[] objArr2 = {getsdkappid, (ChallengeResultTimeout) getadditionaldetails};
        if (i11 % 2 == 0) {
            getDeviceData(objArr2, -309292070, 309292071, System.identityHashCode(getsdkappid));
            int i12 = 2 / 0;
        } else {
            getDeviceData(objArr2, -309292070, 309292071, System.identityHashCode(getsdkappid));
        }
        int i13 = getSDKAppID;
        int i14 = (i13 & (-42)) | ((~i13) & 41);
        int i15 = -(-((i13 & 41) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        getDeviceData = i16 % 128;
        if (i16 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void getDeviceData(ChallengeResultTimeout challengeResultTimeout) {
        getDeviceData(new Object[]{this, challengeResultTimeout}, -309292070, 309292071, System.identityHashCode(this));
    }

    public final void AuthenticationRequestParameters(ChallengeResultTimeout challengeResultTimeout) {
        getDeviceData(new Object[]{this, challengeResultTimeout}, 337895199, -337895196, System.identityHashCode(this));
    }

    @Override // atd.at.getDeviceData
    public final /* synthetic */ void getSDKAppID(getAdditionalDetails getadditionaldetails) {
        getDeviceData(new Object[]{this, getadditionaldetails}, -1076334094, 1076334096, System.identityHashCode(this));
    }

    @Override // atd.at.getDeviceData
    protected final int getSDKAppID() {
        return ((Integer) getDeviceData(new Object[]{this}, -2057467733, 2057467737, System.identityHashCode(this))).intValue();
    }
}
