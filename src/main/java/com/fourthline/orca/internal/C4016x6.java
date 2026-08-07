package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4016x6 implements W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DocumentScannerResult f36673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3630o7.a f36676d;

    public C4016x6(DocumentScannerResult documentScannerResult, boolean z11, String str, InterfaceC3630o7.a aVar) {
        this.f36673a = documentScannerResult;
        this.f36674b = z11;
        this.f36675c = str;
        this.f36676d = aVar;
    }

    @Override // com.fourthline.orca.internal.W6
    public void a(DocumentScannerResult documentScannerResult) {
        this.f36673a = documentScannerResult;
    }

    @Override // com.fourthline.orca.internal.W6
    public DocumentScannerResult b() {
        return this.f36673a;
    }

    @Override // com.fourthline.orca.internal.W6
    public InterfaceC3630o7.a c() {
        return this.f36676d;
    }

    @Override // com.fourthline.orca.internal.W6
    public String d() {
        return this.f36675c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4016x6)) {
            return false;
        }
        C4016x6 c4016x6 = (C4016x6) obj;
        return p013kotlin.jvm.internal.s.f(this.f36673a, c4016x6.f36673a) && this.f36674b == c4016x6.f36674b && p013kotlin.jvm.internal.s.f(this.f36675c, c4016x6.f36675c) && p013kotlin.jvm.internal.s.f(this.f36676d, c4016x6.f36676d);
    }

    public int hashCode() {
        DocumentScannerResult documentScannerResult = this.f36673a;
        int iHashCode = (((documentScannerResult == null ? 0 : documentScannerResult.hashCode()) * 31) + Boolean.hashCode(this.f36674b)) * 31;
        String str = this.f36675c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC3630o7.a aVar = this.f36676d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "DefaultDocumentAnalysisDataBundle(documentScannerResult=" + this.f36673a + ", isAutoDetectResultAvailable=" + this.f36674b + ", documentAnalysisId=" + this.f36675c + ", documentAnalysisResult=" + this.f36676d + ")";
    }

    @Override // com.fourthline.orca.internal.W6
    public boolean a() {
        return this.f36674b;
    }

    @Override // com.fourthline.orca.internal.W6
    public void a(String str) {
        this.f36675c = str;
    }

    @Override // com.fourthline.orca.internal.W6
    public void a(InterfaceC3630o7.a aVar) {
        this.f36676d = aVar;
    }

    public /* synthetic */ C4016x6(DocumentScannerResult documentScannerResult, boolean z11, String str, InterfaceC3630o7.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : documentScannerResult, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : aVar);
    }
}
