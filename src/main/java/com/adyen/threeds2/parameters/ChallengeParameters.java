package com.adyen.threeds2.parameters;

import android.content.Context;
import androidx.annotation.NonNull;
import atd.j.getSDKAppID;
import atd.json.getMessageVersion;
import jn0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeParameters {
    private String mAcsRefNumber;
    private String mAcsSignedContent;
    private String mAcsTransactionID;
    private String mThreeDSRequestorAppURL;
    private String mThreeDSServerTransactionID;

    @NonNull
    @e
    public static String getEmbeddedRequestorAppURL(Context context) {
        return "adyen3ds2://" + context.getPackageName();
    }

    public final String get3DSServerTransactionID() {
        return this.mThreeDSServerTransactionID;
    }

    public final String getAcsRefNumber() {
        return this.mAcsRefNumber;
    }

    public final String getAcsSignedContent() {
        return this.mAcsSignedContent;
    }

    public final String getAcsTransactionID() {
        return this.mAcsTransactionID;
    }

    public final String getThreeDSRequestorAppURL() {
        return this.mThreeDSRequestorAppURL;
    }

    public final void set3DSServerTransactionID(String str) {
        this.mThreeDSServerTransactionID = str;
    }

    public final void setAcsRefNumber(String str) {
        this.mAcsRefNumber = str;
    }

    public final void setAcsSignedContent(String str) {
        this.mAcsSignedContent = str;
    }

    public final void setAcsTransactionID(String str) {
        this.mAcsTransactionID = str;
    }

    public final void setThreeDSRequestorAppURL(String str) throws Throwable {
        if (str != null && !getSDKAppID.getSDKTransactionID(str)) {
            getMessageVersion.getSDKReferenceNumber.getDeviceData(ChallengeParameters.class.getSimpleName(), "Provided threeDSRequestorAppURL is not complete URL.");
            return;
        }
        if (!getSDKAppID.AuthenticationRequestParameters(str)) {
            getMessageVersion.getSDKReferenceNumber.getSDKTransactionID(ChallengeParameters.class.getSimpleName(), "Provided threeDSRequestorAppURL is not an Android App Link. This may negatively impact your 3DS2 challenge performance. For better performance it is strongly recommended to provide threeDSRequestorAppUrl in Android App Link format.");
        }
        this.mThreeDSRequestorAppURL = str;
    }
}
