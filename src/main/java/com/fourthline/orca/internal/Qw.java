package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Qw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f27569a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    I3.q f27570b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Ks f27571c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f27572d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Vw.C2980c f27573e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f27574f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Vw.C2980c f27575g = null;

    public boolean a() {
        String str = this.f27569a;
        return (str != null && str.trim().length() > 0) || this.f27570b != null;
    }

    public boolean b() {
        return this.f27571c != null;
    }

    public boolean c() {
        return this.f27572d != null;
    }

    public boolean d() {
        return this.f27574f != null;
    }

    public boolean e() {
        return this.f27573e != null;
    }

    public boolean f() {
        return this.f27575g != null;
    }

    public Qw a(float f11, float f12, float f13, float f14) {
        this.f27575g = new Vw.C2980c(f11, f12, f13, f14);
        return this;
    }
}
