package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
final class t7 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f81350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f81351b;

    public t7(String str, String str2) {
        this.f81350a = str;
        this.f81351b = str2;
    }

    private <T extends i5> T a(T t11) {
        if (t11.C().i() == null) {
            t11.C().x(new io.sentry.protocol.z());
        }
        io.sentry.protocol.z zVarI = t11.C().i();
        if (zVarI != null && zVarI.d() == null && zVarI.e() == null) {
            zVarI.f(this.f81351b);
            zVarI.h(this.f81350a);
        }
        return t11;
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, h0 h0Var) {
        return (r6) a(r6Var);
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.e0 o(io.sentry.protocol.e0 e0Var, h0 h0Var) {
        return (io.sentry.protocol.e0) a(e0Var);
    }

    public t7() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
