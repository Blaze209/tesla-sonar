package io.realm;

import io.realm.internal.core.NativeRealmAny;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
class o0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<? extends n0> f79150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0 f79151d;

    o0(n0 n0Var) {
        super(d0.a.OBJECT);
        this.f79151d = n0Var;
        this.f79150c = n0Var.getClass();
    }

    private static <T extends n0> T f(a aVar, Class<T> cls, NativeRealmAny nativeRealmAny) {
        return (T) aVar.B(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.EMPTY_LIST);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        if (this.f79151d instanceof io.realm.internal.o) {
            return new NativeRealmAny((io.realm.internal.o) e(io.realm.internal.o.class));
        }
        throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
    }

    @Override // io.realm.f0
    <T> T e(Class<T> cls) {
        return cls.cast(this.f79151d);
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        n0 n0Var = this.f79151d;
        n0 n0Var2 = ((o0) obj).f79151d;
        if (n0Var == null) {
            return n0Var2 == null;
        }
        return n0Var.equals(n0Var2);
    }

    public int hashCode() {
        return this.f79151d.hashCode();
    }

    public String toString() {
        return this.f79151d.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T extends n0> o0(a aVar, NativeRealmAny nativeRealmAny, Class<T> cls) {
        super(d0.a.OBJECT, nativeRealmAny);
        this.f79150c = cls;
        this.f79151d = f(aVar, cls, nativeRealmAny);
    }
}
