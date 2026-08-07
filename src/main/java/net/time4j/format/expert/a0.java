package net.time4j.format.expert;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class a0<V> implements h<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.format.t<V> f94218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dp0.e<V> f94220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Locale f94221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final net.time4j.format.v f94222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final net.time4j.format.m f94223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final net.time4j.format.g f94224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f94225h;

    private a0(net.time4j.format.t<V> tVar, boolean z11, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar, int i11) {
        if (tVar == null) {
            throw new NullPointerException("Missing element.");
        }
        this.f94218a = tVar;
        this.f94219b = z11;
        this.f94220c = tVar instanceof dp0.e ? (dp0.e) tVar : null;
        this.f94221d = locale;
        this.f94222e = vVar;
        this.f94223f = mVar;
        this.f94224g = gVar;
        this.f94225h = i11;
    }

    static <V> a0<V> a(net.time4j.format.t<V> tVar) {
        return new a0<>(tVar, false, Locale.ROOT, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT, net.time4j.format.g.SMART, 0);
    }

    private boolean b(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, boolean z11) {
        dp0.e<V> eVar = this.f94220c;
        if (eVar != null && z11) {
            eVar.print(oVar, appendable, this.f94221d, this.f94222e, this.f94223f);
            return true;
        }
        if (!oVar.n(this.f94218a)) {
            return false;
        }
        this.f94218a.print(oVar, appendable, dVar);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f94218a.equals(a0Var.f94218a) && this.f94219b == a0Var.f94219b) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f94218a;
    }

    public int hashCode() {
        return this.f94218a.hashCode();
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        Object objE;
        dp0.e<V> eVar;
        int iF = sVar.f();
        int length = charSequence.length();
        int iIntValue = z11 ? this.f94225h : ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue();
        if (iIntValue > 0) {
            length -= iIntValue;
        }
        if (iF >= length) {
            sVar.k(iF, "Missing chars for: " + this.f94218a.name());
            sVar.n();
            return;
        }
        if (!z11 || (eVar = this.f94220c) == null || this.f94224g == null) {
            net.time4j.format.t<V> tVar2 = this.f94218a;
            objE = tVar2 instanceof dp0.a ? ((dp0.a) tVar2).e(charSequence, sVar.e(), dVar, tVar) : tVar2.parse(charSequence, sVar.e(), dVar);
        } else {
            objE = eVar.parse(charSequence, sVar.e(), this.f94221d, this.f94222e, this.f94223f, this.f94224g);
        }
        if (!sVar.i()) {
            if (objE == null) {
                sVar.k(iF, "No interpretable value.");
                return;
            }
            net.time4j.format.t<V> tVar3 = this.f94218a;
            if (tVar3 == net.time4j.g0.f94492s) {
                tVar.E(net.time4j.g0.f94493t, ((net.time4j.c0) net.time4j.c0.class.cast(objE)).getValue());
                return;
            } else {
                tVar.F(tVar3, objE);
                return;
            }
        }
        Class<V> type = this.f94218a.getType();
        if (type.isEnum()) {
            sVar.k(sVar.c(), "No suitable enum found: " + type.getName());
            return;
        }
        sVar.k(sVar.c(), "Unparseable element: " + this.f94218a.name());
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        if (!(appendable instanceof CharSequence)) {
            return b(oVar, appendable, dVar, z11) ? Integer.MAX_VALUE : -1;
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        if (!b(oVar, appendable, dVar, z11)) {
            return -1;
        }
        if (set != null) {
            set.add(new g(this.f94218a, length, charSequence.length()));
        }
        return charSequence.length() - length;
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        net.time4j.engine.c<net.time4j.format.g> cVar2 = net.time4j.format.a.f94175f;
        net.time4j.format.g gVar = net.time4j.format.g.SMART;
        net.time4j.format.g gVar2 = (net.time4j.format.g) dVar.b(cVar2, gVar);
        net.time4j.engine.c<Boolean> cVar3 = net.time4j.format.a.f94180k;
        Boolean bool = Boolean.TRUE;
        boolean zBooleanValue = ((Boolean) dVar.b(cVar3, bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f94178i, bool)).booleanValue();
        boolean zBooleanValue3 = ((Boolean) dVar.b(net.time4j.format.a.f94179j, Boolean.FALSE)).booleanValue();
        return new a0(this.f94218a, this.f94219b, (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT), (net.time4j.format.v) dVar.b(net.time4j.format.a.f94176g, net.time4j.format.v.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT), (!(gVar2 == net.time4j.format.g.STRICT && (zBooleanValue || zBooleanValue2 || zBooleanValue3)) && (gVar2 != gVar || (zBooleanValue && zBooleanValue2 && !zBooleanValue3)) && zBooleanValue && zBooleanValue2 && zBooleanValue3) ? gVar2 : null, ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(a0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f94218a.name());
        sb2.append(",protected-mode=");
        sb2.append(this.f94219b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        if (this.f94219b || this.f94218a == pVar) {
            return this;
        }
        if (pVar instanceof net.time4j.format.t) {
            return a((net.time4j.format.t) pVar);
        }
        throw new IllegalArgumentException("Text element required: " + pVar.getClass().getName());
    }
}
