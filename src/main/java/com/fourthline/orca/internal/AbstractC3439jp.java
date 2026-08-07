package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import java.util.Locale;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3439jp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(SelfieScannerError selfieScannerError) {
        String lowerCase = selfieScannerError.toString().toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
