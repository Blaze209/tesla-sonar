package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2918Pb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f27328a;

    public C2918Pb(C3811sb c3811sb) {
        this.f27328a = c3811sb;
    }

    public static List b(C3811sb c3811sb) {
        return (List) qj0.h.d(c3811sb.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return b(this.f27328a);
    }

    public static C2918Pb a(C3811sb c3811sb) {
        return new C2918Pb(c3811sb);
    }
}
