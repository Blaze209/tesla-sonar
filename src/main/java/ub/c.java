package ub;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import tb.a0;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f116067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineDispatcher f116068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f116069c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f116070d = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f116069c.post(runnable);
        }
    }

    public c(Executor executor) {
        a0 a0Var = new a0(executor);
        this.f116067a = a0Var;
        this.f116068b = ExecutorsKt.from(a0Var);
    }

    @Override // ub.b
    public CoroutineDispatcher a() {
        return this.f116068b;
    }

    @Override // ub.b
    public Executor c() {
        return this.f116070d;
    }

    @Override // ub.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a0 d() {
        return this.f116067a;
    }
}
