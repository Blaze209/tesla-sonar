package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2893Kb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f26564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26565b;

    public C2893Kb(C3811sb c3811sb, Provider provider) {
        this.f26564a = c3811sb;
        this.f26565b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3727qc get() {
        return a(this.f26564a, (C3438jo) this.f26565b.get());
    }

    public static C2893Kb a(C3811sb c3811sb, Provider provider) {
        return new C2893Kb(c3811sb, provider);
    }

    public static C3727qc a(C3811sb c3811sb, C3438jo c3438jo) {
        return (C3727qc) qj0.h.d(c3811sb.b(c3438jo));
    }
}
