package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class z8 extends k8 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final io.sentry.protocol.h0 f81642t = io.sentry.protocol.h0.CUSTOM;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f81643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.h0 f81644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y8 f81645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f81646s;

    public z8(String str, String str2) {
        this(str, str2, (y8) null);
    }

    public static z8 x(w3 w3Var) {
        Boolean boolF = w3Var.f();
        d dVarA = w3Var.a();
        return new z8(w3Var.e(), w3Var.d(), w3Var.b(), boolF == null ? null : new y8(boolF, dVarA.j(), w3Var.c()), dVarA);
    }

    public io.sentry.protocol.h0 A() {
        return this.f81644q;
    }

    public void B(boolean z11) {
        this.f81646s = z11;
    }

    public String y() {
        return this.f81643p;
    }

    public y8 z() {
        return this.f81645r;
    }

    public z8(String str, io.sentry.protocol.h0 h0Var, String str2) {
        this(str, h0Var, str2, null);
    }

    public z8(String str, String str2, y8 y8Var) {
        this(str, io.sentry.protocol.h0.CUSTOM, str2, y8Var);
    }

    public z8(String str, io.sentry.protocol.h0 h0Var, String str2, y8 y8Var) {
        super(str2);
        this.f81646s = false;
        this.f81643p = (String) io.sentry.util.y.c(str, "name is required");
        this.f81644q = h0Var;
        u(y8Var);
        this.f80730m = io.sentry.util.j0.d(null, y8Var);
    }

    public z8(io.sentry.protocol.x xVar, p8 p8Var, p8 p8Var2, y8 y8Var, d dVar) {
        super(xVar, p8Var, "default", p8Var2, null);
        this.f81646s = false;
        this.f81643p = "<unlabeled transaction>";
        this.f81645r = y8Var;
        this.f81644q = f81642t;
        this.f80730m = io.sentry.util.j0.d(dVar, y8Var);
    }
}
