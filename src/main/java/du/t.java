package du;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f61034n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f61035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f61036b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f61041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f61042h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f61046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IInterface f61047m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f61038d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f61039e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f61040f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f61044j = new IBinder.DeathRecipient() { // from class: du.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f61023a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f61045k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f61037c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f61043i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, cu.h hVar, o oVar) {
        this.f61035a = context;
        this.f61036b = iVar;
        this.f61042h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.f61036b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f61043i.get();
        if (oVar != null) {
            tVar.f61036b.c("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.f61036b.c("%s : Binder has died.", tVar.f61037c);
            Iterator it = tVar.f61038d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f61038d.clear();
        }
        synchronized (tVar.f61040f) {
            tVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final t tVar, final TaskCompletionSource taskCompletionSource) {
        tVar.f61039e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: du.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f61024a.t(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f61047m != null || tVar.f61041g) {
            if (!tVar.f61041g) {
                jVar.run();
                return;
            } else {
                tVar.f61036b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f61038d.add(jVar);
                return;
            }
        }
        tVar.f61036b.c("Initiate binding to the service.", new Object[0]);
        tVar.f61038d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f61046l = rVar;
        tVar.f61041g = true;
        if (tVar.f61035a.bindService(tVar.f61042h, rVar, 1)) {
            return;
        }
        tVar.f61036b.c("Failed to bind to the service.", new Object[0]);
        tVar.f61041g = false;
        Iterator it = tVar.f61038d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new zzu());
        }
        tVar.f61038d.clear();
    }

    static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.f61036b.c("linkToDeath", new Object[0]);
        try {
            tVar.f61047m.asBinder().linkToDeath(tVar.f61044j, 0);
        } catch (RemoteException e11) {
            tVar.f61036b.b(e11, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.f61036b.c("unlinkToDeath", new Object[0]);
        tVar.f61047m.asBinder().unlinkToDeath(tVar.f61044j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f61037c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f61039e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(v());
        }
        this.f61039e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f61034n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f61037c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f61037c, 10);
                    handlerThread.start();
                    map.put(this.f61037c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f61037c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f61047m;
    }

    public final void s(j jVar, TaskCompletionSource taskCompletionSource) {
        c().post(new m(this, jVar.b(), taskCompletionSource, jVar));
    }

    final /* synthetic */ void t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f61040f) {
            this.f61039e.remove(taskCompletionSource);
        }
    }

    public final void u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f61040f) {
            this.f61039e.remove(taskCompletionSource);
        }
        c().post(new n(this));
    }
}
