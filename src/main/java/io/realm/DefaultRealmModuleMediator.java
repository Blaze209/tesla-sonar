package io.realm;

import io.realm.annotations.RealmModule;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@RealmModule
class DefaultRealmModuleMediator extends io.realm.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Class<? extends n0>> f78882a;

    static {
        HashSet hashSet = new HashSet(2);
        hashSet.add(td0.q.class);
        hashSet.add(td0.o.class);
        f78882a = Collections.unmodifiableSet(hashSet);
    }

    DefaultRealmModuleMediator() {
    }

    @Override // io.realm.internal.p
    public <E extends n0> E c(c0 c0Var, E e11, boolean z11, Map<n0, io.realm.internal.o> map, Set<o> set) {
        Class<?> superclass = e11 instanceof io.realm.internal.o ? e11.getClass().getSuperclass() : e11.getClass();
        if (superclass.equals(td0.q.class)) {
            return (E) superclass.cast(z0.l(c0Var, (z0.a) c0Var.J().e(td0.q.class), (td0.q) e11, z11, map, set));
        }
        if (superclass.equals(td0.o.class)) {
            return (E) superclass.cast(x0.p(c0Var, (x0.a) c0Var.J().e(td0.o.class), (td0.o) e11, z11, map, set));
        }
        throw io.realm.internal.p.i(superclass);
    }

    @Override // io.realm.internal.p
    public io.realm.internal.c d(Class<? extends n0> cls, OsSchemaInfo osSchemaInfo) {
        io.realm.internal.p.a(cls);
        if (cls.equals(td0.q.class)) {
            return z0.m(osSchemaInfo);
        }
        if (cls.equals(td0.o.class)) {
            return x0.q(osSchemaInfo);
        }
        throw io.realm.internal.p.i(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.internal.p
    public <E extends n0> E e(E e11, int i11, Map<n0, io.realm.internal.o.a<n0>> map) {
        Class<? super Object> superclass = e11.getClass().getSuperclass();
        if (superclass.equals(td0.q.class)) {
            return (E) superclass.cast(z0.n((td0.q) e11, 0, i11, map));
        }
        if (superclass.equals(td0.o.class)) {
            return (E) superclass.cast(x0.r((td0.o) e11, 0, i11, map));
        }
        throw io.realm.internal.p.i(superclass);
    }

    @Override // io.realm.internal.p
    public Class<? extends n0> g(String str) {
        io.realm.internal.p.b(str);
        if (str.equals("RealmRawItem")) {
            return td0.q.class;
        }
        if (str.equals("RealmItem")) {
            return td0.o.class;
        }
        throw io.realm.internal.p.j(str);
    }

    @Override // io.realm.internal.p
    public Map<Class<? extends n0>, OsObjectSchemaInfo> h() {
        HashMap map = new HashMap(2);
        map.put(td0.q.class, z0.p());
        map.put(td0.o.class, x0.t());
        return map;
    }

    @Override // io.realm.internal.p
    public Set<Class<? extends n0>> k() {
        return f78882a;
    }

    @Override // io.realm.internal.p
    public String m(Class<? extends n0> cls) {
        io.realm.internal.p.a(cls);
        if (cls.equals(td0.q.class)) {
            return "RealmRawItem";
        }
        if (cls.equals(td0.o.class)) {
            return "RealmItem";
        }
        throw io.realm.internal.p.i(cls);
    }

    @Override // io.realm.internal.p
    public boolean o(Class<? extends n0> cls) {
        return td0.q.class.isAssignableFrom(cls) || td0.o.class.isAssignableFrom(cls);
    }

    @Override // io.realm.internal.p
    public <E extends n0> boolean p(Class<E> cls) {
        if (cls.equals(td0.q.class) || cls.equals(td0.o.class)) {
            return false;
        }
        throw io.realm.internal.p.i(cls);
    }

    @Override // io.realm.internal.p
    public <E extends n0> E q(Class<E> cls, Object obj, io.realm.internal.q qVar, io.realm.internal.c cVar, boolean z11, List<String> list) {
        a.c cVar2 = a.f78894k.get();
        try {
            cVar2.g((a) obj, qVar, cVar, z11, list);
            io.realm.internal.p.a(cls);
            if (cls.equals(td0.q.class)) {
                E eCast = cls.cast(new z0());
                cVar2.a();
                return eCast;
            }
            if (!cls.equals(td0.o.class)) {
                throw io.realm.internal.p.i(cls);
            }
            E eCast2 = cls.cast(new x0());
            cVar2.a();
            return eCast2;
        } catch (Throwable th2) {
            cVar2.a();
            throw th2;
        }
    }

    @Override // io.realm.internal.p
    public boolean r() {
        return true;
    }
}
