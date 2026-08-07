package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lb.a1;
import lb.c1;
import lb.e;
import lb.e1;
import lb.s;
import lb.x;
import lb.y;
import sb.WorkGenerationalId;

/* JADX INFO: loaded from: classes3.dex */
public class SystemJobService extends JobService implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f14560e = z.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1 f14561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, JobParameters> f14562b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f14563c = y.d(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a1 f14564d;

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    private static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    static int b(int i11) {
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i11;
            default:
                return -512;
        }
    }

    private static WorkGenerationalId c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // lb.e
    public void d(WorkGenerationalId workGenerationalId, boolean z11) {
        a("onExecuted");
        z.e().a(f14560e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.f14562b.remove(workGenerationalId);
        this.f14563c.a(workGenerationalId);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z11);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            e1 e1VarS = e1.s(getApplicationContext());
            this.f14561a = e1VarS;
            s sVarU = e1VarS.u();
            this.f14564d = new c1(sVarU, this.f14561a.A());
            sVarU.e(this);
        } catch (IllegalStateException e11) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
            }
            z.e().k(f14560e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.f14561a;
        if (e1Var != null) {
            e1Var.u().m(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f14561a == null) {
            z.e().a(f14560e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            z.e().c(f14560e, "WorkSpec id not found!");
            return false;
        }
        if (this.f14562b.containsKey(workGenerationalIdC)) {
            z.e().a(f14560e, "Job is already being executed by SystemJobService: " + workGenerationalIdC);
            return false;
        }
        z.e().a(f14560e, "onStartJob for " + workGenerationalIdC);
        this.f14562b.put(workGenerationalIdC, jobParameters);
        int i11 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.f14449b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f14448a = Arrays.asList(a.a(jobParameters));
        }
        if (i11 >= 28) {
            aVar.f14450c = b.a(jobParameters);
        }
        this.f14564d.c(this.f14563c.b(workGenerationalIdC), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f14561a == null) {
            z.e().a(f14560e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            z.e().c(f14560e, "WorkSpec id not found!");
            return false;
        }
        z.e().a(f14560e, "onStopJob for " + workGenerationalIdC);
        this.f14562b.remove(workGenerationalIdC);
        x xVarA = this.f14563c.a(workGenerationalIdC);
        if (xVarA != null) {
            this.f14564d.a(xVarA, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f14561a.u().j(workGenerationalIdC.getWorkSpecId());
    }
}
