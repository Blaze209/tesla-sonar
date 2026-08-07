package com.facebook.react.devsupport;

import com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod;
import com.facebook.react.bridge.JavaScriptModule;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001JG\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/HMRClient;", "Lcom/facebook/react/bridge/JavaScriptModule;", "", "platform", "bundleEntry", "host", "", "port", "", "isEnabled", CardPaymentMethod.PAYMENT_METHOD_TYPE, "Ljn0/h0;", "setup", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", "bundleUrl", "registerBundle", "(Ljava/lang/String;)V", "enable", "()V", "disable", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HMRClient extends JavaScriptModule {
    void disable();

    void enable();

    void registerBundle(String bundleUrl);

    void setup(String platform, String bundleEntry, String host, int port, boolean isEnabled, String scheme);
}
