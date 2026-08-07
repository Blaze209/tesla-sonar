package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2904Mc {
    public static final String a(C2899Lc c2899Lc) {
        p013kotlin.jvm.internal.s.k(c2899Lc, "<this>");
        String strC = c2899Lc.c();
        if (strC != null) {
            return strC;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The CAN number must be present by this moment.")).toString());
    }

    public static final String b(C2899Lc c2899Lc) {
        p013kotlin.jvm.internal.s.k(c2899Lc, "<this>");
        String strF = c2899Lc.f();
        if (strF != null) {
            return strF;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The PIN must be present by this moment.")).toString());
    }
}
