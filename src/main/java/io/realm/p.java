package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes9.dex */
final class p extends y {
    p(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), d0.a.INTEGER, nativeRealmAny);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Number) super.e(Number.class));
    }

    @Override // io.realm.y
    public boolean equals(Object obj) {
        return obj != null && p.class.equals(obj.getClass()) && ((Number) e(Number.class)).longValue() == ((Number) ((f0) obj).e(Number.class)).longValue();
    }
}
