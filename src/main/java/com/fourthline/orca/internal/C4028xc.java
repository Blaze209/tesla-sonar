package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4028xc implements InterfaceC4071yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4104z8 f36703a;

    public C4028xc(C4104z8 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f36703a = bundle;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4071yc
    public List a() {
        return AbstractC4114zc.b(B8.a(this.f36703a), this.f36703a.o());
    }

    @Override // com.fourthline.orca.internal.InterfaceC4071yc
    public void a(X7 document) {
        p013kotlin.jvm.internal.s.k(document, "document");
        this.f36703a.a(document);
    }
}
