package com.fourthline.orca.internal;

import java.util.Date;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3684pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G5 f34500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f34501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X7 f34502c;

    public C3684pc(G5 country, Date date, X7 details) {
        p013kotlin.jvm.internal.s.k(country, "country");
        p013kotlin.jvm.internal.s.k(details, "details");
        this.f34500a = country;
        this.f34501b = date;
        this.f34502c = details;
    }

    public final G5 a() {
        return this.f34500a;
    }

    public final X7 b() {
        return this.f34502c;
    }

    public final Date c() {
        return this.f34501b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3684pc)) {
            return false;
        }
        C3684pc c3684pc = (C3684pc) obj;
        return p013kotlin.jvm.internal.s.f(this.f34500a, c3684pc.f34500a) && p013kotlin.jvm.internal.s.f(this.f34501b, c3684pc.f34501b) && p013kotlin.jvm.internal.s.f(this.f34502c, c3684pc.f34502c);
    }

    public int hashCode() {
        int iHashCode = this.f34500a.hashCode() * 31;
        Date date = this.f34501b;
        return ((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.f34502c.hashCode();
    }

    public String toString() {
        return "DocumentVersion(country=" + this.f34500a + ", issueDate=" + this.f34501b + ", details=" + this.f34502c + ")";
    }
}
