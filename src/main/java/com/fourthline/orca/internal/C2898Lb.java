package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2898Lb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f26755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26756b;

    public C2898Lb(C3811sb c3811sb, Provider provider) {
        this.f26755a = c3811sb;
        this.f26756b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4071yc get() {
        return a(this.f26755a, (C4104z8) this.f26756b.get());
    }

    public static C2898Lb a(C3811sb c3811sb, Provider provider) {
        return new C2898Lb(c3811sb, provider);
    }

    public static InterfaceC4071yc a(C3811sb c3811sb, C4104z8 c4104z8) {
        return (InterfaceC4071yc) qj0.h.d(c3811sb.b(c4104z8));
    }
}
