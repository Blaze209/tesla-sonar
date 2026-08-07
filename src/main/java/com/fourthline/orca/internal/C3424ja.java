package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3424ja implements InterfaceC3212eb, InterfaceC3298gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W6 f32704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E6 f32705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentScannerConfig f32706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f32708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f32711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f32712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final G5 f32713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f32714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Integer f32715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC3281g0 f32716m;

    public C3424ja(W6 dataBundle, E6 deviceDataBundle, DocumentScannerConfig documentScannerConfig, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, double d11, G5 g11, boolean z16, Integer num, InterfaceC3281g0 analysisPopupStrategy) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(documentScannerConfig, "documentScannerConfig");
        p013kotlin.jvm.internal.s.k(analysisPopupStrategy, "analysisPopupStrategy");
        this.f32704a = dataBundle;
        this.f32705b = deviceDataBundle;
        this.f32706c = documentScannerConfig;
        this.f32707d = z11;
        this.f32708e = z12;
        this.f32709f = z13;
        this.f32710g = z14;
        this.f32711h = z15;
        this.f32712i = d11;
        this.f32713j = g11;
        this.f32714k = z16;
        this.f32715l = num;
        this.f32716m = analysisPopupStrategy;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public G5 a() {
        return this.f32713j;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean c() {
        return this.f32711h;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public DocumentType d() {
        return InterfaceC3212eb.a.b(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public Integer f() {
        return this.f32715l;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean h() {
        return this.f32714k;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public C3725qa i() {
        return InterfaceC3212eb.a.a(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean k() {
        return this.f32708e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public InterfaceC3281g0 m() {
        return this.f32716m;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean o() {
        return this.f32710g;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public double p() {
        return this.f32712i;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean r() {
        return this.f32709f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public DocumentScannerConfig t() {
        return this.f32706c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3298gb
    public void a(C2973Va result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        this.f32704a.a(result.a());
        this.f32705b.a(result.a().getMetadata().getMotionData());
    }
}
