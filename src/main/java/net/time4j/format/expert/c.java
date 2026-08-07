package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.engine.i0;
import net.time4j.engine.l0;
import net.time4j.engine.m0;
import net.time4j.h0;
import net.time4j.k0;
import net.time4j.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T> implements net.time4j.format.expert.e<T>, net.time4j.format.expert.d<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c<net.time4j.b0> f94243r = L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.w<T> f94244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<?> f94245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final net.time4j.format.expert.b f94246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<i> f94247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<net.time4j.engine.p<?>, Object> f94248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f94249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f94250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f94251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f94252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f94253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final net.time4j.format.g f94254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f94255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f94256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f94257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final net.time4j.engine.w<?> f94258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f94259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f94260q;

    static class a implements net.time4j.format.expert.e<net.time4j.tz.k> {
        a() {
        }

        @Override // net.time4j.format.expert.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public <R> R b(net.time4j.tz.k kVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.s<net.time4j.engine.o, R> sVar) {
            return null;
        }
    }

    static class b implements net.time4j.format.expert.d<net.time4j.tz.k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f94261a;

        b(Map map) {
            this.f94261a = map;
        }

        @Override // net.time4j.format.expert.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.tz.k a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar) {
            int iF = sVar.f();
            int i11 = iF + 3;
            if (i11 > charSequence.length()) {
                return null;
            }
            net.time4j.tz.k kVar = (net.time4j.tz.k) this.f94261a.get(charSequence.subSequence(iF, i11).toString());
            if (kVar != null) {
                sVar.l(i11);
                return kVar;
            }
            sVar.k(iF, "No time zone information found.");
            return null;
        }
    }

    /* JADX INFO: renamed from: net.time4j.format.expert.c$c, reason: collision with other inner class name */
    static /* synthetic */ class C2011c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94262a;

        static {
            int[] iArr = new int[w.values().length];
            f94262a = iArr;
            try {
                iArr[w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94262a[w.CLDR_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94262a[w.CLDR_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94262a[w.SIMPLE_DATE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class d<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final net.time4j.engine.c<net.time4j.l> f94263n = net.time4j.format.a.e("CUSTOM_DAY_PERIOD", net.time4j.l.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.w<T> f94264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.w<?> f94265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Locale f94266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<i> f94267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private LinkedList<net.time4j.format.expert.b> f94268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f94269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f94270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f94271h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f94272i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private net.time4j.l f94273j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Map<net.time4j.engine.p<?>, Object> f94274k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private net.time4j.engine.w<?> f94275l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f94276m;

        class a implements net.time4j.engine.n<net.time4j.engine.o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ net.time4j.engine.n f94277a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ net.time4j.engine.n f94278b;

            a(net.time4j.engine.n nVar, net.time4j.engine.n nVar2) {
                this.f94277a = nVar;
                this.f94278b = nVar2;
            }

            @Override // net.time4j.engine.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(net.time4j.engine.o oVar) {
                return this.f94277a.test(oVar) && this.f94278b.test(oVar);
            }
        }

        /* synthetic */ d(net.time4j.engine.w wVar, Locale locale, a aVar) {
            this(wVar, locale);
        }

        private i H(net.time4j.engine.p<?> pVar) {
            i iVar;
            if (this.f94267d.isEmpty()) {
                iVar = null;
            } else {
                List<i> list = this.f94267d;
                iVar = list.get(list.size() - 1);
            }
            if (iVar == null) {
                return null;
            }
            if (!iVar.g() || iVar.i()) {
                return iVar;
            }
            throw new IllegalStateException(pVar.name() + " can't be inserted after an element with decimal digits.");
        }

        private static void I(net.time4j.engine.c<?> cVar) {
            if (cVar.name().charAt(0) != '_') {
                return;
            }
            throw new IllegalArgumentException("Internal attribute not allowed: " + cVar.name());
        }

        private void J(net.time4j.engine.p<?> pVar) {
            net.time4j.engine.w<?> wVarJ = c.j(this.f94264a, this.f94265b, pVar);
            int iS = c.s(wVarJ, this.f94264a, this.f94265b);
            if (iS >= this.f94276m) {
                this.f94275l = wVarJ;
                this.f94276m = iS;
            }
        }

        private void K() {
            if (!R(this.f94264a)) {
                throw new IllegalStateException("Timezone names in specific non-location format can only be reliably combined with instant-like types, for example \"Moment\".");
            }
        }

        private void M() {
            for (int size = this.f94267d.size() - 1; size >= 0; size--) {
                i iVar = this.f94267d.get(size);
                if (iVar.i()) {
                    return;
                }
                if (iVar.g()) {
                    throw new IllegalArgumentException("Cannot define more than one element with decimal digits.");
                }
            }
        }

        private void N(boolean z11, boolean z12) {
            M();
            if (!z11 && !z12 && this.f94270g != -1) {
                throw new IllegalArgumentException("Cannot add fractional element with variable width after another numerical element with variable width.");
            }
        }

        private net.time4j.format.t<?> O(boolean z11, net.time4j.l lVar) {
            net.time4j.format.a aVarA = new net.time4j.format.a.b(P()).a();
            net.time4j.engine.d dVarM = aVarA;
            if (lVar != null) {
                dVarM = (this.f94268e.isEmpty() ? new net.time4j.format.expert.b(aVarA, this.f94266c) : this.f94268e.getLast()).m(f94263n, lVar);
            }
            Iterator<net.time4j.engine.r> it = h0.g0().r().iterator();
            while (it.hasNext()) {
                for (net.time4j.engine.p<?> pVar : it.next().b(this.f94266c, dVarM)) {
                    if (z11 && pVar.getSymbol() == 'b' && S(pVar)) {
                        return (net.time4j.format.t) c.h(pVar);
                    }
                    if (!z11 && pVar.getSymbol() == 'B' && S(pVar)) {
                        return (net.time4j.format.t) c.h(pVar);
                    }
                }
            }
            throw new IllegalStateException("Day periods are not supported: " + P().p());
        }

        private static int Q(net.time4j.format.expert.b bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean R(net.time4j.engine.w<?> wVar) {
            while (!net.time4j.base.f.class.isAssignableFrom(wVar.p())) {
                wVar = wVar.a();
                if (wVar == null) {
                    return false;
                }
            }
            return true;
        }

        private boolean S(net.time4j.engine.p<?> pVar) {
            if (!pVar.name().endsWith("_DAY_PERIOD")) {
                return false;
            }
            if (this.f94265b != null || this.f94264a.w(pVar)) {
                return true;
            }
            net.time4j.engine.w<T> wVar = this.f94264a;
            do {
                wVar = (net.time4j.engine.w<T>) wVar.a();
                if (wVar == null) {
                    return false;
                }
            } while (!wVar.w(pVar));
            return true;
        }

        private static boolean T(char c11) {
            if (c11 < 'A' || c11 > 'Z') {
                return c11 >= 'a' && c11 <= 'z';
            }
            return true;
        }

        private void V() {
            this.f94271h = 0;
        }

        private void o(StringBuilder sb2) {
            if (sb2.length() > 0) {
                n(sb2.toString());
                sb2.setLength(0);
            }
        }

        private <V> d<T> s(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar) {
            return t(pVar, z11, i11, i12, xVar, false);
        }

        private <V> d<T> t(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar, boolean z12) {
            J(pVar);
            i iVarH = H(pVar);
            r rVar = new r(pVar, z11, i11, i12, xVar, z12);
            if (!z11) {
                if (iVarH != null && iVarH.j() && !iVarH.i()) {
                    throw new IllegalStateException("Numerical element with variable width can't be inserted after another numerical element. Consider \"addFixedXXX()\" instead.");
                }
                w(rVar);
                this.f94270g = this.f94267d.size() - 1;
                return this;
            }
            int i13 = this.f94270g;
            if (i13 == -1) {
                w(rVar);
                return this;
            }
            i iVar = this.f94267d.get(i13);
            w(rVar);
            List<i> list = this.f94267d;
            if (iVar.f() == list.get(list.size() - 1).f()) {
                this.f94270g = i13;
                this.f94267d.set(i13, iVar.t(i11));
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(h<?> hVar) {
            net.time4j.format.expert.b last;
            int iG;
            int i11;
            this.f94270g = -1;
            if (this.f94268e.isEmpty()) {
                last = null;
                iG = 0;
                i11 = 0;
            } else {
                last = this.f94268e.getLast();
                iG = last.g();
                i11 = last.i();
            }
            i iVar = new i(hVar, iG, i11, last);
            int i12 = this.f94271h;
            if (i12 > 0) {
                iVar = iVar.n(i12, 0);
                this.f94271h = 0;
            }
            this.f94267d.add(iVar);
        }

        public d<T> A(net.time4j.format.t<?> tVar) {
            J(tVar);
            w(a0.a(tVar));
            return this;
        }

        public d<T> B() {
            if (!R(this.f94264a)) {
                throw new IllegalStateException("Only unix timestamps can have a timezone id.");
            }
            w(c0.INSTANCE);
            return this;
        }

        public d<T> C(net.time4j.format.e eVar, boolean z11, List<String> list) {
            w(new e0(eVar, z11, list));
            return this;
        }

        public d<T> D(net.time4j.engine.p<Integer> pVar) {
            J(pVar);
            H(pVar);
            f0 f0Var = new f0(pVar);
            int i11 = this.f94270g;
            if (i11 == -1) {
                w(f0Var);
                this.f94270g = this.f94267d.size() - 1;
                return this;
            }
            i iVar = this.f94267d.get(i11);
            b0(net.time4j.format.a.f94175f, net.time4j.format.g.STRICT);
            w(f0Var);
            L();
            List<i> list = this.f94267d;
            if (iVar.f() == list.get(list.size() - 1).f()) {
                this.f94270g = i11;
                this.f94267d.set(i11, iVar.t(2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        d<T> E(net.time4j.engine.p<Integer> pVar, int i11, boolean z11) {
            i iVar;
            if (this.f94267d.isEmpty()) {
                iVar = null;
            } else {
                List<i> list = this.f94267d;
                iVar = list.get(list.size() - 1);
            }
            return (iVar == null || iVar.i() || !iVar.j() || i11 != 4) ? t(pVar, false, i11, 10, x.SHOW_WHEN_NEGATIVE, z11) : t(pVar, true, 4, 4, x.SHOW_NEVER, z11);
        }

        public c<T> F() {
            return G(net.time4j.format.a.f());
        }

        public c<T> G(net.time4j.format.a aVar) {
            boolean z11;
            if (aVar == null) {
                throw new NullPointerException("Missing format attributes.");
            }
            int size = this.f94267d.size();
            a aVar2 = null;
            HashMap map = null;
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = this.f94267d.get(i11);
                if (iVar.i()) {
                    int iF = iVar.f();
                    int i12 = size - 1;
                    while (true) {
                        if (i12 <= i11) {
                            z11 = false;
                            break;
                        }
                        if (this.f94267d.get(i12).f() == iF) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(Integer.valueOf(i11), iVar.m(i12));
                            z11 = true;
                            break;
                        }
                        i12--;
                    }
                    if (!z11) {
                        throw new IllegalStateException("Missing format processor after or-operator.");
                    }
                }
            }
            if (map != null) {
                for (Integer num : map.keySet()) {
                    this.f94267d.set(num.intValue(), (i) map.get(num));
                }
            }
            c<T> cVar = new c<>(this.f94264a, this.f94265b, this.f94266c, this.f94267d, this.f94274k, aVar, this.f94275l, null);
            String str = this.f94272i;
            if (str == null) {
                str = "";
            }
            if (this.f94273j == null && str.isEmpty()) {
                return cVar;
            }
            net.time4j.format.expert.b bVarM = ((c) cVar).f94246c;
            if (!str.isEmpty()) {
                bVarM = bVarM.m(net.time4j.format.a.f94193x, str);
            }
            net.time4j.l lVar = this.f94273j;
            if (lVar != null) {
                bVarM = bVarM.m(f94263n, lVar);
            }
            return new c<>(cVar, bVarM, aVar2);
        }

        public d<T> L() {
            this.f94268e.removeLast();
            V();
            return this;
        }

        public net.time4j.engine.w<?> P() {
            net.time4j.engine.w<?> wVar = this.f94265b;
            return wVar == null ? this.f94264a : wVar;
        }

        public d<T> U() {
            i iVar;
            int size;
            int iF;
            int i11 = !this.f94268e.isEmpty() ? this.f94268e.getLast().i() : 0;
            if (this.f94267d.isEmpty()) {
                iVar = null;
                size = -1;
                iF = -1;
            } else {
                size = this.f94267d.size() - 1;
                iVar = this.f94267d.get(size);
                iF = iVar.f();
            }
            if (i11 != iF) {
                throw new IllegalStateException("Cannot start or-block without any previous step in current section.");
            }
            this.f94267d.set(size, iVar.v());
            V();
            this.f94270g = -1;
            return this;
        }

        public d<T> W(net.time4j.engine.n<Character> nVar, int i11) {
            w(new y(nVar, i11));
            return this;
        }

        public d<T> X() {
            return Y(null);
        }

        public d<T> Y(net.time4j.engine.n<net.time4j.engine.o> nVar) {
            net.time4j.format.expert.b last;
            net.time4j.engine.n<net.time4j.engine.o> nVarF;
            net.time4j.engine.n<net.time4j.engine.o> aVar;
            V();
            net.time4j.format.a.b bVar = new net.time4j.format.a.b();
            if (this.f94268e.isEmpty()) {
                last = null;
                nVarF = null;
            } else {
                last = this.f94268e.getLast();
                bVar.f(last.e());
                nVarF = last.f();
            }
            int iQ = Q(last) + 1;
            int i11 = this.f94269f + 1;
            this.f94269f = i11;
            if (nVar != null) {
                aVar = nVarF == null ? nVar : new a(nVarF, nVar);
            } else {
                aVar = nVarF;
            }
            this.f94268e.addLast(new net.time4j.format.expert.b(bVar.a(), this.f94266c, iQ, i11, aVar));
            return this;
        }

        public d<T> Z(net.time4j.engine.c<Character> cVar, char c11) {
            net.time4j.format.expert.b bVarL;
            I(cVar);
            V();
            if (this.f94268e.isEmpty()) {
                bVarL = new net.time4j.format.expert.b(new net.time4j.format.a.b().b(cVar, c11).a(), this.f94266c);
            } else {
                net.time4j.format.expert.b last = this.f94268e.getLast();
                net.time4j.format.a.b bVar = new net.time4j.format.a.b();
                bVar.f(last.e());
                bVar.b(cVar, c11);
                bVarL = last.l(bVar.a());
            }
            this.f94268e.addLast(bVarL);
            return this;
        }

        public d<T> a0(net.time4j.engine.c<Integer> cVar, int i11) {
            net.time4j.format.expert.b bVarL;
            I(cVar);
            V();
            if (this.f94268e.isEmpty()) {
                bVarL = new net.time4j.format.expert.b(new net.time4j.format.a.b().c(cVar, i11).a(), this.f94266c);
            } else {
                net.time4j.format.expert.b last = this.f94268e.getLast();
                net.time4j.format.a.b bVar = new net.time4j.format.a.b();
                bVar.f(last.e());
                bVar.c(cVar, i11);
                bVarL = last.l(bVar.a());
            }
            this.f94268e.addLast(bVarL);
            return this;
        }

        public <A extends Enum<A>> d<T> b0(net.time4j.engine.c<A> cVar, A a11) {
            net.time4j.format.expert.b bVarL;
            I(cVar);
            V();
            if (this.f94268e.isEmpty()) {
                bVarL = new net.time4j.format.expert.b(new net.time4j.format.a.b().d(cVar, a11).a(), this.f94266c);
            } else {
                net.time4j.format.expert.b last = this.f94268e.getLast();
                net.time4j.format.a.b bVar = new net.time4j.format.a.b();
                bVar.f(last.e());
                bVar.d(cVar, a11);
                bVarL = last.l(bVar.a());
            }
            this.f94268e.addLast(bVarL);
            return this;
        }

        public <V> d<T> d(net.time4j.engine.p<V> pVar, net.time4j.format.expert.e<V> eVar, net.time4j.format.expert.d<V> dVar) {
            J(pVar);
            w(new net.time4j.format.expert.f(pVar, eVar, dVar));
            return this;
        }

        public d<T> e() {
            return A(O(false, null));
        }

        public d<T> f() {
            return A(O(true, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> g(net.time4j.engine.p<Integer> pVar, int i11) {
            return s(pVar, true, i11, i11, x.SHOW_NEVER);
        }

        public <V extends Enum<V>> d<T> h(net.time4j.engine.p<V> pVar, int i11) {
            return s(pVar, true, i11, i11, x.SHOW_NEVER);
        }

        public d<T> i(net.time4j.engine.p<Integer> pVar, int i11, int i12, boolean z11) {
            J(pVar);
            boolean z12 = !z11 && i11 == i12;
            N(z12, z11);
            j jVar = new j(pVar, i11, i12, z11);
            int i13 = this.f94270g;
            if (i13 == -1 || !z12) {
                w(jVar);
                return this;
            }
            i iVar = this.f94267d.get(i13);
            w(jVar);
            List<i> list = this.f94267d;
            if (iVar.f() == list.get(list.size() - 1).f()) {
                this.f94270g = i13;
                this.f94267d.set(i13, iVar.t(i11));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> j(net.time4j.engine.p<Integer> pVar, int i11, int i12) {
            return s(pVar, false, i11, i12, x.SHOW_NEVER);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> k(net.time4j.engine.p<Integer> pVar, int i11, int i12, x xVar) {
            return s(pVar, false, i11, i12, xVar);
        }

        public d<T> l(char c11) {
            return n(String.valueOf(c11));
        }

        public d<T> m(char c11, char c12) {
            w(new m(c11, c12));
            return this;
        }

        public d<T> n(String str) {
            int i11;
            i iVar;
            m mVar = new m(str);
            int iB = mVar.b();
            if (iB > 0) {
                if (this.f94267d.isEmpty()) {
                    iVar = null;
                } else {
                    List<i> list = this.f94267d;
                    iVar = list.get(list.size() - 1);
                }
                if (iVar != null && iVar.g() && !iVar.i()) {
                    throw new IllegalStateException("Numerical literal can't be inserted after an element with decimal digits.");
                }
            }
            if (iB == 0 || (i11 = this.f94270g) == -1) {
                w(mVar);
                return this;
            }
            i iVar2 = this.f94267d.get(i11);
            w(mVar);
            int iF = iVar2.f();
            List<i> list2 = this.f94267d;
            if (iF == list2.get(list2.size() - 1).f()) {
                this.f94270g = i11;
                this.f94267d.set(i11, iVar2.t(iB));
            }
            return this;
        }

        public d<T> p() {
            w(new n(false));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> q(net.time4j.engine.p<Long> pVar, int i11, int i12, x xVar) {
            return s(pVar, false, i11, i12, xVar);
        }

        public d<T> r() {
            K();
            w(new d0(false));
            return this;
        }

        public <V extends Enum<V>> d<T> u(net.time4j.engine.p<V> pVar, int i11, int i12) {
            return s(pVar, false, i11, i12, x.SHOW_NEVER);
        }

        public d<T> v(String str, w wVar) {
            if (wVar == null) {
                throw new NullPointerException("Missing pattern type.");
            }
            Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> map = Collections.EMPTY_MAP;
            int length = str.length();
            Locale localeH = this.f94266c;
            StringBuilder sb2 = new StringBuilder();
            if (!this.f94268e.isEmpty()) {
                localeH = this.f94268e.getLast().h();
            }
            int i11 = 0;
            while (i11 < length) {
                char cCharAt = str.charAt(i11);
                if (T(cCharAt)) {
                    o(sb2);
                    int i12 = i11 + 1;
                    while (i12 < length && str.charAt(i12) == cCharAt) {
                        i12++;
                    }
                    Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> mapRegisterSymbol = wVar.registerSymbol(this, localeH, cCharAt, i12 - i11);
                    if (!mapRegisterSymbol.isEmpty()) {
                        if (map.isEmpty()) {
                            map = mapRegisterSymbol;
                        } else {
                            HashMap map2 = new HashMap(map);
                            map2.putAll(mapRegisterSymbol);
                            map = map2;
                        }
                    }
                    i11 = i12 - 1;
                } else if (cCharAt == '\'') {
                    o(sb2);
                    int i13 = i11 + 1;
                    int i14 = i13;
                    while (i14 < length) {
                        if (str.charAt(i14) == '\'') {
                            int i15 = i14 + 1;
                            if (i15 >= length || str.charAt(i15) != '\'') {
                                break;
                            }
                            i14 = i15;
                        }
                        i14++;
                    }
                    if (i14 >= length) {
                        throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                    }
                    if (i13 == i14) {
                        l(CoreConstants.SINGLE_QUOTE_CHAR);
                    } else {
                        n(str.substring(i13, i14).replace("''", "'"));
                    }
                    i11 = i14;
                } else if (cCharAt == '[') {
                    o(sb2);
                    X();
                } else if (cCharAt == ']') {
                    o(sb2);
                    L();
                } else if (cCharAt == '|') {
                    try {
                        o(sb2);
                        U();
                    } catch (IllegalStateException e11) {
                        throw new IllegalArgumentException(e11);
                    }
                } else {
                    if (cCharAt == '#' || cCharAt == '{' || cCharAt == '}') {
                        throw new IllegalArgumentException("Pattern contains reserved character: '" + cCharAt + "'");
                    }
                    sb2.append(cCharAt);
                }
                i11++;
            }
            o(sb2);
            if (!map.isEmpty()) {
                int size = this.f94267d.size();
                for (int i16 = 0; i16 < size; i16++) {
                    i iVar = this.f94267d.get(i16);
                    net.time4j.engine.p<?> element = iVar.d().getElement();
                    if (map.containsKey(element)) {
                        this.f94267d.set(i16, iVar.x(map.get(element)));
                    }
                }
            }
            if (this.f94272i != null) {
                str = "";
            }
            this.f94272i = str;
            return this;
        }

        public d<T> x() {
            w(new n(true));
            return this;
        }

        public d<T> y() {
            K();
            w(new d0(true));
            return this;
        }

        public <V extends Enum<V>> d<T> z(net.time4j.engine.p<V> pVar) {
            J(pVar);
            if (pVar instanceof net.time4j.format.t) {
                w(a0.a((net.time4j.format.t) net.time4j.format.t.class.cast(pVar)));
                return this;
            }
            HashMap map = new HashMap();
            for (V v11 : pVar.getType().getEnumConstants()) {
                map.put(v11, v11.toString());
            }
            w(new o(pVar, map));
            return this;
        }

        private d(net.time4j.engine.w<T> wVar, Locale locale) {
            this(wVar, locale, (net.time4j.engine.w<?>) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d(net.time4j.engine.w<T> wVar, Locale locale, net.time4j.engine.w<?> wVar2) {
            if (wVar == 0) {
                throw new NullPointerException("Missing chronology.");
            }
            if (locale != null) {
                this.f94264a = wVar;
                this.f94265b = wVar2;
                this.f94266c = locale;
                this.f94267d = new ArrayList();
                this.f94268e = new LinkedList<>();
                this.f94269f = 0;
                this.f94270g = -1;
                this.f94271h = 0;
                this.f94272i = null;
                this.f94273j = null;
                this.f94274k = new HashMap();
                this.f94275l = wVar;
                this.f94276m = 0;
                return;
            }
            throw new NullPointerException("Missing locale.");
        }
    }

    private static class e<C> implements net.time4j.engine.t<net.time4j.s<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.w<C> f94280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<net.time4j.engine.r> f94281b;

        private e(net.time4j.engine.w<C> wVar) {
            this.f94280a = wVar;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(wVar.r());
            arrayList.addAll(h0.g0().r());
            this.f94281b = Collections.unmodifiableList(arrayList);
        }

        static <C> e<C> i(net.time4j.engine.w<C> wVar) {
            if (wVar == null) {
                return null;
            }
            return new e<>(wVar);
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> a() {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // net.time4j.engine.t
        public int c() {
            return this.f94280a.c();
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.s<C> b(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            net.time4j.s sVarC;
            C cB = this.f94280a.b(qVar, dVar, z11, z12);
            h0 h0Var = (h0) h0.g0().b(qVar, dVar, z11, z12);
            if (cB instanceof net.time4j.engine.l) {
                sVarC = net.time4j.s.b((net.time4j.engine.l) net.time4j.engine.l.class.cast(cB), h0Var);
            } else {
                if (!(cB instanceof net.time4j.engine.m)) {
                    throw new IllegalStateException("Cannot determine calendar type: " + cB);
                }
                sVarC = net.time4j.s.c((net.time4j.engine.m) net.time4j.engine.m.class.cast(cB), h0Var);
            }
            return (net.time4j.s) c.h(sVarC);
        }

        public net.time4j.engine.w<?> e() {
            return this.f94280a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f94280a.equals(((e) obj).f94280a);
            }
            return false;
        }

        public List<net.time4j.engine.r> g() {
            return this.f94281b;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 h() {
            return this.f94280a.h();
        }

        public int hashCode() {
            return this.f94280a.hashCode();
        }

        @Override // net.time4j.engine.t
        public String j(net.time4j.engine.x xVar, Locale locale) {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.o f(net.time4j.s<C> sVar, net.time4j.engine.d dVar) {
            throw new UnsupportedOperationException("Not used.");
        }

        public String toString() {
            return this.f94280a.p().getName();
        }
    }

    private static class f implements net.time4j.engine.o, m0, net.time4j.base.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.s<?> f94282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f94283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final net.time4j.tz.k f94284c;

        /* synthetic */ f(net.time4j.s sVar, String str, net.time4j.tz.k kVar, a aVar) {
            this(sVar, str, kVar);
        }

        private net.time4j.base.f b() {
            net.time4j.engine.d0 d0VarH;
            try {
                d0VarH = net.time4j.engine.w.x(this.f94282a.d().getClass()).h();
            } catch (RuntimeException unused) {
                d0VarH = net.time4j.engine.d0.f94117a;
            }
            return this.f94282a.a(net.time4j.tz.l.N(this.f94284c), d0VarH);
        }

        @Override // net.time4j.base.f
        public int a() {
            return b().a();
        }

        @Override // net.time4j.engine.o
        public net.time4j.tz.k g() {
            return this.f94284c;
        }

        @Override // net.time4j.engine.o
        public boolean j() {
            return true;
        }

        @Override // net.time4j.engine.o
        public <V> V k(net.time4j.engine.p<V> pVar) {
            return (V) this.f94282a.k(pVar);
        }

        @Override // net.time4j.base.f
        public long l() {
            return b().l();
        }

        @Override // net.time4j.engine.o
        public boolean n(net.time4j.engine.p<?> pVar) {
            return this.f94282a.n(pVar);
        }

        @Override // net.time4j.engine.o
        public <V> V o(net.time4j.engine.p<V> pVar) {
            return (V) this.f94282a.o(pVar);
        }

        @Override // net.time4j.engine.o
        public int p(net.time4j.engine.p<Integer> pVar) {
            return this.f94282a.p(pVar);
        }

        @Override // net.time4j.engine.o
        public <V> V s(net.time4j.engine.p<V> pVar) {
            return (V) this.f94282a.s(pVar);
        }

        private f(net.time4j.s<?> sVar, String str, net.time4j.tz.k kVar) {
            this.f94282a = sVar;
            this.f94283b = str;
            this.f94284c = kVar;
        }
    }

    /* synthetic */ c(net.time4j.engine.w wVar, net.time4j.engine.w wVar2, Locale locale, List list, Map map, net.time4j.format.a aVar, net.time4j.engine.w wVar3, a aVar2) {
        this(wVar, wVar2, locale, list, map, aVar, wVar3);
    }

    private static boolean A(net.time4j.engine.w<?> wVar, net.time4j.engine.w<?> wVar2, net.time4j.engine.p<?> pVar) {
        Iterator<net.time4j.engine.r> it = wVar.r().iterator();
        while (it.hasNext()) {
            if (it.next().d(pVar)) {
                return true;
            }
        }
        if (wVar2 != null) {
            if (pVar.isDateElement()) {
                Iterator<net.time4j.engine.r> it2 = wVar2.r().iterator();
                while (it2.hasNext()) {
                    if (it2.next().d(pVar)) {
                        return true;
                    }
                }
                return false;
            }
            if (!pVar.isTimeElement() || !h0.g0().w(pVar)) {
                return false;
            }
            Iterator<net.time4j.engine.r> it3 = h0.g0().r().iterator();
            while (it3.hasNext()) {
                if (it3.next().d(pVar)) {
                    return true;
                }
            }
            return false;
        }
        while (true) {
            wVar = wVar.a();
            if (wVar == null) {
                return false;
            }
            Iterator<net.time4j.engine.r> it4 = wVar.r().iterator();
            while (it4.hasNext()) {
                if (it4.next().d(pVar)) {
                    return true;
                }
            }
        }
    }

    public static c<net.time4j.b0> B(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale, net.time4j.tz.k kVar) {
        d dVar = new d(net.time4j.b0.Q(), locale, (a) null);
        dVar.w(new z(eVar, eVar2));
        return dVar.F().V(kVar);
    }

    public static <T> c<T> C(String str, w wVar, Locale locale, net.time4j.engine.w<T> wVar2) {
        d dVar = new d(wVar2, locale, (a) null);
        g(dVar, str, wVar);
        try {
            return dVar.F();
        } catch (IllegalStateException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[LOOP:1: B:55:0x00bc->B:117:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9 A[Catch: RuntimeException -> 0x00f8, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00f8, blocks: (B:64:0x00df, B:65:0x00e3, B:67:0x00e9), top: B:96:0x00df }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0123  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:84:0x015e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x013d, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static <T> T F(c<?> cVar, net.time4j.engine.t<T> tVar, List<net.time4j.engine.r> list, CharSequence charSequence, s sVar, net.time4j.engine.d dVar, net.time4j.format.g gVar, boolean z11, boolean z12) {
        s sVar2;
        net.time4j.engine.d dVar2;
        net.time4j.engine.q<?> qVar;
        s sVar3;
        boolean zI;
        net.time4j.engine.q<?> qVarA;
        s sVar4;
        Iterator<net.time4j.engine.r> it;
        net.time4j.engine.q<?> qVar2;
        T tB;
        Set<net.time4j.engine.p<?>> setV;
        char symbol;
        boolean z13;
        Iterator<net.time4j.engine.p<?>> it2;
        int length = charSequence.length();
        if (sVar.f() >= length) {
            throw new IndexOutOfBoundsException("[" + sVar.f() + "]: " + charSequence.toString());
        }
        try {
            try {
                if (!((c) cVar).f94260q || z11) {
                    try {
                        net.time4j.engine.q<?> qVarH = cVar.H(charSequence, sVar, dVar, z12, ((c) cVar).f94253j);
                        s sVar5 = sVar;
                        dVar2 = dVar;
                        try {
                            sVar5.m(qVarH);
                            qVarA = qVarH;
                            sVar4 = sVar5;
                        } catch (net.time4j.format.expert.a e11) {
                            e = e11;
                            qVar = qVarH;
                            sVar3 = sVar5;
                            zI = sVar3.i();
                            sVar4 = sVar3;
                            qVarA = qVar;
                            if (!zI) {
                                sVar3.k(sVar3.f(), e.getMessage());
                            }
                        }
                    } catch (net.time4j.format.expert.a e12) {
                        e = e12;
                        sVar2 = sVar;
                        dVar2 = dVar;
                        qVar = null;
                        sVar3 = sVar2;
                        zI = sVar3.i();
                        sVar4 = sVar3;
                        qVarA = qVar;
                        if (!zI) {
                            sVar3.k(sVar3.f(), e.getMessage());
                        }
                        if (qVarA != null) {
                            sVar4 = sVar3;
                            qVarA = qVar;
                            if (!sVar4.i()) {
                                if (!((c) cVar).f94248e.isEmpty()) {
                                    setV = null;
                                    for (net.time4j.engine.p<?> pVar : ((c) cVar).f94248e.keySet()) {
                                        if (!qVarA.n(pVar)) {
                                            symbol = pVar.getSymbol();
                                            z13 = true;
                                            if (symbol != 0) {
                                                if (setV == null) {
                                                    setV = qVarA.v();
                                                }
                                                it2 = setV.iterator();
                                                while (it2.hasNext()) {
                                                    if (it2.next().getSymbol() == symbol) {
                                                        z13 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (z13) {
                                                O(qVarA, pVar, ((c) cVar).f94248e.get(pVar));
                                            }
                                        }
                                    }
                                }
                                qVar2 = qVarA;
                                try {
                                    if (((c) cVar).f94252i) {
                                        try {
                                            it = list.iterator();
                                            while (true) {
                                                qVar2 = qVarA;
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                qVarA = it.next().a(qVarA, cVar.u(), dVar2);
                                            }
                                            tB = tVar.b(qVar2, dVar2, gVar.isLax(), z11);
                                            if (((c) cVar).f94249f != null) {
                                                tB = (T) h(((c) cVar).f94249f.d((net.time4j.engine.q) net.time4j.engine.q.class.cast(tB), qVar2));
                                            }
                                            if (tB == null) {
                                                if (gVar.isStrict()) {
                                                    return (T) i(qVar2, tB, charSequence, sVar4);
                                                }
                                                return tB;
                                            }
                                            if (!z11) {
                                                sVar4.k(length, v(qVar2) + t(qVar2));
                                            }
                                            return null;
                                        } catch (RuntimeException e13) {
                                            sVar4.k(length, e13.getMessage() + t(qVarA));
                                            return null;
                                        }
                                    }
                                    tB = tVar.b(qVar2, dVar2, gVar.isLax(), z11);
                                    if (((c) cVar).f94249f != null) {
                                        tB = (T) h(((c) cVar).f94249f.d((net.time4j.engine.q) net.time4j.engine.q.class.cast(tB), qVar2));
                                    }
                                    if (tB == null) {
                                        if (gVar.isStrict()) {
                                            return (T) i(qVar2, tB, charSequence, sVar4);
                                        }
                                        return tB;
                                    }
                                    if (!z11) {
                                        sVar4.k(length, v(qVar2) + t(qVar2));
                                    }
                                    return null;
                                } catch (RuntimeException e14) {
                                    sVar4.k(length, e14.getMessage() + t(qVar2));
                                }
                            }
                        }
                        sVar4 = sVar3;
                        qVarA = qVar;
                        return null;
                    }
                } else {
                    u uVar = new u();
                    s sVar6 = sVar;
                    ((c) cVar).f94247d.get(0).q(charSequence, sVar6, dVar, uVar, z12);
                    if (sVar6.i()) {
                        return null;
                    }
                    try {
                        T t11 = (T) uVar.D();
                        if (t11 != null) {
                            return t11;
                        }
                    } catch (ClassCastException unused) {
                    }
                    try {
                        sVar6.m(uVar);
                        dVar2 = dVar;
                        sVar4 = sVar6;
                        qVarA = uVar;
                    } catch (net.time4j.format.expert.a e15) {
                        e = e15;
                        dVar2 = dVar;
                        sVar3 = sVar6;
                        qVar = uVar;
                        zI = sVar3.i();
                        sVar4 = sVar3;
                        qVarA = qVar;
                        if (!zI) {
                            sVar3.k(sVar3.f(), e.getMessage());
                        }
                    }
                }
            } catch (net.time4j.format.expert.a e16) {
                e = e16;
                dVar2 = dVar;
                qVar = null;
                sVar3 = sVar2;
                zI = sVar3.i();
                sVar4 = sVar3;
                qVarA = qVar;
                if (!zI) {
                    sVar3.k(sVar3.f(), e.getMessage());
                }
                if (qVarA != null) {
                    sVar4 = sVar3;
                    qVarA = qVar;
                    if (!sVar4.i()) {
                        if (!((c) cVar).f94248e.isEmpty()) {
                            setV = null;
                            while (r0.hasNext()) {
                                if (!qVarA.n(pVar)) {
                                    symbol = pVar.getSymbol();
                                    z13 = true;
                                    if (symbol != 0) {
                                        if (setV == null) {
                                            setV = qVarA.v();
                                        }
                                        it2 = setV.iterator();
                                        while (it2.hasNext()) {
                                            if (it2.next().getSymbol() == symbol) {
                                                z13 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (z13) {
                                        O(qVarA, pVar, ((c) cVar).f94248e.get(pVar));
                                    }
                                }
                            }
                        }
                        qVar2 = qVarA;
                        if (((c) cVar).f94252i) {
                            it = list.iterator();
                            while (true) {
                                qVar2 = qVarA;
                                if (!it.hasNext()) {
                                    break;
                                }
                                qVarA = it.next().a(qVarA, cVar.u(), dVar2);
                            }
                            tB = tVar.b(qVar2, dVar2, gVar.isLax(), z11);
                            if (((c) cVar).f94249f != null) {
                                tB = (T) h(((c) cVar).f94249f.d((net.time4j.engine.q) net.time4j.engine.q.class.cast(tB), qVar2));
                            }
                            if (tB == null) {
                                if (gVar.isStrict()) {
                                    return (T) i(qVar2, tB, charSequence, sVar4);
                                }
                                return tB;
                            }
                            if (!z11) {
                                sVar4.k(length, v(qVar2) + t(qVar2));
                            }
                            return null;
                        }
                        tB = tVar.b(qVar2, dVar2, gVar.isLax(), z11);
                        if (((c) cVar).f94249f != null) {
                            tB = (T) h(((c) cVar).f94249f.d((net.time4j.engine.q) net.time4j.engine.q.class.cast(tB), qVar2));
                        }
                        if (tB == null) {
                            if (gVar.isStrict()) {
                                return (T) i(qVar2, tB, charSequence, sVar4);
                            }
                            return tB;
                        }
                        if (!z11) {
                            sVar4.k(length, v(qVar2) + t(qVar2));
                        }
                        return null;
                    }
                }
                sVar4 = sVar3;
                qVarA = qVar;
                return null;
            }
        } catch (net.time4j.format.expert.a e17) {
            e = e17;
            sVar2 = sVar;
        }
        if (qVarA != null) {
            sVar4 = sVar3;
            qVarA = qVar;
            if (!sVar4.i()) {
                if (!((c) cVar).f94248e.isEmpty()) {
                    setV = null;
                    while (r0.hasNext()) {
                        if (!qVarA.n(pVar)) {
                            symbol = pVar.getSymbol();
                            z13 = true;
                            if (symbol != 0) {
                                if (setV == null) {
                                    setV = qVarA.v();
                                }
                                it2 = setV.iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().getSymbol() == symbol) {
                                        z13 = false;
                                        break;
                                    }
                                }
                            }
                            if (z13) {
                                O(qVarA, pVar, ((c) cVar).f94248e.get(pVar));
                            }
                        }
                    }
                }
                qVar2 = qVarA;
                if (((c) cVar).f94252i) {
                    it = list.iterator();
                    while (true) {
                        qVar2 = qVarA;
                        if (!it.hasNext()) {
                            break;
                        }
                        qVarA = it.next().a(qVarA, cVar.u(), dVar2);
                    }
                    tB = tVar.b(qVar2, dVar2, gVar.isLax(), z11);
                    if (((c) cVar).f94249f != null && (tB instanceof net.time4j.engine.q)) {
                        tB = (T) h(((c) cVar).f94249f.d((net.time4j.engine.q) net.time4j.engine.q.class.cast(tB), qVar2));
                    }
                    if (tB == null) {
                        if (gVar.isStrict()) {
                            return (T) i(qVar2, tB, charSequence, sVar4);
                        }
                        return tB;
                    }
                    if (!z11) {
                        sVar4.k(length, v(qVar2) + t(qVar2));
                    }
                    return null;
                }
                tB = tVar.b(qVar2, dVar2, gVar.isLax(), z11);
                if (((c) cVar).f94249f != null) {
                    tB = (T) h(((c) cVar).f94249f.d((net.time4j.engine.q) net.time4j.engine.q.class.cast(tB), qVar2));
                }
                if (tB == null) {
                    if (gVar.isStrict()) {
                        return (T) i(qVar2, tB, charSequence, sVar4);
                    }
                    return tB;
                }
                if (!z11) {
                    sVar4.k(length, v(qVar2) + t(qVar2));
                }
                return null;
            }
        }
        sVar4 = sVar3;
        qVarA = qVar;
        return null;
    }

    private static <C> C G(c<?> cVar, net.time4j.engine.w<C> wVar, int i11, CharSequence charSequence, s sVar, net.time4j.engine.d dVar, net.time4j.format.g gVar, boolean z11) {
        net.time4j.engine.w<?> wVar2;
        net.time4j.engine.w<?> wVarA = wVar.a();
        if (wVarA == null || wVar == (wVar2 = ((c) cVar).f94258o)) {
            return (C) F(cVar, wVar, wVar.r(), charSequence, sVar, dVar, gVar, i11 > 0, z11);
        }
        Object objF = wVarA == wVar2 ? F(cVar, wVarA, wVarA.r(), charSequence, sVar, dVar, gVar, true, z11) : G(cVar, wVarA, i11 + 1, charSequence, sVar, dVar, gVar, z11);
        if (sVar.i()) {
            return null;
        }
        if (objF == null) {
            net.time4j.engine.q<?> qVarG = sVar.g();
            sVar.k(charSequence.length(), v(qVarG) + t(qVarG));
            return null;
        }
        net.time4j.engine.q<?> qVarH = sVar.h();
        try {
            if (!(wVarA instanceof net.time4j.engine.f0)) {
                throw new IllegalStateException("Unsupported chronology or preparser: " + wVar);
            }
            Q(qVarH, ((net.time4j.engine.f0) net.time4j.engine.f0.class.cast(wVarA)).D(), objF);
            C cB = wVar.b(qVarH, dVar, gVar.isLax(), false);
            if (cB != null) {
                return gVar.isStrict() ? (C) i(qVarH, cB, charSequence, sVar) : cB;
            }
            if (!sVar.i()) {
                sVar.k(charSequence.length(), v(qVarH) + t(qVarH));
            }
            return null;
        } catch (RuntimeException e11) {
            sVar.k(charSequence.length(), e11.getMessage() + t(qVarH));
            return null;
        }
    }

    private net.time4j.engine.q<?> H(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, boolean z11, int i11) {
        LinkedList linkedList;
        v vVar;
        v vVar2;
        int i12;
        net.time4j.engine.p<?> element;
        v vVar3 = new v(i11, this.f94255l);
        vVar3.a0(sVar.f());
        if (this.f94250g) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(vVar3);
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        int size = this.f94247d.size();
        int iB = 0;
        int i13 = 0;
        int iU = 0;
        while (iU < size) {
            i iVar = this.f94247d.get(iU);
            if (linkedList == null) {
                vVar2 = vVar3;
                vVar = vVar2;
            } else {
                iB = iVar.b();
                int i14 = iB;
                while (i14 > i13) {
                    vVar3 = new v(i11 >>> 1, this.f94255l);
                    vVar3.a0(sVar.f());
                    linkedList.push(vVar3);
                    i14--;
                }
                while (i14 < i13) {
                    vVar3 = (v) linkedList.pop();
                    ((v) linkedList.peek()).U(vVar3);
                    i14++;
                }
                vVar = vVar3;
                vVar2 = (v) linkedList.peek();
            }
            int i15 = iB;
            sVar.b();
            iVar.q(charSequence, sVar, dVar, vVar2, z11);
            if (sVar.j() && (element = iVar.d().getElement()) != null && this.f94248e.containsKey(element)) {
                vVar2.F(element, this.f94248e.get(element));
                vVar2.B(l0.ERROR_MESSAGE, null);
                sVar.a();
                sVar.b();
            }
            if (sVar.i()) {
                int iF = iVar.f();
                if (iVar.i()) {
                    i12 = iU;
                    break;
                }
                i12 = iU + 1;
                while (true) {
                    if (i12 >= size) {
                        i12 = iU;
                        break;
                    }
                    i iVar2 = this.f94247d.get(i12);
                    if (iVar2.i() && iVar2.f() == iF) {
                        break;
                    }
                    i12++;
                }
                if (i12 > iU || iVar.i()) {
                    if (linkedList != null) {
                        vVar = (v) linkedList.pop();
                    }
                    sVar.a();
                    sVar.l(vVar.P());
                    vVar.Y();
                    if (linkedList != null) {
                        linkedList.push(vVar);
                    }
                    iU = i12;
                } else {
                    if (i15 == 0) {
                        if (linkedList != null) {
                            vVar = (v) linkedList.peek();
                        }
                        vVar.Z();
                        return vVar;
                    }
                    int iB2 = iVar.b();
                    int i16 = i12;
                    for (int i17 = iU + 1; i17 < size && this.f94247d.get(i17).b() > iB2; i17++) {
                        i16 = i17;
                    }
                    for (int i18 = size - 1; i18 > i16; i18--) {
                        if (this.f94247d.get(i18).f() == iF) {
                            i16 = i18;
                            break;
                        }
                    }
                    i15--;
                    vVar3 = (v) linkedList.pop();
                    sVar.a();
                    sVar.l(vVar3.P());
                    iU = i16;
                }
                iU++;
                iB = i15;
                i13 = iB;
            } else if (iVar.i()) {
                iU = iVar.u();
            }
            vVar3 = vVar;
            iU++;
            iB = i15;
            i13 = iB;
        }
        while (iB > 0) {
            vVar3 = (v) linkedList.pop();
            ((v) linkedList.peek()).U(vVar3);
            iB--;
        }
        if (linkedList != null) {
            vVar3 = (v) linkedList.peek();
        }
        vVar3.Z();
        return vVar3;
    }

    private static c<net.time4j.b0> L() {
        d dVarN = N(net.time4j.b0.class, Locale.ENGLISH);
        M(dVarN);
        dVarN.C(net.time4j.format.e.MEDIUM, false, Arrays.asList("GMT", "UT", "Z"));
        dVarN.U();
        M(dVarN);
        HashMap map = new HashMap();
        net.time4j.tz.f fVar = net.time4j.tz.f.BEHIND_UTC;
        map.put("EST", net.time4j.tz.p.n(fVar, 5));
        map.put("EDT", net.time4j.tz.p.n(fVar, 4));
        map.put("CST", net.time4j.tz.p.n(fVar, 6));
        map.put("CDT", net.time4j.tz.p.n(fVar, 5));
        map.put("MST", net.time4j.tz.p.n(fVar, 7));
        map.put("MDT", net.time4j.tz.p.n(fVar, 6));
        map.put("PST", net.time4j.tz.p.n(fVar, 8));
        map.put("PDT", net.time4j.tz.p.n(fVar, 7));
        dVarN.w(new net.time4j.format.expert.f(b0.TIMEZONE_OFFSET, new a(), new b(map)));
        return dVarN.F().V(net.time4j.tz.p.f94822k);
    }

    private static void M(d<net.time4j.b0> dVar) {
        d<net.time4j.b0> dVarX = dVar.X();
        net.time4j.engine.c<net.time4j.format.v> cVar = net.time4j.format.a.f94176g;
        net.time4j.format.v vVar = net.time4j.format.v.ABBREVIATED;
        dVarX.b0(cVar, vVar).z(net.time4j.g0.f94495v).L().n(", ").L().j(net.time4j.g0.f94494u, 1, 2).l(' ').b0(cVar, vVar).z(net.time4j.g0.f94492s).L().l(' ').g(net.time4j.g0.f94489p, 4).l(' ').g(h0.f94530u, 2).l(CoreConstants.COLON_CHAR).g(h0.f94532w, 2).X().l(CoreConstants.COLON_CHAR).g(h0.f94534y, 2).L().l(' ');
    }

    public static <T extends net.time4j.engine.q<T>> d<T> N(Class<T> cls, Locale locale) {
        if (cls == null) {
            throw new NullPointerException("Missing chronological type.");
        }
        net.time4j.engine.w wVarX = net.time4j.engine.w.x(cls);
        if (wVarX != null) {
            return new d<>(wVarX, locale, (a) null);
        }
        throw new IllegalArgumentException("Not formattable: " + cls);
    }

    private static <V> void O(net.time4j.engine.q<?> qVar, net.time4j.engine.p<V> pVar, Object obj) {
        qVar.B(pVar, pVar.getType().cast(obj));
    }

    private static String P(int i11, CharSequence charSequence) {
        int length = charSequence.length();
        if (length - i11 <= 10) {
            return charSequence.subSequence(i11, length).toString();
        }
        return charSequence.subSequence(i11, i11 + 10).toString() + "...";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void Q(net.time4j.engine.q<?> qVar, net.time4j.engine.p<T> pVar, Object obj) {
        qVar.B(pVar, pVar.getType().cast(obj));
    }

    private static <T> void g(d<T> dVar, String str, w wVar) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\'') {
                int i12 = i11 + 1;
                boolean z11 = str.charAt(i12) == 'Z';
                while (i12 < length) {
                    if (str.charAt(i12) == '\'') {
                        int i13 = i12 + 1;
                        if (i13 >= length || str.charAt(i13) != '\'') {
                            if (!z11 || i12 != i11 + 2 || !d.R(((d) dVar).f94264a)) {
                                break;
                                break;
                                break;
                            } else {
                                throw new IllegalArgumentException("Z-literal (=UTC+00) should not be escaped: " + str);
                            }
                        }
                        i12 = i13;
                    }
                    i12++;
                }
                i11 = i12;
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        String string = sb2.toString();
        int i14 = C2011c.f94262a[wVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
            if ((string.contains("h") || string.contains("K")) && !string.contains("a") && !string.contains("b") && !string.contains("B")) {
                throw new IllegalArgumentException("12-hour-clock requires am/pm-marker or dayperiod: " + str);
            }
            if (string.contains("Y") && ((string.contains(Gender.MALE) || string.contains("L")) && !string.contains("w"))) {
                throw new IllegalArgumentException("Y as week-based-year requires a week-date-format: " + str);
            }
            if (string.contains("D") && ((string.contains(Gender.MALE) || string.contains("L")) && !string.contains(DateTokenConverter.CONVERTER_KEY))) {
                throw new IllegalArgumentException("D is the day of year but not the day of month: " + str);
            }
        }
        dVar.v(str, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T h(Object obj) {
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011d  */
    private static <T> T i(net.time4j.engine.q<?> qVar, T t11, CharSequence charSequence, s sVar) {
        i0 i0VarG;
        Object objS;
        boolean zEquals;
        if (t11 instanceof net.time4j.base.f) {
            net.time4j.base.f fVar = (net.time4j.base.f) net.time4j.base.f.class.cast(t11);
            b0 b0Var = b0.TIMEZONE_ID;
            if (qVar.n(b0Var)) {
                b0 b0Var2 = b0.TIMEZONE_OFFSET;
                if (qVar.n(b0Var2)) {
                    net.time4j.tz.k kVar = (net.time4j.tz.k) qVar.s(b0Var);
                    net.time4j.tz.k kVar2 = (net.time4j.tz.k) qVar.s(b0Var2);
                    if (!net.time4j.tz.l.N(kVar).B(fVar).equals(kVar2)) {
                        sVar.k(charSequence.length(), "Ambivalent offset information: " + kVar + " versus " + kVar2);
                        return null;
                    }
                }
            }
            net.time4j.engine.a0 a0Var = net.time4j.engine.a0.DAYLIGHT_SAVING;
            if (qVar.n(a0Var)) {
                try {
                    boolean zI = net.time4j.tz.l.N(qVar.g()).I(fVar);
                    if (zI != ((Boolean) qVar.s(a0Var)).booleanValue()) {
                        StringBuilder sb2 = new StringBuilder(256);
                        sb2.append("Conflict found: ");
                        sb2.append("Parsed entity is ");
                        if (!zI) {
                            sb2.append("not ");
                        }
                        sb2.append("daylight-saving, but timezone name");
                        sb2.append(" has not the appropriate form in {");
                        sb2.append(charSequence.toString());
                        sb2.append("}.");
                        sVar.k(charSequence.length(), sb2.toString());
                        return null;
                    }
                } catch (IllegalArgumentException e11) {
                    StringBuilder sb3 = new StringBuilder(256);
                    sb3.append("Unable to check timezone name: ");
                    sb3.append(e11.getMessage());
                    sVar.k(charSequence.length(), sb3.toString());
                    return null;
                }
            }
            return t11;
        }
        if (t11 instanceof net.time4j.engine.o) {
            net.time4j.engine.o oVarD0 = (net.time4j.engine.o) t11;
            if ((t11 instanceof net.time4j.i0) && ((net.time4j.i0) net.time4j.i0.class.cast(t11)).c() == 0) {
                if (qVar.p(h0.f94531v) != 24) {
                    u0 u0Var = h0.f94525p;
                    if (!qVar.n(u0Var) || ((h0) qVar.s(u0Var)).c() != 24) {
                        i0VarG = null;
                    }
                }
                i0VarG = ((net.time4j.i0) net.time4j.i0.class.cast(t11)).d0().G(1L, net.time4j.f.DAYS);
            } else {
                i0VarG = null;
            }
            for (net.time4j.engine.p<?> pVar : qVar.v()) {
                k0<Integer, h0> k0Var = h0.f94534y;
                if (pVar != k0Var || qVar.p(k0Var) != 60) {
                    if (i0VarG != null) {
                        if (pVar.isDateElement()) {
                            oVarD0 = i0VarG;
                        } else if (pVar.isTimeElement()) {
                            oVarD0 = h0.D0();
                        }
                    }
                    if (oVarD0.n(pVar)) {
                        if (pVar.getType() == Integer.class) {
                            net.time4j.engine.p<Integer> pVar2 = (net.time4j.engine.p) h(pVar);
                            int iP = qVar.p(pVar2);
                            if (oVarD0.p(pVar2) != iP) {
                                objS = Integer.valueOf(iP);
                                zEquals = false;
                            } else {
                                zEquals = true;
                                objS = null;
                            }
                        } else {
                            objS = qVar.s(pVar);
                            zEquals = oVarD0.s(pVar).equals(objS);
                        }
                        if (!zEquals) {
                            StringBuilder sb4 = new StringBuilder(256);
                            sb4.append("Conflict found: ");
                            sb4.append("Text {");
                            sb4.append(charSequence.toString());
                            sb4.append("} with element ");
                            sb4.append(pVar.name());
                            sb4.append(" {");
                            sb4.append(objS);
                            sb4.append("}, but parsed entity ");
                            sb4.append("has element value {");
                            sb4.append(oVarD0.s(pVar));
                            sb4.append("}.");
                            sVar.k(charSequence.length(), sb4.toString());
                            return null;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static net.time4j.engine.w<?> j(net.time4j.engine.w<?> wVar, net.time4j.engine.w<?> wVar2, net.time4j.engine.p<?> pVar) {
        if (wVar.w(pVar)) {
            return wVar;
        }
        if (wVar2 == null) {
            do {
                wVar = wVar.a();
                if (wVar != null) {
                }
            } while (!wVar.w(pVar));
            return wVar;
        }
        if (pVar.isDateElement() && wVar2.w(pVar)) {
            return wVar2;
        }
        if (pVar.isTimeElement() && h0.g0().w(pVar)) {
            return h0.g0();
        }
        throw new IllegalArgumentException("Unsupported element: " + pVar.name());
    }

    private net.time4j.engine.o k(T t11, net.time4j.engine.d dVar) {
        net.time4j.s sVarP0;
        e<?> eVar = this.f94245b;
        if (eVar == null) {
            return this.f94244a.f(t11, dVar);
        }
        try {
            Class<?> clsP = eVar.e().p();
            net.time4j.engine.d0 d0Var = (net.time4j.engine.d0) dVar.b(net.time4j.format.a.f94190u, this.f94245b.h());
            net.time4j.b0 b0Var = (net.time4j.b0) net.time4j.b0.class.cast(t11);
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(net.time4j.format.a.f94173d);
            String str = "";
            if (net.time4j.engine.l.class.isAssignableFrom(clsP)) {
                net.time4j.engine.j jVar = (net.time4j.engine.j) h(this.f94245b.e());
                str = (String) dVar.a(net.time4j.format.a.f94189t);
                sVarP0 = b0Var.o0(jVar, str, kVar, d0Var);
            } else {
                if (!net.time4j.engine.m.class.isAssignableFrom(clsP)) {
                    throw new IllegalStateException("Unexpected calendar override: " + clsP);
                }
                sVarP0 = b0Var.p0(this.f94245b.e(), kVar, d0Var);
            }
            return new f(sVarP0, str, kVar, null);
        } catch (ClassCastException e11) {
            throw new IllegalArgumentException("Not formattable: " + t11, e11);
        } catch (NoSuchElementException e12) {
            throw new IllegalArgumentException(e12.getMessage(), e12);
        }
    }

    private String m(net.time4j.engine.o oVar) {
        StringBuilder sb2 = new StringBuilder(this.f94247d.size() * 8);
        try {
            K(oVar, sb2, this.f94246c, false);
            return sb2.toString();
        } catch (IOException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private List<i> n(List<i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().s(this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(net.time4j.engine.w<?> wVar, net.time4j.engine.w<?> wVar2, net.time4j.engine.w<?> wVar3) {
        if (wVar3 != null) {
            return -1;
        }
        int i11 = 0;
        if (wVar.equals(wVar2)) {
            return 0;
        }
        do {
            wVar2 = wVar2.a();
            if (wVar2 == null) {
                return Integer.MAX_VALUE;
            }
            i11++;
        } while (!wVar.equals(wVar2));
        return i11;
    }

    private static String t(net.time4j.engine.q<?> qVar) {
        Set<net.time4j.engine.p<?>> setV = qVar.v();
        StringBuilder sb2 = new StringBuilder(setV.size() * 16);
        sb2.append(" [parsed={");
        boolean z11 = true;
        for (net.time4j.engine.p<?> pVar : setV) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(qVar.s(pVar));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    private static String v(net.time4j.engine.q<?> qVar) {
        l0 l0Var = l0.ERROR_MESSAGE;
        if (!qVar.n(l0Var)) {
            return "Insufficient data:";
        }
        String str = "Validation failed => " + ((String) qVar.s(l0Var));
        qVar.B(l0Var, null);
        return str;
    }

    private boolean w() {
        boolean z11 = z();
        if (z11) {
            h<?> hVarD = this.f94247d.get(0).d();
            if (hVarD instanceof net.time4j.format.expert.f) {
                return ((net.time4j.format.expert.f) net.time4j.format.expert.f.class.cast(hVarD)).b();
            }
            if (!(hVarD instanceof z)) {
                return false;
            }
        }
        return z11;
    }

    private boolean x() {
        return this.f94244a.a() == null && this.f94245b == null;
    }

    private static boolean y(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public T D(CharSequence charSequence) throws ParseException {
        s sVar = new s();
        T tE = E(charSequence, sVar);
        if (tE == null) {
            throw new ParseException(sVar.d(), sVar.c());
        }
        int iF = sVar.f();
        if (this.f94256m || iF >= charSequence.length()) {
            return tE;
        }
        throw new ParseException("Unparsed trailing characters: " + P(iF, charSequence), iF);
    }

    public T E(CharSequence charSequence, s sVar) {
        if (!this.f94257n) {
            return a(charSequence, sVar, this.f94246c);
        }
        net.time4j.engine.w<T> wVar = this.f94244a;
        return (T) F(this, wVar, wVar.r(), charSequence, sVar, this.f94246c, this.f94254k, false, true);
    }

    public String I(T t11) {
        return m(k(t11, this.f94246c));
    }

    public Set<g> J(T t11, Appendable appendable, net.time4j.engine.d dVar) {
        return K(k(t11, dVar), appendable, dVar, true);
    }

    Set<g> K(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, boolean z11) throws IOException {
        LinkedList linkedList;
        Throwable th2;
        int iR;
        int i11;
        Appendable appendable2 = appendable;
        if (appendable2 == null) {
            throw new NullPointerException("Missing text result buffer.");
        }
        int size = this.f94247d.size();
        int i12 = 0;
        net.time4j.engine.d dVar2 = dVar;
        boolean z12 = dVar2 == this.f94246c;
        Set<g> linkedHashSet = z11 ? new LinkedHashSet(size) : null;
        if (this.f94251h) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(new StringBuilder(size << 2));
            if (z11) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.push(linkedHashSet);
                linkedList = linkedList3;
            } else {
                linkedList = null;
            }
            int iU = 0;
            while (iU < size) {
                i iVar = this.f94247d.get(iU);
                int iB = iVar.b();
                int i13 = iB;
                while (i13 > i12) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) linkedList2.peek());
                    linkedList2.push(sb2);
                    if (z11) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        linkedHashSet2.addAll((Collection) linkedList.peek());
                        linkedList.push(linkedHashSet2);
                        linkedHashSet = linkedHashSet2;
                    }
                    i13--;
                }
                while (i13 < i12) {
                    StringBuilder sb3 = (StringBuilder) linkedList2.pop();
                    linkedList2.pop();
                    linkedList2.push(sb3);
                    if (z11) {
                        Set<g> set = (Set) linkedList.pop();
                        linkedList.pop();
                        linkedList.push(set);
                        linkedHashSet = set;
                    }
                    i13++;
                }
                StringBuilder sb4 = (StringBuilder) linkedList2.peek();
                if (z11) {
                    linkedHashSet = (Set) linkedList.peek();
                }
                try {
                    iR = iVar.r(oVar, sb4, dVar2, linkedHashSet, z12);
                    th2 = null;
                } catch (IllegalArgumentException | ChronoException e11) {
                    th2 = e11;
                    iR = -1;
                }
                if (iR == -1) {
                    int iF = iVar.f();
                    if (!iVar.i()) {
                        i11 = iU + 1;
                        while (true) {
                            if (i11 >= size) {
                                i11 = iU;
                                break;
                            }
                            i iVar2 = this.f94247d.get(i11);
                            if (iVar2.i() && iVar2.f() == iF) {
                                break;
                            }
                            i11++;
                        }
                    } else {
                        i11 = iU;
                        break;
                    }
                    if (i11 <= iU && !iVar.i()) {
                        if (th2 == null) {
                            throw new IllegalArgumentException("Not formattable: " + oVar);
                        }
                        throw new IllegalArgumentException("Not formattable: " + oVar, th2);
                    }
                    linkedList2.pop();
                    StringBuilder sb5 = new StringBuilder();
                    if (!linkedList2.isEmpty()) {
                        sb5.append((CharSequence) linkedList2.peek());
                    }
                    linkedList2.push(sb5);
                    if (z11) {
                        linkedList.pop();
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        if (!linkedList.isEmpty()) {
                            linkedHashSet3.addAll((Collection) linkedList.peek());
                        }
                        linkedList.push(linkedHashSet3);
                    }
                    iU = i11;
                } else if (iVar.i()) {
                    iU = iVar.u();
                }
                iU++;
                dVar2 = dVar;
                i12 = iB;
            }
            StringBuilder sb6 = (StringBuilder) linkedList2.peek();
            linkedList2.clear();
            appendable2.append(sb6);
            if (z11) {
                Set<g> set2 = (Set) linkedList.peek();
                linkedList.clear();
                linkedHashSet = set2;
            }
        } else {
            int iU2 = 0;
            while (iU2 < size) {
                try {
                    i iVar3 = this.f94247d.get(iU2);
                    iVar3.r(oVar, appendable2, dVar, linkedHashSet, z12);
                    if (iVar3.i()) {
                        iU2 = iVar3.u();
                    }
                    iU2++;
                    appendable2 = appendable;
                } catch (ChronoException e12) {
                    throw new IllegalArgumentException("Not formattable: " + oVar, e12);
                }
            }
        }
        if (z11) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return null;
    }

    c<T> R(Map<net.time4j.engine.p<?>, Object> map, net.time4j.format.expert.b bVar) {
        net.time4j.format.expert.b bVarK = net.time4j.format.expert.b.k(bVar, this.f94246c);
        return new c<>(new c(this, map), bVarK, (net.time4j.history.d) bVarK.b(ep0.a.f63118a, null));
    }

    public <A extends Enum<A>> c<T> S(net.time4j.engine.c<A> cVar, A a11) {
        return new c<>(this, new net.time4j.format.a.b().f(this.f94246c.e()).d(cVar, a11).a());
    }

    public c<T> T(net.time4j.format.g gVar) {
        return S(net.time4j.format.a.f94175f, gVar);
    }

    public c<T> U(net.time4j.tz.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("Missing timezone id.");
        }
        return new c<>(this, this.f94246c.l(new net.time4j.format.a.b().f(this.f94246c.e()).i(lVar.z()).a()).m(net.time4j.format.a.f94174e, lVar.E()));
    }

    public c<T> V(net.time4j.tz.k kVar) {
        return U(net.time4j.tz.l.N(kVar));
    }

    @Override // net.time4j.format.expert.d
    public T a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar) {
        boolean z11;
        net.time4j.engine.d dVar2;
        net.time4j.format.g gVar;
        net.time4j.tz.k kVarG;
        net.time4j.b0 b0VarA;
        net.time4j.format.g gVar2 = this.f94254k;
        net.time4j.format.expert.b bVar = this.f94246c;
        if (dVar != bVar) {
            p pVar = new p(dVar, bVar);
            z11 = false;
            dVar2 = pVar;
            gVar = (net.time4j.format.g) pVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
        } else {
            z11 = true;
            dVar2 = dVar;
            gVar = gVar2;
        }
        boolean z12 = z11;
        e<?> eVar = this.f94245b;
        if (eVar == null) {
            return (T) G(this, this.f94244a, 0, charSequence, sVar, dVar2, gVar, z12);
        }
        List<net.time4j.engine.r> listG = eVar.g();
        e<?> eVar2 = this.f94245b;
        net.time4j.s sVar2 = (net.time4j.s) F(this, eVar2, listG, charSequence, sVar, dVar2, gVar, true, z12);
        if (sVar.i()) {
            return null;
        }
        net.time4j.engine.q<?> qVarH = sVar.h();
        if (qVarH.j()) {
            kVarG = qVarH.g();
        } else {
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f94173d;
            kVarG = dVar2.c(cVar) ? (net.time4j.tz.k) dVar2.a(cVar) : null;
        }
        if (kVarG != null) {
            net.time4j.engine.d0 d0Var = (net.time4j.engine.d0) dVar.b(net.time4j.format.a.f94190u, eVar2.h());
            net.time4j.engine.a0 a0Var = net.time4j.engine.a0.DAYLIGHT_SAVING;
            if (qVarH.n(a0Var)) {
                b0VarA = sVar2.a(net.time4j.tz.l.N(kVarG).Q(((net.time4j.tz.o) dVar2.b(net.time4j.format.a.f94174e, net.time4j.tz.l.f94761d)).b(((Boolean) qVarH.s(a0Var)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)), d0Var);
            } else {
                net.time4j.engine.c<net.time4j.tz.o> cVar2 = net.time4j.format.a.f94174e;
                b0VarA = dVar2.c(cVar2) ? sVar2.a(net.time4j.tz.l.N(kVarG).Q((net.time4j.tz.o) dVar2.a(cVar2)), d0Var) : sVar2.a(net.time4j.tz.l.N(kVarG), d0Var);
            }
        } else {
            b0VarA = null;
        }
        if (b0VarA == null) {
            sVar.k(charSequence.length(), "Missing timezone or offset.");
            return null;
        }
        qVarH.B(net.time4j.b0.Q().D(), b0VarA);
        T t11 = (T) h(b0VarA);
        if (gVar.isStrict()) {
            i(qVarH, t11, charSequence, sVar);
        }
        return t11;
    }

    @Override // net.time4j.format.expert.e
    public <R> R b(T t11, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.s<net.time4j.engine.o, R> sVar) throws IOException {
        net.time4j.engine.o oVarK = k(t11, dVar);
        K(oVarK, appendable, dVar, false);
        return sVar.apply(oVarK);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f94244a.equals(cVar.f94244a) && y(this.f94245b, cVar.f94245b) && this.f94246c.equals(cVar.f94246c) && this.f94248e.equals(cVar.f94248e) && this.f94247d.equals(cVar.f94247d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f94244a.hashCode() * 7) + (this.f94246c.hashCode() * 31) + (this.f94247d.hashCode() * 37);
    }

    public String l(T t11) {
        return I(t11);
    }

    public net.time4j.engine.d o() {
        return this.f94246c;
    }

    net.time4j.format.expert.b p() {
        return this.f94246c;
    }

    public net.time4j.engine.w<T> q() {
        return this.f94244a;
    }

    Map<net.time4j.engine.p<?>, Object> r() {
        return this.f94248e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("net.time4j.format.ChronoFormatter[chronology=");
        sb2.append(this.f94244a.p().getName());
        if (this.f94245b != null) {
            sb2.append(", override=");
            sb2.append(this.f94245b);
        }
        sb2.append(", default-attributes=");
        sb2.append(this.f94246c);
        sb2.append(", default-values=");
        sb2.append(this.f94248e);
        sb2.append(", processors=");
        boolean z11 = true;
        for (i iVar : this.f94247d) {
            if (z11) {
                sb2.append(CoreConstants.CURLY_LEFT);
                z11 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(iVar);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public Locale u() {
        return this.f94246c.h();
    }

    boolean z() {
        return this.f94259p == 1 && !this.f94250g;
    }

    /* synthetic */ c(c cVar, net.time4j.format.expert.b bVar, a aVar) {
        this(cVar, bVar);
    }

    private c(net.time4j.engine.w<T> wVar, net.time4j.engine.w<?> wVar2, Locale locale, List<i> list, Map<net.time4j.engine.p<?>, Object> map, net.time4j.format.a aVar, net.time4j.engine.w<?> wVar3) {
        if (wVar != null) {
            if (!list.isEmpty()) {
                this.f94244a = wVar;
                this.f94245b = e.i(wVar2);
                this.f94258o = wVar3;
                net.time4j.format.expert.b bVarD = net.time4j.format.expert.b.d(wVar2 == null ? wVar : wVar2, aVar, locale);
                this.f94246c = bVarD;
                this.f94254k = (net.time4j.format.g) bVarD.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
                this.f94248e = Collections.unmodifiableMap(map);
                j jVar = null;
                boolean z11 = true;
                boolean z12 = false;
                boolean z13 = false;
                boolean zA = false;
                int i11 = 0;
                for (i iVar : list) {
                    z13 = iVar.i() ? true : z13;
                    if (jVar == null && (iVar.d() instanceof j)) {
                        jVar = (j) j.class.cast(iVar.d());
                    }
                    if (!z12 && iVar.b() > 0) {
                        z12 = true;
                    }
                    net.time4j.engine.p<?> element = iVar.d().getElement();
                    if (element != null) {
                        i11++;
                        if (z11 && !v.Q(element)) {
                            z11 = false;
                        }
                        if (!zA) {
                            zA = A(wVar, wVar2, element);
                        }
                    }
                }
                this.f94249f = jVar;
                this.f94250g = z12;
                this.f94251h = z13;
                this.f94252i = zA;
                this.f94253j = i11;
                this.f94255l = z11;
                this.f94256m = ((Boolean) this.f94246c.b(net.time4j.format.a.f94187r, Boolean.FALSE)).booleanValue();
                this.f94257n = x();
                this.f94259p = list.size();
                this.f94247d = n(list);
                this.f94260q = w();
                return;
            }
            throw new IllegalStateException("No format processors defined.");
        }
        throw new NullPointerException("Missing chronology.");
    }

    private c(c<T> cVar, net.time4j.format.a aVar) {
        this(cVar, cVar.f94246c.l(aVar), (net.time4j.history.d) null);
    }

    private c(c<T> cVar, net.time4j.format.expert.b bVar) {
        this(cVar, bVar, (net.time4j.history.d) null);
    }

    private c(c<T> cVar, net.time4j.format.expert.b bVar, net.time4j.history.d dVar) {
        net.time4j.engine.p<Integer> pVarC;
        if (bVar != null) {
            this.f94244a = cVar.f94244a;
            this.f94245b = cVar.f94245b;
            this.f94258o = cVar.f94258o;
            this.f94246c = bVar;
            this.f94254k = (net.time4j.format.g) bVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
            this.f94248e = Collections.unmodifiableMap(new q(cVar.f94248e));
            this.f94249f = cVar.f94249f;
            this.f94250g = cVar.f94250g;
            this.f94251h = cVar.f94251h;
            this.f94252i = cVar.f94252i || dVar != null;
            this.f94253j = cVar.f94253j;
            int size = cVar.f94247d.size();
            ArrayList arrayList = new ArrayList(cVar.f94247d);
            boolean z11 = cVar.f94255l;
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = arrayList.get(i11);
                net.time4j.engine.p<?> element = iVar.d().getElement();
                net.time4j.engine.w wVarA = this.f94244a;
                wVarA = wVarA == net.time4j.b0.Q() ? wVarA.a() : wVarA;
                if (element != null && !wVarA.v(element)) {
                    for (net.time4j.engine.r rVar : wVarA.r()) {
                        if (rVar.b(cVar.u(), cVar.f94246c).contains(element)) {
                            for (net.time4j.engine.p<?> pVar : rVar.b(bVar.h(), bVar)) {
                                if (pVar.name().equals(element.name())) {
                                    if (pVar == element) {
                                        break;
                                    }
                                    arrayList.set(i11, iVar.x(pVar));
                                    z11 = false;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
                if (dVar != null) {
                    if (element == net.time4j.g0.f94489p) {
                        pVarC = dVar.M();
                    } else if (element != net.time4j.g0.f94492s && element != net.time4j.g0.f94493t) {
                        if (element == net.time4j.g0.f94494u) {
                            pVarC = dVar.g();
                        } else {
                            pVarC = element == net.time4j.g0.f94496w ? dVar.h() : null;
                        }
                    } else {
                        pVarC = dVar.C();
                    }
                    if (pVarC != null) {
                        arrayList.set(i11, iVar.x(pVarC));
                    }
                    z11 = false;
                }
            }
            this.f94255l = z11;
            this.f94256m = ((Boolean) this.f94246c.b(net.time4j.format.a.f94187r, Boolean.FALSE)).booleanValue();
            this.f94257n = x();
            this.f94259p = arrayList.size();
            this.f94247d = n(arrayList);
            this.f94260q = w();
            return;
        }
        throw new NullPointerException("Missing global format attributes.");
    }

    private c(c<T> cVar, Map<net.time4j.engine.p<?>, Object> map) {
        e<?> eVar = cVar.f94245b;
        net.time4j.engine.w<?> wVarE = eVar == null ? null : eVar.e();
        Iterator<net.time4j.engine.p<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            j(cVar.f94244a, wVarE, it.next());
        }
        this.f94244a = cVar.f94244a;
        this.f94245b = cVar.f94245b;
        this.f94258o = cVar.f94258o;
        this.f94246c = cVar.f94246c;
        this.f94254k = cVar.f94254k;
        this.f94249f = cVar.f94249f;
        this.f94250g = cVar.f94250g;
        this.f94251h = cVar.f94251h;
        this.f94252i = cVar.f94252i;
        this.f94253j = cVar.f94253j;
        this.f94256m = cVar.f94256m;
        HashMap map2 = new HashMap(cVar.f94248e);
        boolean z11 = cVar.f94255l;
        for (net.time4j.engine.p<?> pVar : map.keySet()) {
            Object obj = map.get(pVar);
            if (obj == null) {
                map2.remove(pVar);
            } else {
                map2.put(pVar, obj);
                z11 = z11 && v.Q(pVar);
            }
        }
        this.f94248e = Collections.unmodifiableMap(map2);
        this.f94255l = z11;
        this.f94257n = x();
        this.f94259p = cVar.f94259p;
        this.f94247d = n(cVar.f94247d);
        this.f94260q = w();
    }
}
