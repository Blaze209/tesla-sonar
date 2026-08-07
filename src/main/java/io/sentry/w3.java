package io.sentry;

import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes9.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f81564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p8 f81565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p8 f81566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f81567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f81568e;

    public w3() {
        this(new io.sentry.protocol.x(), new p8(), null, null, null);
    }

    public d a() {
        return this.f81568e;
    }

    public p8 b() {
        return this.f81566c;
    }

    public Double c() {
        Double dI = this.f81568e.i();
        return Double.valueOf(dI == null ? 0.0d : dI.doubleValue());
    }

    public p8 d() {
        return this.f81565b;
    }

    public io.sentry.protocol.x e() {
        return this.f81564a;
    }

    public Boolean f() {
        return this.f81567d;
    }

    public k8 g() {
        k8 k8Var = new k8(this.f81564a, this.f81565b, "default", null, null);
        k8Var.t(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        return k8Var;
    }

    public w8 h() {
        return this.f81568e.J();
    }

    public w3(w3 w3Var) {
        this(w3Var.e(), w3Var.d(), w3Var.b(), w3Var.a(), w3Var.f());
    }

    public w3(io.sentry.protocol.x xVar, p8 p8Var, p8 p8Var2, d dVar, Boolean bool) {
        this.f81564a = xVar;
        this.f81565b = p8Var;
        this.f81566c = p8Var2;
        this.f81568e = io.sentry.util.j0.e(dVar, bool, null, null);
        this.f81567d = bool;
    }
}
