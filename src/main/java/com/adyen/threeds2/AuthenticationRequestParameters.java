package com.adyen.threeds2;

/* JADX INFO: loaded from: classes3.dex */
public interface AuthenticationRequestParameters {
    String getDeviceData();

    String getMessageVersion();

    String getSDKAppID();

    String getSDKEphemeralPublicKey();

    String getSDKReferenceNumber();

    String getSDKTransactionID();
}
