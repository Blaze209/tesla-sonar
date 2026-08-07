package dn0;

import io.realm.c0;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.o;
import io.realm.internal.p;
import io.realm.internal.q;
import io.realm.n0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class b extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f60793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Class<? extends n0>> f60794b;

    public b(p pVar, Collection<Class<? extends n0>> collection, boolean z11) {
        this.f60793a = pVar;
        HashSet hashSet = new HashSet();
        if (pVar != null) {
            Set<Class<? extends n0>> setK = pVar.k();
            if (z11) {
                for (Class<? extends n0> cls : setK) {
                    if (!collection.contains(cls)) {
                        hashSet.add(cls);
                    }
                }
            } else {
                for (Class<? extends n0> cls2 : collection) {
                    if (setK.contains(cls2)) {
                        hashSet.add(cls2);
                    }
                }
            }
        }
        this.f60794b = Collections.unmodifiableSet(hashSet);
    }

    private void s(Class<? extends n0> cls) {
        if (this.f60794b.contains(cls)) {
            return;
        }
        throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    @Override // io.realm.internal.p
    public <E extends n0> E c(c0 c0Var, E e11, boolean z11, Map<n0, o> map, Set<io.realm.o> set) {
        s(Util.c(e11.getClass()));
        return (E) this.f60793a.c(c0Var, e11, z11, map, set);
    }

    @Override // io.realm.internal.p
    public c d(Class<? extends n0> cls, OsSchemaInfo osSchemaInfo) {
        s(cls);
        return this.f60793a.d(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.p
    public <E extends n0> E e(E e11, int i11, Map<n0, o.a<n0>> map) {
        s(Util.c(e11.getClass()));
        return (E) this.f60793a.e(e11, i11, map);
    }

    @Override // io.realm.internal.p
    protected <T extends n0> Class<T> g(String str) {
        return this.f60793a.f(str);
    }

    @Override // io.realm.internal.p
    public Map<Class<? extends n0>, OsObjectSchemaInfo> h() {
        HashMap map = new HashMap();
        for (Map.Entry<Class<? extends n0>, OsObjectSchemaInfo> entry : this.f60793a.h().entrySet()) {
            if (this.f60794b.contains(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    @Override // io.realm.internal.p
    public Set<Class<? extends n0>> k() {
        return this.f60794b;
    }

    @Override // io.realm.internal.p
    protected String m(Class<? extends n0> cls) {
        s(cls);
        return this.f60793a.l(cls);
    }

    @Override // io.realm.internal.p
    protected boolean o(Class<? extends n0> cls) {
        return this.f60793a.n(cls);
    }

    @Override // io.realm.internal.p
    public <E extends n0> boolean p(Class<E> cls) {
        s(Util.c(cls));
        return this.f60793a.p(cls);
    }

    @Override // io.realm.internal.p
    public <E extends n0> E q(Class<E> cls, Object obj, q qVar, c cVar, boolean z11, List<String> list) {
        s(cls);
        return (E) this.f60793a.q(cls, obj, qVar, cVar, z11, list);
    }

    @Override // io.realm.internal.p
    public boolean r() {
        p pVar = this.f60793a;
        if (pVar == null) {
            return true;
        }
        return pVar.r();
    }
}
