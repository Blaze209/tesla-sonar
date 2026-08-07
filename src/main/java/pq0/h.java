package pq0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sq0.x;

/* JADX INFO: loaded from: classes10.dex */
public class h implements uq0.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set<Class<? extends sq0.a>> f103665p = new LinkedHashSet(Arrays.asList(sq0.b.class, sq0.i.class, sq0.g.class, sq0.j.class, x.class, sq0.p.class, sq0.m.class));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map<Class<? extends sq0.a>, uq0.e> f103666q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f103667a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f103670d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f103674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<uq0.e> f103675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final tq0.c f103676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<vq0.a> f103677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f103678l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103668b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f103669c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f103671e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f103672f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f103673g = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, sq0.o> f103679m = new LinkedHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<uq0.d> f103680n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Set<uq0.d> f103681o = new LinkedHashSet();

    private static class a implements uq0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uq0.d f103682a;

        public a(uq0.d dVar) {
            this.f103682a = dVar;
        }

        @Override // uq0.g
        public uq0.d a() {
            return this.f103682a;
        }

        @Override // uq0.g
        public CharSequence b() {
            uq0.d dVar = this.f103682a;
            if (!(dVar instanceof r)) {
                return null;
            }
            CharSequence charSequenceI = ((r) dVar).i();
            if (charSequenceI.length() == 0) {
                return null;
            }
            return charSequenceI;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(sq0.b.class, new c.a());
        map.put(sq0.i.class, new j.a());
        map.put(sq0.g.class, new i.a());
        map.put(sq0.j.class, new k.b());
        map.put(x.class, new t.a());
        map.put(sq0.p.class, new p.a());
        map.put(sq0.m.class, new l.a());
        f103666q = Collections.unmodifiableMap(map);
    }

    public h(List<uq0.e> list, tq0.c cVar, List<vq0.a> list2) {
        this.f103675i = list;
        this.f103676j = cVar;
        this.f103677k = list2;
        g gVar = new g();
        this.f103678l = gVar;
        e(gVar);
    }

    private void e(uq0.d dVar) {
        this.f103680n.add(dVar);
        this.f103681o.add(dVar);
    }

    private <T extends uq0.d> T f(T t11) {
        while (!d().f(t11.c())) {
            l(d());
        }
        d().c().b(t11.c());
        e(t11);
        return t11;
    }

    private void g(r rVar) {
        for (sq0.o oVar : rVar.j()) {
            rVar.c().i(oVar);
            String strN = oVar.n();
            if (!this.f103679m.containsKey(strN)) {
                this.f103679m.put(strN, oVar);
            }
        }
    }

    private void h() {
        CharSequence charSequenceSubSequence;
        if (this.f103670d) {
            int i11 = this.f103668b + 1;
            CharSequence charSequence = this.f103667a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i11, charSequence.length());
            int iA = rq0.d.a(this.f103669c);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence2.length() + iA);
            for (int i12 = 0; i12 < iA; i12++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f103667a;
            charSequenceSubSequence = charSequence2.subSequence(this.f103668b, charSequence2.length());
        }
        d().d(charSequenceSubSequence);
    }

    private void i() {
        if (this.f103667a.charAt(this.f103668b) != '\t') {
            this.f103668b++;
            this.f103669c++;
        } else {
            this.f103668b++;
            int i11 = this.f103669c;
            this.f103669c = i11 + rq0.d.a(i11);
        }
    }

    public static List<uq0.e> j(List<uq0.e> list, Set<Class<? extends sq0.a>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends sq0.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f103666q.get(it.next()));
        }
        return arrayList;
    }

    private void k() {
        List<uq0.d> list = this.f103680n;
        list.remove(list.size() - 1);
    }

    private void l(uq0.d dVar) {
        if (d() == dVar) {
            k();
        }
        if (dVar instanceof r) {
            g((r) dVar);
        }
        dVar.g();
    }

    private sq0.e m() {
        n(this.f103680n);
        u();
        return this.f103678l.c();
    }

    private void n(List<uq0.d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            l(list.get(size));
        }
    }

    private d o(uq0.d dVar) {
        a aVar = new a(dVar);
        Iterator<uq0.e> it = this.f103675i.iterator();
        while (it.hasNext()) {
            uq0.f fVarA = it.next().a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    private void p() {
        int i11 = this.f103668b;
        int i12 = this.f103669c;
        this.f103674h = true;
        int length = this.f103667a.length();
        while (i11 < length) {
            char cCharAt = this.f103667a.charAt(i11);
            if (cCharAt == '\t') {
                i11++;
                i12 += 4 - (i12 % 4);
            } else if (cCharAt != ' ') {
                this.f103674h = false;
                break;
            } else {
                i11++;
                i12++;
            }
        }
        this.f103671e = i11;
        this.f103672f = i12;
        this.f103673g = i12 - this.f103669c;
    }

    public static Set<Class<? extends sq0.a>> q() {
        return f103665p;
    }

    private void r(CharSequence charSequence) {
        this.f103667a = rq0.d.j(charSequence);
        this.f103668b = 0;
        this.f103669c = 0;
        this.f103670d = false;
        List<uq0.d> list = this.f103680n;
        int i11 = 1;
        for (uq0.d dVar : list.subList(1, list.size())) {
            p();
            uq0.c cVarE = dVar.e(this);
            if (!(cVarE instanceof b)) {
                break;
            }
            b bVar = (b) cVarE;
            if (bVar.g()) {
                l(dVar);
                return;
            }
            if (bVar.f() != -1) {
                w(bVar.f());
            } else if (bVar.e() != -1) {
                v(bVar.e());
            }
            i11++;
        }
        List<uq0.d> list2 = this.f103680n;
        ArrayList arrayList = new ArrayList(list2.subList(i11, list2.size()));
        uq0.d dVar2 = this.f103680n.get(i11 - 1);
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zA = (dVar2.c() instanceof sq0.t) || dVar2.a();
        while (zA) {
            p();
            if (b() || (this.f103673g < rq0.d.f108704a && rq0.d.h(this.f103667a, this.f103671e))) {
                w(this.f103671e);
                break;
            }
            d dVarO = o(dVar2);
            if (dVarO == null) {
                w(this.f103671e);
                break;
            }
            if (!zIsEmpty) {
                n(arrayList);
                zIsEmpty = true;
            }
            if (dVarO.h() != -1) {
                w(dVarO.h());
            } else if (dVarO.g() != -1) {
                v(dVarO.g());
            }
            if (dVarO.i()) {
                t();
            }
            uq0.d[] dVarArrF = dVarO.f();
            int length = dVarArrF.length;
            int i12 = 0;
            while (i12 < length) {
                uq0.d dVar3 = dVarArrF[i12];
                uq0.d dVarF = f(dVar3);
                i12++;
                zA = dVar3.a();
                dVar2 = dVarF;
            }
        }
        if (!zIsEmpty && !b() && d().b()) {
            h();
            return;
        }
        if (!zIsEmpty) {
            n(arrayList);
        }
        if (!dVar2.a()) {
            h();
        } else {
            if (b()) {
                return;
            }
            f(new r());
            h();
        }
    }

    private void t() {
        uq0.d dVarD = d();
        k();
        this.f103681o.remove(dVarD);
        if (dVarD instanceof r) {
            g((r) dVarD);
        }
        dVarD.c().l();
    }

    private void u() {
        tq0.a aVarA = this.f103676j.a(new m(this.f103677k, this.f103679m));
        Iterator<uq0.d> it = this.f103681o.iterator();
        while (it.hasNext()) {
            it.next().h(aVarA);
        }
    }

    private void v(int i11) {
        int i12;
        int i13 = this.f103672f;
        if (i11 >= i13) {
            this.f103668b = this.f103671e;
            this.f103669c = i13;
        }
        int length = this.f103667a.length();
        while (true) {
            i12 = this.f103669c;
            if (i12 >= i11 || this.f103668b == length) {
                break;
            } else {
                i();
            }
        }
        if (i12 <= i11) {
            this.f103670d = false;
            return;
        }
        this.f103668b--;
        this.f103669c = i11;
        this.f103670d = true;
    }

    private void w(int i11) {
        int i12 = this.f103671e;
        if (i11 >= i12) {
            this.f103668b = i12;
            this.f103669c = this.f103672f;
        }
        int length = this.f103667a.length();
        while (true) {
            int i13 = this.f103668b;
            if (i13 >= i11 || i13 == length) {
                break;
            } else {
                i();
            }
        }
        this.f103670d = false;
    }

    @Override // uq0.h
    public int O() {
        return this.f103673g;
    }

    @Override // uq0.h
    public CharSequence a() {
        return this.f103667a;
    }

    @Override // uq0.h
    public boolean b() {
        return this.f103674h;
    }

    @Override // uq0.h
    public int c() {
        return this.f103671e;
    }

    @Override // uq0.h
    public uq0.d d() {
        List<uq0.d> list = this.f103680n;
        return list.get(list.size() - 1);
    }

    @Override // uq0.h
    public int getColumn() {
        return this.f103669c;
    }

    @Override // uq0.h
    public int getIndex() {
        return this.f103668b;
    }

    public sq0.e s(String str) {
        int i11 = 0;
        while (true) {
            int iC = rq0.d.c(str, i11);
            if (iC == -1) {
                break;
            }
            r(str.substring(i11, iC));
            i11 = iC + 1;
            if (i11 < str.length() && str.charAt(iC) == '\r' && str.charAt(i11) == '\n') {
                i11 = iC + 2;
            }
        }
        if (str.length() > 0 && (i11 == 0 || i11 < str.length())) {
            r(str.substring(i11));
        }
        return m();
    }
}
