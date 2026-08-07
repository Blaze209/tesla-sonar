package net.time4j.tz.model;

import com.google.android.gms.nearby.messages.Strategy;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.b0;
import net.time4j.engine.z;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* JADX INFO: loaded from: classes9.dex */
final class j extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f94803g = net.time4j.base.b.i(net.time4j.base.b.l(z.MODIFIED_JULIAN_DATE.transform(l.f(100), z.UNIX)));
    private static final long serialVersionUID = 2456700806862862287L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient q f94804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient List<d> f94805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient ConcurrentMap<Integer, List<q>> f94806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient List<q> f94807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient boolean f94808f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94809a;

        static {
            int[] iArr = new int[i.values().length];
            f94809a = iArr;
            try {
                iArr[i.UTC_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94809a[i.STANDARD_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94809a[i.WALL_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j(p pVar, List<d> list, boolean z11) {
        this(new q(Long.MIN_VALUE, pVar.j(), pVar.j(), 0), list, z11);
    }

    private static q m(long j11, q qVar, List<d> list) {
        long jMax = Math.max(j11, qVar.e());
        int iH = qVar.h();
        int size = list.size();
        int iU = Integer.MIN_VALUE;
        q qVar2 = null;
        int i11 = 0;
        while (qVar2 == null) {
            int i12 = i11 % size;
            d dVar = list.get(i12);
            d dVar2 = list.get(((i11 - 1) + size) % size);
            int iO = o(dVar, iH, dVar2.e());
            if (i11 == 0) {
                iU = u(dVar, ((long) iO) + jMax);
            } else if (i12 == 0) {
                iU++;
            }
            long jP = p(dVar, iU, iO);
            if (jP > jMax) {
                qVar2 = new q(jP, iH + dVar2.e(), iH + dVar.e(), dVar.e());
            }
            i11++;
        }
        return qVar2;
    }

    private static int o(d dVar, int i11, int i12) {
        i iVarD = dVar.d();
        int i13 = a.f94809a[iVarD.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return i11;
        }
        if (i13 == 3) {
            return i11 + i12;
        }
        throw new UnsupportedOperationException(iVarD.name());
    }

    private static long p(d dVar, int i11, int i12) {
        return dVar.b(i11).n0(dVar.f()).N(p.p(i12)).l();
    }

    private List<q> q(int i11) {
        List<q> listPutIfAbsent;
        Integer numValueOf = Integer.valueOf(i11);
        List<q> listUnmodifiableList = this.f94806d.get(numValueOf);
        if (listUnmodifiableList == null) {
            ArrayList arrayList = new ArrayList();
            int iH = this.f94804b.h();
            int size = this.f94805c.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = this.f94805c.get(i12);
                d dVar2 = this.f94805c.get(((i12 - 1) + size) % size);
                arrayList.add(new q(p(dVar, i11, o(dVar, iH, dVar2.e())), iH + dVar2.e(), iH + dVar.e(), dVar.e()));
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            if (i11 <= f94803g && this.f94808f && (listPutIfAbsent = this.f94806d.putIfAbsent(numValueOf, listUnmodifiableList)) != null) {
                return listPutIfAbsent;
            }
        }
        return listUnmodifiableList;
    }

    private List<q> r(net.time4j.base.a aVar) {
        return q(this.f94805c.get(0).i(aVar));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    static List<q> s(q qVar, List<d> list, long j11, long j12) {
        List<d> list2 = list;
        long j13 = j11;
        long jE = qVar.e();
        if (j13 > j12) {
            throw new IllegalArgumentException("Start after end.");
        }
        if (j12 <= jE || j13 == j12) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int iH = qVar.h();
        int iU = Integer.MIN_VALUE;
        int i11 = 0;
        while (true) {
            int i12 = i11 % size;
            d dVar = list2.get(i12);
            d dVar2 = list2.get(((i11 - 1) + size) % size);
            int iO = o(dVar, iH, dVar2.e());
            if (i11 == 0) {
                iU = u(dVar, Math.max(j13, jE) + ((long) iO));
            } else if (i12 == 0) {
                iU++;
            }
            long jP = p(dVar, iU, iO);
            i11++;
            if (jP >= j12) {
                return Collections.unmodifiableList(arrayList);
            }
            if (jP >= j11 && jP > jE) {
                arrayList.add(new q(jP, iH + dVar2.e(), iH + dVar.e(), dVar.e()));
            }
            list2 = list;
            j13 = j11;
        }
    }

    private static int u(d dVar, long j11) {
        return dVar.h(z.MODIFIED_JULIAN_DATE.transform(net.time4j.base.c.b(j11, Strategy.TTL_SECONDS_MAX), z.UNIX));
    }

    private Object writeReplace() {
        return new SPX(this, 125);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.f fVar) {
        long jE = this.f94804b.e();
        q qVar = null;
        if (fVar.l() <= jE) {
            return null;
        }
        int iH = this.f94804b.h();
        int size = this.f94805c.size();
        int i11 = 0;
        d dVar = this.f94805c.get(0);
        int i12 = size - 1;
        int iU = u(dVar, fVar.l() + ((long) o(dVar, iH, this.f94805c.get(i12).e())));
        List<q> listQ = q(iU);
        while (i11 < size) {
            q qVar2 = listQ.get(i11);
            long jE2 = qVar2.e();
            if (fVar.l() >= jE2) {
                if (jE2 > jE) {
                    qVar = qVar2;
                }
                i11++;
            } else {
                if (qVar != null) {
                    break;
                }
                q qVar3 = i11 == 0 ? q(iU - 1).get(i12) : listQ.get(i11 - 1);
                if (qVar3.e() > jE) {
                    return qVar3;
                }
            }
        }
        return qVar;
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        Iterator<d> it = this.f94805c.iterator();
        while (it.hasNext()) {
            if (it.next().e() < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.m
    public q c(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return k(aVar, l.j(aVar, gVar));
    }

    @Override // net.time4j.tz.m
    public p d() {
        return p.p(this.f94804b.i());
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return t(aVar, l.j(aVar, gVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f94804b.equals(jVar.f94804b) && this.f94805c.equals(jVar.f94805c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f94804b.hashCode() * 17) + (this.f94805c.hashCode() * 37);
    }

    q k(net.time4j.base.a aVar, long j11) {
        if (j11 <= this.f94804b.e() + ((long) Math.max(this.f94804b.f(), this.f94804b.i()))) {
            return null;
        }
        for (q qVar : r(aVar)) {
            long jE = qVar.e();
            if (qVar.j()) {
                if (j11 < ((long) qVar.f()) + jE) {
                    return null;
                }
                if (j11 < jE + ((long) qVar.i())) {
                    return qVar;
                }
            } else if (!qVar.k()) {
                continue;
            } else {
                if (j11 < ((long) qVar.i()) + jE) {
                    return null;
                }
                if (j11 < jE + ((long) qVar.f())) {
                    return qVar;
                }
            }
        }
        return null;
    }

    q l() {
        return this.f94804b;
    }

    List<d> n() {
        return this.f94805c;
    }

    List<p> t(net.time4j.base.a aVar, long j11) {
        long jE = this.f94804b.e();
        int i11 = this.f94804b.i();
        if (j11 <= jE + ((long) Math.max(this.f94804b.f(), i11))) {
            return l.h(i11);
        }
        for (q qVar : r(aVar)) {
            long jE2 = qVar.e();
            int i12 = qVar.i();
            if (qVar.j()) {
                if (j11 < ((long) qVar.f()) + jE2) {
                    return l.h(qVar.f());
                }
                if (j11 < jE2 + ((long) i12)) {
                    return Collections.EMPTY_LIST;
                }
            } else if (!qVar.k()) {
                continue;
            } else {
                if (j11 < ((long) i12) + jE2) {
                    return l.h(qVar.f());
                }
                if (j11 < jE2 + ((long) qVar.f())) {
                    return l.i(i12, qVar.f());
                }
            }
            i11 = i12;
        }
        return l.h(i11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(j.class.getName());
        sb2.append("[initial=");
        sb2.append(this.f94804b);
        sb2.append(",rules=");
        sb2.append(this.f94805c);
        sb2.append(']');
        return sb2.toString();
    }

    j(q qVar, List<d> list, boolean z11) {
        q qVar2;
        this.f94806d = new ConcurrentHashMap();
        if (!list.isEmpty()) {
            if (list.size() < 128) {
                list = z11 ? new ArrayList(list) : list;
                Collections.sort(list, k.INSTANCE);
                String strA = null;
                if (list.size() > 1) {
                    for (d dVar : list) {
                        if (strA == null) {
                            strA = dVar.a();
                        } else if (!strA.equals(dVar.a())) {
                            throw new IllegalArgumentException("Rules with different calendar systems not permitted.");
                        }
                    }
                }
                this.f94808f = "iso8601".equals(strA);
                if (qVar.e() == Long.MIN_VALUE) {
                    if (qVar.d() == 0) {
                        qVar2 = new q(((b0) b0.Q().H()).l(), qVar.h(), qVar.h(), 0);
                    } else {
                        throw new IllegalArgumentException("Initial transition must not have any dst-offset: " + qVar);
                    }
                } else {
                    if (qVar.i() != m(qVar.e(), qVar, list).f()) {
                        throw new IllegalArgumentException("Inconsistent model: " + qVar + " / " + list);
                    }
                    qVar2 = qVar;
                }
                this.f94804b = qVar2;
                List<d> listUnmodifiableList = Collections.unmodifiableList(list);
                this.f94805c = listUnmodifiableList;
                this.f94807e = s(qVar2, listUnmodifiableList, 0L, l.f(1));
                return;
            }
            throw new IllegalArgumentException("Too many daylight saving rules: " + list);
        }
        throw new IllegalArgumentException("Missing daylight saving rules.");
    }
}
