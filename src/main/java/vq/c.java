package vq;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import nq.k;
import pq.p;
import pq.u;
import qq.m;
import wq.x;

/* JADX INFO: loaded from: classes4.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f119746f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f119747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f119748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qq.e f119749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xq.d f119750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yq.a f119751e;

    public c(Executor executor, qq.e eVar, x xVar, xq.d dVar, yq.a aVar) {
        this.f119748b = executor;
        this.f119749c = eVar;
        this.f119747a = xVar;
        this.f119750d = dVar;
        this.f119751e = aVar;
    }

    public static /* synthetic */ Object b(c cVar, p pVar, pq.i iVar) {
        cVar.f119750d.f1(pVar, iVar);
        cVar.f119747a.b(pVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final p pVar, k kVar, pq.i iVar) {
        cVar.getClass();
        try {
            m mVar = cVar.f119749c.get(pVar.b());
            if (mVar == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f119746f.warning(str);
                kVar.a(new IllegalArgumentException(str));
            } else {
                final pq.i iVarB = mVar.b(iVar);
                cVar.f119751e.o(new yq.a.InterfaceC2734a() { // from class: vq.b
                    @Override // yq.a.InterfaceC2734a
                    public final Object execute() {
                        return c.b(this.f119743a, pVar, iVarB);
                    }
                });
                kVar.a(null);
            }
        } catch (Exception e11) {
            f119746f.warning("Error scheduling event " + e11.getMessage());
            kVar.a(e11);
        }
    }

    @Override // vq.e
    public void a(final p pVar, final pq.i iVar, final k kVar) {
        this.f119748b.execute(new Runnable() { // from class: vq.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f119739a, pVar, kVar, iVar);
            }
        });
    }
}
