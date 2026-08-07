package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Px implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f27401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f27402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f27403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f27404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Yj f27405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3777rk.b f27406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3777rk.a f27407g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f27408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3903uh f27409b;

        public a(QA text, InterfaceC3903uh icon) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(icon, "icon");
            this.f27408a = text;
            this.f27409b = icon;
        }

        public final InterfaceC3903uh a() {
            return this.f27409b;
        }

        public final QA b() {
            return this.f27408a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f27408a, aVar.f27408a) && p013kotlin.jvm.internal.s.f(this.f27409b, aVar.f27409b);
        }

        public int hashCode() {
            return (this.f27408a.hashCode() * 31) + this.f27409b.hashCode();
        }

        public String toString() {
            return "Hint(text=" + this.f27408a + ", icon=" + this.f27409b + ")";
        }
    }

    public Px(QA title, QA subtitle, QA description, List hints, Yj lottieSource, InterfaceC3777rk.b primaryButton, InterfaceC3777rk.a secondaryButton) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(hints, "hints");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        this.f27401a = title;
        this.f27402b = subtitle;
        this.f27403c = description;
        this.f27404d = hints;
        this.f27405e = lottieSource;
        this.f27406f = primaryButton;
        this.f27407g = secondaryButton;
    }

    public final QA a() {
        return this.f27401a;
    }

    public final QA b() {
        return this.f27403c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Px)) {
            return false;
        }
        Px px2 = (Px) obj;
        return p013kotlin.jvm.internal.s.f(this.f27401a, px2.f27401a) && p013kotlin.jvm.internal.s.f(this.f27402b, px2.f27402b) && p013kotlin.jvm.internal.s.f(this.f27403c, px2.f27403c) && p013kotlin.jvm.internal.s.f(this.f27404d, px2.f27404d) && p013kotlin.jvm.internal.s.f(this.f27405e, px2.f27405e) && p013kotlin.jvm.internal.s.f(this.f27406f, px2.f27406f) && p013kotlin.jvm.internal.s.f(this.f27407g, px2.f27407g);
    }

    public int hashCode() {
        return (((((((((((this.f27401a.hashCode() * 31) + this.f27402b.hashCode()) * 31) + this.f27403c.hashCode()) * 31) + this.f27404d.hashCode()) * 31) + this.f27405e.hashCode()) * 31) + this.f27406f.hashCode()) * 31) + this.f27407g.hashCode();
    }

    public final List p() {
        return this.f27404d;
    }

    public final Yj q() {
        return this.f27405e;
    }

    public final InterfaceC3777rk.b r() {
        return this.f27406f;
    }

    public final InterfaceC3777rk.a s() {
        return this.f27407g;
    }

    public String toString() {
        return "State(title=" + this.f27401a + ", subtitle=" + this.f27402b + ", description=" + this.f27403c + ", hints=" + this.f27404d + ", lottieSource=" + this.f27405e + ", primaryButton=" + this.f27406f + ", secondaryButton=" + this.f27407g + ")";
    }
}
