package nb;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.a0;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.z;
import java.util.Iterator;
import sb.m0;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f93694d = z.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f93695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.b f93696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f93697c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93698a;

        static {
            int[] iArr = new int[a0.values().length];
            f93698a = iArr;
            try {
                iArr[a0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93698a[a0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93698a[a0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93698a[a0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93698a[a0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    d(Context context, androidx.work.b bVar, boolean z11) {
        this.f93696b = bVar;
        this.f93695a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f93697c = z11;
    }

    private static JobInfo.TriggerContentUri b(androidx.work.e.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.getUri(), cVar.getIsTriggeredForDescendants() ? 1 : 0);
    }

    static int c(a0 a0Var) {
        int i11 = a.f93698a[a0Var.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        if (i11 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        z.e().a(f93694d, "API version too low. Cannot convert network type value " + a0Var);
        return 1;
    }

    static void d(JobInfo.Builder builder, a0 a0Var) {
        if (Build.VERSION.SDK_INT < 30 || a0Var != a0.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(a0Var));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(m0 m0Var, int i11) {
        String traceTag;
        androidx.work.e eVar = m0Var.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", m0Var.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", m0Var.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", m0Var.o());
        JobInfo.Builder extras = new JobInfo.Builder(i11, this.f93695a).setRequiresCharging(eVar.getRequiresCharging()).setRequiresDeviceIdle(eVar.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest networkRequestD = eVar.d();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28 || networkRequestD == null) {
            d(extras, eVar.getRequiredNetworkType());
        } else {
            e.a(extras, networkRequestD);
        }
        if (!eVar.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(m0Var.backoffDelayDuration, m0Var.backoffPolicy == androidx.work.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(m0Var.c() - this.f93696b.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!m0Var.expedited && this.f93697c) {
            extras.setImportantWhileForeground(true);
        }
        if (eVar.g()) {
            Iterator<androidx.work.e.c> it = eVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(eVar.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(eVar.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            extras.setRequiresBatteryNotLow(eVar.getRequiresBatteryNotLow());
            extras.setRequiresStorageNotLow(eVar.getRequiresStorageNotLow());
        }
        boolean z11 = m0Var.runAttemptCount > 0;
        boolean z12 = jMax > 0;
        if (i13 >= 31 && m0Var.expedited && !z11 && !z12) {
            extras.setExpedited(true);
        }
        if (i13 >= 35 && (traceTag = m0Var.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}
