package bg;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class p<V, O> implements o<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<ig.a<V>> f17126a;

    p(List<ig.a<V>> list) {
        this.f17126a = list;
    }

    @Override // bg.o
    public List<ig.a<V>> b() {
        return this.f17126a;
    }

    @Override // bg.o
    public boolean isStatic() {
        return this.f17126a.isEmpty() || (this.f17126a.size() == 1 && this.f17126a.get(0).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f17126a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f17126a.toArray()));
        }
        return sb2.toString();
    }
}
