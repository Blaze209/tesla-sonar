package p013kotlin.jvm.internal;

import co0.d;
import co0.f;
import co0.g;
import co0.h;
import co0.j;
import co0.k;
import co0.n;
import co0.o;
import co0.p;
import co0.q;
import co0.s;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class p0 {
    public d b(Class cls) {
        return new i(cls);
    }

    public g c(Class cls, String str) {
        return new b0(cls, str);
    }

    public String i(n nVar) {
        String string = nVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(u uVar) {
        return i(uVar);
    }

    public q k(f fVar, List<s> list, boolean z11) {
        return new x0(fVar, list, z11);
    }

    public h a(o oVar) {
        return oVar;
    }

    public j d(w wVar) {
        return wVar;
    }

    public k e(y yVar) {
        return yVar;
    }

    public n f(c0 c0Var) {
        return c0Var;
    }

    public o g(e0 e0Var) {
        return e0Var;
    }

    public p h(g0 g0Var) {
        return g0Var;
    }
}
