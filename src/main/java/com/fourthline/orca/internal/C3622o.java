package com.fourthline.orca.internal;

import java.util.Locale;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3622o implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f34028a;

    public C3622o(C3152d c3152d) {
        this.f34028a = c3152d;
    }

    public static Locale b(C3152d c3152d) {
        return (Locale) qj0.h.d(c3152d.j());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Locale get() {
        return b(this.f34028a);
    }

    public static C3622o a(C3152d c3152d) {
        return new C3622o(c3152d);
    }
}
