package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.x;
import io.sentry.g1;
import io.sentry.n1;
import io.sentry.n5;
import io.sentry.r8;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n5 f79666b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n5 f79667c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g1 f79668d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g1 f79669e = null;

    public b(String str) {
        this.f79665a = str;
    }

    private g1 d(g1 g1Var, String str, n5 n5Var) {
        g1 g1VarC = g1Var.c("activity.load", str, n5Var, n1.SENTRY);
        f(g1VarC);
        return g1VarC;
    }

    private void f(g1 g1Var) {
        g1Var.l("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        g1Var.l("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        g1Var.l("ui.contributes_to_ttid", bool);
        g1Var.l("ui.contributes_to_ttfd", bool);
    }

    public void a() {
        g1 g1Var = this.f79668d;
        if (g1Var != null && !g1Var.isFinished()) {
            this.f79668d.m(r8.CANCELLED);
        }
        this.f79668d = null;
        g1 g1Var2 = this.f79669e;
        if (g1Var2 != null && !g1Var2.isFinished()) {
            this.f79669e.m(r8.CANCELLED);
        }
        this.f79669e = null;
    }

    public void b(g1 g1Var) {
        if (this.f79666b == null || g1Var == null) {
            return;
        }
        g1 g1VarD = d(g1Var, this.f79665a + ".onCreate", this.f79666b);
        this.f79668d = g1VarD;
        g1VarD.g();
    }

    public void c(g1 g1Var) {
        if (this.f79667c == null || g1Var == null) {
            return;
        }
        g1 g1VarD = d(g1Var, this.f79665a + ".onStart", this.f79667c);
        this.f79669e = g1VarD;
        g1VarD.g();
    }

    public void e() {
        g1 g1Var = this.f79668d;
        if (g1Var == null || this.f79669e == null) {
            return;
        }
        n5 n5VarQ = g1Var.q();
        n5 n5VarQ2 = this.f79669e.q();
        if (n5VarQ == null || n5VarQ2 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        n5 n5VarA = x.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(n5VarA.b(this.f79668d.r()));
        long millis2 = timeUnit.toMillis(n5VarA.b(n5VarQ));
        long millis3 = timeUnit.toMillis(n5VarA.b(this.f79669e.r()));
        long millis4 = timeUnit.toMillis(n5VarA.b(n5VarQ2));
        c cVar = new c();
        cVar.b().q(this.f79668d.getDescription(), timeUnit.toMillis(this.f79668d.r().f()), jUptimeMillis - millis, jUptimeMillis - millis2);
        cVar.c().q(this.f79669e.getDescription(), timeUnit.toMillis(this.f79669e.r().f()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        h.q().e(cVar);
    }

    public void g(n5 n5Var) {
        this.f79666b = n5Var;
    }

    public void h(n5 n5Var) {
        this.f79667c = n5Var;
    }
}
