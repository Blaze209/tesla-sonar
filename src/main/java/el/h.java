package el;

import android.content.res.Resources;
import java.util.concurrent.Executor;
import nm.x;
import pk.n;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f63052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hl.a f63053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tm.a f63054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tm.a f63055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Executor f63056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x<jk.d, um.e> f63057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private pk.f<tm.a> f63058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n<Boolean> f63059h;

    public void a(Resources resources, hl.a aVar, tm.a aVar2, tm.a aVar3, Executor executor, x<jk.d, um.e> xVar, pk.f<tm.a> fVar, n<Boolean> nVar) {
        this.f63052a = resources;
        this.f63053b = aVar;
        this.f63054c = aVar2;
        this.f63055d = aVar3;
        this.f63056e = executor;
        this.f63057f = xVar;
        this.f63058g = fVar;
        this.f63059h = nVar;
    }

    protected e b(Resources resources, hl.a aVar, tm.a aVar2, tm.a aVar3, Executor executor, x<jk.d, um.e> xVar, pk.f<tm.a> fVar) {
        return new e(resources, aVar, aVar2, aVar3, executor, xVar, fVar);
    }

    public e c() {
        e eVarB = b(this.f63052a, this.f63053b, this.f63054c, this.f63055d, this.f63056e, this.f63057f, this.f63058g);
        n<Boolean> nVar = this.f63059h;
        if (nVar != null) {
            eVarB.B0(nVar.get().booleanValue());
        }
        return eVarB;
    }
}
