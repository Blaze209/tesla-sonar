package io.sentry.featureflags;

import io.sentry.h4;
import io.sentry.protocol.f;
import io.sentry.protocol.g;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile CopyOnWriteArrayList<C1699a> f80574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f80575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f80576c;

    /* JADX INFO: renamed from: io.sentry.featureflags.a$a, reason: collision with other inner class name */
    private static class C1699a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f80577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f80578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Long f80579c;

        public f c() {
            return new f(this.f80577a, this.f80578b);
        }
    }

    private a(int i11) {
        this.f80575b = new io.sentry.util.a();
        this.f80576c = i11;
        this.f80574a = new CopyOnWriteArrayList<>();
    }

    public static b a(q7 q7Var) {
        int maxFeatureFlags = q7Var.getMaxFeatureFlags();
        return maxFeatureFlags > 0 ? new a(maxFeatureFlags) : c.a();
    }

    private static b b(int i11, a aVar, a aVar2, a aVar3) {
        h4 h4Var;
        C1699a c1699a;
        CopyOnWriteArrayList<C1699a> copyOnWriteArrayList = aVar == null ? null : aVar.f80574a;
        CopyOnWriteArrayList<C1699a> copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.f80574a;
        CopyOnWriteArrayList<C1699a> copyOnWriteArrayList3 = aVar3 == null ? null : aVar3.f80574a;
        int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
        int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
        int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
        if (size == 0 && size2 == 0 && size3 == 0) {
            return c.a();
        }
        int i12 = size - 1;
        int i13 = size2 - 1;
        int i14 = size3 - 1;
        C1699a c1699a2 = (copyOnWriteArrayList == null || i12 < 0) ? null : copyOnWriteArrayList.get(i12);
        C1699a c1699a3 = (copyOnWriteArrayList2 == null || i13 < 0) ? null : copyOnWriteArrayList2.get(i13);
        C1699a c1699a4 = (copyOnWriteArrayList3 == null || i14 < 0) ? null : copyOnWriteArrayList3.get(i14);
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        while (linkedHashMap.size() < i11 && (c1699a2 != null || c1699a3 != null || c1699a4 != null)) {
            if (c1699a2 != null) {
                h4Var = h4.GLOBAL;
                c1699a = c1699a2;
            } else {
                h4Var = null;
                c1699a = null;
            }
            if (c1699a3 != null && (c1699a == null || c1699a3.f80579c.longValue() > c1699a.f80579c.longValue())) {
                h4Var = h4.ISOLATION;
                c1699a = c1699a3;
            }
            if (c1699a4 != null && (c1699a == null || c1699a4.f80579c.longValue() > c1699a.f80579c.longValue())) {
                h4Var = h4.CURRENT;
                c1699a = c1699a4;
            }
            if (c1699a == null) {
                break;
            }
            if (!linkedHashMap.containsKey(c1699a.f80577a)) {
                linkedHashMap.put(c1699a.f80577a, c1699a);
            }
            if (h4.CURRENT.equals(h4Var)) {
                i14--;
                c1699a4 = (copyOnWriteArrayList3 == null || i14 < 0) ? null : copyOnWriteArrayList3.get(i14);
            } else if (h4.ISOLATION.equals(h4Var)) {
                i13--;
                c1699a3 = (copyOnWriteArrayList2 == null || i13 < 0) ? null : copyOnWriteArrayList2.get(i13);
            } else if (h4.GLOBAL.equals(h4Var)) {
                i12--;
                c1699a2 = (copyOnWriteArrayList == null || i12 < 0) ? null : copyOnWriteArrayList.get(i12);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Collections.reverse(arrayList);
        return new a(i11, new CopyOnWriteArrayList(arrayList));
    }

    public static b c(q7 q7Var, b bVar, b bVar2, b bVar3) {
        int maxFeatureFlags = q7Var.getMaxFeatureFlags();
        if (maxFeatureFlags <= 0) {
            return c.a();
        }
        return b(maxFeatureFlags, bVar instanceof a ? (a) bVar : null, bVar2 instanceof a ? (a) bVar2 : null, bVar3 instanceof a ? (a) bVar3 : null);
    }

    @Override // io.sentry.featureflags.b
    public g g() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1699a> it = this.f80574a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return new g(arrayList);
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m476clone() {
        return new a(this);
    }

    private a(int i11, CopyOnWriteArrayList<C1699a> copyOnWriteArrayList) {
        this.f80575b = new io.sentry.util.a();
        this.f80576c = i11;
        this.f80574a = copyOnWriteArrayList;
    }

    private a(a aVar) {
        this.f80575b = new io.sentry.util.a();
        this.f80576c = aVar.f80576c;
        this.f80574a = new CopyOnWriteArrayList<>(aVar.f80574a);
    }
}
