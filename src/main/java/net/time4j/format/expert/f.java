package net.time4j.format.expert;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.time4j.b1;

/* JADX INFO: loaded from: classes9.dex */
final class f<V> implements h<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final net.time4j.engine.s<net.time4j.engine.o, Void> f94301h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.p<V> f94302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<V> f94303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d<V> f94304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f94305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f94306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f94307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f94308g;

    static class a implements net.time4j.engine.s<net.time4j.engine.o, Void> {
        a() {
        }

        @Override // net.time4j.engine.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void apply(net.time4j.engine.o oVar) {
            return null;
        }
    }

    f(net.time4j.engine.p<V> pVar, e<V> eVar, d<V> dVar) {
        this(pVar, eVar, dVar, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Map<net.time4j.engine.p<?>, Object> a(Map<net.time4j.engine.p<?>, Object> map, c<?> cVar) {
        net.time4j.engine.w<?> wVarQ = cVar.q();
        HashMap map2 = new HashMap();
        for (net.time4j.engine.p<?> pVar : map.keySet()) {
            if (wVarQ.w(pVar)) {
                map2.put(pVar, map.get(pVar));
            }
        }
        return map2;
    }

    private static <T> Set<g> c(c<T> cVar, Object obj, StringBuilder sb2, net.time4j.engine.d dVar) {
        return cVar.J(cVar.q().p().cast(obj), sb2, dVar);
    }

    boolean b() {
        return this.f94308g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f94302a.equals(fVar.f94302a) && this.f94303b.equals(fVar.f94303b) && this.f94304c.equals(fVar.f94304c)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f94302a;
    }

    public int hashCode() {
        return (this.f94302a.hashCode() * 7) + (this.f94303b.hashCode() * 31) + (this.f94304c.hashCode() * 37);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int iF = sVar.f();
        if (z11) {
            try {
                if (this.f94307f) {
                    dVar = ((c) c.class.cast(this.f94304c)).o();
                }
            } catch (IndexOutOfBoundsException e11) {
                sVar.k(iF, e11.getMessage());
                return;
            }
        }
        V vA = this.f94304c.a(charSequence, sVar, dVar);
        if (vA == null) {
            sVar.k(iF, sVar.d());
            return;
        }
        if (this.f94308g && (tVar instanceof u)) {
            tVar.G(vA);
            return;
        }
        net.time4j.engine.q<?> qVarG = sVar.g();
        for (net.time4j.engine.p<?> pVar : qVarG.v()) {
            if (pVar.getType() == Integer.class) {
                tVar.E(pVar, qVarG.p(pVar));
            } else {
                tVar.F(pVar, qVarG.s(pVar));
            }
        }
        tVar.F(this.f94302a, vA);
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        if (z11 && this.f94306e) {
            dVar = ((c) c.class.cast(this.f94303b)).o();
        }
        if (this.f94305d && (oVar instanceof b1) && set == null) {
            ((c) this.f94303b).K(oVar, appendable, dVar, false);
            return Integer.MAX_VALUE;
        }
        Object objS = oVar.s(this.f94302a);
        StringBuilder sb2 = new StringBuilder();
        if (!(appendable instanceof CharSequence) || set == null) {
            this.f94303b.b((V) objS, sb2, dVar, (net.time4j.engine.s<net.time4j.engine.o, R>) f94301h);
        } else {
            int length = ((CharSequence) appendable).length();
            e<V> eVar = this.f94303b;
            if (eVar instanceof c) {
                Set<g> setC = c((c) c.class.cast(eVar), objS, sb2, dVar);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (g gVar : setC) {
                    linkedHashSet.add(new g(gVar.a(), gVar.c() + length, gVar.b() + length));
                }
                set.addAll(linkedHashSet);
            } else {
                eVar.b((V) objS, sb2, dVar, (net.time4j.engine.s<net.time4j.engine.o, R>) f94301h);
            }
            set.add(new g(this.f94302a, length, sb2.length() + length));
        }
        appendable.append(sb2);
        return sb2.length();
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        boolean z11;
        boolean z12;
        boolean z13 = cVar.z() && this.f94302a.getType().equals(cVar.q().p());
        if (!(dVar instanceof b)) {
            return (this.f94306e || this.f94307f) ? new f(this.f94302a, this.f94303b, this.f94304c) : this;
        }
        e eVarR = this.f94303b;
        d dVarR = this.f94304c;
        Map<net.time4j.engine.p<?>, Object> mapR = cVar.r();
        b bVar = (b) dVar;
        e<V> eVar = this.f94303b;
        if (eVar instanceof c) {
            c cVar2 = (c) c.class.cast(eVar);
            eVarR = cVar2.R(a(mapR, cVar2), bVar);
            z11 = true;
        } else {
            z11 = false;
        }
        e eVar2 = eVarR;
        d<V> dVar2 = this.f94304c;
        if (dVar2 instanceof c) {
            c cVar3 = (c) c.class.cast(dVar2);
            dVarR = cVar3.R(a(mapR, cVar3), bVar);
            z12 = true;
        } else {
            z12 = false;
        }
        return new f(this.f94302a, eVar2, dVarR, z11, z12, z13);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(f.class.getName());
        sb2.append("[element=");
        sb2.append(this.f94302a.name());
        sb2.append(", printer=");
        sb2.append(this.f94303b);
        sb2.append(", parser=");
        sb2.append(this.f94304c);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        return this.f94302a == pVar ? this : new f(pVar, this.f94303b, this.f94304c);
    }

    private f(net.time4j.engine.p<V> pVar, e<V> eVar, d<V> dVar, boolean z11, boolean z12, boolean z13) {
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        if (eVar == null) {
            throw new NullPointerException("Missing printer.");
        }
        if (dVar == null) {
            throw new NullPointerException("Missing parser.");
        }
        this.f94302a = pVar;
        this.f94303b = eVar;
        this.f94304c = dVar;
        this.f94305d = (eVar instanceof c) && pVar.getType() == net.time4j.b0.class;
        this.f94306e = z11;
        this.f94307f = z12;
        this.f94308g = z13;
    }
}
