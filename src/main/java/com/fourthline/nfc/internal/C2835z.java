package com.fourthline.nfc.internal;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2835z implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E f24749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2829t f24750b;

    public C2835z(InterfaceC2829t dataGroupStreamProvider, E delegate) {
        p013kotlin.jvm.internal.s.k(dataGroupStreamProvider, "dataGroupStreamProvider");
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.f24749a = delegate;
        this.f24750b = dataGroupStreamProvider;
    }

    @Override // com.fourthline.nfc.internal.S
    public InterfaceC2803b a() {
        return this.f24749a.a();
    }

    @Override // com.fourthline.nfc.internal.S
    public List b() {
        return this.f24749a.b();
    }

    public final C2826p c() {
        return new C2826p(a(EnumC2834y.DG1));
    }

    public final C2827q d() {
        return new C2827q(a(EnumC2834y.DG6));
    }

    public final br0.o e() {
        return new br0.o(this.f24750b.a(EnumC2834y.SOD));
    }

    private final byte[] a(EnumC2834y enumC2834y) {
        byte[] bArrC;
        InputStream inputStreamA = this.f24750b.a(enumC2834y);
        return (inputStreamA == null || (bArrC = sn0.a.c(inputStreamA)) == null) ? new byte[0] : bArrC;
    }
}
