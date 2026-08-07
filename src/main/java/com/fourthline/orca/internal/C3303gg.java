package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3303gg implements InterfaceC3346hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f32013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2899Lc f32014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3257fd f32015c;

    public C3303gg(wn0.a workflowIdProvider, C2899Lc bundle, C3257fd eidFlowConfig) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(eidFlowConfig, "eidFlowConfig");
        this.f32013a = workflowIdProvider;
        this.f32014b = bundle;
        this.f32015c = eidFlowConfig;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3346hg
    public String a() {
        return (String) this.f32013a.invoke();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3346hg
    public boolean b() {
        return this.f32014b.h();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3346hg
    public void c() {
        C2899Lc c2899Lc = this.f32014b;
        c2899Lc.b(true);
        c2899Lc.a(EnumC2894Kc.Pin);
        c2899Lc.c(null);
        c2899Lc.b((String) null);
        c2899Lc.a((String) null);
        c2899Lc.d(null);
        c2899Lc.a((List) null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3346hg
    public C3257fd d() {
        return this.f32015c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3346hg
    public List e() {
        List listA = this.f32014b.a();
        return listA == null ? p013kotlin.collections.v.m() : listA;
    }
}
