package yu;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class p {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yu.c<?> f125863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<b> f125864b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<b> f125865c = new HashSet();

        b(yu.c<?> cVar) {
            this.f125863a = cVar;
        }

        void a(b bVar) {
            this.f125864b.add(bVar);
        }

        void b(b bVar) {
            this.f125865c.add(bVar);
        }

        yu.c<?> c() {
            return this.f125863a;
        }

        Set<b> d() {
            return this.f125864b;
        }

        boolean e() {
            return this.f125864b.isEmpty();
        }

        boolean f() {
            return this.f125865c.isEmpty();
        }

        void g(b bVar) {
            this.f125865c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0<?> f125866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f125867b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f125866a.equals(this.f125866a) && cVar.f125867b == this.f125867b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f125866a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f125867b).hashCode();
        }

        private c(a0<?> a0Var, boolean z11) {
            this.f125866a = a0Var;
            this.f125867b = z11;
        }
    }

    static void a(List<yu.c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i11 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i11++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i11 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<yu.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<yu.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            yu.c<?> next = it.next();
            b bVar3 = new b(next);
            for (a0<? super Object> a0Var : next.j()) {
                c cVar = new c(a0Var, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f125867b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", a0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
