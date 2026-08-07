package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3682pa implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yj f34476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f34477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f34478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f34479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3807sD f34480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3807sD f34481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f34482g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pa$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3903uh f34483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f34484b;

        public a(InterfaceC3903uh imageSource, QA text) {
            p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
            p013kotlin.jvm.internal.s.k(text, "text");
            this.f34483a = imageSource;
            this.f34484b = text;
        }

        public final InterfaceC3903uh a() {
            return this.f34483a;
        }

        public final QA b() {
            return this.f34484b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f34483a, aVar.f34483a) && p013kotlin.jvm.internal.s.f(this.f34484b, aVar.f34484b);
        }

        public int hashCode() {
            return (this.f34483a.hashCode() * 31) + this.f34484b.hashCode();
        }

        public String toString() {
            return "BulletPoint(imageSource=" + this.f34483a + ", text=" + this.f34484b + ")";
        }
    }

    public C3682pa(Yj lottieSource, QA header, QA title, QA description, InterfaceC3807sD primaryButtonIntent, InterfaceC3807sD secondaryButtonIntent, List bulletPoints) {
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(header, "header");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(primaryButtonIntent, "primaryButtonIntent");
        p013kotlin.jvm.internal.s.k(secondaryButtonIntent, "secondaryButtonIntent");
        p013kotlin.jvm.internal.s.k(bulletPoints, "bulletPoints");
        this.f34476a = lottieSource;
        this.f34477b = header;
        this.f34478c = title;
        this.f34479d = description;
        this.f34480e = primaryButtonIntent;
        this.f34481f = secondaryButtonIntent;
        this.f34482g = bulletPoints;
    }

    public final QA a() {
        return this.f34478c;
    }

    public final QA b() {
        return this.f34479d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3682pa)) {
            return false;
        }
        C3682pa c3682pa = (C3682pa) obj;
        return p013kotlin.jvm.internal.s.f(this.f34476a, c3682pa.f34476a) && p013kotlin.jvm.internal.s.f(this.f34477b, c3682pa.f34477b) && p013kotlin.jvm.internal.s.f(this.f34478c, c3682pa.f34478c) && p013kotlin.jvm.internal.s.f(this.f34479d, c3682pa.f34479d) && p013kotlin.jvm.internal.s.f(this.f34480e, c3682pa.f34480e) && p013kotlin.jvm.internal.s.f(this.f34481f, c3682pa.f34481f) && p013kotlin.jvm.internal.s.f(this.f34482g, c3682pa.f34482g);
    }

    public int hashCode() {
        return (((((((((((this.f34476a.hashCode() * 31) + this.f34477b.hashCode()) * 31) + this.f34478c.hashCode()) * 31) + this.f34479d.hashCode()) * 31) + this.f34480e.hashCode()) * 31) + this.f34481f.hashCode()) * 31) + this.f34482g.hashCode();
    }

    public final List p() {
        return this.f34482g;
    }

    public final QA q() {
        return this.f34477b;
    }

    public final Yj r() {
        return this.f34476a;
    }

    public String toString() {
        return "State(lottieSource=" + this.f34476a + ", header=" + this.f34477b + ", title=" + this.f34478c + ", description=" + this.f34479d + ", primaryButtonIntent=" + this.f34480e + ", secondaryButtonIntent=" + this.f34481f + ", bulletPoints=" + this.f34482g + ")";
    }
}
