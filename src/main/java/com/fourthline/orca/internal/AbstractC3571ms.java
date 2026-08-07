package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3571ms {
    public static final InterfaceC3272fs a(C3528ls c3528ls) {
        p013kotlin.jvm.internal.s.k(c3528ls, "<this>");
        InterfaceC3272fs interfaceC3272fsA = c3528ls.a();
        if (interfaceC3272fsA != null) {
            return interfaceC3272fsA;
        }
        throw new IllegalStateException("FL developer error. Poa File is requested when it's not available.");
    }
}
