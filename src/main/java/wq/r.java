package wq;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f122221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qq.e f122222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xq.d f122223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f122224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f122225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yq.a f122226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zq.a f122227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zq.a f122228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final xq.c f122229i;

    public r(Context context, qq.e eVar, xq.d dVar, x xVar, Executor executor, yq.a aVar, zq.a aVar2, zq.a aVar3, xq.c cVar) {
        this.f122221a = context;
        this.f122222b = eVar;
        this.f122223c = dVar;
        this.f122224d = xVar;
        this.f122225e = executor;
        this.f122226f = aVar;
        this.f122227g = aVar2;
        this.f122228h = aVar3;
        this.f122229i = cVar;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, pq.p pVar, long j11) {
        rVar.f122223c.C2(iterable);
        rVar.f122223c.C1(pVar, rVar.f122227g.a() + j11);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f122229i.c();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f122223c.N1(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, pq.p pVar, int i11) {
        rVar.f122224d.b(pVar, i11 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, pq.p pVar, long j11) {
        rVar.f122223c.C1(pVar, rVar.f122227g.a() + j11);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rVar.f122229i.p(((Integer) entry.getValue()).intValue(), sq.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final pq.p pVar, final int i11, Runnable runnable) {
        rVar.getClass();
        try {
            yq.a aVar = rVar.f122226f;
            final xq.d dVar = rVar.f122223c;
            Objects.requireNonNull(dVar);
            aVar.o(new yq.a.InterfaceC2734a() { // from class: wq.i
                @Override // yq.a.InterfaceC2734a
                public final Object execute() {
                    return Integer.valueOf(dVar.r());
                }
            });
            if (rVar.k()) {
                rVar.l(pVar, i11);
            } else {
                rVar.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.j
                    @Override // yq.a.InterfaceC2734a
                    public final Object execute() {
                        return r.f(this.f122202a, pVar, i11);
                    }
                });
            }
        } catch (SynchronizationException unused) {
            rVar.f122224d.b(pVar, i11 + 1);
        } finally {
            runnable.run();
        }
    }

    public pq.i j(qq.m mVar) {
        yq.a aVar = this.f122226f;
        final xq.c cVar = this.f122229i;
        Objects.requireNonNull(cVar);
        return mVar.b(pq.i.a().i(this.f122227g.a()).o(this.f122228h.a()).n("GDT_CLIENT_METRICS").h(new pq.h(nq.c.b("proto"), ((sq.a) aVar.o(new yq.a.InterfaceC2734a() { // from class: wq.h
            @Override // yq.a.InterfaceC2734a
            public final Object execute() {
                return cVar.n();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f122221a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public qq.g l(final pq.p pVar, int i11) {
        qq.g gVarA;
        qq.m mVar = this.f122222b.get(pVar.b());
        qq.g gVarE = qq.g.e(0L);
        final long j11 = 0;
        while (((Boolean) this.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.k
            @Override // yq.a.InterfaceC2734a
            public final Object execute() {
                return Boolean.valueOf(this.f122205a.f122223c.H3(pVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.l
                @Override // yq.a.InterfaceC2734a
                public final Object execute() {
                    return this.f122207a.f122223c.E1(pVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVar == null) {
                tq.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                gVarA = qq.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xq.k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(mVar));
                }
                gVarA = mVar.a(qq.f.a().b(arrayList).c(pVar.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == qq.g.a.TRANSIENT_ERROR) {
                final pq.p pVar2 = pVar;
                this.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.m
                    @Override // yq.a.InterfaceC2734a
                    public final Object execute() {
                        return r.b(this.f122209a, iterable, pVar2, j11);
                    }
                });
                this.f122224d.a(pVar2, i11 + 1, true);
                return gVarE;
            }
            pq.p pVar3 = pVar;
            this.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.n
                @Override // yq.a.InterfaceC2734a
                public final Object execute() {
                    return r.e(this.f122213a, iterable);
                }
            });
            if (gVarE.c() == qq.g.a.OK) {
                long jMax = Math.max(j11, gVarE.b());
                if (pVar3.e()) {
                    this.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.o
                        @Override // yq.a.InterfaceC2734a
                        public final Object execute() {
                            return r.c(this.f122215a);
                        }
                    });
                }
                j11 = jMax;
            } else if (gVarE.c() == qq.g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strN = ((xq.k) it2.next()).b().n();
                    if (map.containsKey(strN)) {
                        map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    } else {
                        map.put(strN, 1);
                    }
                }
                this.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.p
                    @Override // yq.a.InterfaceC2734a
                    public final Object execute() {
                        return r.h(this.f122216a, map);
                    }
                });
            }
            pVar = pVar3;
        }
        final pq.p pVar4 = pVar;
        this.f122226f.o(new yq.a.InterfaceC2734a() { // from class: wq.q
            @Override // yq.a.InterfaceC2734a
            public final Object execute() {
                return r.g(this.f122218a, pVar4, j11);
            }
        });
        return gVarE;
    }

    public void m(final pq.p pVar, final int i11, final Runnable runnable) {
        this.f122225e.execute(new Runnable() { // from class: wq.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f122196a, pVar, i11, runnable);
            }
        });
    }
}
