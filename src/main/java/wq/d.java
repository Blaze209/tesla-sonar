package wq;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes4.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f122189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xq.d f122190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f122191c;

    public d(Context context, xq.d dVar, f fVar) {
        this.f122189a = context;
        this.f122190b = dVar;
        this.f122191c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i11, int i12) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i13 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i11) {
                if (i13 >= i12) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // wq.x
    public void a(pq.p pVar, int i11, boolean z11) {
        ComponentName componentName = new ComponentName(this.f122189a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f122189a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z11 && d(jobScheduler, iC, i11)) {
            tq.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jN1 = this.f122190b.n1(pVar);
        JobInfo.Builder builderC = this.f122191c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jN1, i11);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i11);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", ar.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        tq.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f122191c.g(pVar.d(), jN1, i11)), Long.valueOf(jN1), Integer.valueOf(i11));
        jobScheduler.schedule(builderC.build());
    }

    @Override // wq.x
    public void b(pq.p pVar, int i11) {
        a(pVar, i11, false);
    }

    int c(pq.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f122189a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ar.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
