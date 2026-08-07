package fp0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements Iterable<b>, Comparator<b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f66315f = Boolean.getBoolean("net.time4j.scale.leapseconds.suppressed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f66316g = Boolean.getBoolean("net.time4j.scale.leapseconds.final");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f66317h = System.getProperty("net.time4j.scale.leapseconds.path", "data/leapseconds.data");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final fp0.a[] f66318i = new fp0.a[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d f66319j = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f66320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<fp0.a> f66321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fp0.a[] f66322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile fp0.a[] f66323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f66324e;

    private d() {
        c cVar;
        int i11;
        boolean z11 = false;
        if (f66315f) {
            cVar = null;
            i11 = 0;
        } else {
            cVar = null;
            i11 = 0;
            for (c cVar2 : net.time4j.base.d.c().g(c.class)) {
                int size = cVar2.f().size();
                if (size > i11) {
                    cVar = cVar2;
                    i11 = size;
                }
            }
        }
        if (cVar == null || i11 == 0) {
            this.f66320a = null;
            this.f66321b = Collections.EMPTY_LIST;
            fp0.a[] aVarArr = f66318i;
            this.f66322c = aVarArr;
            this.f66323d = aVarArr;
            this.f66324e = false;
            return;
        }
        TreeSet treeSet = new TreeSet(this);
        for (Map.Entry<net.time4j.base.a, Integer> entry : cVar.f().entrySet()) {
            net.time4j.base.a key = entry.getKey();
            treeSet.add(new a(key, Long.MIN_VALUE, (-62985601) + v(key), entry.getValue().intValue()));
        }
        h(treeSet);
        boolean z12 = f66316g;
        if (z12) {
            this.f66321b = Collections.unmodifiableList(new ArrayList(treeSet));
        } else {
            this.f66321b = new CopyOnWriteArrayList(treeSet);
        }
        fp0.a[] aVarArrQ = q();
        this.f66322c = aVarArrQ;
        this.f66323d = aVarArrQ;
        this.f66320a = cVar;
        if (!z12) {
            this.f66324e = true;
            return;
        }
        boolean zB = cVar.b();
        if (zB) {
            Iterator<fp0.a> it = this.f66321b.iterator();
            while (it.hasNext()) {
                if (it.next().a() < 0) {
                    z11 = true;
                    break;
                }
            }
            zB = z11;
        }
        this.f66324e = zB;
    }

    private static void h(SortedSet<fp0.a> sortedSet) {
        ArrayList arrayList = new ArrayList(sortedSet.size());
        int iA = 0;
        for (fp0.a aVar : sortedSet) {
            if (aVar.c() == Long.MIN_VALUE) {
                iA += aVar.a();
                arrayList.add(new a(aVar, iA));
            } else {
                arrayList.add(aVar);
            }
        }
        sortedSet.clear();
        sortedSet.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(net.time4j.base.a aVar) {
        return String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(aVar.b()), Integer.valueOf(aVar.r()), Integer.valueOf(aVar.f()));
    }

    private fp0.a[] m() {
        return (f66315f || f66316g) ? this.f66322c : this.f66323d;
    }

    public static d n() {
        return f66319j;
    }

    private fp0.a[] q() {
        ArrayList arrayList = new ArrayList(this.f66321b.size());
        arrayList.addAll(this.f66321b);
        Collections.reverse(arrayList);
        return (fp0.a[]) arrayList.toArray(new fp0.a[arrayList.size()]);
    }

    private static long v(net.time4j.base.a aVar) {
        return net.time4j.base.c.i(net.time4j.base.c.m(net.time4j.base.b.k(aVar), 40587L), 86400L);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        net.time4j.base.a date = bVar.getDate();
        net.time4j.base.a date2 = bVar2.getDate();
        int iB = date.b();
        int iB2 = date2.b();
        if (iB < iB2) {
            return -1;
        }
        if (iB > iB2) {
            return 1;
        }
        int iR = date.r();
        int iR2 = date2.r();
        if (iR < iR2) {
            return -1;
        }
        if (iR > iR2) {
            return 1;
        }
        int iF = date.f();
        int iF2 = date2.f();
        if (iF < iF2) {
            return -1;
        }
        return iF == iF2 ? 0 : 1;
    }

    public long f(long j11) {
        long j12 = j11 - 63072000;
        if (j11 > 0) {
            for (fp0.a aVar : m()) {
                if (aVar.b() < j12) {
                    return net.time4j.base.c.f(j12, aVar.c() - aVar.b());
                }
            }
        }
        return j12;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return Collections.unmodifiableList(Arrays.asList(m())).iterator();
    }

    public net.time4j.base.a l() {
        if (r()) {
            return this.f66320a.c();
        }
        throw new IllegalStateException("Leap seconds not activated.");
    }

    public b o(long j11) {
        fp0.a[] aVarArrM = m();
        fp0.a aVar = null;
        int i11 = 0;
        while (i11 < aVarArrM.length) {
            fp0.a aVar2 = aVarArrM[i11];
            if (j11 >= aVar2.c()) {
                break;
            }
            i11++;
            aVar = aVar2;
        }
        return aVar;
    }

    public int p(long j11) {
        if (j11 <= 0) {
            return 0;
        }
        for (fp0.a aVar : m()) {
            if (j11 > aVar.c()) {
                return 0;
            }
            long jC = aVar.c() - ((long) aVar.a());
            if (j11 > jC) {
                return (int) (j11 - jC);
            }
        }
        return 0;
    }

    public boolean r() {
        return !this.f66321b.isEmpty();
    }

    public boolean s(long j11) {
        if (j11 <= 0) {
            return false;
        }
        fp0.a[] aVarArrM = m();
        for (int i11 = 0; i11 < aVarArrM.length; i11++) {
            long jC = aVarArrM[i11].c();
            if (jC == j11) {
                return aVarArrM[i11].a() == 1;
            }
            if (jC < j11) {
                break;
            }
        }
        return false;
    }

    public long t(long j11) {
        if (j11 <= 0) {
            return j11 + 63072000;
        }
        fp0.a[] aVarArrM = m();
        boolean z11 = this.f66324e;
        for (fp0.a aVar : aVarArrM) {
            if (aVar.c() - ((long) aVar.a()) < j11 || (z11 && aVar.a() < 0 && aVar.c() < j11)) {
                j11 = net.time4j.base.c.f(j11, aVar.b() - aVar.c());
                break;
            }
        }
        return j11 + 63072000;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(2048);
        sb2.append("[PROVIDER=");
        sb2.append(this.f66320a);
        if (this.f66320a != null) {
            sb2.append(",EXPIRES=");
            sb2.append(j(l()));
        }
        sb2.append(",EVENTS=[");
        if (r()) {
            boolean z11 = true;
            for (fp0.a aVar : this.f66321b) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(aVar);
            }
        } else {
            sb2.append("NOT SUPPORTED");
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public boolean u() {
        return this.f66324e;
    }

    private static class a implements fp0.a, Serializable {
        private static final long serialVersionUID = 5986185471610524587L;
        private final long _raw;
        private final long _utc;
        private final net.time4j.base.a date;
        private final int shift;

        a(net.time4j.base.a aVar, long j11, long j12, int i11) {
            this.date = aVar;
            this.shift = i11;
            this._utc = j11;
            this._raw = j12;
        }

        @Override // fp0.b
        public int a() {
            return this.shift;
        }

        @Override // fp0.a
        public long b() {
            return this._raw;
        }

        @Override // fp0.a
        public long c() {
            return this._utc;
        }

        @Override // fp0.b
        public net.time4j.base.a getDate() {
            return this.date;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(b.class.getName());
            sb2.append('[');
            sb2.append(d.j(this.date));
            sb2.append(": utc=");
            sb2.append(this._utc);
            sb2.append(", raw=");
            sb2.append(this._raw);
            sb2.append(" (shift=");
            sb2.append(this.shift);
            sb2.append(")]");
            return sb2.toString();
        }

        a(fp0.a aVar, int i11) {
            this.date = aVar.getDate();
            this.shift = aVar.a();
            this._utc = aVar.b() + ((long) i11);
            this._raw = aVar.b();
        }
    }
}
