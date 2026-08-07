package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.document.DocumentCustomizationConfig;

/* JADX INFO: loaded from: classes4.dex */
public class F7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A9 f25781a;

    public F7(XE networkConfig, C3340ha documentConfig, DocumentCustomizationConfig customizationConfig, OnProductCompleted completionBlock) {
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        p013kotlin.jvm.internal.s.k(documentConfig, "documentConfig");
        p013kotlin.jvm.internal.s.k(customizationConfig, "customizationConfig");
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        this.f25781a = new A9(networkConfig, documentConfig.e(), customizationConfig.getFlavor(), documentConfig, completionBlock, documentConfig);
    }

    public final A9 a() {
        return this.f25781a;
    }

    public final InterfaceC3051ak b() {
        return this.f25781a;
    }

    public final Ts c() {
        return new C3510la(this.f25781a.g());
    }

    public final Wf d() {
        return new Wf("NavigationDestination.Document::class.java");
    }
}
