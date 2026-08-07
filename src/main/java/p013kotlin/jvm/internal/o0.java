package p013kotlin.jvm.internal;

import co0.d;
import co0.g;
import co0.h;
import co0.j;
import co0.k;
import co0.n;
import co0.o;
import co0.p;
import co0.q;
import co0.s;
import fo0.a3;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p0 f86530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d[] f86531b;

    static {
        p0 p0Var = null;
        try {
            p0Var = (p0) a3.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (p0Var == null) {
            p0Var = new p0();
        }
        f86530a = p0Var;
        f86531b = new d[0];
    }

    public static h a(o oVar) {
        return f86530a.a(oVar);
    }

    public static d b(Class cls) {
        return f86530a.b(cls);
    }

    public static g c(Class cls) {
        return f86530a.c(cls, "");
    }

    public static g d(Class cls, String str) {
        return f86530a.c(cls, str);
    }

    public static j e(w wVar) {
        return f86530a.d(wVar);
    }

    public static k f(y yVar) {
        return f86530a.e(yVar);
    }

    public static q g(Class cls) {
        return f86530a.k(b(cls), Collections.EMPTY_LIST, true);
    }

    public static q h(Class cls, s sVar) {
        return f86530a.k(b(cls), Collections.singletonList(sVar), true);
    }

    public static q i(Class cls, s sVar, s sVar2) {
        return f86530a.k(b(cls), Arrays.asList(sVar, sVar2), true);
    }

    public static n j(c0 c0Var) {
        return f86530a.f(c0Var);
    }

    public static o k(e0 e0Var) {
        return f86530a.g(e0Var);
    }

    public static p l(g0 g0Var) {
        return f86530a.h(g0Var);
    }

    public static String m(n nVar) {
        return f86530a.i(nVar);
    }

    public static String n(u uVar) {
        return f86530a.j(uVar);
    }

    public static q o(Class cls) {
        return f86530a.k(b(cls), Collections.EMPTY_LIST, false);
    }

    public static q p(Class cls, s sVar) {
        return f86530a.k(b(cls), Collections.singletonList(sVar), false);
    }

    public static q q(Class cls, s sVar, s sVar2) {
        return f86530a.k(b(cls), Arrays.asList(sVar, sVar2), false);
    }

    public static q r(Class cls, s... sVarArr) {
        return f86530a.k(b(cls), p013kotlin.collections.n.w1(sVarArr), false);
    }
}
