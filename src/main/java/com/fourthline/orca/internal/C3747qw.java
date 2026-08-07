package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3747qw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f34916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34917b;

    public C3747qw(C3489kw c3489kw, Provider provider) {
        this.f34916a = c3489kw;
        this.f34917b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Vu get() {
        return a(this.f34916a, (InterfaceC3852tF) this.f34917b.get());
    }

    public static C3747qw a(C3489kw c3489kw, Provider provider) {
        return new C3747qw(c3489kw, provider);
    }

    public static Vu a(C3489kw c3489kw, InterfaceC3852tF interfaceC3852tF) {
        return (Vu) qj0.h.d(c3489kw.a(interfaceC3852tF));
    }
}
