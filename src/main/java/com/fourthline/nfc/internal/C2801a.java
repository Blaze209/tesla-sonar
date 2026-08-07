package com.fourthline.nfc.internal;

import com.fourthline.nfc.NfcSecurityCheck;
import com.fourthline.nfc.NfcSecurityCheckStatus;
import com.fourthline.nfc.NfcSecurityCheckType;
import java.security.SecureRandom;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2801a implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2807d f24620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f24621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2824n f24622c;

    public C2801a(InterfaceC2807d responseVerifier, S nfcChipFileSystem, InterfaceC2824n chipSecurityService) {
        p013kotlin.jvm.internal.s.k(responseVerifier, "responseVerifier");
        p013kotlin.jvm.internal.s.k(nfcChipFileSystem, "nfcChipFileSystem");
        p013kotlin.jvm.internal.s.k(chipSecurityService, "chipSecurityService");
        this.f24620a = responseVerifier;
        this.f24621b = nfcChipFileSystem;
        this.f24622c = chipSecurityService;
    }

    @Override // com.fourthline.nfc.internal.T
    public NfcSecurityCheck a() throws w0 {
        try {
            InterfaceC2803b interfaceC2803bA = this.f24621b.a();
            if (interfaceC2803bA == null) {
                throw new w0(NfcSecurityCheckType.ACTIVE_AUTHENTICATION);
            }
            F0.a();
            byte[] bArr = new byte[8];
            new SecureRandom().nextBytes(bArr);
            return new NfcSecurityCheck(NfcSecurityCheckType.ACTIVE_AUTHENTICATION, this.f24620a.a(interfaceC2803bA.a(), interfaceC2803bA.b(), interfaceC2803bA.c(), bArr, this.f24622c.a(interfaceC2803bA.a(), interfaceC2803bA.c(), interfaceC2803bA.b(), bArr)) ? NfcSecurityCheckStatus.PASSED : NfcSecurityCheckStatus.FAILED);
        } catch (NfcException.a unused) {
            return new NfcSecurityCheck(NfcSecurityCheckType.ACTIVE_AUTHENTICATION, NfcSecurityCheckStatus.FAILED);
        }
    }

    @Override // com.fourthline.nfc.internal.T
    public boolean isSupported() {
        return this.f24621b.a() != null;
    }

    public /* synthetic */ C2801a(InterfaceC2807d interfaceC2807d, S s11, InterfaceC2824n interfaceC2824n, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? AbstractC2809e.a() : interfaceC2807d, s11, interfaceC2824n);
    }
}
