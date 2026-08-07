package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.r0;
import androidx.work.z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lb.e1;
import lb.h0;
import nb.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import q5.l;
import sb.g0;
import sb.m0;
import sb.n0;
import tb.m;
import tb.x;
import tb.y;

/* JADX INFO: loaded from: classes3.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f14584e = z.i("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f14585f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f14587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f14588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14589d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f14590a = z.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            z.e().j(f14590a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, e1 e1Var) {
        this.f14586a = context.getApplicationContext();
        this.f14587b = e1Var;
        this.f14588c = e1Var.t();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i11) {
        return PendingIntent.getBroadcast(context, -1, c(context), i11);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f14585f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = f.i(this.f14586a, this.f14587b.y());
        WorkDatabase workDatabaseY = this.f14587b.y();
        n0 n0VarJ = workDatabaseY.j();
        g0 g0VarI = workDatabaseY.i();
        workDatabaseY.beginTransaction();
        try {
            List<m0> listB = n0VarJ.B();
            boolean z11 = (listB == null || listB.isEmpty()) ? false : true;
            if (z11) {
                for (m0 m0Var : listB) {
                    n0VarJ.j(r0.c.ENQUEUED, m0Var.id);
                    n0VarJ.c(m0Var.id, -512);
                    n0VarJ.w(m0Var.id, -1L);
                }
            }
            g0VarI.d();
            workDatabaseY.setTransactionSuccessful();
            workDatabaseY.endTransaction();
            return z11 || zI;
        } catch (Throwable th2) {
            workDatabaseY.endTransaction();
            throw th2;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            z.e().a(f14584e, "Rescheduling Workers.");
            this.f14587b.C();
            this.f14587b.t().f(false);
        } else if (e()) {
            z.e().a(f14584e, "Application was force-stopped, rescheduling.");
            this.f14587b.C();
            this.f14588c.e(this.f14587b.q().getClock().currentTimeMillis());
        } else if (zA) {
            z.e().a(f14584e, "Found unfinished work, scheduling it.");
            a.f(this.f14587b.q(), this.f14587b.y(), this.f14587b.w());
        }
    }

    public boolean e() {
        try {
            int i11 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f14586a, i11 >= 31 ? 570425344 : PKIFailureInfo.duplicateCertReq);
            if (i11 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f14586a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f14588c.a();
                    for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                        ApplicationExitInfo applicationExitInfoA = m.a(historicalProcessExitReasons.get(i12));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f14586a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e11) {
            e = e11;
            z.e().l(f14584e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e12) {
            e = e12;
            z.e().l(f14584e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        c cVarQ = this.f14587b.q();
        if (TextUtils.isEmpty(cVarQ.getDefaultProcessName())) {
            z.e().a(f14584e, "The default process name was not specified.");
            return true;
        }
        boolean zB = y.b(this.f14586a, cVarQ);
        z.e().a(f14584e, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f14587b.t().b();
    }

    public void i(long j11) {
        try {
            Thread.sleep(j11);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i11;
        try {
            if (f()) {
                while (true) {
                    try {
                        h0.c(this.f14586a);
                        z.e().a(f14584e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e11) {
                            i11 = this.f14589d + 1;
                            this.f14589d = i11;
                            if (i11 >= 3) {
                                String str = l.a(this.f14586a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                z zVarE = z.e();
                                String str2 = f14584e;
                                zVarE.d(str2, str, e11);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e11);
                                Consumer<Throwable> consumerE = this.f14587b.q().e();
                                if (consumerE == null) {
                                    throw illegalStateException;
                                }
                                z.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                consumerE.accept(illegalStateException);
                                break;
                            }
                            z.e().b(f14584e, "Retrying after " + (((long) i11) * 300), e11);
                            i(((long) this.f14589d) * 300);
                        }
                        z.e().b(f14584e, "Retrying after " + (((long) i11) * 300), e11);
                        i(((long) this.f14589d) * 300);
                    } catch (SQLiteException e12) {
                        z.e().c(f14584e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e12);
                        Consumer<Throwable> consumerE2 = this.f14587b.q().e();
                        if (consumerE2 == null) {
                            throw illegalStateException2;
                        }
                        consumerE2.accept(illegalStateException2);
                    }
                }
            }
            this.f14587b.B();
        } catch (Throwable th2) {
            this.f14587b.B();
            throw th2;
        }
    }
}
