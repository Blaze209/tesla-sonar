package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class i extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final Object f7470h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap<ComponentName, h> f7471i = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f7472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f7473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f7474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f7475d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f7476e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f7477f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ArrayList<d> f7478g;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarA = i.this.a();
                if (eVarA == null) {
                    return null;
                }
                i.this.g(eVarA.getIntent());
                eVarA.complete();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r11) {
            i.this.i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r11) {
            i.this.i();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    static final class c extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f7480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f7481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f7482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f7483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f7484h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f7480d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f7481e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f7482f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.i.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f7495a);
            if (this.f7480d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f7483g) {
                            this.f7483g = true;
                            if (!this.f7484h) {
                                this.f7481e.acquire(60000L);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // androidx.core.app.i.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.f7484h) {
                        if (this.f7483g) {
                            this.f7481e.acquire(60000L);
                        }
                        this.f7484h = false;
                        this.f7482f.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.i.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f7484h) {
                        this.f7484h = true;
                        this.f7482f.acquire(600000L);
                        this.f7481e.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.i.h
        public void e() {
            synchronized (this) {
                this.f7483g = false;
            }
        }
    }

    final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f7485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f7486b;

        d(Intent intent, int i11) {
            this.f7485a = intent;
            this.f7486b = i11;
        }

        @Override // androidx.core.app.i.e
        public void complete() {
            i.this.stopSelf(this.f7486b);
        }

        @Override // androidx.core.app.i.e
        public Intent getIntent() {
            return this.f7485a;
        }
    }

    interface e {
        void complete();

        Intent getIntent();
    }

    static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i f7488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f7489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        JobParameters f7490c;

        final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final JobWorkItem f7491a;

            a(JobWorkItem jobWorkItem) {
                this.f7491a = jobWorkItem;
            }

            @Override // androidx.core.app.i.e
            public void complete() {
                synchronized (f.this.f7489b) {
                    try {
                        JobParameters jobParameters = f.this.f7490c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f7491a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // androidx.core.app.i.e
            public Intent getIntent() {
                return this.f7491a.getIntent();
            }
        }

        f(i iVar) {
            super(iVar);
            this.f7489b = new Object();
            this.f7488a = iVar;
        }

        @Override // androidx.core.app.i.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.i.b
        public e b() {
            synchronized (this.f7489b) {
                try {
                    JobParameters jobParameters = this.f7490c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f7488a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f7490c = jobParameters;
            this.f7488a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f7488a.b();
            synchronized (this.f7489b) {
                this.f7490c = null;
            }
            return zB;
        }
    }

    static final class g extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JobInfo f7493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final JobScheduler f7494e;

        g(Context context, ComponentName componentName, int i11) {
            super(componentName);
            b(i11);
            this.f7493d = new JobInfo.Builder(i11, this.f7495a).setOverrideDeadline(0L).build();
            this.f7494e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.i.h
        void a(Intent intent) {
            this.f7494e.enqueue(this.f7493d, j.a(intent));
        }
    }

    static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f7495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7497c;

        h(ComponentName componentName) {
            this.f7495a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i11) {
            if (!this.f7496b) {
                this.f7496b = true;
                this.f7497c = i11;
            } else {
                if (this.f7497c == i11) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i11 + " is different than previous " + this.f7497c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public i() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7478g = null;
        } else {
            this.f7478g = new ArrayList<>();
        }
    }

    public static void c(Context context, ComponentName componentName, int i11, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f7470h) {
            h hVarF = f(context, componentName, true, i11);
            hVarF.b(i11);
            hVarF.a(intent);
        }
    }

    public static void d(Context context, Class<?> cls, int i11, Intent intent) {
        c(context, new ComponentName(context, cls), i11, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z11, int i11) {
        h cVar;
        HashMap<ComponentName, h> map = f7471i;
        h hVar = map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z11) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i11);
        }
        map.put(componentName, cVar);
        return cVar;
    }

    e a() {
        b bVar = this.f7472a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f7478g) {
            try {
                if (this.f7478g.size() <= 0) {
                    return null;
                }
                return this.f7478g.remove(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean b() {
        a aVar = this.f7474c;
        if (aVar != null) {
            aVar.cancel(this.f7475d);
        }
        this.f7476e = true;
        return h();
    }

    void e(boolean z11) {
        if (this.f7474c == null) {
            this.f7474c = new a();
            h hVar = this.f7473b;
            if (hVar != null && z11) {
                hVar.d();
            }
            this.f7474c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    void i() {
        ArrayList<d> arrayList = this.f7478g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f7474c = null;
                    ArrayList<d> arrayList2 = this.f7478g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f7477f) {
                        this.f7473b.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f7472a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7472a = new f(this);
            this.f7473b = null;
        } else {
            this.f7472a = null;
            this.f7473b = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f7478g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f7477f = true;
                this.f7473b.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (this.f7478g == null) {
            return 2;
        }
        this.f7473b.e();
        synchronized (this.f7478g) {
            ArrayList<d> arrayList = this.f7478g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i12));
            e(true);
        }
        return 3;
    }
}
