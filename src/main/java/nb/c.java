package nb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.z;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/c;", "configuration", "", "a", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/c;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "Landroid/app/job/JobScheduler;", "c", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "b", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f93693a;

    static {
        String strI = z.i("SystemJobScheduler");
        s.j(strI, "tagWithPrefix(...)");
        f93693a = strI;
    }

    public static final String a(Context context, WorkDatabase workDatabase, androidx.work.c configuration) {
        String str;
        s.k(context, "context");
        s.k(workDatabase, "workDatabase");
        s.k(configuration, "configuration");
        int i11 = Build.VERSION.SDK_INT;
        int i12 = i11 >= 31 ? 150 : 100;
        int size = workDatabase.j().s().size();
        String strY0 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i11 >= 34) {
            JobScheduler jobSchedulerC = c(context);
            List<JobInfo> listB = b(jobSchedulerC);
            if (listB != null) {
                List<JobInfo> listG = f.g(context, jobSchedulerC);
                int size2 = listG != null ? listB.size() - listG.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                s.i(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List<JobInfo> listG2 = f.g(context, (JobScheduler) systemService);
                int size3 = listG2 != null ? listG2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strY0 = v.y0(v.r(listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> listG3 = f.g(context, c(context));
            if (listG3 != null) {
                strY0 = listG3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i12 + " job limit exceeded.\nIn JobScheduler there are " + strY0 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.getMaxSchedulerLimit() + CoreConstants.DOT;
    }

    public static final List<JobInfo> b(JobScheduler jobScheduler) {
        s.k(jobScheduler, "<this>");
        try {
            return a.f93691a.a(jobScheduler);
        } catch (Throwable th2) {
            z.e().d(f93693a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler c(Context context) {
        s.k(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        s.i(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? b.f93692a.a(jobScheduler) : jobScheduler;
    }
}
