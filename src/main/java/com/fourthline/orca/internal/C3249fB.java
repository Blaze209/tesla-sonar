package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3249fB implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f31654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Nh f31655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f31656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3777rk.b f31657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3777rk.a f31658e;

    public C3249fB(QA title, Nh input, QA hint, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        this.f31654a = title;
        this.f31655b = input;
        this.f31656c = hint;
        this.f31657d = primaryButtonState;
        this.f31658e = secondaryButtonState;
    }

    public final C3249fB a(QA title, Nh input, QA hint, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        return new C3249fB(title, input, hint, primaryButtonState, secondaryButtonState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3249fB)) {
            return false;
        }
        C3249fB c3249fB = (C3249fB) obj;
        return p013kotlin.jvm.internal.s.f(this.f31654a, c3249fB.f31654a) && p013kotlin.jvm.internal.s.f(this.f31655b, c3249fB.f31655b) && p013kotlin.jvm.internal.s.f(this.f31656c, c3249fB.f31656c) && p013kotlin.jvm.internal.s.f(this.f31657d, c3249fB.f31657d) && p013kotlin.jvm.internal.s.f(this.f31658e, c3249fB.f31658e);
    }

    public int hashCode() {
        return (((((((this.f31654a.hashCode() * 31) + this.f31655b.hashCode()) * 31) + this.f31656c.hashCode()) * 31) + this.f31657d.hashCode()) * 31) + this.f31658e.hashCode();
    }

    public final QA p() {
        return this.f31656c;
    }

    public final Nh q() {
        return this.f31655b;
    }

    public final InterfaceC3777rk.b r() {
        return this.f31657d;
    }

    public final InterfaceC3777rk.a s() {
        return this.f31658e;
    }

    public String toString() {
        return "State(title=" + this.f31654a + ", input=" + this.f31655b + ", hint=" + this.f31656c + ", primaryButtonState=" + this.f31657d + ", secondaryButtonState=" + this.f31658e + ")";
    }

    public static /* synthetic */ C3249fB a(C3249fB c3249fB, QA qa2, Nh nh2, QA qa3, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3249fB.f31654a;
        }
        if ((i11 & 2) != 0) {
            nh2 = c3249fB.f31655b;
        }
        if ((i11 & 4) != 0) {
            qa3 = c3249fB.f31656c;
        }
        if ((i11 & 8) != 0) {
            bVar = c3249fB.f31657d;
        }
        if ((i11 & 16) != 0) {
            aVar = c3249fB.f31658e;
        }
        InterfaceC3777rk.a aVar2 = aVar;
        QA qa4 = qa3;
        return c3249fB.a(qa2, nh2, qa4, bVar, aVar2);
    }

    public final QA a() {
        return this.f31654a;
    }
}
