package net.time4j.tz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.engine.z;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l implements m, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f94810a = System.getProperty("line.separator");

    l() {
    }

    static long f(int i11) {
        return (System.currentTimeMillis() / 1000) + ((long) (((double) i11) * 3.1556952E7d));
    }

    static m g(p pVar, List<q> list, List<d> list2, boolean z11, boolean z12) {
        List<q> list3;
        List<d> list4;
        if (z11) {
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(list2);
            Collections.sort(arrayList);
            Collections.sort(arrayList2, k.INSTANCE);
            list4 = arrayList2;
            list3 = arrayList;
        } else {
            list3 = list;
            list4 = list2;
        }
        int size = list3.size();
        if (size == 0) {
            return list4.isEmpty() ? new e(pVar) : new j(pVar, list4, false);
        }
        p pVarP = p.p(list3.get(0).f());
        if (z12 && !pVar.equals(pVarP)) {
            throw new IllegalArgumentException("Initial offset " + pVar + " not equal to previous offset of first transition: " + pVarP);
        }
        if (list4.isEmpty()) {
            return new a(list3, false, z12);
        }
        q qVar = list3.get(size - 1);
        long jE = qVar.e() + 1;
        long jF = f(1);
        if (jE < jF) {
            List<d> list5 = list4;
            list4 = list5;
            list3.addAll(j.s(qVar, list5, jE, jF));
        }
        return new b(size, list3, list4, false, z12);
    }

    static List<p> h(int i11) {
        return Collections.singletonList(p.p(i11));
    }

    static List<p> i(int i11, int i12) {
        p pVarP = p.p(i11);
        p pVarP2 = p.p(i12);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(pVarP);
        arrayList.add(pVarP2);
        return Collections.unmodifiableList(arrayList);
    }

    static long j(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return net.time4j.base.c.i(z.UNIX.transform(net.time4j.base.b.j(aVar.b(), aVar.r(), aVar.f()), z.MODIFIED_JULIAN_DATE), 86400L) + ((long) (gVar.c() * 3600)) + ((long) (gVar.e() * 60)) + ((long) gVar.d());
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return false;
    }
}
