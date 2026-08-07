package tb;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.u0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/c;", "configuration", "Llb/e0;", "continuation", "Ljn0/h0;", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/c;Llb/e0;)V", "Lsb/m0;", "workSpec", "c", "(Lsb/m0;)Lsb/m0;", "b", "", "Llb/u;", "schedulers", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lsb/m0;)Lsb/m0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final void a(WorkDatabase workDatabase, androidx.work.c configuration, lb.e0 continuation) {
        int i11;
        p013kotlin.jvm.internal.s.k(workDatabase, "workDatabase");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(continuation, "continuation");
        List listS = p013kotlin.collections.v.s(continuation);
        int i12 = 0;
        while (!listS.isEmpty()) {
            lb.e0 e0Var = (lb.e0) p013kotlin.collections.v.O(listS);
            List<? extends u0> listG = e0Var.g();
            p013kotlin.jvm.internal.s.j(listG, "getWork(...)");
            List<? extends u0> list = listG;
            if ((list instanceof Collection) && list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((u0) it.next()).getWorkSpec().org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.g() && (i11 = i11 + 1) < 0) {
                        p013kotlin.collections.v.w();
                    }
                }
            }
            i12 += i11;
            List<lb.e0> listF = e0Var.f();
            if (listF != null) {
                listS.addAll(listF);
            }
        }
        if (i12 == 0) {
            return;
        }
        int iO = workDatabase.j().o();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (iO + i12 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iO + ";\ncurrent enqueue operation count: " + i12 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final sb.m0 b(sb.m0 workSpec) {
        p013kotlin.jvm.internal.s.k(workSpec, "workSpec");
        androidx.work.e eVar = workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
        String str = workSpec.workerClassName;
        if (p013kotlin.jvm.internal.s.f(str, ConstraintTrackingWorker.class.getName()) || !(eVar.getRequiresBatteryNotLow() || eVar.getRequiresStorageNotLow())) {
            return workSpec;
        }
        androidx.work.g gVarA = new androidx.work.g.a().c(workSpec.input).k("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        String name = ConstraintTrackingWorker.class.getName();
        p013kotlin.jvm.internal.s.j(name, "getName(...)");
        return sb.m0.e(workSpec, null, null, name, null, gVarA, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final sb.m0 c(sb.m0 workSpec) {
        p013kotlin.jvm.internal.s.k(workSpec, "workSpec");
        boolean zJ = workSpec.input.j("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zJ2 = workSpec.input.j("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zJ3 = workSpec.input.j("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zJ || !zJ2 || !zJ3) {
            return workSpec;
        }
        return sb.m0.e(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new androidx.work.g.a().c(workSpec.input).k("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.workerClassName).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final sb.m0 d(List<? extends lb.u> schedulers, sb.m0 workSpec) {
        p013kotlin.jvm.internal.s.k(schedulers, "schedulers");
        p013kotlin.jvm.internal.s.k(workSpec, "workSpec");
        sb.m0 m0VarC = c(workSpec);
        return Build.VERSION.SDK_INT <= 25 ? b(m0VarC) : m0VarC;
    }
}
