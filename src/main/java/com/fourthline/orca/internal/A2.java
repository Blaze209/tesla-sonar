package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class A2 implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f24887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E3 f24888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Yj f24889c;

    public A2(QA title, E3 backButtonState, Yj lottieSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        this.f24887a = title;
        this.f24888b = backButtonState;
        this.f24889c = lottieSource;
    }

    public final A2 a(QA title, E3 backButtonState, Yj lottieSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        return new A2(title, backButtonState, lottieSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A2)) {
            return false;
        }
        A2 a11 = (A2) obj;
        return p013kotlin.jvm.internal.s.f(this.f24887a, a11.f24887a) && p013kotlin.jvm.internal.s.f(this.f24888b, a11.f24888b) && p013kotlin.jvm.internal.s.f(this.f24889c, a11.f24889c);
    }

    public int hashCode() {
        return (((this.f24887a.hashCode() * 31) + this.f24888b.hashCode()) * 31) + this.f24889c.hashCode();
    }

    public final E3 p() {
        return this.f24888b;
    }

    public final Yj q() {
        return this.f24889c;
    }

    public String toString() {
        return "State(title=" + this.f24887a + ", backButtonState=" + this.f24888b + ", lottieSource=" + this.f24889c + ")";
    }

    public static /* synthetic */ A2 a(A2 a11, QA qa2, E3 e11, Yj yj2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = a11.f24887a;
        }
        if ((i11 & 2) != 0) {
            e11 = a11.f24888b;
        }
        if ((i11 & 4) != 0) {
            yj2 = a11.f24889c;
        }
        return a11.a(qa2, e11, yj2);
    }

    public final QA a() {
        return this.f24887a;
    }
}
