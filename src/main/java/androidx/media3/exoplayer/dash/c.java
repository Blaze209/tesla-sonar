package androidx.media3.exoplayer.dash;

import a8.o2;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.g0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import com.google.common.collect.f0;
import com.google.common.collect.j0;
import com.google.common.collect.x;
import d8.g;
import d8.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n8.y;
import p7.t0;
import p7.u;
import p8.h;
import r8.t;
import s7.q0;
import s8.k;
import z7.b0;

/* JADX INFO: loaded from: classes.dex */
final class c implements q, g0.a<h<androidx.media3.exoplayer.dash.a>>, h.b<androidx.media3.exoplayer.dash.a> {
    private static final Pattern B = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern C = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private long A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f9622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.dash.a.InterfaceC0196a f9623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7.q f9624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s8.e f9625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f9626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f9627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c8.b f9628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f9629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f9630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final s8.b f9631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y f9632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a[] f9633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final n8.e f9634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f f9635n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final s.a f9637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f9638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o2 f9639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private q.a f9640s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g0 f9643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d8.c f9644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f9645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<d8.f> f9646y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f9647z = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private h<androidx.media3.exoplayer.dash.a>[] f9641t = I(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e[] f9642u = new e[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final IdentityHashMap<h<androidx.media3.exoplayer.dash.a>, f.c> f9636o = new IdentityHashMap<>();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f9648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f9654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final x<u> f9655h;

        private a(int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, x<u> xVar) {
            this.f9649b = i11;
            this.f9648a = iArr;
            this.f9650c = i12;
            this.f9652e = i13;
            this.f9653f = i14;
            this.f9654g = i15;
            this.f9651d = i16;
            this.f9655h = xVar;
        }

        public static a a(int[] iArr, int i11, x<u> xVar) {
            return new a(3, 1, iArr, i11, -1, -1, -1, xVar);
        }

        public static a b(int[] iArr, int i11) {
            return new a(5, 1, iArr, i11, -1, -1, -1, x.r());
        }

        public static a c(int i11) {
            return new a(5, 2, new int[0], -1, -1, -1, i11, x.r());
        }

        public static a d(int i11, int[] iArr, int i12, int i13, int i14) {
            return new a(i11, 0, iArr, i12, i13, i14, -1, x.r());
        }
    }

    public c(int i11, d8.c cVar, c8.b bVar, int i12, androidx.media3.exoplayer.dash.a.InterfaceC0196a interfaceC0196a, v7.q qVar, s8.e eVar, i iVar, androidx.media3.exoplayer.drm.h.a aVar, androidx.media3.exoplayer.upstream.b bVar2, s.a aVar2, long j11, k kVar, s8.b bVar3, n8.e eVar2, f.b bVar4, o2 o2Var) {
        this.f9622a = i11;
        this.f9644w = cVar;
        this.f9628g = bVar;
        this.f9645x = i12;
        this.f9623b = interfaceC0196a;
        this.f9624c = qVar;
        this.f9625d = eVar;
        this.f9626e = iVar;
        this.f9638q = aVar;
        this.f9627f = bVar2;
        this.f9637p = aVar2;
        this.f9629h = j11;
        this.f9630i = kVar;
        this.f9631j = bVar3;
        this.f9634m = eVar2;
        this.f9639r = o2Var;
        this.f9635n = new f(cVar, bVar4, bVar3);
        this.f9643v = eVar2.empty();
        g gVarD = cVar.d(i12);
        List<d8.f> list = gVarD.f59817d;
        this.f9646y = list;
        Pair<y, a[]> pairW = w(iVar, interfaceC0196a, gVarD.f59816c, list);
        this.f9632k = (y) pairW.first;
        this.f9633l = (a[]) pairW.second;
    }

    private static d8.e A(List<d8.e> list) {
        return z(list, "http://dashif.org/guidelines/trickmode");
    }

    private static u[] B(List<d8.a> list, int[] iArr) {
        for (int i11 : iArr) {
            d8.a aVar = list.get(i11);
            List<d8.e> list2 = list.get(i11).f59771d;
            for (int i12 = 0; i12 < list2.size(); i12++) {
                d8.e eVar = list2.get(i12);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f59806a)) {
                    return K(eVar, B, new u.b().y0("application/cea-608").j0(aVar.f59768a + ":cea608").P());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f59806a)) {
                    return K(eVar, C, new u.b().y0("application/cea-708").j0(aVar.f59768a + ":cea708").P());
                }
            }
        }
        return new u[0];
    }

    private static int[][] C(List<d8.a> list) {
        d8.e eVarY;
        Integer num;
        int size = list.size();
        HashMap mapF = j0.f(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            mapF.put(Long.valueOf(list.get(i11).f59768a), Integer.valueOf(i11));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            d8.a aVar = list.get(i12);
            d8.e eVarA = A(aVar.f59772e);
            if (eVarA == null) {
                eVarA = A(aVar.f59773f);
            }
            int iIntValue = (eVarA == null || (num = (Integer) mapF.get(Long.valueOf(Long.parseLong(eVarA.f59807b)))) == null || !x(aVar, list.get(num.intValue()))) ? i12 : num.intValue();
            if (iIntValue == i12 && (eVarY = y(aVar.f59773f)) != null) {
                for (String str : q0.E1(eVarY.f59807b, ",")) {
                    Integer num2 = (Integer) mapF.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && x(aVar, list.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            int[] iArrN = ru.f.n((Collection) arrayList.get(i13));
            iArr[i13] = iArrN;
            Arrays.sort(iArrN);
        }
        return iArr;
    }

    private int D(int i11, int[] iArr) {
        int i12 = iArr[i11];
        if (i12 == -1) {
            return -1;
        }
        int i13 = this.f9633l[i12].f9652e;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 == i13 && this.f9633l[i15].f9650c == 0) {
                return i14;
            }
        }
        return -1;
    }

    private int[] E(t[] tVarArr) {
        int[] iArr = new int[tVarArr.length];
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            t tVar = tVarArr[i11];
            if (tVar != null) {
                iArr[i11] = this.f9632k.d(tVar.e());
            } else {
                iArr[i11] = -1;
            }
        }
        return iArr;
    }

    private static boolean F(List<d8.a> list, int[] iArr) {
        for (int i11 : iArr) {
            List<j> list2 = list.get(i11).f59770c;
            for (int i12 = 0; i12 < list2.size(); i12++) {
                if (!list2.get(i12).f59832e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int G(int i11, List<d8.a> list, int[][] iArr, boolean[] zArr, u[][] uVarArr) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (F(list, iArr[i13])) {
                zArr[i13] = true;
                i12++;
            }
            u[] uVarArrB = B(list, iArr[i13]);
            uVarArr[i13] = uVarArrB;
            if (uVarArrB.length != 0) {
                i12++;
            }
        }
        return i12;
    }

    private static void H(androidx.media3.exoplayer.dash.a.InterfaceC0196a interfaceC0196a, u[] uVarArr) {
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            uVarArr[i11] = interfaceC0196a.d(uVarArr[i11]);
        }
    }

    private static h<androidx.media3.exoplayer.dash.a>[] I(int i11) {
        return new h[i11];
    }

    private static u[] K(d8.e eVar, Pattern pattern, u uVar) {
        String str = eVar.f59807b;
        if (str == null) {
            return new u[]{uVar};
        }
        String[] strArrE1 = q0.E1(str, ";");
        u[] uVarArr = new u[strArrE1.length];
        for (int i11 = 0; i11 < strArrE1.length; i11++) {
            Matcher matcher = pattern.matcher(strArrE1[i11]);
            if (!matcher.matches()) {
                return new u[]{uVar};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            uVarArr[i11] = uVar.b().j0(uVar.f101530a + ":" + i12).Q(i12).n0(matcher.group(2)).P();
        }
        return uVarArr;
    }

    private void M(t[] tVarArr, boolean[] zArr, n8.s[] sVarArr) {
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            if (tVarArr[i11] == null || !zArr[i11]) {
                n8.s sVar = sVarArr[i11];
                if (sVar instanceof h) {
                    ((h) sVar).T(this);
                } else if (sVar instanceof h.a) {
                    ((h.a) sVar).d();
                }
                sVarArr[i11] = null;
            }
        }
    }

    private void N(t[] tVarArr, n8.s[] sVarArr, int[] iArr) {
        boolean z11;
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            n8.s sVar = sVarArr[i11];
            if ((sVar instanceof n8.h) || (sVar instanceof h.a)) {
                int iD = D(i11, iArr);
                if (iD == -1) {
                    z11 = sVarArr[i11] instanceof n8.h;
                } else {
                    n8.s sVar2 = sVarArr[i11];
                    z11 = (sVar2 instanceof h.a) && ((h.a) sVar2).f101906a == sVarArr[iD];
                }
                if (!z11) {
                    n8.s sVar3 = sVarArr[i11];
                    if (sVar3 instanceof h.a) {
                        ((h.a) sVar3).d();
                    }
                    sVarArr[i11] = null;
                }
            }
        }
    }

    private void O(t[] tVarArr, n8.s[] sVarArr, boolean[] zArr, long j11, int[] iArr) {
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            t tVar = tVarArr[i11];
            if (tVar != null) {
                n8.s sVar = sVarArr[i11];
                if (sVar == null) {
                    zArr[i11] = true;
                    a aVar = this.f9633l[iArr[i11]];
                    int i12 = aVar.f9650c;
                    if (i12 == 0) {
                        sVarArr[i11] = v(aVar, tVar, j11);
                    } else if (i12 == 2) {
                        sVarArr[i11] = new e(this.f9646y.get(aVar.f9651d), tVar.e().c(0), this.f9644w.f59781d);
                    }
                } else if (sVar instanceof h) {
                    ((androidx.media3.exoplayer.dash.a) ((h) sVar).G()).b(tVar);
                }
            }
        }
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            if (sVarArr[i13] == null && tVarArr[i13] != null) {
                a aVar2 = this.f9633l[iArr[i13]];
                if (aVar2.f9650c == 1) {
                    int iD = D(i13, iArr);
                    if (iD == -1) {
                        sVarArr[i13] = new n8.h();
                    } else {
                        sVarArr[i13] = ((h) sVarArr[iD]).W(j11, aVar2.f9649b);
                    }
                }
            }
        }
    }

    private static void s(List<d8.f> list, t0[] t0VarArr, a[] aVarArr, int i11) {
        int i12 = 0;
        while (i12 < list.size()) {
            d8.f fVar = list.get(i12);
            t0VarArr[i11] = new t0(fVar.a() + ":" + i12, new u.b().j0(fVar.a()).y0("application/x-emsg").P());
            aVarArr[i11] = a.c(i12);
            i12++;
            i11++;
        }
    }

    private static int t(i iVar, androidx.media3.exoplayer.dash.a.InterfaceC0196a interfaceC0196a, List<d8.a> list, int[][] iArr, int i11, boolean[] zArr, u[][] uVarArr, t0[] t0VarArr, a[] aVarArr) {
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11) {
            int[] iArr2 = iArr[i14];
            ArrayList arrayList = new ArrayList();
            for (int i16 : iArr2) {
                arrayList.addAll(list.get(i16).f59770c);
            }
            int size = arrayList.size();
            u[] uVarArr2 = new u[size];
            for (int i17 = 0; i17 < size; i17++) {
                u uVar = ((j) arrayList.get(i17)).f59829b;
                uVarArr2[i17] = uVar.b().X(iVar.e(uVar)).P();
            }
            d8.a aVar = list.get(iArr2[0]);
            long j11 = aVar.f59768a;
            String string = j11 != -1 ? Long.toString(j11) : "unset:" + i14;
            int i18 = i15 + 1;
            if (zArr[i14]) {
                i12 = i15 + 2;
            } else {
                i12 = i18;
                i18 = -1;
            }
            if (uVarArr[i14].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            H(interfaceC0196a, uVarArr2);
            t0VarArr[i15] = new t0(string, uVarArr2);
            aVarArr[i15] = a.d(aVar.f59769b, iArr2, i15, i18, i12);
            if (i18 != -1) {
                String str = string + ":emsg";
                t0VarArr[i18] = new t0(str, new u.b().j0(str).y0("application/x-emsg").P());
                aVarArr[i18] = a.b(iArr2, i15);
            }
            if (i12 != -1) {
                aVarArr[i12] = a.a(iArr2, i15, x.o(uVarArr[i14]));
                H(interfaceC0196a, uVarArr[i14]);
                t0VarArr[i12] = new t0(string + ":cc", uVarArr[i14]);
            }
            i14++;
            i15 = i13;
        }
        return i15;
    }

    private h<androidx.media3.exoplayer.dash.a> v(a aVar, t tVar, long j11) {
        int i11;
        t0 t0VarB;
        int i12;
        int i13 = aVar.f9653f;
        boolean z11 = i13 != -1;
        f.c cVarK = null;
        if (z11) {
            t0VarB = this.f9632k.b(i13);
            i11 = 1;
        } else {
            i11 = 0;
            t0VarB = null;
        }
        int i14 = aVar.f9654g;
        x<u> xVarR = i14 != -1 ? this.f9633l[i14].f9655h : x.r();
        int size = i11 + xVarR.size();
        u[] uVarArr = new u[size];
        int[] iArr = new int[size];
        if (z11) {
            uVarArr[0] = t0VarB.c(0);
            iArr[0] = 5;
            i12 = 1;
        } else {
            i12 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < xVarR.size(); i15++) {
            u uVar = xVarR.get(i15);
            uVarArr[i12] = uVar;
            iArr[i12] = 3;
            arrayList.add(uVar);
            i12++;
        }
        if (this.f9644w.f59781d && z11) {
            cVarK = this.f9635n.k();
        }
        f.c cVar = cVarK;
        h<androidx.media3.exoplayer.dash.a> hVar = new h<>(aVar.f9649b, iArr, uVarArr, this.f9623b.e(this.f9630i, this.f9644w, this.f9628g, this.f9645x, aVar.f9648a, tVar, aVar.f9649b, this.f9629h, z11, arrayList, cVar, this.f9624c, this.f9639r, this.f9625d), this, this.f9631j, j11, this.f9626e, this.f9638q, this.f9627f, this.f9637p, this.f9647z, null);
        synchronized (this) {
            this.f9636o.put(hVar, cVar);
        }
        return hVar;
    }

    private static Pair<y, a[]> w(i iVar, androidx.media3.exoplayer.dash.a.InterfaceC0196a interfaceC0196a, List<d8.a> list, List<d8.f> list2) {
        int[][] iArrC = C(list);
        int length = iArrC.length;
        boolean[] zArr = new boolean[length];
        u[][] uVarArr = new u[length][];
        int iG = G(length, list, iArrC, zArr, uVarArr) + length + list2.size();
        t0[] t0VarArr = new t0[iG];
        a[] aVarArr = new a[iG];
        s(list2, t0VarArr, aVarArr, t(iVar, interfaceC0196a, list, iArrC, length, zArr, uVarArr, t0VarArr, aVarArr));
        return Pair.create(new y(t0VarArr), aVarArr);
    }

    private static boolean x(d8.a aVar, d8.a aVar2) {
        if (aVar.f59769b != aVar2.f59769b) {
            return false;
        }
        if (aVar.f59770c.isEmpty() || aVar2.f59770c.isEmpty()) {
            return true;
        }
        u uVar = aVar.f59770c.get(0).f59829b;
        u uVar2 = aVar2.f59770c.get(0).f59829b;
        return Objects.equals(uVar.f101533d, uVar2.f101533d) && (uVar.f101535f & (-16385)) == (uVar2.f101535f & (-16385));
    }

    private static d8.e y(List<d8.e> list) {
        return z(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static d8.e z(List<d8.e> list, String str) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            d8.e eVar = list.get(i11);
            if (str.equals(eVar.f59806a)) {
                return eVar;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void j(h<androidx.media3.exoplayer.dash.a> hVar) {
        this.f9640s.j(this);
    }

    public void L() {
        this.f9635n.o();
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.f9641t) {
            hVar.T(this);
        }
        this.f9640s = null;
    }

    public void P(d8.c cVar, int i11) {
        this.f9644w = cVar;
        this.f9645x = i11;
        this.f9635n.q(cVar);
        h<androidx.media3.exoplayer.dash.a>[] hVarArr = this.f9641t;
        if (hVarArr != null) {
            for (h<androidx.media3.exoplayer.dash.a> hVar : hVarArr) {
                ((androidx.media3.exoplayer.dash.a) hVar.G()).g(cVar, i11);
            }
            this.f9640s.j(this);
        }
        this.f9646y = cVar.d(i11).f59817d;
        for (e eVar : this.f9642u) {
            for (d8.f fVar : this.f9646y) {
                if (fVar.a().equals(eVar.c())) {
                    eVar.e(fVar, cVar.f59781d && i11 == cVar.e() - 1);
                    break;
                }
            }
        }
    }

    @Override // p8.h.b
    public synchronized void b(h<androidx.media3.exoplayer.dash.a> hVar) {
        f.c cVarRemove = this.f9636o.remove(hVar);
        if (cVarRemove != null) {
            cVarRemove.o();
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f9643v.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        return this.f9643v.d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.f9641t) {
            if (!hVar.c()) {
                hVar.F(this.f9644w.g(this.f9645x));
            }
        }
        this.f9643v.e(j11);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return this.f9643v.f();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) throws Throwable {
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.f9641t) {
            hVar.V(j11);
        }
        for (e eVar : this.f9642u) {
            eVar.d(j11);
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.f9641t) {
            if (hVar.B()) {
                return this.A;
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public y k() {
        return this.f9632k;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        return this.f9643v.l(o1Var);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, b0 b0Var) {
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.f9641t) {
            if (hVar.f101881a == 2) {
                return hVar.m(j11, b0Var);
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
        this.f9630i.a();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.f9641t) {
            hVar.o(j11, z11);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        int[] iArrE = E(tVarArr);
        M(tVarArr, zArr, sVarArr);
        N(tVarArr, sVarArr, iArrE);
        O(tVarArr, sVarArr, zArr2, j11, iArrE);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (n8.s sVar : sVarArr) {
            if (sVar instanceof h) {
                arrayList.add((h) sVar);
            } else if (sVar instanceof e) {
                arrayList2.add((e) sVar);
            }
        }
        h<androidx.media3.exoplayer.dash.a>[] hVarArrI = I(arrayList.size());
        this.f9641t = hVarArrI;
        arrayList.toArray(hVarArrI);
        e[] eVarArr = new e[arrayList2.size()];
        this.f9642u = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f9643v = this.f9634m.a(arrayList, f0.j(arrayList, new ou.h() { // from class: androidx.media3.exoplayer.dash.b
            @Override // ou.h
            public final Object apply(Object obj) {
                return x.s(Integer.valueOf(((h) obj).f101881a));
            }
        }));
        if (this.f9647z) {
            this.f9647z = false;
            this.A = j11;
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f9640s = aVar;
        aVar.i(this);
    }
}
