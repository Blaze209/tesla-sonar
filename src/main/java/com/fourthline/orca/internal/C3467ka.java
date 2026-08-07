package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3467ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerResult f32950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3630o7.a f32951b;

    public C3467ka(DocumentScannerResult scannerResult, InterfaceC3630o7.a aVar) {
        p013kotlin.jvm.internal.s.k(scannerResult, "scannerResult");
        this.f32950a = scannerResult;
        this.f32951b = aVar;
    }

    public final InterfaceC3630o7.a a() {
        return this.f32951b;
    }

    public final DocumentScannerResult b() {
        return this.f32950a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3467ka)) {
            return false;
        }
        C3467ka c3467ka = (C3467ka) obj;
        return p013kotlin.jvm.internal.s.f(this.f32950a, c3467ka.f32950a) && p013kotlin.jvm.internal.s.f(this.f32951b, c3467ka.f32951b);
    }

    public int hashCode() {
        int iHashCode = this.f32950a.hashCode() * 31;
        InterfaceC3630o7.a aVar = this.f32951b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "DocumentProductResult(scannerResult=" + this.f32950a + ", rtfResult=" + this.f32951b + ")";
    }

    public /* synthetic */ C3467ka(DocumentScannerResult documentScannerResult, InterfaceC3630o7.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentScannerResult, (i11 & 2) != 0 ? null : aVar);
    }
}
