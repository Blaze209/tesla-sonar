package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.nfc.NfcScannerSecurityKey;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(NfcScannerSecurityKey securityKey) {
        String str;
        super("nfc");
        p013kotlin.jvm.internal.s.k(securityKey, "securityKey");
        this.f24606a = AnalyticsContext.Scanner;
        this.f24607b = "iglu:com.fourthline.sdk/scanner/jsonschema/1-0-0";
        if ((securityKey instanceof NfcScannerSecurityKey.BacKey) || (securityKey instanceof NfcScannerSecurityKey.PaceKey)) {
            str = "mrtd";
        } else {
            if (!(securityKey instanceof NfcScannerSecurityKey.BapKey)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "idl";
        }
        set("security_key_type", str);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f24606a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f24607b;
    }
}
