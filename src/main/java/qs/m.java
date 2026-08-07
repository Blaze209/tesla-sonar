package qs;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import br.j0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.z1;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import org.webrtc.MediaStreamTrack;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class m extends t implements a2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final r0<Integer> f105978k = r0.b(new Comparator() { // from class: qs.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.u((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final r0<Integer> f105979l = r0.b(new Comparator() { // from class: qs.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f105980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f105981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.b f105982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f105983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f105984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f105985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f105986j;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends h<b> implements Comparable<b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f105987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f105988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f105989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d f105990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f105991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f105992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f105993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f105994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f105995m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f105996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f105997o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f105998p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f105999q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f106000r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f106001s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f106002t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f106003u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f106004v;

        public b(int i11, es.u uVar, int i12, d dVar, int i13, boolean z11, ou.q<u0> qVar) {
            int i14;
            int iG;
            int iG2;
            super(i11, uVar, i12);
            this.f105990h = dVar;
            this.f105989g = m.S(this.f106056d.f40703c);
            this.f105991i = m.O(i13, false);
            int i15 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i15 >= dVar.f106105n.size()) {
                    iG = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    iG = m.G(this.f106056d, dVar.f106105n.get(i15), false);
                    if (iG > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f105993k = i15;
            this.f105992j = iG;
            this.f105994l = m.K(this.f106056d.f40705e, dVar.f106106o);
            u0 u0Var = this.f106056d;
            int i16 = u0Var.f40705e;
            this.f105995m = i16 == 0 || (i16 & 1) != 0;
            this.f105998p = (u0Var.f40704d & 1) != 0;
            int i17 = u0Var.f40725y;
            this.f105999q = i17;
            this.f106000r = u0Var.f40726z;
            int i18 = u0Var.f40708h;
            this.f106001s = i18;
            this.f105988f = (i18 == -1 || i18 <= dVar.f106108q) && (i17 == -1 || i17 <= dVar.f106107p) && qVar.apply(u0Var);
            String[] strArrG0 = p0.g0();
            int i19 = 0;
            while (true) {
                if (i19 >= strArrG0.length) {
                    iG2 = 0;
                    i19 = Integer.MAX_VALUE;
                    break;
                } else {
                    iG2 = m.G(this.f106056d, strArrG0[i19], false);
                    if (iG2 > 0) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f105996n = i19;
            this.f105997o = iG2;
            for (int i21 = 0; i21 < dVar.f106109r.size(); i21++) {
                String str = this.f106056d.f40712l;
                if (str != null && str.equals(dVar.f106109r.get(i21))) {
                    i14 = i21;
                    break;
                }
            }
            this.f106002t = i14;
            this.f106003u = a2.s(i13) == 128;
            this.f106004v = a2.m(i13) == 64;
            this.f105987e = f(i13, z11);
        }

        public static int c(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static com.google.common.collect.x<b> e(int i11, es.u uVar, d dVar, int[] iArr, boolean z11, ou.q<u0> qVar) {
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i12 = 0; i12 < uVar.f63205a; i12++) {
                aVarK.a(new b(i11, uVar, i12, dVar, iArr[i12], z11, qVar));
            }
            return aVarK.k();
        }

        private int f(int i11, boolean z11) {
            if (!m.O(i11, this.f105990h.f106024n0)) {
                return 0;
            }
            if (!this.f105988f && !this.f105990h.f106018h0) {
                return 0;
            }
            if (!m.O(i11, false) || !this.f105988f || this.f106056d.f40708h == -1) {
                return 1;
            }
            d dVar = this.f105990h;
            if (dVar.f106115x || dVar.f106114w) {
                return 1;
            }
            return (dVar.f106026p0 || !z11) ? 2 : 1;
        }

        @Override // qs.m.h
        public int a() {
            return this.f105987e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            r0 r0VarL = (this.f105988f && this.f105991i) ? m.f105978k : m.f105978k.l();
            com.google.common.collect.p pVarF = com.google.common.collect.p.j().g(this.f105991i, bVar.f105991i).f(Integer.valueOf(this.f105993k), Integer.valueOf(bVar.f105993k), r0.f().l()).d(this.f105992j, bVar.f105992j).d(this.f105994l, bVar.f105994l).g(this.f105998p, bVar.f105998p).g(this.f105995m, bVar.f105995m).f(Integer.valueOf(this.f105996n), Integer.valueOf(bVar.f105996n), r0.f().l()).d(this.f105997o, bVar.f105997o).g(this.f105988f, bVar.f105988f).f(Integer.valueOf(this.f106002t), Integer.valueOf(bVar.f106002t), r0.f().l()).f(Integer.valueOf(this.f106001s), Integer.valueOf(bVar.f106001s), this.f105990h.f106114w ? m.f105978k.l() : m.f105979l).g(this.f106003u, bVar.f106003u).g(this.f106004v, bVar.f106004v).f(Integer.valueOf(this.f105999q), Integer.valueOf(bVar.f105999q), r0VarL).f(Integer.valueOf(this.f106000r), Integer.valueOf(bVar.f106000r), r0VarL);
            Integer numValueOf = Integer.valueOf(this.f106001s);
            Integer numValueOf2 = Integer.valueOf(bVar.f106001s);
            if (!p0.c(this.f105989g, bVar.f105989g)) {
                r0VarL = m.f105979l;
            }
            return pVarF.f(numValueOf, numValueOf2, r0VarL).i();
        }

        @Override // qs.m.h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i11;
            String str;
            int i12;
            d dVar = this.f105990h;
            if (!dVar.f106021k0 && ((i12 = this.f106056d.f40725y) == -1 || i12 != bVar.f106056d.f40725y)) {
                return false;
            }
            if (!dVar.f106019i0 && ((str = this.f106056d.f40712l) == null || !TextUtils.equals(str, bVar.f106056d.f40712l))) {
                return false;
            }
            d dVar2 = this.f105990h;
            if (!dVar2.f106020j0 && ((i11 = this.f106056d.f40726z) == -1 || i11 != bVar.f106056d.f40726z)) {
                return false;
            }
            if (dVar2.f106022l0) {
                return true;
            }
            return this.f106003u == bVar.f106003u && this.f106004v == bVar.f106004v;
        }
    }

    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f106005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f106006b;

        public c(u0 u0Var, int i11) {
            this.f106005a = (u0Var.f40704d & 1) != 0;
            this.f106006b = m.O(i11, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return com.google.common.collect.p.j().g(this.f106006b, cVar.f106006b).g(this.f106005a, cVar.f106005a).i();
        }
    }

    public static final class d extends y implements com.google.android.exoplayer2.g {
        private static final String A0;
        private static final String B0;
        private static final String C0;
        private static final String D0;
        private static final String E0;
        private static final String F0;
        private static final String G0;
        private static final String H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        public static final com.google.android.exoplayer2.g.a<d> N0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final d f106007t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @Deprecated
        public static final d f106008u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private static final String f106009v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        private static final String f106010w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        private static final String f106011x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private static final String f106012y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private static final String f106013z0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public final boolean f106014d0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public final boolean f106015e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public final boolean f106016f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public final boolean f106017g0;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public final boolean f106018h0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public final boolean f106019i0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public final boolean f106020j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public final boolean f106021k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public final boolean f106022l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public final boolean f106023m0;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public final boolean f106024n0;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public final boolean f106025o0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f106026p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f106027q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private final SparseArray<Map<es.w, e>> f106028r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        private final SparseBooleanArray f106029s0;

        static {
            d dVarA = new a().A();
            f106007t0 = dVarA;
            f106008u0 = dVarA;
            f106009v0 = p0.t0(1000);
            f106010w0 = p0.t0(1001);
            f106011x0 = p0.t0(1002);
            f106012y0 = p0.t0(1003);
            f106013z0 = p0.t0(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            A0 = p0.t0(1005);
            B0 = p0.t0(1006);
            C0 = p0.t0(1007);
            D0 = p0.t0(1008);
            E0 = p0.t0(1009);
            F0 = p0.t0(1010);
            G0 = p0.t0(1011);
            H0 = p0.t0(1012);
            I0 = p0.t0(1013);
            J0 = p0.t0(1014);
            K0 = p0.t0(1015);
            L0 = p0.t0(1016);
            M0 = p0.t0(1017);
            N0 = new com.google.android.exoplayer2.g.a() { // from class: qs.n
                @Override // com.google.android.exoplayer2.g.a
                public final com.google.android.exoplayer2.g a(Bundle bundle) {
                    return new m.d.a(bundle).A();
                }
            };
        }

        private static boolean F(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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

        private static boolean G(SparseArray<Map<es.w, e>> sparseArray, SparseArray<Map<es.w, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                if (iIndexOfKey < 0 || !H(sparseArray.valueAt(i11), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean H(Map<es.w, e> map, Map<es.w, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<es.w, e> entry : map.entrySet()) {
                es.w key = entry.getKey();
                if (!map2.containsKey(key) || !p0.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static d J(Context context) {
            return new a(context).A();
        }

        private static int[] K(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                iArr[i11] = sparseBooleanArray.keyAt(i11);
            }
            return iArr;
        }

        private static void O(Bundle bundle, SparseArray<Map<es.w, e>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                for (Map.Entry<es.w, e> entry : sparseArray.valueAt(i11).entrySet()) {
                    e value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(F0, ru.f.n(arrayList));
                bundle.putParcelableArrayList(G0, ts.c.i(arrayList2));
                bundle.putSparseParcelableArray(H0, ts.c.j(sparseArray2));
            }
        }

        @Override // qs.y
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public a A() {
            return new a();
        }

        public boolean L(int i11) {
            return this.f106029s0.get(i11);
        }

        @Deprecated
        public e M(int i11, es.w wVar) {
            Map<es.w, e> map = this.f106028r0.get(i11);
            if (map != null) {
                return map.get(wVar);
            }
            return null;
        }

        @Deprecated
        public boolean N(int i11, es.w wVar) {
            Map<es.w, e> map = this.f106028r0.get(i11);
            return map != null && map.containsKey(wVar);
        }

        @Override // qs.y
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.f106014d0 == dVar.f106014d0 && this.f106015e0 == dVar.f106015e0 && this.f106016f0 == dVar.f106016f0 && this.f106017g0 == dVar.f106017g0 && this.f106018h0 == dVar.f106018h0 && this.f106019i0 == dVar.f106019i0 && this.f106020j0 == dVar.f106020j0 && this.f106021k0 == dVar.f106021k0 && this.f106022l0 == dVar.f106022l0 && this.f106023m0 == dVar.f106023m0 && this.f106024n0 == dVar.f106024n0 && this.f106025o0 == dVar.f106025o0 && this.f106026p0 == dVar.f106026p0 && this.f106027q0 == dVar.f106027q0 && F(this.f106029s0, dVar.f106029s0) && G(this.f106028r0, dVar.f106028r0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // qs.y
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f106014d0 ? 1 : 0)) * 31) + (this.f106015e0 ? 1 : 0)) * 31) + (this.f106016f0 ? 1 : 0)) * 31) + (this.f106017g0 ? 1 : 0)) * 31) + (this.f106018h0 ? 1 : 0)) * 31) + (this.f106019i0 ? 1 : 0)) * 31) + (this.f106020j0 ? 1 : 0)) * 31) + (this.f106021k0 ? 1 : 0)) * 31) + (this.f106022l0 ? 1 : 0)) * 31) + (this.f106023m0 ? 1 : 0)) * 31) + (this.f106024n0 ? 1 : 0)) * 31) + (this.f106025o0 ? 1 : 0)) * 31) + (this.f106026p0 ? 1 : 0)) * 31) + (this.f106027q0 ? 1 : 0);
        }

        @Override // qs.y, com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f106009v0, this.f106014d0);
            bundle.putBoolean(f106010w0, this.f106015e0);
            bundle.putBoolean(f106011x0, this.f106016f0);
            bundle.putBoolean(J0, this.f106017g0);
            bundle.putBoolean(f106012y0, this.f106018h0);
            bundle.putBoolean(f106013z0, this.f106019i0);
            bundle.putBoolean(A0, this.f106020j0);
            bundle.putBoolean(B0, this.f106021k0);
            bundle.putBoolean(K0, this.f106022l0);
            bundle.putBoolean(L0, this.f106023m0);
            bundle.putBoolean(C0, this.f106024n0);
            bundle.putBoolean(D0, this.f106025o0);
            bundle.putBoolean(E0, this.f106026p0);
            bundle.putBoolean(M0, this.f106027q0);
            O(bundle, this.f106028r0);
            bundle.putIntArray(I0, K(this.f106029s0));
            return bundle;
        }

        public static final class a extends y.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private final SparseArray<Map<es.w, e>> O;
            private final SparseBooleanArray P;

            private static SparseArray<Map<es.w, e>> e0(SparseArray<Map<es.w, e>> sparseArray) {
                SparseArray<Map<es.w, e>> sparseArray2 = new SparseArray<>();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    sparseArray2.put(sparseArray.keyAt(i11), new HashMap(sparseArray.valueAt(i11)));
                }
                return sparseArray2;
            }

            private void f0() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
                this.N = false;
            }

            private SparseBooleanArray g0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i11 : iArr) {
                    sparseBooleanArray.append(i11, true);
                }
                return sparseBooleanArray;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void z0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.F0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.G0);
                com.google.common.collect.x xVarR = parcelableArrayList == null ? com.google.common.collect.x.r() : ts.c.d(es.w.f63212f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.H0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : ts.c.e(e.f106033h, sparseParcelableArray);
                if (intArray == null || intArray.length != xVarR.size()) {
                    return;
                }
                for (int i11 = 0; i11 < intArray.length; i11++) {
                    y0(intArray[i11], (es.w) xVarR.get(i11), (e) sparseArray.get(i11));
                }
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
            public a J(int i11, boolean z11) {
                super.J(i11, z11);
                return this;
            }

            public a B0(boolean z11) {
                this.L = z11;
                return this;
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
            public a K(int i11, int i12, boolean z11) {
                super.K(i11, i12, z11);
                return this;
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
            public a L(Context context, boolean z11) {
                super.L(context, z11);
                return this;
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public d A() {
                return new d(this);
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public a B(int i11) {
                super.B(i11);
                return this;
            }

            protected a h0(y yVar) {
                super.E(yVar);
                return this;
            }

            public a i0(boolean z11) {
                this.H = z11;
                return this;
            }

            public a j0(boolean z11) {
                this.I = z11;
                return this;
            }

            public a k0(boolean z11) {
                this.F = z11;
                return this;
            }

            public a l0(boolean z11) {
                this.G = z11;
                return this;
            }

            public a m0(boolean z11) {
                this.N = z11;
                return this;
            }

            public a n0(boolean z11) {
                this.M = z11;
                return this;
            }

            public a o0(boolean z11) {
                this.D = z11;
                return this;
            }

            public a p0(boolean z11) {
                this.B = z11;
                return this;
            }

            public a q0(boolean z11) {
                this.C = z11;
                return this;
            }

            public a r0(boolean z11) {
                this.J = z11;
                return this;
            }

            public a s0(boolean z11) {
                this.E = z11;
                return this;
            }

            public a t0(boolean z11) {
                this.K = z11;
                return this;
            }

            public a u0(boolean z11) {
                this.A = z11;
                return this;
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public a F(int i11) {
                super.F(i11);
                return this;
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
            public a G(w wVar) {
                super.G(wVar);
                return this;
            }

            @Override // qs.y.a
            /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
            public a H(Context context) {
                super.H(context);
                return this;
            }

            @Deprecated
            public a y0(int i11, es.w wVar, e eVar) {
                Map<es.w, e> map = this.O.get(i11);
                if (map == null) {
                    map = new HashMap<>();
                    this.O.put(i11, map);
                }
                if (map.containsKey(wVar) && p0.c(map.get(wVar), eVar)) {
                    return this;
                }
                map.put(wVar, eVar);
                return this;
            }

            @Deprecated
            public a() {
                this.O = new SparseArray<>();
                this.P = new SparseBooleanArray();
                f0();
            }

            public a(Context context) {
                super(context);
                this.O = new SparseArray<>();
                this.P = new SparseBooleanArray();
                f0();
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.f106014d0;
                this.B = dVar.f106015e0;
                this.C = dVar.f106016f0;
                this.D = dVar.f106017g0;
                this.E = dVar.f106018h0;
                this.F = dVar.f106019i0;
                this.G = dVar.f106020j0;
                this.H = dVar.f106021k0;
                this.I = dVar.f106022l0;
                this.J = dVar.f106023m0;
                this.K = dVar.f106024n0;
                this.L = dVar.f106025o0;
                this.M = dVar.f106026p0;
                this.N = dVar.f106027q0;
                this.O = e0(dVar.f106028r0);
                this.P = dVar.f106029s0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                f0();
                d dVar = d.f106007t0;
                u0(bundle.getBoolean(d.f106009v0, dVar.f106014d0));
                p0(bundle.getBoolean(d.f106010w0, dVar.f106015e0));
                q0(bundle.getBoolean(d.f106011x0, dVar.f106016f0));
                o0(bundle.getBoolean(d.J0, dVar.f106017g0));
                s0(bundle.getBoolean(d.f106012y0, dVar.f106018h0));
                k0(bundle.getBoolean(d.f106013z0, dVar.f106019i0));
                l0(bundle.getBoolean(d.A0, dVar.f106020j0));
                i0(bundle.getBoolean(d.B0, dVar.f106021k0));
                j0(bundle.getBoolean(d.K0, dVar.f106022l0));
                r0(bundle.getBoolean(d.L0, dVar.f106023m0));
                t0(bundle.getBoolean(d.C0, dVar.f106024n0));
                B0(bundle.getBoolean(d.D0, dVar.f106025o0));
                n0(bundle.getBoolean(d.E0, dVar.f106026p0));
                m0(bundle.getBoolean(d.M0, dVar.f106027q0));
                this.O = new SparseArray<>();
                z0(bundle);
                this.P = g0(bundle.getIntArray(d.I0));
            }
        }

        private d(a aVar) {
            super(aVar);
            this.f106014d0 = aVar.A;
            this.f106015e0 = aVar.B;
            this.f106016f0 = aVar.C;
            this.f106017g0 = aVar.D;
            this.f106018h0 = aVar.E;
            this.f106019i0 = aVar.F;
            this.f106020j0 = aVar.G;
            this.f106021k0 = aVar.H;
            this.f106022l0 = aVar.I;
            this.f106023m0 = aVar.J;
            this.f106024n0 = aVar.K;
            this.f106025o0 = aVar.L;
            this.f106026p0 = aVar.M;
            this.f106027q0 = aVar.N;
            this.f106028r0 = aVar.O;
            this.f106029s0 = aVar.P;
        }
    }

    public static final class e implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f106030e = p0.t0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f106031f = p0.t0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f106032g = p0.t0(2);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<e> f106033h = new com.google.android.exoplayer2.g.a() { // from class: qs.o
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return m.e.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f106035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f106037d;

        public e(int i11, int[] iArr, int i12) {
            this.f106034a = i11;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f106035b = iArrCopyOf;
            this.f106036c = iArr.length;
            this.f106037d = i12;
            Arrays.sort(iArrCopyOf);
        }

        public static /* synthetic */ e a(Bundle bundle) {
            int i11 = bundle.getInt(f106030e, -1);
            int[] intArray = bundle.getIntArray(f106031f);
            int i12 = bundle.getInt(f106032g, -1);
            ts.a.a(i11 >= 0 && i12 >= 0);
            ts.a.e(intArray);
            return new e(i11, intArray, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f106034a == eVar.f106034a && Arrays.equals(this.f106035b, eVar.f106035b) && this.f106037d == eVar.f106037d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f106034a * 31) + Arrays.hashCode(this.f106035b)) * 31) + this.f106037d;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f106030e, this.f106034a);
            bundle.putIntArray(f106031f, this.f106035b);
            bundle.putInt(f106032g, this.f106037d);
            return bundle;
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Spatializer f106038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f106039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f106040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f106041d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f106042a;

            a(m mVar) {
                this.f106042a = mVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z11) {
                this.f106042a.Q();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z11) {
                this.f106042a.Q();
            }
        }

        private f(Spatializer spatializer) {
            this.f106038a = spatializer;
            this.f106039b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(com.google.android.exoplayer2.audio.a aVar, u0 u0Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(p0.F(("audio/eac3-joc".equals(u0Var.f40712l) && u0Var.f40725y == 16) ? 12 : u0Var.f40725y));
            int i11 = u0Var.f40726z;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f106038a.canBeSpatialized(aVar.b().f39515a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f106041d == null && this.f106040c == null) {
                this.f106041d = new a(mVar);
                Handler handler = new Handler(looper);
                this.f106040c = handler;
                Spatializer spatializer = this.f106038a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new b8.t(handler), this.f106041d);
            }
        }

        public boolean c() {
            return this.f106038a.isAvailable();
        }

        public boolean d() {
            return this.f106038a.isEnabled();
        }

        public boolean e() {
            return this.f106039b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f106041d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f106040c == null) {
                return;
            }
            this.f106038a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) p0.j(this.f106040c)).removeCallbacksAndMessages(null);
            this.f106040c = null;
            this.f106041d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g extends h<g> implements Comparable<g> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f106044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f106045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f106046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f106047h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f106048i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f106049j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f106050k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f106051l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f106052m;

        public g(int i11, es.u uVar, int i12, d dVar, int i13, String str) {
            int iG;
            super(i11, uVar, i12);
            int i14 = 0;
            this.f106045f = m.O(i13, false);
            int i15 = this.f106056d.f40704d & (~dVar.f106112u);
            this.f106046g = (i15 & 1) != 0;
            this.f106047h = (i15 & 2) != 0;
            com.google.common.collect.x<String> xVarS = dVar.f106110s.isEmpty() ? com.google.common.collect.x.s("") : dVar.f106110s;
            int i16 = 0;
            while (true) {
                if (i16 >= xVarS.size()) {
                    i16 = Integer.MAX_VALUE;
                    iG = 0;
                    break;
                } else {
                    iG = m.G(this.f106056d, xVarS.get(i16), dVar.f106113v);
                    if (iG > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f106048i = i16;
            this.f106049j = iG;
            int iK = m.K(this.f106056d.f40705e, dVar.f106111t);
            this.f106050k = iK;
            this.f106052m = (this.f106056d.f40705e & 1088) != 0;
            int iG2 = m.G(this.f106056d, str, m.S(str) == null);
            this.f106051l = iG2;
            boolean z11 = iG > 0 || (dVar.f106110s.isEmpty() && iK > 0) || this.f106046g || (this.f106047h && iG2 > 0);
            if (m.O(i13, dVar.f106024n0) && z11) {
                i14 = 1;
            }
            this.f106044e = i14;
        }

        public static int c(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static com.google.common.collect.x<g> e(int i11, es.u uVar, d dVar, int[] iArr, String str) {
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i12 = 0; i12 < uVar.f63205a; i12++) {
                aVarK.a(new g(i11, uVar, i12, dVar, iArr[i12], str));
            }
            return aVarK.k();
        }

        @Override // qs.m.h
        public int a() {
            return this.f106044e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            com.google.common.collect.p pVarD = com.google.common.collect.p.j().g(this.f106045f, gVar.f106045f).f(Integer.valueOf(this.f106048i), Integer.valueOf(gVar.f106048i), r0.f().l()).d(this.f106049j, gVar.f106049j).d(this.f106050k, gVar.f106050k).g(this.f106046g, gVar.f106046g).f(Boolean.valueOf(this.f106047h), Boolean.valueOf(gVar.f106047h), this.f106049j == 0 ? r0.f() : r0.f().l()).d(this.f106051l, gVar.f106051l);
            if (this.f106050k == 0) {
                pVarD = pVarD.h(this.f106052m, gVar.f106052m);
            }
            return pVarD.i();
        }

        @Override // qs.m.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class h<T extends h<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final es.u f106054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u0 f106056d;

        public interface a<T extends h<T>> {
            List<T> a(int i11, es.u uVar, int[] iArr);
        }

        public h(int i11, es.u uVar, int i12) {
            this.f106053a = i11;
            this.f106054b = uVar;
            this.f106055c = i12;
            this.f106056d = uVar.c(i12);
        }

        public abstract int a();

        public abstract boolean b(T t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i extends h<i> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f106057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d f106058f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f106059g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f106060h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f106061i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f106062j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f106063k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f106064l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f106065m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f106066n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f106067o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f106068p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f106069q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f106070r;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public i(int i11, es.u uVar, int i12, d dVar, int i13, int i14, boolean z11) {
            boolean z12;
            boolean z13;
            u0 u0Var;
            int i15;
            int i16;
            int i17;
            u0 u0Var2;
            int i18;
            int i19;
            int i21;
            super(i11, uVar, i12);
            this.f106058f = dVar;
            int i22 = dVar.f106016f0 ? 24 : 16;
            this.f106066n = dVar.f106015e0 && (i14 & i22) != 0;
            if (!z11 || (((i18 = (u0Var2 = this.f106056d).f40717q) != -1 && i18 > dVar.f106092a) || ((i19 = u0Var2.f40718r) != -1 && i19 > dVar.f106093b))) {
                z12 = false;
            } else {
                float f11 = u0Var2.f40719s;
                if ((f11 == -1.0f || f11 <= dVar.f106094c) && ((i21 = u0Var2.f40708h) == -1 || i21 <= dVar.f106095d)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f106057e = z12;
            if (!z11 || (((i15 = (u0Var = this.f106056d).f40717q) != -1 && i15 < dVar.f106096e) || ((i16 = u0Var.f40718r) != -1 && i16 < dVar.f106097f))) {
                z13 = false;
            } else {
                float f12 = u0Var.f40719s;
                if ((f12 == -1.0f || f12 >= dVar.f106098g) && ((i17 = u0Var.f40708h) == -1 || i17 >= dVar.f106099h)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            this.f106059g = z13;
            this.f106060h = m.O(i13, false);
            u0 u0Var3 = this.f106056d;
            this.f106061i = u0Var3.f40708h;
            this.f106062j = u0Var3.f();
            this.f106064l = m.K(this.f106056d.f40705e, dVar.f106104m);
            int i23 = this.f106056d.f40705e;
            this.f106065m = i23 == 0 || (i23 & 1) != 0;
            int i24 = 0;
            while (true) {
                if (i24 >= dVar.f106103l.size()) {
                    i24 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.f106056d.f40712l;
                if (str != null && str.equals(dVar.f106103l.get(i24))) {
                    break;
                } else {
                    i24++;
                }
            }
            this.f106063k = i24;
            this.f106068p = a2.s(i13) == 128;
            this.f106069q = a2.m(i13) == 64;
            this.f106070r = m.L(this.f106056d.f40712l);
            this.f106067o = i(i13, i22);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int e(i iVar, i iVar2) {
            com.google.common.collect.p pVarG = com.google.common.collect.p.j().g(iVar.f106060h, iVar2.f106060h).d(iVar.f106064l, iVar2.f106064l).g(iVar.f106065m, iVar2.f106065m).g(iVar.f106057e, iVar2.f106057e).g(iVar.f106059g, iVar2.f106059g).f(Integer.valueOf(iVar.f106063k), Integer.valueOf(iVar2.f106063k), r0.f().l()).g(iVar.f106068p, iVar2.f106068p).g(iVar.f106069q, iVar2.f106069q);
            if (iVar.f106068p && iVar.f106069q) {
                pVarG = pVarG.d(iVar.f106070r, iVar2.f106070r);
            }
            return pVarG.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int f(i iVar, i iVar2) {
            r0 r0VarL = (iVar.f106057e && iVar.f106060h) ? m.f105978k : m.f105978k.l();
            return com.google.common.collect.p.j().f(Integer.valueOf(iVar.f106061i), Integer.valueOf(iVar2.f106061i), iVar.f106058f.f106114w ? m.f105978k.l() : m.f105979l).f(Integer.valueOf(iVar.f106062j), Integer.valueOf(iVar2.f106062j), r0VarL).f(Integer.valueOf(iVar.f106061i), Integer.valueOf(iVar2.f106061i), r0VarL).i();
        }

        public static int g(List<i> list, List<i> list2) {
            return com.google.common.collect.p.j().f((i) Collections.max(list, new Comparator() { // from class: qs.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: qs.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }), new Comparator() { // from class: qs.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }).d(list.size(), list2.size()).f((i) Collections.max(list, new Comparator() { // from class: qs.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: qs.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }), new Comparator() { // from class: qs.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }).i();
        }

        public static com.google.common.collect.x<i> h(int i11, es.u uVar, d dVar, int[] iArr, int i12) {
            int iH = m.H(uVar, dVar.f106100i, dVar.f106101j, dVar.f106102k);
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i13 = 0; i13 < uVar.f63205a; i13++) {
                int iF = uVar.c(i13).f();
                aVarK.a(new i(i11, uVar, i13, dVar, iArr[i13], i12, iH == Integer.MAX_VALUE || (iF != -1 && iF <= iH)));
            }
            return aVarK.k();
        }

        private int i(int i11, int i12) {
            if ((this.f106056d.f40705e & 16384) != 0 || !m.O(i11, this.f106058f.f106024n0)) {
                return 0;
            }
            if (!this.f106057e && !this.f106058f.f106014d0) {
                return 0;
            }
            if (!m.O(i11, false) || !this.f106059g || !this.f106057e || this.f106056d.f40708h == -1) {
                return 1;
            }
            d dVar = this.f106058f;
            return (dVar.f106115x || dVar.f106114w || (i11 & i12) == 0) ? 1 : 2;
        }

        @Override // qs.m.h
        public int a() {
            return this.f106067o;
        }

        @Override // qs.m.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean b(i iVar) {
            if (!this.f106066n && !p0.c(this.f106056d.f40712l, iVar.f106056d.f40712l)) {
                return false;
            }
            if (this.f106058f.f106017g0) {
                return true;
            }
            return this.f106068p == iVar.f106068p && this.f106069q == iVar.f106069q;
        }
    }

    public m(Context context) {
        this(context, new qs.a.b());
    }

    private static void D(t.a aVar, d dVar, r.a[] aVarArr) {
        int iD = aVar.d();
        for (int i11 = 0; i11 < iD; i11++) {
            es.w wVarF = aVar.f(i11);
            if (dVar.N(i11, wVarF)) {
                e eVarM = dVar.M(i11, wVarF);
                aVarArr[i11] = (eVarM == null || eVarM.f106035b.length == 0) ? null : new r.a(wVarF.b(eVarM.f106034a), eVarM.f106035b, eVarM.f106037d);
            }
        }
    }

    private static void E(t.a aVar, y yVar, r.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < iD; i11++) {
            F(aVar.f(i11), yVar, map);
        }
        F(aVar.h(), yVar, map);
        for (int i12 = 0; i12 < iD; i12++) {
            w wVar = (w) map.get(Integer.valueOf(aVar.e(i12)));
            if (wVar != null) {
                aVarArr[i12] = (wVar.f106088b.isEmpty() || aVar.f(i12).c(wVar.f106087a) == -1) ? null : new r.a(wVar.f106087a, ru.f.n(wVar.f106088b));
            }
        }
    }

    private static void F(es.w wVar, y yVar, Map<Integer, w> map) {
        w wVar2;
        for (int i11 = 0; i11 < wVar.f63213a; i11++) {
            w wVar3 = yVar.f106116y.get(wVar.b(i11));
            if (wVar3 != null && ((wVar2 = map.get(Integer.valueOf(wVar3.b()))) == null || (wVar2.f106088b.isEmpty() && !wVar3.f106088b.isEmpty()))) {
                map.put(Integer.valueOf(wVar3.b()), wVar3);
            }
        }
    }

    protected static int G(u0 u0Var, String str, boolean z11) {
        if (!TextUtils.isEmpty(str) && str.equals(u0Var.f40703c)) {
            return 4;
        }
        String strS = S(str);
        String strS2 = S(u0Var.f40703c);
        if (strS2 == null || strS == null) {
            return (z11 && strS2 == null) ? 1 : 0;
        }
        if (strS2.startsWith(strS) || strS.startsWith(strS2)) {
            return 3;
        }
        return p0.Q0(strS2, "-")[0].equals(p0.Q0(strS, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(es.u uVar, int i11, int i12, boolean z11) {
        int i13;
        int i14 = Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
            for (int i15 = 0; i15 < uVar.f63205a; i15++) {
                u0 u0VarC = uVar.c(i15);
                int i16 = u0VarC.f40717q;
                if (i16 > 0 && (i13 = u0VarC.f40718r) > 0) {
                    Point pointI = I(z11, i11, i12, i16, i13);
                    int i17 = u0VarC.f40717q;
                    int i18 = u0VarC.f40718r;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (pointI.x * 0.98f)) && i18 >= ((int) (pointI.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
        }
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    private static Point I(boolean z11, int i11, int i12, int i13, int i14) {
        if (z11) {
            if ((i13 > i14) == (i11 > i12)) {
                i12 = i11;
                i11 = i12;
            }
        } else {
            i12 = i11;
            i11 = i12;
        }
        int i15 = i13 * i11;
        int i16 = i14 * i12;
        return i15 >= i16 ? new Point(i12, p0.l(i16, i13)) : new Point(p0.l(i15, i14), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(int i11, int i12) {
        if (i11 == 0 || i11 != i12) {
            return Integer.bitCount(i11 & i12);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(String str) {
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
    public boolean M(u0 u0Var) {
        boolean z11;
        f fVar;
        f fVar2;
        synchronized (this.f105980d) {
            try {
                if (this.f105984h.f106023m0 && !this.f105983g && u0Var.f40725y > 2 && (!N(u0Var) || (p0.f115040a >= 32 && (fVar2 = this.f105985i) != null && fVar2.e()))) {
                    z11 = p0.f115040a >= 32 && (fVar = this.f105985i) != null && fVar.e() && this.f105985i.c() && this.f105985i.d() && this.f105985i.a(this.f105986j, u0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    private static boolean N(u0 u0Var) {
        String str = u0Var.f40712l;
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

    protected static boolean O(int i11, boolean z11) {
        int iQ = a2.q(i11);
        if (iQ != 4) {
            return z11 && iQ == 3;
        }
        return true;
    }

    private static void P(t.a aVar, int[][][] iArr, j0[] j0VarArr, r[] rVarArr) {
        boolean z11;
        boolean z12 = false;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            if (i13 >= aVar.d()) {
                z11 = true;
                break;
            }
            int iE = aVar.e(i13);
            r rVar = rVarArr[i13];
            if ((iE == 1 || iE == 2) && rVar != null && T(iArr[i13], aVar.f(i13), rVar)) {
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
        if (i12 != -1 && i11 != -1) {
            z12 = true;
        }
        if (z11 && z12) {
            j0 j0Var = new j0(true);
            j0VarArr[i12] = j0Var;
            j0VarArr[i11] = j0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        boolean z11;
        f fVar;
        synchronized (this.f105980d) {
            try {
                z11 = this.f105984h.f106023m0 && !this.f105983g && p0.f115040a >= 32 && (fVar = this.f105985i) != null && fVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            f();
        }
    }

    private void R(z1 z1Var) {
        boolean z11;
        synchronized (this.f105980d) {
            z11 = this.f105984h.f106027q0;
        }
        if (z11) {
            g(z1Var);
        }
    }

    protected static String S(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean T(int[][] iArr, es.w wVar, r rVar) {
        if (rVar == null) {
            return false;
        }
        int iC = wVar.c(rVar.e());
        for (int i11 = 0; i11 < rVar.length(); i11++) {
            if (a2.v(iArr[iC][rVar.b(i11)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<r.a, Integer> Y(int i11, t.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i12;
        RandomAccess randomAccessS;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i13 = 0;
        while (i13 < iD) {
            if (i11 == aVar3.e(i13)) {
                es.w wVarF = aVar3.f(i13);
                for (int i14 = 0; i14 < wVarF.f63213a; i14++) {
                    es.u uVarB = wVarF.b(i14);
                    List<T> listA = aVar2.a(i13, uVarB, iArr[i13][i14]);
                    boolean[] zArr = new boolean[uVarB.f63205a];
                    int i15 = 0;
                    while (i15 < uVarB.f63205a) {
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
                                while (i16 < uVarB.f63205a) {
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
            iArr2[i18] = ((h) list.get(i18)).f106055c;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new r.a(hVar.f106054b, iArr2), Integer.valueOf(hVar.f106053a));
    }

    private void a0(d dVar) {
        boolean zEquals;
        ts.a.e(dVar);
        synchronized (this.f105980d) {
            zEquals = this.f105984h.equals(dVar);
            this.f105984h = dVar;
        }
        if (zEquals) {
            return;
        }
        if (dVar.f106023m0 && this.f105981e == null) {
            ts.u.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    public static /* synthetic */ int t(Integer num, Integer num2) {
        return 0;
    }

    public static /* synthetic */ int u(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ List w(final m mVar, d dVar, boolean z11, int i11, es.u uVar, int[] iArr) {
        mVar.getClass();
        return b.e(i11, uVar, dVar, iArr, z11, new ou.q() { // from class: qs.l
            @Override // ou.q
            public final boolean apply(Object obj) {
                return this.f105977a.M((u0) obj);
            }
        });
    }

    @Override // qs.a0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public d c() {
        d dVar;
        synchronized (this.f105980d) {
            dVar = this.f105984h;
        }
        return dVar;
    }

    protected r.a[] U(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int iD = aVar.d();
        r.a[] aVarArr = new r.a[iD];
        Pair<r.a, Integer> pairZ = Z(aVar, iArr, iArr2, dVar);
        if (pairZ != null) {
            aVarArr[((Integer) pairZ.second).intValue()] = (r.a) pairZ.first;
        }
        Pair<r.a, Integer> pairV = V(aVar, iArr, iArr2, dVar);
        if (pairV != null) {
            aVarArr[((Integer) pairV.second).intValue()] = (r.a) pairV.first;
        }
        if (pairV == null) {
            str = null;
        } else {
            Object obj = pairV.first;
            str = ((r.a) obj).f106071a.c(((r.a) obj).f106072b[0]).f40703c;
        }
        Pair<r.a, Integer> pairX = X(aVar, iArr, dVar, str);
        if (pairX != null) {
            aVarArr[((Integer) pairX.second).intValue()] = (r.a) pairX.first;
        }
        for (int i11 = 0; i11 < iD; i11++) {
            int iE = aVar.e(i11);
            if (iE != 2 && iE != 1 && iE != 3) {
                aVarArr[i11] = W(iE, aVar.f(i11), iArr[i11], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair<r.a, Integer> V(t.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z11 = false;
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            if (2 == aVar.e(i11) && aVar.f(i11).f63213a > 0) {
                z11 = true;
                break;
            }
        }
        return Y(1, aVar, iArr, new h.a() { // from class: qs.h
            @Override // qs.m.h.a
            public final List a(int i12, es.u uVar, int[] iArr3) {
                return m.w(this.f105972a, dVar, z11, i12, uVar, iArr3);
            }
        }, new Comparator() { // from class: qs.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.c((List) obj, (List) obj2);
            }
        });
    }

    protected r.a W(int i11, es.w wVar, int[][] iArr, d dVar) {
        es.u uVar = null;
        c cVar = null;
        int i12 = 0;
        for (int i13 = 0; i13 < wVar.f63213a; i13++) {
            es.u uVarB = wVar.b(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < uVarB.f63205a; i14++) {
                if (O(iArr2[i14], dVar.f106024n0)) {
                    c cVar2 = new c(uVarB.c(i14), iArr2[i14]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        uVar = uVarB;
                        i12 = i14;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (uVar == null) {
            return null;
        }
        return new r.a(uVar, i12);
    }

    protected Pair<r.a, Integer> X(t.a aVar, int[][][] iArr, final d dVar, final String str) {
        return Y(3, aVar, iArr, new h.a() { // from class: qs.j
            @Override // qs.m.h.a
            public final List a(int i11, es.u uVar, int[] iArr2) {
                return m.g.e(i11, uVar, dVar, iArr2, str);
            }
        }, new Comparator() { // from class: qs.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.g.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<r.a, Integer> Z(t.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return Y(2, aVar, iArr, new h.a() { // from class: qs.f
            @Override // qs.m.h.a
            public final List a(int i11, es.u uVar, int[] iArr3) {
                return m.i.h(i11, uVar, dVar, iArr3, iArr2[i11]);
            }
        }, new Comparator() { // from class: qs.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.i.g((List) obj, (List) obj2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.a2.a
    public void a(z1 z1Var) {
        R(z1Var);
    }

    @Override // qs.a0
    public boolean h() {
        return true;
    }

    @Override // qs.a0
    public void j() {
        f fVar;
        synchronized (this.f105980d) {
            try {
                if (p0.f115040a >= 32 && (fVar = this.f105985i) != null) {
                    fVar.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.j();
    }

    @Override // qs.a0
    public void l(com.google.android.exoplayer2.audio.a aVar) {
        boolean zEquals;
        synchronized (this.f105980d) {
            zEquals = this.f105986j.equals(aVar);
            this.f105986j = aVar;
        }
        if (zEquals) {
            return;
        }
        Q();
    }

    @Override // qs.a0
    public void m(y yVar) {
        if (yVar instanceof d) {
            a0((d) yVar);
        }
        a0(new d.a().h0(yVar).A());
    }

    @Override // qs.t
    protected final Pair<j0[], r[]> q(t.a aVar, int[][][] iArr, int[] iArr2, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var) {
        d dVar;
        f fVar;
        synchronized (this.f105980d) {
            try {
                dVar = this.f105984h;
                if (dVar.f106023m0 && p0.f115040a >= 32 && (fVar = this.f105985i) != null) {
                    fVar.b(this, (Looper) ts.a.i(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iD = aVar.d();
        r.a[] aVarArrU = U(aVar, iArr, iArr2, dVar);
        E(aVar, dVar, aVarArrU);
        D(aVar, dVar, aVarArrU);
        for (int i11 = 0; i11 < iD; i11++) {
            int iE = aVar.e(i11);
            if (dVar.L(i11) || dVar.f106117z.contains(Integer.valueOf(iE))) {
                aVarArrU[i11] = null;
            }
        }
        r[] rVarArrA = this.f105982f.a(aVarArrU, b(), bVar, f2Var);
        j0[] j0VarArr = new j0[iD];
        for (int i12 = 0; i12 < iD; i12++) {
            j0VarArr[i12] = (dVar.L(i12) || dVar.f106117z.contains(Integer.valueOf(aVar.e(i12))) || (aVar.e(i12) != -2 && rVarArrA[i12] == null)) ? null : j0.f17929b;
        }
        if (dVar.f106025o0) {
            P(aVar, iArr, j0VarArr, rVarArrA);
        }
        return Pair.create(j0VarArr, rVarArrA);
    }

    public m(Context context, r.b bVar) {
        this(context, d.J(context), bVar);
    }

    public m(Context context, y yVar, r.b bVar) {
        this(yVar, bVar, context);
    }

    private m(y yVar, r.b bVar, Context context) {
        this.f105980d = new Object();
        this.f105981e = context != null ? context.getApplicationContext() : null;
        this.f105982f = bVar;
        if (yVar instanceof d) {
            this.f105984h = (d) yVar;
        } else {
            this.f105984h = (context == null ? d.f106007t0 : d.J(context)).A().h0(yVar).A();
        }
        this.f105986j = com.google.android.exoplayer2.audio.a.f39502g;
        boolean z11 = context != null && p0.z0(context);
        this.f105983g = z11;
        if (!z11 && context != null && p0.f115040a >= 32) {
            this.f105985i = f.g(context);
        }
        if (this.f105984h.f106023m0 && context == null) {
            ts.u.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // qs.a0
    public a2.a d() {
        return this;
    }
}
