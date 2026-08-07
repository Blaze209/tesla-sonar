package net.time4j.format.expert;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<?> f94324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f94327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final net.time4j.engine.d f94328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f94329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f94330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f94331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f94332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f94333j;

    i(h<?> hVar, int i11, int i12, b bVar) {
        this(hVar, i11, i12, bVar, null, 0, 0, 0, false, -1);
    }

    private void a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        s sVar2;
        int iF = sVar.f();
        try {
            sVar2 = sVar;
            try {
                this.f94324a.parse(charSequence, sVar2, dVar, tVar, z11);
            } catch (RuntimeException e11) {
                e = e11;
                sVar2.k(iF, e.getMessage());
            }
        } catch (RuntimeException e12) {
            e = e12;
            sVar2 = sVar;
        }
    }

    private char c(net.time4j.engine.d dVar) {
        return ((Character) dVar.b(net.time4j.format.a.f94185p, ' ')).charValue();
    }

    private net.time4j.engine.d e(net.time4j.engine.d dVar) {
        b bVar = this.f94327d;
        return bVar == null ? dVar : new p(bVar, dVar);
    }

    private static boolean h(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private boolean k(net.time4j.engine.o oVar) {
        net.time4j.engine.n<net.time4j.engine.o> nVarF;
        b bVar = this.f94327d;
        return bVar == null || (nVarF = bVar.f()) == null || nVarF.test(oVar);
    }

    private boolean l(net.time4j.engine.d dVar) {
        return ((net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART)).isStrict();
    }

    private String o() {
        return "Pad width exceeded: " + this.f94324a.getElement().name();
    }

    private String p() {
        return "Pad width mismatched: " + this.f94324a.getElement().name();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V> h<V> w(h<V> hVar, net.time4j.engine.p<?> pVar) {
        if (hVar.getElement() == null) {
            return hVar;
        }
        if (hVar.getElement().getType() == pVar.getType() || (pVar instanceof dp0.a)) {
            return hVar.withElement(pVar);
        }
        throw new IllegalArgumentException("Cannot change element value type: " + pVar.name());
    }

    int b() {
        return this.f94325b;
    }

    h<?> d() {
        return this.f94324a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f94324a.equals(iVar.f94324a) && this.f94325b == iVar.f94325b && this.f94326c == iVar.f94326c && h(this.f94327d, iVar.f94327d) && h(this.f94328e, iVar.f94328e) && this.f94329f == iVar.f94329f && this.f94330g == iVar.f94330g && this.f94331h == iVar.f94331h && this.f94332i == iVar.f94332i && this.f94333j == iVar.f94333j) {
                return true;
            }
        }
        return false;
    }

    int f() {
        return this.f94326c;
    }

    boolean g() {
        return this.f94324a instanceof j;
    }

    public int hashCode() {
        int iHashCode = this.f94324a.hashCode() * 7;
        b bVar = this.f94327d;
        return iHashCode + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    boolean i() {
        return this.f94332i;
    }

    boolean j() {
        return this.f94324a.isNumerical();
    }

    i m(int i11) {
        if (this.f94332i) {
            return new i(this.f94324a, this.f94325b, this.f94326c, this.f94327d, this.f94328e, this.f94329f, this.f94330g, this.f94331h, true, i11);
        }
        throw new IllegalStateException("This step is not starting an or-block.");
    }

    i n(int i11, int i12) {
        return new i(this.f94324a, this.f94325b, this.f94326c, this.f94327d, null, this.f94329f, this.f94330g + i11, this.f94331h + i12, this.f94332i, this.f94333j);
    }

    void q(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int i11;
        int i12;
        net.time4j.engine.d dVarE = z11 ? this.f94328e : e(dVar);
        if (this.f94330g == 0 && this.f94331h == 0) {
            a(charSequence, sVar, dVarE, tVar, z11);
            return;
        }
        boolean zL = l(dVarE);
        char c11 = c(dVarE);
        int iF = sVar.f();
        int length = charSequence.length();
        int i13 = iF;
        while (i13 < length && charSequence.charAt(i13) == c11) {
            i13++;
        }
        int i14 = i13 - iF;
        if (zL && i14 > this.f94330g) {
            sVar.k(iF, o());
            return;
        }
        sVar.l(i13);
        a(charSequence, sVar, dVarE, tVar, z11);
        if (sVar.i()) {
            return;
        }
        int iF2 = sVar.f();
        int i15 = (iF2 - iF) - i14;
        if (zL && (i12 = this.f94330g) > 0 && i14 + i15 != i12) {
            sVar.k(iF, p());
            return;
        }
        int i16 = 0;
        while (iF2 < length && ((!zL || i15 + i16 < this.f94331h) && charSequence.charAt(iF2) == c11)) {
            iF2++;
            i16++;
        }
        if (!zL || (i11 = this.f94331h) <= 0 || i15 + i16 == i11) {
            sVar.l(iF2);
        } else {
            sVar.k(iF2 - i16, p());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    int r(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        StringBuilder sb2;
        int length;
        LinkedHashSet linkedHashSet;
        int length2;
        int i11 = 0;
        if (!k(oVar)) {
            return 0;
        }
        net.time4j.engine.d dVarE = z11 ? this.f94328e : e(dVar);
        if (this.f94330g == 0 && this.f94331h == 0) {
            return this.f94324a.print(oVar, appendable, dVarE, set, z11);
        }
        if (appendable instanceof StringBuilder) {
            sb2 = (StringBuilder) appendable;
            length = sb2.length();
        } else {
            sb2 = new StringBuilder();
            length = -1;
        }
        StringBuilder sb3 = sb2;
        if (!(appendable instanceof CharSequence) || set == null) {
            linkedHashSet = null;
            length2 = -1;
        } else {
            if (sb3 == appendable) {
                h<?> hVar = this.f94324a;
                if ((hVar instanceof f) || (hVar instanceof z)) {
                    length2 = 0;
                } else {
                    length2 = ((CharSequence) appendable).length();
                }
            } else {
                length2 = ((CharSequence) appendable).length();
            }
            linkedHashSet = new LinkedHashSet();
        }
        LinkedHashSet<g> linkedHashSet2 = linkedHashSet;
        boolean zL = l(dVarE);
        char c11 = c(dVarE);
        int length3 = sb3.length();
        this.f94324a.print(oVar, sb3, dVarE, linkedHashSet2, z11);
        int length4 = sb3.length() - length3;
        int i12 = this.f94330g;
        if (i12 <= 0) {
            if (zL && length4 > this.f94331h) {
                throw new IllegalArgumentException(o());
            }
            if (length == -1) {
                appendable.append(sb3);
            }
            while (length4 < this.f94331h) {
                appendable.append(c11);
                length4++;
            }
            if (length2 != -1) {
                for (g gVar : linkedHashSet2) {
                    set.add(new g(gVar.a(), gVar.c() + length2, gVar.b() + length2));
                }
            }
            return length4;
        }
        if (zL && length4 > i12) {
            throw new IllegalArgumentException(o());
        }
        int i13 = length4;
        while (i13 < this.f94330g) {
            if (length == -1) {
                appendable.append(c11);
            } else {
                sb3.insert(length, c11);
            }
            i13++;
            i11++;
        }
        if (length == -1) {
            appendable.append(sb3);
        }
        if (length2 != -1) {
            int i14 = length2 + i11;
            for (g gVar2 : linkedHashSet2) {
                set.add(new g(gVar2.a(), gVar2.c() + i14, gVar2.b() + i14));
            }
        }
        int i15 = this.f94331h;
        if (i15 > 0) {
            if (zL && length4 > i15) {
                throw new IllegalArgumentException(o());
            }
            while (length4 < this.f94331h) {
                appendable.append(c11);
                length4++;
                i13++;
            }
        }
        return i13;
    }

    i s(c<?> cVar) {
        b bVarP = cVar.p();
        if (this.f94327d != null) {
            bVarP = bVarP.l(new net.time4j.format.a.b().f(bVarP.e()).f(this.f94327d.e()).a());
        }
        b bVar = bVarP;
        return new i(this.f94324a.quickPath(cVar, bVar, this.f94329f), this.f94325b, this.f94326c, this.f94327d, bVar, this.f94329f, this.f94330g, this.f94331h, this.f94332i, this.f94333j);
    }

    i t(int i11) {
        return new i(this.f94324a, this.f94325b, this.f94326c, this.f94327d, null, this.f94329f + i11, this.f94330g, this.f94331h, this.f94332i, this.f94333j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[processor=");
        sb2.append(this.f94324a);
        sb2.append(", level=");
        sb2.append(this.f94325b);
        sb2.append(", section=");
        sb2.append(this.f94326c);
        if (this.f94327d != null) {
            sb2.append(", attributes=");
            sb2.append(this.f94327d);
        }
        sb2.append(", reserved=");
        sb2.append(this.f94329f);
        sb2.append(", pad-left=");
        sb2.append(this.f94330g);
        sb2.append(", pad-right=");
        sb2.append(this.f94331h);
        if (this.f94332i) {
            sb2.append(", or-block-started");
        }
        sb2.append(']');
        return sb2.toString();
    }

    int u() {
        return this.f94333j;
    }

    i v() {
        if (this.f94332i) {
            throw new IllegalStateException("Cannot start or-block twice.");
        }
        return new i(this.f94324a, this.f94325b, this.f94326c, this.f94327d, null, this.f94329f, this.f94330g, this.f94331h, true, -1);
    }

    i x(net.time4j.engine.p<?> pVar) {
        h<?> hVarW = w(this.f94324a, pVar);
        return this.f94324a == hVarW ? this : new i(hVarW, this.f94325b, this.f94326c, this.f94327d, this.f94328e, this.f94329f, this.f94330g, this.f94331h, this.f94332i, this.f94333j);
    }

    private i(h<?> hVar, int i11, int i12, b bVar, net.time4j.engine.d dVar, int i13, int i14, int i15, boolean z11, int i16) {
        if (hVar == null) {
            throw new NullPointerException("Missing format processor.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Invalid level: " + i11);
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Invalid section: " + i12);
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Reserved chars must not be negative: " + i13);
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i14);
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i15);
        }
        this.f94324a = hVar;
        this.f94325b = i11;
        this.f94326c = i12;
        this.f94327d = bVar;
        this.f94328e = dVar;
        this.f94329f = i13;
        this.f94330g = i14;
        this.f94331h = i15;
        this.f94332i = z11;
        this.f94333j = i16;
    }
}
