package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerStep;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3889u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W6 f35818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f35820c;

    public C3889u9(W6 documentAnalysisBundle) {
        p013kotlin.jvm.internal.s.k(documentAnalysisBundle, "documentAnalysisBundle");
        this.f35818a = documentAnalysisBundle;
        this.f35820c = new LinkedHashMap();
    }

    public final String a(DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        String str = this.f35819b;
        if (str != null) {
            if (step.getIndex() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        this.f35819b = string;
        this.f35818a.a(string);
        return string;
    }

    public final String b(DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        this.f35820c.put(step, string);
        return string;
    }
}
