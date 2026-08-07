package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2873Gb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f25936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25937b;

    public C2873Gb(C3811sb c3811sb, Provider provider) {
        this.f25936a = c3811sb;
        this.f25937b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3299gc get() {
        return a(this.f25936a, (C4104z8) this.f25937b.get());
    }

    public static C2873Gb a(C3811sb c3811sb, Provider provider) {
        return new C2873Gb(c3811sb, provider);
    }

    public static InterfaceC3299gc a(C3811sb c3811sb, C4104z8 c4104z8) {
        return (InterfaceC3299gc) qj0.h.d(c3811sb.a(c4104z8));
    }
}
