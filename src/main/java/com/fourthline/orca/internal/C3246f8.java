package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3246f8 implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f31635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Nh f31636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Nh f31637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Nh f31638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3033a8 f31639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final QA f31640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3161d8 f31641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3777rk.b f31642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3903uh f31643i;

    public C3246f8(QA title, Nh documentNumberInputViewState, Nh expiryDateInputViewState, Nh birthDateInputViewState, C3033a8 c3033a8, QA qa2, C3161d8 backButtonState, InterfaceC3777rk.b nextButtonState, InterfaceC3903uh calendarImageSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(documentNumberInputViewState, "documentNumberInputViewState");
        p013kotlin.jvm.internal.s.k(expiryDateInputViewState, "expiryDateInputViewState");
        p013kotlin.jvm.internal.s.k(birthDateInputViewState, "birthDateInputViewState");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(calendarImageSource, "calendarImageSource");
        this.f31635a = title;
        this.f31636b = documentNumberInputViewState;
        this.f31637c = expiryDateInputViewState;
        this.f31638d = birthDateInputViewState;
        this.f31639e = c3033a8;
        this.f31640f = qa2;
        this.f31641g = backButtonState;
        this.f31642h = nextButtonState;
        this.f31643i = calendarImageSource;
    }

    public final C3246f8 a(QA title, Nh documentNumberInputViewState, Nh expiryDateInputViewState, Nh birthDateInputViewState, C3033a8 c3033a8, QA qa2, C3161d8 backButtonState, InterfaceC3777rk.b nextButtonState, InterfaceC3903uh calendarImageSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(documentNumberInputViewState, "documentNumberInputViewState");
        p013kotlin.jvm.internal.s.k(expiryDateInputViewState, "expiryDateInputViewState");
        p013kotlin.jvm.internal.s.k(birthDateInputViewState, "birthDateInputViewState");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(calendarImageSource, "calendarImageSource");
        return new C3246f8(title, documentNumberInputViewState, expiryDateInputViewState, birthDateInputViewState, c3033a8, qa2, backButtonState, nextButtonState, calendarImageSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3246f8)) {
            return false;
        }
        C3246f8 c3246f8 = (C3246f8) obj;
        return p013kotlin.jvm.internal.s.f(this.f31635a, c3246f8.f31635a) && p013kotlin.jvm.internal.s.f(this.f31636b, c3246f8.f31636b) && p013kotlin.jvm.internal.s.f(this.f31637c, c3246f8.f31637c) && p013kotlin.jvm.internal.s.f(this.f31638d, c3246f8.f31638d) && p013kotlin.jvm.internal.s.f(this.f31639e, c3246f8.f31639e) && p013kotlin.jvm.internal.s.f(this.f31640f, c3246f8.f31640f) && p013kotlin.jvm.internal.s.f(this.f31641g, c3246f8.f31641g) && p013kotlin.jvm.internal.s.f(this.f31642h, c3246f8.f31642h) && p013kotlin.jvm.internal.s.f(this.f31643i, c3246f8.f31643i);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f31635a.hashCode() * 31) + this.f31636b.hashCode()) * 31) + this.f31637c.hashCode()) * 31) + this.f31638d.hashCode()) * 31;
        C3033a8 c3033a8 = this.f31639e;
        int iHashCode2 = (iHashCode + (c3033a8 == null ? 0 : c3033a8.hashCode())) * 31;
        QA qa2 = this.f31640f;
        return ((((((iHashCode2 + (qa2 != null ? qa2.hashCode() : 0)) * 31) + this.f31641g.hashCode()) * 31) + this.f31642h.hashCode()) * 31) + this.f31643i.hashCode();
    }

    public final C3161d8 p() {
        return this.f31641g;
    }

    public final Nh q() {
        return this.f31638d;
    }

    public final InterfaceC3903uh r() {
        return this.f31643i;
    }

    public final Nh s() {
        return this.f31636b;
    }

    public final C3033a8 t() {
        return this.f31639e;
    }

    public String toString() {
        return "State(title=" + this.f31635a + ", documentNumberInputViewState=" + this.f31636b + ", expiryDateInputViewState=" + this.f31637c + ", birthDateInputViewState=" + this.f31638d + ", expiryDateCheckboxState=" + this.f31639e + ", hint=" + this.f31640f + ", backButtonState=" + this.f31641g + ", nextButtonState=" + this.f31642h + ", calendarImageSource=" + this.f31643i + ")";
    }

    public final Nh u() {
        return this.f31637c;
    }

    public final QA v() {
        return this.f31640f;
    }

    public final InterfaceC3777rk.b w() {
        return this.f31642h;
    }

    public static /* synthetic */ C3246f8 a(C3246f8 c3246f8, QA qa2, Nh nh2, Nh nh3, Nh nh4, C3033a8 c3033a8, QA qa3, C3161d8 c3161d8, InterfaceC3777rk.b bVar, InterfaceC3903uh interfaceC3903uh, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3246f8.f31635a;
        }
        if ((i11 & 2) != 0) {
            nh2 = c3246f8.f31636b;
        }
        if ((i11 & 4) != 0) {
            nh3 = c3246f8.f31637c;
        }
        if ((i11 & 8) != 0) {
            nh4 = c3246f8.f31638d;
        }
        if ((i11 & 16) != 0) {
            c3033a8 = c3246f8.f31639e;
        }
        if ((i11 & 32) != 0) {
            qa3 = c3246f8.f31640f;
        }
        if ((i11 & 64) != 0) {
            c3161d8 = c3246f8.f31641g;
        }
        if ((i11 & 128) != 0) {
            bVar = c3246f8.f31642h;
        }
        if ((i11 & 256) != 0) {
            interfaceC3903uh = c3246f8.f31643i;
        }
        InterfaceC3777rk.b bVar2 = bVar;
        InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
        QA qa4 = qa3;
        C3161d8 c3161d9 = c3161d8;
        C3033a8 c3033a9 = c3033a8;
        Nh nh5 = nh3;
        return c3246f8.a(qa2, nh2, nh5, nh4, c3033a9, qa4, c3161d9, bVar2, interfaceC3903uh2);
    }

    public final QA a() {
        return this.f31635a;
    }
}
