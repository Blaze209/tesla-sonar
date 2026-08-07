package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3931v8 implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3085bb f36037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4104z8 f36038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.a f36039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.a f36040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3546m9 f36041f;

    public C3931v8(boolean z11, C3085bb flowConfig, C4104z8 dataBundle, wn0.a skipDocumentDetailsUseCase, wn0.a skipNfcScannerUseCase, InterfaceC3546m9 flowRepository) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(skipDocumentDetailsUseCase, "skipDocumentDetailsUseCase");
        p013kotlin.jvm.internal.s.k(skipNfcScannerUseCase, "skipNfcScannerUseCase");
        p013kotlin.jvm.internal.s.k(flowRepository, "flowRepository");
        this.f36036a = z11;
        this.f36037b = flowConfig;
        this.f36038c = dataBundle;
        this.f36039d = skipDocumentDetailsUseCase;
        this.f36040e = skipNfcScannerUseCase;
        this.f36041f = flowRepository;
    }

    private final boolean b() {
        return c() && ((Boolean) this.f36040e.invoke()).booleanValue();
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        if (this.f36037b.b().getEnabled() && this.f36038c.c() == null) {
            return p013kotlin.collections.v.e(C3802s8.f35215a);
        }
        if (this.f36041f.j()) {
            return p013kotlin.collections.v.e(b() ? C3759r8.f34995a : new C3888u8(null, 1, null));
        }
        if (((Boolean) this.f36039d.invoke()).booleanValue()) {
            return p013kotlin.collections.v.e(b() ? C3759r8.f34995a : new C3888u8(null, 1, null));
        }
        return p013kotlin.collections.v.e(C3845t8.f35581a);
    }

    public boolean c() {
        return this.f36036a;
    }
}
