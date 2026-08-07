package rj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f108434d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f108435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<rj.b.a> f108436b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f108437c;

    class a implements xj.f.b<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f108438a;

        a(Context context) {
            this.f108438a = context;
        }

        @Override // xj.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f108438a.getSystemService("connectivity");
        }
    }

    class b implements rj.b.a {
        b() {
        }

        @Override // rj.b.a
        public void a(boolean z11) {
            ArrayList arrayList;
            xj.l.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f108436b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((rj.b.a) it.next()).a(z11);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f108441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final rj.b.a f108442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xj.f.b<ConnectivityManager> f108443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f108444d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: rj.r$d$a$a, reason: collision with other inner class name */
            class RunnableC2304a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f108446a;

                RunnableC2304a(boolean z11) {
                    this.f108446a = z11;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f108446a);
                }
            }

            a() {
            }

            private void b(boolean z11) {
                xj.l.v(new RunnableC2304a(z11));
            }

            void a(boolean z11) {
                xj.l.b();
                d dVar = d.this;
                boolean z12 = dVar.f108441a;
                dVar.f108441a = z11;
                if (z12 != z11) {
                    dVar.f108442b.a(z11);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                b(false);
            }
        }

        d(xj.f.b<ConnectivityManager> bVar, rj.b.a aVar) {
            this.f108443c = bVar;
            this.f108442b = aVar;
        }

        @Override // rj.r.c
        public void a() {
            this.f108443c.get();
            ta0.a.f(this.f108444d);
        }

        @Override // rj.r.c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.f108441a = this.f108443c.get().getActiveNetwork() != null;
            try {
                this.f108443c.get();
                ta0.a.e(this.f108444d);
                return true;
            } catch (RuntimeException e11) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e11);
                }
                return false;
            }
        }
    }

    private r(@NonNull Context context) {
        this.f108435a = new d(xj.f.a(new a(context)), new b());
    }

    static r a(@NonNull Context context) {
        if (f108434d == null) {
            synchronized (r.class) {
                try {
                    if (f108434d == null) {
                        f108434d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f108434d;
    }

    private void b() {
        if (this.f108437c || this.f108436b.isEmpty()) {
            return;
        }
        this.f108437c = this.f108435a.b();
    }

    private void c() {
        if (this.f108437c && this.f108436b.isEmpty()) {
            this.f108435a.a();
            this.f108437c = false;
        }
    }

    synchronized void d(rj.b.a aVar) {
        this.f108436b.add(aVar);
        b();
    }

    synchronized void e(rj.b.a aVar) {
        this.f108436b.remove(aVar);
        c();
    }
}
