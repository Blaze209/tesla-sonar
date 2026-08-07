package tb;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.r0;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class n0 implements androidx.work.k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f113092c = androidx.work.z.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f113093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ub.b f113094b;

    public n0(WorkDatabase workDatabase, ub.b bVar) {
        this.f113093a = workDatabase;
        this.f113094b = bVar;
    }

    public static /* synthetic */ Void b(n0 n0Var, UUID uuid, androidx.work.g gVar) {
        n0Var.getClass();
        String string = uuid.toString();
        androidx.work.z zVarE = androidx.work.z.e();
        String str = f113092c;
        zVarE.a(str, "Updating progress for " + uuid + " (" + gVar + ")");
        n0Var.f113093a.beginTransaction();
        try {
            sb.m0 m0VarT = n0Var.f113093a.j().t(string);
            if (m0VarT == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (m0VarT.state == r0.c.RUNNING) {
                n0Var.f113093a.i().c(new sb.f0(string, gVar));
            } else {
                androidx.work.z.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            n0Var.f113093a.setTransactionSuccessful();
            n0Var.f113093a.endTransaction();
            return null;
        } catch (Throwable th2) {
            try {
                androidx.work.z.e().d(f113092c, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                n0Var.f113093a.endTransaction();
                throw th3;
            }
        }
    }

    @Override // androidx.work.k0
    public com.google.common.util.concurrent.s<Void> a(Context context, final UUID uuid, final androidx.work.g gVar) {
        return androidx.work.w.f(this.f113094b.d(), "updateProgress", new wn0.a() { // from class: tb.m0
            @Override // wn0.a
            public final Object invoke() {
                return n0.b(this.f113086a, uuid, gVar);
            }
        });
    }
}
