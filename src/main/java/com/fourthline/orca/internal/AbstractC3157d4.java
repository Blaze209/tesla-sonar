package com.fourthline.orca.internal;

import java.text.Normalizer;
import java.util.Locale;

/* JADX INFO: renamed from: com.fourthline.orca.internal.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3157d4 {
    public static final String a(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        String lowerCase = a((CharSequence) p013kotlin.text.t.F1(str).toString()).toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final String a(CharSequence charSequence) {
        p013kotlin.text.q qVar = new p013kotlin.text.q("\\p{InCombiningDiacriticalMarks}+");
        String strNormalize = Normalizer.normalize(charSequence, Normalizer.Form.NFD);
        p013kotlin.jvm.internal.s.j(strNormalize, "normalize(...)");
        return qVar.j(strNormalize, "");
    }
}
