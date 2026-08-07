package com.fourthline.nfc.internal;

import com.fourthline.nfc.NfcSecurityCheck;
import com.fourthline.nfc.NfcSecurityCheckStatus;
import com.fourthline.nfc.NfcSecurityCheckType;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f24751a;

    public z0(wn0.a paceCamPerformedProvider) {
        p013kotlin.jvm.internal.s.k(paceCamPerformedProvider, "paceCamPerformedProvider");
        this.f24751a = paceCamPerformedProvider;
    }

    @Override // com.fourthline.nfc.internal.T
    public NfcSecurityCheck a() throws w0 {
        if (((Boolean) this.f24751a.invoke()).booleanValue()) {
            return new NfcSecurityCheck(NfcSecurityCheckType.PACE_CAM, NfcSecurityCheckStatus.PASSED);
        }
        throw new w0(NfcSecurityCheckType.PACE_CAM);
    }

    @Override // com.fourthline.nfc.internal.T
    public boolean isSupported() {
        return ((Boolean) this.f24751a.invoke()).booleanValue();
    }
}
