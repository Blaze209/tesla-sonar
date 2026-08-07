package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2973Va implements OD {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f29055b = DocumentScannerResult.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerResult f29056a;

    public C2973Va(DocumentScannerResult scannerResult) {
        p013kotlin.jvm.internal.s.k(scannerResult, "scannerResult");
        this.f29056a = scannerResult;
    }

    public final DocumentScannerResult a() {
        return this.f29056a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2973Va) && p013kotlin.jvm.internal.s.f(this.f29056a, ((C2973Va) obj).f29056a);
    }

    public int hashCode() {
        return this.f29056a.hashCode();
    }

    public String toString() {
        return "Result(scannerResult=" + this.f29056a + ")";
    }
}
