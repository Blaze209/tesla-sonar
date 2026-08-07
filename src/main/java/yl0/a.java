package yl0;

import cm0.h;
import io.reactivex.rxjava3.core.t;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile h<Callable<t>, t> f125704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile h<t, t> f125705b;

    static <T, R> R a(h<T, R> hVar, T t11) {
        try {
            return hVar.apply(t11);
        } catch (Throwable th2) {
            throw bm0.a.a(th2);
        }
    }

    static t b(h<Callable<t>, t> hVar, Callable<t> callable) {
        t tVar = (t) a(hVar, callable);
        if (tVar != null) {
            return tVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static t c(Callable<t> callable) {
        try {
            t tVarCall = callable.call();
            if (tVarCall != null) {
                return tVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw bm0.a.a(th2);
        }
    }

    public static t d(Callable<t> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        h<Callable<t>, t> hVar = f125704a;
        return hVar == null ? c(callable) : b(hVar, callable);
    }

    public static t e(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        h<t, t> hVar = f125705b;
        return hVar == null ? tVar : (t) a(hVar, tVar);
    }
}
