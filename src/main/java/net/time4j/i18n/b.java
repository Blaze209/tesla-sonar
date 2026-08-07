package net.time4j.i18n;

import java.util.Locale;
import java.util.Set;
import net.time4j.engine.p;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.g0;
import net.time4j.history.j;

/* JADX INFO: loaded from: classes9.dex */
public class b implements r {
    private static net.time4j.history.d e(Locale locale, net.time4j.engine.d dVar) {
        net.time4j.engine.c<String> cVar = net.time4j.format.a.f94171b;
        if (((String) dVar.b(cVar, "iso8601")).equals("julian")) {
            return net.time4j.history.d.f94564r;
        }
        net.time4j.engine.c<net.time4j.history.d> cVar2 = ep0.a.f63118a;
        if (dVar.c(cVar2)) {
            return (net.time4j.history.d) dVar.a(cVar2);
        }
        if (((String) dVar.b(cVar, "iso8601")).equals("historic")) {
            net.time4j.engine.c<String> cVar3 = net.time4j.format.a.f94189t;
            if (dVar.c(cVar3)) {
                return net.time4j.history.d.j((String) dVar.a(cVar3));
            }
        }
        return net.time4j.history.d.D(locale);
    }

    @Override // net.time4j.engine.r
    public q<?> a(q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
        return f(qVar, e(locale, dVar), dVar);
    }

    @Override // net.time4j.engine.r
    public Set<p<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return e(locale, dVar).n();
    }

    @Override // net.time4j.engine.r
    public boolean c(Class<?> cls) {
        return cls == g0.class;
    }

    @Override // net.time4j.engine.r
    public boolean d(p<?> pVar) {
        return pVar instanceof ep0.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q<?> f(q<?> qVar, net.time4j.history.d dVar, net.time4j.engine.d dVar2) {
        j jVar;
        j jVar2;
        if (!qVar.n(dVar.i())) {
            if (((net.time4j.format.g) dVar2.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART)).isLax()) {
                jVar2 = j.AD;
            } else {
                jVar = null;
            }
            if (jVar == null && qVar.n(dVar.M())) {
                int iP = qVar.p(dVar.M());
                if (qVar.n(dVar.C()) && qVar.n(dVar.g())) {
                    g0 g0VarD = dVar.d(net.time4j.history.h.h(jVar, iP, qVar.p(dVar.C()), qVar.p(dVar.g()), (net.time4j.history.p) dVar2.b(net.time4j.history.d.f94562p, net.time4j.history.p.DUAL_DATING), dVar.w()));
                    qVar.B(dVar.i(), null);
                    qVar.B(dVar.M(), null);
                    qVar.B(dVar.C(), null);
                    qVar.B(dVar.g(), null);
                    return qVar.B(g0.f94488o, g0VarD);
                }
                if (!qVar.n(dVar.h())) {
                    return qVar;
                }
                int iP2 = qVar.p(dVar.h());
                p<Integer> pVar = ep0.c.f63122e;
                if (qVar.n(pVar)) {
                    iP = qVar.p(pVar);
                }
                return qVar.B(g0.f94488o, (g0) dVar.d(dVar.m(jVar, iP)).z(dVar.h(), iP2));
            }
        }
        jVar2 = (j) qVar.s(dVar.i());
        jVar = jVar2;
        return jVar == null ? qVar : qVar;
    }
}
