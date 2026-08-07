package com.fourthline.orca.internal;

import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public final class Kj implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f26584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f26585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f26586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Yj f26587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3777rk.b f26588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3777rk.a f26589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f26590g;

    public enum a {
        SCANNING,
        ERROR;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f26594d = on0.a.a(a());
    }

    public Kj(QA title, QA subtitle, QA description, Yj lottieSource, InterfaceC3777rk.b primaryButton, InterfaceC3777rk.a secondaryButton, a mode) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        p013kotlin.jvm.internal.s.k(mode, "mode");
        this.f26584a = title;
        this.f26585b = subtitle;
        this.f26586c = description;
        this.f26587d = lottieSource;
        this.f26588e = primaryButton;
        this.f26589f = secondaryButton;
        this.f26590g = mode;
    }

    public final Kj a(QA title, QA subtitle, QA description, Yj lottieSource, InterfaceC3777rk.b primaryButton, InterfaceC3777rk.a secondaryButton, a mode) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        p013kotlin.jvm.internal.s.k(mode, "mode");
        return new Kj(title, subtitle, description, lottieSource, primaryButton, secondaryButton, mode);
    }

    public final QA b() {
        return this.f26586c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kj)) {
            return false;
        }
        Kj kj2 = (Kj) obj;
        return p013kotlin.jvm.internal.s.f(this.f26584a, kj2.f26584a) && p013kotlin.jvm.internal.s.f(this.f26585b, kj2.f26585b) && p013kotlin.jvm.internal.s.f(this.f26586c, kj2.f26586c) && p013kotlin.jvm.internal.s.f(this.f26587d, kj2.f26587d) && p013kotlin.jvm.internal.s.f(this.f26588e, kj2.f26588e) && p013kotlin.jvm.internal.s.f(this.f26589f, kj2.f26589f) && this.f26590g == kj2.f26590g;
    }

    public int hashCode() {
        return (((((((((((this.f26584a.hashCode() * 31) + this.f26585b.hashCode()) * 31) + this.f26586c.hashCode()) * 31) + this.f26587d.hashCode()) * 31) + this.f26588e.hashCode()) * 31) + this.f26589f.hashCode()) * 31) + this.f26590g.hashCode();
    }

    public final Yj p() {
        return this.f26587d;
    }

    public final InterfaceC3777rk.b q() {
        return this.f26588e;
    }

    public final InterfaceC3777rk.a r() {
        return this.f26589f;
    }

    public String toString() {
        return "State(title=" + this.f26584a + ", subtitle=" + this.f26585b + ", description=" + this.f26586c + ", lottieSource=" + this.f26587d + ", primaryButton=" + this.f26588e + ", secondaryButton=" + this.f26589f + ", mode=" + this.f26590g + ")";
    }

    public static /* synthetic */ Kj a(Kj kj2, QA qa2, QA qa3, QA qa4, Yj yj2, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = kj2.f26584a;
        }
        if ((i11 & 2) != 0) {
            qa3 = kj2.f26585b;
        }
        if ((i11 & 4) != 0) {
            qa4 = kj2.f26586c;
        }
        if ((i11 & 8) != 0) {
            yj2 = kj2.f26587d;
        }
        if ((i11 & 16) != 0) {
            bVar = kj2.f26588e;
        }
        if ((i11 & 32) != 0) {
            aVar = kj2.f26589f;
        }
        if ((i11 & 64) != 0) {
            aVar2 = kj2.f26590g;
        }
        InterfaceC3777rk.a aVar3 = aVar;
        a aVar4 = aVar2;
        InterfaceC3777rk.b bVar2 = bVar;
        QA qa5 = qa4;
        return kj2.a(qa2, qa3, qa5, yj2, bVar2, aVar3, aVar4);
    }

    public final QA a() {
        return this.f26584a;
    }
}
