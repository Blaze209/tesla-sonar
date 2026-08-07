package do0;

import co0.o;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes9.dex */
class a implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f60795a;

    public a(o oVar) {
        this.f60795a = oVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        return c.l(this.f60795a, (co0.d) obj);
    }
}
