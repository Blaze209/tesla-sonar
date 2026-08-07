package iu;

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
import com.google.android.play.integrity.internal.af;
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
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f81879o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f81880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f81881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f81882c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f81886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f81887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s0 f81888i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ServiceConnection f81892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IInterface f81893n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f81883d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f81884e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f81885f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f81890k = new IBinder.DeathRecipient() { // from class: iu.n0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            f.k(this.f81901a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f81891l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f81889j = new WeakReference(null);

    public f(Context context, l0 l0Var, String str, Intent intent, s0 s0Var, r0 r0Var) {
        this.f81880a = context;
        this.f81881b = l0Var;
        this.f81882c = str;
        this.f81887h = intent;
        this.f81888i = s0Var;
    }

    public static /* synthetic */ void k(f fVar) {
        l0 l0Var = fVar.f81881b;
        l0Var.b("reportBinderDeath", new Object[0]);
        r0 r0Var = (r0) fVar.f81889j.get();
        if (r0Var != null) {
            l0Var.b("calling onBinderDied", new Object[0]);
            r0Var.a();
        } else {
            l0Var.b("%s : Binder has died.", fVar.f81882c);
            List list = fVar.f81883d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((m0) it.next()).a(fVar.w());
            }
            list.clear();
        }
        synchronized (fVar.f81885f) {
            fVar.x();
        }
    }

    public static /* synthetic */ void l(f fVar, TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (fVar.f81885f) {
            fVar.f81884e.remove(taskCompletionSource);
        }
    }

    static /* bridge */ /* synthetic */ void p(final f fVar, final TaskCompletionSource taskCompletionSource) {
        fVar.f81884e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: iu.o0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                f.l(this.f81905a, taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void r(f fVar, m0 m0Var) {
        if (fVar.f81893n != null || fVar.f81886g) {
            if (!fVar.f81886g) {
                m0Var.run();
                return;
            } else {
                fVar.f81881b.b("Waiting to bind to the service.", new Object[0]);
                fVar.f81883d.add(m0Var);
                return;
            }
        }
        l0 l0Var = fVar.f81881b;
        l0Var.b("Initiate binding to the service.", new Object[0]);
        List list = fVar.f81883d;
        list.add(m0Var);
        d dVar = new d(fVar, null);
        fVar.f81892m = dVar;
        fVar.f81886g = true;
        if (fVar.f81880a.bindService(fVar.f81887h, dVar, 1)) {
            return;
        }
        l0Var.b("Failed to bind to the service.", new Object[0]);
        fVar.f81886g = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).a(new af());
        }
        list.clear();
    }

    static /* bridge */ /* synthetic */ void s(f fVar) {
        fVar.f81881b.b("linkToDeath", new Object[0]);
        try {
            fVar.f81893n.asBinder().linkToDeath(fVar.f81890k, 0);
        } catch (RemoteException e11) {
            fVar.f81881b.a(e11, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void t(f fVar) {
        fVar.f81881b.b("unlinkToDeath", new Object[0]);
        fVar.f81893n.asBinder().unlinkToDeath(fVar.f81890k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f81882c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Set set = this.f81884e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        set.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f81879o;
        synchronized (map) {
            try {
                String str = this.f81882c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f81893n;
    }

    public final void u(m0 m0Var, TaskCompletionSource taskCompletionSource) {
        c().post(new p0(this, m0Var.c(), taskCompletionSource, m0Var));
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f81885f) {
            this.f81884e.remove(taskCompletionSource);
        }
        c().post(new q0(this));
    }
}
