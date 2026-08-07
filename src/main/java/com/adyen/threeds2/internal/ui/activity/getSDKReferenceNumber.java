package com.adyen.threeds2.internal.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.c;
import androidx.core.view.m;
import atd.a.ChallengeResultError;
import atd.aq.getSDKTransactionID;
import com.adyen.threeds2.customization.UiCustomization;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
abstract class getSDKReferenceNumber extends c {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKAppID = 1;

    getSDKReferenceNumber() {
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = ~(i14 | i11);
        int i16 = ~i13;
        int i17 = ~(i16 | i11);
        int i18 = (i11 * (-711)) + (i12 * 713) + ((i15 | i17) * (-712)) + (((~(i11 | i12 | i13)) | (~(i14 | i16 | i11))) * (-712)) + ((i14 | i17) * 712);
        if (i18 == 1) {
            getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
            int i19 = getSDKAppID;
            int i21 = ((i19 ^ 103) | (i19 & 103)) << 1;
            int i22 = -(((~i19) & 103) | (i19 & (-104)));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            AuthenticationRequestParameters = i23 % 128;
            if (i23 % 2 != 0) {
                getsdkreferencenumber.getWindow().setFlags(2895, 27617);
            } else {
                getsdkreferencenumber.getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
            }
            return null;
        }
        if (i18 == 2) {
            return getSDKAppID(objArr);
        }
        getSDKReferenceNumber getsdkreferencenumber2 = (getSDKReferenceNumber) objArr[0];
        ChallengeResultError challengeResultError = (ChallengeResultError) objArr[1];
        int i24 = getSDKAppID;
        int i25 = i24 & 77;
        int i26 = (i24 ^ 77) | i25;
        AuthenticationRequestParameters = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
        UiCustomization sDKAppID = challengeResultError.getSDKAppID();
        if (sDKAppID == null) {
            int i27 = getSDKAppID;
            int i28 = i27 ^ 25;
            AuthenticationRequestParameters = (((((i27 & 25) | i28) << 1) - (~(-i28))) - 1) % 128;
            return null;
        }
        atd.aq.getSDKReferenceNumber getsdkreferencenumber3 = new atd.aq.getSDKReferenceNumber(getsdkreferencenumber2.getWindow(), new getSDKTransactionID(sDKAppID));
        int i29 = getSDKAppID;
        int i31 = (i29 | 25) << 1;
        int i32 = -(((~i29) & 25) | (i29 & (-26)));
        AuthenticationRequestParameters = ((i31 & i32) + (i32 | i31)) % 128;
        return getsdkreferencenumber3;
    }

    private void getSDKReferenceNumber() {
        getSDKAppID(new Object[]{this}, 243678865, -243678864, System.identityHashCode(this));
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    abstract ChallengeResultError getSDKAppID();

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 89;
        getSDKAppID = ((((i11 ^ 89) | i12) << 1) - ((i11 | 89) & (~i12))) % 128;
        atd.aq.getSDKReferenceNumber getsdkreferencenumber = (atd.aq.getSDKReferenceNumber) getSDKAppID(new Object[]{this, getSDKAppID()}, 1370654894, -1370654894, System.identityHashCode(this));
        if (getsdkreferencenumber != null) {
            AuthenticationRequestParameters = (getSDKAppID + 111) % 128;
            getSDKAppID(new Object[]{this, getsdkreferencenumber}, -786801250, 786801252, System.identityHashCode(this));
            AuthenticationRequestParameters = (getSDKAppID + 39) % 128;
        }
        super.onCreate(bundle);
        getSDKAppID(new Object[]{this}, 243678865, -243678864, System.identityHashCode(this));
        int i13 = AuthenticationRequestParameters;
        int i14 = (i13 ^ 105) + ((i13 & 105) << 1);
        getSDKAppID = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 63 / 0;
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private atd.aq.getSDKReferenceNumber getSDKReferenceNumber(ChallengeResultError challengeResultError) {
        return (atd.aq.getSDKReferenceNumber) getSDKAppID(new Object[]{this, challengeResultError}, 1370654894, -1370654894, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        atd.aq.getSDKReferenceNumber getsdkreferencenumber2 = (atd.aq.getSDKReferenceNumber) objArr[1];
        int i11 = getSDKAppID;
        int i12 = i11 & 21;
        int i13 = (i11 | 21) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 == 0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getsdkreferencenumber);
            if (layoutInflaterFrom.getFactory() == null) {
                int i16 = getSDKAppID;
                AuthenticationRequestParameters = ((i16 & 3) + (i16 | 3)) % 128;
                m.a(layoutInflaterFrom, getsdkreferencenumber2);
                int i17 = AuthenticationRequestParameters;
                getSDKAppID = (((i17 ^ 101) - (~((i17 & 101) << 1))) - 1) % 128;
            }
            System.identityHashCode(getsdkreferencenumber);
            System.identityHashCode(getsdkreferencenumber);
            return null;
        }
        LayoutInflater.from(getsdkreferencenumber).getFactory();
        throw null;
    }

    private void getSDKAppID(atd.aq.getSDKReferenceNumber getsdkreferencenumber) {
        getSDKAppID(new Object[]{this, getsdkreferencenumber}, -786801250, 786801252, System.identityHashCode(this));
    }
}
