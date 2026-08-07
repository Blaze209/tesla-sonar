package io.sentry.android.core;

import com.facebook.react.modules.appstate.AppStateModule;
import io.sentry.b7;
import io.sentry.f4;
import io.sentry.f8;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
final class b2 implements y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f79355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f79356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimerTask f79357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.r<Timer> f79358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f79359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.z0 f79360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f79361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f79362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.sentry.transport.p f79363i;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (b2.this.f79361g) {
                b2.this.f79360f.l();
            }
            b2.this.f79360f.getOptions().getReplayController().stop();
            b2.this.f79360f.getOptions().getContinuousProfiler().a(false);
        }
    }

    b2(io.sentry.z0 z0Var, long j11, boolean z11, boolean z12) {
        this(z0Var, j11, z11, z12, io.sentry.transport.n.b());
    }

    public static /* synthetic */ void a(b2 b2Var, io.sentry.x0 x0Var) {
        f8 f8VarX;
        if (b2Var.f79355a.get() != 0 || (f8VarX = x0Var.x()) == null || f8VarX.k() == null) {
            return;
        }
        b2Var.f79355a.set(f8VarX.k().getTime());
    }

    public static /* synthetic */ Timer b() {
        return new Timer(true);
    }

    private void f(String str) {
        if (this.f79362h) {
            io.sentry.e eVar = new io.sentry.e();
            eVar.z("navigation");
            eVar.v("state", str);
            eVar.u("app.lifecycle");
            eVar.w(b7.INFO);
            this.f79360f.c(eVar);
        }
    }

    private void g() {
        io.sentry.d1 d1VarA = this.f79359e.a();
        try {
            TimerTask timerTask = this.f79357c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f79357c = null;
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void h() {
        io.sentry.d1 d1VarA = this.f79359e.a();
        try {
            g();
            this.f79357c = new a();
            this.f79358d.a().schedule(this.f79357c, this.f79356b);
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void i() {
        g();
        long jA = this.f79363i.a();
        this.f79360f.s(new f4() { // from class: io.sentry.android.core.a2
            @Override // io.sentry.f4
            public final void a(io.sentry.x0 x0Var) {
                b2.a(this.f79352a, x0Var);
            }
        });
        long j11 = this.f79355a.get();
        if (j11 == 0 || j11 + this.f79356b <= jA) {
            if (this.f79361g) {
                this.f79360f.h();
            }
            this.f79360f.getOptions().getReplayController().start();
        }
        this.f79360f.getOptions().getReplayController().i();
        this.f79355a.set(jA);
    }

    @Override // io.sentry.android.core.y0.a
    public void c() {
        i();
        f("foreground");
    }

    @Override // io.sentry.android.core.y0.a
    public void o() {
        this.f79355a.set(this.f79363i.a());
        this.f79360f.getOptions().getReplayController().d();
        h();
        f(AppStateModule.APP_STATE_BACKGROUND);
    }

    b2(io.sentry.z0 z0Var, long j11, boolean z11, boolean z12, io.sentry.transport.p pVar) {
        this.f79355a = new AtomicLong(0L);
        this.f79358d = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.android.core.z1
            @Override // io.sentry.util.r.a
            public final Object a() {
                return b2.b();
            }
        });
        this.f79359e = new io.sentry.util.a();
        this.f79356b = j11;
        this.f79361g = z11;
        this.f79362h = z12;
        this.f79360f = z0Var;
        this.f79363i = pVar;
    }
}
