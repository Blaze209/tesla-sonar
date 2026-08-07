package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.m;
import androidx.work.z;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import lb.e;
import lb.e1;
import ob.i;
import ob.n;
import sb.WorkGenerationalId;
import sb.m0;
import sb.v1;

/* JADX INFO: loaded from: classes3.dex */
public class a implements i, e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f14571k = z.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f14572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e1 f14573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ub.b f14574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f14575d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    WorkGenerationalId f14576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<WorkGenerationalId, m> f14577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<WorkGenerationalId, m0> f14578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<WorkGenerationalId, Job> f14579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final ob.m f14580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f14581j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0247a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14582a;

        RunnableC0247a(String str) {
            this.f14582a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0 m0VarG = a.this.f14573b.u().g(this.f14582a);
            if (m0VarG == null || !m0VarG.m()) {
                return;
            }
            synchronized (a.this.f14575d) {
                a.this.f14578g.put(v1.a(m0VarG), m0VarG);
                a aVar = a.this;
                a.this.f14579h.put(v1.a(m0VarG), n.c(aVar.f14580i, m0VarG, aVar.f14574c.a(), a.this));
            }
        }
    }

    interface b {
        void a(int i11, Notification notification);

        void b(int i11);

        void c(int i11, int i12, Notification notification);

        void d(int i11);
    }

    a(Context context) {
        this.f14572a = context;
        e1 e1VarS = e1.s(context);
        this.f14573b = e1VarS;
        this.f14574c = e1VarS.A();
        this.f14576e = null;
        this.f14577f = new LinkedHashMap();
        this.f14579h = new HashMap();
        this.f14578g = new HashMap();
        this.f14580i = new ob.m(this.f14573b.x());
        this.f14573b.u().e(this);
    }

    public static Intent e(Context context, WorkGenerationalId workGenerationalId, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.a());
        intent.putExtra("KEY_NOTIFICATION", mVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.a());
        intent.putExtra("KEY_NOTIFICATION", mVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        z.e().f(f14571k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f14573b.n(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        if (this.f14581j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        z.e().a(f14571k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        m mVar = new m(intExtra, notification, intExtra2);
        this.f14577f.put(workGenerationalId, mVar);
        m mVar2 = this.f14577f.get(this.f14576e);
        if (mVar2 == null) {
            this.f14576e = workGenerationalId;
        } else {
            this.f14581j.a(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, m>> it = this.f14577f.entrySet().iterator();
                while (it.hasNext()) {
                    iA |= it.next().getValue().a();
                }
                mVar = new m(mVar2.c(), mVar2.b(), iA);
            } else {
                mVar = mVar2;
            }
        }
        this.f14581j.c(mVar.c(), mVar.a(), mVar.b());
    }

    private void j(Intent intent) {
        z.e().f(f14571k, "Started foreground service " + intent);
        this.f14574c.b(new RunnableC0247a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // ob.i
    public void a(m0 m0Var, ob.b bVar) {
        if (bVar instanceof ob.b.ConstraintsNotMet) {
            String str = m0Var.id;
            z.e().a(f14571k, "Constraints unmet for WorkSpec " + str);
            this.f14573b.E(v1.a(m0Var), ((ob.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    @Override // lb.e
    public void d(WorkGenerationalId workGenerationalId, boolean z11) {
        Map.Entry<WorkGenerationalId, m> entry;
        synchronized (this.f14575d) {
            try {
                Job jobRemove = this.f14578g.remove(workGenerationalId) != null ? this.f14579h.remove(workGenerationalId) : null;
                if (jobRemove != null) {
                    jobRemove.cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m mVarRemove = this.f14577f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f14576e)) {
            if (this.f14577f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, m>> it = this.f14577f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, m> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f14576e = entry.getKey();
                if (this.f14581j != null) {
                    m value = entry.getValue();
                    this.f14581j.c(value.c(), value.a(), value.b());
                    this.f14581j.d(value.c());
                }
            } else {
                this.f14576e = null;
            }
        }
        b bVar = this.f14581j;
        if (mVarRemove == null || bVar == null) {
            return;
        }
        z.e().a(f14571k, "Removing Notification (id: " + mVarRemove.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + mVarRemove.a());
        bVar.d(mVarRemove.c());
    }

    void k(Intent intent, int i11) {
        z.e().f(f14571k, "Stopping foreground service");
        b bVar = this.f14581j;
        if (bVar != null) {
            bVar.b(i11);
        }
    }

    void l() {
        this.f14581j = null;
        synchronized (this.f14575d) {
            try {
                Iterator<Job> it = this.f14579h.values().iterator();
                while (it.hasNext()) {
                    it.next().cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14573b.u().m(this);
    }

    void m(Intent intent, int i11) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent, i11);
        }
    }

    void n(int i11, int i12) {
        z.e().f(f14571k, "Foreground service timed out, FGS type: " + i12);
        for (Map.Entry<WorkGenerationalId, m> entry : this.f14577f.entrySet()) {
            if (entry.getValue().a() == i12) {
                this.f14573b.E(entry.getKey(), RangingPosition.RSSI_UNKNOWN);
            }
        }
        b bVar = this.f14581j;
        if (bVar != null) {
            bVar.b(i11);
        }
    }

    void o(b bVar) {
        if (this.f14581j != null) {
            z.e().c(f14571k, "A callback already exists.");
        } else {
            this.f14581j = bVar;
        }
    }
}
