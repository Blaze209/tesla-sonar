package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B8 {
    public static final G5 a(C4104z8 c4104z8) {
        p013kotlin.jvm.internal.s.k(c4104z8, "<this>");
        G5 g5H = c4104z8.h();
        if (g5H != null) {
            return g5H;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The issuing country must be present by this moment.")).toString());
    }

    public static final X7 b(C4104z8 c4104z8) {
        p013kotlin.jvm.internal.s.k(c4104z8, "<this>");
        X7 x7O = c4104z8.o();
        if (x7O != null) {
            return x7O;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The selected document must be present by this moment.")).toString());
    }
}
