package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class XA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29707b;

    public XA(String str, String str2) {
        this.f29706a = str;
        this.f29707b = str2;
    }

    private final boolean d() {
        String str = this.f29707b;
        if (str != null) {
            return !p013kotlin.text.t.y0(str);
        }
        return false;
    }

    public final String a() {
        return this.f29706a;
    }

    public final void b(String str) {
        this.f29707b = str;
    }

    public final String c() {
        return this.f29707b;
    }

    public final boolean e() {
        return d() && b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XA)) {
            return false;
        }
        XA xa2 = (XA) obj;
        return p013kotlin.jvm.internal.s.f(this.f29706a, xa2.f29706a) && p013kotlin.jvm.internal.s.f(this.f29707b, xa2.f29707b);
    }

    public int hashCode() {
        String str = this.f29706a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f29707b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TinBundle(taxationCountryCode=" + this.f29706a + ", taxpayerIdentificationNumber=" + this.f29707b + ")";
    }

    private final boolean b() {
        String str = this.f29706a;
        if (str != null) {
            return C4052y.a.f36872a.a(str);
        }
        return false;
    }

    public final void a(String str) {
        this.f29706a = str;
    }

    public /* synthetic */ XA(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
