package io.sentry.clientreport;

import io.sentry.util.y;

/* JADX INFO: loaded from: classes9.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80416b;

    d(String str, String str2) {
        this.f80415a = str;
        this.f80416b = str2;
    }

    public String a() {
        return this.f80416b;
    }

    public String b() {
        return this.f80415a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return y.a(b(), dVar.b()) && y.a(a(), dVar.a());
    }

    public int hashCode() {
        return y.b(b(), a());
    }
}
