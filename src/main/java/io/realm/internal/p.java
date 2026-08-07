package io.realm.internal;

import io.realm.c0;
import io.realm.exceptions.RealmException;
import io.realm.n0;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p {
    protected static void a(Class<? extends n0> cls) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    protected static void b(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    protected static RealmException i(Class<? extends n0> cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", cls.toString()));
    }

    protected static RealmException j(String str) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", str));
    }

    public abstract <E extends n0> E c(c0 c0Var, E e11, boolean z11, Map<n0, o> map, Set<io.realm.o> set);

    public abstract c d(Class<? extends n0> cls, OsSchemaInfo osSchemaInfo);

    public abstract <E extends n0> E e(E e11, int i11, Map<n0, o.a<n0>> map);

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return k().equals(((p) obj).k());
        }
        return false;
    }

    public final <T extends n0> Class<T> f(String str) {
        return g(str);
    }

    protected abstract <T extends n0> Class<T> g(String str);

    public abstract Map<Class<? extends n0>, OsObjectSchemaInfo> h();

    public int hashCode() {
        return k().hashCode();
    }

    public abstract Set<Class<? extends n0>> k();

    public final String l(Class<? extends n0> cls) {
        return m(Util.c(cls));
    }

    protected abstract String m(Class<? extends n0> cls);

    public boolean n(Class<? extends n0> cls) {
        return o(cls);
    }

    protected abstract boolean o(Class<? extends n0> cls);

    public abstract <E extends n0> boolean p(Class<E> cls);

    public abstract <E extends n0> E q(Class<E> cls, Object obj, q qVar, c cVar, boolean z11, List<String> list);

    public boolean r() {
        return false;
    }
}
