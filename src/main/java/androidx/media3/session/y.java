package androidx.media3.session;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.session.v;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class y<T extends v> extends com.google.common.util.concurrent.a<T> implements v.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f12625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private T f12626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12627j;

    public y(Looper looper) {
        this.f12625h = new Handler(looper);
    }

    public static /* synthetic */ void R(y yVar, v vVar) {
        if (yVar.isCancelled()) {
            vVar.release();
        }
    }

    private void S() {
        N(new SecurityException("Session rejected the connection request."));
    }

    private void T() {
        T t11 = this.f12626i;
        if (t11 == null || !this.f12627j) {
            return;
        }
        M(t11);
    }

    public void U(final T t11) {
        this.f12626i = t11;
        T();
        b(new Runnable() { // from class: androidx.media3.session.w
            @Override // java.lang.Runnable
            public final void run() {
                y.R(this.f12555a, t11);
            }
        }, new Executor() { // from class: androidx.media3.session.x
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                s7.q0.m1(this.f12601a.f12625h, runnable);
            }
        });
    }

    @Override // androidx.media3.session.v.b
    public void a() {
        this.f12627j = true;
        T();
    }

    @Override // androidx.media3.session.v.b
    public void c() {
        S();
    }
}
