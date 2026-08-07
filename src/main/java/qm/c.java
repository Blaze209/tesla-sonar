package qm;

import com.facebook.imagepipeline.producers.a1;
import com.facebook.imagepipeline.producers.h1;
import com.facebook.imagepipeline.producers.z0;

/* JADX INFO: loaded from: classes3.dex */
public class c<T> extends a<tk.a<T>> {
    private c(z0<tk.a<T>> z0Var, h1 h1Var, wm.d dVar) {
        super(z0Var, h1Var, dVar);
    }

    public static <T> com.facebook.datasource.c<tk.a<T>> E(z0<tk.a<T>> z0Var, h1 h1Var, wm.d dVar) {
        if (bn.b.d()) {
            bn.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        c cVar = new c(z0Var, h1Var, dVar);
        if (bn.b.d()) {
            bn.b.b();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.datasource.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void e(tk.a<T> aVar) {
        tk.a.C(aVar);
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public tk.a<T> getResult() {
        return tk.a.t((tk.a) super.getResult());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qm.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void C(tk.a<T> aVar, int i11, a1 a1Var) {
        super.C(tk.a.t(aVar), i11, a1Var);
    }
}
