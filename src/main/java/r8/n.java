package r8;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.l2;
import androidx.media3.exoplayer.m2;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import p7.t0;
import p7.u0;
import p7.w0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class n extends w implements m2.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final r0<Integer> f107181l = r0.b(new Comparator() { // from class: r8.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.w((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f107182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f107183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t.b f107184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f107185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread f107186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f107187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p7.d f107188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f107189k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends i<b> implements Comparable<b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f107190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f107191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f107192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final e f107193h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f107194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f107195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f107196k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f107197l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f107198m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f107199n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f107200o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f107201p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f107202q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f107203r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f107204s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f107205t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final int f107206u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f107207v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f107208w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f107209x;

        public b(int i11, t0 t0Var, int i12, e eVar, int i13, boolean z11, ou.q<p7.u> qVar, int i14) {
            int i15;
            int iJ;
            int iJ2;
            super(i11, t0Var, i12);
            this.f107193h = eVar;
            int i16 = eVar.f107224y0 ? 24 : 16;
            this.f107198m = eVar.f107220u0 && (i14 & i16) != 0;
            this.f107192g = n.W(this.f107250d.f101533d);
            this.f107194i = m2.J(i13, false);
            int i17 = 0;
            while (true) {
                i15 = Integer.MAX_VALUE;
                if (i17 >= eVar.f101623p.size()) {
                    iJ = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = n.J(this.f107250d, eVar.f101623p.get(i17), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f107196k = i17;
            this.f107195j = iJ;
            this.f107197l = n.N(this.f107250d.f101535f, eVar.f101624q);
            p7.u uVar = this.f107250d;
            int i18 = uVar.f101535f;
            this.f107199n = i18 == 0 || (i18 & 1) != 0;
            this.f107202q = (uVar.f101534e & 1) != 0;
            this.f107209x = n.R(uVar);
            p7.u uVar2 = this.f107250d;
            int i19 = uVar2.G;
            this.f107203r = i19;
            this.f107204s = uVar2.H;
            int i21 = uVar2.f101539j;
            this.f107205t = i21;
            this.f107191f = (i21 == -1 || i21 <= eVar.f101626s) && (i19 == -1 || i19 <= eVar.f101625r) && qVar.apply(uVar2);
            String[] strArrY0 = q0.y0();
            int i22 = 0;
            while (true) {
                if (i22 >= strArrY0.length) {
                    iJ2 = 0;
                    i22 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ2 = n.J(this.f107250d, strArrY0[i22], false);
                    if (iJ2 > 0) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            this.f107200o = i22;
            this.f107201p = iJ2;
            for (int i23 = 0; i23 < eVar.f101627t.size(); i23++) {
                String str = this.f107250d.f101544o;
                if (str != null && str.equals(eVar.f101627t.get(i23))) {
                    i15 = i23;
                    break;
                }
            }
            this.f107206u = i15;
            this.f107207v = m2.s(i13) == 128;
            this.f107208w = m2.m(i13) == 64;
            this.f107190e = f(i13, z11, i16);
        }

        public static int c(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static com.google.common.collect.x<b> e(int i11, t0 t0Var, e eVar, int[] iArr, boolean z11, ou.q<p7.u> qVar, int i12) {
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i13 = 0; i13 < t0Var.f101499a; i13++) {
                aVarK.a(new b(i11, t0Var, i13, eVar, iArr[i13], z11, qVar, i12));
            }
            return aVarK.k();
        }

        private int f(int i11, boolean z11, int i12) {
            if (!m2.J(i11, this.f107193h.A0)) {
                return 0;
            }
            if (!this.f107191f && !this.f107193h.f107219t0) {
                return 0;
            }
            e eVar = this.f107193h;
            if (eVar.f101628u.f101638a == 2 && !n.X(eVar, i11, this.f107250d)) {
                return 0;
            }
            if (!m2.J(i11, false) || !this.f107191f || this.f107250d.f101539j == -1) {
                return 1;
            }
            e eVar2 = this.f107193h;
            if (eVar2.C || eVar2.B) {
                return 1;
            }
            return ((!eVar2.C0 && z11) || eVar2.f101628u.f101638a == 2 || (i11 & i12) == 0) ? 1 : 2;
        }

        @Override // r8.n.i
        public int a() {
            return this.f107190e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            r0 r0VarL = (this.f107191f && this.f107194i) ? n.f107181l : n.f107181l.l();
            com.google.common.collect.p pVarF = com.google.common.collect.p.j().g(this.f107194i, bVar.f107194i).f(Integer.valueOf(this.f107196k), Integer.valueOf(bVar.f107196k), r0.f().l()).d(this.f107195j, bVar.f107195j).d(this.f107197l, bVar.f107197l).g(this.f107202q, bVar.f107202q).g(this.f107199n, bVar.f107199n).f(Integer.valueOf(this.f107200o), Integer.valueOf(bVar.f107200o), r0.f().l()).d(this.f107201p, bVar.f107201p).g(this.f107191f, bVar.f107191f).f(Integer.valueOf(this.f107206u), Integer.valueOf(bVar.f107206u), r0.f().l());
            if (this.f107193h.B) {
                pVarF = pVarF.f(Integer.valueOf(this.f107205t), Integer.valueOf(bVar.f107205t), n.f107181l.l());
            }
            com.google.common.collect.p pVarF2 = pVarF.g(this.f107207v, bVar.f107207v).g(this.f107208w, bVar.f107208w).g(this.f107209x, bVar.f107209x).f(Integer.valueOf(this.f107203r), Integer.valueOf(bVar.f107203r), r0VarL).f(Integer.valueOf(this.f107204s), Integer.valueOf(bVar.f107204s), r0VarL);
            if (Objects.equals(this.f107192g, bVar.f107192g)) {
                pVarF2 = pVarF2.f(Integer.valueOf(this.f107205t), Integer.valueOf(bVar.f107205t), r0VarL);
            }
            return pVarF2.i();
        }

        @Override // r8.n.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i11;
            String str;
            int i12;
            if (!this.f107193h.f107222w0 && ((i12 = this.f107250d.G) == -1 || i12 != bVar.f107250d.G)) {
                return false;
            }
            if (!this.f107198m && ((str = this.f107250d.f101544o) == null || !TextUtils.equals(str, bVar.f107250d.f101544o))) {
                return false;
            }
            e eVar = this.f107193h;
            if (!eVar.f107221v0 && ((i11 = this.f107250d.H) == -1 || i11 != bVar.f107250d.H)) {
                return false;
            }
            if (eVar.f107223x0) {
                return true;
            }
            return this.f107207v == bVar.f107207v && this.f107208w == bVar.f107208w;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends i<c> implements Comparable<c> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f107210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f107211f;

        public c(int i11, t0 t0Var, int i12, e eVar, int i13) {
            super(i11, t0Var, i12);
            this.f107210e = m2.J(i13, eVar.A0) ? 1 : 0;
            this.f107211f = this.f107250d.g();
        }

        public static int c(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static com.google.common.collect.x<c> e(int i11, t0 t0Var, e eVar, int[] iArr) {
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i12 = 0; i12 < t0Var.f101499a; i12++) {
                aVarK.a(new c(i11, t0Var, i12, eVar, iArr[i12]));
            }
            return aVarK.k();
        }

        @Override // r8.n.i
        public int a() {
            return this.f107210e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f107211f, cVar.f107211f);
        }

        @Override // r8.n.i
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f107212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f107213b;

        public d(p7.u uVar, int i11) {
            this.f107212a = (uVar.f101534e & 1) != 0;
            this.f107213b = m2.J(i11, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return com.google.common.collect.p.j().g(this.f107213b, dVar.f107213b).g(this.f107212a, dVar.f107212a).i();
        }
    }

    public static final class e extends w0 {
        public static final e G0;

        @Deprecated
        public static final e H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private static final String f107214a1;
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        private final SparseArray<Map<n8.y, f>> E0;
        private final SparseBooleanArray F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f107215p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f107216q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f107217r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f107218s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f107219t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f107220u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f107221v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final boolean f107222w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final boolean f107223x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f107224y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final boolean f107225z0;

        public static final class a extends w0.c {
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private boolean R;
            private boolean S;
            private boolean T;
            private final SparseArray<Map<n8.y, f>> U;
            private final SparseBooleanArray V;

            private static SparseArray<Map<n8.y, f>> s0(SparseArray<Map<n8.y, f>> sparseArray) {
                SparseArray<Map<n8.y, f>> sparseArray2 = new SparseArray<>();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    sparseArray2.put(sparseArray.keyAt(i11), new HashMap(sparseArray.valueAt(i11)));
                }
                return sparseArray2;
            }

            private void t0() {
                this.F = true;
                this.G = false;
                this.H = true;
                this.I = false;
                this.J = true;
                this.K = false;
                this.L = false;
                this.M = false;
                this.N = false;
                this.O = true;
                this.P = true;
                this.Q = true;
                this.R = false;
                this.S = true;
                this.T = false;
            }

            public a A0(boolean z11) {
                super.P(z11);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
            public a Q(int i11) {
                super.Q(i11);
                return this;
            }

            public a C0(int i11) {
                super.R(i11);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
            public a S(u0 u0Var) {
                super.S(u0Var);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
            public a T(String str) {
                super.T(str);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
            public a U(String... strArr) {
                super.U(strArr);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
            public a V(int i11) {
                super.V(i11);
                return this;
            }

            public a H0(int i11, boolean z11) {
                if (this.V.get(i11) == z11) {
                    return this;
                }
                if (z11) {
                    this.V.put(i11, true);
                    return this;
                }
                this.V.delete(i11);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
            public a W(int i11, boolean z11) {
                super.W(i11, z11);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a F(u0 u0Var) {
                super.F(u0Var);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
            public e G() {
                return new e(this);
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
            public a H() {
                super.H();
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
            public a I(int i11) {
                super.I(i11);
                return this;
            }

            protected a u0(w0 w0Var) {
                super.M(w0Var);
                return this;
            }

            @Override // p7.w0.c
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public a N(Set<Integer> set) {
                super.N(set);
                return this;
            }

            public a w0(boolean z11) {
                this.J = z11;
                return this;
            }

            public a x0(boolean z11) {
                this.Q = z11;
                return this;
            }

            public a y0(boolean z11) {
                this.F = z11;
                return this;
            }

            public a z0(boolean z11) {
                super.O(z11);
                return this;
            }

            public a() {
                this.U = new SparseArray<>();
                this.V = new SparseBooleanArray();
                t0();
            }

            private a(e eVar) {
                super(eVar);
                this.F = eVar.f107215p0;
                this.G = eVar.f107216q0;
                this.H = eVar.f107217r0;
                this.I = eVar.f107218s0;
                this.J = eVar.f107219t0;
                this.K = eVar.f107220u0;
                this.L = eVar.f107221v0;
                this.M = eVar.f107222w0;
                this.N = eVar.f107223x0;
                this.O = eVar.f107224y0;
                this.P = eVar.f107225z0;
                this.Q = eVar.A0;
                this.R = eVar.B0;
                this.S = eVar.C0;
                this.T = eVar.D0;
                this.U = s0(eVar.E0);
                this.V = eVar.F0.clone();
            }
        }

        static {
            e eVarG = new a().G();
            G0 = eVarG;
            H0 = eVarG;
            I0 = q0.N0(1000);
            J0 = q0.N0(1001);
            K0 = q0.N0(1002);
            L0 = q0.N0(1003);
            M0 = q0.N0(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            N0 = q0.N0(1005);
            O0 = q0.N0(1006);
            P0 = q0.N0(1007);
            Q0 = q0.N0(1008);
            R0 = q0.N0(1009);
            S0 = q0.N0(1010);
            T0 = q0.N0(1011);
            U0 = q0.N0(1012);
            V0 = q0.N0(1013);
            W0 = q0.N0(1014);
            X0 = q0.N0(1015);
            Y0 = q0.N0(1016);
            Z0 = q0.N0(1017);
            f107214a1 = q0.N0(1018);
        }

        private static boolean N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i11)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean O(SparseArray<Map<n8.y, f>> sparseArray, SparseArray<Map<n8.y, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                if (iIndexOfKey < 0 || !P(sparseArray.valueAt(i11), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean P(Map<n8.y, f> map, Map<n8.y, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<n8.y, f> entry : map.entrySet()) {
                n8.y key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        private static int[] R(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                iArr[i11] = sparseBooleanArray.keyAt(i11);
            }
            return iArr;
        }

        private static void V(Bundle bundle, SparseArray<Map<n8.y, f>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                for (Map.Entry<n8.y, f> entry : sparseArray.valueAt(i11).entrySet()) {
                    f value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(S0, ru.f.n(arrayList));
                bundle.putParcelableArrayList(T0, s7.i.h(arrayList2, new ou.h() { // from class: r8.o
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return ((n8.y) obj).e();
                    }
                }));
                bundle.putSparseParcelableArray(U0, s7.i.j(sparseArray2, new ou.h() { // from class: r8.p
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return ((n.f) obj).a();
                    }
                }));
            }
        }

        @Override // p7.w0
        public Bundle K() {
            Bundle bundleK = super.K();
            bundleK.putBoolean(I0, this.f107215p0);
            bundleK.putBoolean(J0, this.f107216q0);
            bundleK.putBoolean(K0, this.f107217r0);
            bundleK.putBoolean(W0, this.f107218s0);
            bundleK.putBoolean(L0, this.f107219t0);
            bundleK.putBoolean(M0, this.f107220u0);
            bundleK.putBoolean(N0, this.f107221v0);
            bundleK.putBoolean(O0, this.f107222w0);
            bundleK.putBoolean(X0, this.f107223x0);
            bundleK.putBoolean(f107214a1, this.f107224y0);
            bundleK.putBoolean(Y0, this.f107225z0);
            bundleK.putBoolean(P0, this.A0);
            bundleK.putBoolean(Q0, this.B0);
            bundleK.putBoolean(R0, this.C0);
            bundleK.putBoolean(Z0, this.D0);
            V(bundleK, this.E0);
            bundleK.putIntArray(V0, R(this.F0));
            return bundleK;
        }

        @Override // p7.w0
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public a I() {
            return new a();
        }

        public boolean S(int i11) {
            return this.F0.get(i11);
        }

        @Deprecated
        public f T(int i11, n8.y yVar) {
            Map<n8.y, f> map = this.E0.get(i11);
            if (map != null) {
                return map.get(yVar);
            }
            return null;
        }

        @Deprecated
        public boolean U(int i11, n8.y yVar) {
            Map<n8.y, f> map = this.E0.get(i11);
            return map != null && map.containsKey(yVar);
        }

        @Override // p7.w0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f107215p0 == eVar.f107215p0 && this.f107216q0 == eVar.f107216q0 && this.f107217r0 == eVar.f107217r0 && this.f107218s0 == eVar.f107218s0 && this.f107219t0 == eVar.f107219t0 && this.f107220u0 == eVar.f107220u0 && this.f107221v0 == eVar.f107221v0 && this.f107222w0 == eVar.f107222w0 && this.f107223x0 == eVar.f107223x0 && this.f107224y0 == eVar.f107224y0 && this.f107225z0 == eVar.f107225z0 && this.A0 == eVar.A0 && this.B0 == eVar.B0 && this.C0 == eVar.C0 && this.D0 == eVar.D0 && N(this.F0, eVar.F0) && O(this.E0, eVar.E0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p7.w0
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f107215p0 ? 1 : 0)) * 31) + (this.f107216q0 ? 1 : 0)) * 31) + (this.f107217r0 ? 1 : 0)) * 31) + (this.f107218s0 ? 1 : 0)) * 31) + (this.f107219t0 ? 1 : 0)) * 31) + (this.f107220u0 ? 1 : 0)) * 31) + (this.f107221v0 ? 1 : 0)) * 31) + (this.f107222w0 ? 1 : 0)) * 31) + (this.f107223x0 ? 1 : 0)) * 31) + (this.f107224y0 ? 1 : 0)) * 31) + (this.f107225z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0);
        }

        private e(a aVar) {
            super(aVar);
            this.f107215p0 = aVar.F;
            this.f107216q0 = aVar.G;
            this.f107217r0 = aVar.H;
            this.f107218s0 = aVar.I;
            this.f107219t0 = aVar.J;
            this.f107220u0 = aVar.K;
            this.f107221v0 = aVar.L;
            this.f107222w0 = aVar.M;
            this.f107223x0 = aVar.N;
            this.f107224y0 = aVar.O;
            this.f107225z0 = aVar.P;
            this.A0 = aVar.Q;
            this.B0 = aVar.R;
            this.C0 = aVar.S;
            this.D0 = aVar.T;
            this.E0 = aVar.U;
            this.F0 = aVar.V;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f107226d = q0.N0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f107227e = q0.N0(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f107228f = q0.N0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f107230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f107231c;

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(f107226d, this.f107229a);
            bundle.putIntArray(f107227e, this.f107230b);
            bundle.putInt(f107228f, this.f107231c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f107229a == fVar.f107229a && Arrays.equals(this.f107230b, fVar.f107230b) && this.f107231c == fVar.f107231c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f107229a * 31) + Arrays.hashCode(this.f107230b)) * 31) + this.f107231c;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Spatializer f107232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f107233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f107234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Spatializer$OnSpatializerStateChangedListener f107235d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f107236a;

            a(n nVar) {
                this.f107236a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z11) {
                this.f107236a.U();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z11) {
                this.f107236a.U();
            }
        }

        public g(Context context, n nVar, Boolean bool) {
            AudioManager audioManagerC = context == null ? null : q7.f.c(context);
            if (audioManagerC == null || (bool != null && bool.booleanValue())) {
                this.f107232a = null;
                this.f107233b = false;
                this.f107234c = null;
                this.f107235d = null;
                return;
            }
            Spatializer spatializer = audioManagerC.getSpatializer();
            this.f107232a = spatializer;
            this.f107233b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(nVar);
            this.f107235d = aVar;
            Handler handler = new Handler((Looper) s7.a.j(Looper.myLooper()));
            this.f107234c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new b8.t(handler), aVar);
        }

        public boolean a(p7.d dVar, p7.u uVar) {
            int i11;
            if (Objects.equals(uVar.f101544o, "audio/eac3-joc")) {
                i11 = uVar.G;
                if (i11 == 16) {
                    i11 = 12;
                }
            } else if (Objects.equals(uVar.f101544o, "audio/iamf")) {
                i11 = uVar.G;
                if (i11 == -1) {
                    i11 = 6;
                }
            } else if (Objects.equals(uVar.f101544o, "audio/ac4")) {
                i11 = uVar.G;
                if (i11 == 18 || i11 == 21) {
                    i11 = 24;
                }
            } else {
                i11 = uVar.G;
            }
            int iQ = q0.Q(i11);
            if (iQ == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iQ);
            int i12 = uVar.H;
            if (i12 != -1) {
                channelMask.setSampleRate(i12);
            }
            return q.a(s7.a.f(this.f107232a)).canBeSpatialized(dVar.b().f101245a, channelMask.build());
        }

        public boolean b() {
            return q.a(s7.a.f(this.f107232a)).isAvailable();
        }

        public boolean c() {
            return q.a(s7.a.f(this.f107232a)).isEnabled();
        }

        public boolean d() {
            return this.f107233b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f107232a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f107235d) == null || this.f107234c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f107234c.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class h extends i<h> implements Comparable<h> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f107238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f107239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f107240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f107241h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f107242i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f107243j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f107244k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f107245l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f107246m;

        public h(int i11, t0 t0Var, int i12, e eVar, int i13, String str, String str2) {
            int iJ;
            super(i11, t0Var, i12);
            int i14 = 0;
            this.f107239f = m2.J(i13, false);
            int i15 = this.f107250d.f101534e & (~eVar.f101632y);
            this.f107240g = (i15 & 1) != 0;
            this.f107241h = (i15 & 2) != 0;
            com.google.common.collect.x<String> xVarS = str2 != null ? com.google.common.collect.x.s(str2) : eVar.f101629v.isEmpty() ? com.google.common.collect.x.s("") : eVar.f101629v;
            int i16 = 0;
            while (true) {
                if (i16 >= xVarS.size()) {
                    i16 = Integer.MAX_VALUE;
                    iJ = 0;
                    break;
                } else {
                    iJ = n.J(this.f107250d, xVarS.get(i16), eVar.f101633z);
                    if (iJ > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f107242i = i16;
            this.f107243j = iJ;
            int iN = n.N(this.f107250d.f101535f, str2 != null ? 1088 : eVar.f101630w);
            this.f107244k = iN;
            this.f107246m = (1088 & this.f107250d.f101535f) != 0;
            int iJ2 = n.J(this.f107250d, str, n.W(str) == null);
            this.f107245l = iJ2;
            boolean z11 = iJ > 0 || (eVar.f101629v.isEmpty() && iN > 0) || this.f107240g || (this.f107241h && iJ2 > 0);
            if (m2.J(i13, eVar.A0) && z11) {
                i14 = 1;
            }
            this.f107238e = i14;
        }

        public static int c(List<h> list, List<h> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static com.google.common.collect.x<h> e(int i11, t0 t0Var, e eVar, int[] iArr, String str, String str2) {
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i12 = 0; i12 < t0Var.f101499a; i12++) {
                aVarK.a(new h(i11, t0Var, i12, eVar, iArr[i12], str, str2));
            }
            return aVarK.k();
        }

        @Override // r8.n.i
        public int a() {
            return this.f107238e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            com.google.common.collect.p pVarD = com.google.common.collect.p.j().g(this.f107239f, hVar.f107239f).f(Integer.valueOf(this.f107242i), Integer.valueOf(hVar.f107242i), r0.f().l()).d(this.f107243j, hVar.f107243j).d(this.f107244k, hVar.f107244k).g(this.f107240g, hVar.f107240g).f(Boolean.valueOf(this.f107241h), Boolean.valueOf(hVar.f107241h), this.f107243j == 0 ? r0.f() : r0.f().l()).d(this.f107245l, hVar.f107245l);
            if (this.f107244k == 0) {
                pVarD = pVarD.h(this.f107246m, hVar.f107246m);
            }
            return pVarD.i();
        }

        @Override // r8.n.i
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class i<T extends i<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t0 f107248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f107249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p7.u f107250d;

        public interface a<T extends i<T>> {
            List<T> a(int i11, t0 t0Var, int[] iArr);
        }

        public i(int i11, t0 t0Var, int i12) {
            this.f107247a = i11;
            this.f107248b = t0Var;
            this.f107249c = i12;
            this.f107250d = t0Var.c(i12);
        }

        public abstract int a();

        public abstract boolean b(T t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends i<j> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f107251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e f107252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f107253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f107254h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f107255i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f107256j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f107257k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f107258l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f107259m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f107260n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f107261o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f107262p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f107263q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f107264r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f107265s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f107266t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f107267u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f107268v;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public j(int i11, t0 t0Var, int i12, e eVar, int i13, String str, int i14, boolean z11) {
            boolean z12;
            boolean z13;
            int i15;
            int iJ;
            p7.u uVar;
            int i16;
            int i17;
            int i18;
            p7.u uVar2;
            int i19;
            int i21;
            int i22;
            super(i11, t0Var, i12);
            this.f107252f = eVar;
            int i23 = eVar.f107217r0 ? 24 : 16;
            this.f107264r = eVar.f107216q0 && (i14 & i23) != 0;
            if (!z11 || (((i19 = (uVar2 = this.f107250d).f101551v) != -1 && i19 > eVar.f101608a) || ((i21 = uVar2.f101552w) != -1 && i21 > eVar.f101609b))) {
                z12 = false;
            } else {
                float f11 = uVar2.f101555z;
                if ((f11 == -1.0f || f11 <= eVar.f101610c) && ((i22 = uVar2.f101539j) == -1 || i22 <= eVar.f101611d)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f107251e = z12;
            if (!z11 || (((i16 = (uVar = this.f107250d).f101551v) != -1 && i16 < eVar.f101612e) || ((i17 = uVar.f101552w) != -1 && i17 < eVar.f101613f))) {
                z13 = false;
            } else {
                float f12 = uVar.f101555z;
                if ((f12 == -1.0f || f12 >= eVar.f101614g) && ((i18 = uVar.f101539j) == -1 || i18 >= eVar.f101615h)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            this.f107253g = z13;
            this.f107254h = m2.J(i13, false);
            p7.u uVar3 = this.f107250d;
            float f13 = uVar3.f101555z;
            this.f107255i = f13 != -1.0f && f13 >= 10.0f;
            this.f107256j = uVar3.f101539j;
            this.f107257k = uVar3.g();
            int i24 = 0;
            while (true) {
                i15 = Integer.MAX_VALUE;
                if (i24 >= eVar.f101621n.size()) {
                    i24 = Integer.MAX_VALUE;
                    iJ = 0;
                    break;
                } else {
                    iJ = n.J(this.f107250d, eVar.f101621n.get(i24), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
            this.f107259m = i24;
            this.f107260n = iJ;
            this.f107261o = n.N(this.f107250d.f101535f, eVar.f101622o);
            int i25 = this.f107250d.f101535f;
            this.f107262p = i25 == 0 || (i25 & 1) != 0;
            this.f107263q = n.J(this.f107250d, str, n.W(str) == null);
            for (int i26 = 0; i26 < eVar.f101620m.size(); i26++) {
                String str2 = this.f107250d.f101544o;
                if (str2 != null && str2.equals(eVar.f101620m.get(i26))) {
                    i15 = i26;
                    break;
                }
            }
            this.f107258l = i15;
            this.f107266t = m2.s(i13) == 128;
            this.f107267u = m2.m(i13) == 64;
            this.f107268v = n.O(this.f107250d.f101544o);
            this.f107265s = i(i13, i23);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int e(j jVar, j jVar2) {
            com.google.common.collect.p pVarG = com.google.common.collect.p.j().g(jVar.f107254h, jVar2.f107254h).f(Integer.valueOf(jVar.f107259m), Integer.valueOf(jVar2.f107259m), r0.f().l()).d(jVar.f107260n, jVar2.f107260n).d(jVar.f107261o, jVar2.f107261o).g(jVar.f107262p, jVar2.f107262p).d(jVar.f107263q, jVar2.f107263q).g(jVar.f107255i, jVar2.f107255i).g(jVar.f107251e, jVar2.f107251e).g(jVar.f107253g, jVar2.f107253g).f(Integer.valueOf(jVar.f107258l), Integer.valueOf(jVar2.f107258l), r0.f().l()).g(jVar.f107266t, jVar2.f107266t).g(jVar.f107267u, jVar2.f107267u);
            if (jVar.f107266t && jVar.f107267u) {
                pVarG = pVarG.d(jVar.f107268v, jVar2.f107268v);
            }
            return pVarG.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int f(j jVar, j jVar2) {
            r0 r0VarL = (jVar.f107251e && jVar.f107254h) ? n.f107181l : n.f107181l.l();
            com.google.common.collect.p pVarJ = com.google.common.collect.p.j();
            if (jVar.f107252f.B) {
                pVarJ = pVarJ.f(Integer.valueOf(jVar.f107256j), Integer.valueOf(jVar2.f107256j), n.f107181l.l());
            }
            return pVarJ.f(Integer.valueOf(jVar.f107257k), Integer.valueOf(jVar2.f107257k), r0VarL).f(Integer.valueOf(jVar.f107256j), Integer.valueOf(jVar2.f107256j), r0VarL).i();
        }

        public static int g(List<j> list, List<j> list2) {
            return com.google.common.collect.p.j().f((j) Collections.max(list, new Comparator() { // from class: r8.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: r8.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: r8.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: r8.s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: r8.s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: r8.s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }).i();
        }

        public static com.google.common.collect.x<j> h(int i11, t0 t0Var, e eVar, int[] iArr, String str, int i12, Point point) {
            int iK = n.K(t0Var, point != null ? point.x : eVar.f101616i, point != null ? point.y : eVar.f101617j, eVar.f101619l);
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i13 = 0; i13 < t0Var.f101499a; i13++) {
                int iG = t0Var.c(i13).g();
                aVarK.a(new j(i11, t0Var, i13, eVar, iArr[i13], str, i12, iK == Integer.MAX_VALUE || (iG != -1 && iG <= iK)));
            }
            return aVarK.k();
        }

        private int i(int i11, int i12) {
            if ((this.f107250d.f101535f & 16384) != 0 || !m2.J(i11, this.f107252f.A0)) {
                return 0;
            }
            if (!this.f107251e && !this.f107252f.f107215p0) {
                return 0;
            }
            if (!m2.J(i11, false) || !this.f107253g || !this.f107251e || this.f107250d.f101539j == -1) {
                return 1;
            }
            e eVar = this.f107252f;
            return (eVar.C || eVar.B || (i11 & i12) == 0) ? 1 : 2;
        }

        @Override // r8.n.i
        public int a() {
            return this.f107265s;
        }

        @Override // r8.n.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            if (!this.f107264r && !Objects.equals(this.f107250d.f101544o, jVar.f107250d.f101544o)) {
                return false;
            }
            if (this.f107252f.f107218s0) {
                return true;
            }
            return this.f107266t == jVar.f107266t && this.f107267u == jVar.f107267u;
        }
    }

    public n(Context context) {
        this(context, new r8.a.b());
    }

    private static void F(w.a aVar, e eVar, t.a[] aVarArr) {
        int iD = aVar.d();
        for (int i11 = 0; i11 < iD; i11++) {
            n8.y yVarF = aVar.f(i11);
            if (eVar.U(i11, yVarF)) {
                f fVarT = eVar.T(i11, yVarF);
                aVarArr[i11] = (fVarT == null || fVarT.f107230b.length == 0) ? null : new t.a(yVarF.b(fVarT.f107229a), fVarT.f107230b, fVarT.f107231c);
            }
        }
    }

    private static void G(w.a aVar, w0 w0Var, t.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < iD; i11++) {
            I(aVar.f(i11), w0Var, map);
        }
        I(aVar.h(), w0Var, map);
        for (int i12 = 0; i12 < iD; i12++) {
            u0 u0Var = (u0) map.get(Integer.valueOf(aVar.e(i12)));
            if (u0Var != null) {
                aVarArr[i12] = (u0Var.f101585b.isEmpty() || aVar.f(i12).d(u0Var.f101584a) == -1) ? null : new t.a(u0Var.f101584a, ru.f.n(u0Var.f101585b));
            }
        }
    }

    private static void I(n8.y yVar, w0 w0Var, Map<Integer, u0> map) {
        u0 u0Var;
        for (int i11 = 0; i11 < yVar.f93615a; i11++) {
            u0 u0Var2 = w0Var.D.get(yVar.b(i11));
            if (u0Var2 != null && ((u0Var = map.get(Integer.valueOf(u0Var2.b()))) == null || (u0Var.f101585b.isEmpty() && !u0Var2.f101585b.isEmpty()))) {
                map.put(Integer.valueOf(u0Var2.b()), u0Var2);
            }
        }
    }

    protected static int J(p7.u uVar, String str, boolean z11) {
        if (!TextUtils.isEmpty(str) && str.equals(uVar.f101533d)) {
            return 4;
        }
        String strW = W(str);
        String strW2 = W(uVar.f101533d);
        if (strW2 == null || strW == null) {
            return (z11 && strW2 == null) ? 1 : 0;
        }
        if (strW2.startsWith(strW) || strW.startsWith(strW2)) {
            return 3;
        }
        return q0.F1(strW2, "-")[0].equals(q0.F1(strW, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(t0 t0Var, int i11, int i12, boolean z11) {
        int i13;
        int i14 = Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
            for (int i15 = 0; i15 < t0Var.f101499a; i15++) {
                p7.u uVarC = t0Var.c(i15);
                int i16 = uVarC.f101551v;
                if (i16 > 0 && (i13 = uVarC.f101552w) > 0) {
                    Point pointD = z.d(z11, i11, i12, i16, i13);
                    int i17 = uVarC.f101551v;
                    int i18 = uVarC.f101552w;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (pointD.x * 0.98f)) && i18 >= ((int) (pointD.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
        }
        return i14;
    }

    private static String M(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return q0.m0(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int N(int i11, int i12) {
        if (i11 == 0 || i11 != i12) {
            return Integer.bitCount(i11 & i12);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int O(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P(p7.u uVar, e eVar) {
        int i11;
        g gVar;
        g gVar2;
        if (!eVar.f107225z0) {
            return true;
        }
        Boolean bool = this.f107189k;
        if ((bool != null && bool.booleanValue()) || (i11 = uVar.G) == -1 || i11 <= 2) {
            return true;
        }
        if (!Q(uVar) || (Build.VERSION.SDK_INT >= 32 && (gVar2 = this.f107187i) != null && gVar2.d())) {
            return Build.VERSION.SDK_INT >= 32 && (gVar = this.f107187i) != null && gVar.d() && this.f107187i.b() && this.f107187i.c() && this.f107187i.a(this.f107188j, uVar);
        }
        return true;
    }

    private static boolean Q(p7.u uVar) {
        String str = uVar.f101544o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean R(p7.u uVar) {
        String str = uVar.f101544o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    private static void S(e eVar, w.a aVar, int[][][] iArr, z7.y[] yVarArr, t[] tVarArr) {
        int i11 = -1;
        boolean z11 = false;
        int i12 = 0;
        for (int i13 = 0; i13 < aVar.d(); i13++) {
            int iE = aVar.e(i13);
            t tVar = tVarArr[i13];
            if (iE != 1 && tVar != null) {
                return;
            }
            if (iE == 1 && tVar != null && tVar.length() == 1) {
                if (X(eVar, iArr[i13][aVar.f(i13).d(tVar.e())][tVar.b(0)], tVar.f())) {
                    i12++;
                    i11 = i13;
                }
            }
        }
        if (i12 == 1) {
            int i14 = eVar.f101628u.f101639b ? 1 : 2;
            z7.y yVar = yVarArr[i11];
            if (yVar != null && yVar.f127119b) {
                z11 = true;
            }
            yVarArr[i11] = new z7.y(i14, z11);
        }
    }

    private static void T(w.a aVar, int[][][] iArr, z7.y[] yVarArr, t[] tVarArr) {
        boolean z11;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            if (i13 >= aVar.d()) {
                z11 = true;
                break;
            }
            int iE = aVar.e(i13);
            t tVar = tVarArr[i13];
            if ((iE == 1 || iE == 2) && tVar != null && Y(iArr[i13], aVar.f(i13), tVar)) {
                if (iE == 1) {
                    if (i12 != -1) {
                        z11 = false;
                        break;
                    }
                    i12 = i13;
                } else {
                    if (i11 != -1) {
                        z11 = false;
                        break;
                    }
                    i11 = i13;
                }
            }
            i13++;
        }
        if (z11 && ((i12 == -1 || i11 == -1) ? false : true)) {
            z7.y yVar = new z7.y(0, true);
            yVarArr[i12] = yVar;
            yVarArr[i11] = yVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        boolean z11;
        g gVar;
        synchronized (this.f107182d) {
            try {
                z11 = this.f107185g.f107225z0 && Build.VERSION.SDK_INT >= 32 && (gVar = this.f107187i) != null && gVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            f();
        }
    }

    private void V(l2 l2Var) {
        boolean z11;
        synchronized (this.f107182d) {
            z11 = this.f107185g.D0;
        }
        if (z11) {
            g(l2Var);
        }
    }

    protected static String W(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean X(e eVar, int i11, p7.u uVar) {
        if (m2.D(i11) == 0) {
            return false;
        }
        if (eVar.f101628u.f101640c && (m2.D(i11) & 2048) == 0) {
            return false;
        }
        if (eVar.f101628u.f101639b) {
            boolean z11 = (uVar.J == 0 && uVar.K == 0) ? false : true;
            boolean z12 = (m2.D(i11) & 1024) != 0;
            if (z11 && !z12) {
                return false;
            }
        }
        return true;
    }

    private static boolean Y(int[][] iArr, n8.y yVar, t tVar) {
        if (tVar == null) {
            return false;
        }
        int iD = yVar.d(tVar.e());
        for (int i11 = 0; i11 < tVar.length(); i11++) {
            if (m2.v(iArr[iD][tVar.b(i11)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends i<T>> Pair<t.a, Integer> e0(int i11, w.a aVar, int[][][] iArr, i.a<T> aVar2, Comparator<List<T>> comparator) {
        int i12;
        RandomAccess randomAccessS;
        w.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i13 = 0;
        while (i13 < iD) {
            if (i11 == aVar3.e(i13)) {
                n8.y yVarF = aVar3.f(i13);
                for (int i14 = 0; i14 < yVarF.f93615a; i14++) {
                    t0 t0VarB = yVarF.b(i14);
                    List<T> listA = aVar2.a(i13, t0VarB, iArr[i13][i14]);
                    boolean[] zArr = new boolean[t0VarB.f101499a];
                    int i15 = 0;
                    while (i15 < t0VarB.f101499a) {
                        T t11 = listA.get(i15);
                        int iA = t11.a();
                        if (zArr[i15] || iA == 0) {
                            i12 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessS = com.google.common.collect.x.s(t11);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t11);
                                int i16 = i15 + 1;
                                while (i16 < t0VarB.f101499a) {
                                    T t12 = listA.get(i16);
                                    int i17 = iD;
                                    if (t12.a() == 2 && t11.b(t12)) {
                                        arrayList2.add(t12);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    iD = i17;
                                }
                                randomAccessS = arrayList2;
                            }
                            i12 = iD;
                            arrayList.add(randomAccessS);
                        }
                        i15++;
                        iD = i12;
                    }
                }
            }
            i13++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((i) list.get(i18)).f107249c;
        }
        i iVar = (i) list.get(0);
        return Pair.create(new t.a(iVar.f107248b, iArr2), Integer.valueOf(iVar.f107247a));
    }

    private void h0(e eVar) {
        boolean zEquals;
        s7.a.f(eVar);
        synchronized (this.f107182d) {
            zEquals = this.f107185g.equals(eVar);
            this.f107185g = eVar;
        }
        if (zEquals) {
            return;
        }
        if (eVar.f107225z0 && this.f107183e == null) {
            s7.t.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    public static /* synthetic */ List s(final n nVar, final e eVar, boolean z11, int[] iArr, int i11, t0 t0Var, int[] iArr2) {
        nVar.getClass();
        return b.e(i11, t0Var, eVar, iArr2, z11, new ou.q() { // from class: r8.m
            @Override // ou.q
            public final boolean apply(Object obj) {
                return this.f107179a.P((p7.u) obj, eVar);
            }
        }, iArr[i11]);
    }

    public static /* synthetic */ int w(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public e.a H() {
        return b().I();
    }

    @Override // r8.a0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public e b() {
        e eVar;
        synchronized (this.f107182d) {
            eVar = this.f107185g;
        }
        return eVar;
    }

    protected t.a[] Z(w.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        String str;
        int iD = aVar.d();
        t.a[] aVarArr = new t.a[iD];
        Pair<t.a, Integer> pairA0 = a0(aVar, iArr, iArr2, eVar);
        if (pairA0 != null) {
            aVarArr[((Integer) pairA0.second).intValue()] = (t.a) pairA0.first;
        }
        if (pairA0 == null) {
            str = null;
        } else {
            Object obj = pairA0.first;
            str = ((t.a) obj).f107269a.c(((t.a) obj).f107270b[0]).f101533d;
        }
        Pair<t.a, Integer> pairF0 = f0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        Pair<t.a, Integer> pairB0 = (eVar.A || pairF0 == null) ? b0(aVar, iArr, eVar) : null;
        if (pairB0 != null) {
            aVarArr[((Integer) pairB0.second).intValue()] = (t.a) pairB0.first;
        } else if (pairF0 != null) {
            aVarArr[((Integer) pairF0.second).intValue()] = (t.a) pairF0.first;
        }
        Pair<t.a, Integer> pairD0 = d0(aVar, iArr, eVar, str2);
        if (pairD0 != null) {
            aVarArr[((Integer) pairD0.second).intValue()] = (t.a) pairD0.first;
        }
        for (int i11 = 0; i11 < iD; i11++) {
            int iE = aVar.e(i11);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i11] = c0(iE, aVar.f(i11), iArr[i11], eVar);
            }
        }
        return aVarArr;
    }

    protected Pair<t.a, Integer> a0(w.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z11 = false;
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            if (2 == aVar.e(i11) && aVar.f(i11).f93615a > 0) {
                z11 = true;
                break;
            }
        }
        return e0(1, aVar, iArr, new i.a() { // from class: r8.i
            @Override // r8.n.i.a
            public final List a(int i12, t0 t0Var, int[] iArr3) {
                return n.s(this.f107172a, eVar, z11, iArr2, i12, t0Var, iArr3);
            }
        }, new Comparator() { // from class: r8.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<t.a, Integer> b0(w.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f101628u.f101638a == 2) {
            return null;
        }
        return e0(4, aVar, iArr, new i.a() { // from class: r8.e
            @Override // r8.n.i.a
            public final List a(int i11, t0 t0Var, int[] iArr2) {
                return n.c.e(i11, t0Var, eVar, iArr2);
            }
        }, new Comparator() { // from class: r8.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.c((List) obj, (List) obj2);
            }
        });
    }

    protected t.a c0(int i11, n8.y yVar, int[][] iArr, e eVar) {
        if (eVar.f101628u.f101638a == 2) {
            return null;
        }
        int i12 = 0;
        t0 t0Var = null;
        d dVar = null;
        for (int i13 = 0; i13 < yVar.f93615a; i13++) {
            t0 t0VarB = yVar.b(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < t0VarB.f101499a; i14++) {
                if (m2.J(iArr2[i14], eVar.A0)) {
                    d dVar2 = new d(t0VarB.c(i14), iArr2[i14]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        t0Var = t0VarB;
                        i12 = i14;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (t0Var == null) {
            return null;
        }
        return new t.a(t0Var, i12);
    }

    @Override // androidx.media3.exoplayer.m2.a
    public void d(l2 l2Var) {
        V(l2Var);
    }

    protected Pair<t.a, Integer> d0(w.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f101628u.f101638a == 2) {
            return null;
        }
        final String strM = eVar.f101631x ? M(this.f107183e) : null;
        return e0(3, aVar, iArr, new i.a() { // from class: r8.k
            @Override // r8.n.i.a
            public final List a(int i11, t0 t0Var, int[] iArr2) {
                return n.h.e(i11, t0Var, eVar, iArr2, str, strM);
            }
        }, new Comparator() { // from class: r8.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<t.a, Integer> f0(w.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) {
        Context context;
        final Point pointB0 = null;
        if (eVar.f101628u.f101638a == 2) {
            return null;
        }
        if (eVar.f101618k && (context = this.f107183e) != null) {
            pointB0 = q0.b0(context);
        }
        return e0(2, aVar, iArr, new i.a() { // from class: r8.g
            @Override // r8.n.i.a
            public final List a(int i11, t0 t0Var, int[] iArr3) {
                return n.j.h(i11, t0Var, eVar, iArr3, str, iArr2[i11], pointB0);
            }
        }, new Comparator() { // from class: r8.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.g((List) obj, (List) obj2);
            }
        });
    }

    public void g0(e.a aVar) {
        h0(aVar.G());
    }

    @Override // r8.a0
    public boolean h() {
        return true;
    }

    @Override // r8.a0
    public void j() {
        g gVar;
        synchronized (this.f107182d) {
            try {
                Thread thread = this.f107186h;
                if (thread != null) {
                    s7.a.i(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (gVar = this.f107187i) != null) {
            gVar.e();
            this.f107187i = null;
        }
        super.j();
    }

    @Override // r8.a0
    public void l(p7.d dVar) {
        if (this.f107188j.equals(dVar)) {
            return;
        }
        this.f107188j = dVar;
        U();
    }

    @Override // r8.a0
    public void m(w0 w0Var) {
        if (w0Var instanceof e) {
            h0((e) w0Var);
        }
        h0(new e.a().u0(w0Var).G());
    }

    @Override // r8.w
    protected final Pair<z7.y[], t[]> r(w.a aVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.r.b bVar, p7.r0 r0Var) {
        e eVar;
        Context context;
        synchronized (this.f107182d) {
            this.f107186h = Thread.currentThread();
            eVar = this.f107185g;
        }
        if (this.f107189k == null && (context = this.f107183e) != null) {
            this.f107189k = Boolean.valueOf(q0.V0(context));
        }
        if (eVar.f107225z0 && Build.VERSION.SDK_INT >= 32 && this.f107187i == null) {
            this.f107187i = new g(this.f107183e, this, this.f107189k);
        }
        int iD = aVar.d();
        t.a[] aVarArrZ = Z(aVar, iArr, iArr2, eVar);
        G(aVar, eVar, aVarArrZ);
        F(aVar, eVar, aVarArrZ);
        for (int i11 = 0; i11 < iD; i11++) {
            int iE = aVar.e(i11);
            if (eVar.S(i11) || eVar.E.contains(Integer.valueOf(iE))) {
                aVarArrZ[i11] = null;
            }
        }
        t[] tVarArrA = this.f107184f.a(aVarArrZ, a(), bVar, r0Var);
        z7.y[] yVarArr = new z7.y[iD];
        for (int i12 = 0; i12 < iD; i12++) {
            yVarArr[i12] = (eVar.S(i12) || eVar.E.contains(Integer.valueOf(aVar.e(i12))) || (aVar.e(i12) != -2 && tVarArrA[i12] == null)) ? null : z7.y.f127117c;
        }
        if (eVar.B0) {
            T(aVar, iArr, yVarArr, tVarArrA);
        }
        if (eVar.f101628u.f101638a != 0) {
            S(eVar, aVar, iArr, yVarArr, tVarArrA);
        }
        return Pair.create(yVarArr, tVarArrA);
    }

    public n(Context context, t.b bVar) {
        this(context, e.G0, bVar);
    }

    public n(Context context, w0 w0Var, t.b bVar) {
        this(w0Var, bVar, context);
    }

    private n(w0 w0Var, t.b bVar, Context context) {
        this.f107182d = new Object();
        this.f107183e = context != null ? context.getApplicationContext() : null;
        this.f107184f = bVar;
        if (w0Var instanceof e) {
            this.f107185g = (e) w0Var;
        } else {
            this.f107185g = e.G0.I().u0(w0Var).G();
        }
        this.f107188j = p7.d.f101231h;
        if (this.f107185g.f107225z0 && context == null) {
            s7.t.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // r8.a0
    public m2.a c() {
        return this;
    }
}
