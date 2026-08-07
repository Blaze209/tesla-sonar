package xm;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p<T> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<T> f123745a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f<T> f123746b = new f<>();

    private T b(T t11) {
        if (t11 == null) {
            return t11;
        }
        synchronized (this) {
            this.f123745a.remove(t11);
        }
        return t11;
    }

    @Override // xm.v
    public T get(int i11) {
        return b(this.f123746b.a(i11));
    }

    @Override // xm.v
    public T pop() {
        return b(this.f123746b.f());
    }

    @Override // xm.v
    public void put(T t11) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f123745a.add(t11);
        }
        if (zAdd) {
            this.f123746b.e(a(t11), t11);
        }
    }
}
