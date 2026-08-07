package wq;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f122241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xq.d f122242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f122243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yq.a f122244d;

    v(Executor executor, xq.d dVar, x xVar, yq.a aVar) {
        this.f122241a = executor;
        this.f122242b = dVar;
        this.f122243c = xVar;
        this.f122244d = aVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator<pq.p> it = vVar.f122242b.X1().iterator();
        while (it.hasNext()) {
            vVar.f122243c.b(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f122241a.execute(new Runnable() { // from class: wq.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f122239a;
                vVar.f122244d.o(new yq.a.InterfaceC2734a() { // from class: wq.u
                    @Override // yq.a.InterfaceC2734a
                    public final Object execute() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
