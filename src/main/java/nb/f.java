package nb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.util.Consumer;
import androidx.work.i0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.r0;
import androidx.work.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lb.u;
import sb.SystemIdInfo;
import sb.WorkGenerationalId;
import sb.m0;
import sb.n0;
import sb.v1;
import sb.y;
import tb.o;

/* JADX INFO: loaded from: classes3.dex */
public class f implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f93699f = z.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f93701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f93702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WorkDatabase f93703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.work.c f93704e;

    public f(Context context, WorkDatabase workDatabase, androidx.work.c cVar) {
        this(context, workDatabase, cVar, c.c(context), new d(context, cVar.getClock(), cVar.getIsMarkingJobsAsImportantWhileForeground()));
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            d(jobScheduler, it.next().getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i11) {
        try {
            jobScheduler.cancel(i11);
        } catch (Throwable th2) {
            z.e().d(f93699f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i11)), th2);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            WorkGenerationalId workGenerationalIdH = h(jobInfo);
            if (workGenerationalIdH != null && str.equals(workGenerationalIdH.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = c.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static WorkGenerationalId h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerC = c.c(context);
        List<JobInfo> listG = g(context, jobSchedulerC);
        List<String> listC = workDatabase.g().c();
        boolean z11 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                WorkGenerationalId workGenerationalIdH = h(jobInfo);
                if (workGenerationalIdH != null) {
                    hashSet.add(workGenerationalIdH.getWorkSpecId());
                } else {
                    d(jobSchedulerC, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                z.e().a(f93699f, "Reconciling jobs");
                z11 = true;
                break;
            }
        }
        if (!z11) {
            return z11;
        }
        workDatabase.beginTransaction();
        try {
            n0 n0VarJ = workDatabase.j();
            Iterator<String> it2 = listC.iterator();
            while (it2.hasNext()) {
                n0VarJ.w(it2.next(), -1L);
            }
            workDatabase.setTransactionSuccessful();
            return z11;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @Override // lb.u
    public boolean b() {
        return true;
    }

    @Override // lb.u
    public void c(m0... m0VarArr) {
        o oVar = new o(this.f93703d);
        for (m0 m0Var : m0VarArr) {
            this.f93703d.beginTransaction();
            try {
                m0 m0VarT = this.f93703d.j().t(m0Var.id);
                if (m0VarT == null) {
                    z.e().k(f93699f, "Skipping scheduling " + m0Var.id + " because it's no longer in the DB");
                    this.f93703d.setTransactionSuccessful();
                } else if (m0VarT.state != r0.c.ENQUEUED) {
                    z.e().k(f93699f, "Skipping scheduling " + m0Var.id + " because it is no longer enqueued");
                    this.f93703d.setTransactionSuccessful();
                } else {
                    WorkGenerationalId workGenerationalIdA = v1.a(m0Var);
                    SystemIdInfo systemIdInfoB = this.f93703d.g().b(workGenerationalIdA);
                    int iB = systemIdInfoB != null ? systemIdInfoB.systemId : oVar.b(this.f93704e.getMinJobSchedulerId(), this.f93704e.getMaxJobSchedulerId());
                    if (systemIdInfoB == null) {
                        this.f93703d.g().d(y.a(workGenerationalIdA, iB));
                    }
                    j(m0Var, iB);
                    this.f93703d.setTransactionSuccessful();
                }
                this.f93703d.endTransaction();
            } catch (Throwable th2) {
                this.f93703d.endTransaction();
                throw th2;
            }
        }
    }

    @Override // lb.u
    public void e(String str) {
        List<Integer> listF = f(this.f93700a, this.f93701b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            d(this.f93701b, it.next().intValue());
        }
        this.f93703d.g().e(str);
    }

    public void j(m0 m0Var, int i11) {
        JobInfo jobInfoA = this.f93702c.a(m0Var, i11);
        z zVarE = z.e();
        String str = f93699f;
        zVarE.a(str, "Scheduling work ID " + m0Var.id + "Job ID " + i11);
        try {
            if (this.f93701b.schedule(jobInfoA) == 0) {
                z.e().k(str, "Unable to schedule work ID " + m0Var.id);
                if (m0Var.expedited && m0Var.outOfQuotaPolicy == i0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    m0Var.expedited = false;
                    z.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", m0Var.id));
                    j(m0Var, i11);
                }
            }
        } catch (IllegalStateException e11) {
            String strA = c.a(this.f93700a, this.f93703d, this.f93704e);
            z.e().c(f93699f, strA);
            IllegalStateException illegalStateException = new IllegalStateException(strA, e11);
            Consumer<Throwable> consumerM = this.f93704e.m();
            if (consumerM == null) {
                throw illegalStateException;
            }
            consumerM.accept(illegalStateException);
        } catch (Throwable th2) {
            z.e().d(f93699f, "Unable to schedule " + m0Var, th2);
        }
    }

    public f(Context context, WorkDatabase workDatabase, androidx.work.c cVar, JobScheduler jobScheduler, d dVar) {
        this.f93700a = context;
        this.f93701b = jobScheduler;
        this.f93702c = dVar;
        this.f93703d = workDatabase;
        this.f93704e = cVar;
    }
}
