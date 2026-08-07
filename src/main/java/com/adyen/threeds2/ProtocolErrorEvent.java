package com.adyen.threeds2;

/* JADX INFO: loaded from: classes3.dex */
public interface ProtocolErrorEvent {
    String getAdditionalDetails();

    ErrorMessage getErrorMessage();

    String getSDKTransactionID();
}
