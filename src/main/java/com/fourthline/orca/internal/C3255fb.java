package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3255fb implements InterfaceC3212eb {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f31696l = DocumentScannerConfig.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f31697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G5 f31698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f31704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f31705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f31706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3281g0 f31707k;

    public C3255fb(DocumentScannerConfig documentScannerConfig, G5 g11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, double d11, boolean z16, Integer num, InterfaceC3281g0 analysisPopupStrategy) {
        p013kotlin.jvm.internal.s.k(documentScannerConfig, "documentScannerConfig");
        p013kotlin.jvm.internal.s.k(analysisPopupStrategy, "analysisPopupStrategy");
        this.f31697a = documentScannerConfig;
        this.f31698b = g11;
        this.f31699c = z11;
        this.f31700d = z12;
        this.f31701e = z13;
        this.f31702f = z14;
        this.f31703g = z15;
        this.f31704h = d11;
        this.f31705i = z16;
        this.f31706j = num;
        this.f31707k = analysisPopupStrategy;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public G5 a() {
        return this.f31698b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean c() {
        return this.f31703g;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public DocumentType d() {
        return InterfaceC3212eb.a.b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3255fb)) {
            return false;
        }
        C3255fb c3255fb = (C3255fb) obj;
        return p013kotlin.jvm.internal.s.f(this.f31697a, c3255fb.f31697a) && p013kotlin.jvm.internal.s.f(this.f31698b, c3255fb.f31698b) && this.f31699c == c3255fb.f31699c && this.f31700d == c3255fb.f31700d && this.f31701e == c3255fb.f31701e && this.f31702f == c3255fb.f31702f && this.f31703g == c3255fb.f31703g && Double.compare(this.f31704h, c3255fb.f31704h) == 0 && this.f31705i == c3255fb.f31705i && p013kotlin.jvm.internal.s.f(this.f31706j, c3255fb.f31706j) && p013kotlin.jvm.internal.s.f(this.f31707k, c3255fb.f31707k);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public Integer f() {
        return this.f31706j;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean h() {
        return this.f31705i;
    }

    public int hashCode() {
        int iHashCode = this.f31697a.hashCode() * 31;
        G5 g11 = this.f31698b;
        int iHashCode2 = (((((((((((((((iHashCode + (g11 == null ? 0 : g11.hashCode())) * 31) + Boolean.hashCode(this.f31699c)) * 31) + Boolean.hashCode(this.f31700d)) * 31) + Boolean.hashCode(this.f31701e)) * 31) + Boolean.hashCode(this.f31702f)) * 31) + Boolean.hashCode(this.f31703g)) * 31) + Double.hashCode(this.f31704h)) * 31) + Boolean.hashCode(this.f31705i)) * 31;
        Integer num = this.f31706j;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f31707k.hashCode();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public C3725qa i() {
        return InterfaceC3212eb.a.a(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean k() {
        return this.f31699c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public InterfaceC3281g0 m() {
        return this.f31707k;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean o() {
        return this.f31702f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public double p() {
        return this.f31704h;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean r() {
        return this.f31700d;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public DocumentScannerConfig t() {
        return this.f31697a;
    }

    public String toString() {
        return "DocumentScannerRepositoryData(documentScannerConfig=" + this.f31697a + ", issuingCountry=" + this.f31698b + ", isDocumentImageUploadEnabled=" + this.f31699c + ", isDocumentAnalysisEnabled=" + this.f31700d + ", isAutomaticStartEnabled=" + this.f31701e + ", isManualConfirmationEnabled=" + this.f31702f + ", isDynamicStepsEnabled=" + this.f31703g + ", imageCompressionPercentage=" + this.f31704h + ", useCameraX=" + this.f31705i + ", preferredVideoRecordingBitrate=" + this.f31706j + ", analysisPopupStrategy=" + this.f31707k + ")";
    }

    public /* synthetic */ C3255fb(DocumentScannerConfig documentScannerConfig, G5 g11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, double d11, boolean z16, Integer num, InterfaceC3281g0 interfaceC3281g0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentScannerConfig, (i11 & 2) != 0 ? null : g11, z11, z12, z13, (i11 & 32) != 0 ? true : z14, (i11 & 64) != 0 ? false : z15, d11, (i11 & 256) != 0 ? false : z16, num, (i11 & 1024) != 0 ? InterfaceC3281g0.a.f31907a : interfaceC3281g0);
    }
}
