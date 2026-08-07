package com.fourthline.nfc.internal;

import com.fourthline.nfc.NfcSecurityCheck;
import com.fourthline.nfc.NfcSecurityCheckStatus;
import com.fourthline.nfc.NfcSecurityCheckType;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2821k implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f24658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2824n f24659b;

    public C2821k(S nfcChipFileSystem, InterfaceC2824n chipSecurityService) {
        p013kotlin.jvm.internal.s.k(nfcChipFileSystem, "nfcChipFileSystem");
        p013kotlin.jvm.internal.s.k(chipSecurityService, "chipSecurityService");
        this.f24658a = nfcChipFileSystem;
        this.f24659b = chipSecurityService;
    }

    private final List b() {
        return this.f24658a.b();
    }

    @Override // com.fourthline.nfc.internal.T
    public NfcSecurityCheck a() throws w0 {
        try {
            if (!isSupported()) {
                throw new w0(NfcSecurityCheckType.CHIP_AUTHENTICATION);
            }
            for (InterfaceC2822l interfaceC2822l : b()) {
                this.f24659b.a(interfaceC2822l.d(), interfaceC2822l.c(), interfaceC2822l.b(), interfaceC2822l.a());
            }
            return new NfcSecurityCheck(NfcSecurityCheckType.CHIP_AUTHENTICATION, NfcSecurityCheckStatus.PASSED);
        } catch (NfcException.c unused) {
            return new NfcSecurityCheck(NfcSecurityCheckType.CHIP_AUTHENTICATION, NfcSecurityCheckStatus.FAILED);
        }
    }

    @Override // com.fourthline.nfc.internal.T
    public boolean isSupported() {
        return !b().isEmpty();
    }
}
