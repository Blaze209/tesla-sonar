package lj;

import androidx.annotation.NonNull;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public class b<T> implements fj.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f90047a;

    public b(@NonNull T t11) {
        this.f90047a = (T) k.d(t11);
    }

    @Override // fj.c
    @NonNull
    public Class<T> a() {
        return (Class<T>) this.f90047a.getClass();
    }

    @Override // fj.c
    @NonNull
    public final T get() {
        return this.f90047a;
    }

    @Override // fj.c
    public final int getSize() {
        return 1;
    }

    @Override // fj.c
    public void recycle() {
    }
}
