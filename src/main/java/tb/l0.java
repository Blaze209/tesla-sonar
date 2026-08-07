package tb;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import sb.v1;

/* JADX INFO: loaded from: classes3.dex */
public class l0 implements androidx.work.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f113082d = androidx.work.z.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ub.b f113083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final rb.a f113084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sb.n0 f113085c;

    @SuppressLint({"LambdaLast"})
    public l0(WorkDatabase workDatabase, rb.a aVar, ub.b bVar) {
        this.f113084b = aVar;
        this.f113083a = bVar;
        this.f113085c = workDatabase.j();
    }

    public static /* synthetic */ Void b(l0 l0Var, UUID uuid, androidx.work.m mVar, Context context) {
        l0Var.getClass();
        String string = uuid.toString();
        sb.m0 m0VarT = l0Var.f113085c.t(string);
        if (m0VarT == null || m0VarT.state.isFinished()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        l0Var.f113084b.a(string, mVar);
        context.startService(androidx.work.impl.foreground.a.e(context, v1.a(m0VarT), mVar));
        return null;
    }

    @Override // androidx.work.n
    public com.google.common.util.concurrent.s<Void> a(final Context context, final UUID uuid, final androidx.work.m mVar) {
        return androidx.work.w.f(this.f113083a.d(), "setForegroundAsync", new wn0.a() { // from class: tb.k0
            @Override // wn0.a
            public final Object invoke() {
                return l0.b(this.f113078a, uuid, mVar, context);
            }
        });
    }
}
