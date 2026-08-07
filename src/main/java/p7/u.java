package p7;

import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final i E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    private int Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x> f101532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f101533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f101535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f101536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f101537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f101538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f101539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f101540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f101541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f101542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f101543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f101544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f101545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f101546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<byte[]> f101547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f101548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f101549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f101550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f101551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f101552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f101553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f101554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f101555z;
    private static final u R = new b().P();
    private static final String S = s7.q0.N0(0);
    private static final String T = s7.q0.N0(1);
    private static final String U = s7.q0.N0(2);
    private static final String V = s7.q0.N0(3);
    private static final String W = s7.q0.N0(4);
    private static final String X = s7.q0.N0(5);
    private static final String Y = s7.q0.N0(6);
    private static final String Z = s7.q0.N0(7);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f101504a0 = s7.q0.N0(8);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f101505b0 = s7.q0.N0(9);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f101506c0 = s7.q0.N0(10);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f101507d0 = s7.q0.N0(11);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f101508e0 = s7.q0.N0(12);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f101509f0 = s7.q0.N0(13);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f101510g0 = s7.q0.N0(14);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f101511h0 = s7.q0.N0(15);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f101512i0 = s7.q0.N0(16);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f101513j0 = s7.q0.N0(17);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f101514k0 = s7.q0.N0(18);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f101515l0 = s7.q0.N0(19);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f101516m0 = s7.q0.N0(20);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f101517n0 = s7.q0.N0(21);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f101518o0 = s7.q0.N0(22);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f101519p0 = s7.q0.N0(23);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f101520q0 = s7.q0.N0(24);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f101521r0 = s7.q0.N0(25);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f101522s0 = s7.q0.N0(26);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f101523t0 = s7.q0.N0(27);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f101524u0 = s7.q0.N0(28);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f101525v0 = s7.q0.N0(29);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f101526w0 = s7.q0.N0(30);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final String f101527x0 = s7.q0.N0(31);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f101528y0 = s7.q0.N0(32);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f101529z0 = s7.q0.N0(33);
    private static final String A0 = s7.q0.N0(34);
    private static final String B0 = s7.q0.N0(35);
    private static final String C0 = s7.q0.N0(36);

    public static final class b {
        private float A;
        private byte[] B;
        private int C;
        private i D;
        private int E;
        private int F;
        private int G;
        private int H;
        private int I;
        private int J;
        private int K;
        private int L;
        private int M;
        private int N;
        private int O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f101556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f101557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<x> f101558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f101559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f101560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f101561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f101562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f101563h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f101564i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f101565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f0 f101566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Object f101567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f101568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f101569n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f101570o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f101571p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<byte[]> f101572q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private n f101573r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f101574s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f101575t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f101576u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f101577v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f101578w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f101579x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f101580y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f101581z;

        public b A0(int i11) {
            this.f101560e = i11;
            return this;
        }

        public b B0(int i11) {
            this.C = i11;
            return this;
        }

        public b C0(long j11) {
            this.f101574s = j11;
            return this;
        }

        public b D0(int i11) {
            this.M = i11;
            return this;
        }

        public b E0(int i11) {
            this.N = i11;
            return this;
        }

        public b F0(int i11) {
            this.f101576u = i11;
            return this;
        }

        public u P() {
            return new u(this);
        }

        public b Q(int i11) {
            this.K = i11;
            return this;
        }

        public b R(int i11) {
            this.f101562g = i11;
            return this;
        }

        public b S(int i11) {
            this.f101563h = i11;
            return this;
        }

        public b T(int i11) {
            this.F = i11;
            return this;
        }

        public b U(String str) {
            this.f101565j = str;
            return this;
        }

        public b V(i iVar) {
            this.D = iVar;
            return this;
        }

        public b W(String str) {
            this.f101568m = g0.u(str);
            return this;
        }

        public b X(int i11) {
            this.O = i11;
            return this;
        }

        public b Y(int i11) {
            this.L = i11;
            return this;
        }

        public b Z(Object obj) {
            this.f101567l = obj;
            return this;
        }

        public b a0(int i11) {
            this.f101579x = i11;
            return this;
        }

        public b b0(int i11) {
            this.f101578w = i11;
            return this;
        }

        public b c0(n nVar) {
            this.f101573r = nVar;
            return this;
        }

        public b d0(int i11) {
            this.I = i11;
            return this;
        }

        public b e0(int i11) {
            this.J = i11;
            return this;
        }

        public b f0(float f11) {
            this.f101580y = f11;
            return this;
        }

        public b g0(boolean z11) {
            this.f101575t = z11;
            return this;
        }

        public b h0(int i11) {
            this.f101577v = i11;
            return this;
        }

        public b i0(int i11) {
            this.f101556a = Integer.toString(i11);
            return this;
        }

        public b j0(String str) {
            this.f101556a = str;
            return this;
        }

        public b k0(List<byte[]> list) {
            this.f101572q = list;
            return this;
        }

        public b l0(String str) {
            this.f101557b = str;
            return this;
        }

        public b m0(List<x> list) {
            this.f101558c = com.google.common.collect.x.n(list);
            return this;
        }

        public b n0(String str) {
            this.f101559d = str;
            return this;
        }

        public b o0(int i11) {
            this.f101570o = i11;
            return this;
        }

        public b p0(int i11) {
            this.f101571p = i11;
            return this;
        }

        public b q0(int i11) {
            this.E = i11;
            return this;
        }

        public b r0(f0 f0Var) {
            this.f101566k = f0Var;
            return this;
        }

        public b s0(int i11) {
            this.H = i11;
            return this;
        }

        public b t0(int i11) {
            this.f101564i = i11;
            return this;
        }

        public b u0(float f11) {
            this.A = f11;
            return this;
        }

        public b v0(byte[] bArr) {
            this.B = bArr;
            return this;
        }

        public b w0(int i11) {
            this.f101561f = i11;
            return this;
        }

        public b x0(int i11) {
            this.f101581z = i11;
            return this;
        }

        public b y0(String str) {
            this.f101569n = g0.u(str);
            return this;
        }

        public b z0(int i11) {
            this.G = i11;
            return this;
        }

        public b() {
            this.f101558c = com.google.common.collect.x.r();
            this.f101563h = -1;
            this.f101564i = -1;
            this.f101570o = -1;
            this.f101571p = -1;
            this.f101574s = Long.MAX_VALUE;
            this.f101576u = -1;
            this.f101577v = -1;
            this.f101578w = -1;
            this.f101579x = -1;
            this.f101580y = -1.0f;
            this.A = 1.0f;
            this.C = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.K = -1;
            this.L = 1;
            this.M = -1;
            this.N = -1;
            this.O = 0;
            this.f101562g = 0;
        }

        private b(u uVar) {
            this.f101556a = uVar.f101530a;
            this.f101557b = uVar.f101531b;
            this.f101558c = uVar.f101532c;
            this.f101559d = uVar.f101533d;
            this.f101560e = uVar.f101534e;
            this.f101561f = uVar.f101535f;
            this.f101563h = uVar.f101537h;
            this.f101564i = uVar.f101538i;
            this.f101565j = uVar.f101540k;
            this.f101566k = uVar.f101541l;
            this.f101567l = uVar.f101542m;
            this.f101568m = uVar.f101543n;
            this.f101569n = uVar.f101544o;
            this.f101570o = uVar.f101545p;
            this.f101571p = uVar.f101546q;
            this.f101572q = uVar.f101547r;
            this.f101573r = uVar.f101548s;
            this.f101574s = uVar.f101549t;
            this.f101575t = uVar.f101550u;
            this.f101576u = uVar.f101551v;
            this.f101577v = uVar.f101552w;
            this.f101578w = uVar.f101553x;
            this.f101579x = uVar.f101554y;
            this.f101580y = uVar.f101555z;
            this.f101581z = uVar.A;
            this.A = uVar.B;
            this.B = uVar.C;
            this.C = uVar.D;
            this.D = uVar.E;
            this.E = uVar.F;
            this.F = uVar.G;
            this.G = uVar.H;
            this.H = uVar.I;
            this.I = uVar.J;
            this.J = uVar.K;
            this.K = uVar.L;
            this.L = uVar.M;
            this.M = uVar.N;
            this.N = uVar.O;
            this.O = uVar.P;
        }
    }

    public static /* synthetic */ String a(x xVar) {
        return xVar.f101672a + ": " + xVar.f101673b;
    }

    private static <T> T d(T t11, T t12) {
        return t11 != null ? t11 : t12;
    }

    public static u e(Bundle bundle) {
        b bVar = new b();
        s7.i.c(bundle);
        String string = bundle.getString(S);
        u uVar = R;
        bVar.j0((String) d(string, uVar.f101530a)).l0((String) d(bundle.getString(T), uVar.f101531b));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f101528y0);
        bVar.m0(parcelableArrayList == null ? com.google.common.collect.x.r() : s7.i.d(new ou.h() { // from class: p7.t
            @Override // ou.h
            public final Object apply(Object obj) {
                return x.a((Bundle) obj);
            }
        }, parcelableArrayList)).n0((String) d(bundle.getString(U), uVar.f101533d)).A0(bundle.getInt(V, uVar.f101534e)).w0(bundle.getInt(W, uVar.f101535f)).R(bundle.getInt(f101529z0, uVar.f101536g)).S(bundle.getInt(X, uVar.f101537h)).t0(bundle.getInt(Y, uVar.f101538i)).U((String) d(bundle.getString(Z), uVar.f101540k)).W((String) d(bundle.getString(f101505b0), uVar.f101543n)).y0((String) d(bundle.getString(f101506c0), uVar.f101544o)).o0(bundle.getInt(f101507d0, uVar.f101545p));
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(j(i11));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i11++;
        }
        b bVarC0 = bVar.k0(arrayList).c0((n) bundle.getParcelable(f101509f0));
        String str = f101510g0;
        u uVar2 = R;
        bVarC0.C0(bundle.getLong(str, uVar2.f101549t)).F0(bundle.getInt(f101511h0, uVar2.f101551v)).h0(bundle.getInt(f101512i0, uVar2.f101552w)).b0(bundle.getInt(B0, uVar2.f101553x)).a0(bundle.getInt(C0, uVar2.f101554y)).f0(bundle.getFloat(f101513j0, uVar2.f101555z)).x0(bundle.getInt(f101514k0, uVar2.A)).u0(bundle.getFloat(f101515l0, uVar2.B)).v0(bundle.getByteArray(f101516m0)).B0(bundle.getInt(f101517n0, uVar2.D)).q0(bundle.getInt(A0, uVar2.F));
        Bundle bundle2 = bundle.getBundle(f101518o0);
        if (bundle2 != null) {
            bVar.V(i.f(bundle2));
        }
        bVar.T(bundle.getInt(f101519p0, uVar2.G)).z0(bundle.getInt(f101520q0, uVar2.H)).s0(bundle.getInt(f101521r0, uVar2.I)).d0(bundle.getInt(f101522s0, uVar2.J)).e0(bundle.getInt(f101523t0, uVar2.K)).Q(bundle.getInt(f101524u0, uVar2.L)).D0(bundle.getInt(f101526w0, uVar2.N)).E0(bundle.getInt(f101527x0, uVar2.O)).X(bundle.getInt(f101525v0, uVar2.P));
        return bVar.P();
    }

    private static String f(List<x> list, String str) {
        for (x xVar : list) {
            if (TextUtils.equals(xVar.f101672a, str)) {
                return xVar.f101673b;
            }
        }
        return list.get(0).f101673b;
    }

    private static boolean i(b bVar) {
        if (bVar.f101558c.isEmpty() && bVar.f101557b == null) {
            return true;
        }
        for (int i11 = 0; i11 < bVar.f101558c.size(); i11++) {
            if (((x) bVar.f101558c.get(i11)).f101673b.equals(bVar.f101557b)) {
                return true;
            }
        }
        return false;
    }

    private static String j(int i11) {
        return f101508e0 + "_" + Integer.toString(i11, 36);
    }

    public static String l(u uVar) {
        if (uVar == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        ou.i iVarF = ou.i.f(CoreConstants.COMMA_CHAR);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(uVar.f101530a);
        sb2.append(", mimeType=");
        sb2.append(uVar.f101544o);
        if (uVar.f101543n != null) {
            sb2.append(", container=");
            sb2.append(uVar.f101543n);
        }
        if (uVar.f101539j != -1) {
            sb2.append(", bitrate=");
            sb2.append(uVar.f101539j);
        }
        if (uVar.f101540k != null) {
            sb2.append(", codecs=");
            sb2.append(uVar.f101540k);
        }
        if (uVar.f101548s != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (true) {
                n nVar = uVar.f101548s;
                if (i11 >= nVar.f101433d) {
                    break;
                }
                UUID uuid = nVar.h(i11).f101435b;
                if (uuid.equals(h.f101349b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(h.f101350c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(h.f101352e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(h.f101351d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(h.f101348a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i11++;
            }
            sb2.append(", drm=[");
            iVarF.b(sb2, linkedHashSet);
            sb2.append(']');
        }
        if (uVar.f101551v != -1 && uVar.f101552w != -1) {
            sb2.append(", res=");
            sb2.append(uVar.f101551v);
            sb2.append("x");
            sb2.append(uVar.f101552w);
        }
        if (uVar.f101553x != -1 && uVar.f101554y != -1) {
            sb2.append(", decRes=");
            sb2.append(uVar.f101553x);
            sb2.append("x");
            sb2.append(uVar.f101554y);
        }
        if (!qu.b.a(uVar.B, 1.0d, 0.001d)) {
            sb2.append(", par=");
            sb2.append(s7.q0.J("%.3f", Float.valueOf(uVar.B)));
        }
        i iVar = uVar.E;
        if (iVar != null && iVar.j()) {
            sb2.append(", color=");
            sb2.append(uVar.E.o());
        }
        if (uVar.f101555z != -1.0f) {
            sb2.append(", fps=");
            sb2.append(uVar.f101555z);
        }
        if (uVar.F != -1) {
            sb2.append(", maxSubLayers=");
            sb2.append(uVar.F);
        }
        if (uVar.G != -1) {
            sb2.append(", channels=");
            sb2.append(uVar.G);
        }
        if (uVar.H != -1) {
            sb2.append(", sample_rate=");
            sb2.append(uVar.H);
        }
        if (uVar.f101533d != null) {
            sb2.append(", language=");
            sb2.append(uVar.f101533d);
        }
        if (!uVar.f101532c.isEmpty()) {
            sb2.append(", labels=[");
            iVarF.b(sb2, com.google.common.collect.f0.j(uVar.f101532c, new ou.h() { // from class: p7.s
                @Override // ou.h
                public final Object apply(Object obj) {
                    return u.a((x) obj);
                }
            }));
            sb2.append("]");
        }
        if (uVar.f101534e != 0) {
            sb2.append(", selectionFlags=[");
            iVarF.b(sb2, s7.q0.w0(uVar.f101534e));
            sb2.append("]");
        }
        if (uVar.f101535f != 0) {
            sb2.append(", roleFlags=[");
            iVarF.b(sb2, s7.q0.v0(uVar.f101535f));
            sb2.append("]");
        }
        if (uVar.f101542m != null) {
            sb2.append(", customData=");
            sb2.append(uVar.f101542m);
        }
        if ((uVar.f101535f & 32768) != 0) {
            sb2.append(", auxiliaryTrackType=");
            sb2.append(s7.q0.S(uVar.f101536g));
        }
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public u c(int i11) {
        return b().X(i11).P();
    }

    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            int i12 = this.Q;
            if ((i12 == 0 || (i11 = uVar.Q) == 0 || i12 == i11) && this.f101534e == uVar.f101534e && this.f101535f == uVar.f101535f && this.f101536g == uVar.f101536g && this.f101537h == uVar.f101537h && this.f101538i == uVar.f101538i && this.f101545p == uVar.f101545p && this.f101549t == uVar.f101549t && this.f101551v == uVar.f101551v && this.f101552w == uVar.f101552w && this.f101553x == uVar.f101553x && this.f101554y == uVar.f101554y && this.A == uVar.A && this.D == uVar.D && this.F == uVar.F && this.G == uVar.G && this.H == uVar.H && this.I == uVar.I && this.J == uVar.J && this.K == uVar.K && this.L == uVar.L && this.N == uVar.N && this.O == uVar.O && this.P == uVar.P && Float.compare(this.f101555z, uVar.f101555z) == 0 && Float.compare(this.B, uVar.B) == 0 && Objects.equals(this.f101530a, uVar.f101530a) && Objects.equals(this.f101531b, uVar.f101531b) && this.f101532c.equals(uVar.f101532c) && Objects.equals(this.f101540k, uVar.f101540k) && Objects.equals(this.f101543n, uVar.f101543n) && Objects.equals(this.f101544o, uVar.f101544o) && Objects.equals(this.f101533d, uVar.f101533d) && Arrays.equals(this.C, uVar.C) && Objects.equals(this.f101541l, uVar.f101541l) && Objects.equals(this.E, uVar.E) && Objects.equals(this.f101548s, uVar.f101548s) && h(uVar) && Objects.equals(this.f101542m, uVar.f101542m)) {
                return true;
            }
        }
        return false;
    }

    public int g() {
        int i11;
        int i12 = this.f101551v;
        if (i12 == -1 || (i11 = this.f101552w) == -1) {
            return -1;
        }
        return i12 * i11;
    }

    public boolean h(u uVar) {
        if (this.f101547r.size() != uVar.f101547r.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f101547r.size(); i11++) {
            if (!Arrays.equals(this.f101547r.get(i11), uVar.f101547r.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.Q == 0) {
            String str = this.f101530a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f101531b;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f101532c.hashCode()) * 31;
            String str3 = this.f101533d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f101534e) * 31) + this.f101535f) * 31) + this.f101536g) * 31) + this.f101537h) * 31) + this.f101538i) * 31;
            String str4 = this.f101540k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            f0 f0Var = this.f101541l;
            int iHashCode5 = (iHashCode4 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
            Object obj = this.f101542m;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f101543n;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f101544o;
            this.Q = ((((((((((((((((((((((((((((((((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f101545p) * 31) + ((int) this.f101549t)) * 31) + this.f101551v) * 31) + this.f101552w) * 31) + this.f101553x) * 31) + this.f101554y) * 31) + Float.floatToIntBits(this.f101555z)) * 31) + this.A) * 31) + Float.floatToIntBits(this.B)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.N) * 31) + this.O) * 31) + this.P;
        }
        return this.Q;
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString(S, this.f101530a);
        bundle.putString(T, this.f101531b);
        bundle.putParcelableArrayList(f101528y0, s7.i.h(this.f101532c, new ou.h() { // from class: p7.r
            @Override // ou.h
            public final Object apply(Object obj) {
                return ((x) obj).b();
            }
        }));
        bundle.putString(U, this.f101533d);
        bundle.putInt(V, this.f101534e);
        bundle.putInt(W, this.f101535f);
        int i11 = this.f101536g;
        if (i11 != R.f101536g) {
            bundle.putInt(f101529z0, i11);
        }
        bundle.putInt(X, this.f101537h);
        bundle.putInt(Y, this.f101538i);
        bundle.putString(Z, this.f101540k);
        bundle.putString(f101505b0, this.f101543n);
        bundle.putString(f101506c0, this.f101544o);
        bundle.putInt(f101507d0, this.f101545p);
        for (int i12 = 0; i12 < this.f101547r.size(); i12++) {
            bundle.putByteArray(j(i12), this.f101547r.get(i12));
        }
        bundle.putParcelable(f101509f0, this.f101548s);
        bundle.putLong(f101510g0, this.f101549t);
        bundle.putInt(f101511h0, this.f101551v);
        bundle.putInt(f101512i0, this.f101552w);
        bundle.putInt(B0, this.f101553x);
        bundle.putInt(C0, this.f101554y);
        bundle.putFloat(f101513j0, this.f101555z);
        bundle.putInt(f101514k0, this.A);
        bundle.putFloat(f101515l0, this.B);
        bundle.putByteArray(f101516m0, this.C);
        bundle.putInt(f101517n0, this.D);
        i iVar = this.E;
        if (iVar != null) {
            bundle.putBundle(f101518o0, iVar.n());
        }
        bundle.putInt(A0, this.F);
        bundle.putInt(f101519p0, this.G);
        bundle.putInt(f101520q0, this.H);
        bundle.putInt(f101521r0, this.I);
        bundle.putInt(f101522s0, this.J);
        bundle.putInt(f101523t0, this.K);
        bundle.putInt(f101524u0, this.L);
        bundle.putInt(f101526w0, this.N);
        bundle.putInt(f101527x0, this.O);
        bundle.putInt(f101525v0, this.P);
        return bundle;
    }

    public u m(u uVar) {
        String str;
        if (this == uVar) {
            return this;
        }
        int iK = g0.k(this.f101544o);
        String str2 = uVar.f101530a;
        int i11 = uVar.N;
        int i12 = uVar.O;
        String str3 = uVar.f101531b;
        if (str3 == null) {
            str3 = this.f101531b;
        }
        List<x> list = !uVar.f101532c.isEmpty() ? uVar.f101532c : this.f101532c;
        String str4 = this.f101533d;
        if ((iK == 3 || iK == 1) && (str = uVar.f101533d) != null) {
            str4 = str;
        }
        int i13 = this.f101537h;
        if (i13 == -1) {
            i13 = uVar.f101537h;
        }
        int i14 = this.f101538i;
        if (i14 == -1) {
            i14 = uVar.f101538i;
        }
        String str5 = this.f101540k;
        if (str5 == null) {
            String strY = s7.q0.Y(uVar.f101540k, iK);
            if (s7.q0.G1(strY).length == 1) {
                str5 = strY;
            }
        }
        f0 f0Var = this.f101541l;
        f0 f0VarB = f0Var == null ? uVar.f101541l : f0Var.b(uVar.f101541l);
        float f11 = this.f101555z;
        if (f11 == -1.0f && iK == 2) {
            f11 = uVar.f101555z;
        }
        return b().j0(str2).l0(str3).m0(list).n0(str4).A0(this.f101534e | uVar.f101534e).w0(this.f101535f | uVar.f101535f).S(i13).t0(i14).U(str5).r0(f0VarB).c0(n.f(uVar.f101548s, this.f101548s)).f0(f11).D0(i11).E0(i12).P();
    }

    public String toString() {
        return "Format(" + this.f101530a + ", " + this.f101531b + ", " + this.f101543n + ", " + this.f101544o + ", " + this.f101540k + ", " + this.f101539j + ", " + this.f101533d + ", [" + this.f101551v + ", " + this.f101552w + ", " + this.f101555z + ", " + this.E + "], [" + this.G + ", " + this.H + "])";
    }

    private u(b bVar) {
        this.f101530a = bVar.f101556a;
        String strE1 = s7.q0.e1(bVar.f101559d);
        this.f101533d = strE1;
        if (bVar.f101558c.isEmpty() && bVar.f101557b != null) {
            this.f101532c = com.google.common.collect.x.s(new x(strE1, bVar.f101557b));
            this.f101531b = bVar.f101557b;
        } else if (bVar.f101558c.isEmpty() || bVar.f101557b != null) {
            s7.a.h(i(bVar));
            this.f101532c = bVar.f101558c;
            this.f101531b = bVar.f101557b;
        } else {
            this.f101532c = bVar.f101558c;
            this.f101531b = f(bVar.f101558c, strE1);
        }
        this.f101534e = bVar.f101560e;
        s7.a.i(bVar.f101562g == 0 || (bVar.f101561f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f101535f = bVar.f101561f;
        this.f101536g = bVar.f101562g;
        int i11 = bVar.f101563h;
        this.f101537h = i11;
        int i12 = bVar.f101564i;
        this.f101538i = i12;
        this.f101539j = i12 != -1 ? i12 : i11;
        this.f101540k = bVar.f101565j;
        this.f101541l = bVar.f101566k;
        this.f101542m = bVar.f101567l;
        this.f101543n = bVar.f101568m;
        this.f101544o = bVar.f101569n;
        this.f101545p = bVar.f101570o;
        this.f101546q = bVar.f101571p;
        this.f101547r = bVar.f101572q == null ? Collections.EMPTY_LIST : bVar.f101572q;
        n nVar = bVar.f101573r;
        this.f101548s = nVar;
        this.f101549t = bVar.f101574s;
        this.f101550u = bVar.f101575t;
        this.f101551v = bVar.f101576u;
        this.f101552w = bVar.f101577v;
        this.f101553x = bVar.f101578w;
        this.f101554y = bVar.f101579x;
        this.f101555z = bVar.f101580y;
        this.A = bVar.f101581z == -1 ? 0 : bVar.f101581z;
        this.B = bVar.A == -1.0f ? 1.0f : bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        this.G = bVar.F;
        this.H = bVar.G;
        this.I = bVar.H;
        this.J = bVar.I == -1 ? 0 : bVar.I;
        this.K = bVar.J != -1 ? bVar.J : 0;
        this.L = bVar.K;
        this.M = bVar.L;
        this.N = bVar.M;
        this.O = bVar.N;
        if (bVar.O != 0 || nVar == null) {
            this.P = bVar.O;
        } else {
            this.P = 1;
        }
    }
}
