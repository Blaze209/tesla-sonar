package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2911Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27042a;

    public C2911Ne(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        this.f27042a = url;
    }

    public final String a() {
        return this.f27042a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2911Ne) && p013kotlin.jvm.internal.s.f(this.f27042a, ((C2911Ne) obj).f27042a);
    }

    public int hashCode() {
        return this.f27042a.hashCode();
    }

    public String toString() {
        return "Endpoint(url=" + this.f27042a + ")";
    }
}
