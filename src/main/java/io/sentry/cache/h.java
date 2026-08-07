package io.sentry.cache;

import io.sentry.q1;
import io.sentry.q7;
import io.sentry.s0;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f80357a;

    public h(q7 q7Var) {
        this.f80357a = q7Var;
    }

    private void a(String str) {
        d.a(this.f80357a, ".options-cache", str);
    }

    public static <T> T b(q7 q7Var, String str, Class<T> cls) {
        return (T) c(q7Var, str, cls, null);
    }

    public static <T, R> T c(q7 q7Var, String str, Class<T> cls, q1<R> q1Var) {
        return (T) d.c(q7Var, ".options-cache", str, cls, q1Var);
    }

    private <T> void d(T t11, String str) {
        d.d(this.f80357a, t11, ".options-cache", str);
    }

    @Override // io.sentry.s0
    public void e(Map<String, String> map) {
        d(map, "tags.json");
    }

    @Override // io.sentry.s0
    public void f(String str) {
        if (str == null) {
            a("dist.json");
        } else {
            d(str, "dist.json");
        }
    }

    @Override // io.sentry.s0
    public void g(String str) {
        if (str == null) {
            a("environment.json");
        } else {
            d(str, "environment.json");
        }
    }

    @Override // io.sentry.s0
    public void h(String str) {
        if (str == null) {
            a("proguard-uuid.json");
        } else {
            d(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.s0
    public void i(io.sentry.protocol.r rVar) {
        if (rVar == null) {
            a("sdk-version.json");
        } else {
            d(rVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.s0
    public void j(Double d11) {
        if (d11 == null) {
            a("replay-error-sample-rate.json");
        } else {
            d(d11.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.s0
    public void k(String str) {
        if (str == null) {
            a("release.json");
        } else {
            d(str, "release.json");
        }
    }
}
