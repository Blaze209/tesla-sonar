package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class IC implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f26273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f26274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f26275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Yj f26276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f26278f;

    public IC(QA title, QA description, QA hint, Yj lottieSource, int i11, boolean z11) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        this.f26273a = title;
        this.f26274b = description;
        this.f26275c = hint;
        this.f26276d = lottieSource;
        this.f26277e = i11;
        this.f26278f = z11;
    }

    public final QA a() {
        return this.f26273a;
    }

    public final QA b() {
        return this.f26274b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IC)) {
            return false;
        }
        IC ic2 = (IC) obj;
        return p013kotlin.jvm.internal.s.f(this.f26273a, ic2.f26273a) && p013kotlin.jvm.internal.s.f(this.f26274b, ic2.f26274b) && p013kotlin.jvm.internal.s.f(this.f26275c, ic2.f26275c) && p013kotlin.jvm.internal.s.f(this.f26276d, ic2.f26276d) && this.f26277e == ic2.f26277e && this.f26278f == ic2.f26278f;
    }

    public int hashCode() {
        return (((((((((this.f26273a.hashCode() * 31) + this.f26274b.hashCode()) * 31) + this.f26275c.hashCode()) * 31) + this.f26276d.hashCode()) * 31) + Integer.hashCode(this.f26277e)) * 31) + Boolean.hashCode(this.f26278f);
    }

    public final QA p() {
        return this.f26275c;
    }

    public final Yj q() {
        return this.f26276d;
    }

    public final int r() {
        return this.f26277e;
    }

    public final boolean s() {
        return this.f26278f;
    }

    public String toString() {
        return "State(title=" + this.f26273a + ", description=" + this.f26274b + ", hint=" + this.f26275c + ", lottieSource=" + this.f26276d + ", progress=" + this.f26277e + ", showProgress=" + this.f26278f + ")";
    }
}
