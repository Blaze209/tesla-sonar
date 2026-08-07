package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.y;
import androidx.work.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lb.e1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sb.b0;
import sb.m0;
import sb.n0;
import sb.x1;
import vb.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/work/y$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        s.k(context, "context");
        s.k(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public y.a d() {
        e1 e1VarS = e1.s(getApplicationContext());
        s.j(e1VarS, "getInstance(...)");
        WorkDatabase workDatabaseY = e1VarS.y();
        s.j(workDatabaseY, "getWorkDatabase(...)");
        n0 n0VarJ = workDatabaseY.j();
        b0 b0VarH = workDatabaseY.h();
        x1 x1VarK = workDatabaseY.k();
        sb.s sVarG = workDatabaseY.g();
        List<m0> listR = n0VarJ.r(e1VarS.q().getClock().currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<m0> listB = n0VarJ.B();
        List<m0> listH = n0VarJ.h(200);
        if (!listR.isEmpty()) {
            z.e().f(b.f118565a, "Recently completed work:\n\n");
            z.e().f(b.f118565a, b.d(b0VarH, x1VarK, sVarG, listR));
        }
        if (!listB.isEmpty()) {
            z.e().f(b.f118565a, "Running work:\n\n");
            z.e().f(b.f118565a, b.d(b0VarH, x1VarK, sVarG, listB));
        }
        if (!listH.isEmpty()) {
            z.e().f(b.f118565a, "Enqueued work:\n\n");
            z.e().f(b.f118565a, b.d(b0VarH, x1VarK, sVarG, listH));
        }
        y.a aVarE = y.a.e();
        s.j(aVarE, "success(...)");
        return aVarE;
    }
}
