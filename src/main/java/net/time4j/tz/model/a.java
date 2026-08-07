package net.time4j.tz.model;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.b0;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* JADX INFO: loaded from: classes9.dex */
final class a extends l {
    private static final long serialVersionUID = -5264909488983076587L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient q[] f94784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient boolean f94785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient List<q> f94786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f94787e = 0;

    a(List<q> list, boolean z11, boolean z12) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing timezone transitions.");
        }
        q[] qVarArr = (q[]) list.toArray(new q[list.size()]);
        boolean z13 = false;
        for (q qVar : qVarArr) {
            z13 = z13 || qVar.d() < 0;
        }
        this.f94785c = z13;
        if (z11) {
            Arrays.sort(qVarArr);
        }
        if (z12) {
            k(qVarArr, list);
        }
        this.f94784b = qVarArr;
        this.f94786d = o(qVarArr, 0L, l.f(1));
    }

    private static void k(q[] qVarArr, List<q> list) {
        int i11 = qVarArr[0].i();
        for (int i12 = 1; i12 < qVarArr.length; i12++) {
            if (i11 != qVarArr[i12].f()) {
                throw new IllegalArgumentException("Model inconsistency detected at: " + b0.l0(qVarArr[i12].e(), fp0.f.POSIX) + " (" + qVarArr[i12].e() + ")  in transitions: " + list);
            }
            i11 = qVarArr[i12].i();
        }
    }

    private static List<q> o(q[] qVarArr, long j11, long j12) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Start after end.");
        }
        int iR = r(j11, qVarArr);
        int iR2 = r(j12, qVarArr);
        if (iR2 == 0) {
            return Collections.EMPTY_LIST;
        }
        if (iR > 0 && qVarArr[iR - 1].e() == j11) {
            iR--;
        }
        int i11 = iR2 - 1;
        if (qVarArr[i11].e() == j12) {
            i11 = iR2 - 2;
        }
        if (iR > i11) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList((i11 - iR) + 1);
        while (iR <= i11) {
            arrayList.add(qVarArr[iR]);
            iR++;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static int r(long j11, q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) / 2;
            if (qVarArr[i12].e() <= j11) {
                i11 = i12 + 1;
            } else {
                length = i12 - 1;
            }
        }
        return i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private static int s(long j11, q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) / 2;
            q qVar = qVarArr[i12];
            if (qVar.e() + ((long) Math.max(qVar.i(), qVar.f())) <= j11) {
                i11 = i12 + 1;
            } else {
                length = i12 - 1;
            }
        }
        return i11;
    }

    private Object writeReplace() {
        return new SPX(this, 126);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.f fVar) {
        int iR = r(fVar.l(), this.f94784b);
        if (iR == 0) {
            return null;
        }
        return this.f94784b[iR - 1];
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        return this.f94785c;
    }

    @Override // net.time4j.tz.m
    public q c(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return m(aVar, gVar, null);
    }

    @Override // net.time4j.tz.m
    public p d() {
        return p.p(this.f94784b[0].f());
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return p(aVar, gVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.equals(this.f94784b, ((a) obj).f94784b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f94787e;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = Arrays.hashCode(this.f94784b);
        this.f94787e = iHashCode;
        return iHashCode;
    }

    boolean l(a aVar, int i11, int i12) {
        int iMin = Math.min(i11, this.f94784b.length);
        if (iMin != Math.min(i12, aVar.f94784b.length)) {
            return false;
        }
        for (int i13 = 0; i13 < iMin; i13++) {
            if (!this.f94784b[i13].equals(aVar.f94784b[i13])) {
                return false;
            }
        }
        return true;
    }

    q m(net.time4j.base.a aVar, net.time4j.base.g gVar, j jVar) {
        long j11 = l.j(aVar, gVar);
        int iS = s(j11, this.f94784b);
        q[] qVarArr = this.f94784b;
        if (iS == qVarArr.length) {
            if (jVar == null) {
                return null;
            }
            return jVar.k(aVar, j11);
        }
        q qVar = qVarArr[iS];
        if (!qVar.j() ? !(!qVar.k() || qVar.e() + ((long) qVar.i()) > j11) : qVar.e() + ((long) qVar.f()) <= j11) {
            return null;
        }
        return qVar;
    }

    q n() {
        q[] qVarArr = this.f94784b;
        return qVarArr[qVarArr.length - 1];
    }

    List<p> p(net.time4j.base.a aVar, net.time4j.base.g gVar, j jVar) {
        long j11 = l.j(aVar, gVar);
        int iS = s(j11, this.f94784b);
        q[] qVarArr = this.f94784b;
        if (iS == qVarArr.length) {
            return jVar == null ? l.h(qVarArr[qVarArr.length - 1].i()) : jVar.t(aVar, j11);
        }
        q qVar = qVarArr[iS];
        if (qVar.j()) {
            if (qVar.e() + ((long) qVar.f()) <= j11) {
                return Collections.EMPTY_LIST;
            }
        } else if (qVar.k() && qVar.e() + ((long) qVar.i()) <= j11) {
            return l.i(qVar.i(), qVar.f());
        }
        return l.h(qVar.f());
    }

    int q(int i11) {
        int iMin = Math.min(i11, this.f94784b.length);
        q[] qVarArr = new q[iMin];
        System.arraycopy(this.f94784b, 0, qVarArr, 0, iMin);
        return Arrays.hashCode(qVarArr);
    }

    void t(int i11, ObjectOutput objectOutput) throws IOException {
        SPX.z(this.f94784b, i11, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(a.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f94784b.length);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(']');
        return sb2.toString();
    }

    void u(ObjectOutput objectOutput) {
        t(this.f94784b.length, objectOutput);
    }
}
