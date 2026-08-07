package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b.r f21230a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f21231b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f21232c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.b f21233d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f21234e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g.b f21235f = null;

    public f a(String str) {
        this.f21230a = new b(b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        b.r rVar = this.f21230a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.f21231b != null;
    }

    public boolean d() {
        return this.f21232c != null;
    }

    public boolean e() {
        return this.f21234e != null;
    }

    public boolean f() {
        return this.f21233d != null;
    }

    public boolean g() {
        return this.f21235f != null;
    }

    public f h(float f11, float f12, float f13, float f14) {
        this.f21235f = new g.b(f11, f12, f13, f14);
        return this;
    }
}
