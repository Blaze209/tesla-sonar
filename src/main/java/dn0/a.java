package dn0;

import io.realm.c0;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.o;
import io.realm.internal.p;
import io.realm.internal.q;
import io.realm.n0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends n0>, p> f60791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Class<? extends n0>> f60792b = new HashMap();

    public a(p... pVarArr) {
        HashMap map = new HashMap();
        if (pVarArr != null) {
            for (p pVar : pVarArr) {
                for (Class<? extends n0> cls : pVar.k()) {
                    String strL = pVar.l(cls);
                    Class<? extends n0> cls2 = this.f60792b.get(strL);
                    if (cls2 != null && !cls2.equals(cls)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", cls2, cls, map.get(cls2), pVar, strL));
                    }
                    map.put(cls, pVar);
                    this.f60792b.put(strL, cls);
                }
            }
        }
        this.f60791a = Collections.unmodifiableMap(map);
    }

    private p s(Class<? extends n0> cls) {
        p pVar = this.f60791a.get(Util.c(cls));
        if (pVar != null) {
            return pVar;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    private p t(String str) {
        return s(this.f60792b.get(str));
    }

    @Override // io.realm.internal.p
    public <E extends n0> E c(c0 c0Var, E e11, boolean z11, Map<n0, o> map, Set<io.realm.o> set) {
        return (E) s(Util.c(e11.getClass())).c(c0Var, e11, z11, map, set);
    }

    @Override // io.realm.internal.p
    public c d(Class<? extends n0> cls, OsSchemaInfo osSchemaInfo) {
        return s(cls).d(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.p
    public <E extends n0> E e(E e11, int i11, Map<n0, o.a<n0>> map) {
        return (E) s(Util.c(e11.getClass())).e(e11, i11, map);
    }

    @Override // io.realm.internal.p
    protected <T extends n0> Class<T> g(String str) {
        return t(str).f(str);
    }

    @Override // io.realm.internal.p
    public Map<Class<? extends n0>, OsObjectSchemaInfo> h() {
        HashMap map = new HashMap();
        Iterator<p> it = this.f60791a.values().iterator();
        while (it.hasNext()) {
            map.putAll(it.next().h());
        }
        return map;
    }

    @Override // io.realm.internal.p
    public Set<Class<? extends n0>> k() {
        return this.f60791a.keySet();
    }

    @Override // io.realm.internal.p
    protected String m(Class<? extends n0> cls) {
        return s(cls).l(cls);
    }

    @Override // io.realm.internal.p
    protected boolean o(Class<? extends n0> cls) {
        return s(cls).n(cls);
    }

    @Override // io.realm.internal.p
    public <E extends n0> boolean p(Class<E> cls) {
        return s(Util.c(cls)).p(cls);
    }

    @Override // io.realm.internal.p
    public <E extends n0> E q(Class<E> cls, Object obj, q qVar, c cVar, boolean z11, List<String> list) {
        return (E) s(cls).q(cls, obj, qVar, cVar, z11, list);
    }

    @Override // io.realm.internal.p
    public boolean r() {
        Iterator<Map.Entry<Class<? extends n0>, p>> it = this.f60791a.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().r()) {
                return false;
            }
        }
        return true;
    }
}
