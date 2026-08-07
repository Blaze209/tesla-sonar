package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerError;
import java.util.Locale;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3545m8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(DocumentScannerError documentScannerError) {
        String strName = documentScannerError.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
