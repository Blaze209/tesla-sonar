package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.z;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f14699e = z.i("ListenableWorkerImplClient");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f14700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f14701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f14702c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f14703d;

    public static class a implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f14704b = z.i("ListenableWorkerImplSession");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.work.impl.utils.futures.b<androidx.work.multiprocess.a> f14705a = androidx.work.impl.utils.futures.b.s();

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            z.e().k(f14704b, "Binding died");
            this.f14705a.q(new RuntimeException("Binding died"));
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            z.e().c(f14704b, "Unable to bind to service");
            this.f14705a.q(new RuntimeException("Cannot bind to service " + componentName));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            z.e().a(f14704b, "Service connected");
            this.f14705a.p(androidx.work.multiprocess.a.AbstractBinderC0250a.R2(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            z.e().k(f14704b, "Service disconnected");
            this.f14705a.q(new RuntimeException("Service disconnected"));
        }
    }

    public e(Context context, Executor executor) {
        this.f14700a = context;
        this.f14701b = executor;
    }

    private static void d(a aVar, Throwable th2) {
        z.e().d(f14699e, "Unable to bind to service", th2);
        aVar.f14705a.q(th2);
    }

    public s<byte[]> a(ComponentName componentName, wb.b<androidx.work.multiprocess.a> bVar) {
        return b(c(componentName), bVar);
    }

    @SuppressLint({"LambdaLast"})
    public s<byte[]> b(s<androidx.work.multiprocess.a> sVar, wb.b<androidx.work.multiprocess.a> bVar) {
        return f.a(this.f14701b, sVar, bVar);
    }

    public s<androidx.work.multiprocess.a> c(ComponentName componentName) {
        androidx.work.impl.utils.futures.b<androidx.work.multiprocess.a> bVar;
        synchronized (this.f14702c) {
            try {
                if (this.f14703d == null) {
                    z.e().a(f14699e, "Binding to " + componentName.getPackageName() + ", " + componentName.getClassName());
                    this.f14703d = new a();
                    try {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        if (!this.f14700a.bindService(intent, this.f14703d, 1)) {
                            d(this.f14703d, new RuntimeException("Unable to bind to service"));
                        }
                    } catch (Throwable th2) {
                        d(this.f14703d, th2);
                    }
                }
                bVar = this.f14703d.f14705a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    public void e() {
        synchronized (this.f14702c) {
            try {
                a aVar = this.f14703d;
                if (aVar != null) {
                    this.f14700a.unbindService(aVar);
                    this.f14703d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
