package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f21236g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f0 f21237a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21238b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21239c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f21240d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.caverock.androidsvg.b.r f21241e = new com.caverock.androidsvg.b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, l0> f21242f = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21243a;

        static {
            int[] iArr = new int[d1.values().length];
            f21243a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21243a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21243a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21243a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21243a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21243a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21243a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21243a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21243a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class a0 extends z {
        a0() {
        }

        @Override // com.caverock.androidsvg.g.z, com.caverock.androidsvg.g.n0
        String m() {
            return "polygon";
        }
    }

    static abstract class a1 extends y0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List<p> f21244o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List<p> f21245p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        List<p> f21246q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        List<p> f21247r;

        a1() {
        }
    }

    static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f21252o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21253p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21254q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21255r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f21256s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f21257t;

        b0() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "rect";
        }
    }

    interface b1 {
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        p f21258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        p f21259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        p f21260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        p f21261d;

        c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f21258a = pVar;
            this.f21259b = pVar2;
            this.f21260c = pVar3;
            this.f21261d = pVar4;
        }
    }

    static class c0 extends l0 implements j0 {
        c0() {
        }

        @Override // com.caverock.androidsvg.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.g.j0
        public void h(n0 n0Var) {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "solidColor";
        }
    }

    static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f21262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b1 f21263d;

        c1(String str) {
            this.f21262c = str;
        }

        @Override // com.caverock.androidsvg.g.x0
        public b1 c() {
            return this.f21263d;
        }

        public String toString() {
            return "TextChild: '" + this.f21262c + "'";
        }
    }

    static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f21264o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21265p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21266q;

        d() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "circle";
        }
    }

    static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Float f21267h;

        d0() {
        }

        @Override // com.caverock.androidsvg.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.g.j0
        public void h(n0 n0Var) {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "stop";
        }
    }

    enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    static class e extends m implements t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f21276p;

        e() {
        }

        @Override // com.caverock.androidsvg.g.m, com.caverock.androidsvg.g.n0
        String m() {
            return "clipPath";
        }
    }

    static class e0 implements Cloneable {
        Boolean A;
        Boolean B;
        o0 C;
        Float D;
        String E;
        a F;
        String G;
        o0 H;
        Float I;
        o0 J;
        Float K;
        i L;
        e M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f21277a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o0 f21278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f21279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Float f21280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        o0 f21281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Float f21282f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        p f21283g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        c f21284h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        d f21285i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Float f21286j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        p[] f21287k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        p f21288l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Float f21289m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        f f21290n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List<String> f21291o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21292p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Integer f21293q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        b f21294r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        EnumC0425g f21295s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        h f21296t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        f f21297u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Boolean f21298v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        c f21299w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f21300x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f21301y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f21302z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: com.caverock.androidsvg.g$e0$g, reason: collision with other inner class name */
        public enum EnumC0425g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        e0() {
        }

        static e0 a() {
            e0 e0Var = new e0();
            e0Var.f21277a = -1L;
            f fVar = f.f21308b;
            e0Var.f21278b = fVar;
            a aVar = a.NonZero;
            e0Var.f21279c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f21280d = fValueOf;
            e0Var.f21281e = null;
            e0Var.f21282f = fValueOf;
            e0Var.f21283g = new p(1.0f);
            e0Var.f21284h = c.Butt;
            e0Var.f21285i = d.Miter;
            e0Var.f21286j = Float.valueOf(4.0f);
            e0Var.f21287k = null;
            e0Var.f21288l = new p(BitmapDescriptorFactory.HUE_RED);
            e0Var.f21289m = fValueOf;
            e0Var.f21290n = fVar;
            e0Var.f21291o = null;
            e0Var.f21292p = new p(12.0f, d1.pt);
            e0Var.f21293q = 400;
            e0Var.f21294r = b.Normal;
            e0Var.f21295s = EnumC0425g.None;
            e0Var.f21296t = h.LTR;
            e0Var.f21297u = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f21298v = bool;
            e0Var.f21299w = null;
            e0Var.f21300x = null;
            e0Var.f21301y = null;
            e0Var.f21302z = null;
            e0Var.A = bool;
            e0Var.B = bool;
            e0Var.C = fVar;
            e0Var.D = fValueOf;
            e0Var.E = null;
            e0Var.F = aVar;
            e0Var.G = null;
            e0Var.H = null;
            e0Var.I = fValueOf;
            e0Var.J = null;
            e0Var.K = fValueOf;
            e0Var.L = i.None;
            e0Var.M = e.auto;
            return e0Var;
        }

        void b(boolean z11) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.A = bool;
            if (!z11) {
                bool = Boolean.FALSE;
            }
            this.f21298v = bool;
            this.f21299w = null;
            this.E = null;
            this.f21289m = fValueOf;
            this.C = f.f21308b;
            this.D = fValueOf;
            this.G = null;
            this.H = null;
            this.I = fValueOf;
            this.J = null;
            this.K = fValueOf;
            this.L = i.None;
        }

        protected Object clone() {
            e0 e0Var = (e0) super.clone();
            p[] pVarArr = this.f21287k;
            if (pVarArr != null) {
                e0Var.f21287k = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    static class e1 extends m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f21303p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21304q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21305r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f21306s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f21307t;

        e1() {
        }

        @Override // com.caverock.androidsvg.g.m, com.caverock.androidsvg.g.n0
        String m() {
            return "use";
        }
    }

    static class f extends o0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f21308b = new f(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f21309c = new f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21310a;

        f(int i11) {
            this.f21310a = i11;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f21310a));
        }
    }

    static class f0 extends r0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21311q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21312r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f21313s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f21314t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f21315u;

        f0() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "svg";
        }
    }

    static class f1 extends r0 implements t {
        f1() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.g$g, reason: collision with other inner class name */
    static class C0426g extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static C0426g f21316a = new C0426g();

        private C0426g() {
        }

        static C0426g a() {
            return f21316a;
        }
    }

    interface g0 {
        String a();

        void b(Set<String> set);

        void d(Set<String> set);

        Set<String> e();

        Set<String> f();

        void g(Set<String> set);

        Set<String> getRequiredFeatures();

        void i(Set<String> set);

        void j(String str);

        Set<String> l();
    }

    static class h extends m implements t {
        h() {
        }

        @Override // com.caverock.androidsvg.g.m, com.caverock.androidsvg.g.n0
        String m() {
            return "defs";
        }
    }

    static abstract class h0 extends k0 implements j0, g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List<n0> f21317i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Set<String> f21318j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f21319k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set<String> f21320l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set<String> f21321m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Set<String> f21322n = null;

        h0() {
        }

        @Override // com.caverock.androidsvg.g.g0
        public String a() {
            return this.f21319k;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void b(Set<String> set) {
            this.f21322n = set;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void d(Set<String> set) {
            this.f21320l = set;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> e() {
            return this.f21321m;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> f() {
            return null;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void g(Set<String> set) {
            this.f21318j = set;
        }

        @Override // com.caverock.androidsvg.g.j0
        public List<n0> getChildren() {
            return this.f21317i;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> getRequiredFeatures() {
            return this.f21318j;
        }

        @Override // com.caverock.androidsvg.g.j0
        public void h(n0 n0Var) {
            this.f21317i.add(n0Var);
        }

        @Override // com.caverock.androidsvg.g.g0
        public void i(Set<String> set) {
            this.f21321m = set;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void j(String str) {
            this.f21319k = str;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> l() {
            return this.f21322n;
        }
    }

    static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f21323o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21324p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21325q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21326r;

        i() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "ellipse";
        }
    }

    static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Set<String> f21327i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f21328j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Set<String> f21329k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set<String> f21330l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set<String> f21331m = null;

        i0() {
        }

        @Override // com.caverock.androidsvg.g.g0
        public String a() {
            return this.f21328j;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void b(Set<String> set) {
            this.f21331m = set;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void d(Set<String> set) {
            this.f21329k = set;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> e() {
            return this.f21330l;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> f() {
            return this.f21329k;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void g(Set<String> set) {
            this.f21327i = set;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> getRequiredFeatures() {
            return this.f21327i;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void i(Set<String> set) {
            this.f21330l = set;
        }

        @Override // com.caverock.androidsvg.g.g0
        public void j(String str) {
            this.f21328j = str;
        }

        @Override // com.caverock.androidsvg.g.g0
        public Set<String> l() {
            return this.f21331m;
        }
    }

    static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List<n0> f21332h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Boolean f21333i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Matrix f21334j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        k f21335k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f21336l;

        j() {
        }

        @Override // com.caverock.androidsvg.g.j0
        public List<n0> getChildren() {
            return this.f21332h;
        }

        @Override // com.caverock.androidsvg.g.j0
        public void h(n0 n0Var) throws SVGParseException {
            if (n0Var instanceof d0) {
                this.f21332h.add(n0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + n0Var + " elements.");
        }
    }

    interface j0 {
        List<n0> getChildren();

        void h(n0 n0Var);
    }

    enum k {
        pad,
        reflect,
        repeat
    }

    static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        b f21337h = null;

        k0() {
        }
    }

    static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Matrix f21338n;

        l() {
        }

        @Override // com.caverock.androidsvg.g.n
        public void k(Matrix matrix) {
            this.f21338n = matrix;
        }
    }

    static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f21339c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Boolean f21340d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e0 f21341e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e0 f21342f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<String> f21343g = null;

        l0() {
        }

        public String toString() {
            return m();
        }
    }

    static class m extends h0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Matrix f21344o;

        m() {
        }

        @Override // com.caverock.androidsvg.g.n
        public void k(Matrix matrix) {
            this.f21344o = matrix;
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return Kind.GROUP;
        }
    }

    static class m0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        p f21345m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        p f21346n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f21347o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21348p;

        m0() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "linearGradient";
        }
    }

    interface n {
        void k(Matrix matrix);
    }

    static class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f21349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j0 f21350b;

        n0() {
        }

        String m() {
            return "";
        }
    }

    static class o extends p0 implements n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f21351p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21352q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21353r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f21354s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f21355t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Matrix f21356u;

        o() {
        }

        @Override // com.caverock.androidsvg.g.n
        public void k(Matrix matrix) {
            this.f21356u = matrix;
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "image";
        }
    }

    static abstract class o0 implements Cloneable {
        o0() {
        }
    }

    static abstract class p0 extends h0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        com.caverock.androidsvg.e f21359o = null;

        p0() {
        }
    }

    static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f21360o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21361p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21362q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21363r;

        q() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "line";
        }
    }

    static class q0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        p f21364m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        p f21365n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f21366o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21367p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21368q;

        q0() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "radialGradient";
        }
    }

    static class r extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f21369q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21370r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f21371s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f21372t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        p f21373u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Float f21374v;

        r() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "marker";
        }
    }

    static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        b f21375p;

        r0() {
        }
    }

    static class s extends h0 implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f21376o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f21377p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f21378q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f21379r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f21380s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f21381t;

        s() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "mask";
        }
    }

    static class s0 extends m {
        s0() {
        }

        @Override // com.caverock.androidsvg.g.m, com.caverock.androidsvg.g.n0
        String m() {
            return "switch";
        }
    }

    interface t {
    }

    static class t0 extends r0 implements t {
        t0() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "symbol";
        }
    }

    static class u extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f21382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o0 f21383b;

        u(String str, o0 o0Var) {
            this.f21382a = str;
            this.f21383b = o0Var;
        }

        public String toString() {
            return this.f21382a + " " + this.f21383b;
        }
    }

    static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f21384o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b1 f21385p;

        u0() {
        }

        @Override // com.caverock.androidsvg.g.x0
        public b1 c() {
            return this.f21385p;
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "tref";
        }

        public void n(b1 b1Var) {
            this.f21385p = b1Var;
        }
    }

    static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        w f21386o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f21387p;

        v() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "path";
        }
    }

    static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b1 f21388s;

        v0() {
        }

        @Override // com.caverock.androidsvg.g.x0
        public b1 c() {
            return this.f21388s;
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "tspan";
        }

        public void n(b1 b1Var) {
            this.f21388s = b1Var;
        }
    }

    static class w implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21390b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21392d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f21389a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f21391c = new float[16];

        w() {
        }

        private void c(byte b11) {
            int i11 = this.f21390b;
            byte[] bArr = this.f21389a;
            if (i11 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f21389a = bArr2;
            }
            byte[] bArr3 = this.f21389a;
            int i12 = this.f21390b;
            this.f21390b = i12 + 1;
            bArr3[i12] = b11;
        }

        private void d(int i11) {
            float[] fArr = this.f21391c;
            if (fArr.length < this.f21392d + i11) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f21391c = fArr2;
            }
        }

        @Override // com.caverock.androidsvg.g.x
        public void a(float f11, float f12, float f13, float f14) {
            c((byte) 3);
            d(4);
            float[] fArr = this.f21391c;
            int i11 = this.f21392d;
            int i12 = i11 + 1;
            this.f21392d = i12;
            fArr[i11] = f11;
            int i13 = i11 + 2;
            this.f21392d = i13;
            fArr[i12] = f12;
            int i14 = i11 + 3;
            this.f21392d = i14;
            fArr[i13] = f13;
            this.f21392d = i11 + 4;
            fArr[i14] = f14;
        }

        @Override // com.caverock.androidsvg.g.x
        public void b(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            c((byte) ((z11 ? 2 : 0) | 4 | (z12 ? 1 : 0)));
            d(5);
            float[] fArr = this.f21391c;
            int i11 = this.f21392d;
            int i12 = i11 + 1;
            this.f21392d = i12;
            fArr[i11] = f11;
            int i13 = i11 + 2;
            this.f21392d = i13;
            fArr[i12] = f12;
            int i14 = i11 + 3;
            this.f21392d = i14;
            fArr[i13] = f13;
            int i15 = i11 + 4;
            this.f21392d = i15;
            fArr[i14] = f14;
            this.f21392d = i11 + 5;
            fArr[i15] = f15;
        }

        @Override // com.caverock.androidsvg.g.x
        public void close() {
            c((byte) 8);
        }

        @Override // com.caverock.androidsvg.g.x
        public void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            c((byte) 2);
            d(6);
            float[] fArr = this.f21391c;
            int i11 = this.f21392d;
            int i12 = i11 + 1;
            this.f21392d = i12;
            fArr[i11] = f11;
            int i13 = i11 + 2;
            this.f21392d = i13;
            fArr[i12] = f12;
            int i14 = i11 + 3;
            this.f21392d = i14;
            fArr[i13] = f13;
            int i15 = i11 + 4;
            this.f21392d = i15;
            fArr[i14] = f14;
            int i16 = i11 + 5;
            this.f21392d = i16;
            fArr[i15] = f15;
            this.f21392d = i11 + 6;
            fArr[i16] = f16;
        }

        void e(x xVar) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f21390b; i12++) {
                byte b11 = this.f21389a[i12];
                if (b11 == 0) {
                    float[] fArr = this.f21391c;
                    int i13 = i11 + 1;
                    float f11 = fArr[i11];
                    i11 += 2;
                    xVar.moveTo(f11, fArr[i13]);
                } else if (b11 == 1) {
                    float[] fArr2 = this.f21391c;
                    int i14 = i11 + 1;
                    float f12 = fArr2[i11];
                    i11 += 2;
                    xVar.lineTo(f12, fArr2[i14]);
                } else if (b11 == 2) {
                    float[] fArr3 = this.f21391c;
                    xVar.cubicTo(fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3], fArr3[i11 + 4], fArr3[i11 + 5]);
                    i11 += 6;
                } else if (b11 == 3) {
                    float[] fArr4 = this.f21391c;
                    float f13 = fArr4[i11];
                    float f14 = fArr4[i11 + 1];
                    int i15 = i11 + 3;
                    float f15 = fArr4[i11 + 2];
                    i11 += 4;
                    xVar.a(f13, f14, f15, fArr4[i15]);
                } else if (b11 != 8) {
                    boolean z11 = (b11 & 2) != 0;
                    boolean z12 = (b11 & 1) != 0;
                    float[] fArr5 = this.f21391c;
                    xVar.b(fArr5[i11], fArr5[i11 + 1], fArr5[i11 + 2], z11, z12, fArr5[i11 + 3], fArr5[i11 + 4]);
                    i11 += 5;
                } else {
                    xVar.close();
                }
            }
        }

        boolean f() {
            return this.f21390b == 0;
        }

        @Override // com.caverock.androidsvg.g.x
        public void lineTo(float f11, float f12) {
            c((byte) 1);
            d(2);
            float[] fArr = this.f21391c;
            int i11 = this.f21392d;
            int i12 = i11 + 1;
            this.f21392d = i12;
            fArr[i11] = f11;
            this.f21392d = i11 + 2;
            fArr[i12] = f12;
        }

        @Override // com.caverock.androidsvg.g.x
        public void moveTo(float f11, float f12) {
            c((byte) 0);
            d(2);
            float[] fArr = this.f21391c;
            int i11 = this.f21392d;
            int i12 = i11 + 1;
            this.f21392d = i12;
            fArr[i11] = f11;
            this.f21392d = i11 + 2;
            fArr[i12] = f12;
        }
    }

    static class w0 extends a1 implements b1, n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f21393s;

        w0() {
        }

        @Override // com.caverock.androidsvg.g.n
        public void k(Matrix matrix) {
            this.f21393s = matrix;
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "text";
        }
    }

    interface x {
        void a(float f11, float f12, float f13, float f14);

        void b(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15);

        void close();

        void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16);

        void lineTo(float f11, float f12);

        void moveTo(float f11, float f12);
    }

    interface x0 {
        b1 c();
    }

    static class y extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f21394q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Boolean f21395r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f21396s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f21397t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        p f21398u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        p f21399v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        p f21400w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f21401x;

        y() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "pattern";
        }
    }

    static abstract class y0 extends h0 {
        y0() {
        }

        @Override // com.caverock.androidsvg.g.h0, com.caverock.androidsvg.g.j0
        public void h(n0 n0Var) throws SVGParseException {
            if (n0Var instanceof x0) {
                this.f21317i.add(n0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f21402o;

        z() {
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "polyline";
        }
    }

    static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f21403o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f21404p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b1 f21405q;

        z0() {
        }

        @Override // com.caverock.androidsvg.g.x0
        public b1 c() {
            return this.f21405q;
        }

        @Override // com.caverock.androidsvg.g.n0
        String m() {
            return "textPath";
        }

        public void n(b1 b1Var) {
            this.f21405q = b1Var;
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private b e(float f11) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fB;
        d1 d1Var5;
        f0 f0Var = this.f21237a;
        p pVar = f0Var.f21313s;
        p pVar2 = f0Var.f21314t;
        if (pVar == null || pVar.h() || (d1Var = pVar.f21358b) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = pVar.b(f11);
        if (pVar2 == null) {
            b bVar = this.f21237a.f21375p;
            fB = bVar != null ? (bVar.f21251d * fB2) / bVar.f21250c : fB2;
        } else {
            if (pVar2.h() || (d1Var5 = pVar2.f21358b) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = pVar2.b(f11);
        }
        return new b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fB2, fB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 i(j0 j0Var, String str) {
        l0 l0VarI;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f21339c)) {
            return l0Var;
        }
        for (Object obj : j0Var.getChildren()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f21339c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (l0VarI = i((j0) obj, str)) != null) {
                    return l0VarI;
                }
            }
        }
        return null;
    }

    static bk.a k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new com.caverock.androidsvg.i().z(inputStream, f21236g);
    }

    void a(com.caverock.androidsvg.b.r rVar) {
        this.f21241e.b(rVar);
    }

    void b() {
        this.f21241e.e(com.caverock.androidsvg.b.u.RenderOptions);
    }

    List<com.caverock.androidsvg.b.p> d() {
        return this.f21241e.c();
    }

    public float f() {
        if (this.f21237a != null) {
            return e(this.f21240d).f21251d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        f0 f0Var = this.f21237a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f21375p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f21237a != null) {
            return e(this.f21240d).f21250c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    l0 j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f21237a.f21339c)) {
            return this.f21237a;
        }
        if (this.f21242f.containsKey(str)) {
            return this.f21242f.get(str);
        }
        l0 l0VarI = i(this.f21237a, str);
        this.f21242f.put(str, l0VarI);
        return l0VarI;
    }

    f0 m() {
        return this.f21237a;
    }

    boolean n() {
        return !this.f21241e.d();
    }

    public void o(Canvas canvas, com.caverock.androidsvg.f fVar) {
        if (fVar == null) {
            fVar = new com.caverock.androidsvg.f();
        }
        if (!fVar.g()) {
            fVar.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.h(canvas, this.f21240d).G0(this, fVar);
    }

    n0 p(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    void q(String str) {
        this.f21239c = str;
    }

    public void r(String str) {
        f0 f0Var = this.f21237a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f21314t = com.caverock.androidsvg.i.o0(str);
    }

    public void s(float f11, float f12, float f13, float f14) {
        f0 f0Var = this.f21237a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f21375p = new b(f11, f12, f13, f14);
    }

    public void t(String str) {
        f0 f0Var = this.f21237a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f21313s = com.caverock.androidsvg.i.o0(str);
    }

    void u(f0 f0Var) {
        this.f21237a = f0Var;
    }

    void v(String str) {
        this.f21238b = str;
    }

    static class p implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f21357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d1 f21358b;

        p(float f11, d1 d1Var) {
            this.f21357a = f11;
            this.f21358b = d1Var;
        }

        float a() {
            return this.f21357a;
        }

        float b(float f11) {
            int i11 = a.f21243a[this.f21358b.ordinal()];
            if (i11 == 1) {
                return this.f21357a;
            }
            switch (i11) {
                case 4:
                    return this.f21357a * f11;
                case 5:
                    return (this.f21357a * f11) / 2.54f;
                case 6:
                    return (this.f21357a * f11) / 25.4f;
                case 7:
                    return (this.f21357a * f11) / 72.0f;
                case 8:
                    return (this.f21357a * f11) / 6.0f;
                default:
                    return this.f21357a;
            }
        }

        float c(com.caverock.androidsvg.h hVar) {
            if (this.f21358b != d1.percent) {
                return e(hVar);
            }
            b bVarS = hVar.S();
            if (bVarS == null) {
                return this.f21357a;
            }
            float f11 = bVarS.f21250c;
            float f12 = bVarS.f21251d;
            if (f11 == f12) {
                return (this.f21357a * f11) / 100.0f;
            }
            return (this.f21357a * ((float) (Math.sqrt((f11 * f11) + (f12 * f12)) / 1.414213562373095d))) / 100.0f;
        }

        float d(com.caverock.androidsvg.h hVar, float f11) {
            return this.f21358b == d1.percent ? (this.f21357a * f11) / 100.0f : e(hVar);
        }

        float e(com.caverock.androidsvg.h hVar) {
            switch (a.f21243a[this.f21358b.ordinal()]) {
                case 1:
                    return this.f21357a;
                case 2:
                    return this.f21357a * hVar.Q();
                case 3:
                    return this.f21357a * hVar.R();
                case 4:
                    return this.f21357a * hVar.T();
                case 5:
                    return (this.f21357a * hVar.T()) / 2.54f;
                case 6:
                    return (this.f21357a * hVar.T()) / 25.4f;
                case 7:
                    return (this.f21357a * hVar.T()) / 72.0f;
                case 8:
                    return (this.f21357a * hVar.T()) / 6.0f;
                case 9:
                    b bVarS = hVar.S();
                    return bVarS == null ? this.f21357a : (this.f21357a * bVarS.f21250c) / 100.0f;
                default:
                    return this.f21357a;
            }
        }

        float f(com.caverock.androidsvg.h hVar) {
            if (this.f21358b != d1.percent) {
                return e(hVar);
            }
            b bVarS = hVar.S();
            return bVarS == null ? this.f21357a : (this.f21357a * bVarS.f21251d) / 100.0f;
        }

        boolean g() {
            return this.f21357a < BitmapDescriptorFactory.HUE_RED;
        }

        boolean h() {
            return this.f21357a == BitmapDescriptorFactory.HUE_RED;
        }

        public String toString() {
            return String.valueOf(this.f21357a) + this.f21358b;
        }

        p(float f11) {
            this.f21357a = f11;
            this.f21358b = d1.px;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f21248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f21250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f21251d;

        b(float f11, float f12, float f13, float f14) {
            this.f21248a = f11;
            this.f21249b = f12;
            this.f21250c = f13;
            this.f21251d = f14;
        }

        static b a(float f11, float f12, float f13, float f14) {
            return new b(f11, f12, f13 - f11, f14 - f12);
        }

        float b() {
            return this.f21248a + this.f21250c;
        }

        float c() {
            return this.f21249b + this.f21251d;
        }

        RectF d() {
            return new RectF(this.f21248a, this.f21249b, b(), c());
        }

        void e(b bVar) {
            float f11 = bVar.f21248a;
            if (f11 < this.f21248a) {
                this.f21248a = f11;
            }
            float f12 = bVar.f21249b;
            if (f12 < this.f21249b) {
                this.f21249b = f12;
            }
            if (bVar.b() > b()) {
                this.f21250c = bVar.b() - this.f21248a;
            }
            if (bVar.c() > c()) {
                this.f21251d = bVar.c() - this.f21249b;
            }
        }

        public String toString() {
            return "[" + this.f21248a + " " + this.f21249b + " " + this.f21250c + " " + this.f21251d + "]";
        }

        b(b bVar) {
            this.f21248a = bVar.f21248a;
            this.f21249b = bVar.f21249b;
            this.f21250c = bVar.f21250c;
            this.f21251d = bVar.f21251d;
        }
    }
}
