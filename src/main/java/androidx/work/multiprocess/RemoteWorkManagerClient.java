package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.c0;
import androidx.work.j0;
import androidx.work.k;
import androidx.work.m0;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import androidx.work.q0;
import androidx.work.u0;
import androidx.work.z;
import com.google.common.util.concurrent.s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import lb.e0;
import lb.e1;
import xb.l;
import xb.p;
import xb.q;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteWorkManagerClient extends wb.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f14664j = z.i("RemoteWorkManagerClient");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r.a<byte[], Void> f14665k = new r.a() { // from class: wb.g
        @Override // r.a
        public final Object apply(Object obj) {
            return RemoteWorkManagerClient.i((byte[]) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f14667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e1 f14668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Executor f14669d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile long f14671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f14672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m0 f14673h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f14670e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f14666a = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f14674i = new e(this);

    class a implements wb.b<androidx.work.multiprocess.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14675a;

        a(List list) {
            this.f14675a = list;
        }

        @Override // wb.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.work.multiprocess.b bVar, androidx.work.multiprocess.c cVar) {
            bVar.q1(xb.a.a(new q((List<u0>) this.f14675a)), cVar);
        }
    }

    class b implements wb.b<androidx.work.multiprocess.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0 f14677a;

        b(q0 q0Var) {
            this.f14677a = q0Var;
        }

        @Override // wb.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.work.multiprocess.b bVar, androidx.work.multiprocess.c cVar) {
            bVar.y0(xb.a.a(new l((e0) this.f14677a)), cVar);
        }
    }

    class c implements wb.b<androidx.work.multiprocess.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14679a;

        c(String str) {
            this.f14679a = str;
        }

        @Override // wb.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.work.multiprocess.b bVar, androidx.work.multiprocess.c cVar) {
            bVar.I(this.f14679a, cVar);
        }
    }

    public static class d implements ServiceConnection {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f14681c = z.i("RemoteWMgr.Connection");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.work.impl.utils.futures.b<androidx.work.multiprocess.b> f14682a = androidx.work.impl.utils.futures.b.s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final RemoteWorkManagerClient f14683b;

        public d(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.f14683b = remoteWorkManagerClient;
        }

        public void a() {
            z.e().a(f14681c, "Binding died");
            this.f14682a.q(new RuntimeException("Binding died"));
            this.f14683b.m();
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            a();
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            z.e().c(f14681c, "Unable to bind to service");
            this.f14682a.q(new RuntimeException("Cannot bind to service " + componentName));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            z.e().a(f14681c, "Service connected");
            this.f14682a.p(androidx.work.multiprocess.b.a.R2(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            z.e().a(f14681c, "Service disconnected");
            this.f14682a.q(new RuntimeException("Service disconnected"));
            this.f14683b.m();
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f14684b = z.i("SessionHandler");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RemoteWorkManagerClient f14685a;

        public e(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.f14685a = remoteWorkManagerClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jV = this.f14685a.v();
            synchronized (this.f14685a.w()) {
                try {
                    long jV2 = this.f14685a.v();
                    d dVarS = this.f14685a.s();
                    if (dVarS != null) {
                        if (jV == jV2) {
                            z.e().a(f14684b, "Unbinding service");
                            this.f14685a.r().unbindService(dVarS);
                            dVarS.a();
                        } else {
                            z.e().a(f14684b, "Ignoring request to unbind.");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public RemoteWorkManagerClient(Context context, e1 e1Var) {
        this.f14667b = context.getApplicationContext();
        this.f14668c = e1Var;
        this.f14669d = e1Var.A().d();
        this.f14672g = e1Var.q().getRemoteSessionTimeoutMillis();
        this.f14673h = e1Var.q().getRunnableScheduler();
    }

    private void A(d dVar, Throwable th2) {
        z.e().d(f14664j, "Unable to bind to service", th2);
        dVar.f14682a.q(th2);
    }

    public static /* synthetic */ Void i(byte[] bArr) {
        return null;
    }

    public static /* synthetic */ void k(RemoteWorkManagerClient remoteWorkManagerClient, s sVar) {
        remoteWorkManagerClient.getClass();
        try {
            sVar.get();
        } catch (InterruptedException | ExecutionException unused) {
            remoteWorkManagerClient.m();
        }
    }

    private static Intent z(Context context) {
        return new Intent(context, (Class<?>) RemoteWorkManagerService.class);
    }

    @Override // wb.f
    public wb.d b(String str, androidx.work.l lVar, List<c0> list) {
        return new wb.e(this, this.f14668c.j(str, lVar, list));
    }

    @Override // wb.f
    public s<Void> c(String str) {
        return wb.a.a(q(new c(str)), f14665k, this.f14669d);
    }

    @Override // wb.f
    public s<Void> d(u0 u0Var) {
        return o(Collections.singletonList(u0Var));
    }

    @Override // wb.f
    public s<Void> e(final String str, k kVar, final j0 j0Var) {
        return kVar == k.UPDATE ? wb.a.a(q(new wb.b() { // from class: wb.j
            @Override // wb.b
            public final void a(Object obj, androidx.work.multiprocess.c cVar) {
                androidx.work.multiprocess.b bVar = (androidx.work.multiprocess.b) obj;
                bVar.h0(str, xb.a.a(new p(j0Var)), cVar);
            }
        }), f14665k, this.f14669d) : n(this.f14668c.o(str, kVar, j0Var));
    }

    @Override // wb.f
    public s<Void> g(String str, androidx.work.l lVar, List<c0> list) {
        return b(str, lVar, list).a();
    }

    public void m() {
        synchronized (this.f14670e) {
            z.e().a(f14664j, "Cleaning up.");
            this.f14666a = null;
        }
    }

    public s<Void> n(q0 q0Var) {
        return wb.a.a(q(new b(q0Var)), f14665k, this.f14669d);
    }

    public s<Void> o(List<u0> list) {
        return wb.a.a(q(new a(list)), f14665k, this.f14669d);
    }

    s<byte[]> p(final s<androidx.work.multiprocess.b> sVar, wb.b<androidx.work.multiprocess.b> bVar) {
        sVar.b(new Runnable() { // from class: wb.h
            @Override // java.lang.Runnable
            public final void run() {
                RemoteWorkManagerClient.k(this.f121648a, sVar);
            }
        }, this.f14669d);
        s<byte[]> sVarA = f.a(this.f14669d, sVar, bVar);
        sVarA.b(new Runnable() { // from class: wb.i
            @Override // java.lang.Runnable
            public final void run() {
                RemoteWorkManagerClient remoteWorkManagerClient = this.f121650a;
                remoteWorkManagerClient.f14673h.b(remoteWorkManagerClient.x(), remoteWorkManagerClient.y());
            }
        }, this.f14669d);
        return sVarA;
    }

    public s<byte[]> q(wb.b<androidx.work.multiprocess.b> bVar) {
        return p(t(), bVar);
    }

    public Context r() {
        return this.f14667b;
    }

    public d s() {
        return this.f14666a;
    }

    public s<androidx.work.multiprocess.b> t() {
        return u(z(this.f14667b));
    }

    s<androidx.work.multiprocess.b> u(Intent intent) {
        androidx.work.impl.utils.futures.b<androidx.work.multiprocess.b> bVar;
        synchronized (this.f14670e) {
            try {
                this.f14671f++;
                if (this.f14666a == null) {
                    z.e().a(f14664j, "Creating a new session");
                    d dVar = new d(this);
                    this.f14666a = dVar;
                    try {
                        if (!this.f14667b.bindService(intent, dVar, 1)) {
                            A(this.f14666a, new RuntimeException("Unable to bind to service"));
                        }
                    } catch (Throwable th2) {
                        A(this.f14666a, th2);
                    }
                }
                this.f14673h.a(this.f14674i);
                bVar = this.f14666a.f14682a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    public long v() {
        return this.f14671f;
    }

    public Object w() {
        return this.f14670e;
    }

    public long x() {
        return this.f14672g;
    }

    public e y() {
        return this.f14674i;
    }
}
