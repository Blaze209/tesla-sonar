package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;

/* JADX INFO: loaded from: classes4.dex */
public final class Gz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26034e = DocumentScannerStepResult.$stable | DocumentScannerStep.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentType f26035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentScannerStep f26037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DocumentScannerStepResult f26038d;

    public Gz(DocumentType documentType, String str, DocumentScannerStep scannerStep, DocumentScannerStepResult stepResult) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
        this.f26035a = documentType;
        this.f26036b = str;
        this.f26037c = scannerStep;
        this.f26038d = stepResult;
    }

    public final DocumentType a() {
        return this.f26035a;
    }

    public final String b() {
        return this.f26036b;
    }

    public final DocumentScannerStep c() {
        return this.f26037c;
    }

    public final DocumentScannerStepResult d() {
        return this.f26038d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gz)) {
            return false;
        }
        Gz gz2 = (Gz) obj;
        return this.f26035a == gz2.f26035a && p013kotlin.jvm.internal.s.f(this.f26036b, gz2.f26036b) && p013kotlin.jvm.internal.s.f(this.f26037c, gz2.f26037c) && p013kotlin.jvm.internal.s.f(this.f26038d, gz2.f26038d);
    }

    public int hashCode() {
        int iHashCode = this.f26035a.hashCode() * 31;
        String str = this.f26036b;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26037c.hashCode()) * 31) + this.f26038d.hashCode();
    }

    public String toString() {
        return "StepResultConfirmation(documentType=" + this.f26035a + ", issuingCountry=" + this.f26036b + ", scannerStep=" + this.f26037c + ", stepResult=" + this.f26038d + ")";
    }
}
