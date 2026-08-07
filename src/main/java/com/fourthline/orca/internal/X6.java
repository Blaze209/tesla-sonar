package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X6 {
    public static final String a(W6 w11) {
        p013kotlin.jvm.internal.s.k(w11, "<this>");
        String strD = w11.d();
        if (strD != null) {
            return strD;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The documentAnalysisId must be present by this moment.")).toString());
    }

    public static final boolean b(W6 w11) {
        p013kotlin.jvm.internal.s.k(w11, "<this>");
        return w11 instanceof C4104z8;
    }
}
