package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3342hc implements InterfaceC3299gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4104z8 f32271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32272b;

    public C3342hc(C4104z8 bundle, List supportedCountries) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
        this.f32271a = bundle;
        this.f32272b = supportedCountries;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3299gc
    public G5 a() {
        return B8.a(this.f32271a);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3299gc
    public List b() {
        return X7.f29693e.a(B8.a(this.f32271a), this.f32272b);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3299gc
    public void a(X7 document) {
        p013kotlin.jvm.internal.s.k(document, "document");
        this.f32271a.a(document);
        this.f32271a.a((DocumentScannerResult) null);
        this.f32271a.a((InterfaceC3630o7.a) null);
        this.f32271a.a((Am) null);
    }
}
