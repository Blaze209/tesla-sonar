package net.time4j.format.expert;

import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import net.time4j.h0;
import net.time4j.i0;

/* JADX INFO: loaded from: classes9.dex */
final class z<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<T> f94434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.x f94435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final net.time4j.engine.x f94436c;

    z(net.time4j.engine.x xVar, net.time4j.engine.x xVar2) {
        this(null, xVar, xVar2);
    }

    private static <T> c<T> a(net.time4j.engine.w<?> wVar, net.time4j.engine.x xVar, net.time4j.engine.x xVar2, Locale locale, boolean z11, net.time4j.tz.l lVar) {
        String strJ;
        if (wVar.equals(net.time4j.g0.q0())) {
            strJ = net.time4j.format.b.r((net.time4j.format.e) xVar, locale);
        } else if (wVar.equals(h0.g0())) {
            strJ = net.time4j.format.b.t((net.time4j.format.e) xVar2, locale);
        } else if (wVar.equals(i0.P())) {
            strJ = net.time4j.format.b.u((net.time4j.format.e) xVar, (net.time4j.format.e) xVar2, locale);
        } else if (wVar.equals(net.time4j.b0.Q())) {
            strJ = net.time4j.format.b.s((net.time4j.format.e) xVar, (net.time4j.format.e) xVar2, locale);
        } else {
            if (!net.time4j.format.h.class.isAssignableFrom(wVar.p())) {
                throw new UnsupportedOperationException("Localized format patterns not available: " + wVar);
            }
            strJ = wVar.j(xVar, locale);
        }
        if (z11 && strJ.contains("yy") && !strJ.contains("yyy")) {
            strJ = strJ.replace("yy", "yyyy");
        }
        c<T> cVarC = c.C(strJ, w.CLDR, locale, wVar);
        return lVar != null ? cVarC.U(lVar) : cVarC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f94435b.equals(zVar.f94435b) && this.f94436c.equals(zVar.f94436c)) {
                c<T> cVar = this.f94434a;
                if (cVar == null) {
                    return zVar.f94434a == null;
                }
                return cVar.equals(zVar.f94434a);
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<T> getElement() {
        return null;
    }

    public int hashCode() {
        c<T> cVar = this.f94434a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        c<T> cVarA;
        if (z11) {
            cVarA = this.f94434a;
        } else {
            net.time4j.engine.d dVarO = this.f94434a.o();
            net.time4j.engine.c<net.time4j.tz.o> cVar = net.time4j.format.a.f94174e;
            net.time4j.tz.o oVar = (net.time4j.tz.o) dVar.b(cVar, dVarO.b(cVar, net.time4j.tz.l.f94761d));
            net.time4j.engine.c<net.time4j.tz.k> cVar2 = net.time4j.format.a.f94173d;
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(cVar2, dVarO.b(cVar2, null));
            cVarA = a(this.f94434a.q(), this.f94435b, this.f94436c, (Locale) dVar.b(net.time4j.format.a.f94172c, this.f94434a.u()), ((Boolean) dVar.b(net.time4j.format.a.f94191v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.N(kVar).Q(oVar) : null);
        }
        T tA = cVarA.a(charSequence, sVar, dVar);
        if (sVar.i() || tA == null) {
            return;
        }
        tVar.G(tA);
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        Set<g> setK = this.f94434a.K(oVar, appendable, dVar, set != null);
        if (set == null) {
            return Integer.MAX_VALUE;
        }
        set.addAll(setK);
        return Integer.MAX_VALUE;
    }

    @Override // net.time4j.format.expert.h
    public h<T> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        net.time4j.tz.o oVar = (net.time4j.tz.o) dVar.b(net.time4j.format.a.f94174e, net.time4j.tz.l.f94761d);
        net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(net.time4j.format.a.f94173d, null);
        return new z(a(cVar.q(), this.f94435b, this.f94436c, (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT), ((Boolean) dVar.b(net.time4j.format.a.f94191v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.N(kVar).Q(oVar) : null), this.f94435b, this.f94436c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(z.class.getName());
        sb2.append("[date-style=");
        sb2.append(this.f94435b);
        sb2.append(",time-style=");
        sb2.append(this.f94436c);
        sb2.append(",delegate=");
        sb2.append(this.f94434a);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<T> withElement(net.time4j.engine.p<T> pVar) {
        return this;
    }

    private z(c<T> cVar, net.time4j.engine.x xVar, net.time4j.engine.x xVar2) {
        if (xVar == null || xVar2 == null) {
            throw new NullPointerException("Missing display style.");
        }
        this.f94435b = xVar;
        this.f94436c = xVar2;
        this.f94434a = cVar;
    }
}
