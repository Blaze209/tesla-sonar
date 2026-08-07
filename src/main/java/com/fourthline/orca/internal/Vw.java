package com.fourthline.orca.internal;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class Vw {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f29219h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private F f29221b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29222c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29223d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f29224e = 96.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I3.q f29225f = new I3.q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f29226g = new HashMap();

    static class A extends AbstractC2990m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f29227o;

        A() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "polyline";
        }
    }

    static class B extends A {
        B() {
        }

        @Override // com.fourthline.orca.internal.Vw.A, com.fourthline.orca.internal.Vw.N
        String g() {
            return "polygon";
        }
    }

    static class C extends AbstractC2990m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C2994q f29228o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2994q f29229p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29230q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29231r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C2994q f29232s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C2994q f29233t;

        C() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "rect";
        }
    }

    static class D extends L implements J {
        D() {
        }

        @Override // com.fourthline.orca.internal.Vw.J
        public void a(N n11) {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "solidColor";
        }

        @Override // com.fourthline.orca.internal.Vw.J
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    static class E extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Float f29234h;

        E() {
        }

        @Override // com.fourthline.orca.internal.Vw.J
        public void a(N n11) {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "stop";
        }

        @Override // com.fourthline.orca.internal.Vw.J
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    public static class F extends R {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29235q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29236r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C2994q f29237s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C2994q f29238t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f29239u;

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "svg";
        }
    }

    interface G {
        Set a();

        void a(String str);

        void a(Set set);

        Set b();

        void b(Set set);

        String c();

        void c(Set set);

        void d(Set set);

        Set e();

        Set f();
    }

    public static abstract class H extends K implements J, G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List f29240i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Set f29241j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f29242k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f29243l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f29244m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Set f29245n = null;

        @Override // com.fourthline.orca.internal.Vw.J
        public void a(N n11) {
            this.f29240i.add(n11);
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set b() {
            return null;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public String c() {
            return this.f29242k;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void d(Set set) {
            this.f29241j = set;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set e() {
            return this.f29244m;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set f() {
            return this.f29245n;
        }

        @Override // com.fourthline.orca.internal.Vw.J
        public List getChildren() {
            return this.f29240i;
        }

        @Override // com.fourthline.orca.internal.Vw.L
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set a() {
            return this.f29241j;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void b(Set set) {
            this.f29245n = set;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void c(Set set) {
            this.f29243l = set;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void a(String str) {
            this.f29242k = str;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void a(Set set) {
            this.f29244m = set;
        }
    }

    static abstract class I extends K implements G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Set f29246i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f29247j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Set f29248k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f29249l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f29250m = null;

        I() {
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set a() {
            return this.f29246i;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set b() {
            return this.f29248k;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public String c() {
            return this.f29247j;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void d(Set set) {
            this.f29246i = set;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set e() {
            return this.f29249l;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public Set f() {
            return this.f29250m;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void a(String str) {
            this.f29247j = str;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void b(Set set) {
            this.f29250m = set;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void c(Set set) {
            this.f29248k = set;
        }

        @Override // com.fourthline.orca.internal.Vw.G
        public void a(Set set) {
            this.f29249l = set;
        }
    }

    public interface J {
        void a(N n11);

        List getChildren();
    }

    static abstract class K extends L {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C2980c f29251h = null;

        K() {
        }
    }

    static abstract class L extends N {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f29252c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Boolean f29253d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        DA f29254e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        DA f29255f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f29256g = null;

        L() {
        }

        public String toString() {
            return g();
        }
    }

    static class M extends AbstractC2988k {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C2994q f29257m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C2994q f29258n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C2994q f29259o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2994q f29260p;

        M() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "linearGradient";
        }
    }

    public static class N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Vw f29261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        J f29262b;

        String g() {
            return "";
        }
    }

    public static abstract class O implements Cloneable {
    }

    static abstract class P extends H {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Ks f29263o = null;

        P() {
        }
    }

    static class Q extends AbstractC2988k {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C2994q f29264m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C2994q f29265n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C2994q f29266o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2994q f29267p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29268q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29269r;

        Q() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "radialGradient";
        }
    }

    static abstract class R extends P {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2980c f29270p;

        R() {
        }
    }

    static class S extends C2991n {
        S() {
        }

        @Override // com.fourthline.orca.internal.Vw.C2991n, com.fourthline.orca.internal.Vw.N
        String g() {
            return "switch";
        }
    }

    static class T extends R implements InterfaceC2998u {
        T() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "symbol";
        }
    }

    static class U extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f29271o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b0 f29272p;

        U() {
        }

        public void a(b0 b0Var) {
            this.f29272p = b0Var;
        }

        @Override // com.fourthline.orca.internal.Vw.X
        public b0 d() {
            return this.f29272p;
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "tref";
        }
    }

    static class V extends a0 implements X {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b0 f29273s;

        V() {
        }

        public void a(b0 b0Var) {
            this.f29273s = b0Var;
        }

        @Override // com.fourthline.orca.internal.Vw.X
        public b0 d() {
            return this.f29273s;
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "tspan";
        }
    }

    static class W extends a0 implements b0, InterfaceC2992o {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f29274s;

        W() {
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC2992o
        public void a(Matrix matrix) {
            this.f29274s = matrix;
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "text";
        }
    }

    interface X {
        b0 d();
    }

    public static abstract class Y extends H {
        @Override // com.fourthline.orca.internal.Vw.H, com.fourthline.orca.internal.Vw.J
        public void a(N n11) throws Xw {
            if (n11 instanceof X) {
                this.f29240i.add(n11);
                return;
            }
            throw new Xw("Text content elements cannot contain " + n11 + " elements.");
        }
    }

    static class Z extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f29275o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2994q f29276p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b0 f29277q;

        Z() {
        }

        public void a(b0 b0Var) {
            this.f29277q = b0Var;
        }

        @Override // com.fourthline.orca.internal.Vw.X
        public b0 d() {
            return this.f29277q;
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "textPath";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$a, reason: case insensitive filesystem */
    static /* synthetic */ class C2978a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29278a;

        static {
            int[] iArr = new int[d0.values().length];
            f29278a = iArr;
            try {
                iArr[d0.em.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29278a[d0.ex.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29278a[d0.in.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29278a[d0.cm.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29278a[d0.mm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29278a[d0.pt.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29278a[d0.pc.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29278a[d0.percent.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29278a[d0.px.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static abstract class a0 extends Y {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List f29279o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List f29280p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        List f29281q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        List f29282r;

        a0() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$b, reason: case insensitive filesystem */
    static class C2979b extends C2991n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f29283p;

        C2979b() {
        }

        @Override // com.fourthline.orca.internal.Vw.C2991n, com.fourthline.orca.internal.Vw.N
        String g() {
            return "a";
        }
    }

    interface b0 {
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$c, reason: case insensitive filesystem */
    static class C2980c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f29284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f29285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f29286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f29287d;

        C2980c(float f11, float f12, float f13, float f14) {
            this.f29284a = f11;
            this.f29285b = f12;
            this.f29286c = f13;
            this.f29287d = f14;
        }

        static C2980c a(float f11, float f12, float f13, float f14) {
            return new C2980c(f11, f12, f13 - f11, f14 - f12);
        }

        float b() {
            return this.f29285b + this.f29287d;
        }

        public String toString() {
            return "[" + this.f29284a + " " + this.f29285b + " " + this.f29286c + " " + this.f29287d + "]";
        }

        float a() {
            return this.f29284a + this.f29286c;
        }

        void a(C2980c c2980c) {
            float f11 = c2980c.f29284a;
            if (f11 < this.f29284a) {
                this.f29284a = f11;
            }
            float f12 = c2980c.f29285b;
            if (f12 < this.f29285b) {
                this.f29285b = f12;
            }
            if (c2980c.a() > a()) {
                this.f29286c = c2980c.a() - this.f29284a;
            }
            if (c2980c.b() > b()) {
                this.f29287d = c2980c.b() - this.f29285b;
            }
        }

        C2980c(C2980c c2980c) {
            this.f29284a = c2980c.f29284a;
            this.f29285b = c2980c.f29285b;
            this.f29286c = c2980c.f29286c;
            this.f29287d = c2980c.f29287d;
        }
    }

    public static class c0 extends N implements X {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f29288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b0 f29289d;

        public c0(String str) {
            this.f29288c = str;
        }

        @Override // com.fourthline.orca.internal.Vw.X
        public b0 d() {
            return this.f29289d;
        }

        public String toString() {
            return "TextChild: '" + this.f29288c + "'";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$d, reason: case insensitive filesystem */
    public static class C2981d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C2994q f29290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C2994q f29291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2994q f29292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final C2994q f29293d;

        C2981d(C2994q c2994q, C2994q c2994q2, C2994q c2994q3, C2994q c2994q4) {
            this.f29290a = c2994q;
            this.f29291b = c2994q2;
            this.f29292c = c2994q3;
            this.f29293d = c2994q4;
        }
    }

    enum d0 {
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$e, reason: case insensitive filesystem */
    static class C2982e extends AbstractC2990m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C2994q f29304o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2994q f29305p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29306q;

        C2982e() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "circle";
        }
    }

    static class e0 extends C2991n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f29307p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29308q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29309r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C2994q f29310s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C2994q f29311t;

        e0() {
        }

        @Override // com.fourthline.orca.internal.Vw.C2991n, com.fourthline.orca.internal.Vw.N
        String g() {
            return "use";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$f, reason: case insensitive filesystem */
    static class C2983f extends C2991n implements InterfaceC2998u {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f29312p;

        C2983f() {
        }

        @Override // com.fourthline.orca.internal.Vw.C2991n, com.fourthline.orca.internal.Vw.N
        String g() {
            return "clipPath";
        }
    }

    static class f0 extends R implements InterfaceC2998u {
        f0() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$g, reason: case insensitive filesystem */
    public static class C2984g extends O {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final C2984g f29313b = new C2984g(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final C2984g f29314c = new C2984g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f29315a;

        C2984g(int i11) {
            this.f29315a = i11;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f29315a));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$h, reason: case insensitive filesystem */
    static class C2985h extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C2985h f29316a = new C2985h();

        private C2985h() {
        }

        static C2985h a() {
            return f29316a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$i, reason: case insensitive filesystem */
    static class C2986i extends C2991n implements InterfaceC2998u {
        C2986i() {
        }

        @Override // com.fourthline.orca.internal.Vw.C2991n, com.fourthline.orca.internal.Vw.N
        String g() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$j, reason: case insensitive filesystem */
    static class C2987j extends AbstractC2990m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C2994q f29317o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2994q f29318p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29319q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29320r;

        C2987j() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "ellipse";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$k, reason: case insensitive filesystem */
    static abstract class AbstractC2988k extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f29321h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Boolean f29322i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Matrix f29323j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        EnumC2989l f29324k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f29325l;

        AbstractC2988k() {
        }

        @Override // com.fourthline.orca.internal.Vw.J
        public void a(N n11) throws Xw {
            if (n11 instanceof E) {
                this.f29321h.add(n11);
                return;
            }
            throw new Xw("Gradient elements cannot contain " + n11 + " elements.");
        }

        @Override // com.fourthline.orca.internal.Vw.J
        public List getChildren() {
            return this.f29321h;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$l, reason: case insensitive filesystem */
    enum EnumC2989l {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$m, reason: case insensitive filesystem */
    static abstract class AbstractC2990m extends I implements InterfaceC2992o {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Matrix f29330n;

        AbstractC2990m() {
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC2992o
        public void a(Matrix matrix) {
            this.f29330n = matrix;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$n, reason: case insensitive filesystem */
    static class C2991n extends H implements InterfaceC2992o {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Matrix f29331o;

        C2991n() {
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC2992o
        public void a(Matrix matrix) {
            this.f29331o = matrix;
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return Kind.GROUP;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$o, reason: case insensitive filesystem */
    interface InterfaceC2992o {
        void a(Matrix matrix);
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$p, reason: case insensitive filesystem */
    static class C2993p extends P implements InterfaceC2992o {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f29332p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29333q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29334r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C2994q f29335s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C2994q f29336t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Matrix f29337u;

        C2993p() {
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC2992o
        public void a(Matrix matrix) {
            this.f29337u = matrix;
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$q, reason: case insensitive filesystem */
    public static class C2994q implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final C2994q f29338c = new C2994q(BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final C2994q f29339d = new C2994q(100.0f, d0.percent);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f29340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d0 f29341b;

        public C2994q(float f11, d0 d0Var) {
            this.f29340a = f11;
            this.f29341b = d0Var;
        }

        float a() {
            return this.f29340a;
        }

        float b(Uw uw2) {
            switch (C2978a.f29278a[this.f29341b.ordinal()]) {
                case 1:
                    return this.f29340a * uw2.f();
                case 2:
                    return this.f29340a * uw2.g();
                case 3:
                    return this.f29340a * uw2.h();
                case 4:
                    return (this.f29340a * uw2.h()) / 2.54f;
                case 5:
                    return (this.f29340a * uw2.h()) / 25.4f;
                case 6:
                    return (this.f29340a * uw2.h()) / 72.0f;
                case 7:
                    return (this.f29340a * uw2.h()) / 6.0f;
                case 8:
                    C2980c c2980cI = uw2.i();
                    return c2980cI == null ? this.f29340a : (this.f29340a * c2980cI.f29286c) / 100.0f;
                default:
                    return this.f29340a;
            }
        }

        float c(Uw uw2) {
            if (this.f29341b != d0.percent) {
                return b(uw2);
            }
            C2980c c2980cI = uw2.i();
            return c2980cI == null ? this.f29340a : (this.f29340a * c2980cI.f29287d) / 100.0f;
        }

        public String toString() {
            return String.valueOf(this.f29340a) + this.f29341b;
        }

        float a(Uw uw2) {
            if (this.f29341b != d0.percent) {
                return b(uw2);
            }
            C2980c c2980cI = uw2.i();
            if (c2980cI == null) {
                return this.f29340a;
            }
            float f11 = c2980cI.f29286c;
            float f12 = c2980cI.f29287d;
            if (f11 == f12) {
                return (this.f29340a * f11) / 100.0f;
            }
            return (this.f29340a * ((float) (Math.sqrt((f11 * f11) + (f12 * f12)) / 1.414213562373095d))) / 100.0f;
        }

        public C2994q(float f11) {
            this.f29340a = f11;
            this.f29341b = d0.px;
        }

        boolean c() {
            return this.f29340a == BitmapDescriptorFactory.HUE_RED;
        }

        float a(Uw uw2, float f11) {
            if (this.f29341b == d0.percent) {
                return (this.f29340a * f11) / 100.0f;
            }
            return b(uw2);
        }

        boolean b() {
            return this.f29340a < BitmapDescriptorFactory.HUE_RED;
        }

        float a(float f11) {
            int i11 = C2978a.f29278a[this.f29341b.ordinal()];
            if (i11 == 3) {
                return this.f29340a * f11;
            }
            if (i11 == 4) {
                return (this.f29340a * f11) / 2.54f;
            }
            if (i11 == 5) {
                return (this.f29340a * f11) / 25.4f;
            }
            if (i11 == 6) {
                return (this.f29340a * f11) / 72.0f;
            }
            if (i11 != 7) {
                return this.f29340a;
            }
            return (this.f29340a * f11) / 6.0f;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$r, reason: case insensitive filesystem */
    static class C2995r extends AbstractC2990m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C2994q f29342o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C2994q f29343p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29344q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29345r;

        C2995r() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$s, reason: case insensitive filesystem */
    static class C2996s extends R implements InterfaceC2998u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f29346q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29347r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C2994q f29348s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C2994q f29349t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C2994q f29350u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Float f29351v;

        C2996s() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "marker";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$t, reason: case insensitive filesystem */
    static class C2997t extends H implements InterfaceC2998u {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f29352o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f29353p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C2994q f29354q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C2994q f29355r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C2994q f29356s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C2994q f29357t;

        C2997t() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$u, reason: case insensitive filesystem */
    interface InterfaceC2998u {
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$v, reason: case insensitive filesystem */
    static class C2999v extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f29358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final O f29359b;

        C2999v(String str, O o11) {
            this.f29358a = str;
            this.f29359b = o11;
        }

        public String toString() {
            return this.f29358a + " " + this.f29359b;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$w, reason: case insensitive filesystem */
    static class C3000w extends AbstractC2990m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C3001x f29360o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f29361p;

        C3000w() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$x, reason: case insensitive filesystem */
    static class C3001x implements InterfaceC3002y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29363b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f29365d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f29362a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f29364c = new float[16];

        C3001x() {
        }

        boolean a() {
            return this.f29363b == 0;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void close() {
            a((byte) 8);
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            a((byte) 2);
            a(6);
            float[] fArr = this.f29364c;
            int i11 = this.f29365d;
            int i12 = i11 + 1;
            this.f29365d = i12;
            fArr[i11] = f11;
            int i13 = i11 + 2;
            this.f29365d = i13;
            fArr[i12] = f12;
            int i14 = i11 + 3;
            this.f29365d = i14;
            fArr[i13] = f13;
            int i15 = i11 + 4;
            this.f29365d = i15;
            fArr[i14] = f14;
            int i16 = i11 + 5;
            this.f29365d = i16;
            fArr[i15] = f15;
            this.f29365d = i11 + 6;
            fArr[i16] = f16;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void lineTo(float f11, float f12) {
            a((byte) 1);
            a(2);
            float[] fArr = this.f29364c;
            int i11 = this.f29365d;
            int i12 = i11 + 1;
            this.f29365d = i12;
            fArr[i11] = f11;
            this.f29365d = i11 + 2;
            fArr[i12] = f12;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void moveTo(float f11, float f12) {
            a((byte) 0);
            a(2);
            float[] fArr = this.f29364c;
            int i11 = this.f29365d;
            int i12 = i11 + 1;
            this.f29365d = i12;
            fArr[i11] = f11;
            this.f29365d = i11 + 2;
            fArr[i12] = f12;
        }

        private void a(byte b11) {
            int i11 = this.f29363b;
            byte[] bArr = this.f29362a;
            if (i11 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f29362a = bArr2;
            }
            byte[] bArr3 = this.f29362a;
            int i12 = this.f29363b;
            this.f29363b = i12 + 1;
            bArr3[i12] = b11;
        }

        private void a(int i11) {
            float[] fArr = this.f29364c;
            if (fArr.length < this.f29365d + i11) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f29364c = fArr2;
            }
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void a(float f11, float f12, float f13, float f14) {
            a((byte) 3);
            a(4);
            float[] fArr = this.f29364c;
            int i11 = this.f29365d;
            int i12 = i11 + 1;
            this.f29365d = i12;
            fArr[i11] = f11;
            int i13 = i11 + 2;
            this.f29365d = i13;
            fArr[i12] = f12;
            int i14 = i11 + 3;
            this.f29365d = i14;
            fArr[i13] = f13;
            this.f29365d = i11 + 4;
            fArr[i14] = f14;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            a((byte) ((z11 ? 2 : 0) | 4 | (z12 ? 1 : 0)));
            a(5);
            float[] fArr = this.f29364c;
            int i11 = this.f29365d;
            int i12 = i11 + 1;
            this.f29365d = i12;
            fArr[i11] = f11;
            int i13 = i11 + 2;
            this.f29365d = i13;
            fArr[i12] = f12;
            int i14 = i11 + 3;
            this.f29365d = i14;
            fArr[i13] = f13;
            int i15 = i11 + 4;
            this.f29365d = i15;
            fArr[i14] = f14;
            this.f29365d = i11 + 5;
            fArr[i15] = f15;
        }

        void a(InterfaceC3002y interfaceC3002y) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f29363b; i12++) {
                byte b11 = this.f29362a[i12];
                if (b11 == 8) {
                    interfaceC3002y.close();
                } else if (b11 == 0) {
                    float[] fArr = this.f29364c;
                    int i13 = i11 + 1;
                    float f11 = fArr[i11];
                    i11 += 2;
                    interfaceC3002y.moveTo(f11, fArr[i13]);
                } else if (b11 == 1) {
                    float[] fArr2 = this.f29364c;
                    int i14 = i11 + 1;
                    float f12 = fArr2[i11];
                    i11 += 2;
                    interfaceC3002y.lineTo(f12, fArr2[i14]);
                } else if (b11 == 2) {
                    float[] fArr3 = this.f29364c;
                    interfaceC3002y.cubicTo(fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3], fArr3[i11 + 4], fArr3[i11 + 5]);
                    i11 += 6;
                } else if (b11 != 3) {
                    boolean z11 = (b11 & 2) != 0;
                    boolean z12 = (b11 & 1) != 0;
                    float[] fArr4 = this.f29364c;
                    interfaceC3002y.a(fArr4[i11], fArr4[i11 + 1], fArr4[i11 + 2], z11, z12, fArr4[i11 + 3], fArr4[i11 + 4]);
                    i11 += 5;
                } else {
                    float[] fArr5 = this.f29364c;
                    float f13 = fArr5[i11];
                    float f14 = fArr5[i11 + 1];
                    int i15 = i11 + 3;
                    float f15 = fArr5[i11 + 2];
                    i11 += 4;
                    interfaceC3002y.a(f13, f14, f15, fArr5[i15]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$y, reason: case insensitive filesystem */
    interface InterfaceC3002y {
        void a(float f11, float f12, float f13, float f14);

        void a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15);

        void close();

        void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16);

        void lineTo(float f11, float f12);

        void moveTo(float f11, float f12);
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vw$z, reason: case insensitive filesystem */
    static class C3003z extends R implements InterfaceC2998u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f29366q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Boolean f29367r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f29368s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C2994q f29369t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C2994q f29370u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        C2994q f29371v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        C2994q f29372w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f29373x;

        C3003z() {
        }

        @Override // com.fourthline.orca.internal.Vw.N
        String g() {
            return "pattern";
        }
    }

    Vw(boolean z11, Ww ww2) {
        this.f29220a = z11;
    }

    public static Vw a(InputStream inputStream) {
        return b().a(inputStream);
    }

    public void b(float f11) {
        this.f29224e = f11;
    }

    N c(String str) {
        if (str == null) {
            return null;
        }
        String strA = a(str);
        if (strA.length() <= 1 || !strA.startsWith("#")) {
            return null;
        }
        return b(strA.substring(1));
    }

    public float d() {
        if (this.f29221b != null) {
            return a(this.f29224e).f29287d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float e() {
        if (this.f29221b != null) {
            return a(this.f29224e).f29286c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public F f() {
        return this.f29221b;
    }

    boolean g() {
        return !this.f29225f.b();
    }

    protected static Yw b() {
        return new Zw().a(f29219h).a((Ww) null);
    }

    public void a(Canvas canvas, Pw pw2) {
        if (pw2 == null) {
            pw2 = new Pw();
        }
        if (!pw2.f()) {
            pw2.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        }
        new Uw(canvas, this.f29224e, null).a(this, pw2);
    }

    L b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f29221b.f29252c)) {
            return this.f29221b;
        }
        if (this.f29226g.containsKey(str)) {
            return (L) this.f29226g.get(str);
        }
        L lA = a(this.f29221b, str);
        this.f29226g.put(str, lA);
        return lA;
    }

    List c() {
        return this.f29225f.a();
    }

    void d(String str) {
        this.f29223d = str;
    }

    void e(String str) {
        this.f29222c = str;
    }

    void a(F f11) {
        this.f29221b = f11;
    }

    private String a(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private C2980c a(float f11) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float fA;
        d0 d0Var5;
        F f12 = this.f29221b;
        C2994q c2994q = f12.f29237s;
        C2994q c2994q2 = f12.f29238t;
        if (c2994q != null && !c2994q.c() && (d0Var = c2994q.f29341b) != (d0Var2 = d0.percent) && d0Var != (d0Var3 = d0.em) && d0Var != (d0Var4 = d0.ex)) {
            float fA2 = c2994q.a(f11);
            if (c2994q2 != null) {
                if (!c2994q2.c() && (d0Var5 = c2994q2.f29341b) != d0Var2 && d0Var5 != d0Var3 && d0Var5 != d0Var4) {
                    fA = c2994q2.a(f11);
                } else {
                    return new C2980c(-1.0f, -1.0f, -1.0f, -1.0f);
                }
            } else {
                C2980c c2980c = this.f29221b.f29270p;
                fA = c2980c != null ? (c2980c.f29287d * fA2) / c2980c.f29286c : fA2;
            }
            return new C2980c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fA2, fA);
        }
        return new C2980c(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    void a(I3.q qVar) {
        this.f29225f.a(qVar);
    }

    void a() {
        this.f29225f.a(I3.t.RenderOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L a(J j11, String str) {
        L lA;
        L l11 = (L) j11;
        if (str.equals(l11.f29252c)) {
            return l11;
        }
        for (Object obj : j11.getChildren()) {
            if (obj instanceof L) {
                L l12 = (L) obj;
                if (str.equals(l12.f29252c)) {
                    return l12;
                }
                if ((obj instanceof J) && (lA = a((J) obj, str)) != null) {
                    return lA;
                }
            }
        }
        return null;
    }
}
