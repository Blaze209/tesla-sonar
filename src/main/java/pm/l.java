package pm;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f103270a;

    public l(m mVar) {
        this.f103270a = mVar;
    }

    private static kk.g b(kk.d dVar, kk.f fVar) {
        return c(dVar, fVar, Executors.newSingleThreadExecutor());
    }

    private static kk.g c(kk.d dVar, kk.f fVar, Executor executor) {
        return new kk.g(fVar, dVar.h(), new kk.g.c(dVar.k(), dVar.j(), dVar.f()), dVar.e(), dVar.d(), dVar.g(), executor, dVar.i());
    }

    @Override // pm.q
    public kk.k a(kk.d dVar) {
        return b(dVar, this.f103270a.a(dVar));
    }
}
