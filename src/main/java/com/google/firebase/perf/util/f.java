package com.google.firebase.perf.util;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kw.a f44549b = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f44550a;

    public f() {
        this(new Bundle());
    }

    private g<Integer> d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f44550a.get(str));
        } catch (ClassCastException e11) {
            f44549b.b("Metadata key %s contains type other than int: %s", str, e11.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f44550a.containsKey(str);
    }

    public g<Boolean> b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f44550a.get(str));
        } catch (ClassCastException e11) {
            f44549b.b("Metadata key %s contains type other than boolean: %s", str, e11.getMessage());
            return g.a();
        }
    }

    public g<Double> c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f44550a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f44549b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public g<Long> e(String str) {
        g<Integer> gVarD = d(str);
        return gVarD.d() ? g.e(Long.valueOf(gVarD.c().intValue())) : g.a();
    }

    public f(Bundle bundle) {
        this.f44550a = (Bundle) bundle.clone();
    }
}
