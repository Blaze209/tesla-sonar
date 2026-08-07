package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class O4 implements T4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G5 f27122a;

    public O4(G5 country) {
        p013kotlin.jvm.internal.s.k(country, "country");
        this.f27122a = country;
    }

    public final G5 a() {
        return this.f27122a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O4) && p013kotlin.jvm.internal.s.f(this.f27122a, ((O4) obj).f27122a);
    }

    public int hashCode() {
        return this.f27122a.hashCode();
    }

    public String toString() {
        return "OnSelected(country=" + this.f27122a + ")";
    }
}
