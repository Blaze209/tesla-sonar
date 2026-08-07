package com.fourthline.nfc.internal;

import java.io.InputStream;
import java.security.PublicKey;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2813g implements InterfaceC2811f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PublicKey f24646a;

    public C2813g(InputStream inputStream) {
        p013kotlin.jvm.internal.s.k(inputStream, "inputStream");
        PublicKey publicKeyH = new cr0.d(inputStream).h();
        p013kotlin.jvm.internal.s.j(publicKeyH, "getPublicKey(...)");
        this.f24646a = publicKeyH;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2811f
    public PublicKey a() {
        return this.f24646a;
    }
}
