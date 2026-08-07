package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import net.time4j.h0;
import net.time4j.i0;
import net.time4j.z0;

/* JADX INFO: loaded from: classes9.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f94341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f94342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f94343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final net.time4j.engine.n<net.time4j.engine.o> f94344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final net.time4j.engine.n<Character> f94345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f94353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final net.time4j.format.expert.c<h0> f94354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final net.time4j.format.expert.c<h0> f94355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final net.time4j.format.expert.c<i0> f94356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final net.time4j.format.expert.c<i0> f94357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.b0> f94358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.b0> f94359s;

    static class a implements e<net.time4j.g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f94360a;

        a(boolean z11) {
            this.f94360a = z11;
        }

        @Override // net.time4j.format.expert.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public <R> R b(net.time4j.g0 g0Var, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.s<net.time4j.engine.o, R> sVar) {
            (this.f94360a ? l.f94347g : l.f94346f).J(g0Var, appendable, dVar);
            return null;
        }
    }

    static class b implements net.time4j.format.expert.d<net.time4j.g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f94361a;

        b(boolean z11) {
            this.f94361a = z11;
        }

        @Override // net.time4j.format.expert.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.g0 a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar) {
            int length = charSequence.length();
            int iF = sVar.f();
            int i11 = length - iF;
            int i12 = 0;
            for (int i13 = iF + 1; i13 < length; i13++) {
                char cCharAt = charSequence.charAt(i13);
                if (cCharAt == '-') {
                    i12++;
                } else {
                    if (cCharAt == '/' || cCharAt == 'T') {
                        i11 = i13 - iF;
                        break;
                    }
                    if (cCharAt == 'W') {
                        return this.f94361a ? l.f94351k.E(charSequence, sVar) : l.f94350j.E(charSequence, sVar);
                    }
                }
            }
            if (this.f94361a) {
                return i12 == 1 ? l.f94349i.E(charSequence, sVar) : l.f94347g.E(charSequence, sVar);
            }
            int i14 = i11 - 4;
            char cCharAt2 = charSequence.charAt(iF);
            if (cCharAt2 == '+' || cCharAt2 == '-') {
                i14 = i11 - 6;
            }
            return i14 == 3 ? l.f94348h.E(charSequence, sVar) : l.f94346f.E(charSequence, sVar);
        }
    }

    private static class c implements net.time4j.engine.n<net.time4j.engine.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f94362a;

        class a implements net.time4j.engine.n<net.time4j.engine.o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f94363a;

            a(c cVar) {
                this.f94363a = cVar;
            }

            @Override // net.time4j.engine.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(net.time4j.engine.o oVar) {
                return c.this.test(oVar) || this.f94363a.test(oVar);
            }
        }

        c(net.time4j.engine.p<Integer> pVar) {
            this.f94362a = pVar;
        }

        net.time4j.engine.n<net.time4j.engine.o> a(c cVar) {
            return new a(cVar);
        }

        @Override // net.time4j.engine.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean test(net.time4j.engine.o oVar) {
            return oVar.p(this.f94362a) > 0;
        }
    }

    private static class d implements net.time4j.engine.n<Character> {
        private d() {
        }

        @Override // net.time4j.engine.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Character ch2) {
            return ch2.charValue() == 'T';
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        f94341a = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        c cVar = new c(h0.f94534y);
        f94342b = cVar;
        c cVar2 = new c(h0.C);
        f94343c = cVar2;
        f94344d = cVar.a(cVar2);
        f94345e = new d(null);
        f94346f = b(false);
        f94347g = b(true);
        f94348h = h(false);
        f94349i = h(true);
        f94350j = m(false);
        f94351k = m(true);
        f94352l = c(false);
        f94353m = c(true);
        f94354n = k(false);
        f94355o = k(true);
        f94356p = l(false);
        f94357q = l(true);
        f94358r = g(false);
        f94359s = g(true);
    }

    private static <T extends net.time4j.engine.q<T>> void a(net.time4j.format.expert.c.d<T> dVar, boolean z11) {
        dVar.b0(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC);
        dVar.Z(net.time4j.format.a.f94182m, '0');
        dVar.g(h0.f94531v, 2);
        dVar.X();
        if (z11) {
            dVar.l(CoreConstants.COLON_CHAR);
        }
        dVar.g(h0.f94532w, 2);
        dVar.Y(f94344d);
        if (z11) {
            dVar.l(CoreConstants.COLON_CHAR);
        }
        dVar.g(h0.f94534y, 2);
        dVar.Y(f94343c);
        if (f94341a == ',') {
            dVar.m(CoreConstants.COMMA_CHAR, CoreConstants.DOT);
        } else {
            dVar.m(CoreConstants.DOT, CoreConstants.COMMA_CHAR);
        }
        dVar.i(h0.C, 0, 9, false);
        for (int i11 = 0; i11 < 5; i11++) {
            dVar.L();
        }
    }

    private static net.time4j.format.expert.c<net.time4j.g0> b(boolean z11) {
        net.time4j.format.expert.c.d dVarK = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT).b0(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC).Z(net.time4j.format.a.f94182m, '0').k(net.time4j.g0.f94489p, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z11) {
            dVarK.l(CoreConstants.DASH_CHAR);
        }
        dVarK.g(net.time4j.g0.f94493t, 2);
        if (z11) {
            dVarK.l(CoreConstants.DASH_CHAR);
        }
        return dVarK.g(net.time4j.g0.f94494u, 2).L().L().F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.c<net.time4j.g0> c(boolean z11) {
        net.time4j.format.expert.c.d dVarN = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT);
        dVarN.d(net.time4j.g0.f94488o, e(z11), d(z11));
        return dVarN.F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.d<net.time4j.g0> d(boolean z11) {
        return new b(z11);
    }

    private static e<net.time4j.g0> e(boolean z11) {
        return new a(z11);
    }

    private static net.time4j.format.expert.c<net.time4j.b0> f(net.time4j.format.e eVar, boolean z11) {
        net.time4j.format.expert.c.d dVarN = net.time4j.format.expert.c.N(net.time4j.b0.class, Locale.ROOT);
        dVarN.d(net.time4j.g0.f94488o, e(z11), d(z11));
        dVarN.l('T');
        a(dVarN, z11);
        dVarN.C(eVar, z11, Collections.singletonList("Z"));
        return dVarN.F();
    }

    private static net.time4j.format.expert.c<net.time4j.b0> g(boolean z11) {
        net.time4j.format.expert.c.d dVarN = net.time4j.format.expert.c.N(net.time4j.b0.class, Locale.ROOT);
        dVarN.d(net.time4j.b0.Q().D(), f(net.time4j.format.e.MEDIUM, z11), f(net.time4j.format.e.SHORT, z11));
        return dVarN.F().T(net.time4j.format.g.STRICT).V(net.time4j.tz.p.f94822k);
    }

    private static net.time4j.format.expert.c<net.time4j.g0> h(boolean z11) {
        net.time4j.format.expert.c.d dVarK = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT).b0(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC).Z(net.time4j.format.a.f94182m, '0').k(net.time4j.g0.f94489p, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z11) {
            dVarK.l(CoreConstants.DASH_CHAR);
        }
        return dVarK.g(net.time4j.g0.f94496w, 3).L().L().F().T(net.time4j.format.g.STRICT);
    }

    public static net.time4j.g0 i(CharSequence charSequence) {
        s sVar = new s();
        net.time4j.g0 g0VarJ = j(charSequence, sVar);
        if (g0VarJ == null || sVar.i()) {
            throw new ParseException(sVar.d(), sVar.c());
        }
        if (sVar.f() >= charSequence.length()) {
            return g0VarJ;
        }
        throw new ParseException("Trailing characters found: " + ((Object) charSequence), sVar.f());
    }

    public static net.time4j.g0 j(CharSequence charSequence, s sVar) {
        int length = charSequence.length();
        int iF = sVar.f();
        int i11 = length - iF;
        if (i11 < 7) {
            sVar.k(length, "Too short to be compatible with ISO-8601: " + ((Object) charSequence.subSequence(iF, length)));
            return null;
        }
        int i12 = 0;
        for (int i13 = iF + 1; i13 < length; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '-') {
                i12++;
            } else {
                if (cCharAt == '/' || cCharAt == 'T') {
                    i11 = i13 - iF;
                    break;
                }
                if (cCharAt == 'W') {
                    return i12 > 0 ? f94351k.E(charSequence, sVar) : f94350j.E(charSequence, sVar);
                }
            }
        }
        if (i12 != 0) {
            return i12 == 1 ? f94349i.E(charSequence, sVar) : f94347g.E(charSequence, sVar);
        }
        int i14 = i11 - 4;
        char cCharAt2 = charSequence.charAt(iF);
        if (cCharAt2 == '+' || cCharAt2 == '-') {
            i14 = i11 - 6;
        }
        return i14 == 3 ? f94348h.E(charSequence, sVar) : f94346f.E(charSequence, sVar);
    }

    private static net.time4j.format.expert.c<h0> k(boolean z11) {
        net.time4j.format.expert.c.d dVarN = net.time4j.format.expert.c.N(h0.class, Locale.ROOT);
        dVarN.W(f94345e, 1);
        a(dVarN, z11);
        return dVarN.F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.c<i0> l(boolean z11) {
        net.time4j.format.expert.c.d dVarN = net.time4j.format.expert.c.N(i0.class, Locale.ROOT);
        dVarN.d(net.time4j.g0.f94488o, e(z11), d(z11));
        dVarN.l('T');
        a(dVarN, z11);
        return dVarN.F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.c<net.time4j.g0> m(boolean z11) {
        net.time4j.format.expert.c.d dVarK = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT).b0(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC).Z(net.time4j.format.a.f94182m, '0').k(net.time4j.g0.f94490q, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z11) {
            dVarK.l(CoreConstants.DASH_CHAR);
        }
        dVarK.l('W');
        dVarK.g(z0.f94846m.n(), 2);
        if (z11) {
            dVarK.l(CoreConstants.DASH_CHAR);
        }
        return dVarK.h(net.time4j.g0.f94495v, 1).L().L().F().T(net.time4j.format.g.STRICT);
    }
}
