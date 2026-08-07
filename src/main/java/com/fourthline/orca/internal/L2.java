package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class L2 implements InterfaceC3935vC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W0 f26699b;

    public L2(List supportedTypes, W0 bundle) {
        p013kotlin.jvm.internal.s.k(supportedTypes, "supportedTypes");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f26698a = supportedTypes;
        this.f26699b = bundle;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3935vC
    public List getSupportedTypes() {
        return this.f26698a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3935vC
    public void a(BavPaymentMethod type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        this.f26699b.a(type);
    }
}
