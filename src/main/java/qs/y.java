package qs;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class y implements com.google.android.exoplayer2.g {
    public static final y A;

    @Deprecated
    public static final y B;
    private static final String C;
    private static final String D;
    private static final String E;
    private static final String F;
    private static final String G;
    private static final String H;
    private static final String I;
    private static final String J;
    private static final String K;
    private static final String L;
    private static final String M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f106089a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f106090b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.exoplayer2.g.a<y> f106091c0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f106093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f106094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f106095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f106096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f106097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f106098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f106099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f106100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f106101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f106102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.common.collect.x<String> f106103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f106104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.common.collect.x<String> f106105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f106106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f106107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f106108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.common.collect.x<String> f106109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.common.collect.x<String> f106110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f106111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f106112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f106113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f106114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f106115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.google.common.collect.z<es.u, w> f106116y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.google.common.collect.b0<Integer> f106117z;

    static {
        y yVarA = new a().A();
        A = yVarA;
        B = yVarA;
        C = p0.t0(1);
        D = p0.t0(2);
        E = p0.t0(3);
        F = p0.t0(4);
        G = p0.t0(5);
        H = p0.t0(6);
        I = p0.t0(7);
        J = p0.t0(8);
        K = p0.t0(9);
        L = p0.t0(10);
        M = p0.t0(11);
        N = p0.t0(12);
        O = p0.t0(13);
        P = p0.t0(14);
        Q = p0.t0(15);
        R = p0.t0(16);
        S = p0.t0(17);
        T = p0.t0(18);
        U = p0.t0(19);
        V = p0.t0(20);
        W = p0.t0(21);
        X = p0.t0(22);
        Y = p0.t0(23);
        Z = p0.t0(24);
        f106089a0 = p0.t0(25);
        f106090b0 = p0.t0(26);
        f106091c0 = new com.google.android.exoplayer2.g.a() { // from class: qs.x
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y.B(bundle);
            }
        };
    }

    protected y(a aVar) {
        this.f106092a = aVar.f106118a;
        this.f106093b = aVar.f106119b;
        this.f106094c = aVar.f106120c;
        this.f106095d = aVar.f106121d;
        this.f106096e = aVar.f106122e;
        this.f106097f = aVar.f106123f;
        this.f106098g = aVar.f106124g;
        this.f106099h = aVar.f106125h;
        this.f106100i = aVar.f106126i;
        this.f106101j = aVar.f106127j;
        this.f106102k = aVar.f106128k;
        this.f106103l = aVar.f106129l;
        this.f106104m = aVar.f106130m;
        this.f106105n = aVar.f106131n;
        this.f106106o = aVar.f106132o;
        this.f106107p = aVar.f106133p;
        this.f106108q = aVar.f106134q;
        this.f106109r = aVar.f106135r;
        this.f106110s = aVar.f106136s;
        this.f106111t = aVar.f106137t;
        this.f106112u = aVar.f106138u;
        this.f106113v = aVar.f106139v;
        this.f106114w = aVar.f106140w;
        this.f106115x = aVar.f106141x;
        this.f106116y = com.google.common.collect.z.d(aVar.f106142y);
        this.f106117z = com.google.common.collect.b0.m(aVar.f106143z);
    }

    public static y B(Bundle bundle) {
        return new a(bundle).A();
    }

    public a A() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f106092a == yVar.f106092a && this.f106093b == yVar.f106093b && this.f106094c == yVar.f106094c && this.f106095d == yVar.f106095d && this.f106096e == yVar.f106096e && this.f106097f == yVar.f106097f && this.f106098g == yVar.f106098g && this.f106099h == yVar.f106099h && this.f106102k == yVar.f106102k && this.f106100i == yVar.f106100i && this.f106101j == yVar.f106101j && this.f106103l.equals(yVar.f106103l) && this.f106104m == yVar.f106104m && this.f106105n.equals(yVar.f106105n) && this.f106106o == yVar.f106106o && this.f106107p == yVar.f106107p && this.f106108q == yVar.f106108q && this.f106109r.equals(yVar.f106109r) && this.f106110s.equals(yVar.f106110s) && this.f106111t == yVar.f106111t && this.f106112u == yVar.f106112u && this.f106113v == yVar.f106113v && this.f106114w == yVar.f106114w && this.f106115x == yVar.f106115x && this.f106116y.equals(yVar.f106116y) && this.f106117z.equals(yVar.f106117z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f106092a + 31) * 31) + this.f106093b) * 31) + this.f106094c) * 31) + this.f106095d) * 31) + this.f106096e) * 31) + this.f106097f) * 31) + this.f106098g) * 31) + this.f106099h) * 31) + (this.f106102k ? 1 : 0)) * 31) + this.f106100i) * 31) + this.f106101j) * 31) + this.f106103l.hashCode()) * 31) + this.f106104m) * 31) + this.f106105n.hashCode()) * 31) + this.f106106o) * 31) + this.f106107p) * 31) + this.f106108q) * 31) + this.f106109r.hashCode()) * 31) + this.f106110s.hashCode()) * 31) + this.f106111t) * 31) + this.f106112u) * 31) + (this.f106113v ? 1 : 0)) * 31) + (this.f106114w ? 1 : 0)) * 31) + (this.f106115x ? 1 : 0)) * 31) + this.f106116y.hashCode()) * 31) + this.f106117z.hashCode();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(H, this.f106092a);
        bundle.putInt(I, this.f106093b);
        bundle.putInt(J, this.f106094c);
        bundle.putInt(K, this.f106095d);
        bundle.putInt(L, this.f106096e);
        bundle.putInt(M, this.f106097f);
        bundle.putInt(N, this.f106098g);
        bundle.putInt(O, this.f106099h);
        bundle.putInt(P, this.f106100i);
        bundle.putInt(Q, this.f106101j);
        bundle.putBoolean(R, this.f106102k);
        bundle.putStringArray(S, (String[]) this.f106103l.toArray(new String[0]));
        bundle.putInt(f106089a0, this.f106104m);
        bundle.putStringArray(C, (String[]) this.f106105n.toArray(new String[0]));
        bundle.putInt(D, this.f106106o);
        bundle.putInt(T, this.f106107p);
        bundle.putInt(U, this.f106108q);
        bundle.putStringArray(V, (String[]) this.f106109r.toArray(new String[0]));
        bundle.putStringArray(E, (String[]) this.f106110s.toArray(new String[0]));
        bundle.putInt(F, this.f106111t);
        bundle.putInt(f106090b0, this.f106112u);
        bundle.putBoolean(G, this.f106113v);
        bundle.putBoolean(W, this.f106114w);
        bundle.putBoolean(X, this.f106115x);
        bundle.putParcelableArrayList(Y, ts.c.i(this.f106116y.values()));
        bundle.putIntArray(Z, ru.f.n(this.f106117z));
        return bundle;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f106118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f106119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f106120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f106121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f106122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f106123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f106124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f106125h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f106126i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f106127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f106128k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.google.common.collect.x<String> f106129l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f106130m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.google.common.collect.x<String> f106131n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f106132o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f106133p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f106134q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private com.google.common.collect.x<String> f106135r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private com.google.common.collect.x<String> f106136s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f106137t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f106138u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f106139v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f106140w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f106141x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private HashMap<es.u, w> f106142y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private HashSet<Integer> f106143z;

        @Deprecated
        public a() {
            this.f106118a = Integer.MAX_VALUE;
            this.f106119b = Integer.MAX_VALUE;
            this.f106120c = Integer.MAX_VALUE;
            this.f106121d = Integer.MAX_VALUE;
            this.f106126i = Integer.MAX_VALUE;
            this.f106127j = Integer.MAX_VALUE;
            this.f106128k = true;
            this.f106129l = com.google.common.collect.x.r();
            this.f106130m = 0;
            this.f106131n = com.google.common.collect.x.r();
            this.f106132o = 0;
            this.f106133p = Integer.MAX_VALUE;
            this.f106134q = Integer.MAX_VALUE;
            this.f106135r = com.google.common.collect.x.r();
            this.f106136s = com.google.common.collect.x.r();
            this.f106137t = 0;
            this.f106138u = 0;
            this.f106139v = false;
            this.f106140w = false;
            this.f106141x = false;
            this.f106142y = new HashMap<>();
            this.f106143z = new HashSet<>();
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void C(y yVar) {
            this.f106118a = yVar.f106092a;
            this.f106119b = yVar.f106093b;
            this.f106120c = yVar.f106094c;
            this.f106121d = yVar.f106095d;
            this.f106122e = yVar.f106096e;
            this.f106123f = yVar.f106097f;
            this.f106124g = yVar.f106098g;
            this.f106125h = yVar.f106099h;
            this.f106126i = yVar.f106100i;
            this.f106127j = yVar.f106101j;
            this.f106128k = yVar.f106102k;
            this.f106129l = yVar.f106103l;
            this.f106130m = yVar.f106104m;
            this.f106131n = yVar.f106105n;
            this.f106132o = yVar.f106106o;
            this.f106133p = yVar.f106107p;
            this.f106134q = yVar.f106108q;
            this.f106135r = yVar.f106109r;
            this.f106136s = yVar.f106110s;
            this.f106137t = yVar.f106111t;
            this.f106138u = yVar.f106112u;
            this.f106139v = yVar.f106113v;
            this.f106140w = yVar.f106114w;
            this.f106141x = yVar.f106115x;
            this.f106143z = new HashSet<>(yVar.f106117z);
            this.f106142y = new HashMap<>(yVar.f106116y);
        }

        private static com.google.common.collect.x<String> D(String[] strArr) {
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (String str : (String[]) ts.a.e(strArr)) {
                aVarK.a(p0.F0((String) ts.a.e(str)));
            }
            return aVarK.k();
        }

        private void I(Context context) {
            CaptioningManager captioningManager;
            if ((p0.f115040a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f106137t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f106136s = com.google.common.collect.x.s(p0.V(locale));
                }
            }
        }

        public y A() {
            return new y(this);
        }

        public a B(int i11) {
            Iterator<w> it = this.f106142y.values().iterator();
            while (it.hasNext()) {
                if (it.next().b() == i11) {
                    it.remove();
                }
            }
            return this;
        }

        protected a E(y yVar) {
            C(yVar);
            return this;
        }

        public a F(int i11) {
            this.f106138u = i11;
            return this;
        }

        public a G(w wVar) {
            B(wVar.b());
            this.f106142y.put(wVar.f106087a, wVar);
            return this;
        }

        public a H(Context context) {
            if (p0.f115040a >= 19) {
                I(context);
            }
            return this;
        }

        public a J(int i11, boolean z11) {
            if (z11) {
                this.f106143z.add(Integer.valueOf(i11));
                return this;
            }
            this.f106143z.remove(Integer.valueOf(i11));
            return this;
        }

        public a K(int i11, int i12, boolean z11) {
            this.f106126i = i11;
            this.f106127j = i12;
            this.f106128k = z11;
            return this;
        }

        public a L(Context context, boolean z11) {
            Point pointK = p0.K(context);
            return K(pointK.x, pointK.y, z11);
        }

        public a(Context context) {
            this();
            H(context);
            L(context, true);
        }

        protected a(y yVar) {
            C(yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected a(Bundle bundle) {
            com.google.common.collect.x xVarD;
            String str = y.H;
            y yVar = y.A;
            this.f106118a = bundle.getInt(str, yVar.f106092a);
            this.f106119b = bundle.getInt(y.I, yVar.f106093b);
            this.f106120c = bundle.getInt(y.J, yVar.f106094c);
            this.f106121d = bundle.getInt(y.K, yVar.f106095d);
            this.f106122e = bundle.getInt(y.L, yVar.f106096e);
            this.f106123f = bundle.getInt(y.M, yVar.f106097f);
            this.f106124g = bundle.getInt(y.N, yVar.f106098g);
            this.f106125h = bundle.getInt(y.O, yVar.f106099h);
            this.f106126i = bundle.getInt(y.P, yVar.f106100i);
            this.f106127j = bundle.getInt(y.Q, yVar.f106101j);
            this.f106128k = bundle.getBoolean(y.R, yVar.f106102k);
            this.f106129l = com.google.common.collect.x.o((String[]) ou.j.a(bundle.getStringArray(y.S), new String[0]));
            this.f106130m = bundle.getInt(y.f106089a0, yVar.f106104m);
            this.f106131n = D((String[]) ou.j.a(bundle.getStringArray(y.C), new String[0]));
            this.f106132o = bundle.getInt(y.D, yVar.f106106o);
            this.f106133p = bundle.getInt(y.T, yVar.f106107p);
            this.f106134q = bundle.getInt(y.U, yVar.f106108q);
            this.f106135r = com.google.common.collect.x.o((String[]) ou.j.a(bundle.getStringArray(y.V), new String[0]));
            this.f106136s = D((String[]) ou.j.a(bundle.getStringArray(y.E), new String[0]));
            this.f106137t = bundle.getInt(y.F, yVar.f106111t);
            this.f106138u = bundle.getInt(y.f106090b0, yVar.f106112u);
            this.f106139v = bundle.getBoolean(y.G, yVar.f106113v);
            this.f106140w = bundle.getBoolean(y.W, yVar.f106114w);
            this.f106141x = bundle.getBoolean(y.X, yVar.f106115x);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(y.Y);
            if (parcelableArrayList == null) {
                xVarD = com.google.common.collect.x.r();
            } else {
                xVarD = ts.c.d(w.f106086e, parcelableArrayList);
            }
            this.f106142y = new HashMap<>();
            for (int i11 = 0; i11 < xVarD.size(); i11++) {
                w wVar = (w) xVarD.get(i11);
                this.f106142y.put(wVar.f106087a, wVar);
            }
            int[] iArr = (int[]) ou.j.a(bundle.getIntArray(y.Z), new int[0]);
            this.f106143z = new HashSet<>();
            for (int i12 : iArr) {
                this.f106143z.add(Integer.valueOf(i12));
            }
        }
    }
}
