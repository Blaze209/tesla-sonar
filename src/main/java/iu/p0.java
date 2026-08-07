package iu;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class p0 extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f81909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m0 f81910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f81911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p0(f fVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, m0 m0Var) {
        super(taskCompletionSource);
        this.f81909b = taskCompletionSource2;
        this.f81910c = m0Var;
        Objects.requireNonNull(fVar);
        this.f81911d = fVar;
    }

    @Override // iu.m0
    public final void b() {
        f fVar = this.f81911d;
        synchronized (fVar.f81885f) {
            try {
                f.p(fVar, this.f81909b);
                if (fVar.f81891l.getAndIncrement() > 0) {
                    fVar.f81881b.b("Already connected to the service.", new Object[0]);
                }
                f.r(fVar, this.f81910c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
