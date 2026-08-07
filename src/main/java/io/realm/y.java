package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes9.dex */
abstract class y extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f79192c;

    y(Object obj, d0.a aVar) {
        super(aVar);
        this.f79192c = obj;
    }

    @Override // io.realm.f0
    <T> T e(Class<T> cls) {
        return cls.cast(this.f79192c);
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.f79192c;
        Object obj3 = ((y) obj).f79192c;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f79192c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.f79192c.toString();
    }

    y(Object obj, d0.a aVar, NativeRealmAny nativeRealmAny) {
        super(aVar, nativeRealmAny);
        this.f79192c = obj;
    }
}
