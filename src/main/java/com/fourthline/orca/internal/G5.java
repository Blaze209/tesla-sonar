package com.fourthline.orca.internal;

import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class G5 implements InterfaceC3447jx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f25899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f25900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QA f25905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Pair f25906h;

    public G5(QA name, wn0.a presentation, String alpha2, String alpha3, String flag, String prefix, QA nationality) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(presentation, "presentation");
        p013kotlin.jvm.internal.s.k(alpha2, "alpha2");
        p013kotlin.jvm.internal.s.k(alpha3, "alpha3");
        p013kotlin.jvm.internal.s.k(flag, "flag");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(nationality, "nationality");
        this.f25899a = name;
        this.f25900b = presentation;
        this.f25901c = alpha2;
        this.f25902d = alpha3;
        this.f25903e = flag;
        this.f25904f = prefix;
        this.f25905g = nationality;
        this.f25906h = jn0.x.a("country_code", alpha3);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3447jx
    public wn0.a a() {
        return this.f25900b;
    }

    public final String b() {
        return this.f25901c;
    }

    public final String c() {
        return this.f25902d;
    }

    public final Pair d() {
        return this.f25906h;
    }

    public final String e() {
        return this.f25903e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G5)) {
            return false;
        }
        G5 g11 = (G5) obj;
        return p013kotlin.jvm.internal.s.f(this.f25899a, g11.f25899a) && p013kotlin.jvm.internal.s.f(this.f25900b, g11.f25900b) && p013kotlin.jvm.internal.s.f(this.f25901c, g11.f25901c) && p013kotlin.jvm.internal.s.f(this.f25902d, g11.f25902d) && p013kotlin.jvm.internal.s.f(this.f25903e, g11.f25903e) && p013kotlin.jvm.internal.s.f(this.f25904f, g11.f25904f) && p013kotlin.jvm.internal.s.f(this.f25905g, g11.f25905g);
    }

    public final QA f() {
        return this.f25905g;
    }

    public final String g() {
        return this.f25904f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3447jx
    public QA getName() {
        return this.f25899a;
    }

    public int hashCode() {
        return (((((((((((this.f25899a.hashCode() * 31) + this.f25900b.hashCode()) * 31) + this.f25901c.hashCode()) * 31) + this.f25902d.hashCode()) * 31) + this.f25903e.hashCode()) * 31) + this.f25904f.hashCode()) * 31) + this.f25905g.hashCode();
    }

    public String toString() {
        return "Country(name=" + this.f25899a + ", presentation=" + this.f25900b + ", alpha2=" + this.f25901c + ", alpha3=" + this.f25902d + ", flag=" + this.f25903e + ", prefix=" + this.f25904f + ", nationality=" + this.f25905g + ")";
    }
}
