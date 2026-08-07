package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f25529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K0 f25530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Nh f25531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Nh f25532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Nh f25533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Nh f25534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Nh f25535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3777rk.b f25536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3777rk.a f25537i;

    public E(QA title, K0 residencyPicker, Nh postalCodeInputViewState, Nh streetNumberInputViewState, Nh streetNumberSuffixInputViewState, Nh streetInputViewState, Nh cityInputViewState, InterfaceC3777rk.b nextButtonState, InterfaceC3777rk.a backButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(residencyPicker, "residencyPicker");
        p013kotlin.jvm.internal.s.k(postalCodeInputViewState, "postalCodeInputViewState");
        p013kotlin.jvm.internal.s.k(streetNumberInputViewState, "streetNumberInputViewState");
        p013kotlin.jvm.internal.s.k(streetNumberSuffixInputViewState, "streetNumberSuffixInputViewState");
        p013kotlin.jvm.internal.s.k(streetInputViewState, "streetInputViewState");
        p013kotlin.jvm.internal.s.k(cityInputViewState, "cityInputViewState");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        this.f25529a = title;
        this.f25530b = residencyPicker;
        this.f25531c = postalCodeInputViewState;
        this.f25532d = streetNumberInputViewState;
        this.f25533e = streetNumberSuffixInputViewState;
        this.f25534f = streetInputViewState;
        this.f25535g = cityInputViewState;
        this.f25536h = nextButtonState;
        this.f25537i = backButtonState;
    }

    public final E a(QA title, K0 residencyPicker, Nh postalCodeInputViewState, Nh streetNumberInputViewState, Nh streetNumberSuffixInputViewState, Nh streetInputViewState, Nh cityInputViewState, InterfaceC3777rk.b nextButtonState, InterfaceC3777rk.a backButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(residencyPicker, "residencyPicker");
        p013kotlin.jvm.internal.s.k(postalCodeInputViewState, "postalCodeInputViewState");
        p013kotlin.jvm.internal.s.k(streetNumberInputViewState, "streetNumberInputViewState");
        p013kotlin.jvm.internal.s.k(streetNumberSuffixInputViewState, "streetNumberSuffixInputViewState");
        p013kotlin.jvm.internal.s.k(streetInputViewState, "streetInputViewState");
        p013kotlin.jvm.internal.s.k(cityInputViewState, "cityInputViewState");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        return new E(title, residencyPicker, postalCodeInputViewState, streetNumberInputViewState, streetNumberSuffixInputViewState, streetInputViewState, cityInputViewState, nextButtonState, backButtonState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e11 = (E) obj;
        return p013kotlin.jvm.internal.s.f(this.f25529a, e11.f25529a) && p013kotlin.jvm.internal.s.f(this.f25530b, e11.f25530b) && p013kotlin.jvm.internal.s.f(this.f25531c, e11.f25531c) && p013kotlin.jvm.internal.s.f(this.f25532d, e11.f25532d) && p013kotlin.jvm.internal.s.f(this.f25533e, e11.f25533e) && p013kotlin.jvm.internal.s.f(this.f25534f, e11.f25534f) && p013kotlin.jvm.internal.s.f(this.f25535g, e11.f25535g) && p013kotlin.jvm.internal.s.f(this.f25536h, e11.f25536h) && p013kotlin.jvm.internal.s.f(this.f25537i, e11.f25537i);
    }

    public int hashCode() {
        return (((((((((((((((this.f25529a.hashCode() * 31) + this.f25530b.hashCode()) * 31) + this.f25531c.hashCode()) * 31) + this.f25532d.hashCode()) * 31) + this.f25533e.hashCode()) * 31) + this.f25534f.hashCode()) * 31) + this.f25535g.hashCode()) * 31) + this.f25536h.hashCode()) * 31) + this.f25537i.hashCode();
    }

    public final InterfaceC3777rk.a p() {
        return this.f25537i;
    }

    public final Nh q() {
        return this.f25535g;
    }

    public final InterfaceC3777rk.b r() {
        return this.f25536h;
    }

    public final Nh s() {
        return this.f25531c;
    }

    public final K0 t() {
        return this.f25530b;
    }

    public String toString() {
        return "State(title=" + this.f25529a + ", residencyPicker=" + this.f25530b + ", postalCodeInputViewState=" + this.f25531c + ", streetNumberInputViewState=" + this.f25532d + ", streetNumberSuffixInputViewState=" + this.f25533e + ", streetInputViewState=" + this.f25534f + ", cityInputViewState=" + this.f25535g + ", nextButtonState=" + this.f25536h + ", backButtonState=" + this.f25537i + ")";
    }

    public final Nh u() {
        return this.f25534f;
    }

    public final Nh v() {
        return this.f25532d;
    }

    public final Nh w() {
        return this.f25533e;
    }

    public static /* synthetic */ E a(E e11, QA qa2, K0 k11, Nh nh2, Nh nh3, Nh nh4, Nh nh5, Nh nh6, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = e11.f25529a;
        }
        if ((i11 & 2) != 0) {
            k11 = e11.f25530b;
        }
        if ((i11 & 4) != 0) {
            nh2 = e11.f25531c;
        }
        if ((i11 & 8) != 0) {
            nh3 = e11.f25532d;
        }
        if ((i11 & 16) != 0) {
            nh4 = e11.f25533e;
        }
        if ((i11 & 32) != 0) {
            nh5 = e11.f25534f;
        }
        if ((i11 & 64) != 0) {
            nh6 = e11.f25535g;
        }
        if ((i11 & 128) != 0) {
            bVar = e11.f25536h;
        }
        if ((i11 & 256) != 0) {
            aVar = e11.f25537i;
        }
        InterfaceC3777rk.b bVar2 = bVar;
        InterfaceC3777rk.a aVar2 = aVar;
        Nh nh7 = nh5;
        Nh nh8 = nh6;
        Nh nh9 = nh4;
        Nh nh10 = nh2;
        return e11.a(qa2, k11, nh10, nh3, nh9, nh7, nh8, bVar2, aVar2);
    }

    public final QA a() {
        return this.f25529a;
    }
}
