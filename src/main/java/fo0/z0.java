package fo0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
class z0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.p f66310a;

    public z0(wn0.p pVar) {
        this.f66310a = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return c1.x(this.f66310a, obj, obj2);
    }
}
