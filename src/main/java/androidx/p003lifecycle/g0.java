package androidx.p003lifecycle;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import q.b;

/* JADX INFO: loaded from: classes.dex */
public class g0<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b<d0<?>, a<?>> f8801b = new b<>();

    private static class a<V> implements j0<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d0<V> f8802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j0<? super V> f8803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8804c = -1;

        a(d0<V> d0Var, j0<? super V> j0Var) {
            this.f8802a = d0Var;
            this.f8803b = j0Var;
        }

        void a() {
            this.f8802a.observeForever(this);
        }

        void b() {
            this.f8802a.removeObserver(this);
        }

        @Override // androidx.p003lifecycle.j0
        public void onChanged(V v11) {
            if (this.f8804c != this.f8802a.getVersion()) {
                this.f8804c = this.f8802a.getVersion();
                this.f8803b.onChanged(v11);
            }
        }
    }

    public <S> void b(@NonNull d0<S> d0Var, @NonNull j0<? super S> j0Var) {
        if (d0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(d0Var, j0Var);
        a<?> aVarG = this.f8801b.g(d0Var, aVar);
        if (aVarG != null && aVarG.f8803b != j0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarG == null && hasActiveObservers()) {
            aVar.a();
        }
    }

    public <S> void c(@NonNull d0<S> d0Var) {
        a<?> aVarH = this.f8801b.h(d0Var);
        if (aVarH != null) {
            aVarH.b();
        }
    }

    @Override // androidx.p003lifecycle.d0
    protected void onActive() {
        Iterator<Map.Entry<d0<?>, a<?>>> it = this.f8801b.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.p003lifecycle.d0
    protected void onInactive() {
        Iterator<Map.Entry<d0<?>, a<?>>> it = this.f8801b.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }
}
