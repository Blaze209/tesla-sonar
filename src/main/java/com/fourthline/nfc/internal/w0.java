package com.fourthline.nfc.internal;

import com.fourthline.nfc.NfcSecurityCheckType;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcSecurityCheckType f24729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(NfcSecurityCheckType type) {
        super(type.name());
        p013kotlin.jvm.internal.s.k(type, "type");
        this.f24729a = type;
    }
}
