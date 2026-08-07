package yu;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) d(a0.b(cls));
    }

    default <T> Set<T> b(a0<T> a0Var) {
        return c(a0Var).get();
    }

    <T> yv.b<Set<T>> c(a0<T> a0Var);

    default <T> T d(a0<T> a0Var) {
        yv.b<T> bVarE = e(a0Var);
        if (bVarE == null) {
            return null;
        }
        return bVarE.get();
    }

    <T> yv.b<T> e(a0<T> a0Var);

    default <T> Set<T> f(Class<T> cls) {
        return b(a0.b(cls));
    }

    <T> yv.a<T> g(a0<T> a0Var);

    default <T> yv.b<T> h(Class<T> cls) {
        return e(a0.b(cls));
    }

    default <T> yv.a<T> i(Class<T> cls) {
        return g(a0.b(cls));
    }
}
