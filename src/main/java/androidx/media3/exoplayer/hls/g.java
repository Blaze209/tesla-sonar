package androidx.media3.exoplayer.hls;

import a8.o2;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.g0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n8.y;
import p7.f0;
import p7.n;
import p7.t0;
import p7.u;
import p7.x;
import r8.t;
import s7.q0;
import z7.b0;

/* JADX INFO: loaded from: classes3.dex */
final class g implements q, HlsPlaylistTracker.b {
    private g0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f8.e f9997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HlsPlaylistTracker f9998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f8.d f9999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v7.q f10000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s8.e f10001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f10002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f10003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s.a f10005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final s8.b f10006j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final n8.e f10009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f10011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f10012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o2 f10013q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f10015s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q.a f10016t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f10017u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private y f10018v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f10022z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l.b f10014r = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IdentityHashMap<n8.s, Integer> f10007k = new IdentityHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f8.i f10008l = new f8.i();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private l[] f10019w = new l[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l[] f10020x = new l[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int[][] f10021y = new int[0][];

    private class b implements l.b {
        private b() {
        }

        @Override // androidx.media3.exoplayer.hls.l.b
        public void a() {
            if (g.j(g.this) > 0) {
                return;
            }
            int i11 = 0;
            for (l lVar : g.this.f10019w) {
                i11 += lVar.k().f93615a;
            }
            t0[] t0VarArr = new t0[i11];
            int i12 = 0;
            for (l lVar2 : g.this.f10019w) {
                int i13 = lVar2.k().f93615a;
                int i14 = 0;
                while (i14 < i13) {
                    t0VarArr[i12] = lVar2.k().b(i14);
                    i14++;
                    i12++;
                }
            }
            g.this.f10018v = new y(t0VarArr);
            g.this.f10016t.i(g.this);
        }

        @Override // androidx.media3.exoplayer.source.g0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(l lVar) {
            g.this.f10016t.j(g.this);
        }

        @Override // androidx.media3.exoplayer.hls.l.b
        public void p(Uri uri) {
            g.this.f9998b.h(uri);
        }
    }

    public g(f8.e eVar, HlsPlaylistTracker hlsPlaylistTracker, f8.d dVar, v7.q qVar, s8.e eVar2, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar, androidx.media3.exoplayer.upstream.b bVar, s.a aVar2, s8.b bVar2, n8.e eVar3, boolean z11, int i11, boolean z12, o2 o2Var, long j11) {
        this.f9997a = eVar;
        this.f9998b = hlsPlaylistTracker;
        this.f9999c = dVar;
        this.f10000d = qVar;
        this.f10001e = eVar2;
        this.f10002f = iVar;
        this.f10003g = aVar;
        this.f10004h = bVar;
        this.f10005i = aVar2;
        this.f10006j = bVar2;
        this.f10009m = eVar3;
        this.f10010n = z11;
        this.f10011o = i11;
        this.f10012p = z12;
        this.f10013q = o2Var;
        this.f10015s = j11;
        this.A = eVar3.empty();
    }

    private static u A(u uVar, u uVar2, boolean z11) {
        f0 f0Var;
        int i11;
        String str;
        String str2;
        List<x> list;
        int i12;
        int i13;
        String str3;
        com.google.common.collect.x xVarR = com.google.common.collect.x.r();
        if (uVar2 != null) {
            str2 = uVar2.f101540k;
            f0Var = uVar2.f101541l;
            i12 = uVar2.G;
            i11 = uVar2.f101534e;
            i13 = uVar2.f101535f;
            str = uVar2.f101533d;
            str3 = uVar2.f101531b;
            list = uVar2.f101532c;
        } else {
            String strY = q0.Y(uVar.f101540k, 1);
            f0Var = uVar.f101541l;
            if (z11) {
                i12 = uVar.G;
                i11 = uVar.f101534e;
                i13 = uVar.f101535f;
                str = uVar.f101533d;
                str3 = uVar.f101531b;
                str2 = strY;
                list = uVar.f101532c;
            } else {
                i11 = 0;
                str = null;
                str2 = strY;
                list = xVarR;
                i12 = -1;
                i13 = 0;
                str3 = null;
            }
        }
        return new u.b().j0(uVar.f101530a).l0(str3).m0(list).W(uVar.f101543n).y0(p7.g0.g(str2)).U(str2).r0(f0Var).S(z11 ? uVar.f101537h : -1).t0(z11 ? uVar.f101538i : -1).T(i12).A0(i11).w0(i13).n0(str).P();
    }

    private static Map<String, n> B(List<n> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            n nVarJ = list.get(i11);
            String str = nVarJ.f101432c;
            i11++;
            int i12 = i11;
            while (i12 < arrayList.size()) {
                n nVar = (n) arrayList.get(i12);
                if (TextUtils.equals(nVar.f101432c, str)) {
                    nVarJ = nVarJ.j(nVar);
                    arrayList.remove(i12);
                } else {
                    i12++;
                }
            }
            map.put(str, nVarJ);
        }
        return map;
    }

    private static u C(u uVar) {
        String strY = q0.Y(uVar.f101540k, 2);
        return new u.b().j0(uVar.f101530a).l0(uVar.f101531b).m0(uVar.f101532c).W(uVar.f101543n).y0(p7.g0.g(strY)).U(strY).r0(uVar.f101541l).S(uVar.f101537h).t0(uVar.f101538i).F0(uVar.f101551v).h0(uVar.f101552w).f0(uVar.f101555z).A0(uVar.f101534e).w0(uVar.f101535f).P();
    }

    static /* synthetic */ int j(g gVar) {
        int i11 = gVar.f10017u - 1;
        gVar.f10017u = i11;
        return i11;
    }

    private void v(long j11, List<androidx.media3.exoplayer.hls.playlist.d.a> list, List<l> list2, List<int[]> list3, Map<String, n> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11).f10245d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z11 = true;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (Objects.equals(str, list.get(i12).f10245d)) {
                        androidx.media3.exoplayer.hls.playlist.d.a aVar = list.get(i12);
                        arrayList3.add(Integer.valueOf(i12));
                        arrayList.add(aVar.f10242a);
                        arrayList2.add(aVar.f10243b);
                        z11 &= q0.X(aVar.f10243b.f101540k, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                l lVarZ = z(str2, 1, (Uri[]) arrayList.toArray((Uri[]) q0.m(new Uri[0])), (u[]) arrayList2.toArray(new u[0]), null, Collections.EMPTY_LIST, map, j11);
                list3.add(ru.f.n(arrayList3));
                list2.add(lVarZ);
                if (this.f10010n && z11) {
                    lVarZ.h0(new t0[]{new t0(str2, (u[]) arrayList2.toArray(new u[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void w(androidx.media3.exoplayer.hls.playlist.d dVar, long j11, List<l> list, List<int[]> list2, Map<String, n> map) {
        int i11;
        boolean z11;
        boolean z12;
        int size = dVar.f10233e.size();
        int[] iArr = new int[size];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < dVar.f10233e.size(); i14++) {
            u uVar = dVar.f10233e.get(i14).f10247b;
            if (uVar.f101552w > 0 || q0.Y(uVar.f101540k, 2) != null) {
                iArr[i14] = 2;
                i12++;
            } else if (q0.Y(uVar.f101540k, 1) != null) {
                iArr[i14] = 1;
                i13++;
            } else {
                iArr[i14] = -1;
            }
        }
        if (i12 > 0) {
            i11 = i12;
            z12 = false;
            z11 = true;
        } else if (i13 < size) {
            i11 = size - i13;
            z11 = false;
            z12 = true;
        } else {
            i11 = size;
            z11 = false;
            z12 = false;
        }
        Uri[] uriArr = new Uri[i11];
        u[] uVarArr = new u[i11];
        int[] iArr2 = new int[i11];
        int i15 = 0;
        for (int i16 = 0; i16 < dVar.f10233e.size(); i16++) {
            if ((!z11 || iArr[i16] == 2) && (!z12 || iArr[i16] != 1)) {
                androidx.media3.exoplayer.hls.playlist.d.b bVar = dVar.f10233e.get(i16);
                uriArr[i15] = bVar.f10246a;
                uVarArr[i15] = bVar.f10247b;
                iArr2[i15] = i16;
                i15++;
            }
        }
        String str = uVarArr[0].f101540k;
        int iX = q0.X(str, 2);
        int iX2 = q0.X(str, 1);
        boolean z13 = (iX2 == 1 || (iX2 == 0 && dVar.f10235g.isEmpty())) && iX <= 1 && iX2 + iX > 0;
        l lVarZ = z("main", (z11 || iX2 <= 0) ? 0 : 1, uriArr, uVarArr, dVar.f10238j, dVar.f10239k, map, j11);
        list.add(lVarZ);
        list2.add(iArr2);
        if (this.f10010n && z13) {
            ArrayList arrayList = new ArrayList();
            if (iX > 0) {
                u[] uVarArr2 = new u[i11];
                for (int i17 = 0; i17 < i11; i17++) {
                    uVarArr2[i17] = C(uVarArr[i17]);
                }
                arrayList.add(new t0("main", uVarArr2));
                if (iX2 > 0 && (dVar.f10238j != null || dVar.f10235g.isEmpty())) {
                    arrayList.add(new t0("main:audio", A(uVarArr[0], dVar.f10238j, false)));
                }
                List<u> list3 = dVar.f10239k;
                if (list3 != null) {
                    for (int i18 = 0; i18 < list3.size(); i18++) {
                        arrayList.add(new t0("main:cc:" + i18, this.f9997a.d(list3.get(i18))));
                    }
                }
            } else {
                u[] uVarArr3 = new u[i11];
                for (int i19 = 0; i19 < i11; i19++) {
                    uVarArr3[i19] = A(uVarArr[i19], dVar.f10238j, true);
                }
                arrayList.add(new t0("main", uVarArr3));
            }
            t0 t0Var = new t0("main:id3", new u.b().j0("ID3").y0("application/id3").P());
            arrayList.add(t0Var);
            lVarZ.h0((t0[]) arrayList.toArray(new t0[0]), 0, arrayList.indexOf(t0Var));
        }
    }

    private void x(long j11) {
        long j12;
        androidx.media3.exoplayer.hls.playlist.d dVar = (androidx.media3.exoplayer.hls.playlist.d) s7.a.f(this.f9998b.g());
        Map<String, n> mapB = this.f10012p ? B(dVar.f10241m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = dVar.f10233e.isEmpty();
        List<androidx.media3.exoplayer.hls.playlist.d.a> list = dVar.f10235g;
        List<androidx.media3.exoplayer.hls.playlist.d.a> list2 = dVar.f10236h;
        this.f10017u = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (zIsEmpty) {
            j12 = j11;
        } else {
            w(dVar, j11, arrayList, arrayList2, mapB);
            arrayList = arrayList;
            j12 = j11;
        }
        v(j12, list, arrayList, arrayList2, mapB);
        this.f10022z = arrayList.size();
        y(j12, list2, arrayList, arrayList2, mapB);
        this.f10019w = (l[]) arrayList.toArray(new l[0]);
        this.f10021y = (int[][]) arrayList2.toArray(new int[0][]);
        this.f10017u = this.f10019w.length;
        for (int i11 = 0; i11 < this.f10022z; i11++) {
            this.f10019w[i11].q0(true);
        }
        for (l lVar : this.f10019w) {
            lVar.D();
        }
        this.f10020x = this.f10019w;
    }

    private void y(long j11, List<androidx.media3.exoplayer.hls.playlist.d.a> list, List<l> list2, List<int[]> list3, Map<String, n> map) {
        List<androidx.media3.exoplayer.hls.playlist.d.a> list4 = list;
        ArrayList arrayList = new ArrayList(list4.size());
        ArrayList arrayList2 = new ArrayList(list4.size());
        ArrayList arrayList3 = new ArrayList(list4.size());
        HashSet hashSet = new HashSet();
        int i11 = 0;
        int i12 = 0;
        while (i12 < list4.size()) {
            String str = list4.get(i12).f10245d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                for (int i13 = i11; i13 < list4.size(); i13++) {
                    if (Objects.equals(str, list4.get(i13).f10245d)) {
                        androidx.media3.exoplayer.hls.playlist.d.a aVar = list4.get(i13);
                        arrayList3.add(Integer.valueOf(i13));
                        arrayList.add(aVar.f10242a);
                        arrayList2.add(aVar.f10243b);
                    }
                }
                String str2 = "subtitle:" + str;
                u[] uVarArr = (u[]) arrayList2.toArray(new u[i11]);
                l lVarZ = z(str2, 3, (Uri[]) arrayList.toArray((Uri[]) q0.m(new Uri[i11])), uVarArr, null, com.google.common.collect.x.r(), map, j11);
                list3.add(ru.f.n(arrayList3));
                list2.add(lVarZ);
                int length = uVarArr.length;
                u[] uVarArr2 = new u[length];
                for (int i14 = i11; i14 < length; i14++) {
                    uVarArr2[i14] = this.f9997a.d(uVarArr[i14]);
                }
                i11 = 0;
                lVarZ.h0(new t0[]{new t0(str2, uVarArr2)}, 0, new int[0]);
            }
            i12++;
            list4 = list;
        }
    }

    private l z(String str, int i11, Uri[] uriArr, u[] uVarArr, u uVar, List<u> list, Map<String, n> map, long j11) {
        return new l(str, i11, this.f10014r, new c(this.f9997a, this.f9998b, uriArr, uVarArr, this.f9999c, this.f10000d, this.f10008l, this.f10015s, list, this.f10013q, this.f10001e), map, this.f10006j, j11, uVar, this.f10002f, this.f10003g, this.f10004h, this.f10005i, this.f10011o);
    }

    public void D() {
        this.f9998b.b(this);
        for (l lVar : this.f10019w) {
            lVar.j0();
        }
        this.f10016t = null;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
    public void a() {
        for (l lVar : this.f10019w) {
            lVar.f0();
        }
        this.f10016t.j(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
    public boolean b(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z11) {
        boolean zE0 = true;
        for (l lVar : this.f10019w) {
            zE0 &= lVar.e0(uri, cVar, z11);
        }
        this.f10016t.j(this);
        return zE0;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.A.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        return this.A.d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        this.A.e(j11);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return this.A.f();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        l[] lVarArr = this.f10020x;
        if (lVarArr.length > 0) {
            boolean zM0 = lVarArr[0].m0(j11, false);
            int i11 = 1;
            while (true) {
                l[] lVarArr2 = this.f10020x;
                if (i11 >= lVarArr2.length) {
                    break;
                }
                lVarArr2[i11].m0(j11, zM0);
                i11++;
            }
            if (zM0) {
                this.f10008l.b();
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public y k() {
        return (y) s7.a.f(this.f10018v);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        if (this.f10018v != null) {
            return this.A.l(o1Var);
        }
        for (l lVar : this.f10019w) {
            lVar.D();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, b0 b0Var) {
        for (l lVar : this.f10020x) {
            if (lVar.T()) {
                return lVar.m(j11, b0Var);
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws ParserException {
        for (l lVar : this.f10019w) {
            lVar.n();
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        for (l lVar : this.f10020x) {
            lVar.o(j11, z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    @Override // androidx.media3.exoplayer.source.q
    public long r(t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        int[] iArr = new int[tVarArr.length];
        int[] iArr2 = new int[tVarArr.length];
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            n8.s sVar = sVarArr[i11];
            iArr[i11] = sVar == null ? -1 : this.f10007k.get(sVar).intValue();
            iArr2[i11] = -1;
            t tVar = tVarArr[i11];
            if (tVar != null) {
                t0 t0VarE = tVar.e();
                int i12 = 0;
                while (true) {
                    l[] lVarArr = this.f10019w;
                    if (i12 >= lVarArr.length) {
                        break;
                    }
                    if (lVarArr[i12].k().d(t0VarE) != -1) {
                        iArr2[i11] = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
        this.f10007k.clear();
        int length = tVarArr.length;
        n8.s[] sVarArr2 = new n8.s[length];
        n8.s[] sVarArr3 = new n8.s[tVarArr.length];
        t[] tVarArr2 = new t[tVarArr.length];
        l[] lVarArr2 = new l[this.f10019w.length];
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (i13 < this.f10019w.length) {
            for (int i15 = 0; i15 < tVarArr.length; i15++) {
                t tVar2 = null;
                sVarArr3[i15] = iArr[i15] == i13 ? sVarArr[i15] : null;
                if (iArr2[i15] == i13) {
                    tVar2 = tVarArr[i15];
                }
                tVarArr2[i15] = tVar2;
            }
            l lVar = this.f10019w[i13];
            int[] iArr3 = iArr;
            int i16 = i13;
            int i17 = i14;
            boolean zN0 = lVar.n0(tVarArr2, zArr, sVarArr3, zArr2, j11, z11);
            boolean z12 = false;
            for (int i18 = 0; i18 < tVarArr.length; i18++) {
                n8.s sVar2 = sVarArr3[i18];
                if (iArr2[i18] == i16) {
                    s7.a.f(sVar2);
                    sVarArr2[i18] = sVar2;
                    this.f10007k.put(sVar2, Integer.valueOf(i16));
                    z12 = true;
                } else if (iArr3[i18] == i16) {
                    s7.a.h(sVar2 == null);
                }
            }
            if (z12) {
                lVarArr2[i17] = lVar;
                i14 = i17 + 1;
                if (i17 == 0) {
                    lVar.q0(true);
                    if (zN0) {
                        this.f10008l.b();
                        z11 = true;
                    } else {
                        l[] lVarArr3 = this.f10020x;
                        if (lVarArr3.length == 0 || lVar != lVarArr3[0]) {
                            this.f10008l.b();
                            z11 = true;
                        }
                    }
                } else {
                    lVar.q0(i16 < this.f10022z);
                }
            } else {
                i14 = i17;
            }
            i13 = i16 + 1;
            iArr = iArr3;
        }
        System.arraycopy(sVarArr2, 0, sVarArr, 0, length);
        l[] lVarArr4 = (l[]) q0.h1(lVarArr2, i14);
        this.f10020x = lVarArr4;
        com.google.common.collect.x xVarO = com.google.common.collect.x.o(lVarArr4);
        this.A = this.f10009m.a(xVarO, com.google.common.collect.f0.j(xVarO, new ou.h() { // from class: androidx.media3.exoplayer.hls.f
            @Override // ou.h
            public final Object apply(Object obj) {
                return ((l) obj).k().c();
            }
        }));
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f10016t = aVar;
        this.f9998b.c(this);
        x(j11);
    }
}
